package net.ajaskey.common;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommonTests0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test001");
    int int0 = net.ajaskey.common.DateTime.THURSDAY;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
  }

  @Test
  public void test002() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test002");
    int int0 = net.ajaskey.common.DateTime.DECEMBER;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
  }

  @Test
  public void test003() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test003");
    net.ajaskey.common.DateTime dateTime0 = null;
    net.ajaskey.common.DateTime dateTime1 = null;
    boolean boolean2 = net.ajaskey.common.Utils.sameMonth(dateTime0, dateTime1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test004() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test004");
    net.ajaskey.common.Utils.TAB = "";
  }

  @Test
  public void test005() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test005");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '4', 100);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "                                                                                               52.00" + "'", str2,
        "                                                                                               52.00");
  }

  @Test
  public void test006() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test006");
    int int0 = net.ajaskey.common.DateTime.MONDAY;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
  }

  @Test
  public void test007() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test007");
    int int0 = net.ajaskey.common.DateTime.APRIL;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
  }

  @Test
  public void test008() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test008");
    java.io.File file0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile(file0, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test009() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test009");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test010() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test010");
    int int0 = net.ajaskey.common.DateTime.SATURDAY;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
  }

  @Test
  public void test011() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test011");
    int int0 = net.ajaskey.common.DateTime.JUNE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
  }

  @Test
  public void test012() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test012");
    int int0 = net.ajaskey.common.DateTime.NOVEMBER;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
  }

  @Test
  public void test013() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test013");
    int int0 = net.ajaskey.common.DateTime.JULY;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
  }

  @Test
  public void test014() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test014");
    int int0 = net.ajaskey.common.DateTime.DATE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
  }

  @Test
  public void test015() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test015");
    net.ajaskey.common.TextUtils.printline("                                                                                               52.00");
  }

  @Test
  public void test016() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test016");
    net.ajaskey.common.TextUtils textUtils0 = new net.ajaskey.common.TextUtils();
  }

  @Test
  public void test017() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test017");
    int int0 = net.ajaskey.common.DateTime.MINUTE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
  }

  @Test
  public void test018() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test018");
    java.lang.String str0 = net.ajaskey.common.Utils.TAB;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
  }

  @Test
  public void test019() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test019");
    int int0 = net.ajaskey.common.DateTime.WEDNESDAY;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
  }

  @Test
  public void test020() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test020");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("January", zipOutputStream1);
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: January (Access is denied)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test021() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test021");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test022() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test022");
    net.ajaskey.common.Utils.NL = "hi!";
  }

  @Test
  public void test023() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test023");
    net.ajaskey.common.Utils.makeDir("");
  }

  @Test
  public void test024() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test024");
    java.io.File file0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str1 = net.ajaskey.common.Utils.getFileBaseName(file0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test025() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test025");
    java.lang.String str0 = net.ajaskey.common.Utils.NL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hi!" + "'", str0, "hi!");
  }

  @Test
  public void test026() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test026");
    int int0 = net.ajaskey.common.DateTime.FEBRUARY;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test027() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test027");
    net.ajaskey.common.Utils.NL = "";
  }

  @Test
  public void test028() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test028");
    java.text.DecimalFormatSymbols decimalFormatSymbols0 = null;
    net.ajaskey.common.Utils.decimalFormatSymbols = decimalFormatSymbols0;
  }

  @Test
  public void test029() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test029");
    int int0 = net.ajaskey.common.DateTime.OCTOBER;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
  }

  @Test
  public void test030() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test030");
    java.text.DecimalFormatSymbols decimalFormatSymbols0 = net.ajaskey.common.Utils.decimalFormatSymbols;
    org.junit.Assert.assertNull(decimalFormatSymbols0);
  }

  @Test
  public void test031() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test031");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 3, 0);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
  }

  @Test
  public void test032() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test032");
    int int0 = net.ajaskey.common.DateTime.SEPTEMBER;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
  }

  @Test
  public void test033() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test033");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test034() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test034");
    int int0 = net.ajaskey.common.DateTime.SUNDAY;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test035() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test035");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("31-Dec-1969");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test036() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test036");
    int int0 = net.ajaskey.common.DateTime.YEAR;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test037() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test037");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Invalid fmt", true);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test038() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test038");
    int int0 = net.ajaskey.common.DateTime.FRIDAY;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
  }

  @Test
  public void test039() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test039");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) 'a', (int) (short) -1, 8);
  }

  @Test
  public void test040() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test040");
    net.ajaskey.common.Utils.NL = "31-Dec-1969";
  }

  @Test
  public void test041() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test041");
    int int0 = net.ajaskey.common.DateTime.TUESDAY;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
  }

  @Test
  public void test042() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test042");
    java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '4', 11);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         52" + "'", str2, "         52");
  }

  @Test
  public void test043() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test043");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10, 12);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       10.00" + "'", str2, "       10.00");
  }

  @Test
  public void test044() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test044");
    net.ajaskey.common.Utils.NL = "                                                                                               52.00";
  }

  @Test
  public void test045() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test045");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    java.lang.String str9 = dateTime5.toString();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    int int12 = dateTime11.getMs();
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
    double double19 = dateTime16.getDeltaYears(dateTime18);
    java.text.SimpleDateFormat simpleDateFormat20 = dateTime16.getSdf();
    boolean boolean21 = dateTime11.isLessThanOrEqual(dateTime16);
    boolean boolean22 = dateTime5.isLessThan(dateTime16);
    java.text.SimpleDateFormat simpleDateFormat24 = null;
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double28 = dateTime25.getDeltaYears(dateTime27);
    net.ajaskey.common.DateTime dateTime29 = net.ajaskey.common.DateTime.copy(dateTime25);
    // The following exception was thrown during execution in test generation
    try {
      dateTime16.set(dateTime25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-Dec-1969" + "'", str9, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    org.junit.Assert.assertNull(dateTime29);
  }

  @Test
  public void test046() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test046");
    net.ajaskey.common.Utils.NL = "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969";
  }

  @Test
  public void test047() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test047");
    net.ajaskey.common.Utils.TAB = "         52";
  }

  @Test
  public void test048() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test048");
    java.lang.String[] strArray6 = new java.lang.String[] { "UNKNOWN", "January", "hi!", "January", "Wed 31-Dec-1969 17:00:00", "       10.00" };
    java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
    java.lang.String str9 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList7);
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
        + "UNKNOWNJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969JanuaryJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969hi!January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969JanuaryJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969Wed 31-Dec-1969 17:00:00January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969       10.00January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969"
        + "'", str9,
        "UNKNOWNJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969JanuaryJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969hi!January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969JanuaryJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969Wed 31-Dec-1969 17:00:00January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969       10.00January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969");
  }

  @Test
  public void test049() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test049");
    int int0 = net.ajaskey.common.DateTime.MAY;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
  }

  @Test
  public void test050() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test050");
    net.ajaskey.common.Utils.sleep((int) (short) 10);
  }

  @Test
  public void test051() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test051");
    net.ajaskey.common.TextUtils.printline("hi!");
  }

  @Test
  public void test052() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test052");
    int int0 = net.ajaskey.common.DateTime.MONTH;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
  }

  @Test
  public void test053() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test053");
    net.ajaskey.common.Utils.sleep((int) (byte) -1);
  }

  @Test
  public void test054() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test054");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Wed 31-Dec-1969 17:00:00", false);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test055() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test055");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test056() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test056");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    dateTime1.setSdf(simpleDateFormat3);
    java.lang.String str5 = dateTime1.toFullString();
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(100L);
    int int8 = dateTime7.getMs();
    java.text.SimpleDateFormat simpleDateFormat9 = net.ajaskey.common.Utils.sdf;
    dateTime7.setSdf(simpleDateFormat9);
    java.lang.String str11 = dateTime7.toFullString();
    java.lang.String str12 = dateTime7.format();
    int int13 = dateTime1.getYears(dateTime7);
    java.text.SimpleDateFormat simpleDateFormat15 = null;
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat15);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double19 = dateTime16.getDeltaYears(dateTime18);
    boolean boolean20 = dateTime16.isWeekday();
    java.lang.String str21 = dateTime16.getDay();
    java.util.Calendar calendar22 = dateTime16.getCal();
    // The following exception was thrown during execution in test generation
    try {
      dateTime7.set(dateTime16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str5, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str11, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "31-Dec-1969" + "'", str12, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UNKNOWN" + "'", str21, "UNKNOWN");
    org.junit.Assert.assertNull(calendar22);
  }

  @Test
  public void test057() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test057");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("Invalid fmt");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test058() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test058");
    int int0 = net.ajaskey.common.DateTime.JANUARY;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
  }

  @Test
  public void test059() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test059");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    int int7 = dateTime1.getMs();
    java.lang.String str9 = dateTime1.format("                                                                                               52.00");
    java.lang.Class<?> wildcardClass10 = dateTime1.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "                                                                                               52.00" + "'", str9,
        "                                                                                               52.00");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test060() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test060");
    java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 7, (int) (short) 100);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "                                                                                                   7" + "'", str2,
        "                                                                                                   7");
  }

  @Test
  public void test061() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test061");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("         52", true);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test062() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test062");
    java.lang.String[] strArray4 = new java.lang.String[] { "January", "",
        "                                                                                               52.00", "hi!" };
    java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
    net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList5);
    net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList5);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test063() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test063");
    net.ajaskey.common.Utils.TAB = "       10.00";
  }

  @Test
  public void test064() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test064");
    int int0 = net.ajaskey.common.DateTime.HOUR;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
  }

  @Test
  public void test065() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test065");
    int int0 = net.ajaskey.common.DateTime.AUGUST;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
  }

  @Test
  public void test066() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test066");
    net.ajaskey.common.Utils.TAB = "31-Dec-1969";
  }

  @Test
  public void test067() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test067");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("Invalid fmt", false);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test068() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test068");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 365, 1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "365.00" + "'", str2, "365.00");
  }

  @Test
  public void test069() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test069");
    net.ajaskey.common.Utils.TAB = "UNKNOWN";
  }

  @Test
  public void test070() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test070");
    int int0 = net.ajaskey.common.DateTime.MARCH;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
  }

  @Test
  public void test071() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test071");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("hi!");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test072() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test072");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("Invalid fmt", zipOutputStream1);
      org.junit.Assert
          .fail("Expected exception of type java.io.FileNotFoundException; message: Invalid fmt (The system cannot find the file specified)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test073() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test073");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    dateTime11.set(0, 12, 0);
    boolean boolean17 = net.ajaskey.common.Utils.sameMonth(dateTime3, dateTime11);
    java.lang.String str18 = dateTime11.toFullString();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Fri 31-Dec-0001 17:00:00" + "'", str18, "Fri 31-Dec-0001 17:00:00");
  }

  @Test
  public void test074() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test074");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("365.00", false);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test075() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test075");
    net.ajaskey.common.DateTime dateTime0 = null;
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime(100L);
    double double7 = dateTime4.getDeltaYears(dateTime6);
    java.text.SimpleDateFormat simpleDateFormat9 = null;
    net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat9);
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double13 = dateTime10.getDeltaYears(dateTime12);
    boolean boolean14 = dateTime10.isWeekday();
    boolean boolean15 = dateTime4.sameDate(dateTime10);
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
    int int18 = dateTime17.getMs();
    java.text.SimpleDateFormat simpleDateFormat19 = net.ajaskey.common.Utils.sdf;
    dateTime17.setSdf(simpleDateFormat19);
    long long21 = dateTime4.getDeltaDays(dateTime17);
    boolean boolean22 = net.ajaskey.common.Utils.sameMonth(dateTime0, dateTime17);
    net.ajaskey.common.DateTime dateTime23 = net.ajaskey.common.DateTime.copy(dateTime0);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1972.041095890411d) + "'", double7 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat19);
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-719795L) + "'", long21 == (-719795L));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNull(dateTime23);
  }

  @Test
  public void test076() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test076");
    net.ajaskey.common.Utils.NL = "Fri 31-Dec-0001 17:00:00";
  }

  @Test
  public void test077() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test077");
    java.io.File file0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile(file0, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test078() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test078");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat1, simpleDateFormat2);
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
    double double10 = dateTime7.getDeltaYears(dateTime9);
    boolean boolean11 = dateTime9.isWeekday();
    java.util.Date date12 = dateTime9.getTime();
    java.lang.String str13 = dateTime9.toString();
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
    int int16 = dateTime15.getMs();
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
    double double23 = dateTime20.getDeltaYears(dateTime22);
    java.text.SimpleDateFormat simpleDateFormat24 = dateTime20.getSdf();
    boolean boolean25 = dateTime15.isLessThanOrEqual(dateTime20);
    boolean boolean26 = dateTime9.isLessThan(dateTime20);
    java.lang.String str27 = dateTime9.toString();
    long long28 = dateTime3.getDeltaMilliSeconds(dateTime9);
    net.ajaskey.common.DateTime dateTime31 = dateTime3
        .parse("                                                                                               52.00", "       10.00");
    org.junit.Assert.assertNotNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1972.041095890411d) + "'", double10 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(date12);
    org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31-Dec-1969" + "'", str13, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1972.041095890411d) + "'", double23 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "31-Dec-1969" + "'", str27, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    org.junit.Assert.assertNull(dateTime31);
  }

  @Test
  public void test079() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test079");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat1, simpleDateFormat2);
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
    double double10 = dateTime7.getDeltaYears(dateTime9);
    boolean boolean11 = dateTime9.isWeekday();
    java.util.Date date12 = dateTime9.getTime();
    java.lang.String str13 = dateTime9.toString();
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
    int int16 = dateTime15.getMs();
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
    double double23 = dateTime20.getDeltaYears(dateTime22);
    java.text.SimpleDateFormat simpleDateFormat24 = dateTime20.getSdf();
    boolean boolean25 = dateTime15.isLessThanOrEqual(dateTime20);
    boolean boolean26 = dateTime9.isLessThan(dateTime20);
    java.lang.String str27 = dateTime9.toString();
    long long28 = dateTime3.getDeltaMilliSeconds(dateTime9);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    boolean boolean36 = dateTime34.isWeekday();
    java.util.Date date37 = dateTime34.getTime();
    int int38 = dateTime34.getMinute();
    boolean boolean39 = dateTime3.sameDate(dateTime34);
    java.util.Calendar calendar40 = dateTime3.getCal();
    int int41 = dateTime3.getHour();
    org.junit.Assert.assertNotNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1972.041095890411d) + "'", double10 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(date12);
    org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31-Dec-1969" + "'", str13, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1972.041095890411d) + "'", double23 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "31-Dec-1969" + "'", str27, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertNotNull(date37);
    org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertNull(calendar40);
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
  }

  @Test
  public void test080() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test080");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    java.lang.String str9 = dateTime5.toString();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    int int12 = dateTime11.getMs();
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
    double double19 = dateTime16.getDeltaYears(dateTime18);
    java.text.SimpleDateFormat simpleDateFormat20 = dateTime16.getSdf();
    boolean boolean21 = dateTime11.isLessThanOrEqual(dateTime16);
    boolean boolean22 = dateTime5.isLessThan(dateTime16);
    java.lang.String str24 = dateTime5.format("Wed 31-Dec-1969 17:00:00");
    java.lang.Class<?> wildcardClass25 = dateTime5.getClass();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-Dec-1969" + "'", str9, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "BAD-DATE-FORMAT" + "'", str24, "BAD-DATE-FORMAT");
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test081() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test081");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("       10.00", zipOutputStream1);
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:        10.00 (Access is denied)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test082() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test082");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime6 = net.ajaskey.common.DateTime.copy(dateTime2);
    // The following exception was thrown during execution in test generation
    try {
      dateTime6.add(4, (-1968));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertNull(dateTime6);
  }

  @Test
  public void test083() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test083");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("       10.00");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test084() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test084");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (byte) 0);
  }

  @Test
  public void test085() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test085");
    int int0 = net.ajaskey.common.DateTime.SECOND;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
  }

  @Test
  public void test086() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test086");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("                                                                                                   7",
          zipOutputStream1);
      org.junit.Assert.fail(
          "Expected exception of type java.io.FileNotFoundException; message:                                                                                                    7 (The system cannot find the file specified)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test087() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test087");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 10, (int) (byte) 100);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "                                                                                               10.00" + "'", str2,
        "                                                                                               10.00");
  }

  @Test
  public void test088() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test088");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    net.ajaskey.common.DateTime dateTime18 = dateTime13.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime19 = net.ajaskey.common.DateTime.copy(dateTime13);
    boolean boolean20 = dateTime3.sameDate(dateTime19);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    double double27 = dateTime24.getDeltaYears(dateTime26);
    boolean boolean28 = dateTime19.isGreaterThan(dateTime24);
    dateTime19.set(100, 8, (int) (short) 100);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNull(dateTime18);
    org.junit.Assert.assertNotNull(dateTime19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1972.041095890411d) + "'", double27 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
  }

  @Test
  public void test089() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test089");
    net.ajaskey.common.Utils.sleep((int) (byte) 100);
  }

  @Test
  public void test090() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test090");
    java.io.File file0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile(file0, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test091() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test091");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (-1870));
  }

  @Test
  public void test092() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test092");
    java.io.File file0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile(file0, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test093() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test093");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("", zipOutputStream1);
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Result too large)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test094() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test094");
    java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat5 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("", simpleDateFormat4, simpleDateFormat5);
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat2, simpleDateFormat5);
    java.text.SimpleDateFormat simpleDateFormat8 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("", simpleDateFormat5, simpleDateFormat8);
    int int10 = dateTime9.getYear();
    org.junit.Assert.assertNotNull(simpleDateFormat2);
    org.junit.Assert.assertNotNull(simpleDateFormat4);
    org.junit.Assert.assertNotNull(simpleDateFormat5);
    org.junit.Assert.assertNotNull(simpleDateFormat8);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
  }

  @Test
  public void test095() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test095");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) '#', (int) (short) -1, 8);
  }

  @Test
  public void test096() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test096");
    java.io.File file0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str1 = net.ajaskey.common.Utils.getFileExt(file0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test097() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test097");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("Fri 31-Dec-0001 17:00:00", zipOutputStream1);
      org.junit.Assert.fail(
          "Expected exception of type java.io.FileNotFoundException; message: Fri 31-Dec-0001 17:00:00 (The filename, directory name, or volume label syntax is incorrect)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test098() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test098");
    net.ajaskey.common.Utils.NL = "Thu 10-Apr-0002 14:03:11";
  }

  @Test
  public void test099() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test099");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat2 = dateTime1.getSdf();
    dateTime1.set(0, 11, (int) (byte) -1);
    org.junit.Assert.assertNull(simpleDateFormat2);
  }

  @Test
  public void test100() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test100");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    int int7 = dateTime1.getMs();
    boolean boolean8 = dateTime1.isWeekday();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test101() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test101");
    net.ajaskey.common.Utils.sleep(0);
  }

  @Test
  public void test102() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test102");
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
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int29 = dateTime28.getDayOfWeek();
    double double30 = dateTime24.getDeltaYears(dateTime28);
    java.text.SimpleDateFormat simpleDateFormat31 = dateTime24.getSdf();
    int int32 = dateTime24.getHour();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1972.041095890411d) + "'", double30 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat31);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
  }

  @Test
  public void test103() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test103");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '#', 365);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
        + "                                                                                                                                                                                                                                                                                                                                                                        35.00"
        + "'", str2,
        "                                                                                                                                                                                                                                                                                                                                                                        35.00");
  }

  @Test
  public void test104() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test104");
    java.text.SimpleDateFormat simpleDateFormat1 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime("", simpleDateFormat1, simpleDateFormat2);
    java.lang.String str4 = dateTime3.toString();
    org.junit.Assert.assertNotNull(simpleDateFormat1);
    org.junit.Assert.assertNotNull(simpleDateFormat2);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
  }

  @Test
  public void test105() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test105");
    net.ajaskey.common.TextUtils.printline("31-Dec-1969");
  }

  @Test
  public void test106() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test106");
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Saturday", "Thu 10-Apr-0002 14:03:11");
  }

  @Test
  public void test107() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test107");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("hi!", false);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test108() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test108");
    java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 100, (int) (byte) -1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
  }

  @Test
  public void test109() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test109");
    int int0 = net.ajaskey.common.DateTime.MILLSECOND;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
  }

  @Test
  public void test110() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test110");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) (-1870));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test111() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test111");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    int int7 = dateTime3.getHour();
    boolean boolean8 = dateTime3.isWeekday();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
  }

  @Test
  public void test112() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test112");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test113() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test113");
    java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, 14);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             0" + "'", str2, "             0");
  }

  @Test
  public void test114() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test114");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    net.ajaskey.common.DateTime dateTime9 = dateTime3
        .parse("                                                                                               52.00", "BAD-DATE-FORMAT");
    java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat15 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat16 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("", simpleDateFormat15, simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat13,
        simpleDateFormat16);
    java.text.SimpleDateFormat simpleDateFormat20 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat21 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("", simpleDateFormat20, simpleDateFormat21);
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("", simpleDateFormat16, simpleDateFormat21);
    java.text.SimpleDateFormat simpleDateFormat26 = null;
    java.text.SimpleDateFormat simpleDateFormat27 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat26, simpleDateFormat27);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat27);
    net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat16, simpleDateFormat27);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int33 = dateTime32.getHour();
    int int34 = dateTime32.getDayOfMonth();
    int int35 = dateTime32.getYear();
    net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime(dateTime32);
    int int37 = dateTime30.getYears(dateTime36);
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean38 = dateTime9.isEqual(dateTime30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(dateTime9);
    org.junit.Assert.assertNotNull(simpleDateFormat13);
    org.junit.Assert.assertNotNull(simpleDateFormat15);
    org.junit.Assert.assertNotNull(simpleDateFormat16);
    org.junit.Assert.assertNotNull(simpleDateFormat20);
    org.junit.Assert.assertNotNull(simpleDateFormat21);
    org.junit.Assert.assertNotNull(simpleDateFormat27);
    org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
    org.junit.Assert.assertTrue("'" + int34 + "' != '" + 31 + "'", int34 == 31);
    org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1969 + "'", int35 == 1969);
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
  }

  @Test
  public void test115() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test115");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0L, (int) (short) 10);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      0.00" + "'", str2, "      0.00");
  }

  @Test
  public void test116() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test116");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    java.lang.String str9 = dateTime5.toString();
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(3, (int) '4', (int) (byte) 0);
    boolean boolean14 = dateTime5.isGreaterThan(dateTime13);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean25 = dateTime19.isEqual(dateTime24);
    java.util.Calendar calendar26 = dateTime19.getCal();
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(calendar26);
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(calendar26);
    boolean boolean29 = dateTime5.isLessThan(dateTime28);
    java.text.SimpleDateFormat simpleDateFormat31 = null;
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat31);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    boolean boolean36 = dateTime32.isWeekday();
    java.lang.String str37 = dateTime32.getDay();
    java.util.Calendar calendar38 = dateTime32.getCal();
    boolean boolean39 = dateTime5.isLessThan(dateTime32);
    java.text.SimpleDateFormat simpleDateFormat41 = null;
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat41);
    net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double45 = dateTime42.getDeltaYears(dateTime44);
    net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean50 = dateTime44.isEqual(dateTime49);
    boolean boolean51 = dateTime5.isGreaterThanOrEqual(dateTime49);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-Dec-1969" + "'", str9, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(calendar26);
    org.junit.Assert.assertEquals(calendar26.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UNKNOWN" + "'", str37, "UNKNOWN");
    org.junit.Assert.assertNull(calendar38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
  }

  @Test
  public void test117() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test117");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 'a', 6);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 97.00" + "'", str2, " 97.00");
  }

  @Test
  public void test118() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test118");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("Wednesday");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test119() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test119");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.lang.String str3 = dateTime1.toString();
    int int4 = dateTime1.getMs();
    java.util.Calendar calendar5 = dateTime1.getCal();
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime11.isWeekday();
    net.ajaskey.common.DateTime dateTime16 = dateTime11.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime17 = net.ajaskey.common.DateTime.copy(dateTime11);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
    dateTime19.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str24 = dateTime19.getMonth();
    int int25 = dateTime19.getMs();
    java.lang.String str27 = dateTime19
        .format("                                                                                               52.00");
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(100L);
    dateTime29.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str34 = dateTime29.getMonth();
    long long35 = dateTime19.getDeltaDays(dateTime29);
    boolean boolean36 = dateTime17.isGreaterThan(dateTime29);
    int int37 = dateTime1.getYears(dateTime29);
    net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(100L);
    double double44 = dateTime41.getDeltaYears(dateTime43);
    boolean boolean45 = dateTime43.isWeekday();
    java.util.Date date46 = dateTime43.getTime();
    int int47 = dateTime43.getMinute();
    java.text.SimpleDateFormat simpleDateFormat49 = null;
    net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat49);
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double53 = dateTime50.getDeltaYears(dateTime52);
    net.ajaskey.common.DateTime dateTime54 = net.ajaskey.common.DateTime.copy(dateTime50);
    boolean boolean55 = net.ajaskey.common.Utils.sameDate(dateTime43, dateTime50);
    java.text.SimpleDateFormat simpleDateFormat58 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat60 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat61 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime("", simpleDateFormat60, simpleDateFormat61);
    net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat58,
        simpleDateFormat61);
    java.text.SimpleDateFormat simpleDateFormat65 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat66 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime("", simpleDateFormat65, simpleDateFormat66);
    net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime("", simpleDateFormat61, simpleDateFormat66);
    dateTime43.setSdf(simpleDateFormat61);
    java.text.SimpleDateFormat simpleDateFormat73 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat75 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat76 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime77 = new net.ajaskey.common.DateTime("", simpleDateFormat75, simpleDateFormat76);
    net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat73,
        simpleDateFormat76);
    java.text.SimpleDateFormat simpleDateFormat80 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat81 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime82 = new net.ajaskey.common.DateTime("", simpleDateFormat80, simpleDateFormat81);
    net.ajaskey.common.DateTime dateTime83 = new net.ajaskey.common.DateTime("", simpleDateFormat76, simpleDateFormat81);
    java.text.SimpleDateFormat simpleDateFormat86 = null;
    java.text.SimpleDateFormat simpleDateFormat87 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime88 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat86, simpleDateFormat87);
    net.ajaskey.common.DateTime dateTime89 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat87);
    net.ajaskey.common.DateTime dateTime90 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat76, simpleDateFormat87);
    net.ajaskey.common.DateTime dateTime92 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int93 = dateTime92.getHour();
    int int94 = dateTime92.getDayOfMonth();
    int int95 = dateTime92.getYear();
    net.ajaskey.common.DateTime dateTime96 = new net.ajaskey.common.DateTime(dateTime92);
    int int97 = dateTime90.getYears(dateTime96);
    boolean boolean98 = dateTime43.isLessThan(dateTime96);
    long long99 = dateTime1.getDeltaMilliSeconds(dateTime43);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    org.junit.Assert.assertNotNull(calendar5);
    org.junit.Assert.assertEquals(calendar5.toString(),
        "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNull(dateTime16);
    org.junit.Assert.assertNotNull(dateTime17);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "January" + "'", str24, "January");
    org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    org.junit.Assert.assertEquals(
        "'" + str27 + "' != '" + "                                                                                               52.00" + "'", str27,
        "                                                                                               52.00");
    org.junit.Assert.assertEquals("'" + str34 + "' != '" + "January" + "'", str34, "January");
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1870) + "'", int37 == (-1870));
    org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1972.041095890411d) + "'", double44 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertNotNull(date46);
    org.junit.Assert.assertEquals(date46.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
    org.junit.Assert.assertNull(dateTime54);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat58);
    org.junit.Assert.assertNotNull(simpleDateFormat60);
    org.junit.Assert.assertNotNull(simpleDateFormat61);
    org.junit.Assert.assertNotNull(simpleDateFormat65);
    org.junit.Assert.assertNotNull(simpleDateFormat66);
    org.junit.Assert.assertNotNull(simpleDateFormat73);
    org.junit.Assert.assertNotNull(simpleDateFormat75);
    org.junit.Assert.assertNotNull(simpleDateFormat76);
    org.junit.Assert.assertNotNull(simpleDateFormat80);
    org.junit.Assert.assertNotNull(simpleDateFormat81);
    org.junit.Assert.assertNotNull(simpleDateFormat87);
    org.junit.Assert.assertTrue("'" + int93 + "' != '" + 5 + "'", int93 == 5);
    org.junit.Assert.assertTrue("'" + int94 + "' != '" + 31 + "'", int94 == 31);
    org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1969 + "'", int95 == 1969);
    org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    org.junit.Assert.assertTrue("'" + long99 + "' != '" + 0L + "'", long99 == 0L);
  }

  @Test
  public void test120() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test120");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime3 = net.ajaskey.common.DateTime.copy(dateTime2);
    org.junit.Assert.assertNull(dateTime3);
  }

  @Test
  public void test121() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test121");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    int int11 = dateTime4.getDayOfWeek();
    java.lang.String str12 = dateTime4.format();
    net.ajaskey.common.DateTime dateTime14 = dateTime4.parse("             0");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "BAD-DATE-FORMAT" + "'", str12, "BAD-DATE-FORMAT");
    org.junit.Assert.assertNull(dateTime14);
  }

  @Test
  public void test122() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test122");
    net.ajaskey.common.DateTime dateTime0 = new net.ajaskey.common.DateTime();
    java.text.SimpleDateFormat simpleDateFormat1 = dateTime0.getSdf();
    int int2 = dateTime0.getDayOfWeek();
    org.junit.Assert.assertNull(simpleDateFormat1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
  }

  @Test
  public void test123() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test123");
    java.lang.String str2 = net.ajaskey.common.Utils.lfmt(10L, 100);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "                                                                                                  10" + "'", str2,
        "                                                                                                  10");
  }

  @Test
  public void test124() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test124");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile(
          "                                                                                                                                                                                                                                                                                                                                                                        35.00",
          zipOutputStream1);
      org.junit.Assert.fail(
          "Expected exception of type java.io.FileNotFoundException; message:                                                                                                                                                                                                                                                                                                                                                                         35.00 (The filename, directory name, or volume label syntax is incorrect)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test125() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test125");
    net.ajaskey.common.DateTime dateTime0 = null;
    net.ajaskey.common.DateTime dateTime1 = net.ajaskey.common.DateTime.copy(dateTime0);
    org.junit.Assert.assertNull(dateTime1);
  }

  @Test
  public void test126() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test126");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime1.isLessThan(dateTime9);
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    net.ajaskey.common.DateTime dateTime21 = null;
    long long22 = dateTime17.getDeltaDays(dateTime21);
    boolean boolean23 = dateTime9.isLessThanOrEqual(dateTime17);
    java.text.SimpleDateFormat simpleDateFormat25 = null;
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat25);
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double29 = dateTime26.getDeltaYears(dateTime28);
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean34 = dateTime28.isEqual(dateTime33);
    java.util.Calendar calendar35 = dateTime28.getCal();
    dateTime17.set(calendar35);
    int int37 = dateTime17.getDayOfWeek();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1972.041095890411d) + "'", double20 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(calendar35);
    org.junit.Assert.assertEquals(calendar35.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
  }

  @Test
  public void test127() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test127");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1, 12);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        1.00" + "'", str2, "        1.00");
  }

  @Test
  public void test128() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test128");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.text.SimpleDateFormat simpleDateFormat12 = null;
    java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat12, simpleDateFormat13);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
    double double21 = dateTime18.getDeltaYears(dateTime20);
    boolean boolean22 = dateTime20.isWeekday();
    java.util.Date date23 = dateTime20.getTime();
    java.lang.String str24 = dateTime20.toString();
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    int int27 = dateTime26.getMs();
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
    double double34 = dateTime31.getDeltaYears(dateTime33);
    java.text.SimpleDateFormat simpleDateFormat35 = dateTime31.getSdf();
    boolean boolean36 = dateTime26.isLessThanOrEqual(dateTime31);
    boolean boolean37 = dateTime20.isLessThan(dateTime31);
    java.lang.String str38 = dateTime20.toString();
    long long39 = dateTime14.getDeltaMilliSeconds(dateTime20);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
    double double46 = dateTime43.getDeltaYears(dateTime45);
    boolean boolean47 = dateTime45.isWeekday();
    java.util.Date date48 = dateTime45.getTime();
    int int49 = dateTime45.getMinute();
    boolean boolean50 = dateTime14.sameDate(dateTime45);
    int int51 = dateTime4.getYears(dateTime45);
    java.text.SimpleDateFormat simpleDateFormat53 = null;
    net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat53);
    net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double57 = dateTime54.getDeltaYears(dateTime56);
    net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean62 = dateTime56.isEqual(dateTime61);
    java.util.Calendar calendar63 = dateTime56.getCal();
    long long64 = dateTime45.getDeltaDays(dateTime56);
    net.ajaskey.common.DateTime dateTime66 = dateTime56.parse("Thu 10-Apr-0002 14:03:11");
    net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime(100L);
    double double73 = dateTime70.getDeltaYears(dateTime72);
    boolean boolean74 = dateTime72.isWeekday();
    java.util.Date date75 = dateTime72.getTime();
    // The following exception was thrown during execution in test generation
    try {
      dateTime66.set(date75);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat13);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "31-Dec-1969" + "'", str24, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1972.041095890411d) + "'", double34 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "31-Dec-1969" + "'", str38, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    org.junit.Assert.assertNotNull(calendar63);
    org.junit.Assert.assertEquals(calendar63.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
    org.junit.Assert.assertNull(dateTime66);
    org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1972.041095890411d) + "'", double73 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    org.junit.Assert.assertNotNull(date75);
    org.junit.Assert.assertEquals(date75.toString(), "Wed Dec 31 17:00:00 MST 1969");
  }

  @Test
  public void test129() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test129");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.lang.String str3 = dateTime1.toString();
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int6 = dateTime5.getHour();
    int int7 = dateTime5.getDayOfMonth();
    dateTime1.set(dateTime5);
    int int9 = dateTime5.getMs();
    java.lang.String str10 = dateTime5.toFullString();
    java.lang.String str11 = dateTime5.toFullString();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str10, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str11, "Wed 31-Dec-1969 17:00:00");
  }

  @Test
  public void test130() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test130");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.lang.String str4 = dateTime1.format("Invalid fmt");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "BAD-DATE-FORMAT" + "'", str4, "BAD-DATE-FORMAT");
  }

  @Test
  public void test131() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test131");
    java.text.SimpleDateFormat simpleDateFormat1 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("January", simpleDateFormat1);
    java.lang.Class<?> wildcardClass3 = simpleDateFormat1.getClass();
    org.junit.Assert.assertNotNull(simpleDateFormat1);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test132() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test132");
    net.ajaskey.common.Utils.NL = "         52";
  }

  @Test
  public void test133() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test133");
    net.ajaskey.common.Utils.sleep((-1870));
  }

  @Test
  public void test134() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test134");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("365.00");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test135() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test135");
    net.ajaskey.common.Utils utils0 = new net.ajaskey.common.Utils();
  }

  @Test
  public void test136() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test136");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.lang.String str3 = dateTime1.toString();
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int6 = dateTime5.getHour();
    int int7 = dateTime5.getDayOfMonth();
    dateTime1.set(dateTime5);
    int int9 = dateTime5.getMs();
    java.lang.String str10 = dateTime5.toFullString();
    boolean boolean11 = dateTime5.isNull();
    net.ajaskey.common.DateTime dateTime12 = null;
    dateTime5.set(dateTime12);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str10, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test137() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test137");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    net.ajaskey.common.DateTime dateTime10 = dateTime5.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime11 = net.ajaskey.common.DateTime.copy(dateTime5);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    dateTime13.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str18 = dateTime13.getMonth();
    int int19 = dateTime13.getMs();
    java.lang.String str21 = dateTime13
        .format("                                                                                               52.00");
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
    dateTime23.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str28 = dateTime23.getMonth();
    long long29 = dateTime13.getDeltaDays(dateTime23);
    boolean boolean30 = dateTime11.isGreaterThan(dateTime23);
    dateTime23.add((int) (short) 10, 7);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(dateTime10);
    org.junit.Assert.assertNotNull(dateTime11);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "January" + "'", str18, "January");
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "                                                                                               52.00" + "'", str21,
        "                                                                                               52.00");
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "January" + "'", str28, "January");
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
  }

  @Test
  public void test138() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test138");
    java.lang.String str2 = net.ajaskey.common.Utils.lfmt(719795L, 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "719,795" + "'", str2, "719,795");
  }

  @Test
  public void test139() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test139");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.lang.String str3 = dateTime1.toString();
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int6 = dateTime5.getHour();
    int int7 = dateTime5.getDayOfMonth();
    dateTime1.set(dateTime5);
    int int9 = dateTime5.getMs();
    dateTime5.set((int) '4', 0, (int) (byte) -1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
  }

  @Test
  public void test140() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test140");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.util.Date date7 = dateTime3.getTime();
    java.lang.Class<?> wildcardClass8 = dateTime3.getClass();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Thu Apr 10 14:03:14 MST 2");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test141() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test141");
    net.ajaskey.common.Utils.makeDir("365.00");
  }

  @Test
  public void test142() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test142");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.lang.String str7 = dateTime3.toFullString();
    net.ajaskey.common.DateTime dateTime10 = dateTime3.parse("BAD-DATE-FORMAT", "Invalid fmt");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu 10-Apr-0002 14:03:14" + "'", str7, "Thu 10-Apr-0002 14:03:14");
    org.junit.Assert.assertNull(dateTime10);
  }

  @Test
  public void test143() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test143");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat1, simpleDateFormat2);
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
    double double10 = dateTime7.getDeltaYears(dateTime9);
    boolean boolean11 = dateTime9.isWeekday();
    java.util.Date date12 = dateTime9.getTime();
    java.lang.String str13 = dateTime9.toString();
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
    int int16 = dateTime15.getMs();
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
    double double23 = dateTime20.getDeltaYears(dateTime22);
    java.text.SimpleDateFormat simpleDateFormat24 = dateTime20.getSdf();
    boolean boolean25 = dateTime15.isLessThanOrEqual(dateTime20);
    boolean boolean26 = dateTime9.isLessThan(dateTime20);
    java.lang.String str27 = dateTime9.toString();
    long long28 = dateTime3.getDeltaMilliSeconds(dateTime9);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    boolean boolean36 = dateTime34.isWeekday();
    java.util.Date date37 = dateTime34.getTime();
    int int38 = dateTime34.getMinute();
    boolean boolean39 = dateTime3.sameDate(dateTime34);
    net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int42 = dateTime41.getHour();
    int int43 = dateTime41.getDayOfMonth();
    int int44 = dateTime41.getYear();
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(dateTime41);
    boolean boolean46 = net.ajaskey.common.Utils.sameDate(dateTime34, dateTime41);
    java.util.Calendar calendar47 = dateTime34.getCal();
    org.junit.Assert.assertNotNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1972.041095890411d) + "'", double10 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(date12);
    org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31-Dec-1969" + "'", str13, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1972.041095890411d) + "'", double23 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "31-Dec-1969" + "'", str27, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertNotNull(date37);
    org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
    org.junit.Assert.assertTrue("'" + int43 + "' != '" + 31 + "'", int43 == 31);
    org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1969 + "'", int44 == 1969);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    org.junit.Assert.assertNotNull(calendar47);
    org.junit.Assert.assertEquals(calendar47.toString(),
        "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
  }

  @Test
  public void test144() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test144");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    java.util.Calendar calendar13 = dateTime9.getCal();
    dateTime4.set(calendar13);
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=-62190298605448,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=14,MILLISECOND=552,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
  }

  @Test
  public void test145() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test145");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(9, (int) (short) 10, (int) 'a');
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
    double double10 = dateTime7.getDeltaYears(dateTime9);
    java.text.SimpleDateFormat simpleDateFormat12 = null;
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat12);
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double16 = dateTime13.getDeltaYears(dateTime15);
    boolean boolean17 = dateTime13.isWeekday();
    boolean boolean18 = dateTime7.sameDate(dateTime13);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(0L);
    boolean boolean21 = dateTime13.isGreaterThanOrEqual(dateTime20);
    // The following exception was thrown during execution in test generation
    try {
      dateTime3.set(dateTime13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1972.041095890411d) + "'", double10 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
  }

  @Test
  public void test146() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test146");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt(1.0d, 14);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          1.00" + "'", str2, "          1.00");
  }

  @Test
  public void test147() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test147");
    net.ajaskey.common.Utils.TAB = "Thu 10-Apr-0002 14:03:13";
  }

  @Test
  public void test148() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test148");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    dateTime2.set(9, 10, 5);
  }

  @Test
  public void test149() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test149");
    net.ajaskey.common.Utils.TAB = "BAD-DATE-FORMAT";
  }

  @Test
  public void test150() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test150");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("BAD-DATE-FORMAT");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test151() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test151");
    net.ajaskey.common.Utils.TAB = "719,795";
  }

  @Test
  public void test152() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test152");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    dateTime1.setSdf(simpleDateFormat3);
    java.lang.String str5 = dateTime1.toFullString();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime(dateTime1);
    net.ajaskey.common.DateTime dateTime9 = dateTime1.parse("365.00", "Thu 10-Apr-0002 14:03:14");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str5, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertNull(dateTime9);
  }

  @Test
  public void test153() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test153");
    java.lang.String[] strArray3 = new java.lang.String[] {
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969" };
    java.util.List<java.io.File> fileList4 = net.ajaskey.common.Utils.getDirTree("hi!", strArray3);
    java.util.List<java.io.File> fileList5 = net.ajaskey.common.Utils.getDirTree(
        "UNKNOWNJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969JanuaryJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969hi!January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969JanuaryJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969Wed 31-Dec-1969 17:00:00January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969       10.00January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        strArray3);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertNull(fileList4);
    org.junit.Assert.assertNull(fileList5);
  }

  @Test
  public void test154() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test154");
    java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-62190298606387L), 100);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "                                                                                 -62,190,298,606,387" + "'", str2,
        "                                                                                 -62,190,298,606,387");
  }

  @Test
  public void test155() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test155");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 11, 0);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
  }

  @Test
  public void test156() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test156");
    net.ajaskey.common.Utils.makeDir(
        "UNKNOWNJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969JanuaryJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969hi!January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969JanuaryJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969Wed 31-Dec-1969 17:00:00January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969       10.00January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969");
  }

  @Test
  public void test157() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test157");
    net.ajaskey.common.DateTime dateTime0 = null;
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(dateTime0);
    java.lang.String str2 = dateTime1.getDay();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Thursday" + "'", str2, "Thursday");
  }

  @Test
  public void test158() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test158");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.lang.String str3 = dateTime1.toString();
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
    double double10 = dateTime7.getDeltaYears(dateTime9);
    java.text.SimpleDateFormat simpleDateFormat12 = null;
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat12);
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double16 = dateTime13.getDeltaYears(dateTime15);
    boolean boolean17 = dateTime13.isWeekday();
    boolean boolean18 = dateTime7.sameDate(dateTime13);
    java.text.SimpleDateFormat simpleDateFormat20 = null;
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat20);
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double24 = dateTime21.getDeltaYears(dateTime23);
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean29 = dateTime23.isEqual(dateTime28);
    dateTime7.set(dateTime28);
    boolean boolean31 = net.ajaskey.common.Utils.sameDate(dateTime1, dateTime7);
    int int32 = dateTime7.getYear();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1972.041095890411d) + "'", double10 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
  }

  @Test
  public void test159() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test159");
    java.lang.String str2 = net.ajaskey.common.Utils.ifmt(8, (int) (byte) 1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8" + "'", str2, "8");
  }

  @Test
  public void test160() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test160");
    net.ajaskey.common.Utils.sleep((-1968));
  }

  @Test
  public void test161() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test161");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime9.isWeekday();
    boolean boolean14 = dateTime3.sameDate(dateTime9);
    java.lang.String str15 = dateTime9.getMonth();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UNKNOWN" + "'", str15, "UNKNOWN");
  }

  @Test
  public void test162() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test162");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 9);
  }

  @Test
  public void test163() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test163");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 14:03:15", true);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test164() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test164");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("8", zipOutputStream1);
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 8 (The system cannot find the file specified)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test165() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test165");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("10-Apr-0002");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test166() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test166");
    net.ajaskey.common.Utils.sleep(11);
  }

  @Test
  public void test167() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test167");
    java.text.DecimalFormat decimalFormat0 = null;
    net.ajaskey.common.Utils.df = decimalFormat0;
  }

  @Test
  public void test168() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test168");
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Invalid fmt", "       10.00");
  }

  @Test
  public void test169() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test169");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    net.ajaskey.common.DateTime dateTime10 = dateTime5.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime11 = net.ajaskey.common.DateTime.copy(dateTime5);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    dateTime13.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str18 = dateTime13.getMonth();
    int int19 = dateTime13.getMs();
    java.lang.String str21 = dateTime13
        .format("                                                                                               52.00");
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
    dateTime23.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str28 = dateTime23.getMonth();
    long long29 = dateTime13.getDeltaDays(dateTime23);
    boolean boolean30 = dateTime11.isGreaterThan(dateTime23);
    boolean boolean31 = dateTime23.isNull();
    java.lang.Class<?> wildcardClass32 = dateTime23.getClass();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(dateTime10);
    org.junit.Assert.assertNotNull(dateTime11);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "January" + "'", str18, "January");
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "                                                                                               52.00" + "'", str21,
        "                                                                                               52.00");
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "January" + "'", str28, "January");
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(wildcardClass32);
  }

  @Test
  public void test170() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test170");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    java.lang.String str9 = dateTime5.toString();
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(3, (int) '4', (int) (byte) 0);
    boolean boolean14 = dateTime5.isGreaterThan(dateTime13);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean25 = dateTime19.isEqual(dateTime24);
    java.util.Calendar calendar26 = dateTime19.getCal();
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(calendar26);
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(calendar26);
    boolean boolean29 = dateTime5.isLessThan(dateTime28);
    java.text.SimpleDateFormat simpleDateFormat30 = dateTime28.getSdf();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-Dec-1969" + "'", str9, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(calendar26);
    org.junit.Assert.assertEquals(calendar26.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNull(simpleDateFormat30);
  }

  @Test
  public void test171() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test171");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.text.SimpleDateFormat simpleDateFormat12 = null;
    java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat12, simpleDateFormat13);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
    double double21 = dateTime18.getDeltaYears(dateTime20);
    boolean boolean22 = dateTime20.isWeekday();
    java.util.Date date23 = dateTime20.getTime();
    java.lang.String str24 = dateTime20.toString();
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    int int27 = dateTime26.getMs();
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
    double double34 = dateTime31.getDeltaYears(dateTime33);
    java.text.SimpleDateFormat simpleDateFormat35 = dateTime31.getSdf();
    boolean boolean36 = dateTime26.isLessThanOrEqual(dateTime31);
    boolean boolean37 = dateTime20.isLessThan(dateTime31);
    java.lang.String str38 = dateTime20.toString();
    long long39 = dateTime14.getDeltaMilliSeconds(dateTime20);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
    double double46 = dateTime43.getDeltaYears(dateTime45);
    boolean boolean47 = dateTime45.isWeekday();
    java.util.Date date48 = dateTime45.getTime();
    int int49 = dateTime45.getMinute();
    boolean boolean50 = dateTime14.sameDate(dateTime45);
    int int51 = dateTime4.getYears(dateTime45);
    java.text.SimpleDateFormat simpleDateFormat53 = null;
    net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat53);
    net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double57 = dateTime54.getDeltaYears(dateTime56);
    net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean62 = dateTime56.isEqual(dateTime61);
    java.util.Calendar calendar63 = dateTime56.getCal();
    long long64 = dateTime45.getDeltaDays(dateTime56);
    java.lang.String str65 = dateTime45.getMonth();
    dateTime45.setFirstWorkDay();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat13);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "31-Dec-1969" + "'", str24, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1972.041095890411d) + "'", double34 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "31-Dec-1969" + "'", str38, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    org.junit.Assert.assertNotNull(calendar63);
    org.junit.Assert.assertEquals(calendar63.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
    org.junit.Assert.assertEquals("'" + str65 + "' != '" + "December" + "'", str65, "December");
  }

  @Test
  public void test172() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test172");
    net.ajaskey.common.Utils.makeDir("719,795");
  }

  @Test
  public void test173() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test173");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test174() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test174");
    java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 0, (int) (byte) 100);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "                                                                                                   0" + "'", str2,
        "                                                                                                   0");
  }

  @Test
  public void test175() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test175");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime1.isLessThan(dateTime9);
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    net.ajaskey.common.DateTime dateTime21 = null;
    long long22 = dateTime17.getDeltaDays(dateTime21);
    boolean boolean23 = dateTime9.isLessThanOrEqual(dateTime17);
    java.lang.String str24 = dateTime9.format();
    java.lang.String str26 = dateTime9.format("");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1972.041095890411d) + "'", double20 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "BAD-DATE-FORMAT" + "'", str24, "BAD-DATE-FORMAT");
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "BAD-DATE-FORMAT" + "'", str26, "BAD-DATE-FORMAT");
  }

  @Test
  public void test176() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test176");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("", true);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test177() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test177");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test178() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test178");
    net.ajaskey.common.Utils.TAB = "                                                                                               10.00";
  }

  @Test
  public void test179() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test179");
    net.ajaskey.common.DateTime dateTime0 = new net.ajaskey.common.DateTime();
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime(100L);
    dateTime2.set((int) (byte) 100, (-1), (int) '#');
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime2.getSdf();
    boolean boolean8 = dateTime0.isEqual(dateTime2);
    net.ajaskey.common.DateTime dateTime9 = net.ajaskey.common.DateTime.copy(dateTime0);
    int int10 = dateTime0.getHour();
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(dateTime9);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
  }

  @Test
  public void test180() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test180");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    int int7 = dateTime1.getMs();
    java.lang.String str9 = dateTime1.format("                                                                                               52.00");
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    dateTime11.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str16 = dateTime11.getMonth();
    long long17 = dateTime1.getDeltaDays(dateTime11);
    int int18 = dateTime11.getHour();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "                                                                                               52.00" + "'", str9,
        "                                                                                               52.00");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "January" + "'", str16, "January");
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
  }

  @Test
  public void test181() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test181");
    net.ajaskey.common.TextUtils.printline(
        "UNKNOWNJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969JanuaryJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969hi!January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969JanuaryJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969Wed 31-Dec-1969 17:00:00January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969       10.00January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969");
  }

  @Test
  public void test182() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test182");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    dateTime1.setSdf(simpleDateFormat3);
    int int5 = dateTime1.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    java.text.SimpleDateFormat simpleDateFormat14 = null;
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat14);
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double18 = dateTime15.getDeltaYears(dateTime17);
    boolean boolean19 = dateTime15.isWeekday();
    boolean boolean20 = dateTime9.sameDate(dateTime15);
    java.text.SimpleDateFormat simpleDateFormat22 = null;
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat22);
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double26 = dateTime23.getDeltaYears(dateTime25);
    net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean31 = dateTime25.isEqual(dateTime30);
    dateTime9.set(dateTime30);
    java.lang.String str34 = dateTime30.format("hi!");
    java.text.SimpleDateFormat simpleDateFormat35 = dateTime30.getSdf();
    dateTime1.set(dateTime30);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertEquals("'" + str34 + "' != '" + "BAD-DATE-FORMAT" + "'", str34, "BAD-DATE-FORMAT");
    org.junit.Assert.assertNull(simpleDateFormat35);
  }

  @Test
  public void test183() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test183");
    java.text.SimpleDateFormat simpleDateFormat1 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime("", simpleDateFormat3, simpleDateFormat4);
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat1, simpleDateFormat4);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean17 = dateTime11.isEqual(dateTime16);
    java.text.SimpleDateFormat simpleDateFormat19 = null;
    java.text.SimpleDateFormat simpleDateFormat20 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat19, simpleDateFormat20);
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(100L);
    double double28 = dateTime25.getDeltaYears(dateTime27);
    boolean boolean29 = dateTime27.isWeekday();
    java.util.Date date30 = dateTime27.getTime();
    java.lang.String str31 = dateTime27.toString();
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
    int int34 = dateTime33.getMs();
    net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(100L);
    double double41 = dateTime38.getDeltaYears(dateTime40);
    java.text.SimpleDateFormat simpleDateFormat42 = dateTime38.getSdf();
    boolean boolean43 = dateTime33.isLessThanOrEqual(dateTime38);
    boolean boolean44 = dateTime27.isLessThan(dateTime38);
    java.lang.String str45 = dateTime27.toString();
    long long46 = dateTime21.getDeltaMilliSeconds(dateTime27);
    net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime(100L);
    double double53 = dateTime50.getDeltaYears(dateTime52);
    boolean boolean54 = dateTime52.isWeekday();
    java.util.Date date55 = dateTime52.getTime();
    int int56 = dateTime52.getMinute();
    boolean boolean57 = dateTime21.sameDate(dateTime52);
    int int58 = dateTime11.getYears(dateTime52);
    int int59 = dateTime52.getDayOfWeek();
    java.lang.String str60 = dateTime52.toString();
    net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat63 = dateTime62.getSdf();
    net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat69 = null;
    net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat69);
    net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double73 = dateTime70.getDeltaYears(dateTime72);
    boolean boolean74 = dateTime67.isLessThan(dateTime72);
    int int75 = dateTime67.getHour();
    long long76 = dateTime62.getDeltaDays(dateTime67);
    java.lang.String str77 = dateTime62.toString();
    int int78 = dateTime62.getYear();
    boolean boolean79 = dateTime52.isLessThanOrEqual(dateTime62);
    net.ajaskey.common.DateTime dateTime81 = new net.ajaskey.common.DateTime(100L);
    int int82 = dateTime81.getMs();
    java.lang.String str83 = dateTime81.toString();
    net.ajaskey.common.DateTime dateTime85 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int86 = dateTime85.getHour();
    int int87 = dateTime85.getDayOfMonth();
    dateTime81.set(dateTime85);
    int int89 = dateTime85.getMs();
    int int90 = dateTime62.getYears(dateTime85);
    dateTime6.set(dateTime62);
    org.junit.Assert.assertNotNull(simpleDateFormat1);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertNotNull(simpleDateFormat4);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat20);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1972.041095890411d) + "'", double28 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    org.junit.Assert.assertNotNull(date30);
    org.junit.Assert.assertEquals(date30.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "31-Dec-1969" + "'", str31, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1972.041095890411d) + "'", double41 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat42);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertEquals("'" + str45 + "' != '" + "31-Dec-1969" + "'", str45, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1972.041095890411d) + "'", double53 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    org.junit.Assert.assertNotNull(date55);
    org.junit.Assert.assertEquals(date55.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
    org.junit.Assert.assertEquals("'" + str60 + "' != '" + "31-Dec-1969" + "'", str60, "31-Dec-1969");
    org.junit.Assert.assertNull(simpleDateFormat63);
    org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
    org.junit.Assert.assertTrue("'" + long76 + "' != '" + 719795L + "'", long76 == 719795L);
    org.junit.Assert.assertEquals("'" + str77 + "' != '" + "31-Dec-1969" + "'", str77, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1969 + "'", int78 == 1969);
    org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    org.junit.Assert.assertTrue("'" + int82 + "' != '" + 100 + "'", int82 == 100);
    org.junit.Assert.assertEquals("'" + str83 + "' != '" + "31-Dec-1969" + "'", str83, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int86 + "' != '" + 5 + "'", int86 == 5);
    org.junit.Assert.assertTrue("'" + int87 + "' != '" + 31 + "'", int87 == 31);
    org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
  }

  @Test
  public void test184() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test184");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime1.isLessThan(dateTime9);
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(10L);
    int int16 = dateTime15.getSecond();
    long long17 = dateTime9.getDeltaMilliSeconds(dateTime15);
    int int18 = dateTime9.getHour();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
  }

  @Test
  public void test185() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test185");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("         52", false);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test186() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test186");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("      0.00");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test187() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test187");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("UNKNOWN", false);
    java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
  }

  @Test
  public void test188() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test188");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    int int7 = dateTime3.getHour();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    java.util.Date date16 = dateTime13.getTime();
    java.lang.String str17 = dateTime13.toString();
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
    int int20 = dateTime19.getMs();
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    double double27 = dateTime24.getDeltaYears(dateTime26);
    java.text.SimpleDateFormat simpleDateFormat28 = dateTime24.getSdf();
    boolean boolean29 = dateTime19.isLessThanOrEqual(dateTime24);
    boolean boolean30 = dateTime13.isLessThan(dateTime24);
    java.lang.String str31 = dateTime13.toString();
    boolean boolean32 = dateTime3.sameDate(dateTime13);
    int int33 = dateTime13.getYear();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(date16);
    org.junit.Assert.assertEquals(date16.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "31-Dec-1969" + "'", str17, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1972.041095890411d) + "'", double27 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "31-Dec-1969" + "'", str31, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1969 + "'", int33 == 1969);
  }

  @Test
  public void test189() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test189");
    net.ajaskey.common.Utils.sleep((int) '4');
  }

  @Test
  public void test190() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test190");
    java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 14, 11);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         14" + "'", str2, "         14");
  }

  @Test
  public void test191() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test191");
    net.ajaskey.common.TextUtils.printline("Saturday");
  }

  @Test
  public void test192() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test192");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test193() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test193");
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat5 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("", simpleDateFormat5, simpleDateFormat6);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat3, simpleDateFormat6);
    java.text.SimpleDateFormat simpleDateFormat9 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("", simpleDateFormat6, simpleDateFormat9);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat9);
    int int12 = dateTime11.getDayOfMonth();
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertNotNull(simpleDateFormat5);
    org.junit.Assert.assertNotNull(simpleDateFormat6);
    org.junit.Assert.assertNotNull(simpleDateFormat9);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
  }

  @Test
  public void test194() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test194");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    java.lang.String str9 = dateTime5.toString();
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(3, (int) '4', (int) (byte) 0);
    boolean boolean14 = dateTime5.isGreaterThan(dateTime13);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean25 = dateTime19.isEqual(dateTime24);
    java.util.Calendar calendar26 = dateTime19.getCal();
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(calendar26);
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(calendar26);
    boolean boolean29 = dateTime5.isLessThan(dateTime28);
    java.lang.String str30 = dateTime5.toString();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-Dec-1969" + "'", str9, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(calendar26);
    org.junit.Assert.assertEquals(calendar26.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertEquals("'" + str30 + "' != '" + "31-Dec-1969" + "'", str30, "31-Dec-1969");
  }

  @Test
  public void test195() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test195");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.text.SimpleDateFormat simpleDateFormat12 = null;
    java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat12, simpleDateFormat13);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
    double double21 = dateTime18.getDeltaYears(dateTime20);
    boolean boolean22 = dateTime20.isWeekday();
    java.util.Date date23 = dateTime20.getTime();
    java.lang.String str24 = dateTime20.toString();
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    int int27 = dateTime26.getMs();
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
    double double34 = dateTime31.getDeltaYears(dateTime33);
    java.text.SimpleDateFormat simpleDateFormat35 = dateTime31.getSdf();
    boolean boolean36 = dateTime26.isLessThanOrEqual(dateTime31);
    boolean boolean37 = dateTime20.isLessThan(dateTime31);
    java.lang.String str38 = dateTime20.toString();
    long long39 = dateTime14.getDeltaMilliSeconds(dateTime20);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
    double double46 = dateTime43.getDeltaYears(dateTime45);
    boolean boolean47 = dateTime45.isWeekday();
    java.util.Date date48 = dateTime45.getTime();
    int int49 = dateTime45.getMinute();
    boolean boolean50 = dateTime14.sameDate(dateTime45);
    int int51 = dateTime4.getYears(dateTime45);
    int int52 = dateTime45.getDayOfWeek();
    java.lang.String str53 = dateTime45.toString();
    net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat56 = dateTime55.getSdf();
    net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat62 = null;
    net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat62);
    net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double66 = dateTime63.getDeltaYears(dateTime65);
    boolean boolean67 = dateTime60.isLessThan(dateTime65);
    int int68 = dateTime60.getHour();
    long long69 = dateTime55.getDeltaDays(dateTime60);
    java.lang.String str70 = dateTime55.toString();
    int int71 = dateTime55.getYear();
    boolean boolean72 = dateTime45.isLessThanOrEqual(dateTime55);
    java.lang.String str73 = dateTime55.getMonth();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat13);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "31-Dec-1969" + "'", str24, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1972.041095890411d) + "'", double34 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "31-Dec-1969" + "'", str38, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
    org.junit.Assert.assertEquals("'" + str53 + "' != '" + "31-Dec-1969" + "'", str53, "31-Dec-1969");
    org.junit.Assert.assertNull(simpleDateFormat56);
    org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
    org.junit.Assert.assertTrue("'" + long69 + "' != '" + 719795L + "'", long69 == 719795L);
    org.junit.Assert.assertEquals("'" + str70 + "' != '" + "31-Dec-1969" + "'", str70, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1969 + "'", int71 == 1969);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    org.junit.Assert.assertEquals("'" + str73 + "' != '" + "December" + "'", str73, "December");
  }

  @Test
  public void test196() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test196");
    net.ajaskey.common.Utils.makeDir("December");
  }

  @Test
  public void test197() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test197");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int2 = dateTime1.getDayOfWeek();
    dateTime1.add(14, (int) (byte) -1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
  }

  @Test
  public void test198() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test198");
    java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 2, (int) (byte) 1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2" + "'", str2, "2");
  }

  @Test
  public void test199() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test199");
    java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-719795L), (int) '#');
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           -719,795" + "'", str2, "                           -719,795");
  }

  @Test
  public void test200() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test200");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.text.SimpleDateFormat simpleDateFormat12 = null;
    java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat12, simpleDateFormat13);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
    double double21 = dateTime18.getDeltaYears(dateTime20);
    boolean boolean22 = dateTime20.isWeekday();
    java.util.Date date23 = dateTime20.getTime();
    java.lang.String str24 = dateTime20.toString();
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    int int27 = dateTime26.getMs();
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
    double double34 = dateTime31.getDeltaYears(dateTime33);
    java.text.SimpleDateFormat simpleDateFormat35 = dateTime31.getSdf();
    boolean boolean36 = dateTime26.isLessThanOrEqual(dateTime31);
    boolean boolean37 = dateTime20.isLessThan(dateTime31);
    java.lang.String str38 = dateTime20.toString();
    long long39 = dateTime14.getDeltaMilliSeconds(dateTime20);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
    double double46 = dateTime43.getDeltaYears(dateTime45);
    boolean boolean47 = dateTime45.isWeekday();
    java.util.Date date48 = dateTime45.getTime();
    int int49 = dateTime45.getMinute();
    boolean boolean50 = dateTime14.sameDate(dateTime45);
    int int51 = dateTime4.getYears(dateTime45);
    java.text.SimpleDateFormat simpleDateFormat53 = null;
    net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat53);
    net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double57 = dateTime54.getDeltaYears(dateTime56);
    net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean62 = dateTime56.isEqual(dateTime61);
    java.util.Calendar calendar63 = dateTime56.getCal();
    long long64 = dateTime45.getDeltaDays(dateTime56);
    java.lang.String str65 = dateTime45.toString();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat13);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "31-Dec-1969" + "'", str24, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1972.041095890411d) + "'", double34 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "31-Dec-1969" + "'", str38, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    org.junit.Assert.assertNotNull(calendar63);
    org.junit.Assert.assertEquals(calendar63.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
    org.junit.Assert.assertEquals("'" + str65 + "' != '" + "31-Dec-1969" + "'", str65, "31-Dec-1969");
  }

  @Test
  public void test201() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test201");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("2", zipOutputStream1);
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 2 (The system cannot find the file specified)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test202() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test202");
    net.ajaskey.common.Utils.NL = "          1.00";
  }

  @Test
  public void test203() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test203");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(1, 7, 7);
    boolean boolean4 = dateTime3.isNull();
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test204() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test204");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 7);
    int int2 = dateTime1.getMs();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
  }

  @Test
  public void test205() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test205");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat1, simpleDateFormat2);
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
    double double10 = dateTime7.getDeltaYears(dateTime9);
    boolean boolean11 = dateTime9.isWeekday();
    java.util.Date date12 = dateTime9.getTime();
    java.lang.String str13 = dateTime9.toString();
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
    int int16 = dateTime15.getMs();
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
    double double23 = dateTime20.getDeltaYears(dateTime22);
    java.text.SimpleDateFormat simpleDateFormat24 = dateTime20.getSdf();
    boolean boolean25 = dateTime15.isLessThanOrEqual(dateTime20);
    boolean boolean26 = dateTime9.isLessThan(dateTime20);
    java.lang.String str27 = dateTime9.toString();
    long long28 = dateTime3.getDeltaMilliSeconds(dateTime9);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    boolean boolean36 = dateTime34.isWeekday();
    java.util.Date date37 = dateTime34.getTime();
    int int38 = dateTime34.getMinute();
    boolean boolean39 = dateTime3.sameDate(dateTime34);
    net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int42 = dateTime41.getHour();
    int int43 = dateTime41.getDayOfMonth();
    int int44 = dateTime41.getYear();
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(dateTime41);
    boolean boolean46 = net.ajaskey.common.Utils.sameDate(dateTime34, dateTime41);
    int int47 = dateTime41.getDayOfYear();
    org.junit.Assert.assertNotNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1972.041095890411d) + "'", double10 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(date12);
    org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31-Dec-1969" + "'", str13, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1972.041095890411d) + "'", double23 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "31-Dec-1969" + "'", str27, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertNotNull(date37);
    org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
    org.junit.Assert.assertTrue("'" + int43 + "' != '" + 31 + "'", int43 == 31);
    org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1969 + "'", int44 == 1969);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    org.junit.Assert.assertTrue("'" + int47 + "' != '" + 365 + "'", int47 == 365);
  }

  @Test
  public void test206() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test206");
    java.util.Calendar calendar0 = null;
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(calendar0);
  }

  @Test
  public void test207() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test207");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.util.Calendar calendar11 = dateTime4.getCal();
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(calendar11);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(calendar11);
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(calendar11);
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(calendar11);
    org.junit.Assert.assertEquals(calendar11.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
  }

  @Test
  public void test208() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test208");
    net.ajaskey.common.Utils.NL = "719,795";
  }

  @Test
  public void test209() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test209");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat1, simpleDateFormat2);
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
    double double10 = dateTime7.getDeltaYears(dateTime9);
    boolean boolean11 = dateTime9.isWeekday();
    java.util.Date date12 = dateTime9.getTime();
    java.lang.String str13 = dateTime9.toString();
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
    int int16 = dateTime15.getMs();
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
    double double23 = dateTime20.getDeltaYears(dateTime22);
    java.text.SimpleDateFormat simpleDateFormat24 = dateTime20.getSdf();
    boolean boolean25 = dateTime15.isLessThanOrEqual(dateTime20);
    boolean boolean26 = dateTime9.isLessThan(dateTime20);
    java.lang.String str27 = dateTime9.toString();
    long long28 = dateTime3.getDeltaMilliSeconds(dateTime9);
    int int29 = dateTime9.getDayOfWeek();
    java.lang.Class<?> wildcardClass30 = dateTime9.getClass();
    org.junit.Assert.assertNotNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1972.041095890411d) + "'", double10 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(date12);
    org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31-Dec-1969" + "'", str13, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1972.041095890411d) + "'", double23 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "31-Dec-1969" + "'", str27, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    org.junit.Assert.assertNotNull(wildcardClass30);
  }

  @Test
  public void test210() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test210");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat2 = dateTime1.getSdf();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime6.isLessThan(dateTime11);
    int int14 = dateTime6.getHour();
    long long15 = dateTime1.getDeltaDays(dateTime6);
    java.lang.String str16 = dateTime1.getMonth();
    java.lang.String str18 = dateTime1.format("                                                                                                  10");
    int int19 = dateTime1.getMs();
    org.junit.Assert.assertNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 719795L + "'", long15 == 719795L);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "December" + "'", str16, "December");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "                                                                                                  10" + "'", str18,
        "                                                                                                  10");
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
  }

  @Test
  public void test211() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test211");
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat5 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("", simpleDateFormat5, simpleDateFormat6);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat3, simpleDateFormat6);
    java.text.SimpleDateFormat simpleDateFormat10 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat11 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("", simpleDateFormat10, simpleDateFormat11);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("", simpleDateFormat6, simpleDateFormat11);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    java.text.SimpleDateFormat simpleDateFormat17 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat16, simpleDateFormat17);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat17);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat6, simpleDateFormat17);
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(dateTime20);
    net.ajaskey.common.DateTime dateTime22 = net.ajaskey.common.DateTime.copy(dateTime21);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertNotNull(simpleDateFormat5);
    org.junit.Assert.assertNotNull(simpleDateFormat6);
    org.junit.Assert.assertNotNull(simpleDateFormat10);
    org.junit.Assert.assertNotNull(simpleDateFormat11);
    org.junit.Assert.assertNotNull(simpleDateFormat17);
    org.junit.Assert.assertNotNull(dateTime22);
  }

  @Test
  public void test212() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test212");
    java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) 'a', (int) ' ');
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              97" + "'", str2, "                              97");
  }

  @Test
  public void test213() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test213");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("          1.00");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test214() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test214");
    java.lang.String str1 = net.ajaskey.common.Utils
        .getFromUrl("                                                                                 -62,190,298,606,387");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test215() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test215");
    java.lang.String str2 = net.ajaskey.common.Utils.ifmt(365, 14);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           365" + "'", str2, "           365");
  }

  @Test
  public void test216() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test216");
    net.ajaskey.common.Utils.TAB = "365.00";
  }

  @Test
  public void test217() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test217");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
    double double9 = dateTime6.getDeltaYears(dateTime8);
    java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
    boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
    int int12 = dateTime6.getDayOfYear();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
  }

  @Test
  public void test218() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test218");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("UNKNOWN", zipOutputStream1);
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: UNKNOWN (The system cannot find the file specified)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test219() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test219");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Fri 31-Dec-0001 17:00:00", false);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test220() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test220");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("Thu 10-Apr-0002 14:03:15");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test221() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test221");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                              97", true);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test222() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test222");
    net.ajaskey.common.Utils.sleep(31);
  }

  @Test
  public void test223() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test223");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.text.SimpleDateFormat simpleDateFormat12 = null;
    java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat12, simpleDateFormat13);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
    double double21 = dateTime18.getDeltaYears(dateTime20);
    boolean boolean22 = dateTime20.isWeekday();
    java.util.Date date23 = dateTime20.getTime();
    java.lang.String str24 = dateTime20.toString();
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    int int27 = dateTime26.getMs();
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
    double double34 = dateTime31.getDeltaYears(dateTime33);
    java.text.SimpleDateFormat simpleDateFormat35 = dateTime31.getSdf();
    boolean boolean36 = dateTime26.isLessThanOrEqual(dateTime31);
    boolean boolean37 = dateTime20.isLessThan(dateTime31);
    java.lang.String str38 = dateTime20.toString();
    long long39 = dateTime14.getDeltaMilliSeconds(dateTime20);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
    double double46 = dateTime43.getDeltaYears(dateTime45);
    boolean boolean47 = dateTime45.isWeekday();
    java.util.Date date48 = dateTime45.getTime();
    int int49 = dateTime45.getMinute();
    boolean boolean50 = dateTime14.sameDate(dateTime45);
    int int51 = dateTime4.getYears(dateTime45);
    int int52 = dateTime45.getHour();
    int int53 = dateTime45.getHour();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat13);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "31-Dec-1969" + "'", str24, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1972.041095890411d) + "'", double34 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "31-Dec-1969" + "'", str38, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
    org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
  }

  @Test
  public void test224() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test224");
    net.ajaskey.common.TextUtils.printline("                                                                                 -62,190,298,606,387");
  }

  @Test
  public void test225() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test225");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    boolean boolean6 = dateTime2.isWeekday();
    java.lang.String str7 = dateTime2.getDay();
    java.util.Calendar calendar8 = dateTime2.getCal();
    net.ajaskey.common.DateTime dateTime9 = net.ajaskey.common.DateTime.copy(dateTime2);
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UNKNOWN" + "'", str7, "UNKNOWN");
    org.junit.Assert.assertNull(calendar8);
    org.junit.Assert.assertNull(dateTime9);
  }

  @Test
  public void test226() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test226");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    dateTime1.setSdf(simpleDateFormat3);
    java.lang.String str5 = dateTime1.format();
    int int6 = dateTime1.getSecond();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "31-Dec-1969" + "'", str5, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
  }

  @Test
  public void test227() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test227");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("January", "BAD-DATE-FORMAT");
    boolean boolean7 = net.ajaskey.common.Utils.sameMonth(dateTime3, dateTime6);
    int int8 = dateTime6.getDayOfYear();
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
  }

  @Test
  public void test228() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test228");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 12, 5);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
  }

  @Test
  public void test229() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test229");
    java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) 'a', (int) (byte) -1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97" + "'", str2, "97");
  }

  @Test
  public void test230() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test230");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat2 = dateTime1.getSdf();
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime(100L);
    int int5 = dateTime4.getMs();
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    java.text.SimpleDateFormat simpleDateFormat13 = dateTime9.getSdf();
    boolean boolean14 = dateTime4.isLessThanOrEqual(dateTime9);
    java.lang.String str15 = dateTime4.getDay();
    java.text.SimpleDateFormat simpleDateFormat19 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat21 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat22 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("", simpleDateFormat21, simpleDateFormat22);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat19,
        simpleDateFormat22);
    java.text.SimpleDateFormat simpleDateFormat26 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat27 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime("", simpleDateFormat26, simpleDateFormat27);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("", simpleDateFormat22, simpleDateFormat27);
    java.text.SimpleDateFormat simpleDateFormat32 = null;
    java.text.SimpleDateFormat simpleDateFormat33 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat32, simpleDateFormat33);
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat33);
    net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat22, simpleDateFormat33);
    dateTime4.setSdf(simpleDateFormat33);
    double double38 = dateTime1.getDeltaYears(dateTime4);
    java.lang.String str39 = dateTime4.toFullString();
    org.junit.Assert.assertNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Wednesday" + "'", str15, "Wednesday");
    org.junit.Assert.assertNotNull(simpleDateFormat19);
    org.junit.Assert.assertNotNull(simpleDateFormat21);
    org.junit.Assert.assertNotNull(simpleDateFormat22);
    org.junit.Assert.assertNotNull(simpleDateFormat26);
    org.junit.Assert.assertNotNull(simpleDateFormat27);
    org.junit.Assert.assertNotNull(simpleDateFormat33);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str39, "Wed 31-Dec-1969 17:00:00");
  }

  @Test
  public void test231() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test231");
    java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat7 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime("", simpleDateFormat6, simpleDateFormat7);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat4, simpleDateFormat7);
    java.text.SimpleDateFormat simpleDateFormat11 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat12 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("", simpleDateFormat11, simpleDateFormat12);
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("", simpleDateFormat7, simpleDateFormat12);
    java.text.SimpleDateFormat simpleDateFormat17 = null;
    java.text.SimpleDateFormat simpleDateFormat18 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat17, simpleDateFormat18);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat18);
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat7, simpleDateFormat18);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("      0.00", simpleDateFormat7);
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(dateTime22);
    org.junit.Assert.assertNotNull(simpleDateFormat4);
    org.junit.Assert.assertNotNull(simpleDateFormat6);
    org.junit.Assert.assertNotNull(simpleDateFormat7);
    org.junit.Assert.assertNotNull(simpleDateFormat11);
    org.junit.Assert.assertNotNull(simpleDateFormat12);
    org.junit.Assert.assertNotNull(simpleDateFormat18);
  }

  @Test
  public void test232() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test232");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    dateTime1.setFirstWorkDay();
    int int7 = dateTime1.getHour();
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
    int int10 = dateTime9.getMs();
    java.text.SimpleDateFormat simpleDateFormat11 = net.ajaskey.common.Utils.sdf;
    dateTime9.setSdf(simpleDateFormat11);
    int int13 = dateTime9.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    java.util.Calendar calendar21 = dateTime17.getCal();
    dateTime9.set(calendar21);
    java.text.SimpleDateFormat simpleDateFormat24 = null;
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double28 = dateTime25.getDeltaYears(dateTime27);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean33 = dateTime27.isEqual(dateTime32);
    java.util.Calendar calendar34 = dateTime27.getCal();
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime(calendar34);
    dateTime9.set(calendar34);
    int int37 = dateTime9.getDayOfYear();
    boolean boolean38 = dateTime1.isEqual(dateTime9);
    int int39 = dateTime1.getDayOfYear();
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat11);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1972.041095890411d) + "'", double20 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=-62190298601729,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=18,MILLISECOND=271,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(calendar34);
    org.junit.Assert.assertEquals(calendar34.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + 365 + "'", int37 == 365);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6 + "'", int39 == 6);
  }

  @Test
  public void test233() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test233");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.lang.String str3 = dateTime1.toString();
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int6 = dateTime5.getHour();
    int int7 = dateTime5.getDayOfMonth();
    dateTime1.set(dateTime5);
    java.lang.Class<?> wildcardClass9 = dateTime1.getClass();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test234() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test234");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    int int7 = dateTime1.getMs();
    int int8 = dateTime1.getHour();
    java.lang.Class<?> wildcardClass9 = dateTime1.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test235() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test235");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 14:03:16", false);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test236() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test236");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    int int6 = dateTime4.getDayOfYear();
    java.lang.String str7 = dateTime4.format();
    boolean boolean8 = dateTime4.isNull();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "BAD-DATE-FORMAT" + "'", str7, "BAD-DATE-FORMAT");
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test237() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test237");
    net.ajaskey.common.Utils.NL = "January";
  }

  @Test
  public void test238() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test238");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime9.isWeekday();
    boolean boolean14 = dateTime3.sameDate(dateTime9);
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(0L);
    boolean boolean17 = dateTime9.isGreaterThanOrEqual(dateTime16);
    java.lang.String str18 = dateTime16.toFullString();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str18, "Wed 31-Dec-1969 17:00:00");
  }

  @Test
  public void test239() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test239");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100, (int) (byte) 10);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
  }

  @Test
  public void test240() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test240");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    dateTime1.setSdf(simpleDateFormat3);
    int int5 = dateTime1.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(100L);
    dateTime7.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str12 = dateTime7.getMonth();
    int int13 = dateTime7.getMs();
    int int14 = dateTime7.getHour();
    int int15 = dateTime7.getMinute();
    long long16 = dateTime1.getDeltaMilliSeconds(dateTime7);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "January" + "'", str12, "January");
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-59011286400000L) + "'", long16 == (-59011286400000L));
  }

  @Test
  public void test241() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test241");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("10-Apr-0002", true);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test242() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test242");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    dateTime1.setSdf(simpleDateFormat3);
    java.lang.String str5 = dateTime1.toFullString();
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(100L);
    int int8 = dateTime7.getMs();
    java.text.SimpleDateFormat simpleDateFormat9 = net.ajaskey.common.Utils.sdf;
    dateTime7.setSdf(simpleDateFormat9);
    java.lang.String str11 = dateTime7.toFullString();
    java.lang.String str12 = dateTime7.format();
    int int13 = dateTime1.getYears(dateTime7);
    int int14 = dateTime1.getDayOfYear();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str5, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str11, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "31-Dec-1969" + "'", str12, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 365 + "'", int14 == 365);
  }

  @Test
  public void test243() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test243");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat2 = dateTime1.getSdf();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime6.isLessThan(dateTime11);
    int int14 = dateTime6.getHour();
    long long15 = dateTime1.getDeltaDays(dateTime6);
    java.lang.String str16 = dateTime1.getMonth();
    java.lang.String str17 = dateTime1.getDay();
    org.junit.Assert.assertNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 719795L + "'", long15 == 719795L);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "December" + "'", str16, "December");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Wednesday" + "'", str17, "Wednesday");
  }

  @Test
  public void test244() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test244");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("719,795");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test245() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test245");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    int int9 = dateTime5.getMinute();
    java.text.SimpleDateFormat simpleDateFormat11 = null;
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat11);
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double15 = dateTime12.getDeltaYears(dateTime14);
    net.ajaskey.common.DateTime dateTime16 = net.ajaskey.common.DateTime.copy(dateTime12);
    boolean boolean17 = net.ajaskey.common.Utils.sameDate(dateTime5, dateTime12);
    java.text.SimpleDateFormat simpleDateFormat20 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat22 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat23 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("", simpleDateFormat22, simpleDateFormat23);
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat20,
        simpleDateFormat23);
    java.text.SimpleDateFormat simpleDateFormat27 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat28 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("", simpleDateFormat27, simpleDateFormat28);
    net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("", simpleDateFormat23, simpleDateFormat28);
    dateTime5.setSdf(simpleDateFormat23);
    java.text.SimpleDateFormat simpleDateFormat35 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat37 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat38 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime("", simpleDateFormat37, simpleDateFormat38);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat35,
        simpleDateFormat38);
    java.text.SimpleDateFormat simpleDateFormat42 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat43 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime("", simpleDateFormat42, simpleDateFormat43);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime("", simpleDateFormat38, simpleDateFormat43);
    java.text.SimpleDateFormat simpleDateFormat48 = null;
    java.text.SimpleDateFormat simpleDateFormat49 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat48, simpleDateFormat49);
    net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat49);
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat38, simpleDateFormat49);
    net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int55 = dateTime54.getHour();
    int int56 = dateTime54.getDayOfMonth();
    int int57 = dateTime54.getYear();
    net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime(dateTime54);
    int int59 = dateTime52.getYears(dateTime58);
    boolean boolean60 = dateTime5.isLessThan(dateTime58);
    java.util.Date date61 = dateTime58.getTime();
    java.lang.String str62 = dateTime58.toFullString();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertNull(dateTime16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat20);
    org.junit.Assert.assertNotNull(simpleDateFormat22);
    org.junit.Assert.assertNotNull(simpleDateFormat23);
    org.junit.Assert.assertNotNull(simpleDateFormat27);
    org.junit.Assert.assertNotNull(simpleDateFormat28);
    org.junit.Assert.assertNotNull(simpleDateFormat35);
    org.junit.Assert.assertNotNull(simpleDateFormat37);
    org.junit.Assert.assertNotNull(simpleDateFormat38);
    org.junit.Assert.assertNotNull(simpleDateFormat42);
    org.junit.Assert.assertNotNull(simpleDateFormat43);
    org.junit.Assert.assertNotNull(simpleDateFormat49);
    org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
    org.junit.Assert.assertTrue("'" + int56 + "' != '" + 31 + "'", int56 == 31);
    org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1969 + "'", int57 == 1969);
    org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertNotNull(date61);
    org.junit.Assert.assertEquals(date61.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str62, "Wed 31-Dec-1969 17:00:00");
  }

  @Test
  public void test246() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test246");
    net.ajaskey.common.TextUtils.printline(
        "January         52         52                                                                                               52.00         52hi!         52");
  }

  @Test
  public void test247() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test247");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 1);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(100L);
    double double8 = dateTime5.getDeltaYears(dateTime7);
    boolean boolean9 = dateTime7.isWeekday();
    java.util.Date date10 = dateTime7.getTime();
    java.lang.String str11 = dateTime7.toString();
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    int int14 = dateTime13.getMs();
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
    double double21 = dateTime18.getDeltaYears(dateTime20);
    java.text.SimpleDateFormat simpleDateFormat22 = dateTime18.getSdf();
    boolean boolean23 = dateTime13.isLessThanOrEqual(dateTime18);
    boolean boolean24 = dateTime7.isLessThan(dateTime18);
    dateTime1.set(dateTime7);
    dateTime1.add((int) ' ', 2);
    int int29 = dateTime1.getMinute();
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1972.041095890411d) + "'", double8 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "31-Dec-1969" + "'", str11, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
  }

  @Test
  public void test248() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test248");
    net.ajaskey.common.Utils.TAB = "         14";
  }

  @Test
  public void test249() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test249");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    int int9 = dateTime5.getMinute();
    java.text.SimpleDateFormat simpleDateFormat11 = null;
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat11);
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double15 = dateTime12.getDeltaYears(dateTime14);
    net.ajaskey.common.DateTime dateTime16 = net.ajaskey.common.DateTime.copy(dateTime12);
    boolean boolean17 = net.ajaskey.common.Utils.sameDate(dateTime5, dateTime12);
    java.text.SimpleDateFormat simpleDateFormat20 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat22 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat23 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("", simpleDateFormat22, simpleDateFormat23);
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat20,
        simpleDateFormat23);
    java.text.SimpleDateFormat simpleDateFormat27 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat28 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("", simpleDateFormat27, simpleDateFormat28);
    net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("", simpleDateFormat23, simpleDateFormat28);
    dateTime5.setSdf(simpleDateFormat23);
    java.text.SimpleDateFormat simpleDateFormat35 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat37 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat38 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime("", simpleDateFormat37, simpleDateFormat38);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat35,
        simpleDateFormat38);
    java.text.SimpleDateFormat simpleDateFormat42 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat43 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime("", simpleDateFormat42, simpleDateFormat43);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime("", simpleDateFormat38, simpleDateFormat43);
    java.text.SimpleDateFormat simpleDateFormat48 = null;
    java.text.SimpleDateFormat simpleDateFormat49 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat48, simpleDateFormat49);
    net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat49);
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat38, simpleDateFormat49);
    net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int55 = dateTime54.getHour();
    int int56 = dateTime54.getDayOfMonth();
    int int57 = dateTime54.getYear();
    net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime(dateTime54);
    int int59 = dateTime52.getYears(dateTime58);
    boolean boolean60 = dateTime5.isLessThan(dateTime58);
    boolean boolean61 = dateTime5.isNull();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertNull(dateTime16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat20);
    org.junit.Assert.assertNotNull(simpleDateFormat22);
    org.junit.Assert.assertNotNull(simpleDateFormat23);
    org.junit.Assert.assertNotNull(simpleDateFormat27);
    org.junit.Assert.assertNotNull(simpleDateFormat28);
    org.junit.Assert.assertNotNull(simpleDateFormat35);
    org.junit.Assert.assertNotNull(simpleDateFormat37);
    org.junit.Assert.assertNotNull(simpleDateFormat38);
    org.junit.Assert.assertNotNull(simpleDateFormat42);
    org.junit.Assert.assertNotNull(simpleDateFormat43);
    org.junit.Assert.assertNotNull(simpleDateFormat49);
    org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
    org.junit.Assert.assertTrue("'" + int56 + "' != '" + 31 + "'", int56 == 31);
    org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1969 + "'", int57 == 1969);
    org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
  }

  @Test
  public void test250() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test250");
    net.ajaskey.common.Utils.TAB = "Fri 31-Dec-0001 17:00:00";
  }

  @Test
  public void test251() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test251");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.lang.String str8 = dateTime5.toFullString();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str8, "Wed 31-Dec-1969 17:00:00");
  }

  @Test
  public void test253() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test253");
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("        1.00", "Thu 10-Apr-0002 14:03:15");
  }

  @Test
  public void test254() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test254");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    dateTime11.set(0, 12, 0);
    boolean boolean17 = net.ajaskey.common.Utils.sameMonth(dateTime3, dateTime11);
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
    double double24 = dateTime21.getDeltaYears(dateTime23);
    java.text.SimpleDateFormat simpleDateFormat25 = dateTime21.getSdf();
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
    double double32 = dateTime29.getDeltaYears(dateTime31);
    boolean boolean33 = dateTime31.isWeekday();
    net.ajaskey.common.DateTime dateTime36 = dateTime31.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime37 = net.ajaskey.common.DateTime.copy(dateTime31);
    boolean boolean38 = dateTime21.sameDate(dateTime37);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int41 = dateTime40.getDayOfWeek();
    int int42 = dateTime37.getYears(dateTime40);
    long long43 = dateTime3.getDeltaMilliSeconds(dateTime37);
    java.lang.String str45 = dateTime3.format("Saturday");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1972.041095890411d) + "'", double24 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat25);
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1972.041095890411d) + "'", double32 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertNull(dateTime36);
    org.junit.Assert.assertNotNull(dateTime37);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
    org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 62190298601123L + "'", long43 == 62190298601123L);
    org.junit.Assert.assertEquals("'" + str45 + "' != '" + "BAD-DATE-FORMAT" + "'", str45, "BAD-DATE-FORMAT");
  }

  @Test
  public void test255() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test255");
    net.ajaskey.common.TextUtils.printline("Fri 31-Dec-0001 17:00:00");
  }

  @Test
  public void test256() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test256");
    net.ajaskey.common.TextUtils.printline("Thursday");
  }

  @Test
  public void test257() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test257");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.util.Calendar calendar11 = dateTime4.getCal();
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(calendar11);
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
    double double19 = dateTime16.getDeltaYears(dateTime18);
    java.text.SimpleDateFormat simpleDateFormat20 = dateTime16.getSdf();
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    double double27 = dateTime24.getDeltaYears(dateTime26);
    boolean boolean28 = dateTime26.isWeekday();
    net.ajaskey.common.DateTime dateTime31 = dateTime26.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime32 = net.ajaskey.common.DateTime.copy(dateTime26);
    boolean boolean33 = dateTime16.sameDate(dateTime32);
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int36 = dateTime35.getDayOfWeek();
    int int37 = dateTime32.getYears(dateTime35);
    boolean boolean38 = dateTime12.isLessThanOrEqual(dateTime35);
    java.lang.String str39 = dateTime35.getDay();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(calendar11);
    org.junit.Assert.assertEquals(calendar11.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat20);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1972.041095890411d) + "'", double27 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertNull(dateTime31);
    org.junit.Assert.assertNotNull(dateTime32);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Wednesday" + "'", str39, "Wednesday");
  }

  @Test
  public void test258() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test258");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (byte) 0, (int) (short) 0, (int) (short) 0);
  }

  @Test
  public void test259() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test259");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test260() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test260");
    net.ajaskey.common.Utils.sleep((int) 'a');
  }

  @Test
  public void test261() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test261");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    dateTime1.setSdf(simpleDateFormat3);
    int int5 = dateTime1.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    java.util.Calendar calendar13 = dateTime9.getCal();
    dateTime1.set(calendar13);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean25 = dateTime19.isEqual(dateTime24);
    java.util.Calendar calendar26 = dateTime19.getCal();
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(calendar26);
    dateTime1.set(calendar26);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    java.lang.String str36 = dateTime32.toFullString();
    boolean boolean37 = net.ajaskey.common.Utils.sameDate(dateTime1, dateTime32);
    net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((long) 1);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
    double double46 = dateTime43.getDeltaYears(dateTime45);
    boolean boolean47 = dateTime45.isWeekday();
    java.util.Date date48 = dateTime45.getTime();
    java.lang.String str49 = dateTime45.toString();
    net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(100L);
    int int52 = dateTime51.getMs();
    net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime(100L);
    double double59 = dateTime56.getDeltaYears(dateTime58);
    java.text.SimpleDateFormat simpleDateFormat60 = dateTime56.getSdf();
    boolean boolean61 = dateTime51.isLessThanOrEqual(dateTime56);
    boolean boolean62 = dateTime45.isLessThan(dateTime56);
    dateTime39.set(dateTime45);
    java.lang.String str64 = dateTime45.toFullString();
    boolean boolean65 = dateTime1.isLessThanOrEqual(dateTime45);
    java.lang.String str67 = dateTime1.format("Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=-62190298600559,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=19,MILLISECOND=441,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(calendar26);
    org.junit.Assert.assertEquals(calendar26.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Thu 10-Apr-0002 14:03:19" + "'", str36, "Thu 10-Apr-0002 14:03:19");
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str49 + "' != '" + "31-Dec-1969" + "'", str49, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
    org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1972.041095890411d) + "'", double59 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat60);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str64, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    org.junit.Assert.assertEquals("'" + str67 + "' != '" + "BAD-DATE-FORMAT" + "'", str67, "BAD-DATE-FORMAT");
  }

  @Test
  public void test262() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test262");
    net.ajaskey.common.Utils.TAB = "hi!";
  }

  @Test
  public void test263() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test263");
    net.ajaskey.common.Utils.makeDir("                                                                                                   7");
  }

  @Test
  public void test264() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test264");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime6 = net.ajaskey.common.DateTime.copy(dateTime2);
    int int7 = dateTime2.getMs();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertNull(dateTime6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
  }

  @Test
  public void test265() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test265");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime9.isWeekday();
    boolean boolean14 = dateTime3.sameDate(dateTime9);
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(0L);
    boolean boolean17 = dateTime9.isGreaterThanOrEqual(dateTime16);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
    dateTime19.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str24 = dateTime19.getMonth();
    java.text.SimpleDateFormat simpleDateFormat26 = null;
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat26);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double30 = dateTime27.getDeltaYears(dateTime29);
    boolean boolean31 = dateTime19.isLessThan(dateTime27);
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
    double double38 = dateTime35.getDeltaYears(dateTime37);
    net.ajaskey.common.DateTime dateTime39 = null;
    long long40 = dateTime35.getDeltaDays(dateTime39);
    boolean boolean41 = dateTime27.isLessThanOrEqual(dateTime35);
    java.lang.String str42 = dateTime27.format();
    boolean boolean43 = dateTime9.isGreaterThan(dateTime27);
    dateTime9.add(1, (int) (short) 10);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "January" + "'", str24, "January");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1972.041095890411d) + "'", double38 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertEquals("'" + str42 + "' != '" + "BAD-DATE-FORMAT" + "'", str42, "BAD-DATE-FORMAT");
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
  }

  @Test
  public void test266() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test266");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime1.isLessThan(dateTime9);
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    net.ajaskey.common.DateTime dateTime21 = null;
    long long22 = dateTime17.getDeltaDays(dateTime21);
    boolean boolean23 = dateTime9.isLessThanOrEqual(dateTime17);
    java.text.SimpleDateFormat simpleDateFormat25 = null;
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat25);
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double29 = dateTime26.getDeltaYears(dateTime28);
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean34 = dateTime28.isEqual(dateTime33);
    java.util.Calendar calendar35 = dateTime28.getCal();
    dateTime17.set(calendar35);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(100L);
    double double43 = dateTime40.getDeltaYears(dateTime42);
    java.util.Date date44 = dateTime40.getTime();
    net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime(100L);
    int int47 = dateTime46.getMs();
    java.text.SimpleDateFormat simpleDateFormat48 = net.ajaskey.common.Utils.sdf;
    dateTime46.setSdf(simpleDateFormat48);
    java.lang.String str50 = dateTime46.toFullString();
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime(100L);
    int int53 = dateTime52.getMs();
    java.text.SimpleDateFormat simpleDateFormat54 = net.ajaskey.common.Utils.sdf;
    dateTime52.setSdf(simpleDateFormat54);
    java.lang.String str56 = dateTime52.toFullString();
    java.lang.String str57 = dateTime52.format();
    int int58 = dateTime46.getYears(dateTime52);
    boolean boolean59 = dateTime40.isGreaterThanOrEqual(dateTime46);
    java.lang.String str60 = dateTime46.getMonth();
    long long61 = dateTime17.getDeltaMilliSeconds(dateTime46);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1972.041095890411d) + "'", double20 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(calendar35);
    org.junit.Assert.assertEquals(calendar35.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1972.041095890411d) + "'", double43 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Thu Apr 10 14:03:19 MST 2");
    org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat48);
    org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str50, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat54);
    org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str56, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertEquals("'" + str57 + "' != '" + "31-Dec-1969" + "'", str57, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    org.junit.Assert.assertEquals("'" + str60 + "' != '" + "December" + "'", str60, "December");
    org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L + "'", long61 == 100L);
  }

  @Test
  public void test267() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test267");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("Thu 10-Apr-0002 14:03:15", true);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test268() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test268");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    int int9 = dateTime5.getMinute();
    int int10 = dateTime5.getHour();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
  }

  @Test
  public void test269() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test269");
    java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 7, 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 7" + "'", str2, " 7");
  }

  @Test
  public void test270() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test270");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    dateTime1.setSdf(simpleDateFormat3);
    int int5 = dateTime1.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    java.util.Calendar calendar13 = dateTime9.getCal();
    dateTime1.set(calendar13);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean25 = dateTime19.isEqual(dateTime24);
    java.util.Calendar calendar26 = dateTime19.getCal();
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(calendar26);
    dateTime1.set(calendar26);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    java.lang.String str36 = dateTime32.toFullString();
    boolean boolean37 = net.ajaskey.common.Utils.sameDate(dateTime1, dateTime32);
    net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((long) 1);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
    double double46 = dateTime43.getDeltaYears(dateTime45);
    boolean boolean47 = dateTime45.isWeekday();
    java.util.Date date48 = dateTime45.getTime();
    java.lang.String str49 = dateTime45.toString();
    net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(100L);
    int int52 = dateTime51.getMs();
    net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime(100L);
    double double59 = dateTime56.getDeltaYears(dateTime58);
    java.text.SimpleDateFormat simpleDateFormat60 = dateTime56.getSdf();
    boolean boolean61 = dateTime51.isLessThanOrEqual(dateTime56);
    boolean boolean62 = dateTime45.isLessThan(dateTime56);
    dateTime39.set(dateTime45);
    java.lang.String str64 = dateTime45.toFullString();
    boolean boolean65 = dateTime1.isLessThanOrEqual(dateTime45);
    net.ajaskey.common.DateTime dateTime67 = dateTime1.parse("2");
    java.text.SimpleDateFormat simpleDateFormat70 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat72 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat73 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime74 = new net.ajaskey.common.DateTime("", simpleDateFormat72, simpleDateFormat73);
    net.ajaskey.common.DateTime dateTime75 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat70,
        simpleDateFormat73);
    net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat70);
    dateTime1.setSdf(simpleDateFormat70);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=-62190298600211,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=19,MILLISECOND=789,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(calendar26);
    org.junit.Assert.assertEquals(calendar26.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Thu 10-Apr-0002 14:03:19" + "'", str36, "Thu 10-Apr-0002 14:03:19");
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str49 + "' != '" + "31-Dec-1969" + "'", str49, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
    org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1972.041095890411d) + "'", double59 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat60);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str64, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    org.junit.Assert.assertNull(dateTime67);
    org.junit.Assert.assertNotNull(simpleDateFormat70);
    org.junit.Assert.assertNotNull(simpleDateFormat72);
    org.junit.Assert.assertNotNull(simpleDateFormat73);
  }

  @Test
  public void test271() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test271");
    net.ajaskey.common.DateTime dateTime0 = new net.ajaskey.common.DateTime();
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime(100L);
    dateTime2.set((int) (byte) 100, (-1), (int) '#');
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime2.getSdf();
    boolean boolean8 = dateTime0.isEqual(dateTime2);
    java.lang.Class<?> wildcardClass9 = dateTime0.getClass();
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test272() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test272");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
    double double9 = dateTime6.getDeltaYears(dateTime8);
    java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
    boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
    java.lang.String str12 = dateTime1.getDay();
    dateTime1.setFirstWorkDay();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Wednesday" + "'", str12, "Wednesday");
  }

  @Test
  public void test273() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test273");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    java.lang.String str9 = dateTime5.toString();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    int int12 = dateTime11.getMs();
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
    double double19 = dateTime16.getDeltaYears(dateTime18);
    java.text.SimpleDateFormat simpleDateFormat20 = dateTime16.getSdf();
    boolean boolean21 = dateTime11.isLessThanOrEqual(dateTime16);
    boolean boolean22 = dateTime5.isLessThan(dateTime16);
    int int23 = dateTime16.getDayOfYear();
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(100L);
    double double30 = dateTime27.getDeltaYears(dateTime29);
    boolean boolean31 = dateTime29.isWeekday();
    net.ajaskey.common.DateTime dateTime34 = dateTime29.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime35 = net.ajaskey.common.DateTime.copy(dateTime29);
    boolean boolean36 = dateTime16.sameDate(dateTime35);
    net.ajaskey.common.DateTime dateTime39 = dateTime35.parse("      0.00", "           365");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-Dec-1969" + "'", str9, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1972.041095890411d) + "'", double30 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertNull(dateTime34);
    org.junit.Assert.assertNotNull(dateTime35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertNull(dateTime39);
  }

  @Test
  public void test274() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test274");
    java.lang.String[] strArray4 = new java.lang.String[] { "January", "",
        "                                                                                               52.00", "hi!" };
    java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
    net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList5);
    java.lang.String str8 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList5);
    net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList5);
    java.lang.Class<?> wildcardClass10 = strList5.getClass();
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
        + "JanuaryJanuaryJanuary                                                                                               52.00Januaryhi!January"
        + "'", str8,
        "JanuaryJanuaryJanuary                                                                                               52.00Januaryhi!January");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test275() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test275");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    dateTime9.setFirstWorkDay();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test276() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test276");
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime(100L);
    int int5 = dateTime4.getMs();
    java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
    dateTime4.setSdf(simpleDateFormat6);
    java.text.SimpleDateFormat simpleDateFormat10 = null;
    java.text.SimpleDateFormat simpleDateFormat11 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat10, simpleDateFormat11);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat11);
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("         52", simpleDateFormat6, simpleDateFormat11);
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
    int int17 = dateTime16.getMs();
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
    double double24 = dateTime21.getDeltaYears(dateTime23);
    java.text.SimpleDateFormat simpleDateFormat25 = dateTime21.getSdf();
    boolean boolean26 = dateTime16.isLessThanOrEqual(dateTime21);
    dateTime21.setFirstWorkDay();
    java.lang.String str28 = dateTime21.toFullString();
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    java.text.SimpleDateFormat simpleDateFormat37 = null;
    net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat37);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double41 = dateTime38.getDeltaYears(dateTime40);
    boolean boolean42 = dateTime38.isWeekday();
    boolean boolean43 = dateTime32.sameDate(dateTime38);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(0L);
    boolean boolean46 = dateTime38.isGreaterThanOrEqual(dateTime45);
    net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime(100L);
    dateTime48.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str53 = dateTime48.getMonth();
    java.text.SimpleDateFormat simpleDateFormat55 = null;
    net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat55);
    net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double59 = dateTime56.getDeltaYears(dateTime58);
    boolean boolean60 = dateTime48.isLessThan(dateTime56);
    net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime(100L);
    double double67 = dateTime64.getDeltaYears(dateTime66);
    net.ajaskey.common.DateTime dateTime68 = null;
    long long69 = dateTime64.getDeltaDays(dateTime68);
    boolean boolean70 = dateTime56.isLessThanOrEqual(dateTime64);
    java.lang.String str71 = dateTime56.format();
    boolean boolean72 = dateTime38.isGreaterThan(dateTime56);
    boolean boolean73 = net.ajaskey.common.Utils.sameMonth(dateTime21, dateTime38);
    java.text.SimpleDateFormat simpleDateFormat77 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat79 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat80 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime81 = new net.ajaskey.common.DateTime("", simpleDateFormat79, simpleDateFormat80);
    net.ajaskey.common.DateTime dateTime82 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat77,
        simpleDateFormat80);
    net.ajaskey.common.DateTime dateTime83 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat77);
    net.ajaskey.common.DateTime dateTime84 = new net.ajaskey.common.DateTime("December", simpleDateFormat77);
    dateTime38.setSdf(simpleDateFormat77);
    net.ajaskey.common.DateTime dateTime86 = new net.ajaskey.common.DateTime("                           -719,795", simpleDateFormat6,
        simpleDateFormat77);
    net.ajaskey.common.DateTime dateTime87 = new net.ajaskey.common.DateTime("2", simpleDateFormat6);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat6);
    org.junit.Assert.assertNotNull(simpleDateFormat11);
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1972.041095890411d) + "'", double24 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Thu 10-Apr-0002 14:03:20" + "'", str28, "Thu 10-Apr-0002 14:03:20");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    org.junit.Assert.assertEquals("'" + str53 + "' != '" + "January" + "'", str53, "January");
    org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1972.041095890411d) + "'", double67 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    org.junit.Assert.assertEquals("'" + str71 + "' != '" + "BAD-DATE-FORMAT" + "'", str71, "BAD-DATE-FORMAT");
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat77);
    org.junit.Assert.assertNotNull(simpleDateFormat79);
    org.junit.Assert.assertNotNull(simpleDateFormat80);
  }

  @Test
  public void test277() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test277");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.lang.String str3 = dateTime1.toString();
    int int4 = dateTime1.getMs();
    java.util.Calendar calendar5 = dateTime1.getCal();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime(calendar5);
    java.lang.String str7 = dateTime6.toFullString();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    org.junit.Assert.assertNotNull(calendar5);
    org.junit.Assert.assertEquals(calendar5.toString(),
        "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str7, "Wed 31-Dec-1969 17:00:00");
  }

  @Test
  public void test278() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test278");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime9.isWeekday();
    boolean boolean14 = dateTime3.sameDate(dateTime9);
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
    int int17 = dateTime16.getMs();
    java.text.SimpleDateFormat simpleDateFormat18 = net.ajaskey.common.Utils.sdf;
    dateTime16.setSdf(simpleDateFormat18);
    long long20 = dateTime3.getDeltaDays(dateTime16);
    java.text.SimpleDateFormat simpleDateFormat21 = dateTime16.getSdf();
    boolean boolean22 = dateTime16.isWeekday();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat18);
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-719795L) + "'", long20 == (-719795L));
    org.junit.Assert.assertNotNull(simpleDateFormat21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
  }

  @Test
  public void test279() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test279");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("Invalid fmt", true);
    java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
    java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
  }

  @Test
  public void test280() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test280");
    net.ajaskey.common.Utils.sleep(1969);
  }

  @Test
  public void test281() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test281");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("      0.00", zipOutputStream1);
      org.junit.Assert
          .fail("Expected exception of type java.io.FileNotFoundException; message:       0.00 (The system cannot find the file specified)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test282() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test282");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat1, simpleDateFormat2);
    java.lang.String str4 = dateTime3.getDay();
    java.lang.String str5 = dateTime3.getMonth();
    dateTime3.add(14, 11);
    org.junit.Assert.assertNotNull(simpleDateFormat2);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UNKNOWN" + "'", str4, "UNKNOWN");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UNKNOWN" + "'", str5, "UNKNOWN");
  }

  @Test
  public void test283() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test283");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime9.isWeekday();
    boolean boolean14 = dateTime3.sameDate(dateTime9);
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
    int int17 = dateTime16.getMs();
    java.text.SimpleDateFormat simpleDateFormat18 = net.ajaskey.common.Utils.sdf;
    dateTime16.setSdf(simpleDateFormat18);
    long long20 = dateTime3.getDeltaDays(dateTime16);
    java.util.Calendar calendar21 = dateTime3.getCal();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat18);
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-719795L) + "'", long20 == (-719795L));
    org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=-62190298597780,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=22,MILLISECOND=220,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
  }

  @Test
  public void test284() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test284");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    net.ajaskey.common.DateTime dateTime18 = dateTime13.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime19 = net.ajaskey.common.DateTime.copy(dateTime13);
    boolean boolean20 = dateTime3.sameDate(dateTime19);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int23 = dateTime22.getDayOfWeek();
    int int24 = dateTime19.getYears(dateTime22);
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    int int27 = dateTime26.getMs();
    java.lang.String str28 = dateTime26.toString();
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    java.text.SimpleDateFormat simpleDateFormat37 = null;
    net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat37);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double41 = dateTime38.getDeltaYears(dateTime40);
    boolean boolean42 = dateTime38.isWeekday();
    boolean boolean43 = dateTime32.sameDate(dateTime38);
    java.text.SimpleDateFormat simpleDateFormat45 = null;
    net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat45);
    net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double49 = dateTime46.getDeltaYears(dateTime48);
    net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean54 = dateTime48.isEqual(dateTime53);
    dateTime32.set(dateTime53);
    boolean boolean56 = net.ajaskey.common.Utils.sameDate(dateTime26, dateTime32);
    long long57 = dateTime19.getDeltaMilliSeconds(dateTime32);
    boolean boolean58 = dateTime19.isNull();
    int int59 = dateTime19.getSecond();
    net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime(100L);
    double double66 = dateTime63.getDeltaYears(dateTime65);
    java.util.Date date67 = dateTime63.getTime();
    net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime(date67);
    net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime(date67);
    net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime(date67);
    dateTime19.set(date67);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNull(dateTime18);
    org.junit.Assert.assertNotNull(dateTime19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "31-Dec-1969" + "'", str28, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-62190298597863L) + "'", long57 == (-62190298597863L));
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1972.041095890411d) + "'", double66 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(date67);
// flaky:         org.junit.Assert.assertEquals(date67.toString(), "Thu Apr 10 14:03:22 MST 2");
  }

  @Test
  public void test285() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test285");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    net.ajaskey.common.DateTime dateTime18 = dateTime13.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime19 = net.ajaskey.common.DateTime.copy(dateTime13);
    boolean boolean20 = dateTime3.sameDate(dateTime19);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
    dateTime22.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str27 = dateTime22.getMonth();
    int int28 = dateTime22.getMs();
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    java.text.SimpleDateFormat simpleDateFormat36 = dateTime32.getSdf();
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(100L);
    double double43 = dateTime40.getDeltaYears(dateTime42);
    boolean boolean44 = dateTime42.isWeekday();
    net.ajaskey.common.DateTime dateTime47 = dateTime42.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime48 = net.ajaskey.common.DateTime.copy(dateTime42);
    boolean boolean49 = dateTime32.sameDate(dateTime48);
    net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime(100L);
    double double56 = dateTime53.getDeltaYears(dateTime55);
    boolean boolean57 = dateTime48.isGreaterThan(dateTime53);
    int int58 = dateTime53.getDayOfWeek();
    boolean boolean59 = dateTime22.isGreaterThan(dateTime53);
    long long60 = dateTime19.getDeltaMilliSeconds(dateTime53);
    int int61 = dateTime53.getDayOfMonth();
    net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime(100L);
    double double68 = dateTime65.getDeltaYears(dateTime67);
    int int69 = dateTime65.getHour();
    net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime75 = new net.ajaskey.common.DateTime(100L);
    double double76 = dateTime73.getDeltaYears(dateTime75);
    boolean boolean77 = dateTime75.isWeekday();
    java.util.Date date78 = dateTime75.getTime();
    java.lang.String str79 = dateTime75.toString();
    net.ajaskey.common.DateTime dateTime81 = new net.ajaskey.common.DateTime(100L);
    int int82 = dateTime81.getMs();
    net.ajaskey.common.DateTime dateTime86 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime88 = new net.ajaskey.common.DateTime(100L);
    double double89 = dateTime86.getDeltaYears(dateTime88);
    java.text.SimpleDateFormat simpleDateFormat90 = dateTime86.getSdf();
    boolean boolean91 = dateTime81.isLessThanOrEqual(dateTime86);
    boolean boolean92 = dateTime75.isLessThan(dateTime86);
    java.lang.String str93 = dateTime75.toString();
    boolean boolean94 = dateTime65.sameDate(dateTime75);
    java.lang.String str95 = dateTime65.format();
    net.ajaskey.common.DateTime dateTime96 = null;
    boolean boolean97 = dateTime65.isEqual(dateTime96);
    boolean boolean98 = net.ajaskey.common.Utils.sameMonth(dateTime53, dateTime96);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNull(dateTime18);
    org.junit.Assert.assertNotNull(dateTime19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "January" + "'", str27, "January");
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat36);
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1972.041095890411d) + "'", double43 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertNull(dateTime47);
    org.junit.Assert.assertNotNull(dateTime48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1972.041095890411d) + "'", double56 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-62190298597820L) + "'", long60 == (-62190298597820L));
    org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
    org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1972.041095890411d) + "'", double68 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
    org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1972.041095890411d) + "'", double76 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    org.junit.Assert.assertNotNull(date78);
    org.junit.Assert.assertEquals(date78.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str79 + "' != '" + "31-Dec-1969" + "'", str79, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int82 + "' != '" + 100 + "'", int82 == 100);
    org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-1972.041095890411d) + "'", double89 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat90);
    org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    org.junit.Assert.assertEquals("'" + str93 + "' != '" + "31-Dec-1969" + "'", str93, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    org.junit.Assert.assertEquals("'" + str95 + "' != '" + "BAD-DATE-FORMAT" + "'", str95, "BAD-DATE-FORMAT");
    org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
  }

  @Test
  public void test286() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test286");
    net.ajaskey.common.Utils.makeDir("                                                                                               52.00");
  }

  @Test
  public void test287() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test287");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat5 = null;
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double9 = dateTime6.getDeltaYears(dateTime8);
    boolean boolean10 = dateTime3.isLessThan(dateTime8);
    int int11 = dateTime3.getHour();
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
    double double18 = dateTime15.getDeltaYears(dateTime17);
    java.text.SimpleDateFormat simpleDateFormat20 = null;
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat20);
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double24 = dateTime21.getDeltaYears(dateTime23);
    boolean boolean25 = dateTime21.isWeekday();
    boolean boolean26 = dateTime15.sameDate(dateTime21);
    java.text.SimpleDateFormat simpleDateFormat28 = null;
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat28);
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double32 = dateTime29.getDeltaYears(dateTime31);
    net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean37 = dateTime31.isEqual(dateTime36);
    dateTime15.set(dateTime36);
    boolean boolean39 = net.ajaskey.common.Utils.sameDate(dateTime3, dateTime36);
    java.util.Date date40 = dateTime3.getTime();
    net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime(100L);
    double double47 = dateTime44.getDeltaYears(dateTime46);
    java.text.SimpleDateFormat simpleDateFormat48 = dateTime44.getSdf();
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime(100L);
    double double55 = dateTime52.getDeltaYears(dateTime54);
    boolean boolean56 = dateTime54.isWeekday();
    net.ajaskey.common.DateTime dateTime59 = dateTime54.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime60 = net.ajaskey.common.DateTime.copy(dateTime54);
    boolean boolean61 = dateTime44.sameDate(dateTime60);
    net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime(100L);
    int int64 = dateTime63.getMs();
    net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime(100L);
    double double71 = dateTime68.getDeltaYears(dateTime70);
    java.text.SimpleDateFormat simpleDateFormat72 = dateTime68.getSdf();
    boolean boolean73 = dateTime63.isLessThanOrEqual(dateTime68);
    java.lang.String str74 = dateTime63.getDay();
    boolean boolean75 = dateTime60.isLessThanOrEqual(dateTime63);
    long long76 = dateTime3.getDeltaDays(dateTime63);
    net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime(100L);
    int int79 = dateTime78.getMs();
    net.ajaskey.common.DateTime dateTime83 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime85 = new net.ajaskey.common.DateTime(100L);
    double double86 = dateTime83.getDeltaYears(dateTime85);
    java.text.SimpleDateFormat simpleDateFormat87 = dateTime83.getSdf();
    boolean boolean88 = dateTime78.isLessThanOrEqual(dateTime83);
    net.ajaskey.common.DateTime dateTime90 = new net.ajaskey.common.DateTime(100L);
    int int91 = dateTime90.getMs();
    java.lang.String str92 = dateTime90.toString();
    net.ajaskey.common.DateTime dateTime94 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int95 = dateTime94.getHour();
    int int96 = dateTime94.getDayOfMonth();
    dateTime90.set(dateTime94);
    double double98 = dateTime83.getDeltaYears(dateTime94);
    double double99 = dateTime63.getDeltaYears(dateTime94);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1972.041095890411d) + "'", double18 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Thu Apr 10 14:03:22 MST 2");
    org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1972.041095890411d) + "'", double47 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat48);
    org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1972.041095890411d) + "'", double55 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    org.junit.Assert.assertNull(dateTime59);
    org.junit.Assert.assertNotNull(dateTime60);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
    org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1972.041095890411d) + "'", double71 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat72);
    org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Wednesday" + "'", str74, "Wednesday");
    org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-719795L) + "'", long76 == (-719795L));
    org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
    org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1972.041095890411d) + "'", double86 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat87);
    org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    org.junit.Assert.assertTrue("'" + int91 + "' != '" + 100 + "'", int91 == 100);
    org.junit.Assert.assertEquals("'" + str92 + "' != '" + "31-Dec-1969" + "'", str92, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int95 + "' != '" + 5 + "'", int95 == 5);
    org.junit.Assert.assertTrue("'" + int96 + "' != '" + 31 + "'", int96 == 31);
    org.junit.Assert.assertTrue("'" + double98 + "' != '" + (-1972.041095890411d) + "'", double98 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double99 + "' != '" + 0.0d + "'", double99 == 0.0d);
  }

  @Test
  public void test288() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test288");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.lang.String str3 = dateTime1.toString();
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int6 = dateTime5.getHour();
    int int7 = dateTime5.getDayOfMonth();
    dateTime1.set(dateTime5);
    int int9 = dateTime5.getMs();
    java.lang.String str10 = dateTime5.toFullString();
    boolean boolean11 = dateTime5.isNull();
    int int12 = dateTime5.getDayOfWeek();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str10, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
  }

  @Test
  public void test289() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test289");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-62190298597863L), 0);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
  }

  @Test
  public void test290() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test290");
    java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, 8);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     100" + "'", str2, "     100");
  }

  @Test
  public void test291() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test291");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("           365");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test292() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test292");
    net.ajaskey.common.DateTime dateTime0 = new net.ajaskey.common.DateTime();
    java.text.SimpleDateFormat simpleDateFormat2 = null;
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat2);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    int int7 = dateTime5.getDayOfYear();
    boolean boolean8 = dateTime0.isLessThan(dateTime5);
    net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime(100L);
    int int11 = dateTime10.getMs();
    java.lang.String str12 = dateTime10.toString();
    int int13 = dateTime10.getMs();
    java.util.Calendar calendar14 = dateTime10.getCal();
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(dateTime10);
    java.util.Calendar calendar16 = dateTime10.getCal();
    boolean boolean17 = dateTime0.isGreaterThanOrEqual(dateTime10);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "31-Dec-1969" + "'", str12, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    org.junit.Assert.assertNotNull(calendar14);
    org.junit.Assert.assertEquals(calendar14.toString(),
        "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertNotNull(calendar16);
    org.junit.Assert.assertEquals(calendar16.toString(),
        "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test293() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test293");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    net.ajaskey.common.DateTime dateTime10 = dateTime5.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime11 = net.ajaskey.common.DateTime.copy(dateTime5);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    dateTime13.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str18 = dateTime13.getMonth();
    int int19 = dateTime13.getMs();
    java.lang.String str21 = dateTime13
        .format("                                                                                               52.00");
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
    dateTime23.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str28 = dateTime23.getMonth();
    long long29 = dateTime13.getDeltaDays(dateTime23);
    boolean boolean30 = dateTime11.isGreaterThan(dateTime23);
    java.lang.String str31 = dateTime23.getDay();
    java.lang.String str32 = dateTime23.getDay();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(dateTime10);
    org.junit.Assert.assertNotNull(dateTime11);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "January" + "'", str18, "January");
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "                                                                                               52.00" + "'", str21,
        "                                                                                               52.00");
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "January" + "'", str28, "January");
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Saturday" + "'", str31, "Saturday");
    org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Saturday" + "'", str32, "Saturday");
  }

  @Test
  public void test294() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test294");
    java.lang.String str2 = net.ajaskey.common.Utils.ifmt(2, 9);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        2" + "'", str2, "        2");
  }

  @Test
  public void test295() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test295");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 14:03:15", false);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test296() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test296");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    java.lang.String str9 = dateTime5.toString();
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(3, (int) '4', (int) (byte) 0);
    boolean boolean14 = dateTime5.isGreaterThan(dateTime13);
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(dateTime13);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-Dec-1969" + "'", str9, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
  }

  @Test
  public void test297() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test297");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    java.lang.String str9 = dateTime5.toString();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat12 = dateTime11.getSdf();
    boolean boolean13 = dateTime5.sameDate(dateTime11);
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
    int int16 = dateTime15.getMs();
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
    double double23 = dateTime20.getDeltaYears(dateTime22);
    java.text.SimpleDateFormat simpleDateFormat24 = dateTime20.getSdf();
    boolean boolean25 = dateTime15.isLessThanOrEqual(dateTime20);
    boolean boolean26 = net.ajaskey.common.Utils.sameMonth(dateTime5, dateTime20);
    java.lang.String str28 = dateTime20.format("Thu 10-Apr-0002 14:03:11");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-Dec-1969" + "'", str9, "31-Dec-1969");
    org.junit.Assert.assertNull(simpleDateFormat12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1972.041095890411d) + "'", double23 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "BAD-DATE-FORMAT" + "'", str28, "BAD-DATE-FORMAT");
  }

  @Test
  public void test298() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test298");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    int int7 = dateTime1.getMs();
    java.lang.String str9 = dateTime1.format("                                                                                               52.00");
    int int10 = dateTime1.getSecond();
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(0L);
    java.lang.String str13 = dateTime12.format();
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat16 = dateTime15.getSdf();
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat22 = null;
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat22);
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double26 = dateTime23.getDeltaYears(dateTime25);
    boolean boolean27 = dateTime20.isLessThan(dateTime25);
    int int28 = dateTime20.getHour();
    long long29 = dateTime15.getDeltaDays(dateTime20);
    java.lang.String str30 = dateTime15.toString();
    dateTime15.add(1969, 9);
    dateTime12.set(dateTime15);
    boolean boolean35 = dateTime1.isLessThanOrEqual(dateTime12);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "                                                                                               52.00" + "'", str9,
        "                                                                                               52.00");
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "BAD-DATE-FORMAT" + "'", str13, "BAD-DATE-FORMAT");
    org.junit.Assert.assertNull(simpleDateFormat16);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 719795L + "'", long29 == 719795L);
    org.junit.Assert.assertEquals("'" + str30 + "' != '" + "31-Dec-1969" + "'", str30, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
  }

  @Test
  public void test299() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test299");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl(
        "JanuaryThu 10-Apr-0002 14:03:11Thu 10-Apr-0002 14:03:11                                                                                               52.00Thu 10-Apr-0002 14:03:11hi!Thu 10-Apr-0002 14:03:11");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test300() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test300");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(10, (int) '4', 2);
    java.lang.String str4 = dateTime3.getDay();
    java.text.SimpleDateFormat simpleDateFormat7 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat9 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat10 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime("", simpleDateFormat9, simpleDateFormat10);
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat7,
        simpleDateFormat10);
    java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("", simpleDateFormat10, simpleDateFormat13);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean25 = dateTime19.isEqual(dateTime24);
    java.text.SimpleDateFormat simpleDateFormat27 = null;
    java.text.SimpleDateFormat simpleDateFormat28 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat27, simpleDateFormat28);
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime(100L);
    double double36 = dateTime33.getDeltaYears(dateTime35);
    boolean boolean37 = dateTime35.isWeekday();
    java.util.Date date38 = dateTime35.getTime();
    java.lang.String str39 = dateTime35.toString();
    net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime(100L);
    int int42 = dateTime41.getMs();
    net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime(100L);
    double double49 = dateTime46.getDeltaYears(dateTime48);
    java.text.SimpleDateFormat simpleDateFormat50 = dateTime46.getSdf();
    boolean boolean51 = dateTime41.isLessThanOrEqual(dateTime46);
    boolean boolean52 = dateTime35.isLessThan(dateTime46);
    java.lang.String str53 = dateTime35.toString();
    long long54 = dateTime29.getDeltaMilliSeconds(dateTime35);
    net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime(100L);
    double double61 = dateTime58.getDeltaYears(dateTime60);
    boolean boolean62 = dateTime60.isWeekday();
    java.util.Date date63 = dateTime60.getTime();
    int int64 = dateTime60.getMinute();
    boolean boolean65 = dateTime29.sameDate(dateTime60);
    int int66 = dateTime19.getYears(dateTime60);
    java.util.Date date67 = dateTime60.getTime();
    dateTime14.set(date67);
    dateTime3.set(date67);
    net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime(date67);
    dateTime70.setFirstWorkDay();
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Wednesday" + "'", str4, "Wednesday");
    org.junit.Assert.assertNotNull(simpleDateFormat7);
    org.junit.Assert.assertNotNull(simpleDateFormat9);
    org.junit.Assert.assertNotNull(simpleDateFormat10);
    org.junit.Assert.assertNotNull(simpleDateFormat13);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat28);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1972.041095890411d) + "'", double36 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    org.junit.Assert.assertNotNull(date38);
    org.junit.Assert.assertEquals(date38.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "31-Dec-1969" + "'", str39, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1972.041095890411d) + "'", double49 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat50);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    org.junit.Assert.assertEquals("'" + str53 + "' != '" + "31-Dec-1969" + "'", str53, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1972.041095890411d) + "'", double61 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    org.junit.Assert.assertNotNull(date63);
    org.junit.Assert.assertEquals(date63.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    org.junit.Assert.assertNotNull(date67);
    org.junit.Assert.assertEquals(date67.toString(), "Wed Dec 31 17:00:00 MST 1969");
  }

  @Test
  public void test301() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test301");
    net.ajaskey.common.Utils.makeDir(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969");
  }

  @Test
  public void test302() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test302");
    net.ajaskey.common.Utils.sleep(14);
  }

  @Test
  public void test303() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test303");
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("2", "31-Dec-1969");
  }

  @Test
  public void test304() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test304");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    net.ajaskey.common.DateTime dateTime18 = dateTime13.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime19 = net.ajaskey.common.DateTime.copy(dateTime13);
    boolean boolean20 = dateTime3.sameDate(dateTime19);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    double double27 = dateTime24.getDeltaYears(dateTime26);
    boolean boolean28 = dateTime19.isGreaterThan(dateTime24);
    int int29 = dateTime19.getDayOfMonth();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNull(dateTime18);
    org.junit.Assert.assertNotNull(dateTime19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1972.041095890411d) + "'", double27 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + 31 + "'", int29 == 31);
  }

  @Test
  public void test305() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test305");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat2 = dateTime1.getSdf();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime6.isLessThan(dateTime11);
    int int14 = dateTime6.getHour();
    long long15 = dateTime1.getDeltaDays(dateTime6);
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int18 = dateTime17.getHour();
    int int19 = dateTime17.getDayOfMonth();
    int int20 = dateTime17.getYear();
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(dateTime17);
    java.lang.String str22 = dateTime17.format();
    boolean boolean23 = dateTime1.isGreaterThan(dateTime17);
    boolean boolean24 = dateTime1.isNull();
    net.ajaskey.common.DateTime dateTime27 = dateTime1.parse("          1.00",
        "JanuaryThu 10-Apr-0002 14:03:11Thu 10-Apr-0002 14:03:11                                                                                               52.00Thu 10-Apr-0002 14:03:11hi!Thu 10-Apr-0002 14:03:11");
    org.junit.Assert.assertNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 719795L + "'", long15 == 719795L);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 31 + "'", int19 == 31);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969 + "'", int20 == 1969);
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "BAD-DATE-FORMAT" + "'", str22, "BAD-DATE-FORMAT");
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNull(dateTime27);
  }

  @Test
  public void test306() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test306");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime9.isWeekday();
    boolean boolean14 = dateTime3.sameDate(dateTime9);
    dateTime9.add((int) (short) 0, 5);
    dateTime9.set((int) (short) 100, (int) (short) 10, 14);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
  }

  @Test
  public void test307() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test307");
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime(100L);
    double double7 = dateTime4.getDeltaYears(dateTime6);
    boolean boolean8 = dateTime6.isWeekday();
    java.util.Date date9 = dateTime6.getTime();
    int int10 = dateTime6.getMinute();
    java.text.SimpleDateFormat simpleDateFormat12 = null;
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat12);
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double16 = dateTime13.getDeltaYears(dateTime15);
    net.ajaskey.common.DateTime dateTime17 = net.ajaskey.common.DateTime.copy(dateTime13);
    boolean boolean18 = net.ajaskey.common.Utils.sameDate(dateTime6, dateTime13);
    java.text.SimpleDateFormat simpleDateFormat21 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat23 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat24 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("", simpleDateFormat23, simpleDateFormat24);
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat21,
        simpleDateFormat24);
    java.text.SimpleDateFormat simpleDateFormat28 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat29 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("", simpleDateFormat28, simpleDateFormat29);
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("", simpleDateFormat24, simpleDateFormat29);
    dateTime6.setSdf(simpleDateFormat24);
    java.text.SimpleDateFormat simpleDateFormat33 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 14:03:11", simpleDateFormat24, simpleDateFormat33);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1972.041095890411d) + "'", double7 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertNotNull(date9);
    org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertNull(dateTime17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat21);
    org.junit.Assert.assertNotNull(simpleDateFormat23);
    org.junit.Assert.assertNotNull(simpleDateFormat24);
    org.junit.Assert.assertNotNull(simpleDateFormat28);
    org.junit.Assert.assertNotNull(simpleDateFormat29);
    org.junit.Assert.assertNotNull(simpleDateFormat33);
  }

  @Test
  public void test308() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test308");
    net.ajaskey.common.TextUtils.printline("          1.00");
  }

  @Test
  public void test309() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test309");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test310() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test310");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("100", false);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test312() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test312");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    boolean boolean6 = dateTime2.isWeekday();
    net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
    double double13 = dateTime10.getDeltaYears(dateTime12);
    boolean boolean14 = dateTime12.isWeekday();
    java.util.Date date15 = dateTime12.getTime();
    int int16 = dateTime12.getMinute();
    java.text.SimpleDateFormat simpleDateFormat18 = null;
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat18);
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double22 = dateTime19.getDeltaYears(dateTime21);
    net.ajaskey.common.DateTime dateTime23 = net.ajaskey.common.DateTime.copy(dateTime19);
    boolean boolean24 = net.ajaskey.common.Utils.sameDate(dateTime12, dateTime19);
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(100L);
    double double31 = dateTime28.getDeltaYears(dateTime30);
    java.text.SimpleDateFormat simpleDateFormat33 = null;
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat33);
    net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double37 = dateTime34.getDeltaYears(dateTime36);
    boolean boolean38 = dateTime34.isWeekday();
    boolean boolean39 = dateTime28.sameDate(dateTime34);
    java.text.SimpleDateFormat simpleDateFormat41 = null;
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat41);
    net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double45 = dateTime42.getDeltaYears(dateTime44);
    net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean50 = dateTime44.isEqual(dateTime49);
    dateTime28.set(dateTime49);
    net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int54 = dateTime53.getDayOfWeek();
    double double55 = dateTime49.getDeltaYears(dateTime53);
    java.text.SimpleDateFormat simpleDateFormat57 = null;
    net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat57);
    net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double61 = dateTime58.getDeltaYears(dateTime60);
    net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean66 = dateTime60.isEqual(dateTime65);
    java.util.Calendar calendar67 = dateTime60.getCal();
    dateTime49.set(calendar67);
    dateTime12.set(calendar67);
    dateTime2.set(calendar67);
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1972.041095890411d) + "'", double13 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(date15);
    org.junit.Assert.assertEquals(date15.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertNull(dateTime23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1972.041095890411d) + "'", double31 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
    org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1972.041095890411d) + "'", double55 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    org.junit.Assert.assertNotNull(calendar67);
    org.junit.Assert.assertEquals(calendar67.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
  }

  @Test
  public void test313() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test313");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test314() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test314");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime9.isWeekday();
    boolean boolean14 = dateTime3.sameDate(dateTime9);
    boolean boolean15 = dateTime3.isNull();
    java.lang.String str16 = dateTime3.format();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "BAD-DATE-FORMAT" + "'", str16, "BAD-DATE-FORMAT");
  }

  @Test
  public void test315() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test315");
    java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 1, (int) (byte) 1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
  }

  @Test
  public void test316() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test316");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.util.Calendar calendar11 = dateTime4.getCal();
    java.lang.String str12 = dateTime4.toFullString();
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
    double double19 = dateTime16.getDeltaYears(dateTime18);
    java.util.Date date20 = dateTime16.getTime();
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(date20);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(date20);
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(date20);
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((long) 1);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
    double double32 = dateTime29.getDeltaYears(dateTime31);
    boolean boolean33 = dateTime31.isWeekday();
    java.util.Date date34 = dateTime31.getTime();
    java.lang.String str35 = dateTime31.toString();
    net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
    int int38 = dateTime37.getMs();
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(100L);
    double double45 = dateTime42.getDeltaYears(dateTime44);
    java.text.SimpleDateFormat simpleDateFormat46 = dateTime42.getSdf();
    boolean boolean47 = dateTime37.isLessThanOrEqual(dateTime42);
    boolean boolean48 = dateTime31.isLessThan(dateTime42);
    dateTime25.set(dateTime31);
    dateTime25.add((int) ' ', 2);
    net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime(100L);
    double double59 = dateTime56.getDeltaYears(dateTime58);
    java.util.Date date60 = dateTime56.getTime();
    net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime(date60);
    net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime(date60);
    net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime(12, 4, (-1));
    int int67 = dateTime62.getYears(dateTime66);
    long long68 = dateTime25.getDeltaMilliSeconds(dateTime66);
    boolean boolean69 = dateTime23.isGreaterThanOrEqual(dateTime25);
    boolean boolean70 = dateTime4.sameDate(dateTime25);
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(calendar11);
    org.junit.Assert.assertEquals(calendar11.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str12, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Thu Apr 10 14:03:23 MST 2");
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1972.041095890411d) + "'", double32 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertNotNull(date34);
    org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str35 + "' != '" + "31-Dec-1969" + "'", str35, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1972.041095890411d) + "'", double45 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat46);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1972.041095890411d) + "'", double59 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(date60);
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Thu Apr 10 14:03:23 MST 2");
    org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-61778343397006L) + "'", long68 == (-61778343397006L));
    org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
  }

  @Test
  public void test317() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test317");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat2 = dateTime1.getSdf();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime6.isLessThan(dateTime11);
    int int14 = dateTime6.getHour();
    long long15 = dateTime1.getDeltaDays(dateTime6);
    java.lang.String str16 = dateTime1.getMonth();
    java.lang.String str18 = dateTime1.format("                                                                                                  10");
    dateTime1.setFirstWorkDay();
    org.junit.Assert.assertNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 719795L + "'", long15 == 719795L);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "December" + "'", str16, "December");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "                                                                                                  10" + "'", str18,
        "                                                                                                  10");
  }

  @Test
  public void test318() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test318");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("January", "BAD-DATE-FORMAT");
    boolean boolean7 = net.ajaskey.common.Utils.sameMonth(dateTime3, dateTime6);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    dateTime19.set(0, 12, 0);
    boolean boolean25 = net.ajaskey.common.Utils.sameMonth(dateTime11, dateTime19);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
    double double32 = dateTime29.getDeltaYears(dateTime31);
    java.text.SimpleDateFormat simpleDateFormat33 = dateTime29.getSdf();
    net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime(100L);
    double double40 = dateTime37.getDeltaYears(dateTime39);
    boolean boolean41 = dateTime39.isWeekday();
    net.ajaskey.common.DateTime dateTime44 = dateTime39.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime45 = net.ajaskey.common.DateTime.copy(dateTime39);
    boolean boolean46 = dateTime29.sameDate(dateTime45);
    net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int49 = dateTime48.getDayOfWeek();
    int int50 = dateTime45.getYears(dateTime48);
    long long51 = dateTime11.getDeltaMilliSeconds(dateTime45);
    net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime(100L);
    dateTime53.set((int) (byte) 100, (-1), (int) '#');
    java.text.SimpleDateFormat simpleDateFormat58 = dateTime53.getSdf();
    dateTime11.set(dateTime53);
    boolean boolean60 = dateTime3.isLessThanOrEqual(dateTime53);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1972.041095890411d) + "'", double32 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat33);
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1972.041095890411d) + "'", double40 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    org.junit.Assert.assertNull(dateTime44);
    org.junit.Assert.assertNotNull(dateTime45);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
    org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 62190298596935L + "'", long51 == 62190298596935L);
    org.junit.Assert.assertNull(simpleDateFormat58);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
  }

  @Test
  public void test319() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test319");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 1);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(100L);
    double double8 = dateTime5.getDeltaYears(dateTime7);
    boolean boolean9 = dateTime7.isWeekday();
    java.util.Date date10 = dateTime7.getTime();
    java.lang.String str11 = dateTime7.toString();
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    int int14 = dateTime13.getMs();
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
    double double21 = dateTime18.getDeltaYears(dateTime20);
    java.text.SimpleDateFormat simpleDateFormat22 = dateTime18.getSdf();
    boolean boolean23 = dateTime13.isLessThanOrEqual(dateTime18);
    boolean boolean24 = dateTime7.isLessThan(dateTime18);
    dateTime1.set(dateTime7);
    dateTime1.add((int) ' ', 2);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    java.util.Date date36 = dateTime32.getTime();
    net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(date36);
    net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime(date36);
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(12, 4, (-1));
    int int43 = dateTime38.getYears(dateTime42);
    long long44 = dateTime1.getDeltaMilliSeconds(dateTime42);
    java.lang.String str45 = dateTime42.getMonth();
    dateTime42.setFirstWorkDay();
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1972.041095890411d) + "'", double8 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "31-Dec-1969" + "'", str11, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Thu Apr 10 14:03:23 MST 2");
    org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-61778343396886L) + "'", long44 == (-61778343396886L));
    org.junit.Assert.assertEquals("'" + str45 + "' != '" + "April" + "'", str45, "April");
  }

  @Test
  public void test320() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test320");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("          1.00", false);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test321() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test321");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.util.Date date7 = dateTime3.getTime();
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(dateTime3);
    java.util.Calendar calendar9 = dateTime8.getCal();
    net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime(calendar9);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Thu Apr 10 14:03:23 MST 2");
    org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-62190298596724,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=23,MILLISECOND=276,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
  }

  @Test
  public void test322() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test322");
    net.ajaskey.common.Utils.NL = "Thu 10-Apr-0002 14:03:14";
  }

  @Test
  public void test323() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test323");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    dateTime1.setSdf(simpleDateFormat3);
    int int5 = dateTime1.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    java.util.Calendar calendar13 = dateTime9.getCal();
    dateTime1.set(calendar13);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean25 = dateTime19.isEqual(dateTime24);
    java.util.Calendar calendar26 = dateTime19.getCal();
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(calendar26);
    dateTime1.set(calendar26);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    java.lang.String str36 = dateTime32.toFullString();
    boolean boolean37 = net.ajaskey.common.Utils.sameDate(dateTime1, dateTime32);
    dateTime1.add(10, (int) (short) -1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=-62190298596699,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=23,MILLISECOND=301,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(calendar26);
    org.junit.Assert.assertEquals(calendar26.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Thu 10-Apr-0002 14:03:23" + "'", str36, "Thu 10-Apr-0002 14:03:23");
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
  }

  @Test
  public void test324() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test324");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 14, 1970);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
  }

  @Test
  public void test325() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test325");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat2 = dateTime1.getSdf();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime6.isLessThan(dateTime11);
    int int14 = dateTime6.getHour();
    long long15 = dateTime1.getDeltaDays(dateTime6);
    java.lang.String str16 = dateTime1.toString();
    int int17 = dateTime1.getYear();
    int int18 = dateTime1.getYear();
    int int19 = dateTime1.getMs();
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(100L);
    double double26 = dateTime23.getDeltaYears(dateTime25);
    java.text.SimpleDateFormat simpleDateFormat28 = null;
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat28);
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double32 = dateTime29.getDeltaYears(dateTime31);
    boolean boolean33 = dateTime29.isWeekday();
    boolean boolean34 = dateTime23.sameDate(dateTime29);
    java.text.SimpleDateFormat simpleDateFormat36 = null;
    net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat36);
    net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double40 = dateTime37.getDeltaYears(dateTime39);
    net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean45 = dateTime39.isEqual(dateTime44);
    dateTime23.set(dateTime44);
    net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double49 = dateTime44.getDeltaYears(dateTime48);
    int int50 = dateTime48.getDayOfWeek();
    boolean boolean51 = dateTime1.isEqual(dateTime48);
    net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime(100L);
    double double58 = dateTime55.getDeltaYears(dateTime57);
    java.text.SimpleDateFormat simpleDateFormat60 = null;
    net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat60);
    net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double64 = dateTime61.getDeltaYears(dateTime63);
    boolean boolean65 = dateTime61.isWeekday();
    boolean boolean66 = dateTime55.sameDate(dateTime61);
    java.text.SimpleDateFormat simpleDateFormat68 = null;
    net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat68);
    net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double72 = dateTime69.getDeltaYears(dateTime71);
    net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean77 = dateTime71.isEqual(dateTime76);
    dateTime55.set(dateTime76);
    net.ajaskey.common.DateTime dateTime80 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int81 = dateTime80.getDayOfWeek();
    double double82 = dateTime76.getDeltaYears(dateTime80);
    java.text.SimpleDateFormat simpleDateFormat83 = dateTime76.getSdf();
    boolean boolean84 = dateTime48.isLessThan(dateTime76);
    net.ajaskey.common.DateTime dateTime86 = dateTime48
        .parse("                                                                                                   7");
    // The following exception was thrown during execution in test generation
    try {
      java.util.Date date87 = dateTime86.getTime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 719795L + "'", long15 == 719795L);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "31-Dec-1969" + "'", str16, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1969 + "'", int17 == 1969);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1969 + "'", int18 == 1969);
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1972.041095890411d) + "'", double26 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1972.041095890411d) + "'", double49 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1972.041095890411d) + "'", double58 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    org.junit.Assert.assertTrue("'" + int81 + "' != '" + 4 + "'", int81 == 4);
    org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1972.041095890411d) + "'", double82 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat83);
    org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    org.junit.Assert.assertNull(dateTime86);
  }

  @Test
  public void test326() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test326");
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        "Fri 31-Dec-0001 17:00:00");
  }

  @Test
  public void test327() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test327");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 7);
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(100L);
    int int4 = dateTime3.getMs();
    java.lang.String str5 = dateTime3.toString();
    int int6 = dateTime3.getMs();
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) 2);
    boolean boolean9 = dateTime3.isLessThanOrEqual(dateTime8);
    boolean boolean10 = dateTime1.isLessThan(dateTime3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "31-Dec-1969" + "'", str5, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
  }

  @Test
  public void test328() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test328");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int2 = dateTime1.getHour();
    int int3 = dateTime1.getDayOfMonth();
    int int4 = dateTime1.getYear();
    java.lang.Class<?> wildcardClass5 = dateTime1.getClass();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1969 + "'", int4 == 1969);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test329() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test329");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat2 = dateTime1.getSdf();
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime(100L);
    int int5 = dateTime4.getMs();
    java.lang.String str6 = dateTime4.toString();
    int int7 = dateTime4.getMs();
    java.util.Calendar calendar8 = dateTime4.getCal();
    int int9 = dateTime1.getYears(dateTime4);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
    double double16 = dateTime13.getDeltaYears(dateTime15);
    boolean boolean17 = dateTime15.isWeekday();
    java.util.Date date18 = dateTime15.getTime();
    java.lang.String str19 = dateTime15.toString();
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
    int int22 = dateTime21.getMs();
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(100L);
    double double29 = dateTime26.getDeltaYears(dateTime28);
    java.text.SimpleDateFormat simpleDateFormat30 = dateTime26.getSdf();
    boolean boolean31 = dateTime21.isLessThanOrEqual(dateTime26);
    boolean boolean32 = dateTime15.isLessThan(dateTime26);
    java.lang.String str33 = dateTime15.toString();
    long long34 = dateTime4.getDeltaMilliSeconds(dateTime15);
    net.ajaskey.common.DateTime dateTime36 = dateTime4.parse("                           -719,795");
    org.junit.Assert.assertNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "31-Dec-1969" + "'", str6, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    org.junit.Assert.assertNotNull(calendar8);
    org.junit.Assert.assertEquals(calendar8.toString(),
        "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1972.041095890411d) + "'", double16 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(date18);
    org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "31-Dec-1969" + "'", str19, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1972.041095890411d) + "'", double29 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertEquals("'" + str33 + "' != '" + "31-Dec-1969" + "'", str33, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    org.junit.Assert.assertNull(dateTime36);
  }

  @Test
  public void test330() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test330");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) ' ', (int) '4');
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
  }

  @Test
  public void test331() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test331");
    net.ajaskey.common.Utils.TAB = "                                                                                                  10";
  }

  @Test
  public void test332() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test332");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    int int7 = dateTime1.getMs();
    java.lang.String str9 = dateTime1.format("                                                                                               52.00");
    int int10 = dateTime1.getSecond();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(dateTime1);
    dateTime11.add(5, 0);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "                                                                                               52.00" + "'", str9,
        "                                                                                               52.00");
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
  }

  @Test
  public void test333() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test333");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat5 = null;
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double9 = dateTime6.getDeltaYears(dateTime8);
    boolean boolean10 = dateTime3.isLessThan(dateTime8);
    int int11 = dateTime3.getHour();
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
    double double18 = dateTime15.getDeltaYears(dateTime17);
    java.text.SimpleDateFormat simpleDateFormat20 = null;
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat20);
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double24 = dateTime21.getDeltaYears(dateTime23);
    boolean boolean25 = dateTime21.isWeekday();
    boolean boolean26 = dateTime15.sameDate(dateTime21);
    java.text.SimpleDateFormat simpleDateFormat28 = null;
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat28);
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double32 = dateTime29.getDeltaYears(dateTime31);
    net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean37 = dateTime31.isEqual(dateTime36);
    dateTime15.set(dateTime36);
    boolean boolean39 = net.ajaskey.common.Utils.sameDate(dateTime3, dateTime36);
    net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((long) 5);
    int int42 = dateTime3.getYears(dateTime41);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1972.041095890411d) + "'", double18 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1967 + "'", int42 == 1967);
  }

  @Test
  public void test334() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test334");
    java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat7 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime("", simpleDateFormat6, simpleDateFormat7);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat4, simpleDateFormat7);
    java.text.SimpleDateFormat simpleDateFormat11 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat12 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("", simpleDateFormat11, simpleDateFormat12);
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("", simpleDateFormat7, simpleDateFormat12);
    java.text.SimpleDateFormat simpleDateFormat17 = null;
    java.text.SimpleDateFormat simpleDateFormat18 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat17, simpleDateFormat18);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat18);
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat7, simpleDateFormat18);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("      0.00", simpleDateFormat7);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(100L);
    int int25 = dateTime24.getMs();
    java.text.SimpleDateFormat simpleDateFormat26 = net.ajaskey.common.Utils.sdf;
    dateTime24.setSdf(simpleDateFormat26);
    int int28 = dateTime24.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    java.util.Calendar calendar36 = dateTime32.getCal();
    dateTime24.set(calendar36);
    java.text.SimpleDateFormat simpleDateFormat39 = null;
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat39);
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double43 = dateTime40.getDeltaYears(dateTime42);
    net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean48 = dateTime42.isEqual(dateTime47);
    java.util.Calendar calendar49 = dateTime42.getCal();
    net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(calendar49);
    dateTime24.set(calendar49);
    int int52 = dateTime24.getDayOfYear();
    net.ajaskey.common.DateTime dateTime55 = dateTime24.parse("         52", "Thursday");
    long long56 = dateTime22.getDeltaDays(dateTime24);
    org.junit.Assert.assertNotNull(simpleDateFormat4);
    org.junit.Assert.assertNotNull(simpleDateFormat6);
    org.junit.Assert.assertNotNull(simpleDateFormat7);
    org.junit.Assert.assertNotNull(simpleDateFormat11);
    org.junit.Assert.assertNotNull(simpleDateFormat12);
    org.junit.Assert.assertNotNull(simpleDateFormat18);
    org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat26);
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(calendar36);
// flaky:         org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=-62190298596465,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=23,MILLISECOND=535,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertNotNull(calendar49);
    org.junit.Assert.assertEquals(calendar49.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + int52 + "' != '" + 365 + "'", int52 == 365);
    org.junit.Assert.assertNull(dateTime55);
    org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
  }

  @Test
  public void test335() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test335");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    java.lang.String str9 = dateTime5.toString();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    int int12 = dateTime11.getMs();
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
    double double19 = dateTime16.getDeltaYears(dateTime18);
    java.text.SimpleDateFormat simpleDateFormat20 = dateTime16.getSdf();
    boolean boolean21 = dateTime11.isLessThanOrEqual(dateTime16);
    boolean boolean22 = dateTime5.isLessThan(dateTime16);
    int int23 = dateTime5.getDayOfWeek();
    java.text.SimpleDateFormat simpleDateFormat25 = null;
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat25);
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double29 = dateTime26.getDeltaYears(dateTime28);
    net.ajaskey.common.DateTime dateTime30 = net.ajaskey.common.DateTime.copy(dateTime26);
    double double31 = dateTime5.getDeltaYears(dateTime26);
    int int32 = dateTime5.getYear();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-Dec-1969" + "'", str9, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    org.junit.Assert.assertNull(dateTime30);
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1969 + "'", int32 == 1969);
  }

  @Test
  public void test336() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test336");
    java.text.DecimalFormat decimalFormat0 = net.ajaskey.common.Utils.df;
    net.ajaskey.common.Utils.df = decimalFormat0;
    net.ajaskey.common.Utils.df = decimalFormat0;
    net.ajaskey.common.Utils.df = decimalFormat0;
    org.junit.Assert.assertNull(decimalFormat0);
  }

  @Test
  public void test337() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test337");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    dateTime1.setSdf(simpleDateFormat3);
    int int5 = dateTime1.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    java.util.Calendar calendar13 = dateTime9.getCal();
    dateTime1.set(calendar13);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean25 = dateTime19.isEqual(dateTime24);
    java.util.Calendar calendar26 = dateTime19.getCal();
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(calendar26);
    dateTime1.set(calendar26);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    java.lang.String str36 = dateTime32.toFullString();
    boolean boolean37 = net.ajaskey.common.Utils.sameDate(dateTime1, dateTime32);
    int int38 = dateTime32.getDayOfWeek();
    java.util.Date date39 = dateTime32.getTime();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=-62190298596361,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=23,MILLISECOND=639,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(calendar26);
    org.junit.Assert.assertEquals(calendar26.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Thu 10-Apr-0002 14:03:23" + "'", str36, "Thu 10-Apr-0002 14:03:23");
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
    org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Thu Apr 10 14:03:23 MST 2");
  }

  @Test
  public void test338() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test338");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime9.isWeekday();
    boolean boolean14 = dateTime3.sameDate(dateTime9);
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
    int int17 = dateTime16.getMs();
    java.text.SimpleDateFormat simpleDateFormat18 = net.ajaskey.common.Utils.sdf;
    dateTime16.setSdf(simpleDateFormat18);
    long long20 = dateTime3.getDeltaDays(dateTime16);
    java.text.SimpleDateFormat simpleDateFormat21 = dateTime16.getSdf();
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
    int int24 = dateTime23.getMs();
    java.text.SimpleDateFormat simpleDateFormat25 = net.ajaskey.common.Utils.sdf;
    dateTime23.setSdf(simpleDateFormat25);
    dateTime16.setSdf(simpleDateFormat25);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat30 = dateTime29.getSdf();
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime(100L);
    int int33 = dateTime32.getMs();
    java.lang.String str34 = dateTime32.toString();
    int int35 = dateTime32.getMs();
    java.util.Calendar calendar36 = dateTime32.getCal();
    int int37 = dateTime29.getYears(dateTime32);
    boolean boolean38 = dateTime16.isLessThan(dateTime29);
    boolean boolean39 = dateTime29.isWeekday();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat18);
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-719795L) + "'", long20 == (-719795L));
    org.junit.Assert.assertNotNull(simpleDateFormat21);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat25);
    org.junit.Assert.assertNull(simpleDateFormat30);
    org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    org.junit.Assert.assertEquals("'" + str34 + "' != '" + "31-Dec-1969" + "'", str34, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    org.junit.Assert.assertNotNull(calendar36);
    org.junit.Assert.assertEquals(calendar36.toString(),
        "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
  }

  @Test
  public void test339() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test339");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    java.lang.String str9 = dateTime5.toString();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    int int12 = dateTime11.getMs();
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
    double double19 = dateTime16.getDeltaYears(dateTime18);
    java.text.SimpleDateFormat simpleDateFormat20 = dateTime16.getSdf();
    boolean boolean21 = dateTime11.isLessThanOrEqual(dateTime16);
    boolean boolean22 = dateTime5.isLessThan(dateTime16);
    int int23 = dateTime5.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime25 = dateTime5.parse("365.00");
    int int26 = dateTime5.getHour();
    int int27 = dateTime5.getDayOfWeek();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-Dec-1969" + "'", str9, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    org.junit.Assert.assertNull(dateTime25);
    org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
  }

  @Test
  public void test340() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test340");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile(
        "JanuaryJanuaryJanuary                                                                                               52.00Januaryhi!January",
        false);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test341() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test341");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int2 = dateTime1.getHour();
    int int3 = dateTime1.getDayOfMonth();
    java.lang.String str4 = dateTime1.getDay();
    java.lang.String str6 = dateTime1.format("Invalid Time");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Wednesday" + "'", str4, "Wednesday");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "BAD-DATE-FORMAT" + "'", str6, "BAD-DATE-FORMAT");
  }

  @Test
  public void test342() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test342");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 738233L, (-1870));
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
  }

  @Test
  public void test343() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test343");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.text.SimpleDateFormat simpleDateFormat12 = null;
    java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat12, simpleDateFormat13);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
    double double21 = dateTime18.getDeltaYears(dateTime20);
    boolean boolean22 = dateTime20.isWeekday();
    java.util.Date date23 = dateTime20.getTime();
    java.lang.String str24 = dateTime20.toString();
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    int int27 = dateTime26.getMs();
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
    double double34 = dateTime31.getDeltaYears(dateTime33);
    java.text.SimpleDateFormat simpleDateFormat35 = dateTime31.getSdf();
    boolean boolean36 = dateTime26.isLessThanOrEqual(dateTime31);
    boolean boolean37 = dateTime20.isLessThan(dateTime31);
    java.lang.String str38 = dateTime20.toString();
    long long39 = dateTime14.getDeltaMilliSeconds(dateTime20);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
    double double46 = dateTime43.getDeltaYears(dateTime45);
    boolean boolean47 = dateTime45.isWeekday();
    java.util.Date date48 = dateTime45.getTime();
    int int49 = dateTime45.getMinute();
    boolean boolean50 = dateTime14.sameDate(dateTime45);
    int int51 = dateTime4.getYears(dateTime45);
    int int52 = dateTime45.getDayOfWeek();
    java.lang.String str53 = dateTime45.toString();
    net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat56 = dateTime55.getSdf();
    net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat62 = null;
    net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat62);
    net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double66 = dateTime63.getDeltaYears(dateTime65);
    boolean boolean67 = dateTime60.isLessThan(dateTime65);
    int int68 = dateTime60.getHour();
    long long69 = dateTime55.getDeltaDays(dateTime60);
    java.lang.String str70 = dateTime55.toString();
    int int71 = dateTime55.getYear();
    boolean boolean72 = dateTime45.isLessThanOrEqual(dateTime55);
    net.ajaskey.common.DateTime dateTime74 = new net.ajaskey.common.DateTime(100L);
    int int75 = dateTime74.getMs();
    java.lang.String str76 = dateTime74.toString();
    net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int79 = dateTime78.getHour();
    int int80 = dateTime78.getDayOfMonth();
    dateTime74.set(dateTime78);
    int int82 = dateTime78.getMs();
    int int83 = dateTime55.getYears(dateTime78);
    java.text.SimpleDateFormat simpleDateFormat88 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat90 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat91 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime92 = new net.ajaskey.common.DateTime("", simpleDateFormat90, simpleDateFormat91);
    net.ajaskey.common.DateTime dateTime93 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat88,
        simpleDateFormat91);
    java.text.SimpleDateFormat simpleDateFormat94 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime95 = new net.ajaskey.common.DateTime("", simpleDateFormat91, simpleDateFormat94);
    net.ajaskey.common.DateTime dateTime96 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat94);
    net.ajaskey.common.DateTime dateTime97 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat94);
    dateTime78.setSdf(simpleDateFormat94);
    java.util.Date date99 = dateTime78.getTime();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat13);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "31-Dec-1969" + "'", str24, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1972.041095890411d) + "'", double34 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "31-Dec-1969" + "'", str38, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
    org.junit.Assert.assertEquals("'" + str53 + "' != '" + "31-Dec-1969" + "'", str53, "31-Dec-1969");
    org.junit.Assert.assertNull(simpleDateFormat56);
    org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
    org.junit.Assert.assertTrue("'" + long69 + "' != '" + 719795L + "'", long69 == 719795L);
    org.junit.Assert.assertEquals("'" + str70 + "' != '" + "31-Dec-1969" + "'", str70, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1969 + "'", int71 == 1969);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
    org.junit.Assert.assertEquals("'" + str76 + "' != '" + "31-Dec-1969" + "'", str76, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int79 + "' != '" + 5 + "'", int79 == 5);
    org.junit.Assert.assertTrue("'" + int80 + "' != '" + 31 + "'", int80 == 31);
    org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    org.junit.Assert.assertNotNull(simpleDateFormat88);
    org.junit.Assert.assertNotNull(simpleDateFormat90);
    org.junit.Assert.assertNotNull(simpleDateFormat91);
    org.junit.Assert.assertNotNull(simpleDateFormat94);
    org.junit.Assert.assertNotNull(date99);
    org.junit.Assert.assertEquals(date99.toString(), "Wed Dec 31 17:00:00 MST 1969");
  }

  @Test
  public void test344() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test344");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat1, simpleDateFormat2);
    java.lang.String str4 = dateTime3.getDay();
    java.lang.String str5 = dateTime3.getMonth();
    net.ajaskey.common.DateTime dateTime6 = null;
    long long7 = dateTime3.getDeltaMilliSeconds(dateTime6);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    java.util.Date date16 = dateTime13.getTime();
    java.lang.String str17 = dateTime13.toString();
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(3, (int) '4', (int) (byte) 0);
    boolean boolean22 = dateTime13.isGreaterThan(dateTime21);
    java.text.SimpleDateFormat simpleDateFormat24 = null;
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double28 = dateTime25.getDeltaYears(dateTime27);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean33 = dateTime27.isEqual(dateTime32);
    java.util.Calendar calendar34 = dateTime27.getCal();
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime(calendar34);
    net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime(calendar34);
    boolean boolean37 = dateTime13.isLessThan(dateTime36);
    java.text.SimpleDateFormat simpleDateFormat39 = null;
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat39);
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double43 = dateTime40.getDeltaYears(dateTime42);
    boolean boolean44 = dateTime40.isWeekday();
    java.lang.String str45 = dateTime40.getDay();
    java.util.Calendar calendar46 = dateTime40.getCal();
    boolean boolean47 = dateTime13.isLessThan(dateTime40);
    net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime(dateTime40);
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime(100L);
    double double55 = dateTime52.getDeltaYears(dateTime54);
    java.text.SimpleDateFormat simpleDateFormat57 = null;
    net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat57);
    net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double61 = dateTime58.getDeltaYears(dateTime60);
    dateTime60.set(0, 12, 0);
    boolean boolean66 = net.ajaskey.common.Utils.sameMonth(dateTime52, dateTime60);
    boolean boolean67 = dateTime48.isEqual(dateTime52);
    int int68 = dateTime3.getYears(dateTime48);
    org.junit.Assert.assertNotNull(simpleDateFormat2);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UNKNOWN" + "'", str4, "UNKNOWN");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UNKNOWN" + "'", str5, "UNKNOWN");
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(date16);
    org.junit.Assert.assertEquals(date16.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "31-Dec-1969" + "'", str17, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(calendar34);
    org.junit.Assert.assertEquals(calendar34.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UNKNOWN" + "'", str45, "UNKNOWN");
    org.junit.Assert.assertNull(calendar46);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1972.041095890411d) + "'", double55 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
  }

  @Test
  public void test345() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test345");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    boolean boolean6 = dateTime2.isWeekday();
    boolean boolean7 = dateTime2.isWeekday();
    int int8 = dateTime2.getDayOfMonth();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
  }

  @Test
  public void test346() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test346");
    net.ajaskey.common.Utils.TAB = "Thu 10-Apr-0002 14:03:22";
  }

  @Test
  public void test347() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test347");
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("January", "BAD-DATE-FORMAT");
    dateTime2.add((int) '4', (-1));
    java.util.Calendar calendar6 = dateTime2.getCal();
    org.junit.Assert.assertNull(calendar6);
  }

  @Test
  public void test348() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test348");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 365);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test349() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test349");
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("       10.00", "Thu 10-Apr-0002 14:03:20");
  }

  @Test
  public void test350() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test350");
    net.ajaskey.common.Utils.TAB = "10-Apr-0002";
  }

  @Test
  public void test351() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test351");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(0L);
    int int2 = dateTime1.getMs();
    java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat7 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime("", simpleDateFormat6, simpleDateFormat7);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat4, simpleDateFormat7);
    dateTime1.setSdf(simpleDateFormat7);
    java.lang.String str11 = dateTime1.getDay();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNotNull(simpleDateFormat4);
    org.junit.Assert.assertNotNull(simpleDateFormat6);
    org.junit.Assert.assertNotNull(simpleDateFormat7);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Wednesday" + "'", str11, "Wednesday");
  }

  @Test
  public void test352() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test352");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    int int9 = dateTime5.getMinute();
    java.text.SimpleDateFormat simpleDateFormat11 = null;
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat11);
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double15 = dateTime12.getDeltaYears(dateTime14);
    net.ajaskey.common.DateTime dateTime16 = net.ajaskey.common.DateTime.copy(dateTime12);
    boolean boolean17 = net.ajaskey.common.Utils.sameDate(dateTime5, dateTime12);
    java.text.SimpleDateFormat simpleDateFormat20 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat22 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat23 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("", simpleDateFormat22, simpleDateFormat23);
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat20,
        simpleDateFormat23);
    java.text.SimpleDateFormat simpleDateFormat27 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat28 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("", simpleDateFormat27, simpleDateFormat28);
    net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("", simpleDateFormat23, simpleDateFormat28);
    dateTime5.setSdf(simpleDateFormat23);
    java.text.SimpleDateFormat simpleDateFormat35 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat37 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat38 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime("", simpleDateFormat37, simpleDateFormat38);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat35,
        simpleDateFormat38);
    java.text.SimpleDateFormat simpleDateFormat42 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat43 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime("", simpleDateFormat42, simpleDateFormat43);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime("", simpleDateFormat38, simpleDateFormat43);
    java.text.SimpleDateFormat simpleDateFormat48 = null;
    java.text.SimpleDateFormat simpleDateFormat49 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat48, simpleDateFormat49);
    net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat49);
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat38, simpleDateFormat49);
    net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int55 = dateTime54.getHour();
    int int56 = dateTime54.getDayOfMonth();
    int int57 = dateTime54.getYear();
    net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime(dateTime54);
    int int59 = dateTime52.getYears(dateTime58);
    boolean boolean60 = dateTime5.isLessThan(dateTime58);
    net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime(100L);
    int int63 = dateTime62.getMs();
    long long64 = dateTime58.getDeltaDays(dateTime62);
    net.ajaskey.common.DateTime dateTime67 = dateTime62.parse("         52", "Invalid fmt");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertNull(dateTime16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat20);
    org.junit.Assert.assertNotNull(simpleDateFormat22);
    org.junit.Assert.assertNotNull(simpleDateFormat23);
    org.junit.Assert.assertNotNull(simpleDateFormat27);
    org.junit.Assert.assertNotNull(simpleDateFormat28);
    org.junit.Assert.assertNotNull(simpleDateFormat35);
    org.junit.Assert.assertNotNull(simpleDateFormat37);
    org.junit.Assert.assertNotNull(simpleDateFormat38);
    org.junit.Assert.assertNotNull(simpleDateFormat42);
    org.junit.Assert.assertNotNull(simpleDateFormat43);
    org.junit.Assert.assertNotNull(simpleDateFormat49);
    org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
    org.junit.Assert.assertTrue("'" + int56 + "' != '" + 31 + "'", int56 == 31);
    org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1969 + "'", int57 == 1969);
    org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
    org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
    org.junit.Assert.assertNull(dateTime67);
  }

  @Test
  public void test353() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test353");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100.0f, 13);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
  }

  @Test
  public void test354() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test354");
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("31-Dec-1969", "Thu 10-Apr-0002 14:03:14");
    java.util.Date date3 = dateTime2.getTime();
    java.lang.String str4 = dateTime2.toFullString();
    org.junit.Assert.assertNull(date3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Time" + "'", str4, "Invalid Time");
  }

  @Test
  public void test355() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test355");
    java.lang.String str2 = net.ajaskey.common.Utils.ifmt(13, 365);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
        + "                                                                                                                                                                                                                                                                                                                                                                           13"
        + "'", str2,
        "                                                                                                                                                                                                                                                                                                                                                                           13");
  }

  @Test
  public void test356() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test356");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    net.ajaskey.common.DateTime dateTime18 = dateTime13.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime19 = net.ajaskey.common.DateTime.copy(dateTime13);
    boolean boolean20 = dateTime3.sameDate(dateTime19);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
    dateTime22.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str27 = dateTime22.getMonth();
    int int28 = dateTime22.getMs();
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    java.text.SimpleDateFormat simpleDateFormat36 = dateTime32.getSdf();
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(100L);
    double double43 = dateTime40.getDeltaYears(dateTime42);
    boolean boolean44 = dateTime42.isWeekday();
    net.ajaskey.common.DateTime dateTime47 = dateTime42.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime48 = net.ajaskey.common.DateTime.copy(dateTime42);
    boolean boolean49 = dateTime32.sameDate(dateTime48);
    net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime(100L);
    double double56 = dateTime53.getDeltaYears(dateTime55);
    boolean boolean57 = dateTime48.isGreaterThan(dateTime53);
    int int58 = dateTime53.getDayOfWeek();
    boolean boolean59 = dateTime22.isGreaterThan(dateTime53);
    long long60 = dateTime19.getDeltaMilliSeconds(dateTime53);
    net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime(1, 7, 7);
    boolean boolean65 = dateTime53.sameDate(dateTime64);
    java.util.Date date66 = dateTime64.getTime();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNull(dateTime18);
    org.junit.Assert.assertNotNull(dateTime19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "January" + "'", str27, "January");
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat36);
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1972.041095890411d) + "'", double43 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertNull(dateTime47);
    org.junit.Assert.assertNotNull(dateTime48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1972.041095890411d) + "'", double56 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-62190298596061L) + "'", long60 == (-62190298596061L));
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Sun Aug 07 14:03:24 MST 1");
  }

  @Test
  public void test357() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test357");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    boolean boolean6 = dateTime2.isWeekday();
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
    int int9 = dateTime8.getMs();
    java.lang.String str10 = dateTime8.toString();
    int int11 = dateTime8.getMs();
    java.util.Calendar calendar12 = dateTime8.getCal();
    dateTime2.set(calendar12);
    java.text.SimpleDateFormat simpleDateFormat14 = dateTime2.getSdf();
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
    int int17 = dateTime16.getMs();
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
    double double24 = dateTime21.getDeltaYears(dateTime23);
    java.text.SimpleDateFormat simpleDateFormat25 = dateTime21.getSdf();
    boolean boolean26 = dateTime16.isLessThanOrEqual(dateTime21);
    java.lang.String str27 = dateTime16.format();
    java.util.Calendar calendar28 = dateTime16.getCal();
    dateTime2.set(calendar28);
    java.lang.String str31 = dateTime2.format("365.00");
    int int32 = dateTime2.getDayOfYear();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "31-Dec-1969" + "'", str10, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    org.junit.Assert.assertNotNull(calendar12);
    org.junit.Assert.assertEquals(calendar12.toString(),
        "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertNull(simpleDateFormat14);
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1972.041095890411d) + "'", double24 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "BAD-DATE-FORMAT" + "'", str27, "BAD-DATE-FORMAT");
    org.junit.Assert.assertNotNull(calendar28);
    org.junit.Assert.assertEquals(calendar28.toString(),
        "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "365.00" + "'", str31, "365.00");
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + 365 + "'", int32 == 365);
  }

  @Test
  public void test358() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test358");
    net.ajaskey.common.Utils.TAB = "Invalid Time";
  }

  @Test
  public void test359() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test359");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl(
        "                                                                                                                                                                                                                                                                                                                                                                        35.00");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test361() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test361");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.util.Calendar calendar11 = dateTime4.getCal();
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(calendar11);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(calendar11);
    java.text.SimpleDateFormat simpleDateFormat18 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat20 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat21 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("", simpleDateFormat20, simpleDateFormat21);
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat18,
        simpleDateFormat21);
    java.text.SimpleDateFormat simpleDateFormat24 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("", simpleDateFormat21, simpleDateFormat24);
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat24);
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(
        "                                                                                                                                                                                                                                                                                                                                                                        35.00",
        simpleDateFormat24);
    dateTime13.setSdf(simpleDateFormat24);
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(calendar11);
    org.junit.Assert.assertEquals(calendar11.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertNotNull(simpleDateFormat18);
    org.junit.Assert.assertNotNull(simpleDateFormat20);
    org.junit.Assert.assertNotNull(simpleDateFormat21);
    org.junit.Assert.assertNotNull(simpleDateFormat24);
  }

  @Test
  public void test362() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test362");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    boolean boolean6 = dateTime2.isWeekday();
    boolean boolean7 = dateTime2.isWeekday();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    java.util.Date date15 = dateTime11.getTime();
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(date15);
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(date15);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(date15);
    dateTime2.set(date15);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(date15);
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Thu Apr 10 14:03:24 MST 2");
  }

  @Test
  public void test363() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test363");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 1);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(100L);
    double double8 = dateTime5.getDeltaYears(dateTime7);
    boolean boolean9 = dateTime7.isWeekday();
    java.util.Date date10 = dateTime7.getTime();
    java.lang.String str11 = dateTime7.toString();
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    int int14 = dateTime13.getMs();
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
    double double21 = dateTime18.getDeltaYears(dateTime20);
    java.text.SimpleDateFormat simpleDateFormat22 = dateTime18.getSdf();
    boolean boolean23 = dateTime13.isLessThanOrEqual(dateTime18);
    boolean boolean24 = dateTime7.isLessThan(dateTime18);
    dateTime1.set(dateTime7);
    net.ajaskey.common.DateTime dateTime27 = dateTime1.parse("December");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1972.041095890411d) + "'", double8 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "31-Dec-1969" + "'", str11, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNull(dateTime27);
  }

  @Test
  public void test364() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test364");
    net.ajaskey.common.Utils.TAB = "Thu 10-Apr-0002 14:03:23";
  }

  @Test
  public void test365() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test365");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    net.ajaskey.common.DateTime dateTime18 = dateTime13.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime19 = net.ajaskey.common.DateTime.copy(dateTime13);
    boolean boolean20 = dateTime3.sameDate(dateTime19);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int23 = dateTime22.getDayOfWeek();
    int int24 = dateTime19.getYears(dateTime22);
    java.lang.String str25 = dateTime22.toString();
    int int26 = dateTime22.getHour();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNull(dateTime18);
    org.junit.Assert.assertNotNull(dateTime19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    org.junit.Assert.assertEquals("'" + str25 + "' != '" + "31-Dec-1969" + "'", str25, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
  }

  @Test
  public void test366() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test366");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
    double double9 = dateTime6.getDeltaYears(dateTime8);
    java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
    boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat14 = dateTime13.getSdf();
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat20 = null;
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat20);
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double24 = dateTime21.getDeltaYears(dateTime23);
    boolean boolean25 = dateTime18.isLessThan(dateTime23);
    int int26 = dateTime18.getHour();
    long long27 = dateTime13.getDeltaDays(dateTime18);
    java.lang.String str28 = dateTime13.toString();
    int int29 = dateTime13.getYear();
    int int30 = dateTime13.getYear();
    int int31 = dateTime13.getMs();
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
    double double38 = dateTime35.getDeltaYears(dateTime37);
    java.text.SimpleDateFormat simpleDateFormat40 = null;
    net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat40);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double44 = dateTime41.getDeltaYears(dateTime43);
    boolean boolean45 = dateTime41.isWeekday();
    boolean boolean46 = dateTime35.sameDate(dateTime41);
    java.text.SimpleDateFormat simpleDateFormat48 = null;
    net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat48);
    net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double52 = dateTime49.getDeltaYears(dateTime51);
    net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean57 = dateTime51.isEqual(dateTime56);
    dateTime35.set(dateTime56);
    net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double61 = dateTime56.getDeltaYears(dateTime60);
    int int62 = dateTime60.getDayOfWeek();
    boolean boolean63 = dateTime13.isEqual(dateTime60);
    java.text.SimpleDateFormat simpleDateFormat65 = null;
    net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat65);
    net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double69 = dateTime66.getDeltaYears(dateTime68);
    boolean boolean70 = dateTime66.isWeekday();
    java.lang.String str71 = dateTime66.getDay();
    net.ajaskey.common.DateTime dateTime75 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime77 = new net.ajaskey.common.DateTime(100L);
    double double78 = dateTime75.getDeltaYears(dateTime77);
    java.text.SimpleDateFormat simpleDateFormat79 = dateTime75.getSdf();
    net.ajaskey.common.DateTime dateTime83 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime85 = new net.ajaskey.common.DateTime(100L);
    double double86 = dateTime83.getDeltaYears(dateTime85);
    boolean boolean87 = dateTime85.isWeekday();
    net.ajaskey.common.DateTime dateTime90 = dateTime85.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime91 = net.ajaskey.common.DateTime.copy(dateTime85);
    boolean boolean92 = dateTime75.sameDate(dateTime91);
    boolean boolean93 = dateTime66.isEqual(dateTime75);
    boolean boolean94 = dateTime60.sameDate(dateTime75);
    boolean boolean95 = dateTime6.isGreaterThanOrEqual(dateTime60);
    java.lang.String str96 = dateTime60.toFullString();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNull(simpleDateFormat14);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + 719795L + "'", long27 == 719795L);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "31-Dec-1969" + "'", str28, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1969 + "'", int29 == 1969);
    org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1969 + "'", int30 == 1969);
    org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1972.041095890411d) + "'", double38 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1972.041095890411d) + "'", double61 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + int62 + "' != '" + 4 + "'", int62 == 4);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    org.junit.Assert.assertEquals("'" + str71 + "' != '" + "UNKNOWN" + "'", str71, "UNKNOWN");
    org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1972.041095890411d) + "'", double78 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat79);
    org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1972.041095890411d) + "'", double86 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    org.junit.Assert.assertNull(dateTime90);
    org.junit.Assert.assertNotNull(dateTime91);
    org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str96, "Wed 31-Dec-1969 17:00:00");
  }

  @Test
  public void test367() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test367");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 14, (int) (short) 10);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
  }

  @Test
  public void test368() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test368");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("                                                                                                   0",
          zipOutputStream1);
      org.junit.Assert.fail(
          "Expected exception of type java.io.FileNotFoundException; message:                                                                                                    0 (The system cannot find the file specified)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test369() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test369");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat2 = dateTime1.getSdf();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime6.isLessThan(dateTime11);
    int int14 = dateTime6.getHour();
    long long15 = dateTime1.getDeltaDays(dateTime6);
    java.lang.String str16 = dateTime1.toString();
    int int17 = dateTime1.getYear();
    int int18 = dateTime1.getYear();
    int int19 = dateTime1.getMs();
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(100L);
    double double26 = dateTime23.getDeltaYears(dateTime25);
    java.text.SimpleDateFormat simpleDateFormat28 = null;
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat28);
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double32 = dateTime29.getDeltaYears(dateTime31);
    boolean boolean33 = dateTime29.isWeekday();
    boolean boolean34 = dateTime23.sameDate(dateTime29);
    java.text.SimpleDateFormat simpleDateFormat36 = null;
    net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat36);
    net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double40 = dateTime37.getDeltaYears(dateTime39);
    net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean45 = dateTime39.isEqual(dateTime44);
    dateTime23.set(dateTime44);
    net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double49 = dateTime44.getDeltaYears(dateTime48);
    int int50 = dateTime48.getDayOfWeek();
    boolean boolean51 = dateTime1.isEqual(dateTime48);
    java.text.SimpleDateFormat simpleDateFormat53 = null;
    net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat53);
    net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double57 = dateTime54.getDeltaYears(dateTime56);
    boolean boolean58 = dateTime54.isWeekday();
    java.lang.String str59 = dateTime54.getDay();
    net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime(100L);
    double double66 = dateTime63.getDeltaYears(dateTime65);
    java.text.SimpleDateFormat simpleDateFormat67 = dateTime63.getSdf();
    net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime(100L);
    double double74 = dateTime71.getDeltaYears(dateTime73);
    boolean boolean75 = dateTime73.isWeekday();
    net.ajaskey.common.DateTime dateTime78 = dateTime73.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime79 = net.ajaskey.common.DateTime.copy(dateTime73);
    boolean boolean80 = dateTime63.sameDate(dateTime79);
    boolean boolean81 = dateTime54.isEqual(dateTime63);
    boolean boolean82 = dateTime48.sameDate(dateTime63);
    boolean boolean83 = dateTime63.isWeekday();
    org.junit.Assert.assertNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 719795L + "'", long15 == 719795L);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "31-Dec-1969" + "'", str16, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1969 + "'", int17 == 1969);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1969 + "'", int18 == 1969);
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1972.041095890411d) + "'", double26 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1972.041095890411d) + "'", double49 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    org.junit.Assert.assertEquals("'" + str59 + "' != '" + "UNKNOWN" + "'", str59, "UNKNOWN");
    org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1972.041095890411d) + "'", double66 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat67);
    org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1972.041095890411d) + "'", double74 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    org.junit.Assert.assertNull(dateTime78);
    org.junit.Assert.assertNotNull(dateTime79);
    org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
  }

  @Test
  public void test370() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test370");
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("BAD-DATE-FORMAT",
        "JanuaryThu 10-Apr-0002 14:03:11Thu 10-Apr-0002 14:03:11                                                                                               52.00Thu 10-Apr-0002 14:03:11hi!Thu 10-Apr-0002 14:03:11");
  }

  @Test
  public void test371() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test371");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int2 = dateTime1.getHour();
    int int3 = dateTime1.getDayOfMonth();
    int int4 = dateTime1.getYear();
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(dateTime1);
    java.lang.String str6 = dateTime1.format();
    int int7 = dateTime1.getMs();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1969 + "'", int4 == 1969);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "BAD-DATE-FORMAT" + "'", str6, "BAD-DATE-FORMAT");
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
  }

  @Test
  public void test372() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test372");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.lang.String str3 = dateTime1.toString();
    int int4 = dateTime1.getMs();
    java.util.Calendar calendar5 = dateTime1.getCal();
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(100L);
    int int8 = dateTime7.getMs();
    java.lang.String str9 = dateTime7.toString();
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
    double double16 = dateTime13.getDeltaYears(dateTime15);
    java.text.SimpleDateFormat simpleDateFormat18 = null;
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat18);
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double22 = dateTime19.getDeltaYears(dateTime21);
    boolean boolean23 = dateTime19.isWeekday();
    boolean boolean24 = dateTime13.sameDate(dateTime19);
    java.text.SimpleDateFormat simpleDateFormat26 = null;
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat26);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double30 = dateTime27.getDeltaYears(dateTime29);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean35 = dateTime29.isEqual(dateTime34);
    dateTime13.set(dateTime34);
    boolean boolean37 = net.ajaskey.common.Utils.sameDate(dateTime7, dateTime13);
    boolean boolean38 = dateTime1.isLessThan(dateTime13);
    dateTime13.add(13, 10);
    java.text.SimpleDateFormat simpleDateFormat44 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat46 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat47 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime("", simpleDateFormat46, simpleDateFormat47);
    net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat44,
        simpleDateFormat47);
    net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat44);
    dateTime13.setSdf(simpleDateFormat44);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    org.junit.Assert.assertNotNull(calendar5);
    org.junit.Assert.assertEquals(calendar5.toString(),
        "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-Dec-1969" + "'", str9, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1972.041095890411d) + "'", double16 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat44);
    org.junit.Assert.assertNotNull(simpleDateFormat46);
    org.junit.Assert.assertNotNull(simpleDateFormat47);
  }

  @Test
  public void test373() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test373");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    int int7 = dateTime1.getMs();
    int int8 = dateTime1.getHour();
    java.lang.String str9 = dateTime1.getDay();
    int int10 = dateTime1.getYear();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Saturday" + "'", str9, "Saturday");
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
  }

  @Test
  public void test374() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test374");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    net.ajaskey.common.DateTime dateTime18 = dateTime13.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime19 = net.ajaskey.common.DateTime.copy(dateTime13);
    boolean boolean20 = dateTime3.sameDate(dateTime19);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
    dateTime22.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str27 = dateTime22.getMonth();
    int int28 = dateTime22.getMs();
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    java.text.SimpleDateFormat simpleDateFormat36 = dateTime32.getSdf();
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(100L);
    double double43 = dateTime40.getDeltaYears(dateTime42);
    boolean boolean44 = dateTime42.isWeekday();
    net.ajaskey.common.DateTime dateTime47 = dateTime42.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime48 = net.ajaskey.common.DateTime.copy(dateTime42);
    boolean boolean49 = dateTime32.sameDate(dateTime48);
    net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime(100L);
    double double56 = dateTime53.getDeltaYears(dateTime55);
    boolean boolean57 = dateTime48.isGreaterThan(dateTime53);
    int int58 = dateTime53.getDayOfWeek();
    boolean boolean59 = dateTime22.isGreaterThan(dateTime53);
    long long60 = dateTime19.getDeltaMilliSeconds(dateTime53);
    java.lang.String str61 = dateTime53.getDay();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNull(dateTime18);
    org.junit.Assert.assertNotNull(dateTime19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "January" + "'", str27, "January");
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat36);
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1972.041095890411d) + "'", double43 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertNull(dateTime47);
    org.junit.Assert.assertNotNull(dateTime48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1972.041095890411d) + "'", double56 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-62190298595556L) + "'", long60 == (-62190298595556L));
    org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Thursday" + "'", str61, "Thursday");
  }

  @Test
  public void test375() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test375");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 719795L, 9);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
  }

  @Test
  public void test376() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test376");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test377() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test377");
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat5 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("", simpleDateFormat5, simpleDateFormat6);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat3, simpleDateFormat6);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat3);
    java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat15 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat16 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("", simpleDateFormat15, simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat13,
        simpleDateFormat16);
    java.text.SimpleDateFormat simpleDateFormat19 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("", simpleDateFormat16, simpleDateFormat19);
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat19);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat3, simpleDateFormat19);
    int int23 = dateTime22.getYear();
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertNotNull(simpleDateFormat5);
    org.junit.Assert.assertNotNull(simpleDateFormat6);
    org.junit.Assert.assertNotNull(simpleDateFormat13);
    org.junit.Assert.assertNotNull(simpleDateFormat15);
    org.junit.Assert.assertNotNull(simpleDateFormat16);
    org.junit.Assert.assertNotNull(simpleDateFormat19);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
  }

  @Test
  public void test378() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test378");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.lang.String str3 = dateTime1.toString();
    int int4 = dateTime1.getMs();
    int int5 = dateTime1.getMinute();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
  }

  @Test
  public void test379() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test379");
    net.ajaskey.common.DateTime dateTime0 = new net.ajaskey.common.DateTime();
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime(100L);
    dateTime2.set((int) (byte) 100, (-1), (int) '#');
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime2.getSdf();
    boolean boolean8 = dateTime0.isEqual(dateTime2);
    net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime(100L);
    boolean boolean11 = dateTime2.isGreaterThanOrEqual(dateTime10);
    boolean boolean12 = dateTime2.isNull();
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test380() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test380");
    net.ajaskey.common.DateTime dateTime0 = new net.ajaskey.common.DateTime();
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime(100L);
    dateTime2.set((int) (byte) 100, (-1), (int) '#');
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime2.getSdf();
    boolean boolean8 = dateTime0.isEqual(dateTime2);
    int int9 = dateTime0.getYear();
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2020 + "'", int9 == 2020);
  }

  @Test
  public void test381() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test381");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("Wed 31-Dec-1969 17:00:00", zipOutputStream1);
      org.junit.Assert.fail(
          "Expected exception of type java.io.FileNotFoundException; message: Wed 31-Dec-1969 17:00:00 (The filename, directory name, or volume label syntax is incorrect)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test382() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test382");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    int int7 = dateTime1.getMs();
    java.lang.String str9 = dateTime1.format("                                                                                               52.00");
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    dateTime11.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str16 = dateTime11.getMonth();
    long long17 = dateTime1.getDeltaDays(dateTime11);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
    dateTime19.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str24 = dateTime19.getMonth();
    java.text.SimpleDateFormat simpleDateFormat26 = null;
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat26);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double30 = dateTime27.getDeltaYears(dateTime29);
    boolean boolean31 = dateTime19.isLessThan(dateTime27);
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
    double double38 = dateTime35.getDeltaYears(dateTime37);
    net.ajaskey.common.DateTime dateTime39 = null;
    long long40 = dateTime35.getDeltaDays(dateTime39);
    boolean boolean41 = dateTime27.isLessThanOrEqual(dateTime35);
    boolean boolean42 = dateTime1.isGreaterThanOrEqual(dateTime35);
    net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat45 = dateTime44.getSdf();
    net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat51 = null;
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat51);
    net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double55 = dateTime52.getDeltaYears(dateTime54);
    boolean boolean56 = dateTime49.isLessThan(dateTime54);
    int int57 = dateTime49.getHour();
    long long58 = dateTime44.getDeltaDays(dateTime49);
    boolean boolean59 = dateTime1.isGreaterThan(dateTime49);
    java.lang.String str60 = dateTime1.format();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "                                                                                               52.00" + "'", str9,
        "                                                                                               52.00");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "January" + "'", str16, "January");
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "January" + "'", str24, "January");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1972.041095890411d) + "'", double38 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    org.junit.Assert.assertNull(simpleDateFormat45);
    org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
    org.junit.Assert.assertTrue("'" + long58 + "' != '" + 719795L + "'", long58 == 719795L);
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    org.junit.Assert.assertEquals("'" + str60 + "' != '" + "BAD-DATE-FORMAT" + "'", str60, "BAD-DATE-FORMAT");
  }

  @Test
  public void test383() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test383");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile(
        "JanuaryJanuaryJanuary                                                                                               52.00Januaryhi!January",
        false);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test384() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test384");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    int int11 = dateTime4.getDayOfWeek();
    java.lang.String str12 = dateTime4.format();
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(100L);
    dateTime14.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str19 = dateTime14.getMonth();
    java.text.SimpleDateFormat simpleDateFormat21 = null;
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat21);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double25 = dateTime22.getDeltaYears(dateTime24);
    boolean boolean26 = dateTime14.isLessThan(dateTime22);
    net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime(100L);
    double double33 = dateTime30.getDeltaYears(dateTime32);
    net.ajaskey.common.DateTime dateTime34 = null;
    long long35 = dateTime30.getDeltaDays(dateTime34);
    boolean boolean36 = dateTime22.isLessThanOrEqual(dateTime30);
    boolean boolean37 = dateTime4.isGreaterThanOrEqual(dateTime30);
    int int38 = dateTime30.getYear();
    dateTime30.setFirstWorkDay();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "BAD-DATE-FORMAT" + "'", str12, "BAD-DATE-FORMAT");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "January" + "'", str19, "January");
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1972.041095890411d) + "'", double33 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
  }

  @Test
  public void test385() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test385");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 10);
  }

  @Test
  public void test386() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test386");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("       10.00", false);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test387() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test387");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("Thu 10-Apr-0002 14:03:15", zipOutputStream1);
      org.junit.Assert.fail(
          "Expected exception of type java.io.FileNotFoundException; message: Thu 10-Apr-0002 14:03:15 (The filename, directory name, or volume label syntax is incorrect)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test388() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test388");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.text.SimpleDateFormat simpleDateFormat12 = null;
    java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat12, simpleDateFormat13);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
    double double21 = dateTime18.getDeltaYears(dateTime20);
    boolean boolean22 = dateTime20.isWeekday();
    java.util.Date date23 = dateTime20.getTime();
    java.lang.String str24 = dateTime20.toString();
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    int int27 = dateTime26.getMs();
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
    double double34 = dateTime31.getDeltaYears(dateTime33);
    java.text.SimpleDateFormat simpleDateFormat35 = dateTime31.getSdf();
    boolean boolean36 = dateTime26.isLessThanOrEqual(dateTime31);
    boolean boolean37 = dateTime20.isLessThan(dateTime31);
    java.lang.String str38 = dateTime20.toString();
    long long39 = dateTime14.getDeltaMilliSeconds(dateTime20);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
    double double46 = dateTime43.getDeltaYears(dateTime45);
    boolean boolean47 = dateTime45.isWeekday();
    java.util.Date date48 = dateTime45.getTime();
    int int49 = dateTime45.getMinute();
    boolean boolean50 = dateTime14.sameDate(dateTime45);
    int int51 = dateTime4.getYears(dateTime45);
    java.text.SimpleDateFormat simpleDateFormat52 = dateTime4.getSdf();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat13);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "31-Dec-1969" + "'", str24, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1972.041095890411d) + "'", double34 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "31-Dec-1969" + "'", str38, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    org.junit.Assert.assertNull(simpleDateFormat52);
  }

  @Test
  public void test389() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test389");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("719,795", false);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test390() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test390");
    net.ajaskey.common.Utils.NL = "UNKNOWN";
  }

  @Test
  public void test391() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test391");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    int int7 = dateTime3.getDayOfWeek();
    int int8 = dateTime3.getYear();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
  }

  @Test
  public void test392() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test392");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    dateTime1.setSdf(simpleDateFormat3);
    int int5 = dateTime1.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime6 = net.ajaskey.common.DateTime.copy(dateTime1);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
    int int9 = dateTime8.getMs();
    java.text.SimpleDateFormat simpleDateFormat10 = net.ajaskey.common.Utils.sdf;
    dateTime8.setSdf(simpleDateFormat10);
    java.lang.String str12 = dateTime8.toFullString();
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(dateTime8);
    int int14 = dateTime8.getHour();
    boolean boolean15 = dateTime6.isGreaterThan(dateTime8);
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
    int int18 = dateTime17.getMs();
    java.lang.String str19 = dateTime17.toString();
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int22 = dateTime21.getHour();
    int int23 = dateTime21.getDayOfMonth();
    dateTime17.set(dateTime21);
    int int25 = dateTime21.getMs();
    java.lang.String str26 = dateTime21.toFullString();
    boolean boolean27 = dateTime8.isGreaterThanOrEqual(dateTime21);
    java.lang.String str28 = dateTime21.format();
    java.lang.String str30 = dateTime21.format("December");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    org.junit.Assert.assertNotNull(dateTime6);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str12, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "31-Dec-1969" + "'", str19, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 31 + "'", int23 == 31);
    org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str26, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "BAD-DATE-FORMAT" + "'", str28, "BAD-DATE-FORMAT");
    org.junit.Assert.assertEquals("'" + str30 + "' != '" + "BAD-DATE-FORMAT" + "'", str30, "BAD-DATE-FORMAT");
  }

  @Test
  public void test393() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test393");
    net.ajaskey.common.TextUtils.printline("97");
  }

  @Test
  public void test394() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test394");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime9.isWeekday();
    boolean boolean14 = dateTime3.sameDate(dateTime9);
    java.lang.String str15 = dateTime9.format();
    net.ajaskey.common.DateTime dateTime16 = net.ajaskey.common.DateTime.copy(dateTime9);
    dateTime9.set((int) (short) -1, (-1870), 1967);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "BAD-DATE-FORMAT" + "'", str15, "BAD-DATE-FORMAT");
    org.junit.Assert.assertNull(dateTime16);
  }

  @Test
  public void test395() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test395");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat2 = dateTime1.getSdf();
    int int3 = dateTime1.getDayOfMonth();
    org.junit.Assert.assertNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
  }

  @Test
  public void test396() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test396");
    net.ajaskey.common.Utils.sleep(6);
  }

  @Test
  public void test397() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test397");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    net.ajaskey.common.DateTime dateTime18 = dateTime13.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime19 = net.ajaskey.common.DateTime.copy(dateTime13);
    boolean boolean20 = dateTime3.sameDate(dateTime19);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
    int int23 = dateTime22.getMs();
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(100L);
    double double30 = dateTime27.getDeltaYears(dateTime29);
    java.text.SimpleDateFormat simpleDateFormat31 = dateTime27.getSdf();
    boolean boolean32 = dateTime22.isLessThanOrEqual(dateTime27);
    java.lang.String str33 = dateTime22.getDay();
    boolean boolean34 = dateTime19.isLessThanOrEqual(dateTime22);
    net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(100L);
    double double41 = dateTime38.getDeltaYears(dateTime40);
    java.util.Date date42 = dateTime38.getTime();
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(dateTime38);
    boolean boolean44 = dateTime19.sameDate(dateTime38);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNull(dateTime18);
    org.junit.Assert.assertNotNull(dateTime19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1972.041095890411d) + "'", double30 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat31);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Wednesday" + "'", str33, "Wednesday");
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1972.041095890411d) + "'", double41 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Thu Apr 10 14:03:25 MST 2");
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
  }

  @Test
  public void test398() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test398");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) 'a', (int) (short) 1, 10);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat6 = dateTime5.getSdf();
    net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat12 = null;
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat12);
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double16 = dateTime13.getDeltaYears(dateTime15);
    boolean boolean17 = dateTime10.isLessThan(dateTime15);
    int int18 = dateTime10.getHour();
    long long19 = dateTime5.getDeltaDays(dateTime10);
    java.lang.String str20 = dateTime5.getMonth();
    boolean boolean21 = net.ajaskey.common.Utils.sameMonth(dateTime3, dateTime5);
    net.ajaskey.common.DateTime dateTime23 = dateTime3.parse("          1.00");
    org.junit.Assert.assertNull(simpleDateFormat6);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 719795L + "'", long19 == 719795L);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "December" + "'", str20, "December");
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNull(dateTime23);
  }

  @Test
  public void test399() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test399");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int2 = dateTime1.getDayOfWeek();
    java.lang.String str3 = dateTime1.toFullString();
    java.text.SimpleDateFormat simpleDateFormat4 = dateTime1.getSdf();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str3, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertNull(simpleDateFormat4);
  }

  @Test
  public void test400() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test400");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(0L);
    int int2 = dateTime1.getMs();
    net.ajaskey.common.DateTime dateTime5 = dateTime1.parse("Saturday", "Thu 10-Apr-0002 14:03:13");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(dateTime5);
  }

  @Test
  public void test401() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test401");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("Thu 10-Apr-0002 14:03:14");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test402() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test402");
    java.lang.String[] strArray23 = new java.lang.String[] { "Thu 10-Apr-0002 14:03:14", "8", "      0.00", "         14", "December", "10-Apr-0002",
        "                                                                                                                                                                                                                                                                                                                                                                        35.00",
        "         52", "         14", "hi!", "2", "Saturday", "April", "     100", "1", "UNKNOWN", "31-Dec-1969", "Thursday",
        "                                                                                                   7",
        "JanuaryJanuaryJanuary                                                                                               52.00Januaryhi!January",
        "Thursday", "Thu 10-Apr-0002 14:03:14",
        "                                                                                                   7" };
    java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
    net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList24);
    org.junit.Assert.assertNotNull(strArray23);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
  }

  @Test
  public void test403() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test403");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    net.ajaskey.common.DateTime dateTime18 = dateTime13.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime19 = net.ajaskey.common.DateTime.copy(dateTime13);
    boolean boolean20 = dateTime3.sameDate(dateTime19);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int23 = dateTime22.getDayOfWeek();
    int int24 = dateTime19.getYears(dateTime22);
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    int int27 = dateTime26.getMs();
    java.lang.String str28 = dateTime26.toString();
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    java.text.SimpleDateFormat simpleDateFormat37 = null;
    net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat37);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double41 = dateTime38.getDeltaYears(dateTime40);
    boolean boolean42 = dateTime38.isWeekday();
    boolean boolean43 = dateTime32.sameDate(dateTime38);
    java.text.SimpleDateFormat simpleDateFormat45 = null;
    net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat45);
    net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double49 = dateTime46.getDeltaYears(dateTime48);
    net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean54 = dateTime48.isEqual(dateTime53);
    dateTime32.set(dateTime53);
    boolean boolean56 = net.ajaskey.common.Utils.sameDate(dateTime26, dateTime32);
    long long57 = dateTime19.getDeltaMilliSeconds(dateTime32);
    boolean boolean58 = dateTime19.isNull();
    int int59 = dateTime19.getSecond();
    net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime();
    net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime(100L);
    dateTime62.set((int) (byte) 100, (-1), (int) '#');
    java.text.SimpleDateFormat simpleDateFormat67 = dateTime62.getSdf();
    boolean boolean68 = dateTime60.isEqual(dateTime62);
    int int69 = dateTime19.getYears(dateTime60);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNull(dateTime18);
    org.junit.Assert.assertNotNull(dateTime19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "31-Dec-1969" + "'", str28, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-62190298594916L) + "'", long57 == (-62190298594916L));
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    org.junit.Assert.assertNull(simpleDateFormat67);
    org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    org.junit.Assert.assertTrue("'" + int69 + "' != '" + 50 + "'", int69 == 50);
  }

  @Test
  public void test404() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test404");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.util.Date date7 = dateTime3.getTime();
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(date7);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(date7);
    net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime(date7);
    dateTime10.set((int) (short) 0, (int) (byte) 0, 8);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Thu Apr 10 14:03:25 MST 2");
  }

  @Test
  public void test405() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test405");
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat5 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("", simpleDateFormat5, simpleDateFormat6);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat3, simpleDateFormat6);
    java.text.SimpleDateFormat simpleDateFormat10 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat11 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("", simpleDateFormat10, simpleDateFormat11);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("", simpleDateFormat6, simpleDateFormat11);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    java.text.SimpleDateFormat simpleDateFormat17 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat16, simpleDateFormat17);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat17);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat6, simpleDateFormat17);
    java.util.Calendar calendar21 = dateTime20.getCal();
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertNotNull(simpleDateFormat5);
    org.junit.Assert.assertNotNull(simpleDateFormat6);
    org.junit.Assert.assertNotNull(simpleDateFormat10);
    org.junit.Assert.assertNotNull(simpleDateFormat11);
    org.junit.Assert.assertNotNull(simpleDateFormat17);
    org.junit.Assert.assertNull(calendar21);
  }

  @Test
  public void test406() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test406");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("100", zipOutputStream1);
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 100 (The system cannot find the file specified)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test407() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test407");
    net.ajaskey.common.Utils.NL = "8";
  }

  @Test
  public void test408() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test408");
    net.ajaskey.common.TextUtils.printline("Thu 10-Apr-0002 14:03:15");
  }

  @Test
  public void test409() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test409");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    java.lang.String str9 = dateTime5.toString();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    int int12 = dateTime11.getMs();
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
    double double19 = dateTime16.getDeltaYears(dateTime18);
    java.text.SimpleDateFormat simpleDateFormat20 = dateTime16.getSdf();
    boolean boolean21 = dateTime11.isLessThanOrEqual(dateTime16);
    boolean boolean22 = dateTime5.isLessThan(dateTime16);
    java.lang.String str23 = dateTime16.getMonth();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-Dec-1969" + "'", str9, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "April" + "'", str23, "April");
  }

  @Test
  public void test410() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test410");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    net.ajaskey.common.DateTime dateTime10 = dateTime5.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime11 = net.ajaskey.common.DateTime.copy(dateTime5);
    dateTime11.set((int) ' ', 1970, (int) (short) -1);
    net.ajaskey.common.DateTime dateTime17 = dateTime11.parse(
        "JanuaryThu 10-Apr-0002 14:03:11Thu 10-Apr-0002 14:03:11                                                                                               52.00Thu 10-Apr-0002 14:03:11hi!Thu 10-Apr-0002 14:03:11");
    java.lang.String str18 = dateTime11.getMonth();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(dateTime10);
    org.junit.Assert.assertNotNull(dateTime11);
    org.junit.Assert.assertNull(dateTime17);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "February" + "'", str18, "February");
  }

  @Test
  public void test412() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test412");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.text.SimpleDateFormat simpleDateFormat12 = null;
    java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat12, simpleDateFormat13);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
    double double21 = dateTime18.getDeltaYears(dateTime20);
    boolean boolean22 = dateTime20.isWeekday();
    java.util.Date date23 = dateTime20.getTime();
    java.lang.String str24 = dateTime20.toString();
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    int int27 = dateTime26.getMs();
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
    double double34 = dateTime31.getDeltaYears(dateTime33);
    java.text.SimpleDateFormat simpleDateFormat35 = dateTime31.getSdf();
    boolean boolean36 = dateTime26.isLessThanOrEqual(dateTime31);
    boolean boolean37 = dateTime20.isLessThan(dateTime31);
    java.lang.String str38 = dateTime20.toString();
    long long39 = dateTime14.getDeltaMilliSeconds(dateTime20);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
    double double46 = dateTime43.getDeltaYears(dateTime45);
    boolean boolean47 = dateTime45.isWeekday();
    java.util.Date date48 = dateTime45.getTime();
    int int49 = dateTime45.getMinute();
    boolean boolean50 = dateTime14.sameDate(dateTime45);
    int int51 = dateTime4.getYears(dateTime45);
    int int52 = dateTime45.getDayOfWeek();
    java.lang.String str53 = dateTime45.toString();
    net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat56 = dateTime55.getSdf();
    net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat62 = null;
    net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat62);
    net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double66 = dateTime63.getDeltaYears(dateTime65);
    boolean boolean67 = dateTime60.isLessThan(dateTime65);
    int int68 = dateTime60.getHour();
    long long69 = dateTime55.getDeltaDays(dateTime60);
    java.lang.String str70 = dateTime55.toString();
    int int71 = dateTime55.getYear();
    boolean boolean72 = dateTime45.isLessThanOrEqual(dateTime55);
    java.text.SimpleDateFormat simpleDateFormat74 = null;
    net.ajaskey.common.DateTime dateTime75 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat74);
    net.ajaskey.common.DateTime dateTime77 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double78 = dateTime75.getDeltaYears(dateTime77);
    net.ajaskey.common.DateTime dateTime82 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean83 = dateTime77.isEqual(dateTime82);
    int int84 = dateTime77.getDayOfWeek();
    java.lang.String str85 = dateTime77.format();
    boolean boolean86 = dateTime55.isGreaterThan(dateTime77);
    java.lang.Class<?> wildcardClass87 = dateTime77.getClass();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat13);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "31-Dec-1969" + "'", str24, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1972.041095890411d) + "'", double34 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "31-Dec-1969" + "'", str38, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
    org.junit.Assert.assertEquals("'" + str53 + "' != '" + "31-Dec-1969" + "'", str53, "31-Dec-1969");
    org.junit.Assert.assertNull(simpleDateFormat56);
    org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
    org.junit.Assert.assertTrue("'" + long69 + "' != '" + 719795L + "'", long69 == 719795L);
    org.junit.Assert.assertEquals("'" + str70 + "' != '" + "31-Dec-1969" + "'", str70, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1969 + "'", int71 == 1969);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    org.junit.Assert.assertTrue("'" + int84 + "' != '" + 4 + "'", int84 == 4);
    org.junit.Assert.assertEquals("'" + str85 + "' != '" + "BAD-DATE-FORMAT" + "'", str85, "BAD-DATE-FORMAT");
    org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    org.junit.Assert.assertNotNull(wildcardClass87);
  }

  @Test
  public void test413() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test413");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime7 = dateTime2.parse(
        "JanuaryJanuaryJanuary                                                                                               52.00Januaryhi!January");
    net.ajaskey.common.DateTime dateTime8 = null;
    // The following exception was thrown during execution in test generation
    try {
      long long9 = dateTime7.getDeltaDays(dateTime8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertNull(dateTime7);
  }

  @Test
  public void test414() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test414");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(9, (int) (short) 10, (int) 'a');
    int int4 = dateTime3.getDayOfWeek();
    java.lang.String str5 = dateTime3.getDay();
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Wednesday" + "'", str5, "Wednesday");
  }

  @Test
  public void test415() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test415");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    java.lang.String str9 = dateTime5.toString();
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(3, (int) '4', (int) (byte) 0);
    boolean boolean14 = dateTime5.isGreaterThan(dateTime13);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean25 = dateTime19.isEqual(dateTime24);
    java.util.Calendar calendar26 = dateTime19.getCal();
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(calendar26);
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(calendar26);
    boolean boolean29 = dateTime5.isLessThan(dateTime28);
    java.text.SimpleDateFormat simpleDateFormat31 = null;
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat31);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    boolean boolean36 = dateTime32.isWeekday();
    java.lang.String str37 = dateTime32.getDay();
    java.util.Calendar calendar38 = dateTime32.getCal();
    boolean boolean39 = dateTime5.isLessThan(dateTime32);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(dateTime32);
    dateTime32.set(11, 8, (int) (short) 10);
    int int45 = dateTime32.getDayOfWeek();
    java.text.SimpleDateFormat simpleDateFormat49 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat51 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat52 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime("", simpleDateFormat51, simpleDateFormat52);
    net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat49,
        simpleDateFormat52);
    net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat49);
    java.text.SimpleDateFormat simpleDateFormat56 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime("", simpleDateFormat49, simpleDateFormat56);
    // The following exception was thrown during execution in test generation
    try {
      dateTime32.set(dateTime57);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-Dec-1969" + "'", str9, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(calendar26);
    org.junit.Assert.assertEquals(calendar26.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UNKNOWN" + "'", str37, "UNKNOWN");
    org.junit.Assert.assertNull(calendar38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
    org.junit.Assert.assertNotNull(simpleDateFormat49);
    org.junit.Assert.assertNotNull(simpleDateFormat51);
    org.junit.Assert.assertNotNull(simpleDateFormat52);
    org.junit.Assert.assertNotNull(simpleDateFormat56);
  }

  @Test
  public void test416() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test416");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 14:03:19", true);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test417() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test417");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
    double double9 = dateTime6.getDeltaYears(dateTime8);
    java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
    boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
    java.util.Calendar calendar12 = dateTime1.getCal();
    java.lang.Class<?> wildcardClass13 = calendar12.getClass();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(calendar12);
    org.junit.Assert.assertEquals(calendar12.toString(),
        "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test418() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test418");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    int int9 = dateTime5.getMinute();
    java.text.SimpleDateFormat simpleDateFormat11 = null;
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat11);
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double15 = dateTime12.getDeltaYears(dateTime14);
    net.ajaskey.common.DateTime dateTime16 = net.ajaskey.common.DateTime.copy(dateTime12);
    boolean boolean17 = net.ajaskey.common.Utils.sameDate(dateTime5, dateTime12);
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
    double double24 = dateTime21.getDeltaYears(dateTime23);
    boolean boolean25 = dateTime23.isWeekday();
    java.util.Date date26 = dateTime23.getTime();
    int int27 = dateTime23.getMinute();
    int int28 = dateTime23.getDayOfYear();
    net.ajaskey.common.DateTime dateTime29 = null;
    boolean boolean30 = dateTime23.isLessThan(dateTime29);
    boolean boolean31 = dateTime12.isLessThanOrEqual(dateTime29);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertNull(dateTime16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1972.041095890411d) + "'", double24 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertNotNull(date26);
    org.junit.Assert.assertEquals(date26.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 365 + "'", int28 == 365);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
  }

  @Test
  public void test419() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test419");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat2 = dateTime1.getSdf();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime6.isLessThan(dateTime11);
    int int14 = dateTime6.getHour();
    long long15 = dateTime1.getDeltaDays(dateTime6);
    java.lang.String str16 = dateTime1.toString();
    int int17 = dateTime1.getYear();
    java.lang.String str18 = dateTime1.format();
    org.junit.Assert.assertNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 719795L + "'", long15 == 719795L);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "31-Dec-1969" + "'", str16, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1969 + "'", int17 == 1969);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "31-Dec-1969" + "'", str18, "31-Dec-1969");
  }

  @Test
  public void test420() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test420");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat2 = dateTime1.getSdf();
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime(100L);
    int int5 = dateTime4.getMs();
    java.lang.String str6 = dateTime4.toString();
    int int7 = dateTime4.getMs();
    java.util.Calendar calendar8 = dateTime4.getCal();
    int int9 = dateTime1.getYears(dateTime4);
    java.text.SimpleDateFormat simpleDateFormat11 = null;
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat11);
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double15 = dateTime12.getDeltaYears(dateTime14);
    int int16 = dateTime14.getDayOfYear();
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(0L);
    long long19 = dateTime14.getDeltaDays(dateTime18);
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
    int int22 = dateTime21.getMs();
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(100L);
    double double29 = dateTime26.getDeltaYears(dateTime28);
    java.text.SimpleDateFormat simpleDateFormat30 = dateTime26.getSdf();
    boolean boolean31 = dateTime21.isLessThanOrEqual(dateTime26);
    java.lang.String str32 = dateTime21.getDay();
    java.text.SimpleDateFormat simpleDateFormat36 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat38 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat39 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime("", simpleDateFormat38, simpleDateFormat39);
    net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat36,
        simpleDateFormat39);
    java.text.SimpleDateFormat simpleDateFormat43 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat44 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime("", simpleDateFormat43, simpleDateFormat44);
    net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime("", simpleDateFormat39, simpleDateFormat44);
    java.text.SimpleDateFormat simpleDateFormat49 = null;
    java.text.SimpleDateFormat simpleDateFormat50 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat49, simpleDateFormat50);
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat50);
    net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat39, simpleDateFormat50);
    dateTime21.setSdf(simpleDateFormat50);
    boolean boolean55 = dateTime14.isLessThanOrEqual(dateTime21);
    double double56 = dateTime1.getDeltaYears(dateTime14);
    int int57 = dateTime1.getSecond();
    org.junit.Assert.assertNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "31-Dec-1969" + "'", str6, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    org.junit.Assert.assertNotNull(calendar8);
    org.junit.Assert.assertEquals(calendar8.toString(),
        "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 365 + "'", int16 == 365);
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1972.041095890411d) + "'", double29 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Wednesday" + "'", str32, "Wednesday");
    org.junit.Assert.assertNotNull(simpleDateFormat36);
    org.junit.Assert.assertNotNull(simpleDateFormat38);
    org.junit.Assert.assertNotNull(simpleDateFormat39);
    org.junit.Assert.assertNotNull(simpleDateFormat43);
    org.junit.Assert.assertNotNull(simpleDateFormat44);
    org.junit.Assert.assertNotNull(simpleDateFormat50);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
  }

  @Test
  public void test421() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test421");
    net.ajaskey.common.Utils.NL = "                                                                                                   0";
  }

  @Test
  public void test422() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test422");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile(
        "JanuaryThu 10-Apr-0002 14:03:11Thu 10-Apr-0002 14:03:11                                                                                               52.00Thu 10-Apr-0002 14:03:11hi!Thu 10-Apr-0002 14:03:11",
        true);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test423() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test423");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    net.ajaskey.common.DateTime dateTime18 = dateTime13.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime19 = net.ajaskey.common.DateTime.copy(dateTime13);
    boolean boolean20 = dateTime3.sameDate(dateTime19);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    double double27 = dateTime24.getDeltaYears(dateTime26);
    boolean boolean28 = dateTime19.isGreaterThan(dateTime24);
    int int29 = dateTime24.getDayOfWeek();
    java.text.SimpleDateFormat simpleDateFormat34 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat36 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat37 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime("", simpleDateFormat36, simpleDateFormat37);
    net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat34,
        simpleDateFormat37);
    java.text.SimpleDateFormat simpleDateFormat41 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat42 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("", simpleDateFormat41, simpleDateFormat42);
    net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime("", simpleDateFormat37, simpleDateFormat42);
    java.text.SimpleDateFormat simpleDateFormat47 = null;
    java.text.SimpleDateFormat simpleDateFormat48 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat47, simpleDateFormat48);
    net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat48);
    net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat37, simpleDateFormat48);
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime("      0.00", simpleDateFormat37);
    double double53 = dateTime24.getDeltaYears(dateTime52);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNull(dateTime18);
    org.junit.Assert.assertNotNull(dateTime19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1972.041095890411d) + "'", double27 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
    org.junit.Assert.assertNotNull(simpleDateFormat34);
    org.junit.Assert.assertNotNull(simpleDateFormat36);
    org.junit.Assert.assertNotNull(simpleDateFormat37);
    org.junit.Assert.assertNotNull(simpleDateFormat41);
    org.junit.Assert.assertNotNull(simpleDateFormat42);
    org.junit.Assert.assertNotNull(simpleDateFormat48);
    org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
  }

  @Test
  public void test424() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test424");
    net.ajaskey.common.Utils.NL = "100";
  }

  @Test
  public void test425() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test425");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.lang.String str3 = dateTime1.toString();
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int6 = dateTime5.getHour();
    int int7 = dateTime5.getDayOfMonth();
    dateTime1.set(dateTime5);
    java.util.Calendar calendar9 = dateTime1.getCal();
    net.ajaskey.common.DateTime dateTime10 = null;
    boolean boolean11 = dateTime1.isLessThan(dateTime10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    org.junit.Assert.assertNotNull(calendar9);
    org.junit.Assert.assertEquals(calendar9.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test426() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test426");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    int int7 = dateTime1.getMs();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    boolean boolean21 = dateTime17.isWeekday();
    boolean boolean22 = dateTime11.sameDate(dateTime17);
    java.text.SimpleDateFormat simpleDateFormat24 = null;
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double28 = dateTime25.getDeltaYears(dateTime27);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean33 = dateTime27.isEqual(dateTime32);
    dateTime11.set(dateTime32);
    net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double37 = dateTime32.getDeltaYears(dateTime36);
    double double38 = dateTime1.getDeltaYears(dateTime36);
    java.text.SimpleDateFormat simpleDateFormat44 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat46 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat47 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime("", simpleDateFormat46, simpleDateFormat47);
    net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat44,
        simpleDateFormat47);
    java.text.SimpleDateFormat simpleDateFormat51 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat52 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime("", simpleDateFormat51, simpleDateFormat52);
    net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime("", simpleDateFormat47, simpleDateFormat52);
    java.text.SimpleDateFormat simpleDateFormat57 = null;
    java.text.SimpleDateFormat simpleDateFormat58 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat57, simpleDateFormat58);
    net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat58);
    net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat47, simpleDateFormat58);
    net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime("      0.00", simpleDateFormat47);
    net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime("365.00", simpleDateFormat47);
    net.ajaskey.common.DateTime dateTime66 = dateTime63
        .parse("                                                                                 -62,190,298,606,387", "Thu 10-Apr-0002 14:03:23");
    dateTime1.set(dateTime66);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1972.041095890411d) + "'", double37 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1871.2328767123288d) + "'", double38 == (-1871.2328767123288d));
    org.junit.Assert.assertNotNull(simpleDateFormat44);
    org.junit.Assert.assertNotNull(simpleDateFormat46);
    org.junit.Assert.assertNotNull(simpleDateFormat47);
    org.junit.Assert.assertNotNull(simpleDateFormat51);
    org.junit.Assert.assertNotNull(simpleDateFormat52);
    org.junit.Assert.assertNotNull(simpleDateFormat58);
    org.junit.Assert.assertNull(dateTime66);
  }

  @Test
  public void test427() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test427");
    net.ajaskey.common.Utils.makeDir("Invalid Time");
  }

  @Test
  public void test428() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test428");
    java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("2");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test429() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test429");
    net.ajaskey.common.Utils.NL = "97";
  }

  @Test
  public void test430() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test430");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    net.ajaskey.common.DateTime dateTime10 = dateTime5.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime11 = net.ajaskey.common.DateTime.copy(dateTime5);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    dateTime13.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str18 = dateTime13.getMonth();
    int int19 = dateTime13.getMs();
    java.lang.String str21 = dateTime13
        .format("                                                                                               52.00");
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
    dateTime23.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str28 = dateTime23.getMonth();
    long long29 = dateTime13.getDeltaDays(dateTime23);
    boolean boolean30 = dateTime11.isGreaterThan(dateTime23);
    int int31 = dateTime23.getHour();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(dateTime10);
    org.junit.Assert.assertNotNull(dateTime11);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "January" + "'", str18, "January");
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "                                                                                               52.00" + "'", str21,
        "                                                                                               52.00");
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "January" + "'", str28, "January");
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
  }

  @Test
  public void test431() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test431");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    int int7 = dateTime3.getHour();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    java.util.Date date16 = dateTime13.getTime();
    java.lang.String str17 = dateTime13.toString();
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
    int int20 = dateTime19.getMs();
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    double double27 = dateTime24.getDeltaYears(dateTime26);
    java.text.SimpleDateFormat simpleDateFormat28 = dateTime24.getSdf();
    boolean boolean29 = dateTime19.isLessThanOrEqual(dateTime24);
    boolean boolean30 = dateTime13.isLessThan(dateTime24);
    java.lang.String str31 = dateTime13.toString();
    boolean boolean32 = dateTime3.sameDate(dateTime13);
    java.lang.String str33 = dateTime3.format();
    net.ajaskey.common.DateTime dateTime34 = null;
    boolean boolean35 = dateTime3.isEqual(dateTime34);
    int int36 = dateTime3.getDayOfMonth();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(date16);
    org.junit.Assert.assertEquals(date16.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "31-Dec-1969" + "'", str17, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1972.041095890411d) + "'", double27 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "31-Dec-1969" + "'", str31, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertEquals("'" + str33 + "' != '" + "BAD-DATE-FORMAT" + "'", str33, "BAD-DATE-FORMAT");
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
  }

  @Test
  public void test432() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test432");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.util.Calendar calendar11 = dateTime4.getCal();
    java.lang.String str12 = dateTime4.toFullString();
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
    double double19 = dateTime16.getDeltaYears(dateTime18);
    java.text.SimpleDateFormat simpleDateFormat21 = null;
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat21);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double25 = dateTime22.getDeltaYears(dateTime24);
    boolean boolean26 = dateTime22.isWeekday();
    boolean boolean27 = dateTime16.sameDate(dateTime22);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(0L);
    boolean boolean30 = dateTime22.isGreaterThanOrEqual(dateTime29);
    java.text.SimpleDateFormat simpleDateFormat32 = null;
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat32);
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double36 = dateTime33.getDeltaYears(dateTime35);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean41 = dateTime35.isEqual(dateTime40);
    java.util.Calendar calendar42 = dateTime35.getCal();
    java.lang.String str43 = dateTime35.toFullString();
    boolean boolean44 = dateTime29.isGreaterThanOrEqual(dateTime35);
    boolean boolean45 = dateTime4.sameDate(dateTime29);
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(calendar11);
    org.junit.Assert.assertEquals(calendar11.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str12, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertNotNull(calendar42);
    org.junit.Assert.assertEquals(calendar42.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str43, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
  }

  @Test
  public void test433() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test433");
    net.ajaskey.common.Utils.NL = "       10.00";
  }

  @Test
  public void test434() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test434");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (short) 0);
    net.ajaskey.common.DateTime dateTime2 = net.ajaskey.common.DateTime.copy(dateTime1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime(100L);
    dateTime4.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str9 = dateTime4.getMonth();
    int int10 = dateTime4.getMs();
    java.lang.String str12 = dateTime4.format("                                                                                               52.00");
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(100L);
    dateTime14.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str19 = dateTime14.getMonth();
    long long20 = dateTime4.getDeltaDays(dateTime14);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
    dateTime22.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str27 = dateTime22.getMonth();
    java.text.SimpleDateFormat simpleDateFormat29 = null;
    net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat29);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double33 = dateTime30.getDeltaYears(dateTime32);
    boolean boolean34 = dateTime22.isLessThan(dateTime30);
    net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(100L);
    double double41 = dateTime38.getDeltaYears(dateTime40);
    net.ajaskey.common.DateTime dateTime42 = null;
    long long43 = dateTime38.getDeltaDays(dateTime42);
    boolean boolean44 = dateTime30.isLessThanOrEqual(dateTime38);
    boolean boolean45 = dateTime4.isGreaterThanOrEqual(dateTime38);
    long long46 = dateTime2.getDeltaDays(dateTime38);
    int int47 = dateTime2.getMs();
    org.junit.Assert.assertNotNull(dateTime2);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "January" + "'", str9, "January");
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "                                                                                               52.00" + "'", str12,
        "                                                                                               52.00");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "January" + "'", str19, "January");
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "January" + "'", str27, "January");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1972.041095890411d) + "'", double41 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertTrue("'" + long46 + "' != '" + 719795L + "'", long46 == 719795L);
    org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
  }

  @Test
  public void test435() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test435");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 1970);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test436() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test436");
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat5 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("", simpleDateFormat5, simpleDateFormat6);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat3, simpleDateFormat6);
    java.text.SimpleDateFormat simpleDateFormat10 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat11 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("", simpleDateFormat10, simpleDateFormat11);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("", simpleDateFormat6, simpleDateFormat11);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    java.text.SimpleDateFormat simpleDateFormat17 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat16, simpleDateFormat17);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat17);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat6, simpleDateFormat17);
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(dateTime20);
    java.lang.String str22 = dateTime20.getDay();
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(100L);
    int int25 = dateTime24.getMs();
    java.text.SimpleDateFormat simpleDateFormat26 = net.ajaskey.common.Utils.sdf;
    dateTime24.setSdf(simpleDateFormat26);
    int int28 = dateTime24.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    java.util.Calendar calendar36 = dateTime32.getCal();
    dateTime24.set(calendar36);
    java.text.SimpleDateFormat simpleDateFormat39 = null;
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat39);
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double43 = dateTime40.getDeltaYears(dateTime42);
    net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean48 = dateTime42.isEqual(dateTime47);
    java.util.Calendar calendar49 = dateTime42.getCal();
    net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(calendar49);
    dateTime24.set(calendar49);
    net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime(100L);
    double double58 = dateTime55.getDeltaYears(dateTime57);
    java.lang.String str59 = dateTime55.toFullString();
    boolean boolean60 = net.ajaskey.common.Utils.sameDate(dateTime24, dateTime55);
    net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime((long) 1);
    net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime(100L);
    double double69 = dateTime66.getDeltaYears(dateTime68);
    boolean boolean70 = dateTime68.isWeekday();
    java.util.Date date71 = dateTime68.getTime();
    java.lang.String str72 = dateTime68.toString();
    net.ajaskey.common.DateTime dateTime74 = new net.ajaskey.common.DateTime(100L);
    int int75 = dateTime74.getMs();
    net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime81 = new net.ajaskey.common.DateTime(100L);
    double double82 = dateTime79.getDeltaYears(dateTime81);
    java.text.SimpleDateFormat simpleDateFormat83 = dateTime79.getSdf();
    boolean boolean84 = dateTime74.isLessThanOrEqual(dateTime79);
    boolean boolean85 = dateTime68.isLessThan(dateTime79);
    dateTime62.set(dateTime68);
    java.lang.String str87 = dateTime68.toFullString();
    boolean boolean88 = dateTime24.isLessThanOrEqual(dateTime68);
    boolean boolean89 = dateTime20.sameDate(dateTime24);
    dateTime24.add((int) (byte) 100, (int) (byte) 10);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertNotNull(simpleDateFormat5);
    org.junit.Assert.assertNotNull(simpleDateFormat6);
    org.junit.Assert.assertNotNull(simpleDateFormat10);
    org.junit.Assert.assertNotNull(simpleDateFormat11);
    org.junit.Assert.assertNotNull(simpleDateFormat17);
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UNKNOWN" + "'", str22, "UNKNOWN");
    org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat26);
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(calendar36);
// flaky:         org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=-62190298593915,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=26,MILLISECOND=85,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertNotNull(calendar49);
    org.junit.Assert.assertEquals(calendar49.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1972.041095890411d) + "'", double58 == (-1972.041095890411d));
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Thu 10-Apr-0002 14:03:26" + "'", str59, "Thu 10-Apr-0002 14:03:26");
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1972.041095890411d) + "'", double69 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    org.junit.Assert.assertNotNull(date71);
    org.junit.Assert.assertEquals(date71.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str72 + "' != '" + "31-Dec-1969" + "'", str72, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
    org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1972.041095890411d) + "'", double82 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat83);
    org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str87, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
  }

  @Test
  public void test437() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test437");
    net.ajaskey.common.TextUtils.printline("             0");
  }

  @Test
  public void test438() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test438");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.util.Date date7 = dateTime3.getTime();
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(dateTime3);
    java.util.Calendar calendar9 = dateTime8.getCal();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    int int12 = dateTime11.getMs();
    java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdf;
    dateTime11.setSdf(simpleDateFormat13);
    int int15 = dateTime11.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
    double double22 = dateTime19.getDeltaYears(dateTime21);
    java.util.Calendar calendar23 = dateTime19.getCal();
    dateTime11.set(calendar23);
    java.text.SimpleDateFormat simpleDateFormat26 = null;
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat26);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double30 = dateTime27.getDeltaYears(dateTime29);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean35 = dateTime29.isEqual(dateTime34);
    java.util.Calendar calendar36 = dateTime29.getCal();
    net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(calendar36);
    dateTime11.set(calendar36);
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(100L);
    double double45 = dateTime42.getDeltaYears(dateTime44);
    java.lang.String str46 = dateTime42.toFullString();
    boolean boolean47 = net.ajaskey.common.Utils.sameDate(dateTime11, dateTime42);
    double double48 = dateTime8.getDeltaYears(dateTime11);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Thu Apr 10 14:03:26 MST 2");
    org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-62190298593882,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=26,MILLISECOND=118,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat13);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1972.041095890411d) + "'", double22 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(calendar23);
