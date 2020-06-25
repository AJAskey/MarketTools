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
        int int0 = net.ajaskey.common.DateTime.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0002");
        int int0 = net.ajaskey.common.DateTime.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0003");
        net.ajaskey.common.DateTime dateTime0 = null;
        net.ajaskey.common.DateTime dateTime1 = null;
        boolean boolean2 = net.ajaskey.common.Utils.sameMonth(dateTime0, dateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0004");
        net.ajaskey.common.Utils.TAB = "";
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0005");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '4', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               52.00" + "'", str2, "                                                                                               52.00");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0006");
        int int0 = net.ajaskey.common.DateTime.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0007");
        int int0 = net.ajaskey.common.DateTime.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0008");
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
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0009");
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
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0010");
        int int0 = net.ajaskey.common.DateTime.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0011");
        int int0 = net.ajaskey.common.DateTime.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0012");
        int int0 = net.ajaskey.common.DateTime.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0013");
        int int0 = net.ajaskey.common.DateTime.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0014");
        int int0 = net.ajaskey.common.DateTime.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0015");
        net.ajaskey.common.TextUtils.printline("                                                                                               52.00");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0016");
        net.ajaskey.common.TextUtils textUtils0 = new net.ajaskey.common.TextUtils();
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0017");
        int int0 = net.ajaskey.common.DateTime.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0018");
        java.lang.String str0 = net.ajaskey.common.Utils.TAB;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0019");
        int int0 = net.ajaskey.common.DateTime.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0020");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("January", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: January (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0021");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0022");
        net.ajaskey.common.Utils.NL = "hi!";
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0023");
        net.ajaskey.common.Utils.makeDir("");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0024");
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
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0025");
        java.lang.String str0 = net.ajaskey.common.Utils.NL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hi!" + "'", str0, "hi!");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0026");
        int int0 = net.ajaskey.common.DateTime.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0027");
        net.ajaskey.common.Utils.NL = "";
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0028");
        java.text.DecimalFormatSymbols decimalFormatSymbols0 = null;
        net.ajaskey.common.Utils.decimalFormatSymbols = decimalFormatSymbols0;
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0029");
        int int0 = net.ajaskey.common.DateTime.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0030");
        java.text.DecimalFormatSymbols decimalFormatSymbols0 = net.ajaskey.common.Utils.decimalFormatSymbols;
        org.junit.Assert.assertNull(decimalFormatSymbols0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0031");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((-1972.041095890411d), 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0032");
        net.ajaskey.common.Utils.NL = "31-Dec-1969";
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0033");
        int int0 = net.ajaskey.common.DateTime.MILLSECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0034");
        int int0 = net.ajaskey.common.DateTime.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0035");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("31-Dec-1969");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0036");
        int int0 = net.ajaskey.common.DateTime.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0037");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Invalid fmt", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0038");
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
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Invalid fmt", "31-Dec-1969");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'e'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0040");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("January");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(3, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0042");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(11, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11" + "'", str2, "11");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0043");
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
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0044");
        net.ajaskey.common.Utils.NL = "Invalid fmt";
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0045");
        int int0 = net.ajaskey.common.DateTime.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0046");
        int int0 = net.ajaskey.common.DateTime.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0047");
        int int0 = net.ajaskey.common.DateTime.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0048");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat5 = null;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        boolean boolean10 = dateTime3.isLessThan(dateTime8);
        java.lang.Class<?> wildcardClass11 = dateTime3.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0049");
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0050");
        int int0 = net.ajaskey.common.DateTime.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0051");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 5, 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     5.00" + "'", str2, "     5.00");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0052");
        net.ajaskey.common.Utils utils0 = new net.ajaskey.common.Utils();
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0053");
        int int0 = net.ajaskey.common.DateTime.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0054");
        int int0 = net.ajaskey.common.DateTime.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0055");
        int int0 = net.ajaskey.common.DateTime.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0056");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.util.Date date7 = dateTime3.getTime();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(date7);
        net.ajaskey.common.DateTime dateTime11 = dateTime8.parse("31-Dec-1969", "January");
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
        double double18 = dateTime15.getDeltaYears(dateTime17);
        boolean boolean19 = dateTime17.isWeekday();
        java.util.Date date20 = dateTime17.getTime();
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(date20);
        // The following exception was thrown during execution in test generation
        try {
            dateTime11.set(date20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Thu Apr 10 10:42:54 MST 2");
        org.junit.Assert.assertNull(dateTime11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1972.041095890411d) + "'", double18 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Dec 31 17:00:00 MST 1969");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0057");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0058");
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0059");
        int int0 = net.ajaskey.common.DateTime.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0060");
        net.ajaskey.common.TextUtils.printline("");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0061");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             100" + "'", str2, "                             100");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0062");
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
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0063");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0064");
        net.ajaskey.common.Utils.makeDir("                                                                                               52.00");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0065");
        net.ajaskey.common.TextUtils.printline("BAD-DATE-FORMAT");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0066");
        int int0 = net.ajaskey.common.DateTime.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0067");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     10" + "'", str2, "     10");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0068");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("JanuaryInvalid fmtInvalid fmt                                                                                               52.00Invalid fmthi!Invalid fmt", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0069");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("10-Apr-0002", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0070");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 5, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5.00" + "'", str2, "5.00");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0071");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     0" + "'", str2, "     0");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0072");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     10", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0073");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               52.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0074");
        net.ajaskey.common.TextUtils.printline("JanuaryInvalid fmtInvalid fmt                                                                                               52.00Invalid fmthi!Invalid fmt");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0075");
        int int0 = net.ajaskey.common.DateTime.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0076");
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
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0077");
        net.ajaskey.common.Utils.NL = "BAD-DATE-FORMAT";
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0078");
        net.ajaskey.common.Utils.TAB = "Wednesday";
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0079");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.00" + "'", str2, "100.00");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0080");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        boolean boolean7 = dateTime5.isWeekday();
        java.util.Date date8 = dateTime5.getTime();
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(date8);
        java.lang.Class<?> wildcardClass10 = date8.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0081");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("100.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 100.00 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0082");
        net.ajaskey.common.Utils.sleep((int) (byte) 0);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0083");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("JanuaryInvalid fmtInvalid fmt                                                                                               52.00Invalid fmthi!Invalid fmt", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0084");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         1" + "'", str2, "         1");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("January", "JanuaryInvalid fmtInvalid fmt                                                                                               52.00Invalid fmthi!Invalid fmt");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'J'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0086");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.util.Date date7 = dateTime3.getTime();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(date7);
        net.ajaskey.common.DateTime dateTime11 = dateTime8.parse("31-Dec-1969", "January");
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
        int int14 = dateTime13.getMs();
        java.lang.String str15 = dateTime13.toString();
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        double double22 = dateTime19.getDeltaYears(dateTime21);
        int int23 = dateTime19.getHour();
        int int24 = dateTime19.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(100L);
        double double31 = dateTime28.getDeltaYears(dateTime30);
        boolean boolean32 = dateTime30.isWeekday();
        boolean boolean33 = net.ajaskey.common.Utils.sameDate(dateTime19, dateTime30);
        boolean boolean34 = net.ajaskey.common.Utils.sameDate(dateTime13, dateTime19);
        dateTime8.set(dateTime19);
        net.ajaskey.common.DateTime dateTime37 = dateTime8.parse("Thu 10-Apr-0002 10:42:55");
        // The following exception was thrown during execution in test generation
        try {
            java.text.SimpleDateFormat simpleDateFormat38 = dateTime37.getSdf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Thu Apr 10 10:42:56 MST 2");
        org.junit.Assert.assertNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-Dec-1969" + "'", str15, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1972.041095890411d) + "'", double22 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1972.041095890411d) + "'", double31 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(dateTime37);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0087");
        net.ajaskey.common.Utils.sleep(2);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0088");
        net.ajaskey.common.Utils.sleep(7);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0089");
        net.ajaskey.common.Utils.sleep((int) (byte) 1);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0090");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 2020);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0091");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(365, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0092");
        net.ajaskey.common.Utils.TAB = "hi!";
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0093");
        net.ajaskey.common.Utils.NL = "Thursday";
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0094");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("December", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: December (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0095");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.util.Date date7 = dateTime3.getTime();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(date7);
        net.ajaskey.common.DateTime dateTime11 = dateTime8.parse("31-Dec-1969", "January");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTime11.getMonth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Thu Apr 10 10:42:57 MST 2");
        org.junit.Assert.assertNull(dateTime11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0096");
        net.ajaskey.common.Utils.TAB = "100.00";
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0097");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime9.isWeekday();
        boolean boolean14 = dateTime3.sameDate(dateTime9);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
        double double21 = dateTime18.getDeltaYears(dateTime20);
        java.text.SimpleDateFormat simpleDateFormat23 = null;
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat23);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double27 = dateTime24.getDeltaYears(dateTime26);
        boolean boolean28 = dateTime24.isWeekday();
        boolean boolean29 = dateTime18.sameDate(dateTime24);
        java.text.SimpleDateFormat simpleDateFormat31 = null;
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat31);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double35 = dateTime32.getDeltaYears(dateTime34);
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean40 = dateTime34.isEqual(dateTime39);
        dateTime18.set(dateTime39);
        long long42 = dateTime3.getDeltaMilliSeconds(dateTime39);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(100L);
        int int45 = dateTime44.getMs();
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(100L);
        double double52 = dateTime49.getDeltaYears(dateTime51);
        java.text.SimpleDateFormat simpleDateFormat53 = dateTime49.getSdf();
        boolean boolean54 = dateTime44.isLessThanOrEqual(dateTime49);
        int int55 = dateTime49.getDayOfYear();
        boolean boolean56 = dateTime49.isWeekday();
        boolean boolean57 = dateTime3.sameDate(dateTime49);
        java.util.Date date58 = dateTime49.getTime();
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime(date58);
        java.lang.Class<?> wildcardClass60 = date58.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1972.041095890411d) + "'", double52 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Thu Apr 10 10:42:57 MST 2");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0098");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        java.util.Calendar calendar11 = dateTime4.getCal();
        java.lang.String str12 = dateTime4.format();
        net.ajaskey.common.DateTime dateTime13 = null;
        long long14 = dateTime4.getDeltaDays(dateTime13);
        int int15 = dateTime4.getSecond();
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        double double22 = dateTime19.getDeltaYears(dateTime21);
        java.text.SimpleDateFormat simpleDateFormat24 = null;
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double28 = dateTime25.getDeltaYears(dateTime27);
        boolean boolean29 = dateTime25.isWeekday();
        boolean boolean30 = dateTime19.sameDate(dateTime25);
        int int31 = dateTime25.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime32 = dateTime4.copy(dateTime25);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat38 = null;
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat38);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double42 = dateTime39.getDeltaYears(dateTime41);
        boolean boolean43 = dateTime36.isLessThan(dateTime41);
        java.lang.String str44 = dateTime41.toFullString();
        dateTime41.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat49 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat51 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat52 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime("", simpleDateFormat51, simpleDateFormat52);
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat49, simpleDateFormat52);
        boolean boolean55 = dateTime41.isGreaterThan(dateTime54);
        java.text.SimpleDateFormat simpleDateFormat57 = null;
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat57);
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double61 = dateTime58.getDeltaYears(dateTime60);
        boolean boolean62 = dateTime58.isWeekday();
        net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long67 = dateTime58.getDeltaDays(dateTime66);
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime(dateTime58);
        boolean boolean69 = dateTime54.sameDate(dateTime58);
        // The following exception was thrown during execution in test generation
        try {
            long long70 = dateTime32.getDeltaMilliSeconds(dateTime58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "BAD-DATE-FORMAT" + "'", str12, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1972.041095890411d) + "'", double22 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(dateTime32);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str44, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat49);
        org.junit.Assert.assertNotNull(simpleDateFormat51);
        org.junit.Assert.assertNotNull(simpleDateFormat52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0099");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 9, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 9" + "'", str2, " 9");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0100");
        net.ajaskey.common.TextUtils.printline("Thursday");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0101");
        net.ajaskey.common.TextUtils.printline("December");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0102");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        int int7 = dateTime3.getHour();
        int int8 = dateTime3.getDayOfMonth();
        java.lang.Class<?> wildcardClass9 = dateTime3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0103");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 8, 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     8.00" + "'", str2, "                     8.00");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0104");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thursday", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0105");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0106");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("JanuaryInvalid fmtInvalid fmt                                                                                               52.00Invalid fmthi!Invalid fmt");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0107");
        net.ajaskey.common.Utils.sleep((int) (byte) 100);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0108");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        int int7 = dateTime3.getHour();
        java.text.SimpleDateFormat simpleDateFormat9 = null;
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat9);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double13 = dateTime10.getDeltaYears(dateTime12);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean18 = dateTime12.isEqual(dateTime17);
        java.util.Calendar calendar19 = dateTime12.getCal();
        java.lang.String str20 = dateTime12.format();
        net.ajaskey.common.DateTime dateTime21 = null;
        long long22 = dateTime12.getDeltaDays(dateTime21);
        int int23 = dateTime12.getSecond();
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(100L);
        double double30 = dateTime27.getDeltaYears(dateTime29);
        java.text.SimpleDateFormat simpleDateFormat32 = null;
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat32);
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double36 = dateTime33.getDeltaYears(dateTime35);
        boolean boolean37 = dateTime33.isWeekday();
        boolean boolean38 = dateTime27.sameDate(dateTime33);
        int int39 = dateTime33.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime40 = dateTime12.copy(dateTime33);
        dateTime3.set(dateTime33);
        java.lang.Class<?> wildcardClass42 = dateTime33.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "BAD-DATE-FORMAT" + "'", str20, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1972.041095890411d) + "'", double30 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(dateTime40);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0109");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 365);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0110");
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0111");
        net.ajaskey.common.Utils.NL = "                                                                                               52.00";
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0112");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("     10", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:      10 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("JanuaryThursdayThursday                                                                                               52.00Thursdayhi!Thursday", "Thu 10-Apr-0002 10:42:57");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'T'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0114");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              -1" + "'", str2, "                              -1");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0115");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        boolean boolean7 = dateTime5.isWeekday();
        java.util.Date date8 = dateTime5.getTime();
        java.lang.Class<?> wildcardClass9 = dateTime5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0116");
        net.ajaskey.common.Utils.makeDir("     0");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0117");
        net.ajaskey.common.TextUtils.printline("Wednesday");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0118");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0119");
        net.ajaskey.common.Utils.TAB = "Wed 31-Dec-1969 17:00:00";
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0120");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat5 = null;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        boolean boolean10 = dateTime3.isLessThan(dateTime8);
        java.lang.String str11 = dateTime8.toFullString();
        dateTime8.set((int) '#', 8, 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str11, "Wed 31-Dec-1969 17:00:00");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0121");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("April");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0123");
        net.ajaskey.common.Utils.TAB = "10-Apr-0002";
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0124");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 100" + "'", str2, "                                                 100");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0125");
        java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime("January", simpleDateFormat2);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime("", simpleDateFormat2);
        net.ajaskey.common.DateTime dateTime6 = dateTime4.parse("Wed 31-Dec-1969 17:00:00");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = dateTime6.isNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleDateFormat2);
        org.junit.Assert.assertNull(dateTime6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0126");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '#', 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           35" + "'", str2, "           35");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0127");
        net.ajaskey.common.Utils.makeDir("     10");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0128");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                             100", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                              100 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0129");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1.0f), (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           -1.00" + "'", str2, "                           -1.00");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0130");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        boolean boolean3 = dateTime1.isNull();
        java.util.Calendar calendar4 = dateTime1.getCal();
        java.text.SimpleDateFormat simpleDateFormat5 = dateTime1.getSdf();
        java.text.SimpleDateFormat simpleDateFormat6 = dateTime1.getSdf();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(simpleDateFormat5);
        org.junit.Assert.assertNull(simpleDateFormat6);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0131");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    0" + "'", str2, "    0");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0132");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("Wednesday", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Wednesday (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0133");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        java.lang.String str3 = dateTime1.toString();
        int int4 = dateTime1.getDayOfYear();
        java.text.SimpleDateFormat simpleDateFormat6 = null;
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat6);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double10 = dateTime7.getDeltaYears(dateTime9);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean15 = dateTime9.isEqual(dateTime14);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
        int int18 = dateTime17.getMs();
        boolean boolean19 = dateTime14.isGreaterThanOrEqual(dateTime17);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        dateTime21.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        double double32 = dateTime29.getDeltaYears(dateTime31);
        boolean boolean33 = dateTime31.isWeekday();
        java.util.Date date34 = dateTime31.getTime();
        dateTime21.set(dateTime31);
        boolean boolean36 = net.ajaskey.common.Utils.sameDate(dateTime14, dateTime21);
        dateTime14.add((int) '#', 6);
        boolean boolean40 = dateTime1.sameDate(dateTime14);
        java.text.SimpleDateFormat simpleDateFormat42 = null;
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat42);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double46 = dateTime43.getDeltaYears(dateTime45);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime(dateTime43);
        boolean boolean48 = dateTime14.sameDate(dateTime47);
        java.lang.String str49 = dateTime47.getMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1972.041095890411d) + "'", double32 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "June" + "'", str49, "June");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0134");
        net.ajaskey.common.Utils.sleep(8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0135");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        int int13 = dateTime12.getMs();
        boolean boolean14 = dateTime9.isGreaterThanOrEqual(dateTime12);
        java.text.SimpleDateFormat simpleDateFormat16 = null;
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        boolean boolean21 = dateTime17.isWeekday();
        boolean boolean22 = dateTime12.isLessThanOrEqual(dateTime17);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(100L);
        dateTime24.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean29 = dateTime24.isWeekday();
        boolean boolean30 = dateTime12.isGreaterThanOrEqual(dateTime24);
        java.lang.String str31 = dateTime12.toFullString();
        java.text.SimpleDateFormat simpleDateFormat33 = null;
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat33);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double37 = dateTime34.getDeltaYears(dateTime36);
        boolean boolean38 = dateTime34.isWeekday();
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long43 = dateTime34.getDeltaDays(dateTime42);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(dateTime34);
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(100L);
        double double51 = dateTime48.getDeltaYears(dateTime50);
        boolean boolean52 = dateTime50.isWeekday();
        java.util.Date date53 = dateTime50.getTime();
        dateTime34.set(date53);
        dateTime12.set(date53);
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime(100L);
        int int58 = dateTime57.getMs();
        java.lang.String str59 = dateTime57.toString();
        int int60 = dateTime57.getDayOfYear();
        java.text.SimpleDateFormat simpleDateFormat62 = null;
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat62);
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double66 = dateTime63.getDeltaYears(dateTime65);
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean71 = dateTime65.isEqual(dateTime70);
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime(100L);
        int int74 = dateTime73.getMs();
        boolean boolean75 = dateTime70.isGreaterThanOrEqual(dateTime73);
        net.ajaskey.common.DateTime dateTime77 = new net.ajaskey.common.DateTime(100L);
        dateTime77.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime85 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime87 = new net.ajaskey.common.DateTime(100L);
        double double88 = dateTime85.getDeltaYears(dateTime87);
        boolean boolean89 = dateTime87.isWeekday();
        java.util.Date date90 = dateTime87.getTime();
        dateTime77.set(dateTime87);
        boolean boolean92 = net.ajaskey.common.Utils.sameDate(dateTime70, dateTime77);
        dateTime70.add((int) '#', 6);
        boolean boolean96 = dateTime57.sameDate(dateTime70);
        java.util.Date date97 = dateTime57.getTime();
        boolean boolean98 = net.ajaskey.common.Utils.sameMonth(dateTime12, dateTime57);
        java.util.Calendar calendar99 = dateTime57.getCal();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str31, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1972.041095890411d) + "'", double51 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "31-Dec-1969" + "'", str59, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 365 + "'", int60 == 365);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-1972.041095890411d) + "'", double88 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(date90);
        org.junit.Assert.assertEquals(date90.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(date97);
        org.junit.Assert.assertEquals(date97.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNotNull(calendar99);
        org.junit.Assert.assertEquals(calendar99.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0136");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("June", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: June (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0137");
        net.ajaskey.common.Utils.TAB = "JanuaryInvalid fmtInvalid fmt                                                                                               52.00Invalid fmthi!Invalid fmt";
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0138");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        int int13 = dateTime12.getMs();
        boolean boolean14 = dateTime9.isGreaterThanOrEqual(dateTime12);
        java.text.SimpleDateFormat simpleDateFormat16 = null;
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        boolean boolean21 = dateTime17.isWeekday();
        boolean boolean22 = dateTime12.isLessThanOrEqual(dateTime17);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(100L);
        dateTime24.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean29 = dateTime24.isWeekday();
        boolean boolean30 = dateTime12.isGreaterThanOrEqual(dateTime24);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime(100L);
        double double37 = dateTime34.getDeltaYears(dateTime36);
        java.text.SimpleDateFormat simpleDateFormat39 = null;
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat39);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double43 = dateTime40.getDeltaYears(dateTime42);
        boolean boolean44 = dateTime40.isWeekday();
        boolean boolean45 = dateTime34.sameDate(dateTime40);
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(100L);
        double double52 = dateTime49.getDeltaYears(dateTime51);
        java.text.SimpleDateFormat simpleDateFormat54 = null;
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat54);
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double58 = dateTime55.getDeltaYears(dateTime57);
        boolean boolean59 = dateTime55.isWeekday();
        boolean boolean60 = dateTime49.sameDate(dateTime55);
        java.text.SimpleDateFormat simpleDateFormat62 = null;
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat62);
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double66 = dateTime63.getDeltaYears(dateTime65);
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean71 = dateTime65.isEqual(dateTime70);
        dateTime49.set(dateTime70);
        long long73 = dateTime34.getDeltaMilliSeconds(dateTime70);
        net.ajaskey.common.DateTime dateTime77 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat79 = null;
        net.ajaskey.common.DateTime dateTime80 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat79);
        boolean boolean81 = net.ajaskey.common.Utils.sameDate(dateTime77, dateTime80);
        boolean boolean82 = net.ajaskey.common.Utils.sameDate(dateTime34, dateTime80);
        dateTime24.set(dateTime80);
        net.ajaskey.common.DateTime dateTime85 = dateTime80.parse("January");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str86 = dateTime85.getMonth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1972.041095890411d) + "'", double37 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1972.041095890411d) + "'", double52 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(dateTime85);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0139");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Invalid fmt", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0140");
        net.ajaskey.common.Utils.sleep((int) ' ');
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0141");
        net.ajaskey.common.Utils.TAB = "         1";
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0142");
        net.ajaskey.common.TextUtils.printline("                              -1");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0143");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("Thu 10-Apr-0002 10:42:58");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0144");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0145");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              10" + "'", str2, "                              10");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0146");
        net.ajaskey.common.Utils.NL = "Thu 10-Apr-0002 10:42:58";
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0147");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 6, 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           6" + "'", str2, "           6");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0148");
        net.ajaskey.common.Utils.makeDir("11");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0149");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        10" + "'", str2, "        10");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0150");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0151");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        dateTime1.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime11.isWeekday();
        java.util.Date date14 = dateTime11.getTime();
        dateTime1.set(dateTime11);
        int int16 = dateTime1.getMs();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0152");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("           6", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:            6 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0153");
        net.ajaskey.common.Utils.NL = "                                                 100";
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0154");
        net.ajaskey.common.Utils.NL = "                     8.00";
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0155");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        boolean boolean3 = dateTime1.isWeekday();
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((long) (short) 0);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(100L);
        int int8 = dateTime7.getMs();
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(100L);
        double double15 = dateTime12.getDeltaYears(dateTime14);
        java.text.SimpleDateFormat simpleDateFormat16 = dateTime12.getSdf();
        boolean boolean17 = dateTime7.isLessThanOrEqual(dateTime12);
        java.text.SimpleDateFormat simpleDateFormat19 = null;
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat19);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double23 = dateTime20.getDeltaYears(dateTime22);
        boolean boolean24 = dateTime20.isWeekday();
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long29 = dateTime20.getDeltaDays(dateTime28);
        long long30 = dateTime7.getDeltaDays(dateTime28);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime(100L);
        dateTime32.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean37 = dateTime32.isWeekday();
        int int38 = dateTime7.getYears(dateTime32);
        int int39 = dateTime7.getYear();
        java.util.Calendar calendar40 = dateTime7.getCal();
        net.ajaskey.common.DateTime dateTime41 = dateTime5.copy(dateTime7);
        boolean boolean42 = dateTime1.isGreaterThan(dateTime7);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(dateTime1);
        java.lang.Class<?> wildcardClass44 = dateTime43.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1972.041095890411d) + "'", double15 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 719795L + "'", long30 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1870) + "'", int38 == (-1870));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1969 + "'", int39 == 1969);
        org.junit.Assert.assertNotNull(calendar40);
        org.junit.Assert.assertEquals(calendar40.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0156");
        net.ajaskey.common.Utils.sleep((-1870));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0157");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 10:42:55", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0158");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("     5.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0159");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        int int3 = dateTime1.getHour();
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat9 = null;
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat9);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double13 = dateTime10.getDeltaYears(dateTime12);
        boolean boolean14 = dateTime7.isLessThan(dateTime12);
        java.lang.String str15 = dateTime12.toFullString();
        dateTime12.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat20 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat22 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat23 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("", simpleDateFormat22, simpleDateFormat23);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat20, simpleDateFormat23);
        boolean boolean26 = dateTime12.isGreaterThan(dateTime25);
        boolean boolean27 = dateTime1.isEqual(dateTime12);
        net.ajaskey.common.DateTime dateTime28 = null;
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(dateTime28);
        dateTime29.set(42, 10, 10);
        java.util.Date date34 = dateTime29.getTime();
        net.ajaskey.common.DateTime dateTime35 = dateTime1.copy(dateTime29);
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime(100L);
        double double42 = dateTime39.getDeltaYears(dateTime41);
        java.util.Date date43 = dateTime39.getTime();
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(date43);
        net.ajaskey.common.DateTime dateTime47 = dateTime44.parse("31-Dec-1969", "January");
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime(100L);
        int int50 = dateTime49.getMs();
        java.lang.String str51 = dateTime49.toString();
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime(100L);
        double double58 = dateTime55.getDeltaYears(dateTime57);
        int int59 = dateTime55.getHour();
        int int60 = dateTime55.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime(100L);
        double double67 = dateTime64.getDeltaYears(dateTime66);
        boolean boolean68 = dateTime66.isWeekday();
        boolean boolean69 = net.ajaskey.common.Utils.sameDate(dateTime55, dateTime66);
        boolean boolean70 = net.ajaskey.common.Utils.sameDate(dateTime49, dateTime55);
        dateTime44.set(dateTime55);
        net.ajaskey.common.DateTime dateTime73 = dateTime44.parse("Thu 10-Apr-0002 10:42:55");
        boolean boolean74 = dateTime1.isEqual(dateTime73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str15, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat20);
        org.junit.Assert.assertNotNull(simpleDateFormat22);
        org.junit.Assert.assertNotNull(simpleDateFormat23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Sat Nov 10 10:43:01 MST 42");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1972.041095890411d) + "'", double42 == (-1972.041095890411d));
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Thu Apr 10 10:43:01 MST 2");
        org.junit.Assert.assertNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "31-Dec-1969" + "'", str51, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1972.041095890411d) + "'", double58 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1972.041095890411d) + "'", double67 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(dateTime73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0160");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("", "Thursday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'T'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0161");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                 100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0162");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        int int13 = dateTime12.getMs();
        boolean boolean14 = dateTime9.isGreaterThanOrEqual(dateTime12);
        java.text.SimpleDateFormat simpleDateFormat16 = null;
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        boolean boolean21 = dateTime17.isWeekday();
        boolean boolean22 = dateTime12.isLessThanOrEqual(dateTime17);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(100L);
        dateTime24.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean29 = dateTime24.isWeekday();
        boolean boolean30 = dateTime12.isGreaterThanOrEqual(dateTime24);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime(100L);
        double double37 = dateTime34.getDeltaYears(dateTime36);
        java.text.SimpleDateFormat simpleDateFormat39 = null;
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat39);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double43 = dateTime40.getDeltaYears(dateTime42);
        boolean boolean44 = dateTime40.isWeekday();
        boolean boolean45 = dateTime34.sameDate(dateTime40);
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(100L);
        double double52 = dateTime49.getDeltaYears(dateTime51);
        java.text.SimpleDateFormat simpleDateFormat54 = null;
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat54);
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double58 = dateTime55.getDeltaYears(dateTime57);
        boolean boolean59 = dateTime55.isWeekday();
        boolean boolean60 = dateTime49.sameDate(dateTime55);
        java.text.SimpleDateFormat simpleDateFormat62 = null;
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat62);
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double66 = dateTime63.getDeltaYears(dateTime65);
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean71 = dateTime65.isEqual(dateTime70);
        dateTime49.set(dateTime70);
        long long73 = dateTime34.getDeltaMilliSeconds(dateTime70);
        net.ajaskey.common.DateTime dateTime77 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat79 = null;
        net.ajaskey.common.DateTime dateTime80 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat79);
        boolean boolean81 = net.ajaskey.common.Utils.sameDate(dateTime77, dateTime80);
        boolean boolean82 = net.ajaskey.common.Utils.sameDate(dateTime34, dateTime80);
        dateTime24.set(dateTime80);
        net.ajaskey.common.DateTime dateTime85 = dateTime80.parse("January");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str87 = dateTime85.format(" 9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1972.041095890411d) + "'", double37 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1972.041095890411d) + "'", double52 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(dateTime85);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0163");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0164");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        int int13 = dateTime12.getMs();
        boolean boolean14 = dateTime9.isGreaterThanOrEqual(dateTime12);
        java.text.SimpleDateFormat simpleDateFormat16 = null;
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        boolean boolean21 = dateTime17.isWeekday();
        boolean boolean22 = dateTime12.isLessThanOrEqual(dateTime17);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(100L);
        dateTime24.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean29 = dateTime24.isWeekday();
        boolean boolean30 = dateTime12.isGreaterThanOrEqual(dateTime24);
        boolean boolean31 = dateTime24.isWeekday();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0165");
        net.ajaskey.common.Utils.makeDir("December");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0166");
        net.ajaskey.common.Utils.sleep(5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0167");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("5.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0168");
        net.ajaskey.common.TextUtils.printline("January");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0169");
        net.ajaskey.common.Utils.NL = "January";
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0170");
        net.ajaskey.common.Utils.NL = "         1";
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0171");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1969, 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1,969.00" + "'", str2, "1,969.00");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0172");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("           35", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:            35 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0173");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        int int13 = dateTime12.getMs();
        boolean boolean14 = dateTime9.isGreaterThanOrEqual(dateTime12);
        java.text.SimpleDateFormat simpleDateFormat16 = null;
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        boolean boolean21 = dateTime17.isWeekday();
        boolean boolean22 = dateTime12.isLessThanOrEqual(dateTime17);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(100L);
        dateTime24.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean29 = dateTime24.isWeekday();
        boolean boolean30 = dateTime12.isGreaterThanOrEqual(dateTime24);
        java.lang.Class<?> wildcardClass31 = dateTime24.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0174");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("10-Apr-0002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0175");
        net.ajaskey.common.TextUtils.printline("                                                 100");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0176");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime9.isWeekday();
        boolean boolean14 = dateTime3.sameDate(dateTime9);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
        double double21 = dateTime18.getDeltaYears(dateTime20);
        java.text.SimpleDateFormat simpleDateFormat23 = null;
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat23);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double27 = dateTime24.getDeltaYears(dateTime26);
        boolean boolean28 = dateTime24.isWeekday();
        boolean boolean29 = dateTime18.sameDate(dateTime24);
        java.text.SimpleDateFormat simpleDateFormat31 = null;
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat31);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double35 = dateTime32.getDeltaYears(dateTime34);
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean40 = dateTime34.isEqual(dateTime39);
        dateTime18.set(dateTime39);
        long long42 = dateTime3.getDeltaMilliSeconds(dateTime39);
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat48 = null;
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat48);
        boolean boolean50 = net.ajaskey.common.Utils.sameDate(dateTime46, dateTime49);
        boolean boolean51 = net.ajaskey.common.Utils.sameDate(dateTime3, dateTime49);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime(100L);
        dateTime53.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime(100L);
        double double64 = dateTime61.getDeltaYears(dateTime63);
        boolean boolean65 = dateTime63.isWeekday();
        java.util.Date date66 = dateTime63.getTime();
        dateTime53.set(dateTime63);
        boolean boolean68 = dateTime49.sameDate(dateTime63);
        int int69 = dateTime49.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1972.041095890411d) + "'", double64 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0177");
        net.ajaskey.common.Utils.NL = "           35";
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0178");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0179");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        dateTime1.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str6 = dateTime1.getMonth();
        int int7 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime9 = dateTime1.parse("BAD-DATE-FORMAT");
        net.ajaskey.common.DateTime dateTime10 = null;
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(dateTime10);
        dateTime11.set(42, 10, 10);
        java.util.Date date16 = dateTime11.getTime();
        // The following exception was thrown during execution in test generation
        try {
            dateTime9.set(date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(dateTime9);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 10 10:43:03 MST 42");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0180");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 2, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0181");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime(100L);
        int int3 = dateTime2.getMs();
        java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
        dateTime2.setSdf(simpleDateFormat4);
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat4);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) 53);
        boolean boolean9 = dateTime8.isWeekday();
        boolean boolean10 = dateTime6.sameDate(dateTime8);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        int int13 = dateTime12.getMs();
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        java.text.SimpleDateFormat simpleDateFormat21 = dateTime17.getSdf();
        boolean boolean22 = dateTime12.isLessThanOrEqual(dateTime17);
        java.text.SimpleDateFormat simpleDateFormat24 = null;
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double28 = dateTime25.getDeltaYears(dateTime27);
        boolean boolean29 = dateTime25.isWeekday();
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long34 = dateTime25.getDeltaDays(dateTime33);
        long long35 = dateTime12.getDeltaDays(dateTime33);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
        dateTime37.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean42 = dateTime37.isWeekday();
        int int43 = dateTime12.getYears(dateTime37);
        java.text.SimpleDateFormat simpleDateFormat45 = null;
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat45);
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double49 = dateTime46.getDeltaYears(dateTime48);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean54 = dateTime48.isEqual(dateTime53);
        int int55 = dateTime48.getDayOfWeek();
        boolean boolean56 = dateTime37.isLessThan(dateTime48);
        boolean boolean57 = dateTime6.isLessThanOrEqual(dateTime37);
        net.ajaskey.common.DateTime dateTime59 = dateTime6.parse("April");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1972.041095890411d) + "'", double20 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 719795L + "'", long35 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1870) + "'", int43 == (-1870));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(dateTime59);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0182");
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
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0183");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 10:43:00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0184");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime9.isWeekday();
        boolean boolean14 = dateTime3.sameDate(dateTime9);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
        double double21 = dateTime18.getDeltaYears(dateTime20);
        java.text.SimpleDateFormat simpleDateFormat23 = null;
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat23);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double27 = dateTime24.getDeltaYears(dateTime26);
        boolean boolean28 = dateTime24.isWeekday();
        boolean boolean29 = dateTime18.sameDate(dateTime24);
        java.text.SimpleDateFormat simpleDateFormat31 = null;
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat31);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double35 = dateTime32.getDeltaYears(dateTime34);
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean40 = dateTime34.isEqual(dateTime39);
        dateTime18.set(dateTime39);
        long long42 = dateTime3.getDeltaMilliSeconds(dateTime39);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(100L);
        int int45 = dateTime44.getMs();
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(100L);
        double double52 = dateTime49.getDeltaYears(dateTime51);
        java.text.SimpleDateFormat simpleDateFormat53 = dateTime49.getSdf();
        boolean boolean54 = dateTime44.isLessThanOrEqual(dateTime49);
        int int55 = dateTime49.getDayOfYear();
        boolean boolean56 = dateTime49.isWeekday();
        boolean boolean57 = dateTime3.sameDate(dateTime49);
        java.util.Date date58 = dateTime49.getTime();
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime(date58);
        java.lang.Class<?> wildcardClass60 = dateTime59.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1972.041095890411d) + "'", double52 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Thu Apr 10 10:43:03 MST 2");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0185");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0186");
        net.ajaskey.common.Utils.sleep((int) (short) 10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0187");
        net.ajaskey.common.Utils.sleep(13);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0188");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(12, 42, (int) (byte) 1);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean8 = dateTime7.isNull();
        int int9 = dateTime7.getDayOfYear();
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
        long long20 = dateTime17.getDeltaDays(dateTime19);
        int int21 = dateTime17.getHour();
        dateTime17.add((int) (byte) 100, (int) (byte) 0);
        double double25 = dateTime13.getDeltaYears(dateTime17);
        boolean boolean26 = dateTime7.isLessThanOrEqual(dateTime13);
        boolean boolean27 = dateTime3.sameDate(dateTime13);
        int int28 = dateTime13.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-719795L) + "'", long20 == (-719795L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0189");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("    0", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:     0 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0190");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 42, 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   42.00" + "'", str2, "   42.00");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0191");
        net.ajaskey.common.TextUtils.printline("                     8.00");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0192");
        net.ajaskey.common.Utils.NL = "January           35           35                                                                                               52.00           35hi!           35";
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0193");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("31-Dec-1969", "December");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'e'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0194");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 365, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             365" + "'", str2, "                             365");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0195");
        net.ajaskey.common.TextUtils.printline("100.00");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0196");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 10:43:02", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0197");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0198");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        java.util.Calendar calendar11 = dateTime4.getCal();
        java.lang.String str12 = dateTime4.format();
        net.ajaskey.common.DateTime dateTime13 = null;
        long long14 = dateTime4.getDeltaDays(dateTime13);
        int int15 = dateTime4.getSecond();
        boolean boolean16 = dateTime4.isWeekday();
        java.lang.Class<?> wildcardClass17 = dateTime4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "BAD-DATE-FORMAT" + "'", str12, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0199");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:54", "Thu 10-Apr-0002 10:43:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'T'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0200");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("5.00", "     10");
        dateTime2.add((int) (short) 0, (int) 'a');
        int int6 = dateTime2.getDayOfMonth();
        java.lang.String str7 = dateTime2.toString();
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
        double double14 = dateTime11.getDeltaYears(dateTime13);
        int int15 = dateTime11.getHour();
        java.text.SimpleDateFormat simpleDateFormat17 = null;
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat17);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double21 = dateTime18.getDeltaYears(dateTime20);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean26 = dateTime20.isEqual(dateTime25);
        java.util.Calendar calendar27 = dateTime20.getCal();
        java.lang.String str28 = dateTime20.format();
        net.ajaskey.common.DateTime dateTime29 = null;
        long long30 = dateTime20.getDeltaDays(dateTime29);
        int int31 = dateTime20.getSecond();
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
        double double38 = dateTime35.getDeltaYears(dateTime37);
        java.text.SimpleDateFormat simpleDateFormat40 = null;
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat40);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double44 = dateTime41.getDeltaYears(dateTime43);
        boolean boolean45 = dateTime41.isWeekday();
        boolean boolean46 = dateTime35.sameDate(dateTime41);
        int int47 = dateTime41.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime48 = dateTime20.copy(dateTime41);
        dateTime11.set(dateTime41);
        boolean boolean50 = dateTime2.isGreaterThan(dateTime41);
        java.util.Calendar calendar51 = dateTime2.getCal();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(calendar27);
        org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "BAD-DATE-FORMAT" + "'", str28, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1972.041095890411d) + "'", double38 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(dateTime48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(calendar51);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0201");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("January           35           35                                                                                               52.00           35hi!           35", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: January           35           35                                                                                               52.00           35hi!           35 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0202");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        java.text.SimpleDateFormat simpleDateFormat13 = null;
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat13);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        boolean boolean18 = dateTime14.isWeekday();
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long23 = dateTime14.getDeltaDays(dateTime22);
        long long24 = dateTime1.getDeltaDays(dateTime22);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat30 = null;
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat30);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double34 = dateTime31.getDeltaYears(dateTime33);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean39 = dateTime33.isEqual(dateTime38);
        java.util.Calendar calendar40 = dateTime33.getCal();
        boolean boolean41 = dateTime28.isLessThan(dateTime33);
        boolean boolean42 = net.ajaskey.common.Utils.sameDate(dateTime1, dateTime28);
        java.lang.Class<?> wildcardClass43 = dateTime1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 719795L + "'", long24 == 719795L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(calendar40);
        org.junit.Assert.assertEquals(calendar40.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0203");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(719795L, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             719,795" + "'", str2, "                                             719,795");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0204");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(12, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12" + "'", str2, "12");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0205");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("1,969.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 1,969.00 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0206");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        java.lang.String str3 = dateTime1.toString();
        int int4 = dateTime1.getDayOfYear();
        java.text.SimpleDateFormat simpleDateFormat6 = null;
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat6);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double10 = dateTime7.getDeltaYears(dateTime9);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean15 = dateTime9.isEqual(dateTime14);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
        int int18 = dateTime17.getMs();
        boolean boolean19 = dateTime14.isGreaterThanOrEqual(dateTime17);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        dateTime21.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        double double32 = dateTime29.getDeltaYears(dateTime31);
        boolean boolean33 = dateTime31.isWeekday();
        java.util.Date date34 = dateTime31.getTime();
        dateTime21.set(dateTime31);
        boolean boolean36 = net.ajaskey.common.Utils.sameDate(dateTime14, dateTime21);
        dateTime14.add((int) '#', 6);
        boolean boolean40 = dateTime1.sameDate(dateTime14);
        java.util.Date date41 = dateTime1.getTime();
        java.lang.String str42 = dateTime1.getMonth();
        java.lang.String str44 = dateTime1.format("                                                 100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1972.041095890411d) + "'", double32 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "December" + "'", str42, "December");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "                                                 100" + "'", str44, "                                                 100");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0207");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 2020, 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2,020.00" + "'", str2, "2,020.00");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0208");
        net.ajaskey.common.Utils.sleep(0);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0209");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(42, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 42" + "'", str2, "                                 42");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0210");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(5, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   5" + "'", str2, "                                                                                                   5");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0211");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0212");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime7 = dateTime4.parse("January                                                                                               52.00                                                                                               52.00                                                                                               52.00                                                                                               52.00hi!                                                                                               52.00");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTime7.toFullString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(dateTime7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0213");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("5.00", "     10");
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        int int10 = dateTime6.getHour();
        java.text.SimpleDateFormat simpleDateFormat12 = null;
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat12);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double16 = dateTime13.getDeltaYears(dateTime15);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean21 = dateTime15.isEqual(dateTime20);
        java.util.Calendar calendar22 = dateTime15.getCal();
        dateTime6.set(calendar22);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(calendar22);
        dateTime2.set(calendar22);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(100L);
        int int28 = dateTime27.getMs();
        java.lang.String str29 = dateTime27.toString();
        java.lang.String str31 = dateTime27.format("         1");
        net.ajaskey.common.DateTime dateTime32 = dateTime2.copy(dateTime27);
        java.text.SimpleDateFormat simpleDateFormat34 = null;
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat34);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double38 = dateTime35.getDeltaYears(dateTime37);
        boolean boolean39 = dateTime35.isWeekday();
        dateTime2.set(dateTime35);
        java.lang.Class<?> wildcardClass41 = dateTime2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "31-Dec-1969" + "'", str29, "31-Dec-1969");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "         1" + "'", str31, "         1");
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0214");
        net.ajaskey.common.Utils.TAB = "12";
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0215");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime(100L);
        int int3 = dateTime2.getMs();
        java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
        dateTime2.setSdf(simpleDateFormat4);
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat4);
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime11.isNull();
        java.text.SimpleDateFormat simpleDateFormat15 = null;
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat15);
        dateTime16.set((int) ' ', 0, 11);
        boolean boolean21 = dateTime11.isGreaterThanOrEqual(dateTime16);
        double double22 = dateTime6.getDeltaYears(dateTime11);
        java.text.SimpleDateFormat simpleDateFormat24 = null;
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double28 = dateTime25.getDeltaYears(dateTime27);
        boolean boolean29 = dateTime27.isNull();
        boolean boolean30 = dateTime11.isGreaterThan(dateTime27);
        java.lang.String str31 = dateTime11.getMonth();
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
        double double38 = dateTime35.getDeltaYears(dateTime37);
        java.text.SimpleDateFormat simpleDateFormat39 = dateTime35.getSdf();
        int int40 = dateTime35.getMinute();
        int int41 = dateTime35.getHour();
        net.ajaskey.common.DateTime dateTime44 = dateTime35.parse("", "100.00");
        boolean boolean45 = dateTime11.isEqual(dateTime44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat4);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "December" + "'", str31, "December");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1972.041095890411d) + "'", double38 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 43 + "'", int40 == 43);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNull(dateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0217");
        net.ajaskey.common.Utils.NL = "                                 42";
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0218");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("                              10", "Wed 31-Dec-1969 17:00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'e'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0219");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        java.lang.String str3 = dateTime1.toString();
        java.text.SimpleDateFormat simpleDateFormat5 = null;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        boolean boolean10 = dateTime6.isWeekday();
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long15 = dateTime6.getDeltaDays(dateTime14);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(dateTime6);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
        double double23 = dateTime20.getDeltaYears(dateTime22);
        boolean boolean24 = dateTime22.isWeekday();
        java.util.Date date25 = dateTime22.getTime();
        dateTime6.set(date25);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(100L);
        int int29 = dateTime28.getMs();
        java.lang.String str30 = dateTime28.toString();
        boolean boolean31 = dateTime6.isLessThanOrEqual(dateTime28);
        boolean boolean32 = dateTime1.isLessThanOrEqual(dateTime28);
        int int33 = dateTime1.getSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1972.041095890411d) + "'", double23 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "31-Dec-1969" + "'", str30, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0220");
        net.ajaskey.common.Utils.TAB = "Fri 11-Jan-0032 10:43:03";
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0221");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.util.Date date7 = dateTime3.getTime();
        int int8 = dateTime3.getMinute();
        net.ajaskey.common.DateTime dateTime9 = null;
        boolean boolean10 = dateTime3.isGreaterThan(dateTime9);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Thu Apr 10 10:43:06 MST 2");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 43 + "'", int8 == 43);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0222");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                             719,795", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0223");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (short) 0);
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(100L);
        int int4 = dateTime3.getMs();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime(100L);
        double double11 = dateTime8.getDeltaYears(dateTime10);
        java.text.SimpleDateFormat simpleDateFormat12 = dateTime8.getSdf();
        boolean boolean13 = dateTime3.isLessThanOrEqual(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat15 = null;
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat15);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double19 = dateTime16.getDeltaYears(dateTime18);
        boolean boolean20 = dateTime16.isWeekday();
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long25 = dateTime16.getDeltaDays(dateTime24);
        long long26 = dateTime3.getDeltaDays(dateTime24);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(100L);
        dateTime28.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean33 = dateTime28.isWeekday();
        int int34 = dateTime3.getYears(dateTime28);
        int int35 = dateTime3.getYear();
        java.util.Calendar calendar36 = dateTime3.getCal();
        net.ajaskey.common.DateTime dateTime37 = dateTime1.copy(dateTime3);
        java.lang.String str39 = dateTime1.format("                                                 100");
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
        double double46 = dateTime43.getDeltaYears(dateTime45);
        java.text.SimpleDateFormat simpleDateFormat48 = null;
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat48);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double52 = dateTime49.getDeltaYears(dateTime51);
        boolean boolean53 = dateTime49.isWeekday();
        boolean boolean54 = dateTime43.sameDate(dateTime49);
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime(100L);
        double double61 = dateTime58.getDeltaYears(dateTime60);
        java.text.SimpleDateFormat simpleDateFormat63 = null;
        net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat63);
        net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double67 = dateTime64.getDeltaYears(dateTime66);
        boolean boolean68 = dateTime64.isWeekday();
        boolean boolean69 = dateTime58.sameDate(dateTime64);
        java.text.SimpleDateFormat simpleDateFormat71 = null;
        net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat71);
        net.ajaskey.common.DateTime dateTime74 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double75 = dateTime72.getDeltaYears(dateTime74);
        net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean80 = dateTime74.isEqual(dateTime79);
        dateTime58.set(dateTime79);
        long long82 = dateTime43.getDeltaMilliSeconds(dateTime79);
        net.ajaskey.common.DateTime dateTime84 = new net.ajaskey.common.DateTime(100L);
        int int85 = dateTime84.getMs();
        net.ajaskey.common.DateTime dateTime89 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime91 = new net.ajaskey.common.DateTime(100L);
        double double92 = dateTime89.getDeltaYears(dateTime91);
        java.text.SimpleDateFormat simpleDateFormat93 = dateTime89.getSdf();
        boolean boolean94 = dateTime84.isLessThanOrEqual(dateTime89);
        int int95 = dateTime89.getDayOfYear();
        boolean boolean96 = dateTime89.isWeekday();
        boolean boolean97 = dateTime43.sameDate(dateTime89);
        java.util.Calendar calendar98 = dateTime43.getCal();
        dateTime1.set(calendar98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1972.041095890411d) + "'", double11 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 719795L + "'", long26 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1870) + "'", int34 == (-1870));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1969 + "'", int35 == 1969);
        org.junit.Assert.assertNotNull(calendar36);
        org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "                                                 100" + "'", str39, "                                                 100");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1972.041095890411d) + "'", double61 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 100 + "'", int85 == 100);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1972.041095890411d) + "'", double92 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 100 + "'", int95 == 100);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertNotNull(calendar98);
