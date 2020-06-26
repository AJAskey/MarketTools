package net.ajaskey.common;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommonTests3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1501");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1502");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1503");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1504");
        net.ajaskey.common.Utils.NL = "\t     -1.00\t35\t35\r\n\t35                                                                                                  10\t35                                                                                                  10\t35";
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1505");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    100.00" + "'", str2, "    100.00");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1506");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     -1.00                                                0.00                                                0.00\r\n                                                0.00                                                                                                  10                                                0.00                                                                                                  10                                                0.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1507");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 100" + "'", str2, "                                                                                                 100");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1508");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1509");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1510");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1511");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                                                                               10.00                                               -1.00hi!                                               -1.00                                                                                                   1                                               -1.0035                                               -1.00                                                                                                   1                                               -1.00", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1512");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1513");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) ' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               32" + "'", str2, "                                                                                               32");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1514");
        net.ajaskey.common.TextUtils.printline("                                  0");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1515");
        net.ajaskey.common.Utils.NL = "                             100";
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1516");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1517");
        java.lang.String[] strArray6 = new java.lang.String[] { "10.00", "                              10.00", "\t" };
        java.util.List<java.io.File> fileList7 = net.ajaskey.common.Utils.getDir("\tInvalid fmt", strArray6);
        java.util.List<java.io.File> fileList8 = net.ajaskey.common.Utils.getDirTree("     -1.00100100\r\n100                                                                                                  10100                                                                                                  10100", strArray6);
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDirTree("\t                                                                                               10.00                            0.00hi!                            0.00                                                                                                   1                            0.0035                            0.00                                                                                                   1                            0.00", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(fileList7);
        org.junit.Assert.assertNull(fileList8);
        org.junit.Assert.assertNull(fileList9);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1518");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               -1.00" + "'", str2, "                                                                                               -1.00");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1519");
        net.ajaskey.common.Utils.NL = "                           32.00";
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1520");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(10L, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1521");
        java.lang.String[] strArray9 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDir("", strArray9);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", strArray9);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("\t35", strArray9);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDirTree("", strArray9);
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
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1522");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                               10", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                10 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1523");
        java.lang.String[] strArray14 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("", strArray14);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("\r\n", strArray14);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray14);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("", strArray14);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray14);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDir("\t0", strArray14);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDir("     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52", strArray14);
        java.util.List<java.io.File> fileList22 = net.ajaskey.common.Utils.getDirTree("     -1.00                                                0.00                                                0.00\r\n                                                0.00                                                                                                  10                                                0.00                                                                                                  10                                                0.00", strArray14);
        java.util.List<java.io.File> fileList23 = net.ajaskey.common.Utils.getDir("\t\t                          100.00", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
        org.junit.Assert.assertNull(fileList22);
        org.junit.Assert.assertNull(fileList23);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1524");
        java.lang.String[] strArray14 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("", strArray14);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("\r\n", strArray14);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray14);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("", strArray14);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray14);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDirTree("\t", strArray14);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDir("     -1.00         0         0\r\n         0                                                                                                  10         0                                                                                                  10         0", strArray14);
        java.util.List<java.io.File> fileList22 = net.ajaskey.common.Utils.getDirTree("\t                          100.00", strArray14);
        java.util.List<java.io.File> fileList23 = net.ajaskey.common.Utils.getDirTree("                                                                                               10.00                            0.00hi!                            0.00                                                                                                   1                            0.0035                            0.00                                                                                                   1                            0.00", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
        org.junit.Assert.assertNull(fileList22);
        org.junit.Assert.assertNull(fileList23);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1525");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1526");
        java.text.DecimalFormatSymbols decimalFormatSymbols0 = net.ajaskey.common.Utils.decimalFormatSymbols;
        net.ajaskey.common.Utils.decimalFormatSymbols = decimalFormatSymbols0;
        net.ajaskey.common.Utils.decimalFormatSymbols = decimalFormatSymbols0;
        net.ajaskey.common.Utils.decimalFormatSymbols = decimalFormatSymbols0;
        net.ajaskey.common.Utils.decimalFormatSymbols = decimalFormatSymbols0;
        net.ajaskey.common.Utils.decimalFormatSymbols = decimalFormatSymbols0;
        net.ajaskey.common.Utils.decimalFormatSymbols = decimalFormatSymbols0;
        net.ajaskey.common.Utils.decimalFormatSymbols = decimalFormatSymbols0;
        net.ajaskey.common.Utils.decimalFormatSymbols = decimalFormatSymbols0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = decimalFormatSymbols0.getClass();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNull(decimalFormatSymbols0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1527");
        java.lang.String[] strArray12 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("\r\n", strArray12);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray12);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray12);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDirTree("\t", strArray12);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("     -1.00         0         0\r\n         0                                                                                                  10         0                                                                                                  10         0", strArray12);
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
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1528");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1529");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("-1.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1530");
        net.ajaskey.common.Utils.TAB = "     32.00";
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1531");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 100, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.00" + "'", str2, "100.00");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1532");
        net.ajaskey.common.TextUtils.printline("        97");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1533");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                              -1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1534");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(100.0d, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100.00" + "'", str2, "                                                                                              100.00");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1535");
        java.lang.String[] strArray10 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("                                                                                               10.00                                                                                                   1hi!                                                                                                   1                                                                                                   1                                                                                                   135                                                                                                   1                                                                                                   1                                                                                                   1", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDirTree("     -1.00                               0                               0\r\n                               0                                                                                                  10                               0                                                                                                  10                               0", strArray10);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("\t        10", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1536");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) ' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  32" + "'", str2, "                                                                                                  32");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1537");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t100", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1538");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1539");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", false);
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1540");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1541");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("\t52", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ?52 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1542");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("        35", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1543");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("\t\t                            1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1544");
        java.lang.String[] strArray14 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("", strArray14);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("\r\n", strArray14);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray14);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("", strArray14);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray14);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDirTree("", strArray14);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDirTree("", strArray14);
        java.util.List<java.io.File> fileList22 = net.ajaskey.common.Utils.getDirTree("     -1.00                              52                              52\r\n                              52                                                                                                  10                              52                                                                                                  10                              52", strArray14);
        java.util.List<java.io.File> fileList23 = net.ajaskey.common.Utils.getDir("\t0", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
        org.junit.Assert.assertNull(fileList22);
        org.junit.Assert.assertNull(fileList23);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1545");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1546");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(0.0d, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      0.00" + "'", str2, "      0.00");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1547");
        java.lang.String[] strArray5 = new java.lang.String[] { "                                                                                               10.00", "hi!", "                                                                                                   1", "35", "                                                                                                   1" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList6);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList6);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                               10.00                           32.00hi!                           32.00                                                                                                   1                           32.0035                           32.00                                                                                                   1                           32.00" + "'", str8, "                                                                                               10.00                           32.00hi!                           32.00                                                                                                   1                           32.0035                           32.00                                                                                                   1                           32.00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                               10.00                           32.00hi!                           32.00                                                                                                   1                           32.0035                           32.00                                                                                                   1                           32.00" + "'", str9, "                                                                                               10.00                           32.00hi!                           32.00                                                                                                   1                           32.0035                           32.00                                                                                                   1                           32.00");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1548");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("35", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1549");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1550");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", true);
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
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1551");
        net.ajaskey.common.TextUtils.printline("                               1");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1552");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("10", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1553");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1554");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                              10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1555");
        java.lang.String[] strArray15 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("", strArray15);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("\r\n", strArray15);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray15);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("", strArray15);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray15);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDirTree("", strArray15);
        java.util.List<java.io.File> fileList22 = net.ajaskey.common.Utils.getDir("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", strArray15);
        java.util.List<java.io.File> fileList23 = net.ajaskey.common.Utils.getDirTree("", strArray15);
        java.util.List<java.io.File> fileList24 = net.ajaskey.common.Utils.getDir("     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52", strArray15);
        java.util.List<java.io.File> fileList25 = net.ajaskey.common.Utils.getDirTree("\t        10", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
        org.junit.Assert.assertNull(fileList22);
        org.junit.Assert.assertNull(fileList23);
        org.junit.Assert.assertNull(fileList24);
        org.junit.Assert.assertNull(fileList25);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1556");
        java.lang.String[] strArray1 = new java.lang.String[] { "\t" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.Class<?> wildcardClass8 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t                           32.00" + "'", str4, "\t                           32.00");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1557");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1L), 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               -1.00" + "'", str2, "                                                                                               -1.00");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1558");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1559");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) -1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1560");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1561");
        net.ajaskey.common.Utils.TAB = "                                               10.00";
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1562");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '4', (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               52" + "'", str2, "                                                                                               52");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1563");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("                               1", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1564");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("\t                              10", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ?                              10 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1565");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                              10", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1566");
        java.lang.String[] strArray10 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("\r\n", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDirTree("", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDirTree("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", strArray10);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("                                                                                               10.00                                               -1.00hi!                                               -1.00                                                                                                   1                                               -1.0035                                               -1.00                                                                                                   1                                               -1.00", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1567");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  10" + "'", str2, "                                                  10");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1568");
        net.ajaskey.common.TextUtils.printline("     -1.0097.0097.00\r\n97.00                                                                                                  1097.00                                                                                                  1097.00");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1569");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              100.00" + "'", str2, "                                              100.00");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1570");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t35", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1571");
        java.lang.String[] strArray14 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("", strArray14);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("\r\n", strArray14);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray14);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("", strArray14);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("\t        10", strArray14);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDirTree("\tInvalid fmt", strArray14);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDirTree("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", strArray14);
        java.util.List<java.io.File> fileList22 = net.ajaskey.common.Utils.getDir("     -1.00                                  0                                  0\r\n                                  0                                                                                                  10                                  0                                                                                                  10                                  0", strArray14);
        java.util.List<java.io.File> fileList23 = net.ajaskey.common.Utils.getDirTree("                           32.00", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
        org.junit.Assert.assertNull(fileList22);
        org.junit.Assert.assertNull(fileList23);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1572");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                 32");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1573");
        net.ajaskey.common.Utils.TAB = "                                                                                               -1.00";
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1574");
        net.ajaskey.common.TextUtils.printline("     -1.00                               0                               0\r\n                               0                                                                                                  10                               0                                                                                                  10                               0");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1575");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00                               0                               0\r\n                               0                                                                                                  10                               0                                                                                                  10                               0", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1576");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1577");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t                                                                                               10.00                            0.00hi!                            0.00                                                                                                   1                            0.0035                            0.00                                                                                                   1                            0.00", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1578");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0.0f, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                0.00" + "'", str2, "                                                                                                0.00");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1579");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("\t\t     -1.00                                               -1.00                                               -1.00\r\n                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1580");
        java.lang.String[] strArray12 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDirTree("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", strArray12);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("\t35", strArray12);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDirTree("", strArray12);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("\t100", strArray12);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("     -1.00\t\t                          100.00\t\t                          100.00\r\n\t\t                          100.00                                                                                                  10\t\t                          100.00                                                                                                  10\t\t                          100.00", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1581");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              10.00" + "'", str2, "                              10.00");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1582");
        net.ajaskey.common.Utils.NL = "\r\n";
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1583");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) ' ', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32.00" + "'", str2, "32.00");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1584");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\r\n" + "'", str5, "\r\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\n" + "'", str9, "\r\n");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1585");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (-1), (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               -1" + "'", str2, "                                                                                               -1");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1586");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1587");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass10 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1588");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass8 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1589");
        java.lang.String[] strArray10 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("\r\n", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDirTree("\tInvalid fmt", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("                                                                                               10.0052.00hi!52.00                                                                                                   152.003552.00                                                                                                   152.00", strArray10);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("     -1.00         0         0\r\n         0                                                                                                  10         0                                                                                                  10         0", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1590");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("32", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1591");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t35", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass7 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1592");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1593");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\r\n" + "'", str5, "\r\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1594");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                               10.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1595");
        net.ajaskey.common.Utils.NL = "     32.00";
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1596");
        net.ajaskey.common.Utils.makeDir("                                                                                              100.00");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1597");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1598");
        java.lang.String[] strArray1 = new java.lang.String[] { "\t" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t     32.00" + "'", str4, "\t     32.00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t     32.00" + "'", str6, "\t     32.00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t     32.00" + "'", str7, "\t     32.00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t     32.00" + "'", str9, "\t     32.00");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1599");
        net.ajaskey.common.Utils.makeDir("                                                  10");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1600");
        net.ajaskey.common.TextUtils.printline("     -1.00                              52                              52\r\n                              52                                                                                                  10                              52                                                                                                  10                              52");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1601");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                               32");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1602");
        net.ajaskey.common.TextUtils.printline("     -1.00                                  0                                  0\r\n                                  0                                                                                                  10                                  0                                                                                                  10                                  0");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1603");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00" + "'", str2, "1.00");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1604");
        net.ajaskey.common.Utils.NL = "                              -1";
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1605");
        net.ajaskey.common.Utils.makeDir("\t     32.00");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1606");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1607");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1608");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) 'a', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              97" + "'", str2, "                              97");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1609");
        net.ajaskey.common.TextUtils.printline("                                                                                             0.00");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1610");
        net.ajaskey.common.Utils.TAB = "                                               97.00";
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1611");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                           32.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                            32.00 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1612");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("Invalid fmt", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Invalid fmt (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1613");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                             100", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1614");
        net.ajaskey.common.Utils.TAB = "                                                 100";
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1615");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("     -1.00                               0                               0\r\n                               0                                                                                                  10                               0                                                                                                  10                               0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1616");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                            10.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1617");
        net.ajaskey.common.Utils.NL = "                              -1.00";
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1618");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass4 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1619");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t                             100.00", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1620");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\tInvalid fmt", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1621");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", true);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1622");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     -1.00\t35\t35\r\n\t35                                                                                                  10\t35                                                                                                  10\t35", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1623");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     -1.00                                                0.00                                                0.00\r\n                                                0.00                                                                                                  10                                                0.00                                                                                                  10                                                0.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1624");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("\t\t                          100.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1625");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1626");
        java.lang.String[] strArray11 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("", strArray11);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("\r\n", strArray11);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDirTree("", strArray11);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("\t35", strArray11);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("", strArray11);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", strArray11);
        java.lang.Class<?> wildcardClass18 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1627");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1628");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
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
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1629");
        net.ajaskey.common.TextUtils.printline("\t                                                                                               10.00");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1630");
        net.ajaskey.common.Utils.TAB = "                                                                                               52";
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1631");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100.0f, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          100.00" + "'", str2, "                          100.00");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1632");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                0", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1633");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDirTree("\t                                                                                                   0", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1634");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) ' ', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     32.00" + "'", str2, "     32.00");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1635");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '4', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  52" + "'", str2, "                                                  52");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1636");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                                                                               10.00                           32.00hi!                           32.00                                                                                                   1                           32.0035                           32.00                                                                                                   1                           32.00", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1637");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("\t\t                            1.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1638");
        net.ajaskey.common.TextUtils.printline("                             100.00");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1639");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("                               1.00", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1640");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                               97.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1641");
        java.lang.String[] strArray11 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("", strArray11);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDirTree("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", strArray11);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("\t35", strArray11);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("", strArray11);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("\t100", strArray11);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("", strArray11);
        java.lang.Class<?> wildcardClass18 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1642");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            10.00" + "'", str2, "                                                                                            10.00");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1643");
        net.ajaskey.common.Utils.makeDir("                                 -1");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1644");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                  52");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1645");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t35", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass6 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1646");
        net.ajaskey.common.Utils.TAB = "                            1.00";
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1647");
        net.ajaskey.common.Utils.makeDir("52");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1648");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '#', 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35" + "'", str2, "35");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1649");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                                                                               10.00                                                                                                   1hi!                                                                                                   1                                                                                                   1                                                                                                   135                                                                                                   1                                                                                                   1                                                                                                   1", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1650");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str13 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1651");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1652");
        net.ajaskey.common.Utils.NL = "\t\t                            1.00";
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1653");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               35.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1654");
        java.lang.String[] strArray17 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("", strArray17);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("\r\n", strArray17);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray17);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDir("", strArray17);
        java.util.List<java.io.File> fileList22 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray17);
        java.util.List<java.io.File> fileList23 = net.ajaskey.common.Utils.getDirTree("", strArray17);
        java.util.List<java.io.File> fileList24 = net.ajaskey.common.Utils.getDir("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", strArray17);
        java.util.List<java.io.File> fileList25 = net.ajaskey.common.Utils.getDirTree("", strArray17);
        java.util.List<java.io.File> fileList26 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                               10.00                                                                                               10.00\r\n                                                                                               10.00                                                                                                  10                                                                                               10.00                                                                                                  10                                                                                               10.00", strArray17);
        java.util.List<java.io.File> fileList27 = net.ajaskey.common.Utils.getDir("\t                                                                                               97.00", strArray17);
        java.util.List<java.io.File> fileList28 = net.ajaskey.common.Utils.getDirTree("\tInvalid fmt", strArray17);
        java.util.List<java.io.File> fileList29 = net.ajaskey.common.Utils.getDirTree("\t     52.00", strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
        org.junit.Assert.assertNull(fileList22);
        org.junit.Assert.assertNull(fileList23);
        org.junit.Assert.assertNull(fileList24);
        org.junit.Assert.assertNull(fileList25);
        org.junit.Assert.assertNull(fileList26);
        org.junit.Assert.assertNull(fileList27);
        org.junit.Assert.assertNull(fileList28);
        org.junit.Assert.assertNull(fileList29);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1655");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           -1.00" + "'", str2, "                           -1.00");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1656");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '#', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35.00" + "'", str2, "35.00");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1657");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1658");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00                            0.00                            0.00\r\n                            0.00                                                                                                  10                            0.00                                                                                                  10                            0.00", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1659");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1660");
        java.lang.String[] strArray8 = new java.lang.String[] { "10.00", "                              10.00", "\t" };
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDir("\tInvalid fmt", strArray8);
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDirTree("     -1.00100100\r\n100                                                                                                  10100                                                                                                  10100", strArray8);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("\t                                                                                               10.00", strArray8);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", strArray8);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDirTree("\t\t                          100.00", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(fileList9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1661");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(10L, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1662");
        java.lang.String[] strArray5 = new java.lang.String[] { "     -1.00", "", "\r\n", "                                                                                                  10", "                                                                                                  10" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList6);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList6);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList6);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList6);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList6);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass14 = strList6.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "     -1.00\t\t                            1.00\t\t                            1.00\r\n\t\t                            1.00                                                                                                  10\t\t                            1.00                                                                                                  10\t\t                            1.00" + "'", str8, "     -1.00\t\t                            1.00\t\t                            1.00\r\n\t\t                            1.00                                                                                                  10\t\t                            1.00                                                                                                  10\t\t                            1.00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "     -1.00\t\t                            1.00\t\t                            1.00\r\n\t\t                            1.00                                                                                                  10\t\t                            1.00                                                                                                  10\t\t                            1.00" + "'", str9, "     -1.00\t\t                            1.00\t\t                            1.00\r\n\t\t                            1.00                                                                                                  10\t\t                            1.00                                                                                                  10\t\t                            1.00");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1663");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               0" + "'", str2, "                               0");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1664");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1665");
        java.lang.String[] strArray11 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("", strArray11);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("\r\n", strArray11);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDirTree("", strArray11);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("\t35", strArray11);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("", strArray11);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("\t0", strArray11);
        java.lang.Class<?> wildcardClass18 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1666");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(1.0d, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                1.00" + "'", str2, "                                                                                                1.00");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1667");
        net.ajaskey.common.Utils.TAB = "-1";
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1668");
        java.lang.String[] strArray8 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDir("", strArray8);
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDir("\r\n", strArray8);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray8);
        java.lang.Class<?> wildcardClass12 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(fileList9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1669");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 -1" + "'", str2, "                                 -1");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1670");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1671");
        net.ajaskey.common.Utils.makeDir("     -1.00\t                            1.00\t                            1.00\r\n\t                            1.00                                                                                                  10\t                            1.00                                                                                                  10\t                            1.00");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1672");
        net.ajaskey.common.Utils.NL = "     -1.00                             100.00                             100.00\r\n                             100.00                                                                                                  10                             100.00                                                                                                  10                             100.00";
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1673");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("     -1.00                                               -1.00                                               -1.00\r\n                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:      -1.00                                               -1.00                                               -1.00??                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1674");
        java.lang.String[] strArray12 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("\r\n", strArray12);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("", strArray12);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("\t35", strArray12);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("     -1.00                                               -1.00                                               -1.00\r\n                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00", strArray12);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("\t                                                                                              100", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1675");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("                                                                                               10.00                           32.00hi!                           32.00                                                                                                   1                           32.0035                           32.00                                                                                                   1                           32.00", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1676");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("\t     32.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1677");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                               52");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1678");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1679");
        java.lang.String[] strArray13 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("\r\n", strArray13);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray13);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("\t        10", strArray13);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDirTree("\tInvalid fmt", strArray13);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDirTree("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", strArray13);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDir("                                                                                               10.00                                                                                                   1hi!                                                                                                   1                                                                                                   1                                                                                                   135                                                                                                   1                                                                                                   1                                                                                                   1", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1680");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t0", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1681");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100L, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1682");
        net.ajaskey.common.Utils.TAB = "                             100";
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1683");
        net.ajaskey.common.Utils.NL = "     -1.00                                  0                                  0\r\n                                  0                                                                                                  10                                  0                                                                                                  10                                  0";
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1684");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        -1" + "'", str2, "        -1");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1685");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDirTree("\t", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1686");
        net.ajaskey.common.TextUtils.printline("                                 97");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1687");
        net.ajaskey.common.TextUtils.printline("32.00");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1688");
        net.ajaskey.common.Utils.makeDir("                              97");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1689");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1690");
        java.lang.String[] strArray12 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("\r\n", strArray12);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray12);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray12);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDirTree("     -1.00                                  0                                  0\r\n                                  0                                                                                                  10                                  0                                                                                                  10                                  0", strArray12);
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
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1691");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1L), 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     -1.00" + "'", str2, "     -1.00");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1692");
        java.lang.String[] strArray8 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDir("", strArray8);
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDir("     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52", strArray8);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("     -1.00                               0                               0\r\n                               0                                                                                                  10                               0                                                                                                  10                               0", strArray8);
        java.lang.Class<?> wildcardClass12 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(fileList9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1693");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("0", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1694");
        net.ajaskey.common.Utils.NL = "                                                                                               10";
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1695");
        java.lang.String[] strArray5 = new java.lang.String[] { "Invalid fmt", "     -1.00                            0.00                            0.00\r\n                            0.00                                                                                                  10                            0.00                                                                                                  10                            0.00", "                                                  10", "                             100" };
        java.util.List<java.io.File> fileList6 = net.ajaskey.common.Utils.getDir("", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = fileList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(fileList6);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1696");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1), 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     -1.00" + "'", str2, "     -1.00");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1697");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("35.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 35.00 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1698");
        net.ajaskey.common.Utils.makeDir("                                               10.00");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1699");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                               0.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1700");
        net.ajaskey.common.Utils.NL = "                               1.00";
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1701");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                               10.00                            0.00hi!                            0.00                                                                                                   1                            0.0035                            0.00                                                                                                   1                            0.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1702");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t     -1.00\t35\t35\r\n\t35                                                                                                  10\t35                                                                                                  10\t35", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1703");
        net.ajaskey.common.Utils.NL = "\t                             100.00";
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1704");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("\t100", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1705");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("0.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 0.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1706");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1707");
        net.ajaskey.common.Utils.makeDir("        32");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1708");
        net.ajaskey.common.TextUtils.printline("                                               97.00");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1709");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t                                                                                                   0", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1710");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1711");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t                           32.00", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1712");
        java.lang.String[] strArray13 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("\r\n", strArray13);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray13);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray13);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDirTree("", strArray13);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDir("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", strArray13);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDir("\t                           32.00", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1713");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1.0f), (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               -1.00" + "'", str2, "                                               -1.00");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1714");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100L, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.00" + "'", str2, "100.00");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1715");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '#', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35.00" + "'", str2, "35.00");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1716");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1717");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1718");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '4', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               52.00" + "'", str2, "                                                                                               52.00");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1719");
        net.ajaskey.common.Utils.NL = "                                                                                               52";
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1720");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        35" + "'", str2, "        35");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1721");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("\t     -1.00\t35\t35\r\n\t35                                                                                                  10\t35                                                                                                  10\t35", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ?     -1.00?35?35???35                                                                                                  10?35                                                                                                  10?35 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1722");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0L, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                0.00" + "'", str2, "                                                                                                0.00");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1723");
        java.lang.String[] strArray1 = new java.lang.String[] { "\t" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t                                                                                               52" + "'", str4, "\t                                                                                               52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t                                                                                               52" + "'", str6, "\t                                                                                               52");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t                                                                                               52" + "'", str7, "\t                                                                                               52");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t                                                                                               52" + "'", str8, "\t                                                                                               52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                                                                                               52" + "'", str9, "\t                                                                                               52");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1724");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 10" + "'", str2, "                                 10");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1725");
        net.ajaskey.common.Utils.makeDir("                                                                                               52");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1726");
        net.ajaskey.common.TextUtils.printline("                                                                                               32");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1727");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\tInvalid fmt", true);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1728");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.0097.0097.00\r\n97.00                                                                                                  1097.00                                                                                                  1097.00", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1729");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-1L), (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              -1" + "'", str2, "                              -1");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1730");
        java.lang.String[] strArray9 = new java.lang.String[] { "10.00", "                              10.00", "\t" };
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDir("\tInvalid fmt", strArray9);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("     -1.00100100\r\n100                                                                                                  10100                                                                                                  10100", strArray9);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDirTree("\t                                                                                               10.00", strArray9);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", strArray9);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDirTree("     -1.00                                                                                               10.00                                                                                               10.00\r\n                                                                                               10.00                                                                                                  10                                                                                               10.00                                                                                                  10                                                                                               10.00", strArray9);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("\t", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1731");
        net.ajaskey.common.TextUtils.printline("\t                                                                                                   0");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1732");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1733");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1734");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                               97.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1735");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1.0f), (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               -1.00" + "'", str2, "                                                                                               -1.00");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1736");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass10 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1737");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1738");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  32" + "'", str2, "                                                                                                  32");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1739");
        java.lang.String[] strArray11 = new java.lang.String[] { "                                                                                                  10", "hi!", "\t                                                                                               10.00", "                                                                                               10.00", "0.00", "0.00", "10.00", "                                                                                                  -1", "\t35", "32", "     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList12);
        java.lang.Class<?> wildcardClass15 = strList12.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1740");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(1L, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1741");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t0", false);
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
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1742");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00                                               -1.00                                               -1.00\r\n                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1743");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(10.0d, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     10.00" + "'", str2, "     10.00");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1744");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("\t                                                                                              100", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ?                                                                                              100 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1745");
        java.lang.String[] strArray16 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("", strArray16);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("\r\n", strArray16);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray16);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDir("", strArray16);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray16);
        java.util.List<java.io.File> fileList22 = net.ajaskey.common.Utils.getDirTree("", strArray16);
        java.util.List<java.io.File> fileList23 = net.ajaskey.common.Utils.getDir("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", strArray16);
        java.util.List<java.io.File> fileList24 = net.ajaskey.common.Utils.getDirTree("", strArray16);
        java.util.List<java.io.File> fileList25 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                               10.00                                                                                               10.00\r\n                                                                                               10.00                                                                                                  10                                                                                               10.00                                                                                                  10                                                                                               10.00", strArray16);
        java.util.List<java.io.File> fileList26 = net.ajaskey.common.Utils.getDir("\t                                                                                               97.00", strArray16);
        java.util.List<java.io.File> fileList27 = net.ajaskey.common.Utils.getDirTree("\t                                                                                              100", strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
        org.junit.Assert.assertNull(fileList22);
        org.junit.Assert.assertNull(fileList23);
        org.junit.Assert.assertNull(fileList24);
        org.junit.Assert.assertNull(fileList25);
        org.junit.Assert.assertNull(fileList26);
        org.junit.Assert.assertNull(fileList27);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1746");
        java.lang.String[] strArray10 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDirTree("\t", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDirTree("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("     -1.00                               0                               0\r\n                               0                                                                                                  10                               0                                                                                                  10                               0", strArray10);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1747");
        java.lang.String[] strArray1 = new java.lang.String[] { "\t" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t                                                                                               52" + "'", str4, "\t                                                                                               52");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t                                                                                               52" + "'", str5, "\t                                                                                               52");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t                                                                                               52" + "'", str7, "\t                                                                                               52");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1748");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                                                                               10.00                            0.00hi!                            0.00                                                                                                   1                            0.0035                            0.00                                                                                                   1                            0.00", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1749");
        net.ajaskey.common.Utils.TAB = "                           32.00";
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1750");
        java.lang.String[] strArray13 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("\r\n", strArray13);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray13);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray13);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("     -1.00100100\r\n100                                                                                                  10100                                                                                                  10100", strArray13);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDirTree("                                                                                               10.00                                                                                                   1hi!                                                                                                   1                                                                                                   1                                                                                                   135                                                                                                   1                                                                                                   1                                                                                                   1", strArray13);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDir("\t        10", strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = fileList21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1751");
        java.lang.String[] strArray12 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("\r\n", strArray12);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray12);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("\t        10", strArray12);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("\t                                                                                               97.00", strArray12);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDirTree("\t100", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1752");
        java.lang.String[] strArray10 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDirTree("\t", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDirTree("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("     -1.00                               0                               0\r\n                               0                                                                                                  10                               0                                                                                                  10                               0", strArray10);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("\t\t     -1.00                                               -1.00                                               -1.00\r\n                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1753");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:      -1.00        52        52??        52                                                                                                  10        52                                                                                                  10        52 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1754");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("\t\t     -1.00                                               -1.00                                               -1.00\r\n                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ??     -1.00                                               -1.00                                               -1.00??                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1755");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100" + "'", str2, "                                                                                              100");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1756");
        java.lang.String[] strArray7 = new java.lang.String[] { "10.00", "                              10.00", "\t" };
        java.util.List<java.io.File> fileList8 = net.ajaskey.common.Utils.getDir("\tInvalid fmt", strArray7);
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDirTree("     -1.00100100\r\n100                                                                                                  10100                                                                                                  10100", strArray7);
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDirTree("     -1.00                            0.00                            0.00\r\n                            0.00                                                                                                  10                            0.00                                                                                                  10                            0.00", strArray7);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("                                                                                               10.00                                               -1.00hi!                                               -1.00                                                                                                   1                                               -1.0035                                               -1.00                                                                                                   1                                               -1.00", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(fileList8);
        org.junit.Assert.assertNull(fileList9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1757");
        java.lang.String[] strArray1 = new java.lang.String[] { "\t" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t                                                                                               52" + "'", str4, "\t                                                                                               52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t                                                                                               52" + "'", str6, "\t                                                                                               52");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t                                                                                               52" + "'", str7, "\t                                                                                               52");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1758");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                1.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1759");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                                                                               10.0052.00hi!52.00                                                                                                   152.003552.00                                                                                                   152.00", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1760");
        net.ajaskey.common.Utils.TAB = "     -1.00                              52                              52\r\n                              52                                                                                                  10                              52                                                                                                  10                              52";
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1761");
        java.lang.String[] strArray13 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("\r\n", strArray13);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray13);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("                                                                                               10.00                                                                                                   1hi!                                                                                                   1                                                                                                   1                                                                                                   135                                                                                                   1                                                                                                   1                                                                                                   1", strArray13);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDir("\t", strArray13);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDirTree("                           32.00", strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = fileList21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1762");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1763");
        net.ajaskey.common.Utils.NL = "      1.00";
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1764");
        java.lang.String[] strArray10 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("\r\n", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("", strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = fileList15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1765");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00                                               -1.00                                               -1.00\r\n                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00", false);
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1766");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00100100\r\n100                                                                                                  10100                                                                                                  10100", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1767");
        net.ajaskey.common.Utils.TAB = "\t                                                                                           100.00";
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1768");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) 'a', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  97" + "'", str2, "                                                  97");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1769");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1770");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10L, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1771");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDirTree("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1772");
        net.ajaskey.common.Utils.makeDir("                                                                                               10.00                           32.00hi!                           32.00                                                                                                   1                           32.0035                           32.00                                                                                                   1                           32.00");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1773");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     -1.00" + "'", str2, "     -1.00");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1774");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass9 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1775");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDirTree("                                                                                               10.00                                               -1.00hi!                                               -1.00                                                                                                   1                                               -1.0035                                               -1.00                                                                                                   1                                               -1.00", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1776");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1777");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1778");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                  10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1779");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1780");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1781");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 100, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1782");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) ' ', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  32" + "'", str2, "                                                                                                  32");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1783");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                 -1", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                  -1 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1784");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1785");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 10, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1786");
        net.ajaskey.common.Utils.NL = "                                                                                               10.00                           32.00hi!                           32.00                                                                                                   1                           32.0035                           32.00                                                                                                   1                           32.00";
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1787");
        java.lang.String[] strArray9 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDir("", strArray9);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("\r\n", strArray9);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("", strArray9);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDirTree("\t                                                                                              100", strArray9);
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
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1788");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1789");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1790");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("        10", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1791");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                               -1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1792");
        java.lang.String[] strArray9 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDir("", strArray9);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("\r\n", strArray9);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray9);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("\t                             100.00", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1793");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     -1.00                              52                              52\r\n                              52                                                                                                  10                              52                                                                                                  10                              52", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1794");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t\t     -1.00                                               -1.00                                               -1.00\r\n                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1795");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '4', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52" + "'", str2, "52");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1796");
        net.ajaskey.common.TextUtils.printline("                                              100.00");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1797");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("97.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1798");
        java.lang.String[] strArray10 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("\r\n", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52", strArray10);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("\t\t                            1.00", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1799");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100.00" + "'", str2, "                                                                                              100.00");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1800");
        java.lang.String[] strArray8 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDir("", strArray8);
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDir("     -1.00         0         0\r\n         0                                                                                                  10         0                                                                                                  10         0", strArray8);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("     -1.0097.0097.00\r\n97.00                                                                                                  1097.00                                                                                                  1097.00", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(fileList9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1801");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1802");
        net.ajaskey.common.TextUtils.printline("                           32.00");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1803");
        java.lang.String[] strArray15 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("", strArray15);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("\r\n", strArray15);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray15);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("", strArray15);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray15);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDirTree("", strArray15);
        java.util.List<java.io.File> fileList22 = net.ajaskey.common.Utils.getDir("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", strArray15);
        java.util.List<java.io.File> fileList23 = net.ajaskey.common.Utils.getDirTree("", strArray15);
        java.util.List<java.io.File> fileList24 = net.ajaskey.common.Utils.getDirTree("\t\t                          100.00", strArray15);
        java.util.List<java.io.File> fileList25 = net.ajaskey.common.Utils.getDirTree("\t     52.00", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
        org.junit.Assert.assertNull(fileList22);
        org.junit.Assert.assertNull(fileList23);
        org.junit.Assert.assertNull(fileList24);
        org.junit.Assert.assertNull(fileList25);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1804");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1805");
        net.ajaskey.common.Utils.NL = "\t\t     -1.00                                               -1.00                                               -1.00\r\n                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00";
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1806");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass9 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1807");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                               0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1808");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                0.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1809");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("\t\t     -1.00                                               -1.00                                               -1.00\r\n                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1810");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1811");
        net.ajaskey.common.TextUtils.printline("         1");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1812");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        52" + "'", str2, "        52");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1813");
        net.ajaskey.common.Utils.TAB = "                                                                                               10.00                            0.00hi!                            0.00                                                                                                   1                            0.0035                            0.00                                                                                                   1                            0.00";
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1814");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1815");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1816");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t0", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1817");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("     -1.00                             100.00                             100.00\r\n                             100.00                                                                                                  10                             100.00                                                                                                  10                             100.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1818");
        java.lang.String[] strArray5 = new java.lang.String[] { "                                                   0", "                                                                                                  52" };
        java.util.List<java.io.File> fileList6 = net.ajaskey.common.Utils.getDirTree("", strArray5);
        java.util.List<java.io.File> fileList7 = net.ajaskey.common.Utils.getDir("                                                                                               10.00                            0.00hi!                            0.00                                                                                                   1                            0.0035                            0.00                                                                                                   1                            0.00", strArray5);
        java.util.List<java.io.File> fileList8 = net.ajaskey.common.Utils.getDir("\t     -1.00\t35\t35\r\n\t35                                                                                                  10\t35                                                                                                  10\t35", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(fileList6);
        org.junit.Assert.assertNull(fileList7);
        org.junit.Assert.assertNull(fileList8);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1819");
        java.lang.String[] strArray10 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDirTree("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("\t35", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("     -1.00\t\t                            1.00\t\t                            1.00\r\n\t\t                            1.00                                                                                                  10\t\t                            1.00                                                                                                  10\t\t                            1.00", strArray10);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("\t35", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1820");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00                                  0                                  0\r\n                                  0                                                                                                  10                                  0                                                                                                  10                                  0", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1821");
        java.lang.String[] strArray13 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("\r\n", strArray13);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray13);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray13);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDirTree("", strArray13);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDirTree("     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52", strArray13);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDirTree("\t        10", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1822");
        net.ajaskey.common.Utils.makeDir("                                                                                               32");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1823");
        net.ajaskey.common.Utils.makeDir("                               1");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1824");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 'a', (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              97.00" + "'", str2, "                              97.00");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1825");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  35" + "'", str2, "                                                                                                  35");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1826");
        java.lang.String[] strArray13 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("\r\n", strArray13);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray13);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray13);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("     -1.00100100\r\n100                                                                                                  10100                                                                                                  10100", strArray13);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDirTree("\t                          100.00", strArray13);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDir("\tInvalid fmt", strArray13);
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
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1827");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1828");
        java.lang.String[] strArray13 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("\r\n", strArray13);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray13);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray13);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDirTree("", strArray13);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDir("\t52", strArray13);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDir("\r\n", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1829");
        java.lang.String[] strArray5 = new java.lang.String[] { "     -1.00", "", "\r\n", "                                                                                                  10", "                                                                                                  10" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList6);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList6);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList6);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList6);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList6);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1830");
        java.lang.String[] strArray11 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("", strArray11);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52", strArray11);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("                                                                                               10.00                                                                                                   1hi!                                                                                                   1                                                                                                   1                                                                                                   135                                                                                                   1                                                                                                   1                                                                                                   1", strArray11);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("", strArray11);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("     -1.00                                                0.00                                                0.00\r\n                                                0.00                                                                                                  10                                                0.00                                                                                                  10                                                0.00", strArray11);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDirTree("\tInvalid fmt", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1831");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(1L, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1832");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1833");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1834");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t                             100.00", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass4 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1835");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00                             100.00                             100.00\r\n                             100.00                                                                                                  10                             100.00                                                                                                  10                             100.00", true);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1836");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1837");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                               32", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                32 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1838");
        net.ajaskey.common.TextUtils.printline("     -1.00\t35\t35\r\n\t35                                                                                                  10\t35                                                                                                  10\t35");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1839");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t0", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1840");
        java.lang.String[] strArray11 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("", strArray11);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("\r\n", strArray11);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDirTree("", strArray11);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", strArray11);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDirTree("                                                                                               10.0052.00hi!52.00                                                                                                   152.003552.00                                                                                                   152.00", strArray11);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("     -1.0097.0097.00\r\n97.00                                                                                                  1097.00                                                                                                  1097.00", strArray11);
        java.lang.Class<?> wildcardClass18 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1841");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\t                            1.00", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1842");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         1" + "'", str2, "         1");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1843");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDirTree("     -1.00100100\r\n100                                                                                                  10100                                                                                                  10100", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1844");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1845");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDirTree("     -1.00\t35\t35\r\n\t35                                                                                                  10\t35                                                                                                  10\t35", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1846");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                            -1.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                             -1.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1847");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '#', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35" + "'", str2, "35");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1848");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00                                  0                                  0\r\n                                  0                                                                                                  10                                  0                                                                                                  10                                  0", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass4 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1849");
        java.lang.String[] strArray10 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("\r\n", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDirTree("", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("\t35", strArray10);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("\t                          100.00", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1850");
        java.lang.String[] strArray8 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDir("", strArray8);
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDir("\r\n", strArray8);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("     -1.00                                  0                                  0\r\n                                  0                                                                                                  10                                  0                                                                                                  10                                  0", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(fileList9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1851");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00                                               -1.00                                               -1.00\r\n                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1852");
        net.ajaskey.common.TextUtils.printline("                                                                                               52");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1853");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                               1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1854");
        java.lang.String[] strArray7 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList8 = net.ajaskey.common.Utils.getDir("", strArray7);
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDir("35.00", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(fileList8);
        org.junit.Assert.assertNull(fileList9);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1855");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 'a', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97" + "'", str2, "97");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1856");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100.00" + "'", str2, "                                                                                              100.00");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1857");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1858");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  -1" + "'", str2, "                                                                                                  -1");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1859");
        net.ajaskey.common.Utils.makeDir("     -1.00         0         0\r\n         0                                                                                                  10         0                                                                                                  10         0");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1860");
        java.lang.String[] strArray15 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("", strArray15);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("\r\n", strArray15);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDirTree("", strArray15);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("\t35", strArray15);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDir("", strArray15);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDirTree("\t\t     -1.00                                               -1.00                                               -1.00\r\n                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00", strArray15);
        java.util.List<java.io.File> fileList22 = net.ajaskey.common.Utils.getDirTree("", strArray15);
        java.util.List<java.io.File> fileList23 = net.ajaskey.common.Utils.getDir("                                                                                               10.00                           32.00hi!                           32.00                                                                                                   1                           32.0035                           32.00                                                                                                   1                           32.00", strArray15);
        java.util.List<java.io.File> fileList24 = net.ajaskey.common.Utils.getDirTree("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray15);
        java.util.List<java.io.File> fileList25 = net.ajaskey.common.Utils.getDirTree("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
        org.junit.Assert.assertNull(fileList22);
        org.junit.Assert.assertNull(fileList23);
        org.junit.Assert.assertNull(fileList24);
        org.junit.Assert.assertNull(fileList25);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1861");
        net.ajaskey.common.Utils.TAB = "32";
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1862");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("\t                             100.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1863");
        java.lang.String[] strArray12 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("\r\n", strArray12);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray12);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray12);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDirTree("\t", strArray12);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDirTree("\t                                                                                                   0", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1864");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                0.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests3.test1865");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", true);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }
}