// flaky:         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=-62190298593882,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=26,MILLISECOND=118,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertNotNull(calendar36);
    org.junit.Assert.assertEquals(calendar36.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1972.041095890411d) + "'", double45 == (-1972.041095890411d));
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Thu 10-Apr-0002 14:03:26" + "'", str46, "Thu 10-Apr-0002 14:03:26");
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1972.041095890411d) + "'", double48 == (-1972.041095890411d));
  }

  @Test
  public void test439() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test439");
    net.ajaskey.common.TextUtils.printline("           365");
  }

  @Test
  public void test440() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test440");
    java.lang.String str2 = net.ajaskey.common.Utils.ifmt(31, (int) (short) 100);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "                                                                                                  31" + "'", str2,
        "                                                                                                  31");
  }

  @Test
  public void test441() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test441");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat2 = dateTime1.getSdf();
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    int int6 = dateTime5.getMs();
    java.lang.String str7 = dateTime5.toString();
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int10 = dateTime9.getHour();
    int int11 = dateTime9.getDayOfMonth();
    dateTime5.set(dateTime9);
    java.text.SimpleDateFormat simpleDateFormat15 = null;
    java.text.SimpleDateFormat simpleDateFormat16 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat15, simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat16);
    dateTime9.setSdf(simpleDateFormat16);
    java.text.SimpleDateFormat simpleDateFormat23 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat25 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat26 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime("", simpleDateFormat25, simpleDateFormat26);
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat23,
        simpleDateFormat26);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat23);
    java.text.SimpleDateFormat simpleDateFormat33 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat35 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat36 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime("", simpleDateFormat35, simpleDateFormat36);
    net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat33,
        simpleDateFormat36);
    java.text.SimpleDateFormat simpleDateFormat39 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime("", simpleDateFormat36, simpleDateFormat39);
    net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat39);
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat23, simpleDateFormat39);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("8", simpleDateFormat16, simpleDateFormat39);
    // The following exception was thrown during execution in test generation
    try {
      dateTime1.set(dateTime43);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "31-Dec-1969" + "'", str7, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
    org.junit.Assert.assertNotNull(simpleDateFormat16);
    org.junit.Assert.assertNotNull(simpleDateFormat23);
    org.junit.Assert.assertNotNull(simpleDateFormat25);
    org.junit.Assert.assertNotNull(simpleDateFormat26);
    org.junit.Assert.assertNotNull(simpleDateFormat33);
    org.junit.Assert.assertNotNull(simpleDateFormat35);
    org.junit.Assert.assertNotNull(simpleDateFormat36);
    org.junit.Assert.assertNotNull(simpleDateFormat39);
  }

  @Test
  public void test442() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test442");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime9.isWeekday();
    boolean boolean14 = dateTime3.sameDate(dateTime9);
    java.lang.String str15 = dateTime9.format();
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat21 = null;
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat21);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double25 = dateTime22.getDeltaYears(dateTime24);
    boolean boolean26 = dateTime19.isLessThan(dateTime24);
    int int27 = dateTime19.getHour();
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
    double double34 = dateTime31.getDeltaYears(dateTime33);
    java.text.SimpleDateFormat simpleDateFormat36 = null;
    net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat36);
    net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double40 = dateTime37.getDeltaYears(dateTime39);
    boolean boolean41 = dateTime37.isWeekday();
    boolean boolean42 = dateTime31.sameDate(dateTime37);
    java.text.SimpleDateFormat simpleDateFormat44 = null;
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat44);
    net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double48 = dateTime45.getDeltaYears(dateTime47);
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean53 = dateTime47.isEqual(dateTime52);
    dateTime31.set(dateTime52);
    boolean boolean55 = net.ajaskey.common.Utils.sameDate(dateTime19, dateTime52);
    java.util.Date date56 = dateTime19.getTime();
    net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime();
    net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime(100L);
    dateTime59.set((int) (byte) 100, (-1), (int) '#');
    java.text.SimpleDateFormat simpleDateFormat64 = dateTime59.getSdf();
    boolean boolean65 = dateTime57.isEqual(dateTime59);
    net.ajaskey.common.DateTime dateTime66 = net.ajaskey.common.DateTime.copy(dateTime57);
    java.util.Calendar calendar67 = dateTime57.getCal();
    dateTime19.set(calendar67);
    dateTime9.set(calendar67);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "BAD-DATE-FORMAT" + "'", str15, "BAD-DATE-FORMAT");
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1972.041095890411d) + "'", double34 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Thu Apr 10 14:03:26 MST 2");
    org.junit.Assert.assertNull(simpleDateFormat64);
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    org.junit.Assert.assertNotNull(dateTime66);
    org.junit.Assert.assertNotNull(calendar67);