// flaky:         org.junit.Assert.assertEquals(calendar98.toString(), "java.util.GregorianCalendar[time=-62190310613596,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=43,SECOND=6,MILLISECOND=404,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0224");
        net.ajaskey.common.Utils.NL = "December";
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0225");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("Thu 10-Apr-0002 10:42:58", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Thu 10-Apr-0002 10:42:58 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0226");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) '#', (int) (short) 0, 0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0227");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Mon 10-Apr-0002 00:00:00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0228");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0229");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        java.text.SimpleDateFormat simpleDateFormat13 = null;
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat13);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        boolean boolean18 = dateTime14.isWeekday();
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long23 = dateTime14.getDeltaDays(dateTime22);
        long long24 = dateTime1.getDeltaDays(dateTime22);
        java.lang.String str25 = dateTime22.toFullString();
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat31 = null;
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat31);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double35 = dateTime32.getDeltaYears(dateTime34);
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean40 = dateTime34.isEqual(dateTime39);
        java.util.Calendar calendar41 = dateTime34.getCal();
        boolean boolean42 = dateTime29.isLessThan(dateTime34);
        dateTime29.setFirstWorkDay();
        net.ajaskey.common.DateTime dateTime44 = dateTime22.copy(dateTime29);
        java.lang.Class<?> wildcardClass45 = dateTime29.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 719795L + "'", long24 == 719795L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Thu 10-Apr-0002 10:43:07" + "'", str25, "Thu 10-Apr-0002 10:43:07");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(calendar41);
        org.junit.Assert.assertEquals(calendar41.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0230");
        net.ajaskey.common.Utils.NL = "Thu 10-Apr-0002 10:43:00";
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-36794L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0232");
        net.ajaskey.common.Utils.TAB = " 9";
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0233");
        net.ajaskey.common.Utils.NL = "                              10";
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0234");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0235");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("1,969.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0236");
        net.ajaskey.common.Utils.NL = "January                                 42                                 42                                                                                               52.00                                 42hi!                                 42";
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0237");
        net.ajaskey.common.Utils.NL = "     0";
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0238");
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0239");
        net.ajaskey.common.Utils.sleep(42);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0240");
        net.ajaskey.common.TextUtils.printline("Thu 10-Apr-0002 10:42:59");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0241");
        net.ajaskey.common.TextUtils.printline("11");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0242");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(264, 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          264" + "'", str2, "          264");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0243");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                           -1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0244");
        net.ajaskey.common.TextUtils.printline(" 9");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0245");
        net.ajaskey.common.Utils.makeDir("1,969.00");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0246");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("Sat 04-Jan-0100 17:00:00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Sat 04-Jan-0100 17:00:00 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0247");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                 42", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                  42 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0248");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0249");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(62190310613374L);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0250");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("          264", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0251");
        net.ajaskey.common.Utils.makeDir("JanuaryDecemberDecember                                                                                               52.00Decemberhi!December");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0252");
        net.ajaskey.common.Utils.TAB = "-1";
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0253");
        net.ajaskey.common.Utils.sleep((int) '#');
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0254");
        java.util.Date date0 = null;
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(date0);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(100L);
        double double8 = dateTime5.getDeltaYears(dateTime7);
        int int9 = dateTime5.getHour();
        java.text.SimpleDateFormat simpleDateFormat11 = null;
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat11);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double15 = dateTime12.getDeltaYears(dateTime14);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean20 = dateTime14.isEqual(dateTime19);
        java.util.Calendar calendar21 = dateTime14.getCal();
        dateTime5.set(calendar21);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(calendar21);
        net.ajaskey.common.DateTime dateTime24 = dateTime1.copy(dateTime23);
        java.lang.String str25 = dateTime1.format();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1972.041095890411d) + "'", double8 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "BAD-DATE-FORMAT" + "'", str25, "BAD-DATE-FORMAT");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0255");
        java.text.SimpleDateFormat simpleDateFormat2 = null;
        java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime("January", simpleDateFormat2, simpleDateFormat3);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime("100.00", simpleDateFormat2);
        java.lang.String str7 = dateTime5.format("");
        java.lang.Class<?> wildcardClass8 = dateTime5.getClass();
        org.junit.Assert.assertNotNull(simpleDateFormat3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "BAD-DATE-FORMAT" + "'", str7, "BAD-DATE-FORMAT");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0256");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        boolean boolean6 = dateTime2.isWeekday();
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long11 = dateTime2.getDeltaDays(dateTime10);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(dateTime2);
        java.lang.Class<?> wildcardClass13 = dateTime12.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0257");
        net.ajaskey.common.Utils.TAB = "Mon 06-Jan-0100 17:00:00";
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0258");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(1869, 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                        1,869" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                        1,869");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0259");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("Invalid fmt");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0260");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        java.text.SimpleDateFormat simpleDateFormat13 = null;
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat13);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        boolean boolean18 = dateTime14.isWeekday();
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long23 = dateTime14.getDeltaDays(dateTime22);
        long long24 = dateTime1.getDeltaDays(dateTime22);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        dateTime26.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean31 = dateTime26.isWeekday();
        int int32 = dateTime1.getYears(dateTime26);
        java.text.SimpleDateFormat simpleDateFormat34 = null;
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat34);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double38 = dateTime35.getDeltaYears(dateTime37);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean43 = dateTime37.isEqual(dateTime42);
        int int44 = dateTime37.getDayOfWeek();
        boolean boolean45 = dateTime26.isLessThan(dateTime37);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime(100L);
        java.util.Calendar calendar48 = dateTime47.getCal();
        java.text.SimpleDateFormat simpleDateFormat50 = null;
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat50);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double54 = dateTime51.getDeltaYears(dateTime53);
        boolean boolean55 = dateTime51.isWeekday();
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long60 = dateTime51.getDeltaDays(dateTime59);
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime(dateTime51);
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime(100L);
        double double68 = dateTime65.getDeltaYears(dateTime67);
        boolean boolean69 = dateTime67.isWeekday();
        java.util.Date date70 = dateTime67.getTime();
        dateTime51.set(date70);
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime(100L);
        int int74 = dateTime73.getMs();
        java.lang.String str75 = dateTime73.toString();
        boolean boolean76 = dateTime51.isLessThanOrEqual(dateTime73);
        net.ajaskey.common.DateTime dateTime79 = dateTime51.parse("", "100.00");
        dateTime51.add((int) (short) 0, (int) (short) -1);
        double double83 = dateTime47.getDeltaYears(dateTime51);
        net.ajaskey.common.DateTime dateTime85 = new net.ajaskey.common.DateTime(100L);
        java.util.Calendar calendar86 = dateTime85.getCal();
        dateTime51.set(calendar86);
        long long88 = dateTime37.getDeltaMilliSeconds(dateTime51);
        java.lang.Class<?> wildcardClass89 = dateTime51.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 719795L + "'", long24 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1870) + "'", int32 == (-1870));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(calendar48);
        org.junit.Assert.assertEquals(calendar48.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1972.041095890411d) + "'", double68 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "31-Dec-1969" + "'", str75, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(dateTime79);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertNotNull(calendar86);
        org.junit.Assert.assertEquals(calendar86.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 100L + "'", long88 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0261");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(25, 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       25" + "'", str2, "                       25");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0262");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 100, 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                          100" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                          100");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0263");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(42, 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                           42" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                           42");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0264");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                           -1.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0265");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        dateTime2.set((int) ' ', 0, 11);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("5.00", "     10");
        dateTime9.add((int) (short) 0, (int) 'a');
        int int13 = dateTime9.getDayOfMonth();
        java.lang.String str14 = dateTime9.toString();
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
        double double21 = dateTime18.getDeltaYears(dateTime20);
        int int22 = dateTime18.getHour();
        java.text.SimpleDateFormat simpleDateFormat24 = null;
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double28 = dateTime25.getDeltaYears(dateTime27);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean33 = dateTime27.isEqual(dateTime32);
        java.util.Calendar calendar34 = dateTime27.getCal();
        java.lang.String str35 = dateTime27.format();
        net.ajaskey.common.DateTime dateTime36 = null;
        long long37 = dateTime27.getDeltaDays(dateTime36);
        int int38 = dateTime27.getSecond();
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(100L);
        double double45 = dateTime42.getDeltaYears(dateTime44);
        java.text.SimpleDateFormat simpleDateFormat47 = null;
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat47);
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double51 = dateTime48.getDeltaYears(dateTime50);
        boolean boolean52 = dateTime48.isWeekday();
        boolean boolean53 = dateTime42.sameDate(dateTime48);
        int int54 = dateTime48.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime55 = dateTime27.copy(dateTime48);
        dateTime18.set(dateTime48);
        boolean boolean57 = dateTime9.isGreaterThan(dateTime48);
        boolean boolean58 = net.ajaskey.common.Utils.sameDate(dateTime2, dateTime48);
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime(100L);
        int int61 = dateTime60.getMs();
        java.lang.String str62 = dateTime60.toString();
        java.text.SimpleDateFormat simpleDateFormat64 = null;
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat64);
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double68 = dateTime65.getDeltaYears(dateTime67);
        boolean boolean69 = dateTime65.isWeekday();
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long74 = dateTime65.getDeltaDays(dateTime73);
        net.ajaskey.common.DateTime dateTime75 = new net.ajaskey.common.DateTime(dateTime65);
        net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime81 = new net.ajaskey.common.DateTime(100L);
        double double82 = dateTime79.getDeltaYears(dateTime81);
        boolean boolean83 = dateTime81.isWeekday();
        java.util.Date date84 = dateTime81.getTime();
        dateTime65.set(date84);
        net.ajaskey.common.DateTime dateTime87 = new net.ajaskey.common.DateTime(100L);
        int int88 = dateTime87.getMs();
        java.lang.String str89 = dateTime87.toString();
        boolean boolean90 = dateTime65.isLessThanOrEqual(dateTime87);
        boolean boolean91 = dateTime60.isLessThanOrEqual(dateTime87);
        boolean boolean92 = net.ajaskey.common.Utils.sameDate(dateTime48, dateTime60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(calendar34);
        org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "BAD-DATE-FORMAT" + "'", str35, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1972.041095890411d) + "'", double45 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "31-Dec-1969" + "'", str62, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1972.041095890411d) + "'", double82 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 100 + "'", int88 == 100);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "31-Dec-1969" + "'", str89, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0266");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 10:42:59", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0267");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        dateTime2.set((int) ' ', 0, 11);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("5.00", "     10");
        dateTime9.add((int) (short) 0, (int) 'a');
        int int13 = dateTime9.getDayOfMonth();
        java.lang.String str14 = dateTime9.toString();
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
        double double21 = dateTime18.getDeltaYears(dateTime20);
        int int22 = dateTime18.getHour();
        java.text.SimpleDateFormat simpleDateFormat24 = null;
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double28 = dateTime25.getDeltaYears(dateTime27);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean33 = dateTime27.isEqual(dateTime32);
        java.util.Calendar calendar34 = dateTime27.getCal();
        java.lang.String str35 = dateTime27.format();
        net.ajaskey.common.DateTime dateTime36 = null;
        long long37 = dateTime27.getDeltaDays(dateTime36);
        int int38 = dateTime27.getSecond();
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(100L);
        double double45 = dateTime42.getDeltaYears(dateTime44);
        java.text.SimpleDateFormat simpleDateFormat47 = null;
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat47);
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double51 = dateTime48.getDeltaYears(dateTime50);
        boolean boolean52 = dateTime48.isWeekday();
        boolean boolean53 = dateTime42.sameDate(dateTime48);
        int int54 = dateTime48.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime55 = dateTime27.copy(dateTime48);
        dateTime18.set(dateTime48);
        boolean boolean57 = dateTime9.isGreaterThan(dateTime48);
        boolean boolean58 = net.ajaskey.common.Utils.sameDate(dateTime2, dateTime48);
        boolean boolean59 = dateTime48.isWeekday();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(calendar34);
        org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "BAD-DATE-FORMAT" + "'", str35, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1972.041095890411d) + "'", double45 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0268");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        java.lang.String str12 = dateTime6.toString();
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(100L);
        int int15 = dateTime14.getMs();
        int int16 = dateTime14.getHour();
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat22 = null;
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat22);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double26 = dateTime23.getDeltaYears(dateTime25);
        boolean boolean27 = dateTime20.isLessThan(dateTime25);
        java.lang.String str28 = dateTime25.toFullString();
        dateTime25.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat33 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat35 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat36 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime("", simpleDateFormat35, simpleDateFormat36);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat33, simpleDateFormat36);
        boolean boolean39 = dateTime25.isGreaterThan(dateTime38);
        boolean boolean40 = dateTime14.isEqual(dateTime25);
        net.ajaskey.common.DateTime dateTime41 = null;
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(dateTime41);
        dateTime42.set(42, 10, 10);
        java.util.Date date47 = dateTime42.getTime();
        net.ajaskey.common.DateTime dateTime48 = dateTime14.copy(dateTime42);
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(100L);
        int int51 = dateTime50.getMs();
        int int52 = dateTime50.getHour();
        double double53 = dateTime42.getDeltaYears(dateTime50);
        boolean boolean54 = net.ajaskey.common.Utils.sameMonth(dateTime6, dateTime50);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime(100L);
        dateTime56.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str61 = dateTime56.getMonth();
        int int62 = dateTime56.getMs();
        java.lang.String str64 = dateTime56.format("                                                                                               52.00");
        int int65 = dateTime56.getDayOfMonth();
        long long66 = dateTime6.getDeltaDays(dateTime56);
        int int67 = dateTime6.getMs();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-Apr-0002" + "'", str12, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str28, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat33);
        org.junit.Assert.assertNotNull(simpleDateFormat35);
        org.junit.Assert.assertNotNull(simpleDateFormat36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Sat Nov 10 10:43:09 MST 42");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1928.4246575342465d) + "'", double53 == (-1928.4246575342465d));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "January" + "'", str61, "January");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "                                                                                               52.00" + "'", str64, "                                                                                               52.00");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-36794L) + "'", long66 == (-36794L));
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 238 + "'", int67 == 238);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0269");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("                              -1", "          264");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0270");
        net.ajaskey.common.Utils.TAB = "January                                 42                                 42                                                                                               52.00                                 42hi!                                 42";
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0271");
        net.ajaskey.common.TextUtils.printline("Invalid Time");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0272");
        net.ajaskey.common.Utils.makeDir("    0");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0273");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 0, 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         0" + "'", str2, "                                         0");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0274");
        net.ajaskey.common.Utils.TAB = "                       25";
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0275");
        net.ajaskey.common.Utils.TAB = "                                                                                                                                                                                                                                                                                                                                                                          100";
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0276");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(25, 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    25" + "'", str2, "    25");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0277");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((-1.0d), 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  -1.00" + "'", str2, "  -1.00");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0278");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 10:42:59", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0279");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime(100L);
        int int3 = dateTime2.getMs();
        java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
        dateTime2.setSdf(simpleDateFormat4);
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat4);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) 53);
        boolean boolean9 = dateTime8.isWeekday();
        boolean boolean10 = dateTime6.sameDate(dateTime8);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        int int13 = dateTime12.getMs();
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        java.text.SimpleDateFormat simpleDateFormat21 = dateTime17.getSdf();
        boolean boolean22 = dateTime12.isLessThanOrEqual(dateTime17);
        java.text.SimpleDateFormat simpleDateFormat24 = null;
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double28 = dateTime25.getDeltaYears(dateTime27);
        boolean boolean29 = dateTime25.isWeekday();
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long34 = dateTime25.getDeltaDays(dateTime33);
        long long35 = dateTime12.getDeltaDays(dateTime33);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
        dateTime37.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean42 = dateTime37.isWeekday();
        int int43 = dateTime12.getYears(dateTime37);
        java.text.SimpleDateFormat simpleDateFormat45 = null;
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat45);
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double49 = dateTime46.getDeltaYears(dateTime48);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean54 = dateTime48.isEqual(dateTime53);
        int int55 = dateTime48.getDayOfWeek();
        boolean boolean56 = dateTime37.isLessThan(dateTime48);
        boolean boolean57 = dateTime6.isLessThanOrEqual(dateTime37);
        java.util.Date date58 = dateTime6.getTime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1972.041095890411d) + "'", double20 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 719795L + "'", long35 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1870) + "'", int43 == (-1870));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(date58);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0280");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                 100", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                  100 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0281");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Invalid fmt", "10-Apr-0002");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'A'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0282");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("June");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0283");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 10:42:54", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0284");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(25, 1, 0);
        boolean boolean6 = net.ajaskey.common.Utils.sameMonth(dateTime1, dateTime5);
        int int7 = dateTime1.getSecond();
        java.lang.Class<?> wildcardClass8 = dateTime1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0285");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("Thursday");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0286");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("   42.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:    42.00 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0287");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("5.00", "     10");
        dateTime2.add((int) (short) 0, (int) 'a');
        int int6 = dateTime2.getDayOfMonth();
        boolean boolean7 = dateTime2.isNull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0288");
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime(100L);
        double double7 = dateTime4.getDeltaYears(dateTime6);
        int int8 = dateTime4.getHour();
        dateTime4.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat13 = null;
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat13);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        boolean boolean18 = dateTime4.isEqual(dateTime16);
        java.text.SimpleDateFormat simpleDateFormat20 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat22 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat23 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("", simpleDateFormat22, simpleDateFormat23);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat20, simpleDateFormat23);
        dateTime4.setSdf(simpleDateFormat20);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat33 = null;
        java.text.SimpleDateFormat simpleDateFormat34 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("January", simpleDateFormat33, simpleDateFormat34);
        java.text.SimpleDateFormat simpleDateFormat38 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime("January", simpleDateFormat38);
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime("", simpleDateFormat38);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime("", simpleDateFormat34, simpleDateFormat38);
        dateTime30.setSdf(simpleDateFormat34);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("December", simpleDateFormat20, simpleDateFormat34);
        java.lang.Class<?> wildcardClass44 = dateTime43.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1972.041095890411d) + "'", double7 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(simpleDateFormat20);
        org.junit.Assert.assertNotNull(simpleDateFormat22);
        org.junit.Assert.assertNotNull(simpleDateFormat23);
        org.junit.Assert.assertNotNull(simpleDateFormat34);
        org.junit.Assert.assertNotNull(simpleDateFormat38);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0289");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100" + "'", str2, "                                                                                              100");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0290");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(1L, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 1" + "'", str2, " 1");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0291");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("          264", "JanuaryBAD-DATE-FORMATBAD-DATE-FORMAT                                                                                               52.00BAD-DATE-FORMAThi!BAD-DATE-FORMAT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'J'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0292");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(4, 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           4" + "'", str2, "           4");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0293");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                                                                                                                                                                                                                                                                                        1,869");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0294");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("5.00", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0295");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1, 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 1.00" + "'", str2, " 1.00");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0296");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) 100, (int) (byte) 1, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime6 = dateTime3.parse("11", "Thursday");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateTime6.format();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTime6);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0297");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 252, 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 252" + "'", str2, " 252");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0298");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100" + "'", str2, "                                                                                              100");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0299");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        dateTime1.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime11.isWeekday();
        java.util.Date date14 = dateTime11.getTime();
        dateTime1.set(dateTime11);
        java.lang.String str16 = dateTime11.format();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "BAD-DATE-FORMAT" + "'", str16, "BAD-DATE-FORMAT");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0300");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0301");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-36794L), 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    -36,794" + "'", str2, "    -36,794");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0302");
        net.ajaskey.common.Utils.sleep((int) (short) 100);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0303");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 8, 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   8.00" + "'", str2, "   8.00");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0304");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                              100", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                               100 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0305");
        net.ajaskey.common.Utils.sleep((int) (short) -1);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0306");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (-1));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0307");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime9.isWeekday();
        boolean boolean14 = dateTime3.sameDate(dateTime9);
        java.text.SimpleDateFormat simpleDateFormat16 = null;
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean25 = dateTime19.isEqual(dateTime24);
        dateTime3.set(dateTime24);
        java.lang.String str27 = dateTime24.toString();
        net.ajaskey.common.DateTime dateTime28 = null;
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(dateTime28);
        boolean boolean30 = dateTime24.isGreaterThanOrEqual(dateTime29);
        java.util.Date date31 = dateTime24.getTime();
        java.lang.String str32 = dateTime24.getMonth();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-Apr-0002" + "'", str27, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Thu Apr 10 10:43:11 MST 2");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "April" + "'", str32, "April");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0308");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.TextUtils.print(strList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0309");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("         1", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0310");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 365, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0311");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-59011286399903L), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0312");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 100, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0313");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0314");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        boolean boolean7 = dateTime5.isWeekday();
        int int8 = dateTime5.getDayOfYear();
        int int9 = dateTime5.getSecond();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0315");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("           35", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0316");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(100.0d, 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     100.00" + "'", str2, "                                     100.00");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0317");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("January                                 42                                 42                                                                                               52.00                                 42hi!                                 42");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0318");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:59", "11");
        net.ajaskey.common.DateTime dateTime5 = dateTime2.parse("Thu 10-Apr-0002 10:43:04", "100.00");
        org.junit.Assert.assertNull(dateTime5);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0319");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        dateTime1.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime11.isWeekday();
        java.util.Date date14 = dateTime11.getTime();
        dateTime1.set(dateTime11);
        java.lang.Class<?> wildcardClass16 = dateTime1.getClass();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0320");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        dateTime1.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean6 = dateTime1.isWeekday();
        int int7 = dateTime1.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0321");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("12", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 12 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0322");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 10:43:11", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0323");
        net.ajaskey.common.Utils.NL = "                                         0";
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0324");
        net.ajaskey.common.Utils.sleep(2020);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0325");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("5.00", "     10");
        dateTime2.add((int) (short) 0, (int) 'a');
        int int6 = dateTime2.getDayOfMonth();
        java.lang.String str7 = dateTime2.toString();
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
        double double14 = dateTime11.getDeltaYears(dateTime13);
        int int15 = dateTime11.getHour();
        java.text.SimpleDateFormat simpleDateFormat17 = null;
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat17);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double21 = dateTime18.getDeltaYears(dateTime20);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean26 = dateTime20.isEqual(dateTime25);
        java.util.Calendar calendar27 = dateTime20.getCal();
        java.lang.String str28 = dateTime20.format();
        net.ajaskey.common.DateTime dateTime29 = null;
        long long30 = dateTime20.getDeltaDays(dateTime29);
        int int31 = dateTime20.getSecond();
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
        double double38 = dateTime35.getDeltaYears(dateTime37);
        java.text.SimpleDateFormat simpleDateFormat40 = null;
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat40);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double44 = dateTime41.getDeltaYears(dateTime43);
        boolean boolean45 = dateTime41.isWeekday();
        boolean boolean46 = dateTime35.sameDate(dateTime41);
        int int47 = dateTime41.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime48 = dateTime20.copy(dateTime41);
        dateTime11.set(dateTime41);
        boolean boolean50 = dateTime2.isGreaterThan(dateTime41);
        net.ajaskey.common.DateTime dateTime53 = dateTime41.parse("Thu 10-Apr-0002 10:42:58", "          264");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(calendar27);
        org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "BAD-DATE-FORMAT" + "'", str28, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1972.041095890411d) + "'", double38 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(dateTime48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(dateTime53);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0326");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:58", "Invalid Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'I'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0327");
        net.ajaskey.common.Utils.NL = "  -1.00";
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0328");
        java.text.SimpleDateFormat simpleDateFormat1 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat1);
        int int3 = dateTime2.getDayOfYear();
        org.junit.Assert.assertNotNull(simpleDateFormat1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0329");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        java.lang.String str12 = dateTime6.toString();
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
        int int16 = dateTime15.getMs();
        java.text.SimpleDateFormat simpleDateFormat17 = net.ajaskey.common.Utils.sdf;
        dateTime15.setSdf(simpleDateFormat17);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat17);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((long) 53);
        boolean boolean22 = dateTime21.isWeekday();
        boolean boolean23 = dateTime19.sameDate(dateTime21);
        int int24 = dateTime6.getYears(dateTime19);
        int int25 = dateTime19.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10-Apr-0002" + "'", str12, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0330");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((-59011286399900L));
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(100L);
        int int4 = dateTime3.getMs();
        boolean boolean5 = dateTime3.isNull();
        java.util.Calendar calendar6 = dateTime3.getCal();
        int int7 = dateTime1.getYears(dateTime3);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
        int int10 = dateTime9.getMs();
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        java.text.SimpleDateFormat simpleDateFormat18 = dateTime14.getSdf();
        boolean boolean19 = dateTime9.isLessThanOrEqual(dateTime14);
        java.text.SimpleDateFormat simpleDateFormat21 = null;
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat21);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double25 = dateTime22.getDeltaYears(dateTime24);
        boolean boolean26 = dateTime22.isWeekday();
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long31 = dateTime22.getDeltaDays(dateTime30);
        long long32 = dateTime9.getDeltaDays(dateTime30);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
        dateTime34.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean39 = dateTime34.isWeekday();
        int int40 = dateTime9.getYears(dateTime34);
        int int41 = dateTime9.getYear();
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(100L);
        int int44 = dateTime43.getMs();
        java.lang.String str45 = dateTime43.toString();
        int int46 = dateTime43.getDayOfYear();
        java.text.SimpleDateFormat simpleDateFormat48 = null;
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat48);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double52 = dateTime49.getDeltaYears(dateTime51);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean57 = dateTime51.isEqual(dateTime56);
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime(100L);
        int int60 = dateTime59.getMs();
        boolean boolean61 = dateTime56.isGreaterThanOrEqual(dateTime59);
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime(100L);
        dateTime63.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime(100L);
        double double74 = dateTime71.getDeltaYears(dateTime73);
        boolean boolean75 = dateTime73.isWeekday();
        java.util.Date date76 = dateTime73.getTime();
        dateTime63.set(dateTime73);
        boolean boolean78 = net.ajaskey.common.Utils.sameDate(dateTime56, dateTime63);
        dateTime56.add((int) '#', 6);
        boolean boolean82 = dateTime43.sameDate(dateTime56);
        net.ajaskey.common.DateTime dateTime83 = dateTime9.copy(dateTime43);
        int int84 = dateTime43.getYear();
        int int85 = dateTime43.getHour();
        boolean boolean86 = dateTime1.isGreaterThan(dateTime43);
        int int87 = dateTime43.getSecond();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(calendar6);
        org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1869 + "'", int7 == 1869);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1972.041095890411d) + "'", double17 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 719795L + "'", long32 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1870) + "'", int40 == (-1870));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1969 + "'", int41 == 1969);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "31-Dec-1969" + "'", str45, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 365 + "'", int46 == 365);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1972.041095890411d) + "'", double74 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1969 + "'", int84 == 1969);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 5 + "'", int85 == 5);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0331");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 252);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0332");
        net.ajaskey.common.Utils.sleep((int) (byte) 10);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0333");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        java.text.SimpleDateFormat simpleDateFormat13 = null;
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat13);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        boolean boolean18 = dateTime14.isWeekday();
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long23 = dateTime14.getDeltaDays(dateTime22);
        long long24 = dateTime1.getDeltaDays(dateTime22);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        dateTime26.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean31 = dateTime26.isWeekday();
        int int32 = dateTime1.getYears(dateTime26);
        java.text.SimpleDateFormat simpleDateFormat34 = null;
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat34);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double38 = dateTime35.getDeltaYears(dateTime37);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean43 = dateTime37.isEqual(dateTime42);
        int int44 = dateTime37.getDayOfWeek();
        boolean boolean45 = dateTime26.isLessThan(dateTime37);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime(100L);
        java.util.Calendar calendar48 = dateTime47.getCal();
        java.text.SimpleDateFormat simpleDateFormat50 = null;
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat50);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double54 = dateTime51.getDeltaYears(dateTime53);
        boolean boolean55 = dateTime51.isWeekday();
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long60 = dateTime51.getDeltaDays(dateTime59);
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime(dateTime51);
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime(100L);
        double double68 = dateTime65.getDeltaYears(dateTime67);
        boolean boolean69 = dateTime67.isWeekday();
        java.util.Date date70 = dateTime67.getTime();
        dateTime51.set(date70);
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime(100L);
        int int74 = dateTime73.getMs();
        java.lang.String str75 = dateTime73.toString();
        boolean boolean76 = dateTime51.isLessThanOrEqual(dateTime73);
        net.ajaskey.common.DateTime dateTime79 = dateTime51.parse("", "100.00");
        dateTime51.add((int) (short) 0, (int) (short) -1);
        double double83 = dateTime47.getDeltaYears(dateTime51);
        net.ajaskey.common.DateTime dateTime85 = new net.ajaskey.common.DateTime(100L);
        java.util.Calendar calendar86 = dateTime85.getCal();
        dateTime51.set(calendar86);
        long long88 = dateTime37.getDeltaMilliSeconds(dateTime51);
        int int89 = dateTime37.getDayOfWeek();
        java.lang.Class<?> wildcardClass90 = dateTime37.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 719795L + "'", long24 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1870) + "'", int32 == (-1870));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(calendar48);
        org.junit.Assert.assertEquals(calendar48.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1972.041095890411d) + "'", double68 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "31-Dec-1969" + "'", str75, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(dateTime79);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertNotNull(calendar86);
        org.junit.Assert.assertEquals(calendar86.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 100L + "'", long88 == 100L);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 4 + "'", int89 == 4);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0334");
        net.ajaskey.common.TextUtils.printline(" 1");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0335");
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime(100L);
        long long7 = dateTime4.getDeltaDays(dateTime6);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat14 = null;
        java.text.SimpleDateFormat simpleDateFormat15 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime("January", simpleDateFormat14, simpleDateFormat15);
        java.text.SimpleDateFormat simpleDateFormat19 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("January", simpleDateFormat19);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("", simpleDateFormat19);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("", simpleDateFormat15, simpleDateFormat19);
        dateTime11.setSdf(simpleDateFormat15);
        dateTime6.setSdf(simpleDateFormat15);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime(100L);
        double double33 = dateTime30.getDeltaYears(dateTime32);
        int int34 = dateTime30.getHour();
        dateTime30.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat39 = null;
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat39);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double43 = dateTime40.getDeltaYears(dateTime42);
        boolean boolean44 = dateTime30.isEqual(dateTime42);
        java.text.SimpleDateFormat simpleDateFormat46 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat48 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat49 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime("", simpleDateFormat48, simpleDateFormat49);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat46, simpleDateFormat49);
        dateTime30.setSdf(simpleDateFormat46);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat59 = null;
        java.text.SimpleDateFormat simpleDateFormat60 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime("January", simpleDateFormat59, simpleDateFormat60);
        java.text.SimpleDateFormat simpleDateFormat64 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime("January", simpleDateFormat64);
        net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime("", simpleDateFormat64);
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime("", simpleDateFormat60, simpleDateFormat64);
        dateTime56.setSdf(simpleDateFormat60);
        net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime("December", simpleDateFormat46, simpleDateFormat60);
        net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime(100L);
        int int72 = dateTime71.getMs();
        java.text.SimpleDateFormat simpleDateFormat73 = net.ajaskey.common.Utils.sdf;
        dateTime71.setSdf(simpleDateFormat73);
        int int75 = dateTime71.getDayOfWeek();
        java.text.SimpleDateFormat simpleDateFormat76 = dateTime71.getSdf();
        net.ajaskey.common.DateTime dateTime77 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:43:00", simpleDateFormat60, simpleDateFormat76);
        net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime("05-May-0005", simpleDateFormat15, simpleDateFormat60);
        int int79 = dateTime78.getMinute();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-719795L) + "'", long7 == (-719795L));
        org.junit.Assert.assertNotNull(simpleDateFormat15);
        org.junit.Assert.assertNotNull(simpleDateFormat19);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1972.041095890411d) + "'", double33 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(simpleDateFormat46);
        org.junit.Assert.assertNotNull(simpleDateFormat48);
        org.junit.Assert.assertNotNull(simpleDateFormat49);
        org.junit.Assert.assertNotNull(simpleDateFormat60);
        org.junit.Assert.assertNotNull(simpleDateFormat64);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 4 + "'", int75 == 4);
        org.junit.Assert.assertNotNull(simpleDateFormat76);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0336");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("JanuaryDecemberDecember                                                                                               52.00Decemberhi!December");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0337");
        net.ajaskey.common.Utils.NL = "100";
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0338");
        net.ajaskey.common.TextUtils.printline("January           35           35                                                                                               52.00           35hi!           35");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0339");
        net.ajaskey.common.Utils.sleep(1);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0340");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        java.text.SimpleDateFormat simpleDateFormat5 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat7 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat8 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("", simpleDateFormat7, simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat5, simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime("10-Apr-0002", simpleDateFormat8);
        java.text.SimpleDateFormat simpleDateFormat14 = null;
        java.text.SimpleDateFormat simpleDateFormat15 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime("January", simpleDateFormat14, simpleDateFormat15);
        java.text.SimpleDateFormat simpleDateFormat19 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("January", simpleDateFormat19);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("", simpleDateFormat19);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("", simpleDateFormat15, simpleDateFormat19);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("January                                                                                               52.00                                                                                               52.00                                                                                               52.00                                                                                               52.00hi!                                                                                               52.00", simpleDateFormat8, simpleDateFormat19);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("January", simpleDateFormat1, simpleDateFormat19);
        java.lang.Class<?> wildcardClass25 = simpleDateFormat19.getClass();
        org.junit.Assert.assertNotNull(simpleDateFormat5);
        org.junit.Assert.assertNotNull(simpleDateFormat7);
        org.junit.Assert.assertNotNull(simpleDateFormat8);
        org.junit.Assert.assertNotNull(simpleDateFormat15);
        org.junit.Assert.assertNotNull(simpleDateFormat19);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0341");
        java.util.Date date0 = null;
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(date0);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(100L);
        double double8 = dateTime5.getDeltaYears(dateTime7);
        int int9 = dateTime5.getHour();
        java.text.SimpleDateFormat simpleDateFormat11 = null;
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat11);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double15 = dateTime12.getDeltaYears(dateTime14);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean20 = dateTime14.isEqual(dateTime19);
        java.util.Calendar calendar21 = dateTime14.getCal();
        dateTime5.set(calendar21);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(calendar21);
        net.ajaskey.common.DateTime dateTime24 = dateTime1.copy(dateTime23);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(100L);
        double double31 = dateTime28.getDeltaYears(dateTime30);
        boolean boolean32 = dateTime30.isWeekday();
        int int33 = dateTime30.getDayOfYear();
        long long34 = dateTime24.getDeltaMilliSeconds(dateTime30);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime(100L);
        int int37 = dateTime36.getMs();
        java.lang.String str38 = dateTime36.toString();
        java.lang.String str40 = dateTime36.format("         1");
        long long41 = dateTime24.getDeltaDays(dateTime36);
        java.lang.Class<?> wildcardClass42 = dateTime24.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1972.041095890411d) + "'", double8 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1972.041095890411d) + "'", double31 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 365 + "'", int33 == 365);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "31-Dec-1969" + "'", str38, "31-Dec-1969");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "         1" + "'", str40, "         1");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0342");
        net.ajaskey.common.Utils.NL = " 252";
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0343");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        java.lang.String str3 = dateTime1.toString();
        int int4 = dateTime1.getDayOfYear();
        java.text.SimpleDateFormat simpleDateFormat6 = null;
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat6);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double10 = dateTime7.getDeltaYears(dateTime9);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean15 = dateTime9.isEqual(dateTime14);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
        int int18 = dateTime17.getMs();
        boolean boolean19 = dateTime14.isGreaterThanOrEqual(dateTime17);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        dateTime21.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        double double32 = dateTime29.getDeltaYears(dateTime31);
        boolean boolean33 = dateTime31.isWeekday();
        java.util.Date date34 = dateTime31.getTime();
        dateTime21.set(dateTime31);
        boolean boolean36 = net.ajaskey.common.Utils.sameDate(dateTime14, dateTime21);
        dateTime14.add((int) '#', 6);
        boolean boolean40 = dateTime1.sameDate(dateTime14);
        java.util.Date date41 = dateTime1.getTime();
        java.lang.Class<?> wildcardClass42 = date41.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1972.041095890411d) + "'", double32 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0344");
        net.ajaskey.common.Utils.TAB = "     0";
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0345");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 10:43:12", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0346");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("  -1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0347");
        net.ajaskey.common.TextUtils.printline("                                             719,795");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0348");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) (-1968));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0349");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("December");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0350");
        net.ajaskey.common.Utils.makeDir("                              -1");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0351");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("Thu 10-Apr-0002 10:42:54", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Thu 10-Apr-0002 10:42:54 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0352");
        net.ajaskey.common.Utils.NL = "Thu 10-Apr-0002 10:43:12";
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0353");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (short) 10);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0354");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '#', 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     35" + "'", str2, "     35");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0355");
        net.ajaskey.common.Utils.makeDir("100");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0356");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("January                                 42                                 42                                                                                               52.00                                 42hi!                                 42", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0357");
        net.ajaskey.common.TextUtils.printline("   8.00");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0358");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 10:43:03", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0359");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        dateTime1.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime11.isWeekday();
        java.util.Date date14 = dateTime11.getTime();
        dateTime1.set(dateTime11);
        int int16 = dateTime1.getYear();
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
        int int19 = dateTime18.getMs();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(100L);
        double double26 = dateTime23.getDeltaYears(dateTime25);
        java.text.SimpleDateFormat simpleDateFormat27 = dateTime23.getSdf();
        boolean boolean28 = dateTime18.isLessThanOrEqual(dateTime23);
        boolean boolean29 = dateTime23.isWeekday();
        boolean boolean30 = dateTime23.isWeekday();
        boolean boolean31 = dateTime1.sameDate(dateTime23);
        java.text.SimpleDateFormat simpleDateFormat33 = null;
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat33);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double37 = dateTime34.getDeltaYears(dateTime36);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean42 = dateTime36.isEqual(dateTime41);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(100L);
        int int45 = dateTime44.getMs();
        boolean boolean46 = dateTime41.isGreaterThanOrEqual(dateTime44);
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime(100L);
        dateTime48.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime(100L);
        double double59 = dateTime56.getDeltaYears(dateTime58);
        boolean boolean60 = dateTime58.isWeekday();
        java.util.Date date61 = dateTime58.getTime();
        dateTime48.set(dateTime58);
        boolean boolean63 = net.ajaskey.common.Utils.sameDate(dateTime41, dateTime48);
        java.lang.String str65 = dateTime48.format("                             100");
        int int66 = dateTime48.getDayOfWeek();
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime(100L);
        int int69 = dateTime68.getMs();
        java.lang.String str70 = dateTime68.toString();
        java.util.Date date71 = dateTime68.getTime();
        java.util.Date date72 = dateTime68.getTime();
        dateTime48.set(date72);
        dateTime1.set(date72);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1969 + "'", int16 == 1969);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1972.041095890411d) + "'", double26 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1972.041095890411d) + "'", double59 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "                             100" + "'", str65, "                             100");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 4 + "'", int66 == 4);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "31-Dec-1969" + "'", str70, "31-Dec-1969");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Wed Dec 31 17:00:00 MST 1969");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0360");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("100", "Thursday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'T'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0361");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        long long6 = dateTime3.getDeltaDays(dateTime5);
        int int7 = dateTime3.getHour();
        dateTime3.add((int) (byte) 100, (int) (byte) 0);
        net.ajaskey.common.DateTime dateTime12 = dateTime3.parse("10-Apr-0002");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dateTime12.getDayOfWeek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-719795L) + "'", long6 == (-719795L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(dateTime12);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0362");
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0363");
        net.ajaskey.common.Utils.TAB = "05-May-0005";
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0364");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               1" + "'", str2, "                               1");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0365");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        boolean boolean6 = dateTime4.isNull();
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
        dateTime9.set((int) ' ', 0, 11);
        boolean boolean14 = dateTime4.isGreaterThanOrEqual(dateTime9);
        java.lang.String str15 = dateTime4.toString();
        dateTime4.set((int) (byte) 100, 16, 2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-Dec-1969" + "'", str15, "31-Dec-1969");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0366");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("Thu 10-Apr-0002 10:43:16", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Thu 10-Apr-0002 10:43:16 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0367");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("Wednesday");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0368");
        net.ajaskey.common.Utils.TAB = "     5.00";
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0369");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        dateTime8.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str13 = dateTime8.getMonth();
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
        dateTime15.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str20 = dateTime15.getMonth();
        int int21 = dateTime15.getMs();
        net.ajaskey.common.DateTime dateTime22 = dateTime8.copy(dateTime15);
        dateTime6.set(dateTime8);
        boolean boolean24 = dateTime1.isGreaterThanOrEqual(dateTime8);
        net.ajaskey.common.DateTime dateTime26 = dateTime8.parse("                       25");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateTime26.isNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "January" + "'", str13, "January");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "January" + "'", str20, "January");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(dateTime26);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0370");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        int int7 = dateTime3.getHour();
        int int8 = dateTime3.getDayOfMonth();
        int int9 = dateTime3.getMinute();
        java.lang.String str10 = dateTime3.getMonth();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 43 + "'", int9 == 43);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "April" + "'", str10, "April");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0371");
        net.ajaskey.common.Utils.NL = "                                                                                                                                                                                                                                                                                                                                                                          100";
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0372");
        net.ajaskey.common.Utils.NL = "                              -1";
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0373");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        int int7 = dateTime3.getHour();
        dateTime3.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat12 = null;
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat12);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double16 = dateTime13.getDeltaYears(dateTime15);
        boolean boolean17 = dateTime3.isEqual(dateTime15);
        int int18 = dateTime3.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0374");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 53, 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  53" + "'", str2, "  53");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0375");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("Thu 10-Apr-0002 10:43:08");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0376");
        java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime("", simpleDateFormat2, simpleDateFormat3);
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime(100L);
        int int7 = dateTime6.getMs();
        java.text.SimpleDateFormat simpleDateFormat8 = net.ajaskey.common.Utils.sdf;
        dateTime6.setSdf(simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat3, simpleDateFormat8);
        java.text.SimpleDateFormat simpleDateFormat12 = null;
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat12);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double16 = dateTime13.getDeltaYears(dateTime15);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean21 = dateTime15.isEqual(dateTime20);
        java.util.Calendar calendar22 = dateTime15.getCal();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(calendar22);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(calendar22);
        boolean boolean25 = dateTime10.isGreaterThan(dateTime24);
        java.util.Date date26 = dateTime10.getTime();
        java.lang.String str27 = dateTime10.getDay();
        org.junit.Assert.assertNotNull(simpleDateFormat2);
        org.junit.Assert.assertNotNull(simpleDateFormat3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat8);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Wed Dec 31 00:00:00 MST 1969");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Wednesday" + "'", str27, "Wednesday");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0377");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        java.lang.String str3 = dateTime1.toString();
        int int4 = dateTime1.getDayOfYear();
        java.text.SimpleDateFormat simpleDateFormat6 = null;
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat6);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double10 = dateTime7.getDeltaYears(dateTime9);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean15 = dateTime9.isEqual(dateTime14);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
        int int18 = dateTime17.getMs();
        boolean boolean19 = dateTime14.isGreaterThanOrEqual(dateTime17);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        dateTime21.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        double double32 = dateTime29.getDeltaYears(dateTime31);
        boolean boolean33 = dateTime31.isWeekday();
        java.util.Date date34 = dateTime31.getTime();
        dateTime21.set(dateTime31);
        boolean boolean36 = net.ajaskey.common.Utils.sameDate(dateTime14, dateTime21);
        dateTime14.add((int) '#', 6);
        boolean boolean40 = dateTime1.sameDate(dateTime14);
        java.text.SimpleDateFormat simpleDateFormat42 = null;
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat42);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double46 = dateTime43.getDeltaYears(dateTime45);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime(dateTime43);
        boolean boolean48 = dateTime14.sameDate(dateTime47);
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(100L);
        int int51 = dateTime50.getMs();
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime(100L);
        double double58 = dateTime55.getDeltaYears(dateTime57);
        java.text.SimpleDateFormat simpleDateFormat59 = dateTime55.getSdf();
        boolean boolean60 = dateTime50.isLessThanOrEqual(dateTime55);
        int int61 = dateTime55.getDayOfYear();
        boolean boolean62 = dateTime47.isLessThan(dateTime55);
        java.text.SimpleDateFormat simpleDateFormat63 = dateTime55.getSdf();
        java.util.Calendar calendar64 = null;
        dateTime55.set(calendar64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1972.041095890411d) + "'", double32 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1972.041095890411d) + "'", double58 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(simpleDateFormat63);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0378");
        net.ajaskey.common.Utils.sleep(53);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0379");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
        int int8 = dateTime3.getHour();
        java.lang.String str10 = dateTime3.format("    0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "    0" + "'", str10, "    0");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0380");
        net.ajaskey.common.Utils.makeDir(" 1");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0381");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        boolean boolean18 = dateTime16.isWeekday();
        int int19 = dateTime16.getDayOfYear();
        net.ajaskey.common.DateTime dateTime20 = dateTime4.copy(dateTime16);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(dateTime16);
        int int22 = dateTime21.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1972.041095890411d) + "'", double17 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 365 + "'", int19 == 365);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0382");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0383");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("        10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0384");
        net.ajaskey.common.Utils.NL = "           4";
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0385");
        net.ajaskey.common.Utils.sleep(17);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0386");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                             100", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0387");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(62190310608217L, 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "62,190,310,608,217" + "'", str2, "62,190,310,608,217");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0388");
        net.ajaskey.common.TextUtils.printline("June");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0389");
        net.ajaskey.common.Utils.sleep(31);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0390");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0391");
        net.ajaskey.common.TextUtils.printline("                                                                                                   0");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0392");
        net.ajaskey.common.Utils.TAB = "Thu 10-Apr-0002 10:43:04";
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0393");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     0", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0394");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:43:16", "31-Dec-1969");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'e'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0395");
        net.ajaskey.common.Utils.sleep(262);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0396");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(62190310608217L);
        java.lang.Class<?> wildcardClass2 = dateTime1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0397");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        boolean boolean6 = dateTime2.isWeekday();
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long11 = dateTime2.getDeltaDays(dateTime10);
        dateTime10.set((int) (short) -1, (int) (byte) 0, (int) ' ');
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        double double22 = dateTime19.getDeltaYears(dateTime21);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(100L);
        double double29 = dateTime26.getDeltaYears(dateTime28);
        int int30 = dateTime26.getHour();
        int int31 = dateTime26.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
        double double38 = dateTime35.getDeltaYears(dateTime37);
        boolean boolean39 = dateTime37.isWeekday();
        boolean boolean40 = net.ajaskey.common.Utils.sameDate(dateTime26, dateTime37);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(100L);
        dateTime42.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime(100L);
        double double53 = dateTime50.getDeltaYears(dateTime52);
        boolean boolean54 = dateTime52.isWeekday();
        java.util.Date date55 = dateTime52.getTime();
        dateTime42.set(dateTime52);
        int int57 = dateTime42.getYear();
        boolean boolean58 = dateTime37.isGreaterThanOrEqual(dateTime42);
        boolean boolean59 = dateTime19.sameDate(dateTime37);
        boolean boolean60 = dateTime10.isLessThanOrEqual(dateTime19);
        boolean boolean61 = dateTime19.isWeekday();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1972.041095890411d) + "'", double22 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1972.041095890411d) + "'", double29 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1972.041095890411d) + "'", double38 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1972.041095890411d) + "'", double53 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1969 + "'", int57 == 1969);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0398");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0399");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        dateTime1.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime11.isWeekday();
        java.util.Date date14 = dateTime11.getTime();
        dateTime1.set(dateTime11);
        net.ajaskey.common.DateTime dateTime18 = dateTime1.parse("Thu 10-Apr-0002 10:42:54", "                             100");
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat24 = null;
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double28 = dateTime25.getDeltaYears(dateTime27);
        boolean boolean29 = dateTime22.isLessThan(dateTime27);
        java.lang.String str30 = dateTime27.toFullString();
        int int31 = dateTime27.getSecond();
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime(dateTime27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = dateTime18.isLessThanOrEqual(dateTime32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertNull(dateTime18);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str30, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0400");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 10:43:07", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0401");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 62190310608217L, 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     62,190,310,608,217.00" + "'", str2, "                     62,190,310,608,217.00");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0402");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("     0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0403");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("Thu 10-Apr-0002 10:43:11", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Thu 10-Apr-0002 10:43:11 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0404");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(42, 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      42" + "'", str2, "      42");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0405");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 31, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        31" + "'", str2, "        31");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0406");
        net.ajaskey.common.Utils.TAB = "                                                                                                   0";
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0407");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 8, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8" + "'", str2, "8");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0408");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime9.isWeekday();
        boolean boolean14 = dateTime3.sameDate(dateTime9);
        java.text.SimpleDateFormat simpleDateFormat16 = null;
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean25 = dateTime19.isEqual(dateTime24);
        dateTime3.set(dateTime24);
        java.lang.String str27 = dateTime24.toString();
        net.ajaskey.common.DateTime dateTime28 = null;
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(dateTime28);
        boolean boolean30 = dateTime24.isGreaterThanOrEqual(dateTime29);
        java.lang.Class<?> wildcardClass31 = dateTime29.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-Apr-0002" + "'", str27, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0409");
        net.ajaskey.common.Utils.TAB = "Thu 10-Apr-0002 10:42:54";
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0410");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(108, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             108" + "'", str2, "                             108");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0411");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0412");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 16, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16" + "'", str2, "16");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0413");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 31, 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  31" + "'", str2, "  31");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0414");
        net.ajaskey.common.Utils.sleep(264);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0415");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        boolean boolean11 = dateTime4.isNull();
        int int12 = dateTime4.getHour();
        java.lang.String str13 = dateTime4.getDay();
        int int14 = dateTime4.getDayOfYear();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Wednesday" + "'", str13, "Wednesday");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 365 + "'", int14 == 365);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0416");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(1965.9671232876713d, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            1,965.97" + "'", str2, "                                                                                            1,965.97");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0417");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        java.lang.String str3 = dateTime1.toString();
        dateTime1.set(25, (-1), (int) (short) 10);
        java.lang.String str8 = dateTime1.toString();
        net.ajaskey.common.DateTime dateTime10 = dateTime1.parse("JanuaryBAD-DATE-FORMATBAD-DATE-FORMAT                                                                                               52.00BAD-DATE-FORMAThi!BAD-DATE-FORMAT");
        java.text.SimpleDateFormat simpleDateFormat12 = null;
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat12);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double16 = dateTime13.getDeltaYears(dateTime15);
        boolean boolean17 = dateTime15.isNull();
        boolean boolean18 = dateTime15.isWeekday();
        int int19 = dateTime15.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = dateTime10.isGreaterThanOrEqual(dateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10-Dec-0024" + "'", str8, "10-Dec-0024");
        org.junit.Assert.assertNull(dateTime10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 365 + "'", int19 == 365);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0418");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     5.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0419");
        net.ajaskey.common.Utils.TAB = "           4";
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0420");
        java.util.Date date0 = null;
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(date0);
        net.ajaskey.common.DateTime dateTime3 = dateTime1.parse("Thu 10-Apr-0002 10:42:58");
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((long) (byte) 100);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(25, 1, 0);
        boolean boolean10 = net.ajaskey.common.Utils.sameMonth(dateTime5, dateTime9);
        int int11 = dateTime5.getSecond();
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
        int int14 = dateTime13.getMs();
        java.text.SimpleDateFormat simpleDateFormat15 = net.ajaskey.common.Utils.sdf;
        dateTime13.setSdf(simpleDateFormat15);
        net.ajaskey.common.DateTime dateTime17 = dateTime5.copy(dateTime13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = dateTime3.isGreaterThanOrEqual(dateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0421");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat5 = null;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean14 = dateTime8.isEqual(dateTime13);
        java.util.Calendar calendar15 = dateTime8.getCal();
        boolean boolean16 = dateTime3.isLessThan(dateTime8);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("BAD-DATE-FORMAT", "                                                                                               52.00");
        double double20 = dateTime8.getDeltaYears(dateTime19);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        double double27 = dateTime24.getDeltaYears(dateTime26);
        java.text.SimpleDateFormat simpleDateFormat29 = null;
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat29);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double33 = dateTime30.getDeltaYears(dateTime32);
        boolean boolean34 = dateTime30.isWeekday();
        boolean boolean35 = dateTime24.sameDate(dateTime30);
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime(100L);
        double double42 = dateTime39.getDeltaYears(dateTime41);
        java.text.SimpleDateFormat simpleDateFormat44 = null;
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat44);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double48 = dateTime45.getDeltaYears(dateTime47);
        boolean boolean49 = dateTime45.isWeekday();
        boolean boolean50 = dateTime39.sameDate(dateTime45);
        java.text.SimpleDateFormat simpleDateFormat52 = null;
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat52);
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double56 = dateTime53.getDeltaYears(dateTime55);
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean61 = dateTime55.isEqual(dateTime60);
        dateTime39.set(dateTime60);
        long long63 = dateTime24.getDeltaMilliSeconds(dateTime60);
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime(100L);
        int int66 = dateTime65.getMs();
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime(100L);
        double double73 = dateTime70.getDeltaYears(dateTime72);
        java.text.SimpleDateFormat simpleDateFormat74 = dateTime70.getSdf();
        boolean boolean75 = dateTime65.isLessThanOrEqual(dateTime70);
        int int76 = dateTime70.getDayOfYear();
        boolean boolean77 = dateTime70.isWeekday();
        boolean boolean78 = dateTime24.sameDate(dateTime70);
        int int79 = dateTime8.getYears(dateTime70);
        net.ajaskey.common.DateTime dateTime80 = new net.ajaskey.common.DateTime(dateTime70);
        dateTime70.set(18, 454, 25);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1972.041095890411d) + "'", double27 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1972.041095890411d) + "'", double42 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1972.041095890411d) + "'", double73 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1968) + "'", int79 == (-1968));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0422");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("10-Apr-0002", "    0");
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        dateTime8.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str13 = dateTime8.getMonth();
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
        dateTime15.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str20 = dateTime15.getMonth();
        int int21 = dateTime15.getMs();
        net.ajaskey.common.DateTime dateTime22 = dateTime8.copy(dateTime15);
        dateTime6.set(dateTime8);
        dateTime6.setFirstWorkDay();
        boolean boolean25 = net.ajaskey.common.Utils.sameMonth(dateTime2, dateTime6);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(100L);
        dateTime27.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str32 = dateTime27.getMonth();
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
        dateTime34.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str39 = dateTime34.getMonth();
        int int40 = dateTime34.getMs();
        net.ajaskey.common.DateTime dateTime41 = dateTime27.copy(dateTime34);
        boolean boolean42 = dateTime27.isWeekday();
        java.lang.String str43 = dateTime27.format();
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
        int int46 = dateTime45.getMs();
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime(100L);
        double double53 = dateTime50.getDeltaYears(dateTime52);
        java.text.SimpleDateFormat simpleDateFormat54 = dateTime50.getSdf();
        boolean boolean55 = dateTime45.isLessThanOrEqual(dateTime50);
        int int56 = dateTime50.getDayOfYear();
        boolean boolean57 = dateTime50.isWeekday();
        boolean boolean58 = dateTime27.isLessThan(dateTime50);
        boolean boolean59 = net.ajaskey.common.Utils.sameMonth(dateTime2, dateTime50);
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime(100L);
        double double66 = dateTime63.getDeltaYears(dateTime65);
        java.util.Date date67 = dateTime63.getTime();
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime(date67);
        net.ajaskey.common.DateTime dateTime71 = dateTime68.parse("31-Dec-1969", "January");
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime(100L);
        int int74 = dateTime73.getMs();
        java.lang.String str75 = dateTime73.toString();
        net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime81 = new net.ajaskey.common.DateTime(100L);
        double double82 = dateTime79.getDeltaYears(dateTime81);
        int int83 = dateTime79.getHour();
        int int84 = dateTime79.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime88 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime90 = new net.ajaskey.common.DateTime(100L);
        double double91 = dateTime88.getDeltaYears(dateTime90);
        boolean boolean92 = dateTime90.isWeekday();
        boolean boolean93 = net.ajaskey.common.Utils.sameDate(dateTime79, dateTime90);
        boolean boolean94 = net.ajaskey.common.Utils.sameDate(dateTime73, dateTime79);
        dateTime68.set(dateTime79);
        java.util.Calendar calendar96 = dateTime79.getCal();
        net.ajaskey.common.DateTime dateTime97 = new net.ajaskey.common.DateTime(calendar96);
        boolean boolean98 = net.ajaskey.common.Utils.sameMonth(dateTime50, dateTime97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "January" + "'", str13, "January");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "January" + "'", str20, "January");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "January" + "'", str32, "January");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "January" + "'", str39, "January");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "BAD-DATE-FORMAT" + "'", str43, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1972.041095890411d) + "'", double53 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1972.041095890411d) + "'", double66 == (-1972.041095890411d));
        org.junit.Assert.assertNotNull(date67);