// flaky:         org.junit.Assert.assertEquals(calendar67.toString(), "java.util.GregorianCalendar[time=1593115406198,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=5,WEEK_OF_YEAR=26,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=177,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=26,MILLISECOND=198,ZONE_OFFSET=-25200000,DST_OFFSET=3600000]");
  }

  @Test
  public void test443() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test443");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime9.isWeekday();
    boolean boolean14 = dateTime3.sameDate(dateTime9);
    dateTime9.add((int) (short) 0, 5);
    int int18 = dateTime9.getHour();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
  }

  @Test
  public void test444() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test444");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    java.lang.String str9 = dateTime5.toString();
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(3, (int) '4', (int) (byte) 0);
    boolean boolean14 = dateTime5.isGreaterThan(dateTime13);
    java.text.SimpleDateFormat simpleDateFormat16 = null;
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean25 = dateTime19.isEqual(dateTime24);
    java.util.Calendar calendar26 = dateTime19.getCal();
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(calendar26);
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(calendar26);
    boolean boolean29 = dateTime5.isLessThan(dateTime28);
    java.text.SimpleDateFormat simpleDateFormat31 = null;
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat31);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    boolean boolean36 = dateTime32.isWeekday();
    java.lang.String str37 = dateTime32.getDay();
    java.util.Calendar calendar38 = dateTime32.getCal();
    boolean boolean39 = dateTime5.isLessThan(dateTime32);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(dateTime32);
    int int41 = dateTime40.getDayOfMonth();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31-Dec-1969" + "'", str9, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(calendar26);
    org.junit.Assert.assertEquals(calendar26.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UNKNOWN" + "'", str37, "UNKNOWN");
    org.junit.Assert.assertNull(calendar38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + 25 + "'", int41 == 25);
  }

  @Test
  public void test445() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test445");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
    java.util.Date date8 = null;
    dateTime3.set(date8);
    net.ajaskey.common.DateTime dateTime12 = dateTime3.parse(
        "                                                                                                   7",
        "                                                                                                   7");
    int int13 = dateTime12.getYear();
    java.lang.String str14 = dateTime12.getDay();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertNotNull(dateTime12);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thursday" + "'", str14, "Thursday");
  }

  @Test
  public void test446() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test446");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    boolean boolean6 = dateTime2.isWeekday();
    java.lang.String str7 = dateTime2.getDay();
    java.util.Calendar calendar8 = dateTime2.getCal();
    dateTime2.setFirstWorkDay();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    int int12 = dateTime11.getMs();
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
    double double19 = dateTime16.getDeltaYears(dateTime18);
    java.text.SimpleDateFormat simpleDateFormat20 = dateTime16.getSdf();
    boolean boolean21 = dateTime11.isLessThanOrEqual(dateTime16);
    dateTime16.setFirstWorkDay();
    java.lang.String str23 = dateTime16.toFullString();
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(100L);
    double double30 = dateTime27.getDeltaYears(dateTime29);
    java.text.SimpleDateFormat simpleDateFormat32 = null;
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat32);
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double36 = dateTime33.getDeltaYears(dateTime35);
    boolean boolean37 = dateTime33.isWeekday();
    boolean boolean38 = dateTime27.sameDate(dateTime33);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(0L);
    boolean boolean41 = dateTime33.isGreaterThanOrEqual(dateTime40);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(100L);
    dateTime43.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str48 = dateTime43.getMonth();
    java.text.SimpleDateFormat simpleDateFormat50 = null;
    net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat50);
    net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double54 = dateTime51.getDeltaYears(dateTime53);
    boolean boolean55 = dateTime43.isLessThan(dateTime51);
    net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime(100L);
    double double62 = dateTime59.getDeltaYears(dateTime61);
    net.ajaskey.common.DateTime dateTime63 = null;
    long long64 = dateTime59.getDeltaDays(dateTime63);
    boolean boolean65 = dateTime51.isLessThanOrEqual(dateTime59);
    java.lang.String str66 = dateTime51.format();
    boolean boolean67 = dateTime33.isGreaterThan(dateTime51);
    boolean boolean68 = net.ajaskey.common.Utils.sameMonth(dateTime16, dateTime33);
    java.text.SimpleDateFormat simpleDateFormat72 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat74 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat75 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime("", simpleDateFormat74, simpleDateFormat75);
    net.ajaskey.common.DateTime dateTime77 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat72,
        simpleDateFormat75);
    net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat72);
    net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime("December", simpleDateFormat72);
    dateTime33.setSdf(simpleDateFormat72);
    boolean boolean81 = dateTime2.isLessThanOrEqual(dateTime33);
    java.lang.String str82 = dateTime33.toString();
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UNKNOWN" + "'", str7, "UNKNOWN");
    org.junit.Assert.assertNull(calendar8);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Thu 10-Apr-0002 14:03:26" + "'", str23, "Thu 10-Apr-0002 14:03:26");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1972.041095890411d) + "'", double30 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertEquals("'" + str48 + "' != '" + "January" + "'", str48, "January");
    org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1972.041095890411d) + "'", double62 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    org.junit.Assert.assertEquals("'" + str66 + "' != '" + "BAD-DATE-FORMAT" + "'", str66, "BAD-DATE-FORMAT");
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat72);
    org.junit.Assert.assertNotNull(simpleDateFormat74);
    org.junit.Assert.assertNotNull(simpleDateFormat75);
    org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
  }

  @Test
  public void test447() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test447");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(0, (int) (short) 100, 5);
  }

  @Test
  public void test448() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test448");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    net.ajaskey.common.DateTime dateTime9 = dateTime3
        .parse("                                                                                               52.00", "BAD-DATE-FORMAT");
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
    double double16 = dateTime13.getDeltaYears(dateTime15);
    java.text.SimpleDateFormat simpleDateFormat18 = null;
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat18);
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double22 = dateTime19.getDeltaYears(dateTime21);
    boolean boolean23 = dateTime19.isWeekday();
    boolean boolean24 = dateTime13.sameDate(dateTime19);
    java.text.SimpleDateFormat simpleDateFormat26 = null;
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat26);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double30 = dateTime27.getDeltaYears(dateTime29);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean35 = dateTime29.isEqual(dateTime34);
    dateTime13.set(dateTime34);
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean37 = dateTime9.isLessThan(dateTime13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(dateTime9);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1972.041095890411d) + "'", double16 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
  }

  @Test
  public void test449() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test449");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 1);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(100L);
    double double8 = dateTime5.getDeltaYears(dateTime7);
    boolean boolean9 = dateTime7.isWeekday();
    java.util.Date date10 = dateTime7.getTime();
    java.lang.String str11 = dateTime7.toString();
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    int int14 = dateTime13.getMs();
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
    double double21 = dateTime18.getDeltaYears(dateTime20);
    java.text.SimpleDateFormat simpleDateFormat22 = dateTime18.getSdf();
    boolean boolean23 = dateTime13.isLessThanOrEqual(dateTime18);
    boolean boolean24 = dateTime7.isLessThan(dateTime18);
    dateTime1.set(dateTime7);
    java.util.Calendar calendar26 = dateTime1.getCal();
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1972.041095890411d) + "'", double8 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(date10);
    org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "31-Dec-1969" + "'", str11, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(calendar26);
    org.junit.Assert.assertEquals(calendar26.toString(),
        "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
  }

  @Test
  public void test450() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test450");
    java.util.zip.ZipOutputStream zipOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.common.Utils.writeToZipFile("December", zipOutputStream1);
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: December (Access is denied)");
    }
    catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
  }

  @Test
  public void test451() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test451");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test452() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test452");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.util.Calendar calendar11 = dateTime4.getCal();
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(calendar11);
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
    double double19 = dateTime16.getDeltaYears(dateTime18);
    java.text.SimpleDateFormat simpleDateFormat20 = dateTime16.getSdf();
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    double double27 = dateTime24.getDeltaYears(dateTime26);
    boolean boolean28 = dateTime26.isWeekday();
    net.ajaskey.common.DateTime dateTime31 = dateTime26.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime32 = net.ajaskey.common.DateTime.copy(dateTime26);
    boolean boolean33 = dateTime16.sameDate(dateTime32);
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int36 = dateTime35.getDayOfWeek();
    int int37 = dateTime32.getYears(dateTime35);
    boolean boolean38 = dateTime12.isLessThanOrEqual(dateTime35);
    net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime();
    net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime(100L);
    dateTime41.set((int) (byte) 100, (-1), (int) '#');
    java.text.SimpleDateFormat simpleDateFormat46 = dateTime41.getSdf();
    boolean boolean47 = dateTime39.isEqual(dateTime41);
    net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime(100L);
    dateTime49.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str54 = dateTime49.getMonth();
    java.text.SimpleDateFormat simpleDateFormat56 = null;
    net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat56);
    net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double60 = dateTime57.getDeltaYears(dateTime59);
    boolean boolean61 = dateTime49.isLessThan(dateTime57);
    net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime(100L);
    double double68 = dateTime65.getDeltaYears(dateTime67);
    net.ajaskey.common.DateTime dateTime69 = null;
    long long70 = dateTime65.getDeltaDays(dateTime69);
    boolean boolean71 = dateTime57.isLessThanOrEqual(dateTime65);
    long long72 = dateTime39.getDeltaDays(dateTime65);
    boolean boolean73 = dateTime35.isEqual(dateTime39);
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(calendar11);
    org.junit.Assert.assertEquals(calendar11.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat20);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1972.041095890411d) + "'", double27 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertNull(dateTime31);
    org.junit.Assert.assertNotNull(dateTime32);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertNull(simpleDateFormat46);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertEquals("'" + str54 + "' != '" + "January" + "'", str54, "January");
    org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1972.041095890411d) + "'", double68 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    org.junit.Assert.assertTrue("'" + long72 + "' != '" + 738233L + "'", long72 == 738233L);
    org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
  }

  @Test
  public void test453() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test453");
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
    java.lang.String str28 = dateTime24.format("hi!");
    java.lang.String str29 = dateTime24.toString();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "BAD-DATE-FORMAT" + "'", str28, "BAD-DATE-FORMAT");
    org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10-Apr-0002" + "'", str29, "10-Apr-0002");
  }

  @Test
  public void test454() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test454");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int2 = dateTime1.getHour();
    int int3 = dateTime1.getDayOfYear();
    int int4 = dateTime1.getMs();
    java.text.SimpleDateFormat simpleDateFormat5 = dateTime1.getSdf();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertNull(simpleDateFormat5);
  }

  @Test
  public void test455() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test455");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime9.isWeekday();
    boolean boolean14 = dateTime3.sameDate(dateTime9);
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(0L);
    boolean boolean17 = dateTime9.isGreaterThanOrEqual(dateTime16);
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
    double double24 = dateTime21.getDeltaYears(dateTime23);
    boolean boolean25 = dateTime23.isWeekday();
    java.util.Date date26 = dateTime23.getTime();
    java.lang.String str27 = dateTime23.toString();
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(3, (int) '4', (int) (byte) 0);
    boolean boolean32 = dateTime23.isGreaterThan(dateTime31);
    java.text.SimpleDateFormat simpleDateFormat34 = null;
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat34);
    net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double38 = dateTime35.getDeltaYears(dateTime37);
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean43 = dateTime37.isEqual(dateTime42);
    java.util.Calendar calendar44 = dateTime37.getCal();
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(calendar44);
    net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime(calendar44);
    boolean boolean47 = dateTime23.isLessThan(dateTime46);
    java.text.SimpleDateFormat simpleDateFormat49 = null;
    net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat49);
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double53 = dateTime50.getDeltaYears(dateTime52);
    boolean boolean54 = dateTime50.isWeekday();
    java.lang.String str55 = dateTime50.getDay();
    java.util.Calendar calendar56 = dateTime50.getCal();
    boolean boolean57 = dateTime23.isLessThan(dateTime50);
    boolean boolean58 = net.ajaskey.common.Utils.sameDate(dateTime9, dateTime23);
    boolean boolean59 = dateTime23.isNull();
    net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat62 = dateTime61.getSdf();
    net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime(100L);
    int int65 = dateTime64.getMs();
    net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime(100L);
    double double72 = dateTime69.getDeltaYears(dateTime71);
    java.text.SimpleDateFormat simpleDateFormat73 = dateTime69.getSdf();
    boolean boolean74 = dateTime64.isLessThanOrEqual(dateTime69);
    java.lang.String str75 = dateTime64.getDay();
    java.text.SimpleDateFormat simpleDateFormat79 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat81 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat82 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime83 = new net.ajaskey.common.DateTime("", simpleDateFormat81, simpleDateFormat82);
    net.ajaskey.common.DateTime dateTime84 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat79,
        simpleDateFormat82);
    java.text.SimpleDateFormat simpleDateFormat86 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat87 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime88 = new net.ajaskey.common.DateTime("", simpleDateFormat86, simpleDateFormat87);
    net.ajaskey.common.DateTime dateTime89 = new net.ajaskey.common.DateTime("", simpleDateFormat82, simpleDateFormat87);
    java.text.SimpleDateFormat simpleDateFormat92 = null;
    java.text.SimpleDateFormat simpleDateFormat93 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime94 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat92, simpleDateFormat93);
    net.ajaskey.common.DateTime dateTime95 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat93);
    net.ajaskey.common.DateTime dateTime96 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat82, simpleDateFormat93);
    dateTime64.setSdf(simpleDateFormat93);
    double double98 = dateTime61.getDeltaYears(dateTime64);
    long long99 = dateTime23.getDeltaMilliSeconds(dateTime61);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1972.041095890411d) + "'", double24 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertNotNull(date26);
    org.junit.Assert.assertEquals(date26.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "31-Dec-1969" + "'", str27, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNotNull(calendar44);
    org.junit.Assert.assertEquals(calendar44.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    org.junit.Assert.assertEquals("'" + str55 + "' != '" + "UNKNOWN" + "'", str55, "UNKNOWN");
    org.junit.Assert.assertNull(calendar56);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    org.junit.Assert.assertNull(simpleDateFormat62);
    org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
    org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1972.041095890411d) + "'", double72 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat73);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Wednesday" + "'", str75, "Wednesday");
    org.junit.Assert.assertNotNull(simpleDateFormat79);
    org.junit.Assert.assertNotNull(simpleDateFormat81);
    org.junit.Assert.assertNotNull(simpleDateFormat82);
    org.junit.Assert.assertNotNull(simpleDateFormat86);
    org.junit.Assert.assertNotNull(simpleDateFormat87);
    org.junit.Assert.assertNotNull(simpleDateFormat93);
    org.junit.Assert.assertTrue("'" + double98 + "' != '" + 0.0d + "'", double98 == 0.0d);
    org.junit.Assert.assertTrue("'" + long99 + "' != '" + (-98L) + "'", long99 == (-98L));
  }

  @Test
  public void test456() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test456");
    java.lang.String[] strArray1 = null;
    java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDirTree("Thu 10-Apr-0002 14:03:19", strArray1);
    org.junit.Assert.assertNull(fileList2);
  }

  @Test
  public void test457() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test457");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Invalid Time", false);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test458() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test458");
    net.ajaskey.common.Utils.makeDir("      0.00");
  }

  @Test
  public void test459() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test459");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
    double double9 = dateTime6.getDeltaYears(dateTime8);
    java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
    boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
    dateTime6.setFirstWorkDay();
    java.lang.String str13 = dateTime6.toFullString();
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    java.text.SimpleDateFormat simpleDateFormat22 = null;
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat22);
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double26 = dateTime23.getDeltaYears(dateTime25);
    boolean boolean27 = dateTime23.isWeekday();
    boolean boolean28 = dateTime17.sameDate(dateTime23);
    net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(0L);
    boolean boolean31 = dateTime23.isGreaterThanOrEqual(dateTime30);
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
    dateTime33.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str38 = dateTime33.getMonth();
    java.text.SimpleDateFormat simpleDateFormat40 = null;
    net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat40);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double44 = dateTime41.getDeltaYears(dateTime43);
    boolean boolean45 = dateTime33.isLessThan(dateTime41);
    net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(100L);
    double double52 = dateTime49.getDeltaYears(dateTime51);
    net.ajaskey.common.DateTime dateTime53 = null;
    long long54 = dateTime49.getDeltaDays(dateTime53);
    boolean boolean55 = dateTime41.isLessThanOrEqual(dateTime49);
    java.lang.String str56 = dateTime41.format();
    boolean boolean57 = dateTime23.isGreaterThan(dateTime41);
    boolean boolean58 = net.ajaskey.common.Utils.sameMonth(dateTime6, dateTime23);
    net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime(100L);
    double double65 = dateTime62.getDeltaYears(dateTime64);
    java.util.Date date66 = dateTime62.getTime();
    net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime(date66);
    boolean boolean68 = dateTime23.isEqual(dateTime67);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Thu 10-Apr-0002 14:03:26" + "'", str13, "Thu 10-Apr-0002 14:03:26");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1972.041095890411d) + "'", double20 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "January" + "'", str38, "January");
    org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1972.041095890411d) + "'", double52 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    org.junit.Assert.assertEquals("'" + str56 + "' != '" + "BAD-DATE-FORMAT" + "'", str56, "BAD-DATE-FORMAT");
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1972.041095890411d) + "'", double65 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Thu Apr 10 14:03:26 MST 2");
    org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
  }

  @Test
  public void test460() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test460");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 31);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test461() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test461");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    java.lang.String str2 = dateTime1.toString();
    int int3 = dateTime1.getDayOfMonth();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "31-Dec-1969" + "'", str2, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
  }

  @Test
  public void test462() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test462");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile(
        "                                                                                                                                                                                                                                                                                                                                                                        35.00",
        false);
    java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
  }

  @Test
  public void test463() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test463");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat1, simpleDateFormat2);
    java.lang.String str4 = dateTime3.getDay();
    java.lang.String str5 = dateTime3.getMonth();
    boolean boolean6 = dateTime3.isNull();
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean17 = dateTime11.isEqual(dateTime16);
    java.text.SimpleDateFormat simpleDateFormat19 = null;
    java.text.SimpleDateFormat simpleDateFormat20 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat19, simpleDateFormat20);
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(100L);
    double double28 = dateTime25.getDeltaYears(dateTime27);
    boolean boolean29 = dateTime27.isWeekday();
    java.util.Date date30 = dateTime27.getTime();
    java.lang.String str31 = dateTime27.toString();
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
    int int34 = dateTime33.getMs();
    net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(100L);
    double double41 = dateTime38.getDeltaYears(dateTime40);
    java.text.SimpleDateFormat simpleDateFormat42 = dateTime38.getSdf();
    boolean boolean43 = dateTime33.isLessThanOrEqual(dateTime38);
    boolean boolean44 = dateTime27.isLessThan(dateTime38);
    java.lang.String str45 = dateTime27.toString();
    long long46 = dateTime21.getDeltaMilliSeconds(dateTime27);
    net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime(100L);
    double double53 = dateTime50.getDeltaYears(dateTime52);
    boolean boolean54 = dateTime52.isWeekday();
    java.util.Date date55 = dateTime52.getTime();
    int int56 = dateTime52.getMinute();
    boolean boolean57 = dateTime21.sameDate(dateTime52);
    int int58 = dateTime11.getYears(dateTime52);
    java.util.Date date59 = dateTime52.getTime();
    net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime(date59);
    dateTime3.set(dateTime60);
    org.junit.Assert.assertNotNull(simpleDateFormat2);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UNKNOWN" + "'", str4, "UNKNOWN");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UNKNOWN" + "'", str5, "UNKNOWN");
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat20);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1972.041095890411d) + "'", double28 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    org.junit.Assert.assertNotNull(date30);
    org.junit.Assert.assertEquals(date30.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "31-Dec-1969" + "'", str31, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1972.041095890411d) + "'", double41 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat42);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertEquals("'" + str45 + "' != '" + "31-Dec-1969" + "'", str45, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1972.041095890411d) + "'", double53 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    org.junit.Assert.assertNotNull(date55);
    org.junit.Assert.assertEquals(date55.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    org.junit.Assert.assertNotNull(date59);
    org.junit.Assert.assertEquals(date59.toString(), "Wed Dec 31 17:00:00 MST 1969");
  }

  @Test
  public void test464() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test464");
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("         52",
        "                                                                                               52.00");
    net.ajaskey.common.DateTime dateTime3 = null;
    boolean boolean4 = dateTime2.isGreaterThanOrEqual(dateTime3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test465() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test465");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat2 = dateTime1.getSdf();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime6.isLessThan(dateTime11);
    int int14 = dateTime6.getHour();
    long long15 = dateTime1.getDeltaDays(dateTime6);
    java.lang.String str16 = dateTime1.toString();
    int int17 = dateTime1.getYear();
    int int18 = dateTime1.getYear();
    int int19 = dateTime1.getMs();
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(100L);
    double double26 = dateTime23.getDeltaYears(dateTime25);
    java.text.SimpleDateFormat simpleDateFormat28 = null;
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat28);
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double32 = dateTime29.getDeltaYears(dateTime31);
    boolean boolean33 = dateTime29.isWeekday();
    boolean boolean34 = dateTime23.sameDate(dateTime29);
    java.text.SimpleDateFormat simpleDateFormat36 = null;
    net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat36);
    net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double40 = dateTime37.getDeltaYears(dateTime39);
    net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean45 = dateTime39.isEqual(dateTime44);
    dateTime23.set(dateTime44);
    net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double49 = dateTime44.getDeltaYears(dateTime48);
    int int50 = dateTime48.getDayOfWeek();
    boolean boolean51 = dateTime1.isEqual(dateTime48);
    net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime(100L);
    double double58 = dateTime55.getDeltaYears(dateTime57);
    java.text.SimpleDateFormat simpleDateFormat60 = null;
    net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat60);
    net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double64 = dateTime61.getDeltaYears(dateTime63);
    boolean boolean65 = dateTime61.isWeekday();
    boolean boolean66 = dateTime55.sameDate(dateTime61);
    java.text.SimpleDateFormat simpleDateFormat68 = null;
    net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat68);
    net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double72 = dateTime69.getDeltaYears(dateTime71);
    net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean77 = dateTime71.isEqual(dateTime76);
    dateTime55.set(dateTime76);
    net.ajaskey.common.DateTime dateTime80 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int81 = dateTime80.getDayOfWeek();
    double double82 = dateTime76.getDeltaYears(dateTime80);
    java.text.SimpleDateFormat simpleDateFormat83 = dateTime76.getSdf();
    boolean boolean84 = dateTime48.isLessThan(dateTime76);
    net.ajaskey.common.DateTime dateTime86 = dateTime48
        .parse("                                                                                                   7");
    boolean boolean87 = dateTime48.isWeekday();
    java.text.SimpleDateFormat simpleDateFormat88 = dateTime48.getSdf();
    org.junit.Assert.assertNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 719795L + "'", long15 == 719795L);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "31-Dec-1969" + "'", str16, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1969 + "'", int17 == 1969);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1969 + "'", int18 == 1969);
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1972.041095890411d) + "'", double26 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1972.041095890411d) + "'", double49 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1972.041095890411d) + "'", double58 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    org.junit.Assert.assertTrue("'" + int81 + "' != '" + 4 + "'", int81 == 4);
    org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1972.041095890411d) + "'", double82 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat83);
    org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    org.junit.Assert.assertNull(dateTime86);
    org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    org.junit.Assert.assertNull(simpleDateFormat88);
  }

  @Test
  public void test466() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test466");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) 10, 365, (int) '#');
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(1, 7, 7);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = net.ajaskey.common.Utils.sameMonth(dateTime7, dateTime13);
    boolean boolean16 = dateTime3.isGreaterThan(dateTime7);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test467() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test467");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    java.util.Date date8 = dateTime5.getTime();
    int int9 = dateTime5.getMinute();
    java.text.SimpleDateFormat simpleDateFormat11 = null;
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat11);
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double15 = dateTime12.getDeltaYears(dateTime14);
    net.ajaskey.common.DateTime dateTime16 = net.ajaskey.common.DateTime.copy(dateTime12);
    boolean boolean17 = net.ajaskey.common.Utils.sameDate(dateTime5, dateTime12);
    java.text.SimpleDateFormat simpleDateFormat20 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat22 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat23 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("", simpleDateFormat22, simpleDateFormat23);
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat20,
        simpleDateFormat23);
    java.text.SimpleDateFormat simpleDateFormat27 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat28 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("", simpleDateFormat27, simpleDateFormat28);
    net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("", simpleDateFormat23, simpleDateFormat28);
    dateTime5.setSdf(simpleDateFormat23);
    java.text.SimpleDateFormat simpleDateFormat35 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat37 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat38 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime("", simpleDateFormat37, simpleDateFormat38);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat35,
        simpleDateFormat38);
    java.text.SimpleDateFormat simpleDateFormat42 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat43 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime("", simpleDateFormat42, simpleDateFormat43);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime("", simpleDateFormat38, simpleDateFormat43);
    java.text.SimpleDateFormat simpleDateFormat48 = null;
    java.text.SimpleDateFormat simpleDateFormat49 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat48, simpleDateFormat49);
    net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat49);
    net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat38, simpleDateFormat49);
    net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int55 = dateTime54.getHour();
    int int56 = dateTime54.getDayOfMonth();
    int int57 = dateTime54.getYear();
    net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime(dateTime54);
    int int59 = dateTime52.getYears(dateTime58);
    boolean boolean60 = dateTime5.isLessThan(dateTime58);
    java.util.Date date61 = dateTime58.getTime();
    java.text.SimpleDateFormat simpleDateFormat63 = null;
    net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat63);
    net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double67 = dateTime64.getDeltaYears(dateTime66);
    net.ajaskey.common.DateTime dateTime68 = net.ajaskey.common.DateTime.copy(dateTime64);
    // The following exception was thrown during execution in test generation
    try {
      dateTime58.set(dateTime64);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(date8);
    org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertNull(dateTime16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat20);
    org.junit.Assert.assertNotNull(simpleDateFormat22);
    org.junit.Assert.assertNotNull(simpleDateFormat23);
    org.junit.Assert.assertNotNull(simpleDateFormat27);
    org.junit.Assert.assertNotNull(simpleDateFormat28);
    org.junit.Assert.assertNotNull(simpleDateFormat35);
    org.junit.Assert.assertNotNull(simpleDateFormat37);
    org.junit.Assert.assertNotNull(simpleDateFormat38);
    org.junit.Assert.assertNotNull(simpleDateFormat42);
    org.junit.Assert.assertNotNull(simpleDateFormat43);
    org.junit.Assert.assertNotNull(simpleDateFormat49);
    org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
    org.junit.Assert.assertTrue("'" + int56 + "' != '" + 31 + "'", int56 == 31);
    org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1969 + "'", int57 == 1969);
    org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertNotNull(date61);
    org.junit.Assert.assertEquals(date61.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
    org.junit.Assert.assertNull(dateTime68);
  }

  @Test
  public void test468() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test468");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) (-1968));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test469() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test469");
    java.text.SimpleDateFormat simpleDateFormat5 = null;
    java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat5, simpleDateFormat6);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat6);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat6);
    net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat6);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 14:03:13", simpleDateFormat6);
    dateTime11.setFirstWorkDay();
    org.junit.Assert.assertNotNull(simpleDateFormat6);
  }

  @Test
  public void test470() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test470");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    net.ajaskey.common.DateTime dateTime18 = dateTime13.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime19 = net.ajaskey.common.DateTime.copy(dateTime13);
    boolean boolean20 = dateTime3.sameDate(dateTime19);
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    double double27 = dateTime24.getDeltaYears(dateTime26);
    boolean boolean28 = dateTime19.isGreaterThan(dateTime24);
    int int29 = dateTime24.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
    int int32 = dateTime31.getMs();
    net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime(100L);
    double double39 = dateTime36.getDeltaYears(dateTime38);
    java.text.SimpleDateFormat simpleDateFormat40 = dateTime36.getSdf();
    boolean boolean41 = dateTime31.isLessThanOrEqual(dateTime36);
    net.ajaskey.common.DateTime dateTime44 = dateTime36.parse("      0.00", "         52");
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean45 = dateTime24.sameDate(dateTime44);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNull(dateTime18);
    org.junit.Assert.assertNotNull(dateTime19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1972.041095890411d) + "'", double27 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1972.041095890411d) + "'", double39 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat40);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertNull(dateTime44);
  }

  @Test
  public void test471() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test471");
    net.ajaskey.common.Utils.TAB = "        2";
  }

  @Test
  public void test472() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test472");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.lang.String str3 = dateTime1.toString();
    int int4 = dateTime1.getMs();
    net.ajaskey.common.DateTime dateTime6 = dateTime1.parse("");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    org.junit.Assert.assertNull(dateTime6);
  }

  @Test
  public void test473() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test473");
    net.ajaskey.common.Utils.makeDir(
        "January         52         52                                                                                               52.00         52hi!         52");
  }

  @Test
  public void test474() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test474");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    int int7 = dateTime1.getMs();
    java.lang.String str9 = dateTime1.format("                                                                                               52.00");
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    dateTime11.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str16 = dateTime11.getMonth();
    long long17 = dateTime1.getDeltaDays(dateTime11);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
    dateTime19.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str24 = dateTime19.getMonth();
    java.text.SimpleDateFormat simpleDateFormat26 = null;
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat26);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double30 = dateTime27.getDeltaYears(dateTime29);
    boolean boolean31 = dateTime19.isLessThan(dateTime27);
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
    double double38 = dateTime35.getDeltaYears(dateTime37);
    net.ajaskey.common.DateTime dateTime39 = null;
    long long40 = dateTime35.getDeltaDays(dateTime39);
    boolean boolean41 = dateTime27.isLessThanOrEqual(dateTime35);
    boolean boolean42 = dateTime1.isGreaterThanOrEqual(dateTime35);
    boolean boolean43 = dateTime35.isNull();
    boolean boolean44 = dateTime35.isWeekday();
    int int45 = dateTime35.getDayOfMonth();
    net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((long) (short) 0);
    boolean boolean48 = dateTime35.sameDate(dateTime47);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "                                                                                               52.00" + "'", str9,
        "                                                                                               52.00");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "January" + "'", str16, "January");
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "January" + "'", str24, "January");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1972.041095890411d) + "'", double38 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
  }

  @Test
  public void test475() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test475");
    java.lang.String str2 = net.ajaskey.common.Utils.ifmt(2020, (int) (short) 100);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "                                                                                               2,020" + "'", str2,
        "                                                                                               2,020");
  }

  @Test
  public void test476() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test476");
    java.lang.String str1 = net.ajaskey.common.Utils
        .getFromUrl("                                                                                                   7");
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
  }

  @Test
  public void test478() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test478");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat8 = null;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double12 = dateTime9.getDeltaYears(dateTime11);
    boolean boolean13 = dateTime9.isWeekday();
    boolean boolean14 = dateTime3.sameDate(dateTime9);
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
    int int17 = dateTime16.getMs();
    java.text.SimpleDateFormat simpleDateFormat18 = net.ajaskey.common.Utils.sdf;
    dateTime16.setSdf(simpleDateFormat18);
    long long20 = dateTime3.getDeltaDays(dateTime16);
    java.text.SimpleDateFormat simpleDateFormat21 = dateTime16.getSdf();
    net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
    int int24 = dateTime23.getMs();
    java.text.SimpleDateFormat simpleDateFormat25 = net.ajaskey.common.Utils.sdf;
    dateTime23.setSdf(simpleDateFormat25);
    dateTime16.setSdf(simpleDateFormat25);
    net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat30 = dateTime29.getSdf();
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime(100L);
    int int33 = dateTime32.getMs();
    java.lang.String str34 = dateTime32.toString();
    int int35 = dateTime32.getMs();
    java.util.Calendar calendar36 = dateTime32.getCal();
    int int37 = dateTime29.getYears(dateTime32);
    boolean boolean38 = dateTime16.isLessThan(dateTime29);
    int int39 = dateTime29.getMinute();
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat18);
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-719795L) + "'", long20 == (-719795L));
    org.junit.Assert.assertNotNull(simpleDateFormat21);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat25);
    org.junit.Assert.assertNull(simpleDateFormat30);
    org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    org.junit.Assert.assertEquals("'" + str34 + "' != '" + "31-Dec-1969" + "'", str34, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    org.junit.Assert.assertNotNull(calendar36);
    org.junit.Assert.assertEquals(calendar36.toString(),
        "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
  }

  @Test
  public void test479() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test479");
    java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 50);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test480() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test480");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
    double double9 = dateTime6.getDeltaYears(dateTime8);
    java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
    boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
    dateTime6.setFirstWorkDay();
    java.lang.String str13 = dateTime6.toFullString();
    int int14 = dateTime6.getHour();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Thu 10-Apr-0002 14:03:27" + "'", str13, "Thu 10-Apr-0002 14:03:27");
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
  }

  @Test
  public void test481() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test481");
    net.ajaskey.common.TextUtils.printline("Invalid fmt");
  }

  @Test
  public void test482() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test482");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    boolean boolean15 = dateTime13.isWeekday();
    net.ajaskey.common.DateTime dateTime18 = dateTime13.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime19 = net.ajaskey.common.DateTime.copy(dateTime13);
    boolean boolean20 = dateTime3.sameDate(dateTime19);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int23 = dateTime22.getDayOfWeek();
    int int24 = dateTime19.getYears(dateTime22);
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    int int27 = dateTime26.getMs();
    java.lang.String str28 = dateTime26.toString();
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    java.text.SimpleDateFormat simpleDateFormat37 = null;
    net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat37);
    net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double41 = dateTime38.getDeltaYears(dateTime40);
    boolean boolean42 = dateTime38.isWeekday();
    boolean boolean43 = dateTime32.sameDate(dateTime38);
    java.text.SimpleDateFormat simpleDateFormat45 = null;
    net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat45);
    net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double49 = dateTime46.getDeltaYears(dateTime48);
    net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean54 = dateTime48.isEqual(dateTime53);
    dateTime32.set(dateTime53);
    boolean boolean56 = net.ajaskey.common.Utils.sameDate(dateTime26, dateTime32);
    long long57 = dateTime19.getDeltaMilliSeconds(dateTime32);
    boolean boolean58 = dateTime19.isNull();
    int int59 = dateTime19.getSecond();
    net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime(100L);
    double double66 = dateTime63.getDeltaYears(dateTime65);
    java.text.SimpleDateFormat simpleDateFormat67 = dateTime63.getSdf();
    java.util.Date date68 = null;
    dateTime63.set(date68);
    boolean boolean70 = net.ajaskey.common.Utils.sameMonth(dateTime19, dateTime63);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat7);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNull(dateTime18);
    org.junit.Assert.assertNotNull(dateTime19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "31-Dec-1969" + "'", str28, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-62190298592980L) + "'", long57 == (-62190298592980L));
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1972.041095890411d) + "'", double66 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat67);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
  }

  @Test
  public void test483() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test483");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(12, 4, (-1));
    int int4 = dateTime3.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int7 = dateTime6.getHour();
    int int8 = dateTime6.getDayOfMonth();
    int int9 = dateTime6.getYear();
    java.util.Calendar calendar10 = dateTime6.getCal();
    int int11 = dateTime6.getYear();
    java.util.Date date12 = dateTime6.getTime();
    dateTime3.set(date12);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1969 + "'", int9 == 1969);
    org.junit.Assert.assertNotNull(calendar10);
    org.junit.Assert.assertEquals(calendar10.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1969 + "'", int11 == 1969);
    org.junit.Assert.assertNotNull(date12);
    org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 31 17:00:00 MST 1969");
  }

  @Test
  public void test484() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test484");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    int int6 = dateTime4.getDayOfYear();
    net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(0L);
    long long9 = dateTime4.getDeltaDays(dateTime8);
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
    int int12 = dateTime11.getMs();
    net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
    double double19 = dateTime16.getDeltaYears(dateTime18);
    java.text.SimpleDateFormat simpleDateFormat20 = dateTime16.getSdf();
    boolean boolean21 = dateTime11.isLessThanOrEqual(dateTime16);
    java.lang.String str22 = dateTime11.getDay();
    java.text.SimpleDateFormat simpleDateFormat26 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat28 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat29 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("", simpleDateFormat28, simpleDateFormat29);
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat26,
        simpleDateFormat29);
    java.text.SimpleDateFormat simpleDateFormat33 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat34 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("", simpleDateFormat33, simpleDateFormat34);
    net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("", simpleDateFormat29, simpleDateFormat34);
    java.text.SimpleDateFormat simpleDateFormat39 = null;
    java.text.SimpleDateFormat simpleDateFormat40 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat39, simpleDateFormat40);
    net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime("Invalid fmt", simpleDateFormat40);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("Fri 31-Dec-0001 17:00:00", simpleDateFormat29, simpleDateFormat40);
    dateTime11.setSdf(simpleDateFormat40);
    boolean boolean45 = dateTime4.isLessThanOrEqual(dateTime11);
    net.ajaskey.common.DateTime dateTime48 = dateTime4.parse("Wed 31-Dec-1969 17:00:00", "1");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Wednesday" + "'", str22, "Wednesday");
    org.junit.Assert.assertNotNull(simpleDateFormat26);
    org.junit.Assert.assertNotNull(simpleDateFormat28);
    org.junit.Assert.assertNotNull(simpleDateFormat29);
    org.junit.Assert.assertNotNull(simpleDateFormat33);
    org.junit.Assert.assertNotNull(simpleDateFormat34);
    org.junit.Assert.assertNotNull(simpleDateFormat40);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertNull(dateTime48);
  }

  @Test
  public void test485() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test485");
    java.lang.String[] strArray7 = new java.lang.String[] { "Wed 31-Dec-1969 17:00:00",
        "UNKNOWNJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969JanuaryJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969hi!January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969JanuaryJanuary31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969Wed 31-Dec-1969 17:00:00January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969       10.00January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        "         52", "         52",
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        "       10.00", "Wednesday" };
    java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
    boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
    net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList8);
    net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList8);
    org.junit.Assert.assertNotNull(strArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
  }

  @Test
  public void test486() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test486");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    java.lang.String str7 = dateTime1.format();
    int int8 = dateTime1.getYear();
    int int9 = dateTime1.getHour();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "BAD-DATE-FORMAT" + "'", str7, "BAD-DATE-FORMAT");
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
  }

  @Test
  public void test487() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test487");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat1, simpleDateFormat2);
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
    double double10 = dateTime7.getDeltaYears(dateTime9);
    boolean boolean11 = dateTime9.isWeekday();
    java.util.Date date12 = dateTime9.getTime();
    java.lang.String str13 = dateTime9.toString();
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
    int int16 = dateTime15.getMs();
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
    double double23 = dateTime20.getDeltaYears(dateTime22);
    java.text.SimpleDateFormat simpleDateFormat24 = dateTime20.getSdf();
    boolean boolean25 = dateTime15.isLessThanOrEqual(dateTime20);
    boolean boolean26 = dateTime9.isLessThan(dateTime20);
    java.lang.String str27 = dateTime9.toString();
    long long28 = dateTime3.getDeltaMilliSeconds(dateTime9);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    boolean boolean36 = dateTime34.isWeekday();
    java.util.Date date37 = dateTime34.getTime();
    int int38 = dateTime34.getMinute();
    boolean boolean39 = dateTime3.sameDate(dateTime34);
    net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((long) (short) 0);
    int int42 = dateTime41.getHour();
    int int43 = dateTime41.getDayOfMonth();
    int int44 = dateTime41.getYear();
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(dateTime41);
    boolean boolean46 = net.ajaskey.common.Utils.sameDate(dateTime34, dateTime41);
    net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) 2);
    java.text.SimpleDateFormat simpleDateFormat49 = dateTime48.getSdf();
    long long50 = dateTime41.getDeltaMilliSeconds(dateTime48);
    org.junit.Assert.assertNotNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1972.041095890411d) + "'", double10 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(date12);
    org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31-Dec-1969" + "'", str13, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1972.041095890411d) + "'", double23 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "31-Dec-1969" + "'", str27, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertNotNull(date37);
    org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
    org.junit.Assert.assertTrue("'" + int43 + "' != '" + 31 + "'", int43 == 31);
    org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1969 + "'", int44 == 1969);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    org.junit.Assert.assertNull(simpleDateFormat49);
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + 2L + "'", long50 == 2L);
  }

  @Test
  public void test488() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test488");
    java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 4, 14);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
  }

  @Test
  public void test489() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test489");
    java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
    java.text.SimpleDateFormat simpleDateFormat5 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("", simpleDateFormat4, simpleDateFormat5);
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(
        "                                                                                               52.00", simpleDateFormat2, simpleDateFormat5);
    java.text.SimpleDateFormat simpleDateFormat8 = net.ajaskey.common.Utils.sdf;
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("", simpleDateFormat5, simpleDateFormat8);
    java.text.SimpleDateFormat simpleDateFormat11 = null;
    net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat11);
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double15 = dateTime12.getDeltaYears(dateTime14);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean20 = dateTime14.isEqual(dateTime19);
    java.text.SimpleDateFormat simpleDateFormat22 = null;
    java.text.SimpleDateFormat simpleDateFormat23 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat22, simpleDateFormat23);
    net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(100L);
    double double31 = dateTime28.getDeltaYears(dateTime30);
    boolean boolean32 = dateTime30.isWeekday();
    java.util.Date date33 = dateTime30.getTime();
    java.lang.String str34 = dateTime30.toString();
    net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime(100L);
    int int37 = dateTime36.getMs();
    net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(100L);
    double double44 = dateTime41.getDeltaYears(dateTime43);
    java.text.SimpleDateFormat simpleDateFormat45 = dateTime41.getSdf();
    boolean boolean46 = dateTime36.isLessThanOrEqual(dateTime41);
    boolean boolean47 = dateTime30.isLessThan(dateTime41);
    java.lang.String str48 = dateTime30.toString();
    long long49 = dateTime24.getDeltaMilliSeconds(dateTime30);
    net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime(100L);
    double double56 = dateTime53.getDeltaYears(dateTime55);
    boolean boolean57 = dateTime55.isWeekday();
    java.util.Date date58 = dateTime55.getTime();
    int int59 = dateTime55.getMinute();
    boolean boolean60 = dateTime24.sameDate(dateTime55);
    int int61 = dateTime14.getYears(dateTime55);
    java.util.Date date62 = dateTime55.getTime();
    dateTime9.set(date62);
    net.ajaskey.common.DateTime dateTime64 = net.ajaskey.common.DateTime.copy(dateTime9);
    org.junit.Assert.assertNotNull(simpleDateFormat2);
    org.junit.Assert.assertNotNull(simpleDateFormat4);
    org.junit.Assert.assertNotNull(simpleDateFormat5);
    org.junit.Assert.assertNotNull(simpleDateFormat8);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat23);
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1972.041095890411d) + "'", double31 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    org.junit.Assert.assertNotNull(date33);
    org.junit.Assert.assertEquals(date33.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str34 + "' != '" + "31-Dec-1969" + "'", str34, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
    org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1972.041095890411d) + "'", double44 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat45);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertEquals("'" + str48 + "' != '" + "31-Dec-1969" + "'", str48, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1972.041095890411d) + "'", double56 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    org.junit.Assert.assertNotNull(date58);
    org.junit.Assert.assertEquals(date58.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    org.junit.Assert.assertNotNull(date62);
    org.junit.Assert.assertEquals(date62.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertNotNull(dateTime64);
  }

  @Test
  public void test490() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test490");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    dateTime1.setFirstWorkDay();
    int int7 = dateTime1.getHour();
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
    int int10 = dateTime9.getMs();
    java.text.SimpleDateFormat simpleDateFormat11 = net.ajaskey.common.Utils.sdf;
    dateTime9.setSdf(simpleDateFormat11);
    int int13 = dateTime9.getDayOfWeek();
    net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
    double double20 = dateTime17.getDeltaYears(dateTime19);
    java.util.Calendar calendar21 = dateTime17.getCal();
    dateTime9.set(calendar21);
    java.text.SimpleDateFormat simpleDateFormat24 = null;
    net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
    net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double28 = dateTime25.getDeltaYears(dateTime27);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean33 = dateTime27.isEqual(dateTime32);
    java.util.Calendar calendar34 = dateTime27.getCal();
    net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime(calendar34);
    dateTime9.set(calendar34);
    int int37 = dateTime9.getDayOfYear();
    boolean boolean38 = dateTime1.isEqual(dateTime9);
    int int39 = dateTime9.getSecond();
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat11);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1972.041095890411d) + "'", double20 == (-1972.041095890411d));
    org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=-62190298592743,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=27,MILLISECOND=257,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(calendar34);
    org.junit.Assert.assertEquals(calendar34.toString(),
        "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + 365 + "'", int37 == 365);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
  }

  @Test
  public void test491() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test491");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("", false);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test492() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test492");
    net.ajaskey.common.TextUtils.printline("Thu 10-Apr-0002 14:03:13");
  }

  @Test
  public void test493() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test493");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("        1.00", true);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test494() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test494");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    int int2 = dateTime1.getMs();
    java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
    dateTime1.setSdf(simpleDateFormat3);
    java.lang.String str5 = dateTime1.toFullString();
    net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime(dateTime1);
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime();
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
    dateTime9.set((int) (byte) 100, (-1), (int) '#');
    java.text.SimpleDateFormat simpleDateFormat14 = dateTime9.getSdf();
    boolean boolean15 = dateTime7.isEqual(dateTime9);
    net.ajaskey.common.DateTime dateTime16 = net.ajaskey.common.DateTime.copy(dateTime7);
    java.util.Calendar calendar17 = dateTime7.getCal();
    dateTime6.set(calendar17);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    org.junit.Assert.assertNotNull(simpleDateFormat3);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str5, "Wed 31-Dec-1969 17:00:00");
    org.junit.Assert.assertNull(simpleDateFormat14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(dateTime16);
    org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1593115407330,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=5,WEEK_OF_YEAR=26,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=177,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=3,SECOND=27,MILLISECOND=330,ZONE_OFFSET=-25200000,DST_OFFSET=3600000]");
  }

  @Test
  public void test495() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test495");
    net.ajaskey.common.Utils.TAB = "                                                                                               2,020";
  }

  @Test
  public void test496() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test496");
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
    double double6 = dateTime3.getDeltaYears(dateTime5);
    boolean boolean7 = dateTime5.isWeekday();
    net.ajaskey.common.DateTime dateTime10 = dateTime5.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime11 = net.ajaskey.common.DateTime.copy(dateTime5);
    dateTime11.set((int) ' ', 1970, (int) (short) -1);
    net.ajaskey.common.DateTime dateTime17 = dateTime11.parse(
        "JanuaryThu 10-Apr-0002 14:03:11Thu 10-Apr-0002 14:03:11                                                                                               52.00Thu 10-Apr-0002 14:03:11hi!Thu 10-Apr-0002 14:03:11");
    java.lang.String str18 = dateTime11.getDay();
    dateTime11.setFirstWorkDay();
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
    dateTime21.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str26 = dateTime21.getMonth();
    int int27 = dateTime21.getMs();
    java.lang.String str29 = dateTime21
        .format("                                                                                               52.00");
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
    dateTime31.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str36 = dateTime31.getMonth();
    long long37 = dateTime21.getDeltaDays(dateTime31);
    net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime(100L);
    dateTime39.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str44 = dateTime39.getMonth();
    java.text.SimpleDateFormat simpleDateFormat46 = null;
    net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat46);
    net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double50 = dateTime47.getDeltaYears(dateTime49);
    boolean boolean51 = dateTime39.isLessThan(dateTime47);
    net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime(100L);
    double double58 = dateTime55.getDeltaYears(dateTime57);
    net.ajaskey.common.DateTime dateTime59 = null;
    long long60 = dateTime55.getDeltaDays(dateTime59);
    boolean boolean61 = dateTime47.isLessThanOrEqual(dateTime55);
    boolean boolean62 = dateTime21.isGreaterThanOrEqual(dateTime55);
    boolean boolean63 = net.ajaskey.common.Utils.sameDate(dateTime11, dateTime21);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(dateTime10);
    org.junit.Assert.assertNotNull(dateTime11);
    org.junit.Assert.assertNull(dateTime17);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Saturday" + "'", str18, "Saturday");
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "January" + "'", str26, "January");
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    org.junit.Assert.assertEquals(
        "'" + str29 + "' != '" + "                                                                                               52.00" + "'", str29,
        "                                                                                               52.00");
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "January" + "'", str36, "January");
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    org.junit.Assert.assertEquals("'" + str44 + "' != '" + "January" + "'", str44, "January");
    org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1972.041095890411d) + "'", double58 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
  }

  @Test
  public void test497() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test497");
    java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("        1.00", false);
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test498() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test498");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat1, simpleDateFormat2);
    net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
    double double10 = dateTime7.getDeltaYears(dateTime9);
    boolean boolean11 = dateTime9.isWeekday();
    java.util.Date date12 = dateTime9.getTime();
    java.lang.String str13 = dateTime9.toString();
    net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
    int int16 = dateTime15.getMs();
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
    double double23 = dateTime20.getDeltaYears(dateTime22);
    java.text.SimpleDateFormat simpleDateFormat24 = dateTime20.getSdf();
    boolean boolean25 = dateTime15.isLessThanOrEqual(dateTime20);
    boolean boolean26 = dateTime9.isLessThan(dateTime20);
    java.lang.String str27 = dateTime9.toString();
    long long28 = dateTime3.getDeltaMilliSeconds(dateTime9);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    boolean boolean36 = dateTime34.isWeekday();
    java.util.Date date37 = dateTime34.getTime();
    int int38 = dateTime34.getMinute();
    boolean boolean39 = dateTime3.sameDate(dateTime34);
    int int40 = dateTime34.getYear();
    int int41 = dateTime34.getMs();
    org.junit.Assert.assertNotNull(simpleDateFormat2);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1972.041095890411d) + "'", double10 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(date12);
    org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31-Dec-1969" + "'", str13, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1972.041095890411d) + "'", double23 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "31-Dec-1969" + "'", str27, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertNotNull(date37);
    org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1969 + "'", int40 == 1969);
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
  }

  @Test
  public void test499() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test499");
    java.text.SimpleDateFormat simpleDateFormat1 = null;
    net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
    net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
    double double5 = dateTime2.getDeltaYears(dateTime4);
    net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    boolean boolean10 = dateTime4.isEqual(dateTime9);
    java.text.SimpleDateFormat simpleDateFormat12 = null;
    java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdfFull;
    net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(
        "January31-Dec-196931-Dec-1969                                                                                               52.0031-Dec-1969hi!31-Dec-1969",
        simpleDateFormat12, simpleDateFormat13);
    net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
    double double21 = dateTime18.getDeltaYears(dateTime20);
    boolean boolean22 = dateTime20.isWeekday();
    java.util.Date date23 = dateTime20.getTime();
    java.lang.String str24 = dateTime20.toString();
    net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
    int int27 = dateTime26.getMs();
    net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
    double double34 = dateTime31.getDeltaYears(dateTime33);
    java.text.SimpleDateFormat simpleDateFormat35 = dateTime31.getSdf();
    boolean boolean36 = dateTime26.isLessThanOrEqual(dateTime31);
    boolean boolean37 = dateTime20.isLessThan(dateTime31);
    java.lang.String str38 = dateTime20.toString();
    long long39 = dateTime14.getDeltaMilliSeconds(dateTime20);
    net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
    double double46 = dateTime43.getDeltaYears(dateTime45);
    boolean boolean47 = dateTime45.isWeekday();
    java.util.Date date48 = dateTime45.getTime();
    int int49 = dateTime45.getMinute();
    boolean boolean50 = dateTime14.sameDate(dateTime45);
    int int51 = dateTime4.getYears(dateTime45);
    int int52 = dateTime45.getDayOfWeek();
    java.util.Date date53 = dateTime45.getTime();
    dateTime45.add(12, 50);
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(simpleDateFormat13);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(date23);
    org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "31-Dec-1969" + "'", str24, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1972.041095890411d) + "'", double34 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "31-Dec-1969" + "'", str38, "31-Dec-1969");
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(date48);
    org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 17:00:00 MST 1969");
    org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
    org.junit.Assert.assertNotNull(date53);
    org.junit.Assert.assertEquals(date53.toString(), "Wed Dec 31 17:00:00 MST 1969");
  }

  @Test
  public void test500() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CommonTests0.test500");
    net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
    dateTime1.set((int) (byte) 100, (-1), (int) '#');
    java.lang.String str6 = dateTime1.getMonth();
    int int7 = dateTime1.getMs();
    net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
    double double14 = dateTime11.getDeltaYears(dateTime13);
    java.text.SimpleDateFormat simpleDateFormat15 = dateTime11.getSdf();
    net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
    double double22 = dateTime19.getDeltaYears(dateTime21);
    boolean boolean23 = dateTime21.isWeekday();
    net.ajaskey.common.DateTime dateTime26 = dateTime21.parse("31-Dec-1969", "January");
    net.ajaskey.common.DateTime dateTime27 = net.ajaskey.common.DateTime.copy(dateTime21);
    boolean boolean28 = dateTime11.sameDate(dateTime27);
    net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
    net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
    double double35 = dateTime32.getDeltaYears(dateTime34);
    boolean boolean36 = dateTime27.isGreaterThan(dateTime32);
    int int37 = dateTime32.getDayOfWeek();
    boolean boolean38 = dateTime1.isGreaterThan(dateTime32);
    java.lang.String str40 = dateTime1.format(" 97.00");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
    org.junit.Assert.assertNull(simpleDateFormat15);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1972.041095890411d) + "'", double22 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    org.junit.Assert.assertNull(dateTime26);
    org.junit.Assert.assertNotNull(dateTime27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + " 97.00" + "'", str40, " 97.00");
  }
}