// flaky:         org.junit.Assert.assertEquals(date67.toString(), "Thu Apr 10 10:43:21 MST 2");
        org.junit.Assert.assertNull(dateTime71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "31-Dec-1969" + "'", str75, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1972.041095890411d) + "'", double82 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 10 + "'", int83 == 10);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 10 + "'", int84 == 10);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1972.041095890411d) + "'", double91 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(calendar96);
// flaky:         org.junit.Assert.assertEquals(calendar96.toString(), "java.util.GregorianCalendar[time=-62190310598855,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=43,SECOND=21,MILLISECOND=145,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0423");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("10-Apr-0002", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 10-Apr-0002 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0424");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile(" 1.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0425");
        net.ajaskey.common.Utils.TAB = "8";
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0426");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("         1", "                                                                                                                                                                                                                                                                                                                                                                           42");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0427");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1.0f, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00" + "'", str2, "1.00");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0428");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        dateTime1.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime11.isWeekday();
        java.util.Date date14 = dateTime11.getTime();
        dateTime1.set(dateTime11);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat21 = null;
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat21);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double25 = dateTime22.getDeltaYears(dateTime24);
        boolean boolean26 = dateTime19.isLessThan(dateTime24);
        dateTime11.set(dateTime24);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
        double double34 = dateTime31.getDeltaYears(dateTime33);
        long long35 = dateTime11.getDeltaMilliSeconds(dateTime33);
        java.lang.Class<?> wildcardClass36 = dateTime11.getClass();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1972.041095890411d) + "'", double34 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0429");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (short) 0);
        int int2 = dateTime1.getHour();
        boolean boolean3 = dateTime1.isNull();
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime(dateTime1);
        java.lang.Class<?> wildcardClass5 = dateTime1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0430");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("BAD-DATE-FORMAT", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: BAD-DATE-FORMAT (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0431");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(1969, (int) (byte) 1, 0);
        int int4 = dateTime3.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0432");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(1969, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0433");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((-59011286399900L));
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(100L);
        int int4 = dateTime3.getMs();
        boolean boolean5 = dateTime3.isNull();
        java.util.Calendar calendar6 = dateTime3.getCal();
        int int7 = dateTime1.getYears(dateTime3);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
        int int10 = dateTime9.getMs();
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        java.text.SimpleDateFormat simpleDateFormat18 = dateTime14.getSdf();
        boolean boolean19 = dateTime9.isLessThanOrEqual(dateTime14);
        java.text.SimpleDateFormat simpleDateFormat21 = null;
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat21);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double25 = dateTime22.getDeltaYears(dateTime24);
        boolean boolean26 = dateTime22.isWeekday();
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long31 = dateTime22.getDeltaDays(dateTime30);
        long long32 = dateTime9.getDeltaDays(dateTime30);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
        dateTime34.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean39 = dateTime34.isWeekday();
        int int40 = dateTime9.getYears(dateTime34);
        int int41 = dateTime9.getYear();
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(100L);
        int int44 = dateTime43.getMs();
        java.lang.String str45 = dateTime43.toString();
        int int46 = dateTime43.getDayOfYear();
        java.text.SimpleDateFormat simpleDateFormat48 = null;
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat48);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double52 = dateTime49.getDeltaYears(dateTime51);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean57 = dateTime51.isEqual(dateTime56);
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime(100L);
        int int60 = dateTime59.getMs();
        boolean boolean61 = dateTime56.isGreaterThanOrEqual(dateTime59);
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime(100L);
        dateTime63.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime(100L);
        double double74 = dateTime71.getDeltaYears(dateTime73);
        boolean boolean75 = dateTime73.isWeekday();
        java.util.Date date76 = dateTime73.getTime();
        dateTime63.set(dateTime73);
        boolean boolean78 = net.ajaskey.common.Utils.sameDate(dateTime56, dateTime63);
        dateTime56.add((int) '#', 6);
        boolean boolean82 = dateTime43.sameDate(dateTime56);
        net.ajaskey.common.DateTime dateTime83 = dateTime9.copy(dateTime43);
        int int84 = dateTime43.getYear();
        int int85 = dateTime43.getHour();
        boolean boolean86 = dateTime1.isGreaterThan(dateTime43);
        net.ajaskey.common.DateTime dateTime89 = dateTime1.parse("Thu 10-Apr-0002 10:43:05", "");
        // The following exception was thrown during execution in test generation
        try {
            dateTime89.set(7, 18, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(calendar6);
        org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1869 + "'", int7 == 1869);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1972.041095890411d) + "'", double17 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 719795L + "'", long32 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1870) + "'", int40 == (-1870));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1969 + "'", int41 == 1969);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "31-Dec-1969" + "'", str45, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 365 + "'", int46 == 365);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1972.041095890411d) + "'", double74 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1969 + "'", int84 == 1969);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 5 + "'", int85 == 5);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(dateTime89);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0434");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 32, 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      32" + "'", str2, "      32");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0435");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("January                                                                                               52.00                                                                                               52.00                                                                                               52.00                                                                                               52.00hi!                                                                                               52.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0436");
        net.ajaskey.common.Utils.sleep(6);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0437");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("", "                                             719,795");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0438");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        java.lang.String str11 = dateTime9.getMonth();
        java.text.SimpleDateFormat simpleDateFormat16 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat17 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime("", simpleDateFormat16, simpleDateFormat17);
        java.text.SimpleDateFormat simpleDateFormat20 = null;
        java.text.SimpleDateFormat simpleDateFormat21 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("January", simpleDateFormat20, simpleDateFormat21);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat16, simpleDateFormat21);
        java.text.SimpleDateFormat simpleDateFormat26 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat27 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime("", simpleDateFormat26, simpleDateFormat27);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(100L);
        int int31 = dateTime30.getMs();
        java.text.SimpleDateFormat simpleDateFormat32 = net.ajaskey.common.Utils.sdf;
        dateTime30.setSdf(simpleDateFormat32);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat27, simpleDateFormat32);
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("                             100", simpleDateFormat21, simpleDateFormat27);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:58", simpleDateFormat21);
        boolean boolean37 = dateTime9.isLessThan(dateTime36);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(100L);
        long long44 = dateTime41.getDeltaDays(dateTime43);
        int int45 = dateTime41.getHour();
        dateTime41.add((int) (byte) 100, (int) (byte) 0);
        int int49 = dateTime41.getDayOfYear();
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime(100L);
        long long56 = dateTime53.getDeltaDays(dateTime55);
        int int57 = dateTime53.getHour();
        boolean boolean58 = dateTime41.isLessThan(dateTime53);
        boolean boolean59 = dateTime9.isLessThanOrEqual(dateTime53);
        boolean boolean60 = dateTime9.isWeekday();
        net.ajaskey.common.DateTime dateTime61 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = dateTime9.sameDate(dateTime61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "April" + "'", str11, "April");
        org.junit.Assert.assertNotNull(simpleDateFormat16);
        org.junit.Assert.assertNotNull(simpleDateFormat17);
        org.junit.Assert.assertNotNull(simpleDateFormat21);
        org.junit.Assert.assertNotNull(simpleDateFormat26);
        org.junit.Assert.assertNotNull(simpleDateFormat27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-719795L) + "'", long44 == (-719795L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-719795L) + "'", long56 == (-719795L));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0439");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat5 = null;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        boolean boolean10 = dateTime3.isLessThan(dateTime8);
        java.lang.String str11 = dateTime8.toFullString();
        int int12 = dateTime8.getSecond();
        java.lang.String str13 = dateTime8.toString();
        java.lang.String str14 = dateTime8.getMonth();
        java.lang.String str15 = dateTime8.toString();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str11, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31-Dec-1969" + "'", str13, "31-Dec-1969");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "December" + "'", str14, "December");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31-Dec-1969" + "'", str15, "31-Dec-1969");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0440");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean4 = dateTime3.isNull();
        java.lang.String str5 = dateTime3.getDay();
        java.lang.String str6 = dateTime3.getMonth();
        java.lang.String str7 = dateTime3.getDay();
        java.lang.String str8 = dateTime3.toFullString();
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime(100L);
        int int11 = dateTime10.getMs();
        java.lang.String str12 = dateTime10.toString();
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
        double double19 = dateTime16.getDeltaYears(dateTime18);
        int int20 = dateTime16.getHour();
        int int21 = dateTime16.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(100L);
        double double28 = dateTime25.getDeltaYears(dateTime27);
        boolean boolean29 = dateTime27.isWeekday();
        boolean boolean30 = net.ajaskey.common.Utils.sameDate(dateTime16, dateTime27);
        boolean boolean31 = net.ajaskey.common.Utils.sameDate(dateTime10, dateTime16);
        boolean boolean32 = net.ajaskey.common.Utils.sameMonth(dateTime3, dateTime16);
        java.lang.String str34 = dateTime3.format(" 9");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thursday" + "'", str5, "Thursday");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "April" + "'", str6, "April");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thursday" + "'", str7, "Thursday");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Thu 10-Apr-0002 10:43:22" + "'", str8, "Thu 10-Apr-0002 10:43:22");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "31-Dec-1969" + "'", str12, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1972.041095890411d) + "'", double28 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + " 9" + "'", str34, " 9");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0441");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:54", "December");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'e'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0442");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 262);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0443");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '#', 264);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                      35" + "'", str2, "                                                                                                                                                                                                                                                                      35");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0444");
        java.lang.String[] strArray5 = new java.lang.String[] { "           4", "           6" };
        java.util.List<java.io.File> fileList6 = net.ajaskey.common.Utils.getDirTree("                                 42", strArray5);
        java.util.List<java.io.File> fileList7 = net.ajaskey.common.Utils.getDirTree("", strArray5);
        java.util.List<java.io.File> fileList8 = net.ajaskey.common.Utils.getDirTree("                             100", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(fileList6);
        org.junit.Assert.assertNull(fileList7);
        org.junit.Assert.assertNull(fileList8);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0445");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        int int12 = dateTime1.getMinute();
        int int13 = dateTime1.getMinute();
        java.util.Date date14 = null;
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(date14);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        double double22 = dateTime19.getDeltaYears(dateTime21);
        int int23 = dateTime19.getHour();
        java.text.SimpleDateFormat simpleDateFormat25 = null;
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat25);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double29 = dateTime26.getDeltaYears(dateTime28);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean34 = dateTime28.isEqual(dateTime33);
        java.util.Calendar calendar35 = dateTime28.getCal();
        dateTime19.set(calendar35);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(calendar35);
        net.ajaskey.common.DateTime dateTime38 = dateTime15.copy(dateTime37);
        dateTime15.add((int) (byte) -1, (int) ' ');
        boolean boolean42 = dateTime1.isEqual(dateTime15);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(100L);
        int int45 = dateTime44.getMs();
        java.text.SimpleDateFormat simpleDateFormat46 = net.ajaskey.common.Utils.sdf;
        dateTime44.setSdf(simpleDateFormat46);
        boolean boolean48 = dateTime1.isEqual(dateTime44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1972.041095890411d) + "'", double22 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(calendar35);
        org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0446");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((-716608L));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0447");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                0" + "'", str2, "                0");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0448");
        net.ajaskey.common.Utils.makeDir("Thu 10-Apr-0002 10:43:10");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0449");
        net.ajaskey.common.Utils.TAB = "January           35           35                                                                                               52.00           35hi!           35";
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0450");
        net.ajaskey.common.TextUtils.printline("           6");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0451");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Invalid Time", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0452");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (short) 0);
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(100L);
        int int4 = dateTime3.getMs();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime(100L);
        double double11 = dateTime8.getDeltaYears(dateTime10);
        java.text.SimpleDateFormat simpleDateFormat12 = dateTime8.getSdf();
        boolean boolean13 = dateTime3.isLessThanOrEqual(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat15 = null;
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat15);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double19 = dateTime16.getDeltaYears(dateTime18);
        boolean boolean20 = dateTime16.isWeekday();
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long25 = dateTime16.getDeltaDays(dateTime24);
        long long26 = dateTime3.getDeltaDays(dateTime24);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(100L);
        dateTime28.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean33 = dateTime28.isWeekday();
        int int34 = dateTime3.getYears(dateTime28);
        int int35 = dateTime3.getYear();
        java.util.Calendar calendar36 = dateTime3.getCal();
        net.ajaskey.common.DateTime dateTime37 = dateTime1.copy(dateTime3);
        net.ajaskey.common.DateTime dateTime38 = null;
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime(dateTime38);
        java.lang.String str41 = dateTime39.format("     5.00");
        net.ajaskey.common.DateTime dateTime42 = null;
        long long43 = dateTime39.getDeltaDays(dateTime42);
        int int44 = dateTime39.getDayOfMonth();
        int int45 = dateTime39.getHour();
        boolean boolean46 = dateTime1.isEqual(dateTime39);
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) (short) 0);
        int int49 = dateTime48.getHour();
        boolean boolean50 = dateTime48.isNull();
        boolean boolean51 = dateTime39.sameDate(dateTime48);
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((-1870), 1969, 1);
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime("5.00", "     10");
        net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime(100L);
        double double65 = dateTime62.getDeltaYears(dateTime64);
        int int66 = dateTime62.getHour();
        java.text.SimpleDateFormat simpleDateFormat68 = null;
        net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat68);
        net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double72 = dateTime69.getDeltaYears(dateTime71);
        net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean77 = dateTime71.isEqual(dateTime76);
        java.util.Calendar calendar78 = dateTime71.getCal();
        dateTime62.set(calendar78);
        net.ajaskey.common.DateTime dateTime80 = new net.ajaskey.common.DateTime(calendar78);
        dateTime58.set(calendar78);
        net.ajaskey.common.DateTime dateTime83 = new net.ajaskey.common.DateTime(100L);
        int int84 = dateTime83.getMs();
        java.lang.String str85 = dateTime83.toString();
        java.lang.String str87 = dateTime83.format("         1");
        net.ajaskey.common.DateTime dateTime88 = dateTime58.copy(dateTime83);
        int int89 = dateTime55.getYears(dateTime88);
        boolean boolean90 = net.ajaskey.common.Utils.sameMonth(dateTime48, dateTime55);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1972.041095890411d) + "'", double11 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 719795L + "'", long26 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1870) + "'", int34 == (-1870));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1969 + "'", int35 == 1969);
        org.junit.Assert.assertNotNull(calendar36);
        org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "     5.00" + "'", str41, "     5.00");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 25 + "'", int44 == 25);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1972.041095890411d) + "'", double65 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(calendar78);
        org.junit.Assert.assertEquals(calendar78.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 100 + "'", int84 == 100);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "31-Dec-1969" + "'", str85, "31-Dec-1969");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "         1" + "'", str87, "         1");
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 262 + "'", int89 == 262);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0453");
        net.ajaskey.common.Utils.NL = "Thu 10-Apr-0002 10:43:11";
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0454");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0455");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        java.text.SimpleDateFormat simpleDateFormat13 = null;
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat13);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        boolean boolean18 = dateTime14.isWeekday();
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long23 = dateTime14.getDeltaDays(dateTime22);
        long long24 = dateTime1.getDeltaDays(dateTime22);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        dateTime26.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean31 = dateTime26.isWeekday();
        int int32 = dateTime1.getYears(dateTime26);
        java.text.SimpleDateFormat simpleDateFormat34 = null;
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat34);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double38 = dateTime35.getDeltaYears(dateTime37);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean43 = dateTime37.isEqual(dateTime42);
        int int44 = dateTime37.getDayOfWeek();
        boolean boolean45 = dateTime26.isLessThan(dateTime37);
        java.text.SimpleDateFormat simpleDateFormat46 = dateTime37.getSdf();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 719795L + "'", long24 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1870) + "'", int32 == (-1870));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(simpleDateFormat46);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0456");
        net.ajaskey.common.Utils.NL = "Thu 10-Apr-0002 10:43:09";
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0457");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("                     62,190,310,608,217.00", "Mon 06-Jan-0100 17:00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'o'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0458");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
        long long10 = dateTime7.getDeltaDays(dateTime9);
        int int11 = dateTime7.getHour();
        dateTime7.add((int) (byte) 100, (int) (byte) 0);
        double double15 = dateTime3.getDeltaYears(dateTime7);
        boolean boolean16 = dateTime7.isWeekday();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-719795L) + "'", long10 == (-719795L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0459");
        net.ajaskey.common.Utils.NL = "10-Apr-0002";
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0460");
        net.ajaskey.common.Utils.TAB = "June";
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0461");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(252, 264);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                     252" + "'", str2, "                                                                                                                                                                                                                                                                     252");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0462");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-18438L), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   -18,438" + "'", str2, "   -18,438");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0463");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        int int3 = dateTime1.getHour();
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat9 = null;
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat9);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double13 = dateTime10.getDeltaYears(dateTime12);
        boolean boolean14 = dateTime7.isLessThan(dateTime12);
        java.lang.String str15 = dateTime12.toFullString();
        dateTime12.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat20 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat22 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat23 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("", simpleDateFormat22, simpleDateFormat23);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat20, simpleDateFormat23);
        boolean boolean26 = dateTime12.isGreaterThan(dateTime25);
        boolean boolean27 = dateTime1.isEqual(dateTime12);
        net.ajaskey.common.DateTime dateTime28 = null;
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(dateTime28);
        dateTime29.set(42, 10, 10);
        java.util.Date date34 = dateTime29.getTime();
        net.ajaskey.common.DateTime dateTime35 = dateTime1.copy(dateTime29);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
        int int38 = dateTime37.getMs();
        int int39 = dateTime37.getHour();
        double double40 = dateTime29.getDeltaYears(dateTime37);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime((-1870), 1969, 1);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime("5.00", "     10");
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime(100L);
        double double54 = dateTime51.getDeltaYears(dateTime53);
        int int55 = dateTime51.getHour();
        java.text.SimpleDateFormat simpleDateFormat57 = null;
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat57);
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double61 = dateTime58.getDeltaYears(dateTime60);
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean66 = dateTime60.isEqual(dateTime65);
        java.util.Calendar calendar67 = dateTime60.getCal();
        dateTime51.set(calendar67);
        net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime(calendar67);
        dateTime47.set(calendar67);
        net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime(100L);
        int int73 = dateTime72.getMs();
        java.lang.String str74 = dateTime72.toString();
        java.lang.String str76 = dateTime72.format("         1");
        net.ajaskey.common.DateTime dateTime77 = dateTime47.copy(dateTime72);
        int int78 = dateTime44.getYears(dateTime77);
        net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime(dateTime44);
        long long80 = dateTime29.getDeltaMilliSeconds(dateTime44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str15, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat20);
        org.junit.Assert.assertNotNull(simpleDateFormat22);
        org.junit.Assert.assertNotNull(simpleDateFormat23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Sat Nov 10 10:43:23 MST 42");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1928.4246575342465d) + "'", double40 == (-1928.4246575342465d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1972.041095890411d) + "'", double54 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(calendar67);
        org.junit.Assert.assertEquals(calendar67.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "31-Dec-1969" + "'", str74, "31-Dec-1969");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "         1" + "'", str76, "         1");
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 262 + "'", int78 == 262);
// flaky:         org.junit.Assert.assertTrue("'" + long80 + "' != '" + (-55187049599999L) + "'", long80 == (-55187049599999L));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0464");
        net.ajaskey.common.Utils.NL = "1,969.00";
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0465");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                0.00" + "'", str2, "                                                                                                0.00");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0466");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        dateTime5.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str10 = dateTime5.getMonth();
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        dateTime12.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str17 = dateTime12.getMonth();
        int int18 = dateTime12.getMs();
        net.ajaskey.common.DateTime dateTime19 = dateTime5.copy(dateTime12);
        dateTime3.set(dateTime5);
        net.ajaskey.common.DateTime dateTime23 = dateTime3.parse("100.00", "     5.00");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dateTime23.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "January" + "'", str10, "January");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "January" + "'", str17, "January");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNull(dateTime23);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0467");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        int int7 = dateTime3.getHour();
        dateTime3.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat12 = null;
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat12);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double16 = dateTime13.getDeltaYears(dateTime15);
        boolean boolean17 = dateTime3.isEqual(dateTime15);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat23 = null;
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat23);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double27 = dateTime24.getDeltaYears(dateTime26);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean32 = dateTime26.isEqual(dateTime31);
        java.util.Calendar calendar33 = dateTime26.getCal();
        boolean boolean34 = dateTime21.isLessThan(dateTime26);
        dateTime21.setFirstWorkDay();
        boolean boolean36 = dateTime3.sameDate(dateTime21);
        net.ajaskey.common.DateTime dateTime37 = null;
        boolean boolean38 = net.ajaskey.common.Utils.sameMonth(dateTime3, dateTime37);
        java.text.SimpleDateFormat simpleDateFormat39 = dateTime3.getSdf();
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(dateTime3);
        java.lang.String str41 = dateTime3.toFullString();
        net.ajaskey.common.DateTime dateTime44 = dateTime3.parse("Thu 25-Jun-2020 10:43:17", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = dateTime44.format("                             108");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(calendar33);
        org.junit.Assert.assertEquals(calendar33.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(simpleDateFormat39);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Thu 10-Apr-0002 10:43:23" + "'", str41, "Thu 10-Apr-0002 10:43:23");
        org.junit.Assert.assertNull(dateTime44);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0468");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("JanuaryThursdayThursday                                                                                               52.00Thursdayhi!Thursday", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: JanuaryThursdayThursday                                                                                               52.00Thursdayhi!Thursday (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0469");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime9.isWeekday();
        boolean boolean14 = dateTime3.sameDate(dateTime9);
        java.text.SimpleDateFormat simpleDateFormat16 = null;
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean25 = dateTime19.isEqual(dateTime24);
        dateTime3.set(dateTime24);
        java.text.SimpleDateFormat simpleDateFormat28 = null;
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat28);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double32 = dateTime29.getDeltaYears(dateTime31);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean37 = dateTime31.isEqual(dateTime36);
        java.lang.String str38 = dateTime36.getDay();
        java.text.SimpleDateFormat simpleDateFormat41 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime("January", simpleDateFormat41);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("", simpleDateFormat41);
        dateTime43.setFirstWorkDay();
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat50 = null;
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat50);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double54 = dateTime51.getDeltaYears(dateTime53);
        boolean boolean55 = dateTime48.isLessThan(dateTime53);
        java.lang.String str56 = dateTime53.toFullString();
        dateTime53.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat61 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat63 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat64 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime("", simpleDateFormat63, simpleDateFormat64);
        net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat61, simpleDateFormat64);
        boolean boolean67 = dateTime53.isGreaterThan(dateTime66);
        java.text.SimpleDateFormat simpleDateFormat69 = null;
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat69);
        net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double73 = dateTime70.getDeltaYears(dateTime72);
        boolean boolean74 = dateTime70.isWeekday();
        net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long79 = dateTime70.getDeltaDays(dateTime78);
        net.ajaskey.common.DateTime dateTime80 = new net.ajaskey.common.DateTime(dateTime70);
        boolean boolean81 = dateTime66.sameDate(dateTime70);
        boolean boolean82 = dateTime43.isGreaterThan(dateTime70);
        long long83 = dateTime36.getDeltaDays(dateTime70);
        dateTime24.set(dateTime70);
        int int85 = dateTime70.getDayOfYear();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Thursday" + "'", str38, "Thursday");
        org.junit.Assert.assertNotNull(simpleDateFormat41);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str56, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat61);
        org.junit.Assert.assertNotNull(simpleDateFormat63);
        org.junit.Assert.assertNotNull(simpleDateFormat64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0470");
        java.text.SimpleDateFormat simpleDateFormat1 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime("", simpleDateFormat3, simpleDateFormat4);
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat1, simpleDateFormat4);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        dateTime8.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str13 = dateTime8.getMonth();
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
        dateTime15.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str20 = dateTime15.getMonth();
        int int21 = dateTime15.getMs();
        net.ajaskey.common.DateTime dateTime22 = dateTime8.copy(dateTime15);
        double double23 = dateTime6.getDeltaYears(dateTime8);
        java.lang.String str25 = dateTime8.format("                                         0");
        org.junit.Assert.assertNotNull(simpleDateFormat1);
        org.junit.Assert.assertNotNull(simpleDateFormat3);
        org.junit.Assert.assertNotNull(simpleDateFormat4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "January" + "'", str13, "January");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "January" + "'", str20, "January");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                                         0" + "'", str25, "                                         0");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0471");
        net.ajaskey.common.Utils.sleep(16);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0472");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) (-1870));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0473");
        net.ajaskey.common.Utils.NL = "Thu 10-Apr-0002 10:43:23";
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0474");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-716608L), 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-716,608.00" + "'", str2, "-716,608.00");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0475");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        java.text.SimpleDateFormat simpleDateFormat13 = null;
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat13);
        boolean boolean15 = dateTime6.isLessThanOrEqual(dateTime14);
        net.ajaskey.common.DateTime dateTime17 = dateTime14.parse("Sat 04-Jan-0100 17:00:00");
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean22 = dateTime21.isNull();
        java.lang.String str23 = dateTime21.getDay();
        java.lang.String str24 = dateTime21.getMonth();
        java.lang.String str25 = dateTime21.getDay();
        java.lang.String str26 = dateTime21.toFullString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateTime17.isEqual(dateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Thursday" + "'", str23, "Thursday");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "April" + "'", str24, "April");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Thursday" + "'", str25, "Thursday");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Thu 10-Apr-0002 10:43:24" + "'", str26, "Thu 10-Apr-0002 10:43:24");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0476");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime9.isWeekday();
        boolean boolean14 = dateTime3.sameDate(dateTime9);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
        double double21 = dateTime18.getDeltaYears(dateTime20);
        java.text.SimpleDateFormat simpleDateFormat23 = null;
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat23);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double27 = dateTime24.getDeltaYears(dateTime26);
        boolean boolean28 = dateTime24.isWeekday();
        boolean boolean29 = dateTime18.sameDate(dateTime24);
        java.text.SimpleDateFormat simpleDateFormat31 = null;
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat31);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double35 = dateTime32.getDeltaYears(dateTime34);
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean40 = dateTime34.isEqual(dateTime39);
        dateTime18.set(dateTime39);
        long long42 = dateTime3.getDeltaMilliSeconds(dateTime39);
        java.text.SimpleDateFormat simpleDateFormat43 = dateTime39.getSdf();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNull(simpleDateFormat43);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0477");
        net.ajaskey.common.TextUtils.printline("November");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0478");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (short) 0);
        int int2 = dateTime1.getHour();
        int int3 = dateTime1.getSecond();
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        int int6 = dateTime5.getMs();
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        double double13 = dateTime10.getDeltaYears(dateTime12);
        java.text.SimpleDateFormat simpleDateFormat14 = dateTime10.getSdf();
        boolean boolean15 = dateTime5.isLessThanOrEqual(dateTime10);
        java.text.SimpleDateFormat simpleDateFormat17 = null;
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat17);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double21 = dateTime18.getDeltaYears(dateTime20);
        boolean boolean22 = dateTime18.isWeekday();
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long27 = dateTime18.getDeltaDays(dateTime26);
        long long28 = dateTime5.getDeltaDays(dateTime26);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(100L);
        dateTime30.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean35 = dateTime30.isWeekday();
        int int36 = dateTime5.getYears(dateTime30);
        java.text.SimpleDateFormat simpleDateFormat38 = null;
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat38);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double42 = dateTime39.getDeltaYears(dateTime41);
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean47 = dateTime41.isEqual(dateTime46);
        int int48 = dateTime41.getDayOfWeek();
        boolean boolean49 = dateTime30.isLessThan(dateTime41);
        long long50 = dateTime1.getDeltaMilliSeconds(dateTime30);
        dateTime1.add(13, 12);
        net.ajaskey.common.DateTime dateTime55 = dateTime1.parse("Thu 25-Jun-2020 10:43:17");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1972.041095890411d) + "'", double13 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 719795L + "'", long28 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1870) + "'", int36 == (-1870));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-59011286399900L) + "'", long50 == (-59011286399900L));
        org.junit.Assert.assertNull(dateTime55);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0479");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        int int7 = dateTime3.getHour();
        java.text.SimpleDateFormat simpleDateFormat9 = null;
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat9);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double13 = dateTime10.getDeltaYears(dateTime12);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean18 = dateTime12.isEqual(dateTime17);
        java.util.Calendar calendar19 = dateTime12.getCal();
        dateTime3.set(calendar19);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(calendar19);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat27 = null;
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat27);
        boolean boolean29 = net.ajaskey.common.Utils.sameDate(dateTime25, dateTime28);
        boolean boolean30 = dateTime21.isGreaterThanOrEqual(dateTime25);
        int int31 = dateTime21.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 31 + "'", int31 == 31);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0480");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 1);
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(100L);
        int int4 = dateTime3.getMs();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime(100L);
        double double11 = dateTime8.getDeltaYears(dateTime10);
        java.text.SimpleDateFormat simpleDateFormat12 = dateTime8.getSdf();
        boolean boolean13 = dateTime3.isLessThanOrEqual(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat15 = null;
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat15);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double19 = dateTime16.getDeltaYears(dateTime18);
        boolean boolean20 = dateTime16.isWeekday();
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long25 = dateTime16.getDeltaDays(dateTime24);
        long long26 = dateTime3.getDeltaDays(dateTime24);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(100L);
        dateTime28.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean33 = dateTime28.isWeekday();
        int int34 = dateTime3.getYears(dateTime28);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(100L);
        double double41 = dateTime38.getDeltaYears(dateTime40);
        int int42 = dateTime38.getHour();
        java.text.SimpleDateFormat simpleDateFormat44 = null;
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat44);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double48 = dateTime45.getDeltaYears(dateTime47);
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean53 = dateTime47.isEqual(dateTime52);
        java.util.Calendar calendar54 = dateTime47.getCal();
        dateTime38.set(calendar54);
        dateTime3.set(calendar54);
        dateTime3.set(0, (int) (short) 0, 2);
        long long61 = dateTime1.getDeltaDays(dateTime3);
        java.text.SimpleDateFormat simpleDateFormat62 = dateTime1.getSdf();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1972.041095890411d) + "'", double11 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 719795L + "'", long26 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1870) + "'", int34 == (-1870));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1972.041095890411d) + "'", double41 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(calendar54);
        org.junit.Assert.assertEquals(calendar54.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 719528L + "'", long61 == 719528L);
        org.junit.Assert.assertNull(simpleDateFormat62);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0481");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                     62,190,310,608,217.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0482");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("     35", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:      35 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0483");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (short) 0);
        int int2 = dateTime1.getHour();
        int int3 = dateTime1.getSecond();
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        int int6 = dateTime5.getMs();
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        double double13 = dateTime10.getDeltaYears(dateTime12);
        java.text.SimpleDateFormat simpleDateFormat14 = dateTime10.getSdf();
        boolean boolean15 = dateTime5.isLessThanOrEqual(dateTime10);
        java.text.SimpleDateFormat simpleDateFormat17 = null;
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat17);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double21 = dateTime18.getDeltaYears(dateTime20);
        boolean boolean22 = dateTime18.isWeekday();
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long27 = dateTime18.getDeltaDays(dateTime26);
        long long28 = dateTime5.getDeltaDays(dateTime26);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(100L);
        dateTime30.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean35 = dateTime30.isWeekday();
        int int36 = dateTime5.getYears(dateTime30);
        java.text.SimpleDateFormat simpleDateFormat38 = null;
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat38);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double42 = dateTime39.getDeltaYears(dateTime41);
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean47 = dateTime41.isEqual(dateTime46);
        int int48 = dateTime41.getDayOfWeek();
        boolean boolean49 = dateTime30.isLessThan(dateTime41);
        long long50 = dateTime1.getDeltaMilliSeconds(dateTime30);
        dateTime1.add(13, 12);
        net.ajaskey.common.DateTime dateTime56 = dateTime1.parse("January           35           35                                                                                               52.00           35hi!           35", "JanuaryDecemberDecember                                                                                               52.00Decemberhi!December");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar57 = dateTime56.getCal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1972.041095890411d) + "'", double13 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 719795L + "'", long28 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1870) + "'", int36 == (-1870));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-59011286399900L) + "'", long50 == (-59011286399900L));
        org.junit.Assert.assertNull(dateTime56);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0484");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0485");
        net.ajaskey.common.Utils.TAB = "                                                                                               52.00";
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0486");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                     8.00", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0487");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        int int3 = dateTime1.getHour();
        int int4 = dateTime1.getDayOfYear();
        java.text.SimpleDateFormat simpleDateFormat6 = null;
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat6);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double10 = dateTime7.getDeltaYears(dateTime9);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean15 = dateTime9.isEqual(dateTime14);
        java.util.Calendar calendar16 = dateTime9.getCal();
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(calendar16);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(calendar16);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
        int int21 = dateTime20.getMs();
        java.text.SimpleDateFormat simpleDateFormat22 = net.ajaskey.common.Utils.sdf;
        dateTime20.setSdf(simpleDateFormat22);
        long long24 = dateTime18.getDeltaDays(dateTime20);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(100L);
        double double31 = dateTime28.getDeltaYears(dateTime30);
        int int32 = dateTime28.getHour();
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime(100L);
        double double39 = dateTime36.getDeltaYears(dateTime38);
        int int40 = dateTime36.getHour();
        dateTime36.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat45 = null;
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat45);
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double49 = dateTime46.getDeltaYears(dateTime48);
        boolean boolean50 = dateTime36.isEqual(dateTime48);
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat56 = null;
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat56);
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double60 = dateTime57.getDeltaYears(dateTime59);
        net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean65 = dateTime59.isEqual(dateTime64);
        java.util.Calendar calendar66 = dateTime59.getCal();
        boolean boolean67 = dateTime54.isLessThan(dateTime59);
        dateTime54.setFirstWorkDay();
        boolean boolean69 = dateTime36.sameDate(dateTime54);
        dateTime28.set(dateTime36);
        boolean boolean71 = dateTime18.isLessThanOrEqual(dateTime28);
        boolean boolean72 = dateTime1.isGreaterThan(dateTime18);
        int int73 = dateTime18.getSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1972.041095890411d) + "'", double31 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1972.041095890411d) + "'", double39 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(calendar66);
        org.junit.Assert.assertEquals(calendar66.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0488");
        net.ajaskey.common.TextUtils.printline("January                                 42                                 42                                                                                               52.00                                 42hi!                                 42");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0489");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        10.00" + "'", str2, "        10.00");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0490");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat5 = null;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        boolean boolean10 = dateTime3.isLessThan(dateTime8);
        int int11 = dateTime8.getDayOfYear();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 365 + "'", int11 == 365);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0491");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 1, 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     1" + "'", str2, "                                     1");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0492");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(5, 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     5" + "'", str2, "                                     5");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0493");
        net.ajaskey.common.TextUtils.printline("Thu 10-Apr-0002 10:43:09");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0494");
        net.ajaskey.common.Utils.TAB = "Thu 10-Apr-0002 10:42:58";
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0495");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        java.lang.String str3 = dateTime1.toString();
        int int4 = dateTime1.getMs();
        int int5 = dateTime1.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0496");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        java.lang.String str3 = dateTime1.toString();
        int int4 = dateTime1.getDayOfYear();
        java.text.SimpleDateFormat simpleDateFormat6 = null;
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat6);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double10 = dateTime7.getDeltaYears(dateTime9);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean15 = dateTime9.isEqual(dateTime14);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
        int int18 = dateTime17.getMs();
        boolean boolean19 = dateTime14.isGreaterThanOrEqual(dateTime17);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        dateTime21.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        double double32 = dateTime29.getDeltaYears(dateTime31);
        boolean boolean33 = dateTime31.isWeekday();
        java.util.Date date34 = dateTime31.getTime();
        dateTime21.set(dateTime31);
        boolean boolean36 = net.ajaskey.common.Utils.sameDate(dateTime14, dateTime21);
        dateTime14.add((int) '#', 6);
        boolean boolean40 = dateTime1.sameDate(dateTime14);
        java.text.SimpleDateFormat simpleDateFormat42 = null;
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat42);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double46 = dateTime43.getDeltaYears(dateTime45);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime(dateTime43);
        boolean boolean48 = dateTime14.sameDate(dateTime47);
        net.ajaskey.common.DateTime dateTime51 = dateTime47.parse("Thu 10-Apr-0002 10:42:58", "December");
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime(100L);
        int int54 = dateTime53.getMs();
        int int55 = dateTime53.getHour();
        java.text.SimpleDateFormat simpleDateFormat57 = null;
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat57);
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double61 = dateTime58.getDeltaYears(dateTime60);
        boolean boolean62 = dateTime58.isWeekday();
        net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long67 = dateTime58.getDeltaDays(dateTime66);
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime(dateTime58);
        boolean boolean69 = dateTime53.isLessThanOrEqual(dateTime68);
        java.lang.String str70 = dateTime53.getMonth();
        long long71 = dateTime47.getDeltaMilliSeconds(dateTime53);
        java.lang.Class<?> wildcardClass72 = dateTime47.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1972.041095890411d) + "'", double32 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "December" + "'", str70, "December");
// flaky:         org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1593103405162L) + "'", long71 == (-1593103405162L));
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0497");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        java.text.SimpleDateFormat simpleDateFormat13 = null;
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat13);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        boolean boolean18 = dateTime14.isWeekday();
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long23 = dateTime14.getDeltaDays(dateTime22);
        long long24 = dateTime1.getDeltaDays(dateTime22);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat30 = null;
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat30);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double34 = dateTime31.getDeltaYears(dateTime33);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean39 = dateTime33.isEqual(dateTime38);
        java.util.Calendar calendar40 = dateTime33.getCal();
        boolean boolean41 = dateTime28.isLessThan(dateTime33);
        boolean boolean42 = net.ajaskey.common.Utils.sameDate(dateTime1, dateTime28);
        java.lang.String str43 = dateTime28.format();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 719795L + "'", long24 == 719795L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(calendar40);
        org.junit.Assert.assertEquals(calendar40.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "BAD-DATE-FORMAT" + "'", str43, "BAD-DATE-FORMAT");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0498");
        net.ajaskey.common.Utils.sleep(15);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0499");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0500");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        boolean boolean6 = dateTime2.isWeekday();
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long11 = dateTime2.getDeltaDays(dateTime10);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(dateTime2);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
        double double19 = dateTime16.getDeltaYears(dateTime18);
        boolean boolean20 = dateTime18.isWeekday();
        java.util.Date date21 = dateTime18.getTime();
        dateTime2.set(date21);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(100L);
        int int25 = dateTime24.getMs();
        java.lang.String str26 = dateTime24.toString();
        boolean boolean27 = dateTime2.isLessThanOrEqual(dateTime24);
        int int28 = dateTime2.getHour();
        int int29 = dateTime2.getYear();
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(12, 42, (int) (byte) 1);
        java.util.Calendar calendar34 = dateTime33.getCal();
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime(calendar34);
        long long36 = dateTime2.getDeltaMilliSeconds(dateTime35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "31-Dec-1969" + "'", str26, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1969 + "'", int29 == 1969);
        org.junit.Assert.assertNotNull(calendar34);
// flaky:         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=-61678304194641,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=15,MONTH=6,WEEK_OF_YEAR=27,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=182,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=43,SECOND=25,MILLISECOND=359,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-61678304194741L) + "'", long36 == (-61678304194741L));
    }
}
