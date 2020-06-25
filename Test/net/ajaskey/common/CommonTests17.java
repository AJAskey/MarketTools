package net.ajaskey.common;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommonTests17 {

    public static boolean debug = false;

    @Test
    public void test8501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8501");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("Thu 25-Jun-2020 10:44:20", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Thu 25-Jun-2020 10:44:20 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8502");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((-62190310610288L));
        java.text.SimpleDateFormat simpleDateFormat3 = null;
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat3);
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double7 = dateTime4.getDeltaYears(dateTime6);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean12 = dateTime6.isEqual(dateTime11);
        java.util.Calendar calendar13 = dateTime6.getCal();
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(calendar13);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(calendar13);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(calendar13);
        java.text.SimpleDateFormat simpleDateFormat19 = null;
        java.text.SimpleDateFormat simpleDateFormat20 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("January", simpleDateFormat19, simpleDateFormat20);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("100.00", simpleDateFormat19);
        java.text.SimpleDateFormat simpleDateFormat24 = null;
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double28 = dateTime25.getDeltaYears(dateTime27);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean33 = dateTime27.isEqual(dateTime32);
        long long34 = dateTime22.getDeltaDays(dateTime32);
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime(dateTime22);
        int int36 = dateTime16.getYears(dateTime35);
        boolean boolean37 = net.ajaskey.common.Utils.sameMonth(dateTime1, dateTime16);
        int int38 = dateTime16.getMs();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(calendar13);
        org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(simpleDateFormat20);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 50 + "'", int36 == 50);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test8503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8503");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime9.isWeekday();
        boolean boolean14 = dateTime3.sameDate(dateTime9);
        dateTime9.add(1969, 510);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
        double double24 = dateTime21.getDeltaYears(dateTime23);
        boolean boolean25 = dateTime23.isWeekday();
        java.util.Date date26 = dateTime23.getTime();
        int int27 = dateTime23.getDayOfWeek();
        java.util.Date date28 = dateTime23.getTime();
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(date28);
        java.util.Date date30 = dateTime29.getTime();
        dateTime9.set(date30);
        int int32 = dateTime9.getHour();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1972.041095890411d) + "'", double24 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
    }

    @Test
    public void test8504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8504");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        long long6 = dateTime3.getDeltaDays(dateTime5);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat13 = null;
        java.text.SimpleDateFormat simpleDateFormat14 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime("January", simpleDateFormat13, simpleDateFormat14);
        java.text.SimpleDateFormat simpleDateFormat18 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("January", simpleDateFormat18);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("", simpleDateFormat18);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("", simpleDateFormat14, simpleDateFormat18);
        dateTime10.setSdf(simpleDateFormat14);
        dateTime5.setSdf(simpleDateFormat14);
        net.ajaskey.common.DateTime dateTime24 = null;
        boolean boolean25 = net.ajaskey.common.Utils.sameDate(dateTime5, dateTime24);
        boolean boolean26 = dateTime5.isNull();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-719795L) + "'", long6 == (-719795L));
        org.junit.Assert.assertNotNull(simpleDateFormat14);
        org.junit.Assert.assertNotNull(simpleDateFormat18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test8505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8505");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                                                                                                                                                                                           100", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test8506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8506");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        long long6 = dateTime3.getDeltaDays(dateTime5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        int int9 = dateTime8.getMs();
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
        double double16 = dateTime13.getDeltaYears(dateTime15);
        java.text.SimpleDateFormat simpleDateFormat17 = dateTime13.getSdf();
        boolean boolean18 = dateTime8.isLessThanOrEqual(dateTime13);
        java.text.SimpleDateFormat simpleDateFormat20 = null;
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat20);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double24 = dateTime21.getDeltaYears(dateTime23);
        boolean boolean25 = dateTime21.isWeekday();
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long30 = dateTime21.getDeltaDays(dateTime29);
        long long31 = dateTime8.getDeltaDays(dateTime29);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
        dateTime33.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean38 = dateTime33.isWeekday();
        int int39 = dateTime8.getYears(dateTime33);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
        double double46 = dateTime43.getDeltaYears(dateTime45);
        int int47 = dateTime43.getHour();
        java.text.SimpleDateFormat simpleDateFormat49 = null;
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat49);
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double53 = dateTime50.getDeltaYears(dateTime52);
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean58 = dateTime52.isEqual(dateTime57);
        java.util.Calendar calendar59 = dateTime52.getCal();
        dateTime43.set(calendar59);
        dateTime8.set(calendar59);
        long long62 = dateTime5.getDeltaMilliSeconds(dateTime8);
        java.lang.String str63 = dateTime8.getDay();
        dateTime8.add(50, 881);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-719795L) + "'", long6 == (-719795L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1972.041095890411d) + "'", double16 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 719795L + "'", long31 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1870) + "'", int39 == (-1870));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(calendar59);
        org.junit.Assert.assertEquals(calendar59.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-100L) + "'", long62 == (-100L));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Wednesday" + "'", str63, "Wednesday");
    }

    @Test
    public void test8507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8507");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(0, 845, 57);
        java.text.SimpleDateFormat simpleDateFormat4 = dateTime3.getSdf();
        org.junit.Assert.assertNull(simpleDateFormat4);
    }

    @Test
    public void test8508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8508");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        boolean boolean2 = dateTime1.isWeekday();
        java.lang.String str3 = dateTime1.getMonth();
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        java.util.Calendar calendar6 = dateTime5.getCal();
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime9.isWeekday();
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long18 = dateTime9.getDeltaDays(dateTime17);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(dateTime9);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(100L);
        double double26 = dateTime23.getDeltaYears(dateTime25);
        boolean boolean27 = dateTime25.isWeekday();
        java.util.Date date28 = dateTime25.getTime();
        dateTime9.set(date28);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        int int32 = dateTime31.getMs();
        java.lang.String str33 = dateTime31.toString();
        boolean boolean34 = dateTime9.isLessThanOrEqual(dateTime31);
        net.ajaskey.common.DateTime dateTime37 = dateTime9.parse("", "100.00");
        dateTime9.add((int) (short) 0, (int) (short) -1);
        double double41 = dateTime5.getDeltaYears(dateTime9);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(100L);
        int int44 = dateTime43.getMs();
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(100L);
        double double51 = dateTime48.getDeltaYears(dateTime50);
        java.text.SimpleDateFormat simpleDateFormat52 = dateTime48.getSdf();
        boolean boolean53 = dateTime43.isLessThanOrEqual(dateTime48);
        int int54 = dateTime43.getDayOfMonth();
        boolean boolean55 = net.ajaskey.common.Utils.sameMonth(dateTime9, dateTime43);
        boolean boolean56 = net.ajaskey.common.Utils.sameDate(dateTime1, dateTime9);
        net.ajaskey.common.DateTime dateTime57 = null;
        boolean boolean58 = dateTime9.isLessThan(dateTime57);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "December" + "'", str3, "December");
        org.junit.Assert.assertNotNull(calendar6);
        org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1972.041095890411d) + "'", double26 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "31-Dec-1969" + "'", str33, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(dateTime37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1972.041095890411d) + "'", double51 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 31 + "'", int54 == 31);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test8509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8509");
        java.lang.String[] strArray6 = new java.lang.String[] { "     5.00" };
        java.util.List<java.io.File> fileList7 = net.ajaskey.common.Utils.getDirTree("                                                 100", strArray6);
        java.util.List<java.io.File> fileList8 = net.ajaskey.common.Utils.getDirTree("", strArray6);
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDirTree("                                                                                                                                                                                7", strArray6);
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDirTree("Thu 25-Jun-2020 10:45:55", strArray6);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("Tuesday", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(fileList7);
        org.junit.Assert.assertNull(fileList8);
        org.junit.Assert.assertNull(fileList9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
    }

    @Test
    public void test8510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8510");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (-1), 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      -1" + "'", str2, "                                                      -1");
    }

    @Test
    public void test8511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8511");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        java.lang.String str12 = dateTime1.toString();
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime("June", "        10");
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(100L);
        long long26 = dateTime23.getDeltaDays(dateTime25);
        int int27 = dateTime23.getHour();
        dateTime23.add((int) (byte) 100, (int) (byte) 0);
        double double31 = dateTime19.getDeltaYears(dateTime23);
        net.ajaskey.common.DateTime dateTime32 = dateTime15.copy(dateTime19);
        java.lang.String str33 = dateTime15.getMonth();
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(100L);
        long long44 = dateTime41.getDeltaDays(dateTime43);
        int int45 = dateTime41.getHour();
        dateTime41.add((int) (byte) 100, (int) (byte) 0);
        double double49 = dateTime37.getDeltaYears(dateTime41);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat55 = null;
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat55);
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double59 = dateTime56.getDeltaYears(dateTime58);
        boolean boolean60 = dateTime53.isLessThan(dateTime58);
        java.lang.String str61 = dateTime58.toFullString();
        int int62 = dateTime58.getSecond();
        java.text.SimpleDateFormat simpleDateFormat63 = dateTime58.getSdf();
        long long64 = dateTime41.getDeltaMilliSeconds(dateTime58);
        boolean boolean65 = dateTime58.isNull();
        boolean boolean66 = dateTime15.isGreaterThanOrEqual(dateTime58);
        boolean boolean67 = dateTime1.isGreaterThan(dateTime58);
        boolean boolean68 = dateTime58.isWeekday();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "31-Dec-1969" + "'", str12, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-719795L) + "'", long26 == (-719795L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UNKNOWN" + "'", str33, "UNKNOWN");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-719795L) + "'", long44 == (-719795L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str61, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(simpleDateFormat63);
// flaky:         org.junit.Assert.assertTrue("'" + long64 + "' != '" + 62190310333130L + "'", long64 == 62190310333130L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test8512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8512");
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
        java.util.Date date69 = dateTime63.getTime();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1972.041095890411d) + "'", double64 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Wed Dec 31 17:00:00 MST 1969");
    }

    @Test
    public void test8513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8513");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        java.lang.String str12 = dateTime1.toString();
        int int13 = dateTime1.getHour();
        boolean boolean14 = dateTime1.isWeekday();
        boolean boolean15 = dateTime1.isNull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "31-Dec-1969" + "'", str12, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8514");
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
        java.lang.String str18 = dateTime3.toString();
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
        int int21 = dateTime20.getMs();
        java.lang.String str22 = dateTime20.toString();
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(100L);
        int int25 = dateTime24.getMs();
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        double double32 = dateTime29.getDeltaYears(dateTime31);
        java.text.SimpleDateFormat simpleDateFormat33 = dateTime29.getSdf();
        boolean boolean34 = dateTime24.isLessThanOrEqual(dateTime29);
        boolean boolean35 = dateTime24.isWeekday();
        java.util.Calendar calendar36 = dateTime24.getCal();
        dateTime20.set(calendar36);
        int int38 = dateTime20.getMs();
        int int39 = dateTime20.getSecond();
        int int40 = dateTime20.getDayOfWeek();
        net.ajaskey.common.DateTime dateTime41 = dateTime3.copy(dateTime20);
        java.util.Date date42 = dateTime41.getTime();
        int int43 = dateTime41.getYear();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-Apr-0002" + "'", str18, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "31-Dec-1969" + "'", str22, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1972.041095890411d) + "'", double32 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(calendar36);
        org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1969 + "'", int43 == 1969);
    }

    @Test
    public void test8515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8515");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        int int7 = dateTime3.getHour();
        int int8 = dateTime3.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(100L);
        double double15 = dateTime12.getDeltaYears(dateTime14);
        boolean boolean16 = dateTime14.isWeekday();
        boolean boolean17 = net.ajaskey.common.Utils.sameDate(dateTime3, dateTime14);
        int int18 = dateTime3.getMinute();
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
        int int21 = dateTime20.getMs();
        java.lang.String str22 = dateTime20.toString();
        dateTime20.set(25, (-1), (int) (short) 10);
        boolean boolean27 = dateTime3.isEqual(dateTime20);
        java.util.Date date28 = null;
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(date28);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime(100L);
        double double36 = dateTime33.getDeltaYears(dateTime35);
        int int37 = dateTime33.getHour();
        java.text.SimpleDateFormat simpleDateFormat39 = null;
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat39);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double43 = dateTime40.getDeltaYears(dateTime42);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean48 = dateTime42.isEqual(dateTime47);
        java.util.Calendar calendar49 = dateTime42.getCal();
        dateTime33.set(calendar49);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(calendar49);
        net.ajaskey.common.DateTime dateTime52 = dateTime29.copy(dateTime51);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime(100L);
        double double59 = dateTime56.getDeltaYears(dateTime58);
        boolean boolean60 = dateTime58.isWeekday();
        int int61 = dateTime58.getDayOfYear();
        long long62 = dateTime52.getDeltaMilliSeconds(dateTime58);
        java.util.Calendar calendar63 = dateTime52.getCal();
        java.text.SimpleDateFormat simpleDateFormat64 = null;
        dateTime52.setSdf(simpleDateFormat64);
        net.ajaskey.common.DateTime dateTime66 = dateTime20.copy(dateTime52);
        java.text.SimpleDateFormat simpleDateFormat68 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat69 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime("", simpleDateFormat68, simpleDateFormat69);
        int int71 = dateTime70.getHour();
        net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime(dateTime70);
        net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime(621, 32, 14);
        boolean boolean77 = dateTime70.isGreaterThanOrEqual(dateTime76);
        java.text.SimpleDateFormat simpleDateFormat81 = null;
        java.text.SimpleDateFormat simpleDateFormat82 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime83 = new net.ajaskey.common.DateTime("January", simpleDateFormat81, simpleDateFormat82);
        java.text.SimpleDateFormat simpleDateFormat86 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime87 = new net.ajaskey.common.DateTime("January", simpleDateFormat86);
        net.ajaskey.common.DateTime dateTime88 = new net.ajaskey.common.DateTime("", simpleDateFormat86);
        net.ajaskey.common.DateTime dateTime89 = new net.ajaskey.common.DateTime("", simpleDateFormat82, simpleDateFormat86);
        net.ajaskey.common.DateTime dateTime90 = new net.ajaskey.common.DateTime("Wed 31-Dec-1969 17:00:00", simpleDateFormat86);
        boolean boolean91 = net.ajaskey.common.Utils.sameDate(dateTime76, dateTime90);
        boolean boolean92 = dateTime66.sameDate(dateTime90);
        dateTime66.set(30, 12, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1972.041095890411d) + "'", double15 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "31-Dec-1969" + "'", str22, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1972.041095890411d) + "'", double36 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(calendar49);
        org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1972.041095890411d) + "'", double59 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 365 + "'", int61 == 365);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 100L + "'", long62 == 100L);
        org.junit.Assert.assertNotNull(calendar63);
        org.junit.Assert.assertEquals(calendar63.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(simpleDateFormat68);
        org.junit.Assert.assertNotNull(simpleDateFormat69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(simpleDateFormat82);
        org.junit.Assert.assertNotNull(simpleDateFormat86);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test8516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8516");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        long long6 = dateTime3.getDeltaDays(dateTime5);
        int int7 = dateTime5.getSecond();
        int int8 = dateTime5.getYear();
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime(100L);
        int int11 = dateTime10.getMs();
        boolean boolean12 = dateTime10.isWeekday();
        java.util.Calendar calendar13 = dateTime10.getCal();
        int int14 = dateTime5.getYears(dateTime10);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("5.00", "     10");
        dateTime17.add((int) (short) 0, (int) 'a');
        int int21 = dateTime17.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
        int int24 = dateTime23.getMs();
        int int25 = dateTime23.getHour();
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat31 = null;
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat31);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double35 = dateTime32.getDeltaYears(dateTime34);
        boolean boolean36 = dateTime29.isLessThan(dateTime34);
        java.lang.String str37 = dateTime34.toFullString();
        dateTime34.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat42 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat44 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat45 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime("", simpleDateFormat44, simpleDateFormat45);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat42, simpleDateFormat45);
        boolean boolean48 = dateTime34.isGreaterThan(dateTime47);
        boolean boolean49 = dateTime23.isEqual(dateTime34);
        net.ajaskey.common.DateTime dateTime50 = null;
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(dateTime50);
        dateTime51.set(42, 10, 10);
        java.util.Date date56 = dateTime51.getTime();
        net.ajaskey.common.DateTime dateTime57 = dateTime23.copy(dateTime51);
        net.ajaskey.common.DateTime dateTime58 = dateTime17.copy(dateTime23);
        dateTime5.set(dateTime23);
        int int60 = dateTime23.getMs();
        dateTime23.setFirstWorkDay();
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime(100L);
        int int64 = dateTime63.getMs();
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime(100L);
        double double71 = dateTime68.getDeltaYears(dateTime70);
        java.text.SimpleDateFormat simpleDateFormat72 = dateTime68.getSdf();
        boolean boolean73 = dateTime63.isLessThanOrEqual(dateTime68);
        int int74 = dateTime63.getMinute();
        int int75 = dateTime63.getMinute();
        net.ajaskey.common.DateTime dateTime78 = dateTime63.parse("Fri 11-Jan-0032 10:43:03", "    -36,794");
        long long79 = dateTime23.getDeltaMilliSeconds(dateTime78);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-719795L) + "'", long6 == (-719795L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1969 + "'", int8 == 1969);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(calendar13);
        org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str37, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat42);
        org.junit.Assert.assertNotNull(simpleDateFormat44);
        org.junit.Assert.assertNotNull(simpleDateFormat45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Sat Nov 10 10:47:46 MST 42");
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1972.041095890411d) + "'", double71 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNull(dateTime78);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
    }

    @Test
    public void test8517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8517");
        java.text.SimpleDateFormat simpleDateFormat2 = null;
        java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime("January", simpleDateFormat2, simpleDateFormat3);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime("100.00", simpleDateFormat2);
        java.text.SimpleDateFormat simpleDateFormat7 = null;
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat7);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double11 = dateTime8.getDeltaYears(dateTime10);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean16 = dateTime10.isEqual(dateTime15);
        long long17 = dateTime5.getDeltaDays(dateTime15);
        java.lang.String str18 = dateTime15.toFullString();
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((long) (short) 0);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
        int int23 = dateTime22.getMs();
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(100L);
        double double30 = dateTime27.getDeltaYears(dateTime29);
        java.text.SimpleDateFormat simpleDateFormat31 = dateTime27.getSdf();
        boolean boolean32 = dateTime22.isLessThanOrEqual(dateTime27);
        java.text.SimpleDateFormat simpleDateFormat34 = null;
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat34);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double38 = dateTime35.getDeltaYears(dateTime37);
        boolean boolean39 = dateTime35.isWeekday();
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long44 = dateTime35.getDeltaDays(dateTime43);
        long long45 = dateTime22.getDeltaDays(dateTime43);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime(100L);
        dateTime47.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean52 = dateTime47.isWeekday();
        int int53 = dateTime22.getYears(dateTime47);
        int int54 = dateTime22.getYear();
        java.util.Calendar calendar55 = dateTime22.getCal();
        net.ajaskey.common.DateTime dateTime56 = dateTime20.copy(dateTime22);
        java.util.Calendar calendar57 = dateTime22.getCal();
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime((long) 53);
        long long60 = dateTime22.getDeltaDays(dateTime59);
        boolean boolean61 = dateTime59.isNull();
        dateTime15.set(dateTime59);
        dateTime15.add(42, 55);
        org.junit.Assert.assertNotNull(simpleDateFormat3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Thu 10-Apr-0002 10:47:47" + "'", str18, "Thu 10-Apr-0002 10:47:47");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1972.041095890411d) + "'", double30 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 719795L + "'", long45 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1870) + "'", int53 == (-1870));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1969 + "'", int54 == 1969);
        org.junit.Assert.assertNotNull(calendar55);
        org.junit.Assert.assertEquals(calendar55.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(calendar57);
        org.junit.Assert.assertEquals(calendar57.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test8518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8518");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        long long6 = dateTime3.getDeltaDays(dateTime5);
        int int7 = dateTime5.getSecond();
        int int8 = dateTime5.getYear();
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime(100L);
        int int11 = dateTime10.getMs();
        boolean boolean12 = dateTime10.isWeekday();
        java.util.Calendar calendar13 = dateTime10.getCal();
        int int14 = dateTime5.getYears(dateTime10);
        java.text.SimpleDateFormat simpleDateFormat19 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat21 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat22 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("", simpleDateFormat21, simpleDateFormat22);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat19, simpleDateFormat22);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("10-Apr-0002", simpleDateFormat22);
        java.text.SimpleDateFormat simpleDateFormat28 = null;
        java.text.SimpleDateFormat simpleDateFormat29 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("January", simpleDateFormat28, simpleDateFormat29);
        java.text.SimpleDateFormat simpleDateFormat33 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime("January", simpleDateFormat33);
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("", simpleDateFormat33);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("", simpleDateFormat29, simpleDateFormat33);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime("January                                                                                               52.00                                                                                               52.00                                                                                               52.00                                                                                               52.00hi!                                                                                               52.00", simpleDateFormat22, simpleDateFormat33);
        java.text.SimpleDateFormat simpleDateFormat39 = null;
        java.text.SimpleDateFormat simpleDateFormat40 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime("January", simpleDateFormat39, simpleDateFormat40);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime("December", simpleDateFormat33, simpleDateFormat40);
        dateTime5.setSdf(simpleDateFormat33);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-719795L) + "'", long6 == (-719795L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1969 + "'", int8 == 1969);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(calendar13);
        org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(simpleDateFormat19);
        org.junit.Assert.assertNotNull(simpleDateFormat21);
        org.junit.Assert.assertNotNull(simpleDateFormat22);
        org.junit.Assert.assertNotNull(simpleDateFormat29);
        org.junit.Assert.assertNotNull(simpleDateFormat33);
        org.junit.Assert.assertNotNull(simpleDateFormat40);
    }

    @Test
    public void test8519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8519");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("Thu 10-Apr-0002 10:45:14", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test8520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8520");
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
        boolean boolean16 = dateTime6.isWeekday();
        java.lang.String str17 = dateTime6.format();
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
        int int20 = dateTime19.getMs();
        boolean boolean21 = dateTime19.isWeekday();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((long) (short) 0);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(100L);
        int int26 = dateTime25.getMs();
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime(100L);
        double double33 = dateTime30.getDeltaYears(dateTime32);
        java.text.SimpleDateFormat simpleDateFormat34 = dateTime30.getSdf();
        boolean boolean35 = dateTime25.isLessThanOrEqual(dateTime30);
        java.text.SimpleDateFormat simpleDateFormat37 = null;
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat37);
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double41 = dateTime38.getDeltaYears(dateTime40);
        boolean boolean42 = dateTime38.isWeekday();
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long47 = dateTime38.getDeltaDays(dateTime46);
        long long48 = dateTime25.getDeltaDays(dateTime46);
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(100L);
        dateTime50.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean55 = dateTime50.isWeekday();
        int int56 = dateTime25.getYears(dateTime50);
        int int57 = dateTime25.getYear();
        java.util.Calendar calendar58 = dateTime25.getCal();
        net.ajaskey.common.DateTime dateTime59 = dateTime23.copy(dateTime25);
        boolean boolean60 = dateTime19.isGreaterThan(dateTime25);
        java.text.SimpleDateFormat simpleDateFormat62 = null;
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat62);
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double66 = dateTime63.getDeltaYears(dateTime65);
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean71 = dateTime65.isEqual(dateTime70);
        java.lang.String str72 = dateTime70.getMonth();
        net.ajaskey.common.DateTime dateTime73 = dateTime25.copy(dateTime70);
        boolean boolean74 = dateTime6.isEqual(dateTime73);
        net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime80 = new net.ajaskey.common.DateTime(100L);
        double double81 = dateTime78.getDeltaYears(dateTime80);
        boolean boolean82 = dateTime80.isWeekday();
        java.util.Date date83 = dateTime80.getTime();
        int int84 = dateTime80.getDayOfWeek();
        java.lang.String str85 = dateTime80.toFullString();
        boolean boolean86 = dateTime80.isWeekday();
        java.lang.String str88 = dateTime80.format("");
        long long89 = dateTime6.getDeltaMilliSeconds(dateTime80);
        java.lang.String str90 = dateTime80.toString();
        dateTime80.add(38, 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "BAD-DATE-FORMAT" + "'", str17, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1972.041095890411d) + "'", double33 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 719795L + "'", long48 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1870) + "'", int56 == (-1870));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1969 + "'", int57 == 1969);
        org.junit.Assert.assertNotNull(calendar58);
        org.junit.Assert.assertEquals(calendar58.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "April" + "'", str72, "April");
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1972.041095890411d) + "'", double81 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 4 + "'", int84 == 4);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str85, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
// flaky:         org.junit.Assert.assertTrue("'" + long89 + "' != '" + 62190310333033L + "'", long89 == 62190310333033L);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "31-Dec-1969" + "'", str90, "31-Dec-1969");
    }

    @Test
    public void test8521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8521");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("5.00", "     10");
        int int3 = dateTime2.getDayOfWeek();
        int int4 = dateTime2.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(11, (int) (short) 1, 365);
        boolean boolean9 = net.ajaskey.common.Utils.sameMonth(dateTime2, dateTime8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        int int12 = dateTime11.getMs();
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
        double double19 = dateTime16.getDeltaYears(dateTime18);
        java.text.SimpleDateFormat simpleDateFormat20 = dateTime16.getSdf();
        boolean boolean21 = dateTime11.isLessThanOrEqual(dateTime16);
        boolean boolean22 = dateTime11.isWeekday();
        java.util.Calendar calendar23 = dateTime11.getCal();
        java.text.SimpleDateFormat simpleDateFormat25 = null;
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat25);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double29 = dateTime26.getDeltaYears(dateTime28);
        boolean boolean30 = dateTime26.isWeekday();
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long35 = dateTime26.getDeltaDays(dateTime34);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime(dateTime26);
        dateTime36.setFirstWorkDay();
        long long38 = dateTime11.getDeltaDays(dateTime36);
        boolean boolean39 = net.ajaskey.common.Utils.sameDate(dateTime8, dateTime11);
        int int40 = dateTime11.getDayOfWeek();
        java.util.Date date41 = dateTime11.getTime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(calendar23);
        org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-18438L) + "'", long38 == (-18438L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Dec 31 17:00:00 MST 1969");
    }

    @Test
    public void test8522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8522");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        dateTime1.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime11.isWeekday();
        java.util.Date date14 = dateTime11.getTime();
        dateTime1.set(dateTime11);
        int int16 = dateTime1.getYear();
        int int17 = dateTime1.getSecond();
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
        int int20 = dateTime19.getMs();
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        double double27 = dateTime24.getDeltaYears(dateTime26);
        java.text.SimpleDateFormat simpleDateFormat28 = dateTime24.getSdf();
        boolean boolean29 = dateTime19.isLessThanOrEqual(dateTime24);
        java.lang.String str30 = dateTime24.toString();
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime(100L);
        int int33 = dateTime32.getMs();
        int int34 = dateTime32.getHour();
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat40 = null;
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat40);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double44 = dateTime41.getDeltaYears(dateTime43);
        boolean boolean45 = dateTime38.isLessThan(dateTime43);
        java.lang.String str46 = dateTime43.toFullString();
        dateTime43.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat51 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat53 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat54 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime("", simpleDateFormat53, simpleDateFormat54);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat51, simpleDateFormat54);
        boolean boolean57 = dateTime43.isGreaterThan(dateTime56);
        boolean boolean58 = dateTime32.isEqual(dateTime43);
        net.ajaskey.common.DateTime dateTime59 = null;
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime(dateTime59);
        dateTime60.set(42, 10, 10);
        java.util.Date date65 = dateTime60.getTime();
        net.ajaskey.common.DateTime dateTime66 = dateTime32.copy(dateTime60);
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime(100L);
        int int69 = dateTime68.getMs();
        int int70 = dateTime68.getHour();
        double double71 = dateTime60.getDeltaYears(dateTime68);
        boolean boolean72 = net.ajaskey.common.Utils.sameMonth(dateTime24, dateTime68);
        net.ajaskey.common.DateTime dateTime74 = new net.ajaskey.common.DateTime(100L);
        dateTime74.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str79 = dateTime74.getMonth();
        int int80 = dateTime74.getMs();
        java.lang.String str82 = dateTime74.format("                                                                                               52.00");
        int int83 = dateTime74.getDayOfMonth();
        long long84 = dateTime24.getDeltaDays(dateTime74);
        java.text.SimpleDateFormat simpleDateFormat85 = dateTime74.getSdf();
        java.util.Calendar calendar86 = dateTime74.getCal();
        dateTime1.set(calendar86);
        net.ajaskey.common.DateTime dateTime88 = new net.ajaskey.common.DateTime(calendar86);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1969 + "'", int16 == 1969);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1972.041095890411d) + "'", double27 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10-Apr-0002" + "'", str30, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str46, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat51);
        org.junit.Assert.assertNotNull(simpleDateFormat53);
        org.junit.Assert.assertNotNull(simpleDateFormat54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Sat Nov 10 10:47:47 MST 42");
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 5 + "'", int70 == 5);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1928.4246575342465d) + "'", double71 == (-1928.4246575342465d));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "January" + "'", str79, "January");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 100 + "'", int80 == 100);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "                                                                                               52.00" + "'", str82, "                                                                                               52.00");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 4 + "'", int83 == 4);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-36794L) + "'", long84 == (-36794L));
        org.junit.Assert.assertNull(simpleDateFormat85);
        org.junit.Assert.assertNotNull(calendar86);
        org.junit.Assert.assertEquals(calendar86.toString(), "java.util.GregorianCalendar[time=-59011286399900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void test8523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8523");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        dateTime1.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str6 = dateTime1.getMonth();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        dateTime8.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str13 = dateTime8.getMonth();
        int int14 = dateTime8.getMs();
        net.ajaskey.common.DateTime dateTime15 = dateTime1.copy(dateTime8);
        boolean boolean16 = dateTime1.isWeekday();
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
        double double23 = dateTime20.getDeltaYears(dateTime22);
        boolean boolean24 = dateTime22.isWeekday();
        boolean boolean25 = dateTime1.isGreaterThan(dateTime22);
        java.text.SimpleDateFormat simpleDateFormat29 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat30 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("", simpleDateFormat29, simpleDateFormat30);
        java.text.SimpleDateFormat simpleDateFormat33 = null;
        java.text.SimpleDateFormat simpleDateFormat34 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("January", simpleDateFormat33, simpleDateFormat34);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat29, simpleDateFormat34);
        java.text.SimpleDateFormat simpleDateFormat39 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat40 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime("", simpleDateFormat39, simpleDateFormat40);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(100L);
        int int44 = dateTime43.getMs();
        java.text.SimpleDateFormat simpleDateFormat45 = net.ajaskey.common.Utils.sdf;
        dateTime43.setSdf(simpleDateFormat45);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat40, simpleDateFormat45);
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime("                             100", simpleDateFormat34, simpleDateFormat40);
        dateTime22.setSdf(simpleDateFormat34);
        java.util.Calendar calendar50 = dateTime22.getCal();
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(calendar50);
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime(calendar50);
        int int53 = dateTime52.getDayOfMonth();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "January" + "'", str13, "January");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1972.041095890411d) + "'", double23 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(simpleDateFormat29);
        org.junit.Assert.assertNotNull(simpleDateFormat30);
        org.junit.Assert.assertNotNull(simpleDateFormat34);
        org.junit.Assert.assertNotNull(simpleDateFormat39);
        org.junit.Assert.assertNotNull(simpleDateFormat40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat45);
        org.junit.Assert.assertNotNull(calendar50);
        org.junit.Assert.assertEquals(calendar50.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 31 + "'", int53 == 31);
    }

    @Test
    public void test8524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8524");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                873", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 873 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8525");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
        long long10 = dateTime7.getDeltaDays(dateTime9);
        int int11 = dateTime7.getHour();
        dateTime7.add((int) (byte) 100, (int) (byte) 0);
        double double15 = dateTime3.getDeltaYears(dateTime7);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
        int int18 = dateTime17.getMs();
        java.lang.String str19 = dateTime17.toString();
        dateTime17.set(25, (-1), (int) (short) 10);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(100L);
        double double30 = dateTime27.getDeltaYears(dateTime29);
        boolean boolean31 = dateTime29.isWeekday();
        boolean boolean32 = net.ajaskey.common.Utils.sameMonth(dateTime17, dateTime29);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((long) (short) 0);
        int int35 = dateTime34.getHour();
        boolean boolean36 = dateTime34.isNull();
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(dateTime34);
        boolean boolean38 = dateTime29.isGreaterThan(dateTime34);
        boolean boolean39 = dateTime7.isGreaterThan(dateTime34);
        dateTime34.set(43, 28, 1866);
        int int44 = dateTime34.getSecond();
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat50 = null;
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat50);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double54 = dateTime51.getDeltaYears(dateTime53);
        boolean boolean55 = dateTime48.isLessThan(dateTime53);
        java.lang.String str56 = dateTime53.toFullString();
        int int57 = dateTime53.getSecond();
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime(dateTime53);
        java.text.SimpleDateFormat simpleDateFormat60 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat61 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime("", simpleDateFormat60, simpleDateFormat61);
        net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime(100L);
        double double69 = dateTime66.getDeltaYears(dateTime68);
        int int70 = dateTime66.getHour();
        java.text.SimpleDateFormat simpleDateFormat72 = null;
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat72);
        net.ajaskey.common.DateTime dateTime75 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double76 = dateTime73.getDeltaYears(dateTime75);
        net.ajaskey.common.DateTime dateTime80 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean81 = dateTime75.isEqual(dateTime80);
        java.util.Calendar calendar82 = dateTime75.getCal();
        dateTime66.set(calendar82);
        net.ajaskey.common.DateTime dateTime84 = new net.ajaskey.common.DateTime(calendar82);
        boolean boolean85 = dateTime62.isLessThan(dateTime84);
        double double86 = dateTime53.getDeltaYears(dateTime84);
        java.util.Date date87 = dateTime53.getTime();
        net.ajaskey.common.DateTime dateTime88 = dateTime34.copy(dateTime53);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-719795L) + "'", long10 == (-719795L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "31-Dec-1969" + "'", str19, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1972.041095890411d) + "'", double30 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str56, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(simpleDateFormat60);
        org.junit.Assert.assertNotNull(simpleDateFormat61);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1972.041095890411d) + "'", double69 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(calendar82);
        org.junit.Assert.assertEquals(calendar82.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertNotNull(dateTime88);
    }

    @Test
    public void test8526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8526");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("Thu 25-Jun-2020 10:44:14");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test8527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8527");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("13-Nov-0014", "Thu 10-Apr-0002 10:47:05");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'T'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8528");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("2,020.00", "             719,528.00");
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(25, 1, 0);
        boolean boolean9 = net.ajaskey.common.Utils.sameMonth(dateTime4, dateTime8);
        int int10 = dateTime4.getSecond();
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        int int13 = dateTime12.getMs();
        java.text.SimpleDateFormat simpleDateFormat14 = net.ajaskey.common.Utils.sdf;
        dateTime12.setSdf(simpleDateFormat14);
        net.ajaskey.common.DateTime dateTime16 = dateTime4.copy(dateTime12);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
        double double23 = dateTime20.getDeltaYears(dateTime22);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(100L);
        double double30 = dateTime27.getDeltaYears(dateTime29);
        int int31 = dateTime27.getHour();
        int int32 = dateTime27.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime(100L);
        double double39 = dateTime36.getDeltaYears(dateTime38);
        boolean boolean40 = dateTime38.isWeekday();
        boolean boolean41 = net.ajaskey.common.Utils.sameDate(dateTime27, dateTime38);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(100L);
        dateTime43.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime(100L);
        double double54 = dateTime51.getDeltaYears(dateTime53);
        boolean boolean55 = dateTime53.isWeekday();
        java.util.Date date56 = dateTime53.getTime();
        dateTime43.set(dateTime53);
        int int58 = dateTime43.getYear();
        boolean boolean59 = dateTime38.isGreaterThanOrEqual(dateTime43);
        boolean boolean60 = dateTime20.sameDate(dateTime38);
        net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime(100L);
        double double67 = dateTime64.getDeltaYears(dateTime66);
        int int68 = dateTime64.getHour();
        java.text.SimpleDateFormat simpleDateFormat70 = null;
        net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat70);
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double74 = dateTime71.getDeltaYears(dateTime73);
        net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean79 = dateTime73.isEqual(dateTime78);
        java.util.Calendar calendar80 = dateTime73.getCal();
        dateTime64.set(calendar80);
        dateTime20.set(calendar80);
        dateTime12.set(calendar80);
        net.ajaskey.common.DateTime dateTime84 = new net.ajaskey.common.DateTime(calendar80);
        dateTime2.set(calendar80);
        net.ajaskey.common.DateTime dateTime86 = new net.ajaskey.common.DateTime(calendar80);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1972.041095890411d) + "'", double23 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1972.041095890411d) + "'", double30 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1972.041095890411d) + "'", double39 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1972.041095890411d) + "'", double54 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1969 + "'", int58 == 1969);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1972.041095890411d) + "'", double67 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(calendar80);
        org.junit.Assert.assertEquals(calendar80.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void test8529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8529");
        net.ajaskey.common.Utils.makeDir("                                    62,190,310,613,374");
    }

    @Test
    public void test8530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8530");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(25, 1, 0);
        boolean boolean6 = net.ajaskey.common.Utils.sameMonth(dateTime1, dateTime5);
        int int7 = dateTime1.getSecond();
        java.lang.String str8 = dateTime1.getDay();
        java.util.Date date9 = dateTime1.getTime();
        int int10 = dateTime1.getDayOfWeek();
        java.lang.String str12 = dateTime1.format("11");
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(dateTime1);
        java.lang.String str14 = dateTime1.getMonth();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wednesday" + "'", str8, "Wednesday");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "11" + "'", str12, "11");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "December" + "'", str14, "December");
    }

    @Test
    public void test8531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8531");
        java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat5 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("", simpleDateFormat4, simpleDateFormat5);
        java.text.SimpleDateFormat simpleDateFormat12 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("", simpleDateFormat12, simpleDateFormat13);
        java.text.SimpleDateFormat simpleDateFormat16 = null;
        java.text.SimpleDateFormat simpleDateFormat17 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime("January", simpleDateFormat16, simpleDateFormat17);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat12, simpleDateFormat17);
        java.text.SimpleDateFormat simpleDateFormat22 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat23 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("", simpleDateFormat22, simpleDateFormat23);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        int int27 = dateTime26.getMs();
        java.text.SimpleDateFormat simpleDateFormat28 = net.ajaskey.common.Utils.sdf;
        dateTime26.setSdf(simpleDateFormat28);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat23, simpleDateFormat28);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("                             100", simpleDateFormat17, simpleDateFormat23);
        java.text.SimpleDateFormat simpleDateFormat34 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat35 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("", simpleDateFormat34, simpleDateFormat35);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:54", simpleDateFormat34);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime("5.00", simpleDateFormat17, simpleDateFormat34);
        java.text.SimpleDateFormat simpleDateFormat39 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat17, simpleDateFormat39);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime("Invalid Time", simpleDateFormat4, simpleDateFormat17);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime(100L);
        double double50 = dateTime47.getDeltaYears(dateTime49);
        int int51 = dateTime47.getHour();
        dateTime47.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat56 = null;
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat56);
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double60 = dateTime57.getDeltaYears(dateTime59);
        boolean boolean61 = dateTime47.isEqual(dateTime59);
        java.text.SimpleDateFormat simpleDateFormat63 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat65 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat66 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime("", simpleDateFormat65, simpleDateFormat66);
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat63, simpleDateFormat66);
        dateTime47.setSdf(simpleDateFormat63);
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat76 = null;
        java.text.SimpleDateFormat simpleDateFormat77 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime("January", simpleDateFormat76, simpleDateFormat77);
        java.text.SimpleDateFormat simpleDateFormat81 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime82 = new net.ajaskey.common.DateTime("January", simpleDateFormat81);
        net.ajaskey.common.DateTime dateTime83 = new net.ajaskey.common.DateTime("", simpleDateFormat81);
        net.ajaskey.common.DateTime dateTime84 = new net.ajaskey.common.DateTime("", simpleDateFormat77, simpleDateFormat81);
        dateTime73.setSdf(simpleDateFormat77);
        net.ajaskey.common.DateTime dateTime86 = new net.ajaskey.common.DateTime("December", simpleDateFormat63, simpleDateFormat77);
        net.ajaskey.common.DateTime dateTime88 = new net.ajaskey.common.DateTime(100L);
        int int89 = dateTime88.getMs();
        java.text.SimpleDateFormat simpleDateFormat90 = net.ajaskey.common.Utils.sdf;
        dateTime88.setSdf(simpleDateFormat90);
        int int92 = dateTime88.getDayOfWeek();
        java.text.SimpleDateFormat simpleDateFormat93 = dateTime88.getSdf();
        net.ajaskey.common.DateTime dateTime94 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:43:00", simpleDateFormat77, simpleDateFormat93);
        net.ajaskey.common.DateTime dateTime95 = new net.ajaskey.common.DateTime("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    716,029.00", simpleDateFormat4, simpleDateFormat93);
        net.ajaskey.common.DateTime dateTime96 = new net.ajaskey.common.DateTime("Fri 11-Jan-0032 10:45:05", simpleDateFormat4);
        org.junit.Assert.assertNotNull(simpleDateFormat4);
        org.junit.Assert.assertNotNull(simpleDateFormat5);
        org.junit.Assert.assertNotNull(simpleDateFormat12);
        org.junit.Assert.assertNotNull(simpleDateFormat13);
        org.junit.Assert.assertNotNull(simpleDateFormat17);
        org.junit.Assert.assertNotNull(simpleDateFormat22);
        org.junit.Assert.assertNotNull(simpleDateFormat23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat28);
        org.junit.Assert.assertNotNull(simpleDateFormat34);
        org.junit.Assert.assertNotNull(simpleDateFormat35);
        org.junit.Assert.assertNotNull(simpleDateFormat39);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1972.041095890411d) + "'", double50 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(simpleDateFormat63);
        org.junit.Assert.assertNotNull(simpleDateFormat65);
        org.junit.Assert.assertNotNull(simpleDateFormat66);
        org.junit.Assert.assertNotNull(simpleDateFormat77);
        org.junit.Assert.assertNotNull(simpleDateFormat81);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 100 + "'", int89 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat90);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 4 + "'", int92 == 4);
        org.junit.Assert.assertNotNull(simpleDateFormat93);
    }

    @Test
    public void test8532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8532");
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
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(11, (int) (short) 1, 365);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime(100L);
        double double50 = dateTime47.getDeltaYears(dateTime49);
        java.text.SimpleDateFormat simpleDateFormat52 = null;
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat52);
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double56 = dateTime53.getDeltaYears(dateTime55);
        boolean boolean57 = dateTime53.isWeekday();
        boolean boolean58 = dateTime47.sameDate(dateTime53);
        java.text.SimpleDateFormat simpleDateFormat60 = null;
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat60);
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double64 = dateTime61.getDeltaYears(dateTime63);
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean69 = dateTime63.isEqual(dateTime68);
        dateTime47.set(dateTime68);
        int int71 = dateTime47.getDayOfMonth();
        java.util.Date date72 = dateTime47.getTime();
        dateTime43.set(date72);
        boolean boolean74 = dateTime1.sameDate(dateTime43);
        net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime((long) (-2019));
        boolean boolean77 = dateTime1.isLessThan(dateTime76);
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
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1972.041095890411d) + "'", double50 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
        org.junit.Assert.assertNotNull(date72);
// flaky:         org.junit.Assert.assertEquals(date72.toString(), "Thu Apr 10 10:47:47 MST 2");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test8533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8533");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("Wed 31-Dec-1969 17:00:00", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test8534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8534");
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
        int int40 = dateTime3.getMs();
        java.util.Date date41 = dateTime3.getTime();
        net.ajaskey.common.DateTime dateTime44 = dateTime3.parse("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        1,927", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                873");
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
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 300 + "'", int40 == 300);
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Thu Apr 10 10:47:47 MST 2");
        org.junit.Assert.assertNull(dateTime44);
    }

    @Test
    public void test8535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8535");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((-1955), 803, 2);
    }

    @Test
    public void test8536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8536");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        dateTime2.set((int) ' ', 0, 11);
        boolean boolean7 = dateTime2.isWeekday();
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
        int int10 = dateTime9.getMs();
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        java.text.SimpleDateFormat simpleDateFormat18 = dateTime14.getSdf();
        boolean boolean19 = dateTime9.isLessThanOrEqual(dateTime14);
        java.util.Date date20 = dateTime14.getTime();
        dateTime2.set(date20);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(date20);
        java.util.Date date23 = dateTime22.getTime();
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(100L);
        int int26 = dateTime25.getMs();
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime(100L);
        double double33 = dateTime30.getDeltaYears(dateTime32);
        java.text.SimpleDateFormat simpleDateFormat34 = dateTime30.getSdf();
        boolean boolean35 = dateTime25.isLessThanOrEqual(dateTime30);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime(dateTime25);
        dateTime36.add(0, (int) (short) 10);
        int int40 = dateTime22.getYears(dateTime36);
        java.lang.String str41 = dateTime22.format();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1972.041095890411d) + "'", double17 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Thu Apr 10 10:47:47 MST 2");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Thu Apr 10 10:47:47 MST 2");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1972.041095890411d) + "'", double33 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1967 + "'", int40 == 1967);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "BAD-DATE-FORMAT" + "'", str41, "BAD-DATE-FORMAT");
    }

    @Test
    public void test8537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8537");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Wed 12-Apr-0139 10:47:16", "01-Jul-0015");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'J'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8538");
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
        int int22 = dateTime18.getHour();
        java.util.Calendar calendar23 = dateTime18.getCal();
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(calendar23);
        int int25 = dateTime24.getYear();
        boolean boolean26 = net.ajaskey.common.Utils.sameMonth(dateTime3, dateTime24);
        java.lang.String str27 = dateTime3.toString();
        int int28 = dateTime3.getDayOfWeek();
        java.lang.String str29 = dateTime3.toFullString();
        int int30 = dateTime3.getYear();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(calendar23);
// flaky:         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=-62190310332650,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=47,MILLISECOND=350,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-Apr-0002" + "'", str27, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Thu 10-Apr-0002 10:47:47" + "'", str29, "Thu 10-Apr-0002 10:47:47");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test8539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8539");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("2,020.00", "             719,528.00");
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime(100L);
        int int5 = dateTime4.getMs();
        boolean boolean6 = dateTime4.isNull();
        java.util.Calendar calendar7 = dateTime4.getCal();
        java.lang.String str8 = dateTime4.toString();
        java.text.SimpleDateFormat simpleDateFormat11 = null;
        java.text.SimpleDateFormat simpleDateFormat12 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("January", simpleDateFormat11, simpleDateFormat12);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("Thursday", simpleDateFormat11);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(dateTime14);
        boolean boolean16 = dateTime4.isEqual(dateTime15);
        long long17 = dateTime2.getDeltaMilliSeconds(dateTime4);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(3, 0, 10);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("5.00", "     10");
        java.text.SimpleDateFormat simpleDateFormat25 = dateTime24.getSdf();
        java.text.SimpleDateFormat simpleDateFormat27 = null;
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat27);
        dateTime28.set((int) ' ', 0, 11);
        boolean boolean33 = dateTime28.isWeekday();
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime(100L);
        int int36 = dateTime35.getMs();
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(100L);
        double double43 = dateTime40.getDeltaYears(dateTime42);
        java.text.SimpleDateFormat simpleDateFormat44 = dateTime40.getSdf();
        boolean boolean45 = dateTime35.isLessThanOrEqual(dateTime40);
        java.util.Date date46 = dateTime40.getTime();
        dateTime28.set(date46);
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime(date46);
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime(date46);
        dateTime24.set(date46);
        dateTime21.set(date46);
        boolean boolean52 = dateTime4.isLessThan(dateTime21);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31-Dec-1969" + "'", str8, "31-Dec-1969");
        org.junit.Assert.assertNotNull(simpleDateFormat12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(simpleDateFormat25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1972.041095890411d) + "'", double43 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Thu Apr 10 10:47:47 MST 2");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test8540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8540");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime9.isWeekday();
        boolean boolean14 = dateTime3.sameDate(dateTime9);
        net.ajaskey.common.DateTime dateTime16 = dateTime9.parse("August");
        java.text.SimpleDateFormat simpleDateFormat18 = null;
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat18);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double22 = dateTime19.getDeltaYears(dateTime21);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(dateTime19);
        java.lang.String str24 = dateTime23.toFullString();
        java.lang.String str25 = dateTime23.toString();
        java.lang.String str26 = dateTime23.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateTime16.isGreaterThan(dateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateTime16);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Thu 25-Jun-2020 10:47:47" + "'", str24, "Thu 25-Jun-2020 10:47:47");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "25-Jun-2020" + "'", str25, "25-Jun-2020");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "25-Jun-2020" + "'", str26, "25-Jun-2020");
    }

    @Test
    public void test8541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8541");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
        int int8 = dateTime3.getHour();
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime(100L);
        int int11 = dateTime10.getMs();
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
        double double18 = dateTime15.getDeltaYears(dateTime17);
        java.text.SimpleDateFormat simpleDateFormat19 = dateTime15.getSdf();
        boolean boolean20 = dateTime10.isLessThanOrEqual(dateTime15);
        java.text.SimpleDateFormat simpleDateFormat22 = null;
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat22);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double26 = dateTime23.getDeltaYears(dateTime25);
        boolean boolean27 = dateTime23.isWeekday();
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long32 = dateTime23.getDeltaDays(dateTime31);
        long long33 = dateTime10.getDeltaDays(dateTime31);
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime(100L);
        dateTime35.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean40 = dateTime35.isWeekday();
        int int41 = dateTime10.getYears(dateTime35);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime(100L);
        double double48 = dateTime45.getDeltaYears(dateTime47);
        int int49 = dateTime45.getHour();
        java.text.SimpleDateFormat simpleDateFormat51 = null;
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat51);
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double55 = dateTime52.getDeltaYears(dateTime54);
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean60 = dateTime54.isEqual(dateTime59);
        java.util.Calendar calendar61 = dateTime54.getCal();
        dateTime45.set(calendar61);
        dateTime10.set(calendar61);
        int int64 = dateTime10.getHour();
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime(dateTime10);
        long long66 = dateTime3.getDeltaDays(dateTime65);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1972.041095890411d) + "'", double18 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 719795L + "'", long33 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1870) + "'", int41 == (-1870));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1972.041095890411d) + "'", double48 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(calendar61);
        org.junit.Assert.assertEquals(calendar61.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 5 + "'", int64 == 5);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-719795L) + "'", long66 == (-719795L));
    }

    @Test
    public void test8542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8542");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8543");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat5 = null;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        boolean boolean10 = dateTime3.isLessThan(dateTime8);
        java.lang.String str11 = dateTime8.toFullString();
        dateTime8.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat16 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat18 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat19 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("", simpleDateFormat18, simpleDateFormat19);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat16, simpleDateFormat19);
        boolean boolean22 = dateTime8.isGreaterThan(dateTime21);
        java.text.SimpleDateFormat simpleDateFormat24 = null;
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double28 = dateTime25.getDeltaYears(dateTime27);
        boolean boolean29 = dateTime25.isWeekday();
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long34 = dateTime25.getDeltaDays(dateTime33);
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime(dateTime25);
        boolean boolean36 = dateTime21.sameDate(dateTime25);
        net.ajaskey.common.DateTime dateTime37 = null;
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime(dateTime37);
        int int39 = dateTime38.getYear();
        dateTime25.set(dateTime38);
        dateTime38.add(345, 13);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(dateTime38);
        boolean boolean45 = dateTime44.isNull();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str11, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat16);
        org.junit.Assert.assertNotNull(simpleDateFormat18);
        org.junit.Assert.assertNotNull(simpleDateFormat19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2020 + "'", int39 == 2020);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test8544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8544");
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
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime(100L);
        double double39 = dateTime36.getDeltaYears(dateTime38);
        int int40 = dateTime36.getHour();
        java.text.SimpleDateFormat simpleDateFormat42 = null;
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat42);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double46 = dateTime43.getDeltaYears(dateTime45);
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean51 = dateTime45.isEqual(dateTime50);
        java.util.Calendar calendar52 = dateTime45.getCal();
        dateTime36.set(calendar52);
        dateTime1.set(calendar52);
        dateTime1.set(0, (int) (short) 0, 2);
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime(dateTime1);
        java.text.SimpleDateFormat simpleDateFormat60 = dateTime59.getSdf();
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
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1972.041095890411d) + "'", double39 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(calendar52);
        org.junit.Assert.assertEquals(calendar52.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(simpleDateFormat60);
    }

    @Test
    public void test8545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8545");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("25-Jun-2020", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              -1,593,103,388,831.00");
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime(1L);
        net.ajaskey.common.DateTime dateTime5 = dateTime2.copy(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        int int13 = dateTime9.getHour();
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        int int21 = dateTime17.getHour();
        dateTime17.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat26 = null;
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat26);
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double30 = dateTime27.getDeltaYears(dateTime29);
        boolean boolean31 = dateTime17.isEqual(dateTime29);
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat37 = null;
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat37);
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double41 = dateTime38.getDeltaYears(dateTime40);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean46 = dateTime40.isEqual(dateTime45);
        java.util.Calendar calendar47 = dateTime40.getCal();
        boolean boolean48 = dateTime35.isLessThan(dateTime40);
        dateTime35.setFirstWorkDay();
        boolean boolean50 = dateTime17.sameDate(dateTime35);
        dateTime9.set(dateTime17);
        java.text.SimpleDateFormat simpleDateFormat53 = null;
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat53);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double57 = dateTime54.getDeltaYears(dateTime56);
        boolean boolean58 = dateTime54.isWeekday();
        net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long63 = dateTime54.getDeltaDays(dateTime62);
        boolean boolean64 = dateTime17.isLessThanOrEqual(dateTime54);
        int int65 = dateTime17.getYear();
        net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime(100L);
        double double72 = dateTime69.getDeltaYears(dateTime71);
        int int73 = dateTime69.getHour();
        dateTime69.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat78 = null;
        net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat78);
        net.ajaskey.common.DateTime dateTime81 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double82 = dateTime79.getDeltaYears(dateTime81);
        boolean boolean83 = dateTime69.isEqual(dateTime81);
        int int84 = dateTime69.getMinute();
        dateTime69.setFirstWorkDay();
        long long86 = dateTime17.getDeltaDays(dateTime69);
        dateTime5.set(dateTime69);
        java.util.Calendar calendar88 = dateTime5.getCal();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1972.041095890411d) + "'", double20 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(calendar47);
        org.junit.Assert.assertEquals(calendar47.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1972.041095890411d) + "'", double72 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int84 + "' != '" + 47 + "'", int84 == 47);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertNotNull(calendar88);
// flaky:         org.junit.Assert.assertEquals(calendar88.toString(), "java.util.GregorianCalendar[time=-62190310332538,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=47,MILLISECOND=462,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void test8546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8546");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        java.text.SimpleDateFormat simpleDateFormat5 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("", simpleDateFormat5, simpleDateFormat6);
        java.text.SimpleDateFormat simpleDateFormat10 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat11 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("", simpleDateFormat10, simpleDateFormat11);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(100L);
        int int15 = dateTime14.getMs();
        java.text.SimpleDateFormat simpleDateFormat16 = net.ajaskey.common.Utils.sdf;
        dateTime14.setSdf(simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat11, simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("     0", simpleDateFormat6, simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat26 = null;
        java.text.SimpleDateFormat simpleDateFormat27 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime("January", simpleDateFormat26, simpleDateFormat27);
        java.text.SimpleDateFormat simpleDateFormat31 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("January", simpleDateFormat31);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime("", simpleDateFormat31);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime("", simpleDateFormat27, simpleDateFormat31);
        dateTime23.setSdf(simpleDateFormat27);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:43:10", simpleDateFormat16, simpleDateFormat27);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime("       0", simpleDateFormat1, simpleDateFormat27);
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((long) 262);
        boolean boolean40 = net.ajaskey.common.Utils.sameDate(dateTime37, dateTime39);
        org.junit.Assert.assertNotNull(simpleDateFormat5);
        org.junit.Assert.assertNotNull(simpleDateFormat6);
        org.junit.Assert.assertNotNull(simpleDateFormat10);
        org.junit.Assert.assertNotNull(simpleDateFormat11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat16);
        org.junit.Assert.assertNotNull(simpleDateFormat27);
        org.junit.Assert.assertNotNull(simpleDateFormat31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test8547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8547");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(2, 32, 39);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        int int6 = dateTime5.getMs();
        boolean boolean7 = dateTime5.isWeekday();
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((long) (short) 0);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        int int12 = dateTime11.getMs();
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
        double double19 = dateTime16.getDeltaYears(dateTime18);
        java.text.SimpleDateFormat simpleDateFormat20 = dateTime16.getSdf();
        boolean boolean21 = dateTime11.isLessThanOrEqual(dateTime16);
        java.text.SimpleDateFormat simpleDateFormat23 = null;
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat23);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double27 = dateTime24.getDeltaYears(dateTime26);
        boolean boolean28 = dateTime24.isWeekday();
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long33 = dateTime24.getDeltaDays(dateTime32);
        long long34 = dateTime11.getDeltaDays(dateTime32);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime(100L);
        dateTime36.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean41 = dateTime36.isWeekday();
        int int42 = dateTime11.getYears(dateTime36);
        int int43 = dateTime11.getYear();
        java.util.Calendar calendar44 = dateTime11.getCal();
        net.ajaskey.common.DateTime dateTime45 = dateTime9.copy(dateTime11);
        boolean boolean46 = dateTime5.isGreaterThan(dateTime11);
        java.text.SimpleDateFormat simpleDateFormat48 = null;
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat48);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double52 = dateTime49.getDeltaYears(dateTime51);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean57 = dateTime51.isEqual(dateTime56);
        java.lang.String str58 = dateTime56.getMonth();
        net.ajaskey.common.DateTime dateTime59 = dateTime11.copy(dateTime56);
        java.util.Date date60 = dateTime11.getTime();
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime(date60);
        dateTime3.set(date60);
        java.lang.String str63 = dateTime3.format();
        dateTime3.setFirstWorkDay();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 719795L + "'", long34 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1870) + "'", int42 == (-1870));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1969 + "'", int43 == 1969);
        org.junit.Assert.assertNotNull(calendar44);
        org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "April" + "'", str58, "April");
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "BAD-DATE-FORMAT" + "'", str63, "BAD-DATE-FORMAT");
    }

    @Test
    public void test8548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8548");
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
        int int27 = dateTime24.getDayOfWeek();
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime();
        net.ajaskey.common.DateTime dateTime29 = null;
        boolean boolean30 = dateTime28.isGreaterThan(dateTime29);
        java.text.SimpleDateFormat simpleDateFormat32 = null;
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat32);
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double36 = dateTime33.getDeltaYears(dateTime35);
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean41 = dateTime35.isEqual(dateTime40);
        java.util.Calendar calendar42 = dateTime35.getCal();
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(calendar42);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(calendar42);
        boolean boolean45 = dateTime28.isLessThan(dateTime44);
        long long46 = dateTime24.getDeltaDays(dateTime28);
        java.util.Date date47 = dateTime24.getTime();
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime(date47);
        dateTime48.setFirstWorkDay();
        dateTime48.setFirstWorkDay();
        java.util.Calendar calendar51 = dateTime48.getCal();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(calendar42);
        org.junit.Assert.assertEquals(calendar42.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-738233L) + "'", long46 == (-738233L));
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Thu Apr 10 10:47:47 MST 2");
        org.junit.Assert.assertNotNull(calendar51);
// flaky:         org.junit.Assert.assertEquals(calendar51.toString(), "java.util.GregorianCalendar[time=-62190310332484,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=47,MILLISECOND=516,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void test8549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8549");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("-733,554", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test8550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8550");
        net.ajaskey.common.Utils.NL = "                                                                     62,190,310,443,652";
    }

    @Test
    public void test8551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8551");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("               313", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test8552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8552");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(264, 477, 34);
        int int4 = dateTime3.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test8553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8553");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        int int12 = dateTime6.getDayOfYear();
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((long) (-1969));
        boolean boolean15 = dateTime6.isEqual(dateTime14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8554");
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
        java.util.Date date24 = null;
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(date24);
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        double double32 = dateTime29.getDeltaYears(dateTime31);
        int int33 = dateTime29.getHour();
        java.text.SimpleDateFormat simpleDateFormat35 = null;
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat35);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double39 = dateTime36.getDeltaYears(dateTime38);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean44 = dateTime38.isEqual(dateTime43);
        java.util.Calendar calendar45 = dateTime38.getCal();
        dateTime29.set(calendar45);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime(calendar45);
        net.ajaskey.common.DateTime dateTime48 = dateTime25.copy(dateTime47);
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime(100L);
        double double55 = dateTime52.getDeltaYears(dateTime54);
        boolean boolean56 = dateTime54.isWeekday();
        int int57 = dateTime54.getDayOfYear();
        long long58 = dateTime48.getDeltaMilliSeconds(dateTime54);
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime(100L);
        int int61 = dateTime60.getMs();
        java.lang.String str62 = dateTime60.toString();
        java.lang.String str64 = dateTime60.format("         1");
        long long65 = dateTime48.getDeltaDays(dateTime60);
        boolean boolean66 = net.ajaskey.common.Utils.sameMonth(dateTime3, dateTime60);
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime(100L);
        double double73 = dateTime70.getDeltaYears(dateTime72);
        java.text.SimpleDateFormat simpleDateFormat75 = null;
        net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat75);
        net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double79 = dateTime76.getDeltaYears(dateTime78);
        boolean boolean80 = dateTime76.isWeekday();
        boolean boolean81 = dateTime70.sameDate(dateTime76);
        java.text.SimpleDateFormat simpleDateFormat83 = null;
        net.ajaskey.common.DateTime dateTime84 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat83);
        net.ajaskey.common.DateTime dateTime86 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double87 = dateTime84.getDeltaYears(dateTime86);
        net.ajaskey.common.DateTime dateTime91 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean92 = dateTime86.isEqual(dateTime91);
        dateTime70.set(dateTime91);
        net.ajaskey.common.DateTime dateTime94 = dateTime60.copy(dateTime91);
        net.ajaskey.common.DateTime dateTime97 = dateTime91.parse("Thu 10-Apr-0002 10:45:39", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     140");
        // The following exception was thrown during execution in test generation
        try {
            int int98 = dateTime97.getSecond();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "January" + "'", str10, "January");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "January" + "'", str17, "January");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNull(dateTime23);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1972.041095890411d) + "'", double32 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(calendar45);
        org.junit.Assert.assertEquals(calendar45.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1972.041095890411d) + "'", double55 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 365 + "'", int57 == 365);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 100L + "'", long58 == 100L);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "31-Dec-1969" + "'", str62, "31-Dec-1969");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "         1" + "'", str64, "         1");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1972.041095890411d) + "'", double73 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertNull(dateTime97);
    }

    @Test
    public void test8555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8555");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                                                                                                                                                                                                                                  -59,011,286,399,903.00", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test8556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8556");
        java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat5 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("", simpleDateFormat4, simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat2, simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime("10-Apr-0002", simpleDateFormat5);
        java.text.SimpleDateFormat simpleDateFormat10 = null;
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat10);
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double14 = dateTime11.getDeltaYears(dateTime13);
        boolean boolean15 = dateTime11.isWeekday();
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long20 = dateTime11.getDeltaDays(dateTime19);
        boolean boolean21 = net.ajaskey.common.Utils.sameDate(dateTime8, dateTime11);
        java.text.SimpleDateFormat simpleDateFormat24 = null;
        java.text.SimpleDateFormat simpleDateFormat25 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime("January", simpleDateFormat24, simpleDateFormat25);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime("100.00", simpleDateFormat24);
        java.text.SimpleDateFormat simpleDateFormat29 = null;
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat29);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double33 = dateTime30.getDeltaYears(dateTime32);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean38 = dateTime32.isEqual(dateTime37);
        long long39 = dateTime27.getDeltaDays(dateTime37);
        boolean boolean40 = dateTime11.isEqual(dateTime37);
        java.text.SimpleDateFormat simpleDateFormat42 = null;
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat42);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double46 = dateTime43.getDeltaYears(dateTime45);
        boolean boolean47 = dateTime45.isNull();
        boolean boolean48 = net.ajaskey.common.Utils.sameMonth(dateTime37, dateTime45);
        net.ajaskey.common.DateTime dateTime51 = dateTime45.parse("             1", "             1");
        java.lang.String str52 = dateTime51.toString();
        org.junit.Assert.assertNotNull(simpleDateFormat2);
        org.junit.Assert.assertNotNull(simpleDateFormat4);
        org.junit.Assert.assertNotNull(simpleDateFormat5);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(simpleDateFormat25);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "01-Jan-1970" + "'", str52, "01-Jan-1970");
    }

    @Test
    public void test8557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8557");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        long long6 = dateTime3.getDeltaDays(dateTime5);
        int int7 = dateTime3.getHour();
        dateTime3.add((int) (byte) 100, (int) (byte) 0);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        int int13 = dateTime12.getMs();
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        java.text.SimpleDateFormat simpleDateFormat21 = dateTime17.getSdf();
        boolean boolean22 = dateTime12.isLessThanOrEqual(dateTime17);
        java.text.SimpleDateFormat simpleDateFormat24 = null;
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat24);
        boolean boolean26 = dateTime17.isLessThanOrEqual(dateTime25);
        boolean boolean27 = dateTime3.sameDate(dateTime17);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean32 = dateTime31.isNull();
        java.lang.String str33 = dateTime31.getDay();
        java.text.SimpleDateFormat simpleDateFormat34 = dateTime31.getSdf();
        int int35 = dateTime31.getHour();
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
        dateTime37.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime(100L);
        double double48 = dateTime45.getDeltaYears(dateTime47);
        boolean boolean49 = dateTime47.isWeekday();
        java.util.Date date50 = dateTime47.getTime();
        dateTime37.set(dateTime47);
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat57 = null;
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat57);
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double61 = dateTime58.getDeltaYears(dateTime60);
        boolean boolean62 = dateTime55.isLessThan(dateTime60);
        dateTime47.set(dateTime60);
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime(100L);
        double double70 = dateTime67.getDeltaYears(dateTime69);
        long long71 = dateTime47.getDeltaMilliSeconds(dateTime69);
        int int72 = dateTime31.getYears(dateTime47);
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime(dateTime47);
        boolean boolean74 = net.ajaskey.common.Utils.sameMonth(dateTime3, dateTime47);
        int int75 = dateTime3.getHour();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-719795L) + "'", long6 == (-719795L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1972.041095890411d) + "'", double20 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Thursday" + "'", str33, "Thursday");
        org.junit.Assert.assertNull(simpleDateFormat34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1972.041095890411d) + "'", double48 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1972.041095890411d) + "'", double70 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 100L + "'", long71 == 100L);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1967 + "'", int72 == 1967);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
    }

    @Test
    public void test8558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8558");
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
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
        int int18 = dateTime17.getMs();
        boolean boolean19 = dateTime17.isNull();
        java.util.Calendar calendar20 = dateTime17.getCal();
        dateTime4.set(calendar20);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(calendar20);
        dateTime22.setFirstWorkDay();
        int int24 = dateTime22.getDayOfYear();
        int int25 = dateTime22.getMinute();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "BAD-DATE-FORMAT" + "'", str12, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 365 + "'", int24 == 365);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test8559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8559");
        java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat7 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime("", simpleDateFormat6, simpleDateFormat7);
        java.text.SimpleDateFormat simpleDateFormat10 = null;
        java.text.SimpleDateFormat simpleDateFormat11 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("January", simpleDateFormat10, simpleDateFormat11);
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat6, simpleDateFormat11);
        java.text.SimpleDateFormat simpleDateFormat16 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat17 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime("", simpleDateFormat16, simpleDateFormat17);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
        int int21 = dateTime20.getMs();
        java.text.SimpleDateFormat simpleDateFormat22 = net.ajaskey.common.Utils.sdf;
        dateTime20.setSdf(simpleDateFormat22);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat17, simpleDateFormat22);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("                             100", simpleDateFormat11, simpleDateFormat17);
        java.text.SimpleDateFormat simpleDateFormat28 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat29 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("", simpleDateFormat28, simpleDateFormat29);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:54", simpleDateFormat28);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("5.00", simpleDateFormat11, simpleDateFormat28);
        java.text.SimpleDateFormat simpleDateFormat33 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat11, simpleDateFormat33);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime(100L);
        int int37 = dateTime36.getMs();
        boolean boolean38 = dateTime36.isWeekday();
        int int39 = dateTime36.getHour();
        java.text.SimpleDateFormat simpleDateFormat41 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime("January", simpleDateFormat41);
        dateTime36.setSdf(simpleDateFormat41);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime("        1", simpleDateFormat11, simpleDateFormat41);
        java.util.Date date45 = dateTime44.getTime();
        java.text.SimpleDateFormat simpleDateFormat49 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime("January", simpleDateFormat49);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime("", simpleDateFormat49);
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime("", simpleDateFormat49);
        dateTime44.setSdf(simpleDateFormat49);
        org.junit.Assert.assertNotNull(simpleDateFormat6);
        org.junit.Assert.assertNotNull(simpleDateFormat7);
        org.junit.Assert.assertNotNull(simpleDateFormat11);
        org.junit.Assert.assertNotNull(simpleDateFormat16);
        org.junit.Assert.assertNotNull(simpleDateFormat17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat22);
        org.junit.Assert.assertNotNull(simpleDateFormat28);
        org.junit.Assert.assertNotNull(simpleDateFormat29);
        org.junit.Assert.assertNotNull(simpleDateFormat33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertNotNull(simpleDateFormat41);
        org.junit.Assert.assertNull(date45);
        org.junit.Assert.assertNotNull(simpleDateFormat49);
    }

    @Test
    public void test8560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8560");
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
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((-1870), (int) (short) 10, 16);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean33 = dateTime32.isNull();
        java.lang.String str34 = dateTime32.getDay();
        java.lang.String str35 = dateTime32.getMonth();
        java.lang.String str36 = dateTime32.getDay();
        java.lang.String str37 = dateTime32.toFullString();
        java.util.Calendar calendar38 = dateTime32.getCal();
        dateTime28.set(calendar38);
        dateTime24.set(calendar38);
        boolean boolean41 = dateTime24.isWeekday();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1972.041095890411d) + "'", double8 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Thursday" + "'", str34, "Thursday");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "April" + "'", str35, "April");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Thursday" + "'", str36, "Thursday");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Thu 10-Apr-0002 10:47:47" + "'", str37, "Thu 10-Apr-0002 10:47:47");
        org.junit.Assert.assertNotNull(calendar38);
// flaky:         org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=-62190310332292,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=47,MILLISECOND=708,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test8561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8561");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("5.00", "     10");
        dateTime2.add((int) (short) 0, (int) 'a');
        int int6 = dateTime2.getDayOfMonth();
        java.lang.String str7 = dateTime2.toString();
        boolean boolean8 = dateTime2.isWeekday();
        java.util.Calendar calendar9 = dateTime2.getCal();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(calendar9);
    }

    @Test
    public void test8562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8562");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:54", "                       25");
        java.text.SimpleDateFormat simpleDateFormat4 = null;
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat4);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double8 = dateTime5.getDeltaYears(dateTime7);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean13 = dateTime7.isEqual(dateTime12);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
        int int16 = dateTime15.getMs();
        boolean boolean17 = dateTime12.isGreaterThanOrEqual(dateTime15);
        double double18 = dateTime2.getDeltaYears(dateTime12);
        int int19 = dateTime12.getMs();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat25 = null;
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat25);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double29 = dateTime26.getDeltaYears(dateTime28);
        boolean boolean30 = dateTime23.isLessThan(dateTime28);
        int int31 = dateTime28.getYear();
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime(dateTime28);
        dateTime32.set((int) (short) 10, (int) (byte) 100, 5);
        int int37 = dateTime32.getSecond();
        dateTime12.set(dateTime32);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 739 + "'", int19 == 739);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1969 + "'", int31 == 1969);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test8563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8563");
        java.text.SimpleDateFormat simpleDateFormat5 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("", simpleDateFormat5, simpleDateFormat6);
        java.text.SimpleDateFormat simpleDateFormat9 = null;
        java.text.SimpleDateFormat simpleDateFormat10 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime("January", simpleDateFormat9, simpleDateFormat10);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat5, simpleDateFormat10);
        java.text.SimpleDateFormat simpleDateFormat15 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat16 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("", simpleDateFormat15, simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime(100L);
        int int20 = dateTime19.getMs();
        java.text.SimpleDateFormat simpleDateFormat21 = net.ajaskey.common.Utils.sdf;
        dateTime19.setSdf(simpleDateFormat21);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat16, simpleDateFormat21);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("                             100", simpleDateFormat10, simpleDateFormat16);
        java.text.SimpleDateFormat simpleDateFormat27 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat28 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("", simpleDateFormat27, simpleDateFormat28);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:54", simpleDateFormat27);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("5.00", simpleDateFormat10, simpleDateFormat27);
        java.text.SimpleDateFormat simpleDateFormat32 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat10, simpleDateFormat32);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("10-Apr-0002", "    0");
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(100L);
        dateTime42.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str47 = dateTime42.getMonth();
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime(100L);
        dateTime49.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str54 = dateTime49.getMonth();
        int int55 = dateTime49.getMs();
        net.ajaskey.common.DateTime dateTime56 = dateTime42.copy(dateTime49);
        dateTime40.set(dateTime42);
        dateTime40.setFirstWorkDay();
        boolean boolean59 = net.ajaskey.common.Utils.sameMonth(dateTime36, dateTime40);
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime(100L);
        dateTime61.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str66 = dateTime61.getMonth();
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime(100L);
        dateTime68.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str73 = dateTime68.getMonth();
        int int74 = dateTime68.getMs();
        net.ajaskey.common.DateTime dateTime75 = dateTime61.copy(dateTime68);
        boolean boolean76 = dateTime61.isWeekday();
        java.lang.String str77 = dateTime61.format();
        net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime(100L);
        int int80 = dateTime79.getMs();
        net.ajaskey.common.DateTime dateTime84 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime86 = new net.ajaskey.common.DateTime(100L);
        double double87 = dateTime84.getDeltaYears(dateTime86);
        java.text.SimpleDateFormat simpleDateFormat88 = dateTime84.getSdf();
        boolean boolean89 = dateTime79.isLessThanOrEqual(dateTime84);
        int int90 = dateTime84.getDayOfYear();
        boolean boolean91 = dateTime84.isWeekday();
        boolean boolean92 = dateTime61.isLessThan(dateTime84);
        boolean boolean93 = net.ajaskey.common.Utils.sameMonth(dateTime36, dateTime84);
        int int94 = dateTime33.getYears(dateTime84);
        java.text.SimpleDateFormat simpleDateFormat95 = dateTime84.getSdf();
        int int96 = dateTime84.getYear();
        org.junit.Assert.assertNotNull(simpleDateFormat5);
        org.junit.Assert.assertNotNull(simpleDateFormat6);
        org.junit.Assert.assertNotNull(simpleDateFormat10);
        org.junit.Assert.assertNotNull(simpleDateFormat15);
        org.junit.Assert.assertNotNull(simpleDateFormat16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat21);
        org.junit.Assert.assertNotNull(simpleDateFormat27);
        org.junit.Assert.assertNotNull(simpleDateFormat28);
        org.junit.Assert.assertNotNull(simpleDateFormat32);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "January" + "'", str47, "January");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "January" + "'", str54, "January");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "January" + "'", str66, "January");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "January" + "'", str73, "January");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "BAD-DATE-FORMAT" + "'", str77, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 100 + "'", int80 == 100);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1972.041095890411d) + "'", double87 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 100 + "'", int90 == 100);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNull(simpleDateFormat95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 2 + "'", int96 == 2);
    }

    @Test
    public void test8564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8564");
        net.ajaskey.common.Utils.makeDir("62,190,310,608,217");
    }

    @Test
    public void test8565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8565");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             62,190,310,586,261", "                      -733,554.00");
        java.lang.String str3 = dateTime2.getMonth();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN" + "'", str3, "UNKNOWN");
    }

    @Test
    public void test8566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8566");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 78, 487);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     78" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     78");
    }

    @Test
    public void test8567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8567");
        net.ajaskey.common.TextUtils.printline("Wed 25-Sep-3940 00:16:48");
    }

    @Test
    public void test8568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8568");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Wed 12-Apr-0139 10:47:40", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test8569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8569");
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
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        int int27 = dateTime26.getMs();
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
        double double34 = dateTime31.getDeltaYears(dateTime33);
        java.text.SimpleDateFormat simpleDateFormat35 = dateTime31.getSdf();
        boolean boolean36 = dateTime26.isLessThanOrEqual(dateTime31);
        java.text.SimpleDateFormat simpleDateFormat38 = null;
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat38);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double42 = dateTime39.getDeltaYears(dateTime41);
        boolean boolean43 = dateTime39.isWeekday();
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long48 = dateTime39.getDeltaDays(dateTime47);
        long long49 = dateTime26.getDeltaDays(dateTime47);
        java.lang.String str50 = dateTime47.toFullString();
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
        net.ajaskey.common.DateTime dateTime69 = dateTime47.copy(dateTime54);
        int int70 = dateTime69.getDayOfYear();
        dateTime1.set(dateTime69);
        java.lang.String str72 = dateTime69.toFullString();
        dateTime69.add(718, 495);
        net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime(dateTime69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "January" + "'", str13, "January");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "January" + "'", str20, "January");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1972.041095890411d) + "'", double34 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 719795L + "'", long49 == 719795L);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Thu 10-Apr-0002 10:47:47" + "'", str50, "Thu 10-Apr-0002 10:47:47");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(calendar66);
        org.junit.Assert.assertEquals(calendar66.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Thu 10-Apr-0002 10:47:47" + "'", str72, "Thu 10-Apr-0002 10:47:47");
    }

    @Test
    public void test8570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8570");
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
        net.ajaskey.common.DateTime dateTime25 = dateTime2.parse("                                                                                                                                                                                                                                                                                                                                                                          100", "Thu 10-Apr-0002 10:43:53");
        // The following exception was thrown during execution in test generation
        try {
            int int26 = dateTime25.getDayOfMonth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertNull(dateTime25);
    }

    @Test
    public void test8571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8571");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Fri 02-Jan-0001 17:00:00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test8572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8572");
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
        net.ajaskey.common.DateTime dateTime29 = dateTime13.parse("Thu 10-Apr-0002 10:43:22");
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        int int32 = dateTime31.getMs();
        java.text.SimpleDateFormat simpleDateFormat33 = net.ajaskey.common.Utils.sdf;
        dateTime31.setSdf(simpleDateFormat33);
        int int35 = dateTime31.getDayOfWeek();
        java.text.SimpleDateFormat simpleDateFormat37 = null;
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat37);
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double41 = dateTime38.getDeltaYears(dateTime40);
        boolean boolean42 = dateTime38.isWeekday();
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long47 = dateTime38.getDeltaDays(dateTime46);
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime(dateTime38);
        boolean boolean49 = dateTime31.isGreaterThan(dateTime48);
        boolean boolean50 = dateTime13.isEqual(dateTime48);
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        dateTime54.add(2, 12);
        java.util.Date date58 = dateTime54.getTime();
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime(date58);
        java.text.SimpleDateFormat simpleDateFormat61 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat62 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime("", simpleDateFormat61, simpleDateFormat62);
        dateTime59.setSdf(simpleDateFormat61);
        dateTime48.setSdf(simpleDateFormat61);
        int int66 = dateTime48.getHour();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-719795L) + "'", long20 == (-719795L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date58);
// flaky:         org.junit.Assert.assertEquals(date58.toString(), "Sat Apr 10 10:47:47 MST 1");
        org.junit.Assert.assertNotNull(simpleDateFormat61);
        org.junit.Assert.assertNotNull(simpleDateFormat62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
    }

    @Test
    public void test8573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8573");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        int int7 = dateTime3.getHour();
        java.util.Calendar calendar8 = dateTime3.getCal();
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(calendar8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        dateTime11.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        double double22 = dateTime19.getDeltaYears(dateTime21);
        boolean boolean23 = dateTime21.isWeekday();
        java.util.Date date24 = dateTime21.getTime();
        dateTime11.set(dateTime21);
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        double double32 = dateTime29.getDeltaYears(dateTime31);
        int int33 = dateTime29.getHour();
        java.text.SimpleDateFormat simpleDateFormat35 = null;
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat35);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double39 = dateTime36.getDeltaYears(dateTime38);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean44 = dateTime38.isEqual(dateTime43);
        java.util.Calendar calendar45 = dateTime38.getCal();
        dateTime29.set(calendar45);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime(calendar45);
        boolean boolean48 = dateTime21.isGreaterThan(dateTime47);
        long long49 = dateTime9.getDeltaMilliSeconds(dateTime47);
        java.lang.String str50 = dateTime47.getDay();
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime(2, 243, 44);
        int int55 = dateTime47.getYears(dateTime54);
        java.lang.String str56 = dateTime47.getMonth();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=-62190310332103,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=47,MILLISECOND=897,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1972.041095890411d) + "'", double22 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1972.041095890411d) + "'", double32 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(calendar45);
        org.junit.Assert.assertEquals(calendar45.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 62190310332103L + "'", long49 == 62190310332103L);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Wednesday" + "'", str50, "Wednesday");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1948) + "'", int55 == (-1948));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "December" + "'", str56, "December");
    }

    @Test
    public void test8574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8574");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(821, 558, 76);
    }

    @Test
    public void test8575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8575");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        java.util.Calendar calendar11 = dateTime4.getCal();
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(1, (int) '4', 5);
        double double16 = dateTime4.getDeltaYears(dateTime15);
        net.ajaskey.common.DateTime dateTime17 = null;
        boolean boolean18 = dateTime15.isLessThanOrEqual(dateTime17);
        java.lang.String str19 = dateTime15.toFullString();
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        int int22 = dateTime21.getMs();
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(100L);
        double double29 = dateTime26.getDeltaYears(dateTime28);
        java.text.SimpleDateFormat simpleDateFormat30 = dateTime26.getSdf();
        boolean boolean31 = dateTime21.isLessThanOrEqual(dateTime26);
        java.lang.String str32 = dateTime26.toString();
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
        int int35 = dateTime34.getMs();
        int int36 = dateTime34.getHour();
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat42 = null;
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat42);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double46 = dateTime43.getDeltaYears(dateTime45);
        boolean boolean47 = dateTime40.isLessThan(dateTime45);
        java.lang.String str48 = dateTime45.toFullString();
        dateTime45.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat53 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat55 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat56 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime("", simpleDateFormat55, simpleDateFormat56);
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat53, simpleDateFormat56);
        boolean boolean59 = dateTime45.isGreaterThan(dateTime58);
        boolean boolean60 = dateTime34.isEqual(dateTime45);
        net.ajaskey.common.DateTime dateTime61 = null;
        net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime(dateTime61);
        dateTime62.set(42, 10, 10);
        java.util.Date date67 = dateTime62.getTime();
        net.ajaskey.common.DateTime dateTime68 = dateTime34.copy(dateTime62);
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime(100L);
        int int71 = dateTime70.getMs();
        int int72 = dateTime70.getHour();
        double double73 = dateTime62.getDeltaYears(dateTime70);
        boolean boolean74 = net.ajaskey.common.Utils.sameMonth(dateTime26, dateTime70);
        net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime(100L);
        dateTime76.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str81 = dateTime76.getMonth();
        int int82 = dateTime76.getMs();
        java.lang.String str84 = dateTime76.format("                                                                                               52.00");
        int int85 = dateTime76.getDayOfMonth();
        long long86 = dateTime26.getDeltaDays(dateTime76);
        java.text.SimpleDateFormat simpleDateFormat87 = dateTime76.getSdf();
        java.util.Calendar calendar88 = dateTime76.getCal();
        boolean boolean89 = net.ajaskey.common.Utils.sameMonth(dateTime15, dateTime76);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1965.9671232876713d + "'", double16 == 1965.9671232876713d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Tue 05-May-0005 10:47:47" + "'", str19, "Tue 05-May-0005 10:47:47");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1972.041095890411d) + "'", double29 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10-Apr-0002" + "'", str32, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str48, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat53);
        org.junit.Assert.assertNotNull(simpleDateFormat55);
        org.junit.Assert.assertNotNull(simpleDateFormat56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(date67);
// flaky:         org.junit.Assert.assertEquals(date67.toString(), "Sat Nov 10 10:47:47 MST 42");
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 5 + "'", int72 == 5);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1928.4246575342465d) + "'", double73 == (-1928.4246575342465d));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "January" + "'", str81, "January");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 100 + "'", int82 == 100);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "                                                                                               52.00" + "'", str84, "                                                                                               52.00");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 4 + "'", int85 == 4);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + (-36794L) + "'", long86 == (-36794L));
        org.junit.Assert.assertNull(simpleDateFormat87);
        org.junit.Assert.assertNotNull(calendar88);
        org.junit.Assert.assertEquals(calendar88.toString(), "java.util.GregorianCalendar[time=-59011286399900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test8576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8576");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        java.text.SimpleDateFormat simpleDateFormat9 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("January", simpleDateFormat8, simpleDateFormat9);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime("Thursday", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(dateTime11);
        boolean boolean13 = dateTime2.isEqual(dateTime11);
        boolean boolean14 = dateTime2.isNull();
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
        double double21 = dateTime18.getDeltaYears(dateTime20);
        java.util.Date date22 = dateTime18.getTime();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(date22);
        net.ajaskey.common.DateTime dateTime26 = dateTime23.parse("31-Dec-1969", "January");
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
        boolean boolean53 = dateTime23.isLessThan(dateTime30);
        java.text.SimpleDateFormat simpleDateFormat54 = dateTime23.getSdf();
        java.lang.String str55 = dateTime23.toFullString();
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime(dateTime23);
        long long57 = dateTime2.getDeltaDays(dateTime23);
        boolean boolean58 = dateTime2.isWeekday();
        int int59 = dateTime2.getDayOfWeek();
        int int60 = dateTime2.getSecond();
        net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime((long) (short) 0);
        int int63 = dateTime62.getHour();
        int int64 = dateTime62.getSecond();
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime(dateTime62);
        java.lang.String str66 = dateTime65.toString();
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime(100L);
        double double73 = dateTime70.getDeltaYears(dateTime72);
        boolean boolean74 = dateTime72.isWeekday();
        java.util.Date date75 = dateTime72.getTime();
        int int76 = dateTime72.getDayOfWeek();
        java.lang.String str77 = dateTime72.toFullString();
        boolean boolean78 = dateTime72.isWeekday();
        dateTime65.set(dateTime72);
        long long80 = dateTime2.getDeltaDays(dateTime72);
        java.text.SimpleDateFormat simpleDateFormat81 = dateTime2.getSdf();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(simpleDateFormat9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Thu Apr 10 10:47:47 MST 2");
        org.junit.Assert.assertNull(dateTime26);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1972.041095890411d) + "'", double33 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(simpleDateFormat46);
        org.junit.Assert.assertNotNull(simpleDateFormat48);
        org.junit.Assert.assertNotNull(simpleDateFormat49);
// flaky:         org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(simpleDateFormat54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Thu 10-Apr-0002 10:47:47" + "'", str55, "Thu 10-Apr-0002 10:47:47");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "31-Dec-1969" + "'", str66, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1972.041095890411d) + "'", double73 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 4 + "'", int76 == 4);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str77, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNull(simpleDateFormat81);
    }

    @Test
    public void test8577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8577");
        net.ajaskey.common.Utils.makeDir("                                                                                              100");
    }

    @Test
    public void test8578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8578");
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
        java.util.Date date36 = null;
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(date36);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(100L);
        double double44 = dateTime41.getDeltaYears(dateTime43);
        int int45 = dateTime41.getHour();
        java.text.SimpleDateFormat simpleDateFormat47 = null;
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat47);
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double51 = dateTime48.getDeltaYears(dateTime50);
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean56 = dateTime50.isEqual(dateTime55);
        java.util.Calendar calendar57 = dateTime50.getCal();
        dateTime41.set(calendar57);
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime(calendar57);
        net.ajaskey.common.DateTime dateTime60 = dateTime37.copy(dateTime59);
        boolean boolean61 = dateTime33.isLessThan(dateTime37);
        net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:59", "11");
        int int65 = dateTime64.getYear();
        boolean boolean66 = net.ajaskey.common.Utils.sameDate(dateTime37, dateTime64);
        int int67 = dateTime37.getSecond();
        dateTime37.add(753, 215);
        int int71 = dateTime37.getDayOfYear();
        int int72 = dateTime37.getMs();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1972.041095890411d) + "'", double34 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1972.041095890411d) + "'", double44 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(calendar57);
        org.junit.Assert.assertEquals(calendar57.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 47 + "'", int67 == 47);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 177 + "'", int71 == 177);
// flaky:         org.junit.Assert.assertTrue("'" + int72 + "' != '" + 990 + "'", int72 == 990);
    }

    @Test
    public void test8579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8579");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        java.lang.String str3 = dateTime1.toString();
        dateTime1.set(25, (-1), (int) (short) 10);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
        double double14 = dateTime11.getDeltaYears(dateTime13);
        boolean boolean15 = dateTime13.isWeekday();
        boolean boolean16 = net.ajaskey.common.Utils.sameMonth(dateTime1, dateTime13);
        java.text.SimpleDateFormat simpleDateFormat18 = null;
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat18);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double22 = dateTime19.getDeltaYears(dateTime21);
        boolean boolean23 = dateTime19.isWeekday();
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long28 = dateTime19.getDeltaDays(dateTime27);
        dateTime27.set((int) (short) -1, (int) (byte) 0, (int) ' ');
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime(100L);
        double double39 = dateTime36.getDeltaYears(dateTime38);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
        double double46 = dateTime43.getDeltaYears(dateTime45);
        int int47 = dateTime43.getHour();
        int int48 = dateTime43.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime(100L);
        double double55 = dateTime52.getDeltaYears(dateTime54);
        boolean boolean56 = dateTime54.isWeekday();
        boolean boolean57 = net.ajaskey.common.Utils.sameDate(dateTime43, dateTime54);
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime(100L);
        dateTime59.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime(100L);
        double double70 = dateTime67.getDeltaYears(dateTime69);
        boolean boolean71 = dateTime69.isWeekday();
        java.util.Date date72 = dateTime69.getTime();
        dateTime59.set(dateTime69);
        int int74 = dateTime59.getYear();
        boolean boolean75 = dateTime54.isGreaterThanOrEqual(dateTime59);
        boolean boolean76 = dateTime36.sameDate(dateTime54);
        boolean boolean77 = dateTime27.isLessThanOrEqual(dateTime36);
        java.util.Date date78 = dateTime27.getTime();
        net.ajaskey.common.DateTime dateTime81 = dateTime27.parse("                                                                                                0.00", "Thu 10-Apr-0002 10:42:59");
        int int82 = dateTime27.getHour();
        net.ajaskey.common.DateTime dateTime83 = dateTime13.copy(dateTime27);
        int int84 = dateTime27.getHour();
        int int85 = dateTime27.getMs();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1972.041095890411d) + "'", double39 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1972.041095890411d) + "'", double55 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1972.041095890411d) + "'", double70 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1969 + "'", int74 == 1969);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(date78);
// flaky:         org.junit.Assert.assertEquals(date78.toString(), "Wed Feb 01 10:47:48 MST 2");
        org.junit.Assert.assertNull(dateTime81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 10 + "'", int84 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int85 + "' != '" + 12 + "'", int85 == 12);
    }

    @Test
    public void test8580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8580");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(274, 956, 1);
    }

    @Test
    public void test8581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8581");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(0.0d, 411);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test8582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8582");
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
        java.lang.String str26 = dateTime22.toFullString();
        java.lang.String str27 = dateTime22.toString();
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(dateTime22);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime(16, 264, (-1));
        boolean boolean33 = dateTime28.isLessThan(dateTime32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 719795L + "'", long24 == 719795L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Thu 10-Apr-0002 10:47:48" + "'", str25, "Thu 10-Apr-0002 10:47:48");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Thu 10-Apr-0002 10:47:48" + "'", str26, "Thu 10-Apr-0002 10:47:48");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10-Apr-0002" + "'", str27, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test8583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8583");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        int int3 = dateTime1.getMinute();
        java.lang.Class<?> wildcardClass4 = dateTime1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8584");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(182, 0, (-2005));
        java.text.SimpleDateFormat simpleDateFormat4 = dateTime3.getSdf();
        int int5 = dateTime3.getYear();
        org.junit.Assert.assertNull(simpleDateFormat4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 176 + "'", int5 == 176);
    }

    @Test
    public void test8585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8585");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        int int13 = dateTime12.getMs();
        boolean boolean14 = dateTime9.isGreaterThanOrEqual(dateTime12);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
        int int17 = dateTime16.getMs();
        int int18 = dateTime16.getHour();
        java.text.SimpleDateFormat simpleDateFormat20 = null;
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat20);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double24 = dateTime21.getDeltaYears(dateTime23);
        boolean boolean25 = dateTime21.isWeekday();
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long30 = dateTime21.getDeltaDays(dateTime29);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(dateTime21);
        boolean boolean32 = dateTime16.isLessThanOrEqual(dateTime31);
        boolean boolean33 = net.ajaskey.common.Utils.sameDate(dateTime12, dateTime31);
        int int34 = dateTime31.getSecond();
        java.lang.String str35 = dateTime31.format();
        java.lang.String str36 = dateTime31.getMonth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 48 + "'", int34 == 48);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "BAD-DATE-FORMAT" + "'", str35, "BAD-DATE-FORMAT");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "June" + "'", str36, "June");
    }

    @Test
    public void test8586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8586");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 10);
        java.lang.String str2 = dateTime1.getMonth();
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime("5.00", "     10");
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        int int13 = dateTime9.getHour();
        java.text.SimpleDateFormat simpleDateFormat15 = null;
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat15);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double19 = dateTime16.getDeltaYears(dateTime18);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean24 = dateTime18.isEqual(dateTime23);
        java.util.Calendar calendar25 = dateTime18.getCal();
        dateTime9.set(calendar25);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(calendar25);
        dateTime5.set(calendar25);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(100L);
        int int31 = dateTime30.getMs();
        java.lang.String str32 = dateTime30.toString();
        java.lang.String str34 = dateTime30.format("         1");
        net.ajaskey.common.DateTime dateTime35 = dateTime5.copy(dateTime30);
        java.text.SimpleDateFormat simpleDateFormat37 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat38 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime("", simpleDateFormat37, simpleDateFormat38);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
        double double46 = dateTime43.getDeltaYears(dateTime45);
        int int47 = dateTime43.getHour();
        java.text.SimpleDateFormat simpleDateFormat49 = null;
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat49);
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double53 = dateTime50.getDeltaYears(dateTime52);
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean58 = dateTime52.isEqual(dateTime57);
        java.util.Calendar calendar59 = dateTime52.getCal();
        dateTime43.set(calendar59);
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime(calendar59);
        boolean boolean62 = dateTime39.isLessThan(dateTime61);
        int int63 = dateTime61.getHour();
        net.ajaskey.common.DateTime dateTime64 = dateTime35.copy(dateTime61);
        java.lang.String str65 = dateTime35.getDay();
        java.util.Date date66 = dateTime35.getTime();
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime(date66);
        net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime(100L);
        int int70 = dateTime69.getMs();
        java.lang.String str71 = dateTime69.toString();
        dateTime69.set(25, (-1), (int) (short) 10);
        net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime81 = new net.ajaskey.common.DateTime(100L);
        double double82 = dateTime79.getDeltaYears(dateTime81);
        boolean boolean83 = dateTime81.isWeekday();
        boolean boolean84 = net.ajaskey.common.Utils.sameMonth(dateTime69, dateTime81);
        net.ajaskey.common.DateTime dateTime86 = new net.ajaskey.common.DateTime((long) (short) 0);
        int int87 = dateTime86.getHour();
        boolean boolean88 = dateTime86.isNull();
        net.ajaskey.common.DateTime dateTime89 = new net.ajaskey.common.DateTime(dateTime86);
        boolean boolean90 = dateTime81.isGreaterThan(dateTime86);
        int int91 = dateTime86.getMinute();
        boolean boolean92 = dateTime67.isGreaterThanOrEqual(dateTime86);
        double double93 = dateTime1.getDeltaYears(dateTime67);
        int int94 = dateTime67.getDayOfYear();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "December" + "'", str2, "December");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(calendar25);
        org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "31-Dec-1969" + "'", str32, "31-Dec-1969");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "         1" + "'", str34, "         1");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(simpleDateFormat37);
        org.junit.Assert.assertNotNull(simpleDateFormat38);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(calendar59);
        org.junit.Assert.assertEquals(calendar59.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Wednesday" + "'", str65, "Wednesday");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "31-Dec-1969" + "'", str71, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1972.041095890411d) + "'", double82 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 5 + "'", int87 == 5);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 365 + "'", int94 == 365);
    }

    @Test
    public void test8587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8587");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat5 = null;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean14 = dateTime8.isEqual(dateTime13);
        java.util.Calendar calendar15 = dateTime8.getCal();
        boolean boolean16 = dateTime3.isLessThan(dateTime8);
        int int17 = dateTime3.getDayOfYear();
        java.util.Date date18 = dateTime3.getTime();
        java.lang.String str19 = dateTime3.format();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Thu Apr 10 10:47:48 MST 2");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "BAD-DATE-FORMAT" + "'", str19, "BAD-DATE-FORMAT");
    }

    @Test
    public void test8588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8588");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("Thu 10-Apr-0002 10:47:45", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Thu 10-Apr-0002 10:47:45 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8589");
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
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(calendar19);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("                                                                                              100", "100");
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(100L);
        int int29 = dateTime28.getMs();
        java.text.SimpleDateFormat simpleDateFormat30 = net.ajaskey.common.Utils.sdf;
        dateTime28.setSdf(simpleDateFormat30);
        java.text.SimpleDateFormat simpleDateFormat32 = net.ajaskey.common.Utils.sdfFull;
        dateTime28.setSdf(simpleDateFormat32);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime("Mon 10-Apr-0002 00:00:00", simpleDateFormat32);
        dateTime25.setSdf(simpleDateFormat32);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
        net.ajaskey.common.DateTime dateTime40 = dateTime37.parse("", "");
        java.text.SimpleDateFormat simpleDateFormat42 = null;
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat42);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double46 = dateTime43.getDeltaYears(dateTime45);
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean51 = dateTime45.isEqual(dateTime50);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime(100L);
        int int54 = dateTime53.getMs();
        boolean boolean55 = dateTime50.isGreaterThanOrEqual(dateTime53);
        java.text.SimpleDateFormat simpleDateFormat57 = null;
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat57);
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double61 = dateTime58.getDeltaYears(dateTime60);
        boolean boolean62 = dateTime58.isWeekday();
        boolean boolean63 = dateTime53.isLessThanOrEqual(dateTime58);
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime(100L);
        dateTime65.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean70 = dateTime65.isWeekday();
        boolean boolean71 = dateTime53.isGreaterThanOrEqual(dateTime65);
        net.ajaskey.common.DateTime dateTime72 = dateTime37.copy(dateTime53);
        dateTime25.set(dateTime37);
        boolean boolean74 = net.ajaskey.common.Utils.sameMonth(dateTime22, dateTime25);
        net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime(100L);
        int int77 = dateTime76.getMs();
        java.lang.String str78 = dateTime76.toString();
        int int79 = dateTime76.getDayOfYear();
        java.lang.String str80 = dateTime76.getMonth();
        net.ajaskey.common.DateTime dateTime81 = dateTime25.copy(dateTime76);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat30);
        org.junit.Assert.assertNotNull(simpleDateFormat32);
        org.junit.Assert.assertNull(dateTime40);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 100 + "'", int77 == 100);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "31-Dec-1969" + "'", str78, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 365 + "'", int79 == 365);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "December" + "'", str80, "December");
        org.junit.Assert.assertNotNull(dateTime81);
    }

    @Test
    public void test8590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8590");
        net.ajaskey.common.Utils.makeDir("                                                                                                                                                        350");
    }

    @Test
    public void test8591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8591");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime(100L);
        int int3 = dateTime2.getMs();
        java.lang.String str4 = dateTime2.toString();
        java.text.SimpleDateFormat simpleDateFormat6 = null;
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat6);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double10 = dateTime7.getDeltaYears(dateTime9);
        boolean boolean11 = dateTime7.isWeekday();
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long16 = dateTime7.getDeltaDays(dateTime15);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(dateTime7);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
        double double24 = dateTime21.getDeltaYears(dateTime23);
        boolean boolean25 = dateTime23.isWeekday();
        java.util.Date date26 = dateTime23.getTime();
        dateTime7.set(date26);
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(100L);
        int int30 = dateTime29.getMs();
        java.lang.String str31 = dateTime29.toString();
        boolean boolean32 = dateTime7.isLessThanOrEqual(dateTime29);
        boolean boolean33 = dateTime2.isLessThanOrEqual(dateTime29);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("January", "11");
        double double37 = dateTime2.getDeltaYears(dateTime36);
        java.text.SimpleDateFormat simpleDateFormat38 = dateTime2.getSdf();
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime("January                                                                                               52.00                                                                                               52.00                                                                                               52.00                                                                                               52.00hi!                                                                                               52.00", simpleDateFormat38);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime(100L);
        int int42 = dateTime41.getMs();
        java.text.SimpleDateFormat simpleDateFormat43 = net.ajaskey.common.Utils.sdf;
        dateTime41.setSdf(simpleDateFormat43);
        net.ajaskey.common.DateTime dateTime45 = null;
        double double46 = dateTime41.getDeltaYears(dateTime45);
        net.ajaskey.common.DateTime dateTime48 = dateTime41.parse("Thu 10-Apr-0002 10:43:18");
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(100L);
        int int51 = dateTime50.getMs();
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime(100L);
        double double58 = dateTime55.getDeltaYears(dateTime57);
        java.text.SimpleDateFormat simpleDateFormat59 = dateTime55.getSdf();
        boolean boolean60 = dateTime50.isLessThanOrEqual(dateTime55);
        boolean boolean61 = dateTime50.isWeekday();
        java.util.Calendar calendar62 = dateTime50.getCal();
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime(calendar62);
        net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime("10-Apr-0002", "5.00");
        boolean boolean67 = dateTime63.isEqual(dateTime66);
        int int68 = dateTime66.getMinute();
        int int69 = dateTime66.getMinute();
        boolean boolean70 = net.ajaskey.common.Utils.sameMonth(dateTime41, dateTime66);
        int int71 = dateTime66.getDayOfYear();
        java.util.Date date72 = dateTime66.getTime();
        boolean boolean73 = dateTime39.sameDate(dateTime66);
        int int74 = dateTime66.getSecond();
        dateTime66.add(1967, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "31-Dec-1969" + "'", str4, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1972.041095890411d) + "'", double24 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "31-Dec-1969" + "'", str31, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(simpleDateFormat38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat43);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1972.041095890411d) + "'", double58 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(calendar62);
        org.junit.Assert.assertEquals(calendar62.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNull(date72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test8592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8592");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean4 = dateTime3.isNull();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime(100L);
        dateTime6.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str11 = dateTime6.getMonth();
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
        dateTime13.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str18 = dateTime13.getMonth();
        int int19 = dateTime13.getMs();
        net.ajaskey.common.DateTime dateTime20 = dateTime6.copy(dateTime13);
        boolean boolean21 = dateTime3.isGreaterThanOrEqual(dateTime20);
        int int22 = dateTime20.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(dateTime20);
        int int24 = dateTime20.getDayOfWeek();
        int int25 = dateTime20.getDayOfYear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "January" + "'", str11, "January");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "January" + "'", str18, "January");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test8593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8593");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        java.text.SimpleDateFormat simpleDateFormat9 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("January", simpleDateFormat8, simpleDateFormat9);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime("Thursday", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(dateTime11);
        boolean boolean13 = dateTime2.isEqual(dateTime11);
        java.text.SimpleDateFormat simpleDateFormat15 = null;
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat15);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double19 = dateTime16.getDeltaYears(dateTime18);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean24 = dateTime18.isEqual(dateTime23);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        int int27 = dateTime26.getMs();
        boolean boolean28 = dateTime23.isGreaterThanOrEqual(dateTime26);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(100L);
        dateTime30.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(100L);
        double double41 = dateTime38.getDeltaYears(dateTime40);
        boolean boolean42 = dateTime40.isWeekday();
        java.util.Date date43 = dateTime40.getTime();
        dateTime30.set(dateTime40);
        boolean boolean45 = net.ajaskey.common.Utils.sameDate(dateTime23, dateTime30);
        dateTime23.add((int) '#', 6);
        int int49 = dateTime2.getYears(dateTime23);
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime("5.00", "     10");
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime(100L);
        double double59 = dateTime56.getDeltaYears(dateTime58);
        int int60 = dateTime56.getHour();
        java.text.SimpleDateFormat simpleDateFormat62 = null;
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat62);
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double66 = dateTime63.getDeltaYears(dateTime65);
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean71 = dateTime65.isEqual(dateTime70);
        java.util.Calendar calendar72 = dateTime65.getCal();
        dateTime56.set(calendar72);
        net.ajaskey.common.DateTime dateTime74 = new net.ajaskey.common.DateTime(calendar72);
        dateTime52.set(calendar72);
        dateTime2.set(dateTime52);
        int int77 = dateTime52.getYear();
        int int78 = dateTime52.getDayOfWeek();
        net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime(dateTime52);
        java.lang.String str80 = dateTime79.toString();
        int int81 = dateTime79.getSecond();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(simpleDateFormat9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1972.041095890411d) + "'", double41 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1972.041095890411d) + "'", double59 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(calendar72);
        org.junit.Assert.assertEquals(calendar72.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1969 + "'", int77 == 1969);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 4 + "'", int78 == 4);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "31-Dec-1969" + "'", str80, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test8594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8594");
        net.ajaskey.common.DateTime dateTime0 = new net.ajaskey.common.DateTime();
        net.ajaskey.common.DateTime dateTime1 = null;
        boolean boolean2 = dateTime0.isGreaterThan(dateTime1);
        java.text.SimpleDateFormat simpleDateFormat4 = null;
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat4);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double8 = dateTime5.getDeltaYears(dateTime7);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean13 = dateTime7.isEqual(dateTime12);
        java.util.Calendar calendar14 = dateTime7.getCal();
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(calendar14);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(calendar14);
        boolean boolean17 = dateTime0.isLessThan(dateTime16);
        int int18 = dateTime16.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime21 = dateTime16.parse("     35", "                                                                                                                                                                                                                                                                                                                                                            32");
        java.text.SimpleDateFormat simpleDateFormat26 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat27 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime("", simpleDateFormat26, simpleDateFormat27);
        java.text.SimpleDateFormat simpleDateFormat30 = null;
        java.text.SimpleDateFormat simpleDateFormat31 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("January", simpleDateFormat30, simpleDateFormat31);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat26, simpleDateFormat31);
        java.text.SimpleDateFormat simpleDateFormat36 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat37 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime("", simpleDateFormat36, simpleDateFormat37);
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(100L);
        int int41 = dateTime40.getMs();
        java.text.SimpleDateFormat simpleDateFormat42 = net.ajaskey.common.Utils.sdf;
        dateTime40.setSdf(simpleDateFormat42);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat37, simpleDateFormat42);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime("                             100", simpleDateFormat31, simpleDateFormat37);
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:58", simpleDateFormat31);
        dateTime46.set((int) (byte) 10, 5, 42);
        net.ajaskey.common.DateTime dateTime53 = dateTime46.parse("                     8.00", "                                         0");
        java.lang.String str54 = dateTime46.getDay();
        java.text.SimpleDateFormat simpleDateFormat55 = dateTime46.getSdf();
        net.ajaskey.common.DateTime dateTime58 = dateTime46.parse("                                                                                                                                                    0.00", "                          -1,928.42");
        net.ajaskey.common.DateTime dateTime59 = dateTime16.copy(dateTime58);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertNull(dateTime21);
        org.junit.Assert.assertNotNull(simpleDateFormat26);
        org.junit.Assert.assertNotNull(simpleDateFormat27);
        org.junit.Assert.assertNotNull(simpleDateFormat31);
        org.junit.Assert.assertNotNull(simpleDateFormat36);
        org.junit.Assert.assertNotNull(simpleDateFormat37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat42);
        org.junit.Assert.assertNull(dateTime53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Saturday" + "'", str54, "Saturday");
        org.junit.Assert.assertNotNull(simpleDateFormat55);
        org.junit.Assert.assertNull(dateTime58);
        org.junit.Assert.assertNull(dateTime59);
    }

    @Test
    public void test8595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8595");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) 'a', 1869, (int) (byte) 0);
        java.lang.String str4 = dateTime3.getDay();
        java.lang.String str5 = dateTime3.toFullString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Thursday" + "'", str4, "Thursday");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu 30-Sep-0252 10:47:48" + "'", str5, "Thu 30-Sep-0252 10:47:48");
    }

    @Test
    public void test8596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8596");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) 268);
    }

    @Test
    public void test8597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8597");
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
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((long) 8);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
        double double24 = dateTime21.getDeltaYears(dateTime23);
        int int25 = dateTime21.getHour();
        dateTime21.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat30 = null;
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat30);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double34 = dateTime31.getDeltaYears(dateTime33);
        boolean boolean35 = dateTime21.isEqual(dateTime33);
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat41 = null;
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat41);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double45 = dateTime42.getDeltaYears(dateTime44);
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean50 = dateTime44.isEqual(dateTime49);
        java.util.Calendar calendar51 = dateTime44.getCal();
        boolean boolean52 = dateTime39.isLessThan(dateTime44);
        dateTime39.setFirstWorkDay();
        boolean boolean54 = dateTime21.sameDate(dateTime39);
        boolean boolean55 = net.ajaskey.common.Utils.sameMonth(dateTime17, dateTime39);
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat61 = null;
        net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat61);
        net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double65 = dateTime62.getDeltaYears(dateTime64);
        boolean boolean66 = dateTime59.isLessThan(dateTime64);
        java.lang.String str67 = dateTime64.toFullString();
        int int68 = dateTime64.getSecond();
        net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime(dateTime64);
        java.lang.String str70 = dateTime69.getDay();
        long long71 = dateTime39.getDeltaDays(dateTime69);
        int int72 = dateTime69.getDayOfWeek();
        int int73 = dateTime69.getYear();
        boolean boolean74 = dateTime6.isLessThan(dateTime69);
        java.util.Calendar calendar75 = dateTime6.getCal();
        net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime(calendar75);
        java.lang.String str77 = dateTime76.toFullString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1972.041095890411d) + "'", double24 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(calendar51);
        org.junit.Assert.assertEquals(calendar51.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str67, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Wednesday" + "'", str70, "Wednesday");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-719795L) + "'", long71 == (-719795L));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 4 + "'", int72 == 4);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1969 + "'", int73 == 1969);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(calendar75);
// flaky:         org.junit.Assert.assertEquals(calendar75.toString(), "java.util.GregorianCalendar[time=-62190310331706,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=48,MILLISECOND=294,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Thu 10-Apr-0002 10:47:48" + "'", str77, "Thu 10-Apr-0002 10:47:48");
    }

    @Test
    public void test8598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8598");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        dateTime1.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime11.isWeekday();
        java.util.Date date14 = dateTime11.getTime();
        dateTime1.set(dateTime11);
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
        boolean boolean38 = dateTime11.isGreaterThan(dateTime37);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((int) (byte) 10, (int) (byte) 0, 2);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(dateTime42);
        net.ajaskey.common.DateTime dateTime44 = dateTime37.copy(dateTime43);
        int int45 = dateTime44.getHour();
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime(dateTime44);
        java.lang.String str47 = dateTime44.getDay();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1972.041095890411d) + "'", double22 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(calendar35);
        org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Thursday" + "'", str47, "Thursday");
    }

    @Test
    public void test8599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8599");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat5 = null;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        boolean boolean10 = dateTime3.isLessThan(dateTime8);
        java.lang.String str11 = dateTime8.toFullString();
        int int12 = dateTime8.getSecond();
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(dateTime8);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean18 = dateTime17.isNull();
        java.lang.String str19 = dateTime17.getDay();
        java.text.SimpleDateFormat simpleDateFormat20 = dateTime17.getSdf();
        int int21 = dateTime17.getHour();
        boolean boolean22 = dateTime8.isGreaterThanOrEqual(dateTime17);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(100L);
        dateTime24.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
        double double35 = dateTime32.getDeltaYears(dateTime34);
        boolean boolean36 = dateTime34.isWeekday();
        java.util.Date date37 = dateTime34.getTime();
        dateTime24.set(dateTime34);
        int int39 = dateTime24.getYear();
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(100L);
        double double46 = dateTime43.getDeltaYears(dateTime45);
        int int47 = dateTime43.getHour();
        java.util.Calendar calendar48 = dateTime43.getCal();
        boolean boolean49 = dateTime24.isGreaterThan(dateTime43);
        java.lang.String str50 = dateTime43.getDay();
        dateTime17.set(dateTime43);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime(100L);
        dateTime53.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime(100L);
        double double64 = dateTime61.getDeltaYears(dateTime63);
        boolean boolean65 = dateTime63.isWeekday();
        java.util.Date date66 = dateTime63.getTime();
        dateTime53.set(dateTime63);
        int int68 = dateTime53.getYear();
        net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime74 = new net.ajaskey.common.DateTime(100L);
        double double75 = dateTime72.getDeltaYears(dateTime74);
        int int76 = dateTime72.getHour();
        java.util.Calendar calendar77 = dateTime72.getCal();
        boolean boolean78 = dateTime53.isGreaterThan(dateTime72);
        net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime(dateTime72);
        boolean boolean80 = dateTime43.isLessThanOrEqual(dateTime79);
        java.util.Date date81 = dateTime43.getTime();
        net.ajaskey.common.DateTime dateTime82 = new net.ajaskey.common.DateTime(date81);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str11, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Thursday" + "'", str19, "Thursday");
        org.junit.Assert.assertNull(simpleDateFormat20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1969 + "'", int39 == 1969);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1972.041095890411d) + "'", double46 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(calendar48);
// flaky:         org.junit.Assert.assertEquals(calendar48.toString(), "java.util.GregorianCalendar[time=-62190310331667,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=48,MILLISECOND=333,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Thursday" + "'", str50, "Thursday");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1972.041095890411d) + "'", double64 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1969 + "'", int68 == 1969);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1972.041095890411d) + "'", double75 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertNotNull(calendar77);
// flaky:         org.junit.Assert.assertEquals(calendar77.toString(), "java.util.GregorianCalendar[time=-62190310331667,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=48,MILLISECOND=333,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(date81);
// flaky:         org.junit.Assert.assertEquals(date81.toString(), "Thu Apr 10 10:47:48 MST 2");
    }

    @Test
    public void test8600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8600");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("10-Apr-0002", "    0");
        boolean boolean3 = dateTime2.isWeekday();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8601");
        net.ajaskey.common.Utils.makeDir("         0");
    }

    @Test
    public void test8602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8602");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("BAD-DATE-FORMAT", "                                                                                               52.00");
        int int3 = dateTime2.getMinute();
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
        double double10 = dateTime7.getDeltaYears(dateTime9);
        boolean boolean11 = dateTime9.isWeekday();
        int int12 = dateTime9.getDayOfYear();
        boolean boolean13 = dateTime2.isEqual(dateTime9);
        int int14 = dateTime2.getMs();
        java.text.SimpleDateFormat simpleDateFormat16 = null;
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean25 = dateTime19.isEqual(dateTime24);
        java.util.Calendar calendar26 = dateTime19.getCal();
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(1, (int) '4', 5);
        double double31 = dateTime19.getDeltaYears(dateTime30);
        java.lang.String str32 = dateTime30.format();
        dateTime30.setFirstWorkDay();
        dateTime2.set(dateTime30);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime("hi!", "                              1,927");
        double double38 = dateTime2.getDeltaYears(dateTime37);
        java.lang.String str39 = dateTime37.getMonth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1972.041095890411d) + "'", double10 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 365 + "'", int12 == 365);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(calendar26);
        org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1965.9671232876713d + "'", double31 == 1965.9671232876713d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "BAD-DATE-FORMAT" + "'", str32, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UNKNOWN" + "'", str39, "UNKNOWN");
    }

    @Test
    public void test8603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8603");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(213, 235, 757);
        java.lang.String str5 = dateTime3.format("                               36");
        java.text.SimpleDateFormat simpleDateFormat7 = null;
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime("                                                  32", simpleDateFormat7);
        boolean boolean9 = dateTime3.isEqual(dateTime8);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                               36" + "'", str5, "                               36");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test8604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8604");
        net.ajaskey.common.DateTime dateTime0 = new net.ajaskey.common.DateTime();
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime(100L);
        int int3 = dateTime2.getMs();
        boolean boolean4 = dateTime2.isWeekday();
        int int5 = dateTime2.getHour();
        java.text.SimpleDateFormat simpleDateFormat7 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime("January", simpleDateFormat7);
        dateTime2.setSdf(simpleDateFormat7);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime2.getSdf();
        java.lang.String str12 = dateTime2.format("Thursday");
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
        double double19 = dateTime16.getDeltaYears(dateTime18);
        int int20 = dateTime16.getHour();
        java.text.SimpleDateFormat simpleDateFormat22 = null;
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat22);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double26 = dateTime23.getDeltaYears(dateTime25);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean31 = dateTime25.isEqual(dateTime30);
        java.util.Calendar calendar32 = dateTime25.getCal();
        java.lang.String str33 = dateTime25.format();
        net.ajaskey.common.DateTime dateTime34 = null;
        long long35 = dateTime25.getDeltaDays(dateTime34);
        int int36 = dateTime25.getSecond();
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(100L);
        double double43 = dateTime40.getDeltaYears(dateTime42);
        java.text.SimpleDateFormat simpleDateFormat45 = null;
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat45);
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double49 = dateTime46.getDeltaYears(dateTime48);
        boolean boolean50 = dateTime46.isWeekday();
        boolean boolean51 = dateTime40.sameDate(dateTime46);
        int int52 = dateTime46.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime53 = dateTime25.copy(dateTime46);
        dateTime16.set(dateTime46);
        boolean boolean55 = dateTime2.isEqual(dateTime16);
        boolean boolean56 = dateTime0.isEqual(dateTime16);
        java.lang.String str58 = dateTime16.format("November");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(simpleDateFormat7);
        org.junit.Assert.assertNotNull(simpleDateFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "BAD-DATE-FORMAT" + "'", str12, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(calendar32);
        org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "BAD-DATE-FORMAT" + "'", str33, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1972.041095890411d) + "'", double43 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "BAD-DATE-FORMAT" + "'", str58, "BAD-DATE-FORMAT");
    }

    @Test
    public void test8605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8605");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        boolean boolean2 = dateTime1.isWeekday();
        java.util.Date date3 = null;
        dateTime1.set(date3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test8606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8606");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        int int7 = dateTime3.getHour();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime();
        net.ajaskey.common.DateTime dateTime9 = null;
        boolean boolean10 = dateTime8.isGreaterThan(dateTime9);
        java.text.SimpleDateFormat simpleDateFormat12 = null;
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat12);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double16 = dateTime13.getDeltaYears(dateTime15);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean21 = dateTime15.isEqual(dateTime20);
        java.util.Calendar calendar22 = dateTime15.getCal();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(calendar22);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(calendar22);
        boolean boolean25 = dateTime8.isLessThan(dateTime24);
        boolean boolean26 = dateTime3.isLessThan(dateTime8);
        int int27 = dateTime3.getYear();
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((long) (short) 0);
        int int30 = dateTime29.getHour();
        boolean boolean31 = dateTime29.isNull();
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime(dateTime29);
        java.text.SimpleDateFormat simpleDateFormat33 = dateTime29.getSdf();
        java.lang.String str34 = dateTime29.toFullString();
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime(12, 42, (int) (byte) 1);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean43 = dateTime42.isNull();
        int int44 = dateTime42.getDayOfYear();
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime(100L);
        long long55 = dateTime52.getDeltaDays(dateTime54);
        int int56 = dateTime52.getHour();
        dateTime52.add((int) (byte) 100, (int) (byte) 0);
        double double60 = dateTime48.getDeltaYears(dateTime52);
        boolean boolean61 = dateTime42.isLessThanOrEqual(dateTime48);
        boolean boolean62 = dateTime38.sameDate(dateTime48);
        java.util.Date date63 = dateTime48.getTime();
        dateTime29.set(dateTime48);
        boolean boolean65 = net.ajaskey.common.Utils.sameMonth(dateTime3, dateTime48);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(simpleDateFormat33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str34, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-719795L) + "'", long55 == (-719795L));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(date63);
// flaky:         org.junit.Assert.assertEquals(date63.toString(), "Thu Apr 10 10:47:48 MST 2");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test8607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8607");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        boolean boolean11 = dateTime4.isNull();
        int int12 = dateTime4.getHour();
        java.lang.String str13 = dateTime4.getDay();
        java.text.SimpleDateFormat simpleDateFormat14 = dateTime4.getSdf();
        int int15 = dateTime4.getHour();
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(62190310594996L);
        long long18 = dateTime4.getDeltaMilliSeconds(dateTime17);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Wednesday" + "'", str13, "Wednesday");
        org.junit.Assert.assertNull(simpleDateFormat14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 62190310594996L + "'", long18 == 62190310594996L);
    }

    @Test
    public void test8608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8608");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        double double13 = dateTime10.getDeltaYears(dateTime12);
        int int14 = dateTime10.getHour();
        int int15 = dateTime10.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        double double22 = dateTime19.getDeltaYears(dateTime21);
        boolean boolean23 = dateTime21.isWeekday();
        boolean boolean24 = net.ajaskey.common.Utils.sameDate(dateTime10, dateTime21);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        dateTime26.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime(100L);
        double double37 = dateTime34.getDeltaYears(dateTime36);
        boolean boolean38 = dateTime36.isWeekday();
        java.util.Date date39 = dateTime36.getTime();
        dateTime26.set(dateTime36);
        int int41 = dateTime26.getYear();
        boolean boolean42 = dateTime21.isGreaterThanOrEqual(dateTime26);
        boolean boolean43 = dateTime3.sameDate(dateTime21);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime(100L);
        double double50 = dateTime47.getDeltaYears(dateTime49);
        int int51 = dateTime47.getHour();
        java.text.SimpleDateFormat simpleDateFormat53 = null;
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat53);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double57 = dateTime54.getDeltaYears(dateTime56);
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean62 = dateTime56.isEqual(dateTime61);
        java.util.Calendar calendar63 = dateTime56.getCal();
        dateTime47.set(calendar63);
        dateTime3.set(calendar63);
        java.lang.String str66 = dateTime3.toString();
        int int67 = dateTime3.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1972.041095890411d) + "'", double13 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1972.041095890411d) + "'", double22 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1972.041095890411d) + "'", double37 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1969 + "'", int41 == 1969);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1972.041095890411d) + "'", double50 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(calendar63);
        org.junit.Assert.assertEquals(calendar63.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "31-Dec-1969" + "'", str66, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 4 + "'", int67 == 4);
    }

    @Test
    public void test8609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8609");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(108, 367);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                            108" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                            108");
    }

    @Test
    public void test8610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8610");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
        dateTime1.setSdf(simpleDateFormat3);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("5.00", "     10");
        dateTime7.add((int) (short) 0, (int) 'a');
        int int11 = dateTime7.getDayOfMonth();
        java.lang.String str12 = dateTime7.toString();
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
        double double19 = dateTime16.getDeltaYears(dateTime18);
        int int20 = dateTime16.getHour();
        java.text.SimpleDateFormat simpleDateFormat22 = null;
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat22);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double26 = dateTime23.getDeltaYears(dateTime25);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean31 = dateTime25.isEqual(dateTime30);
        java.util.Calendar calendar32 = dateTime25.getCal();
        java.lang.String str33 = dateTime25.format();
        net.ajaskey.common.DateTime dateTime34 = null;
        long long35 = dateTime25.getDeltaDays(dateTime34);
        int int36 = dateTime25.getSecond();
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(100L);
        double double43 = dateTime40.getDeltaYears(dateTime42);
        java.text.SimpleDateFormat simpleDateFormat45 = null;
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat45);
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double49 = dateTime46.getDeltaYears(dateTime48);
        boolean boolean50 = dateTime46.isWeekday();
        boolean boolean51 = dateTime40.sameDate(dateTime46);
        int int52 = dateTime46.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime53 = dateTime25.copy(dateTime46);
        dateTime16.set(dateTime46);
        boolean boolean55 = dateTime7.isGreaterThan(dateTime46);
        boolean boolean56 = net.ajaskey.common.Utils.sameMonth(dateTime1, dateTime7);
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime((long) (byte) 0);
        boolean boolean59 = dateTime1.isEqual(dateTime58);
        boolean boolean60 = dateTime58.isWeekday();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1972.041095890411d) + "'", double19 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(calendar32);
        org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "BAD-DATE-FORMAT" + "'", str33, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1972.041095890411d) + "'", double43 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test8611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8611");
        java.lang.String[] strArray6 = new java.lang.String[] { "     5.00" };
        java.util.List<java.io.File> fileList7 = net.ajaskey.common.Utils.getDirTree("                                                 100", strArray6);
        java.util.List<java.io.File> fileList8 = net.ajaskey.common.Utils.getDirTree("Sat 04-Jan-0100 17:00:00", strArray6);
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDirTree("Thu 10-Apr-0002 10:43:00", strArray6);
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDirTree("                                                                                                           0", strArray6);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("                                                                                                                                                                                                                                                  -59,011,286,399,903.00", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(fileList7);
        org.junit.Assert.assertNull(fileList8);
        org.junit.Assert.assertNull(fileList9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
    }

    @Test
    public void test8612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8612");
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
        java.text.SimpleDateFormat simpleDateFormat16 = null;
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        boolean boolean21 = dateTime19.isNull();
        boolean boolean22 = net.ajaskey.common.Utils.sameDate(dateTime14, dateTime19);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat28 = null;
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat28);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double32 = dateTime29.getDeltaYears(dateTime31);
        boolean boolean33 = dateTime26.isLessThan(dateTime31);
        java.lang.String str34 = dateTime31.toFullString();
        dateTime31.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat39 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat41 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat42 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("", simpleDateFormat41, simpleDateFormat42);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat39, simpleDateFormat42);
        boolean boolean45 = dateTime31.isGreaterThan(dateTime44);
        java.text.SimpleDateFormat simpleDateFormat47 = null;
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat47);
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double51 = dateTime48.getDeltaYears(dateTime50);
        boolean boolean52 = dateTime48.isWeekday();
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long57 = dateTime48.getDeltaDays(dateTime56);
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime(dateTime48);
        boolean boolean59 = dateTime44.sameDate(dateTime48);
        net.ajaskey.common.DateTime dateTime60 = null;
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime(dateTime60);
        int int62 = dateTime61.getYear();
        dateTime48.set(dateTime61);
        java.lang.String str64 = dateTime61.format();
        net.ajaskey.common.DateTime dateTime65 = dateTime19.copy(dateTime61);
        dateTime61.add(38, (int) (short) 1);
        net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat75 = null;
        java.text.SimpleDateFormat simpleDateFormat76 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime77 = new net.ajaskey.common.DateTime("January", simpleDateFormat75, simpleDateFormat76);
        java.text.SimpleDateFormat simpleDateFormat80 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime81 = new net.ajaskey.common.DateTime("January", simpleDateFormat80);
        net.ajaskey.common.DateTime dateTime82 = new net.ajaskey.common.DateTime("", simpleDateFormat80);
        net.ajaskey.common.DateTime dateTime83 = new net.ajaskey.common.DateTime("", simpleDateFormat76, simpleDateFormat80);
        dateTime72.setSdf(simpleDateFormat76);
        java.lang.String str85 = dateTime72.toString();
        boolean boolean86 = dateTime61.isLessThanOrEqual(dateTime72);
        net.ajaskey.common.DateTime dateTime89 = dateTime72.parse("                                                                                                                                                                                                                                                                                                                                                                                       595", "Fri 11-Jan-0032 10:45:34");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str34, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat39);
        org.junit.Assert.assertNotNull(simpleDateFormat41);
        org.junit.Assert.assertNotNull(simpleDateFormat42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2020 + "'", int62 == 2020);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "BAD-DATE-FORMAT" + "'", str64, "BAD-DATE-FORMAT");
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(simpleDateFormat76);
        org.junit.Assert.assertNotNull(simpleDateFormat80);
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Thu 10-Apr-0002 10:47:48" + "'", str85, "Thu 10-Apr-0002 10:47:48");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(dateTime89);
    }

    @Test
    public void test8613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8613");
        net.ajaskey.common.Utils.sleep((-1945));
    }

    @Test
    public void test8614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8614");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(7, 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 7" + "'", str2, "                 7");
    }

    @Test
    public void test8615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8615");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) 'a', 1869, (int) (byte) 0);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
        double double10 = dateTime7.getDeltaYears(dateTime9);
        java.util.Date date11 = dateTime7.getTime();
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(date11);
        net.ajaskey.common.DateTime dateTime15 = dateTime12.parse("31-Dec-1969", "January");
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
        int int18 = dateTime17.getMs();
        java.lang.String str19 = dateTime17.toString();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(100L);
        double double26 = dateTime23.getDeltaYears(dateTime25);
        int int27 = dateTime23.getHour();
        int int28 = dateTime23.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
        double double35 = dateTime32.getDeltaYears(dateTime34);
        boolean boolean36 = dateTime34.isWeekday();
        boolean boolean37 = net.ajaskey.common.Utils.sameDate(dateTime23, dateTime34);
        boolean boolean38 = net.ajaskey.common.Utils.sameDate(dateTime17, dateTime23);
        dateTime12.set(dateTime23);
        java.util.Calendar calendar40 = dateTime23.getCal();
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime(calendar40);
        boolean boolean42 = dateTime3.sameDate(dateTime41);
        java.util.Calendar calendar43 = dateTime3.getCal();
        java.lang.String str44 = dateTime3.format();
        java.text.SimpleDateFormat simpleDateFormat46 = null;
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat46);
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double50 = dateTime47.getDeltaYears(dateTime49);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(dateTime47);
        net.ajaskey.common.DateTime dateTime54 = dateTime51.parse("      32", "        10");
        int int55 = dateTime51.getYear();
        boolean boolean56 = dateTime3.isGreaterThanOrEqual(dateTime51);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1972.041095890411d) + "'", double10 == (-1972.041095890411d));
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Thu Apr 10 10:47:48 MST 2");
        org.junit.Assert.assertNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "31-Dec-1969" + "'", str19, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1972.041095890411d) + "'", double26 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1972.041095890411d) + "'", double35 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(calendar40);
// flaky:         org.junit.Assert.assertEquals(calendar40.toString(), "java.util.GregorianCalendar[time=-62190310331408,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=48,MILLISECOND=592,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(calendar43);
// flaky:         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=-54191225531409,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=252,MONTH=8,WEEK_OF_YEAR=40,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=274,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=48,MILLISECOND=591,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "BAD-DATE-FORMAT" + "'", str44, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNull(dateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2020 + "'", int55 == 2020);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test8616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8616");
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
        java.lang.String str39 = dateTime3.toString();
        net.ajaskey.common.DateTime dateTime42 = dateTime3.parse("    0", "10-Nov-0042");
        java.lang.String str43 = dateTime3.toFullString();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "10-Apr-0002" + "'", str39, "10-Apr-0002");
        org.junit.Assert.assertNull(dateTime42);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Thu 10-Apr-0002 10:47:48" + "'", str43, "Thu 10-Apr-0002 10:47:48");
    }

    @Test
    public void test8617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8617");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        boolean boolean12 = dateTime6.isWeekday();
        java.lang.String str13 = dateTime6.toString();
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
        int int16 = dateTime15.getMs();
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
        double double23 = dateTime20.getDeltaYears(dateTime22);
        java.text.SimpleDateFormat simpleDateFormat24 = dateTime20.getSdf();
        boolean boolean25 = dateTime15.isLessThanOrEqual(dateTime20);
        java.text.SimpleDateFormat simpleDateFormat27 = null;
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat27);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double31 = dateTime28.getDeltaYears(dateTime30);
        boolean boolean32 = dateTime28.isWeekday();
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long37 = dateTime28.getDeltaDays(dateTime36);
        long long38 = dateTime15.getDeltaDays(dateTime36);
        java.lang.String str39 = dateTime36.toFullString();
        java.util.Calendar calendar40 = dateTime36.getCal();
        boolean boolean41 = dateTime6.isLessThan(dateTime36);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(dateTime36);
        java.lang.String str43 = dateTime36.toString();
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(dateTime36);
        boolean boolean45 = dateTime36.isWeekday();
        int int46 = dateTime36.getMinute();
        int int47 = dateTime36.getDayOfWeek();
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime(dateTime36);
        dateTime36.setFirstWorkDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10-Apr-0002" + "'", str13, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1972.041095890411d) + "'", double23 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 719795L + "'", long38 == 719795L);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Thu 10-Apr-0002 10:47:48" + "'", str39, "Thu 10-Apr-0002 10:47:48");
        org.junit.Assert.assertNotNull(calendar40);
// flaky:         org.junit.Assert.assertEquals(calendar40.toString(), "java.util.GregorianCalendar[time=-62190310331369,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=48,MILLISECOND=631,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10-Apr-0002" + "'", str43, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 47 + "'", int46 == 47);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
    }

    @Test
    public void test8618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8618");
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
        java.lang.String str26 = dateTime22.toFullString();
        int int27 = dateTime22.getDayOfMonth();
        java.text.SimpleDateFormat simpleDateFormat30 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("January", simpleDateFormat30);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("", simpleDateFormat30);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime(100L);
        double double40 = dateTime37.getDeltaYears(dateTime39);
        int int41 = dateTime37.getHour();
        dateTime37.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat46 = null;
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat46);
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double50 = dateTime47.getDeltaYears(dateTime49);
        boolean boolean51 = dateTime37.isEqual(dateTime49);
        java.text.SimpleDateFormat simpleDateFormat53 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat55 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat56 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime("", simpleDateFormat55, simpleDateFormat56);
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat53, simpleDateFormat56);
        dateTime37.setSdf(simpleDateFormat53);
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat66 = null;
        java.text.SimpleDateFormat simpleDateFormat67 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime("January", simpleDateFormat66, simpleDateFormat67);
        java.text.SimpleDateFormat simpleDateFormat71 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime("January", simpleDateFormat71);
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime("", simpleDateFormat71);
        net.ajaskey.common.DateTime dateTime74 = new net.ajaskey.common.DateTime("", simpleDateFormat67, simpleDateFormat71);
        dateTime63.setSdf(simpleDateFormat67);
        net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime("December", simpleDateFormat53, simpleDateFormat67);
        dateTime32.set(dateTime76);
        java.lang.String str79 = dateTime76.format("                     62,190,310,608,217.00");
        long long80 = dateTime22.getDeltaDays(dateTime76);
        net.ajaskey.common.DateTime dateTime81 = new net.ajaskey.common.DateTime(dateTime76);
        net.ajaskey.common.DateTime dateTime84 = dateTime76.parse("Thu 30-Apr-0268 10:44:56", "");
        java.lang.String str85 = dateTime76.format();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 719795L + "'", long24 == 719795L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Thu 10-Apr-0002 10:47:48" + "'", str25, "Thu 10-Apr-0002 10:47:48");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Thu 10-Apr-0002 10:47:48" + "'", str26, "Thu 10-Apr-0002 10:47:48");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(simpleDateFormat30);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1972.041095890411d) + "'", double40 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(simpleDateFormat53);
        org.junit.Assert.assertNotNull(simpleDateFormat55);
        org.junit.Assert.assertNotNull(simpleDateFormat56);
        org.junit.Assert.assertNotNull(simpleDateFormat67);
        org.junit.Assert.assertNotNull(simpleDateFormat71);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "BAD-DATE-FORMAT" + "'", str79, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNull(dateTime84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "BAD-DATE-FORMAT" + "'", str85, "BAD-DATE-FORMAT");
    }

    @Test
    public void test8619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8619");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        int int7 = dateTime3.getHour();
        java.util.Calendar calendar8 = dateTime3.getCal();
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(calendar8);
        int int10 = dateTime9.getYear();
        int int11 = dateTime9.getHour();
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
        long long18 = dateTime15.getDeltaDays(dateTime17);
        int int19 = dateTime17.getSecond();
        int int20 = dateTime17.getYear();
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
        int int23 = dateTime22.getMs();
        boolean boolean24 = dateTime22.isWeekday();
        java.util.Calendar calendar25 = dateTime22.getCal();
        int int26 = dateTime17.getYears(dateTime22);
        java.util.Calendar calendar27 = dateTime17.getCal();
        int int28 = dateTime9.getYears(dateTime17);
        java.util.Calendar calendar29 = dateTime9.getCal();
        int int30 = dateTime9.getDayOfWeek();
        int int31 = dateTime9.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=-62190310331333,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=48,MILLISECOND=667,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-719795L) + "'", long18 == (-719795L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969 + "'", int20 == 1969);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(calendar25);
        org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(calendar27);
        org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1967 + "'", int28 == 1967);
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=-62190310331333,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=48,MILLISECOND=667,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test8620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8620");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(62190310437440L, 897);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               62,190,310,437,440" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               62,190,310,437,440");
    }

    @Test
    public void test8621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8621");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat5 = null;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean14 = dateTime8.isEqual(dateTime13);
        java.util.Calendar calendar15 = dateTime8.getCal();
        boolean boolean16 = dateTime3.isLessThan(dateTime8);
        dateTime3.setFirstWorkDay();
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
        double double24 = dateTime21.getDeltaYears(dateTime23);
        java.text.SimpleDateFormat simpleDateFormat26 = null;
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat26);
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double30 = dateTime27.getDeltaYears(dateTime29);
        boolean boolean31 = dateTime27.isWeekday();
        boolean boolean32 = dateTime21.sameDate(dateTime27);
        boolean boolean33 = dateTime3.sameDate(dateTime21);
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime(100L);
        int int36 = dateTime35.getMs();
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(100L);
        double double43 = dateTime40.getDeltaYears(dateTime42);
        java.text.SimpleDateFormat simpleDateFormat44 = dateTime40.getSdf();
        boolean boolean45 = dateTime35.isLessThanOrEqual(dateTime40);
        boolean boolean46 = dateTime40.isWeekday();
        java.lang.String str47 = dateTime40.toString();
        double double48 = dateTime3.getDeltaYears(dateTime40);
        dateTime40.add(431, 437);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1972.041095890411d) + "'", double24 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1972.041095890411d) + "'", double43 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "10-Apr-0002" + "'", str47, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test8622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8622");
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
        java.lang.String str18 = dateTime15.toString();
        int int19 = dateTime15.getHour();
        dateTime15.add(2020, 2);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("5.00", "     10");
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        double double32 = dateTime29.getDeltaYears(dateTime31);
        int int33 = dateTime29.getHour();
        java.text.SimpleDateFormat simpleDateFormat35 = null;
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat35);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double39 = dateTime36.getDeltaYears(dateTime38);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean44 = dateTime38.isEqual(dateTime43);
        java.util.Calendar calendar45 = dateTime38.getCal();
        dateTime29.set(calendar45);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime(calendar45);
        dateTime25.set(calendar45);
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(100L);
        int int51 = dateTime50.getMs();
        java.lang.String str52 = dateTime50.toString();
        java.lang.String str54 = dateTime50.format("         1");
        net.ajaskey.common.DateTime dateTime55 = dateTime25.copy(dateTime50);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime(dateTime25);
        boolean boolean57 = dateTime15.sameDate(dateTime25);
        java.lang.String str58 = dateTime25.getMonth();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "31-Dec-1969" + "'", str18, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1972.041095890411d) + "'", double32 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(calendar45);
        org.junit.Assert.assertEquals(calendar45.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "31-Dec-1969" + "'", str52, "31-Dec-1969");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "         1" + "'", str54, "         1");
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "December" + "'", str58, "December");
    }

    @Test
    public void test8623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8623");
        java.lang.String[] strArray8 = new java.lang.String[] { "     5.00" };
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDirTree("                                                 100", strArray8);
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDirTree("Sat 04-Jan-0100 17:00:00", strArray8);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("30-Sep-0252", strArray8);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDirTree("Thu 25-Jun-2020 10:43:17", strArray8);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDirTree("                                                                                                                                                                                                                                                                                                                                                                        1,869", strArray8);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDirTree("Thu 25-Jun-2020 10:46:08", strArray8);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("Thu 10-Apr-0002 10:43:22", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(fileList9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
    }

    @Test
    public void test8624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8624");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("                  274", "Thu 25-Jun-2020 10:45:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'T'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8625");
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
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.lang.String str32 = dateTime31.toFullString();
        dateTime31.add(7, 53);
        net.ajaskey.common.DateTime dateTime36 = dateTime1.copy(dateTime31);
        java.lang.String str37 = dateTime36.getDay();
        java.text.SimpleDateFormat simpleDateFormat39 = null;
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat39);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double43 = dateTime40.getDeltaYears(dateTime42);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean48 = dateTime42.isEqual(dateTime47);
        java.util.Calendar calendar49 = dateTime42.getCal();
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(calendar49);
        long long51 = dateTime36.getDeltaMilliSeconds(dateTime50);
        java.util.Calendar calendar52 = dateTime36.getCal();
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime(calendar52);
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime(calendar52);
        int int55 = dateTime54.getHour();
        java.text.SimpleDateFormat simpleDateFormat56 = dateTime54.getSdf();
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
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Thu 10-Apr-0002 10:47:48" + "'", str32, "Thu 10-Apr-0002 10:47:48");
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Thursday" + "'", str37, "Thursday");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(calendar49);
        org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 62190310331254L + "'", long51 == 62190310331254L);
        org.junit.Assert.assertNotNull(calendar52);
// flaky:         org.junit.Assert.assertEquals(calendar52.toString(), "java.util.GregorianCalendar[time=-62190310331254,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=48,MILLISECOND=746,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertNull(simpleDateFormat56);
    }

    @Test
    public void test8626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8626");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("Thu 10-Apr-0002 10:47:04", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Thu 10-Apr-0002 10:47:04 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8627");
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
        int int67 = dateTime6.getHour();
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
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Sat Nov 10 10:47:48 MST 42");
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
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
    }

    @Test
    public void test8628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8628");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        java.text.SimpleDateFormat simpleDateFormat9 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("January", simpleDateFormat8, simpleDateFormat9);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime("Thursday", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(dateTime11);
        boolean boolean13 = dateTime2.isEqual(dateTime11);
        boolean boolean14 = dateTime2.isNull();
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
        double double21 = dateTime18.getDeltaYears(dateTime20);
        java.util.Date date22 = dateTime18.getTime();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(date22);
        net.ajaskey.common.DateTime dateTime26 = dateTime23.parse("31-Dec-1969", "January");
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
        boolean boolean53 = dateTime23.isLessThan(dateTime30);
        java.text.SimpleDateFormat simpleDateFormat54 = dateTime23.getSdf();
        java.lang.String str55 = dateTime23.toFullString();
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime(dateTime23);
        long long57 = dateTime2.getDeltaDays(dateTime23);
        java.text.SimpleDateFormat simpleDateFormat58 = dateTime23.getSdf();
        boolean boolean59 = dateTime23.isNull();
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime(100L);
        int int62 = dateTime61.getMs();
        int int63 = dateTime61.getHour();
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat69 = null;
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat69);
        net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double73 = dateTime70.getDeltaYears(dateTime72);
        boolean boolean74 = dateTime67.isLessThan(dateTime72);
        java.lang.String str75 = dateTime72.toFullString();
        dateTime72.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat80 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat82 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat83 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime84 = new net.ajaskey.common.DateTime("", simpleDateFormat82, simpleDateFormat83);
        net.ajaskey.common.DateTime dateTime85 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat80, simpleDateFormat83);
        boolean boolean86 = dateTime72.isGreaterThan(dateTime85);
        boolean boolean87 = dateTime61.isEqual(dateTime72);
        net.ajaskey.common.DateTime dateTime88 = null;
        net.ajaskey.common.DateTime dateTime89 = new net.ajaskey.common.DateTime(dateTime88);
        dateTime89.set(42, 10, 10);
        java.util.Date date94 = dateTime89.getTime();
        net.ajaskey.common.DateTime dateTime95 = dateTime61.copy(dateTime89);
        int int96 = dateTime23.getYears(dateTime89);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(simpleDateFormat9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1972.041095890411d) + "'", double21 == (-1972.041095890411d));
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Thu Apr 10 10:47:48 MST 2");
        org.junit.Assert.assertNull(dateTime26);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1972.041095890411d) + "'", double33 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(simpleDateFormat46);
        org.junit.Assert.assertNotNull(simpleDateFormat48);
        org.junit.Assert.assertNotNull(simpleDateFormat49);
// flaky:         org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(simpleDateFormat54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Thu 10-Apr-0002 10:47:48" + "'", str55, "Thu 10-Apr-0002 10:47:48");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNull(simpleDateFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str75, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat80);
        org.junit.Assert.assertNotNull(simpleDateFormat82);
        org.junit.Assert.assertNotNull(simpleDateFormat83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(date94);
// flaky:         org.junit.Assert.assertEquals(date94.toString(), "Sat Nov 10 10:47:48 MST 42");
        org.junit.Assert.assertNotNull(dateTime95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 40 + "'", int96 == 40);
    }

    @Test
    public void test8629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8629");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        long long6 = dateTime3.getDeltaDays(dateTime5);
        int int7 = dateTime3.getHour();
        dateTime3.add((int) (byte) 100, (int) (byte) 0);
        java.lang.String str11 = dateTime3.format();
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("January", "100.00");
        int int15 = dateTime14.getDayOfWeek();
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(100L);
        int int18 = dateTime17.getMs();
        boolean boolean19 = dateTime17.isWeekday();
        java.util.Calendar calendar20 = dateTime17.getCal();
        dateTime14.set(calendar20);
        dateTime3.set(calendar20);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(calendar20);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-719795L) + "'", long6 == (-719795L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "BAD-DATE-FORMAT" + "'", str11, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void test8630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8630");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.util.Calendar calendar4 = null;
        dateTime3.set(calendar4);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        double double13 = dateTime10.getDeltaYears(dateTime12);
        int int14 = dateTime10.getHour();
        dateTime10.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat19 = null;
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat19);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double23 = dateTime20.getDeltaYears(dateTime22);
        boolean boolean24 = dateTime10.isEqual(dateTime22);
        java.text.SimpleDateFormat simpleDateFormat26 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat28 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat29 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("", simpleDateFormat28, simpleDateFormat29);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat26, simpleDateFormat29);
        dateTime10.setSdf(simpleDateFormat26);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat39 = null;
        java.text.SimpleDateFormat simpleDateFormat40 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime("January", simpleDateFormat39, simpleDateFormat40);
        java.text.SimpleDateFormat simpleDateFormat44 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime("January", simpleDateFormat44);
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime("", simpleDateFormat44);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime("", simpleDateFormat40, simpleDateFormat44);
        dateTime36.setSdf(simpleDateFormat40);
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime("December", simpleDateFormat26, simpleDateFormat40);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(100L);
        int int52 = dateTime51.getMs();
        java.text.SimpleDateFormat simpleDateFormat53 = net.ajaskey.common.Utils.sdf;
        dateTime51.setSdf(simpleDateFormat53);
        java.lang.String str55 = dateTime51.format();
        boolean boolean56 = dateTime49.isLessThanOrEqual(dateTime51);
        int int57 = dateTime49.getMs();
        long long58 = dateTime3.getDeltaDays(dateTime49);
        java.text.SimpleDateFormat simpleDateFormat62 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat63 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime("", simpleDateFormat62, simpleDateFormat63);
        java.text.SimpleDateFormat simpleDateFormat66 = null;
        java.text.SimpleDateFormat simpleDateFormat67 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime("January", simpleDateFormat66, simpleDateFormat67);
        net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat62, simpleDateFormat67);
        java.text.SimpleDateFormat simpleDateFormat72 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat73 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime74 = new net.ajaskey.common.DateTime("", simpleDateFormat72, simpleDateFormat73);
        net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime(100L);
        int int77 = dateTime76.getMs();
        java.text.SimpleDateFormat simpleDateFormat78 = net.ajaskey.common.Utils.sdf;
        dateTime76.setSdf(simpleDateFormat78);
        net.ajaskey.common.DateTime dateTime80 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat73, simpleDateFormat78);
        net.ajaskey.common.DateTime dateTime81 = new net.ajaskey.common.DateTime("                             100", simpleDateFormat67, simpleDateFormat73);
        dateTime49.setSdf(simpleDateFormat73);
        net.ajaskey.common.DateTime dateTime86 = new net.ajaskey.common.DateTime((int) (byte) 0, 13, 9);
        dateTime86.add(310, 16);
        int int90 = dateTime49.getYears(dateTime86);
        net.ajaskey.common.DateTime dateTime94 = new net.ajaskey.common.DateTime((int) (byte) 100, 161, 15);
        net.ajaskey.common.DateTime dateTime95 = dateTime49.copy(dateTime94);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1972.041095890411d) + "'", double13 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(simpleDateFormat26);
        org.junit.Assert.assertNotNull(simpleDateFormat28);
        org.junit.Assert.assertNotNull(simpleDateFormat29);
        org.junit.Assert.assertNotNull(simpleDateFormat40);
        org.junit.Assert.assertNotNull(simpleDateFormat44);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "31-Dec-1969" + "'", str55, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(simpleDateFormat62);
        org.junit.Assert.assertNotNull(simpleDateFormat63);
        org.junit.Assert.assertNotNull(simpleDateFormat67);
        org.junit.Assert.assertNotNull(simpleDateFormat72);
        org.junit.Assert.assertNotNull(simpleDateFormat73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 100 + "'", int77 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat78);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(dateTime95);
    }

    @Test
    public void test8631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8631");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        int int7 = dateTime3.getHour();
        java.util.Calendar calendar8 = dateTime3.getCal();
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(calendar8);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime(calendar8);
        java.lang.String str11 = dateTime10.getDay();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=-62190310331140,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=48,MILLISECOND=860,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Thursday" + "'", str11, "Thursday");
    }

    @Test
    public void test8632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8632");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("BAD-DATE-FORMAT", "                                                                                               52.00");
        dateTime2.set(43, 5, 238);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        dateTime8.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str13 = dateTime8.getMonth();
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
        dateTime15.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str20 = dateTime15.getMonth();
        int int21 = dateTime15.getMs();
        net.ajaskey.common.DateTime dateTime22 = dateTime8.copy(dateTime15);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(100L);
        int int25 = dateTime24.getMs();
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        double double32 = dateTime29.getDeltaYears(dateTime31);
        java.text.SimpleDateFormat simpleDateFormat33 = dateTime29.getSdf();
        boolean boolean34 = dateTime24.isLessThanOrEqual(dateTime29);
        java.text.SimpleDateFormat simpleDateFormat36 = null;
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat36);
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double40 = dateTime37.getDeltaYears(dateTime39);
        boolean boolean41 = dateTime37.isWeekday();
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long46 = dateTime37.getDeltaDays(dateTime45);
        long long47 = dateTime24.getDeltaDays(dateTime45);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat53 = null;
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat53);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double57 = dateTime54.getDeltaYears(dateTime56);
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean62 = dateTime56.isEqual(dateTime61);
        java.util.Calendar calendar63 = dateTime56.getCal();
        boolean boolean64 = dateTime51.isLessThan(dateTime56);
        boolean boolean65 = net.ajaskey.common.Utils.sameDate(dateTime24, dateTime51);
        boolean boolean66 = dateTime15.isEqual(dateTime24);
        int int67 = dateTime15.getHour();
        int int68 = dateTime2.getYears(dateTime15);
        dateTime15.set(40, (-15), 177);
        int int73 = dateTime15.getMs();
        java.lang.String str74 = dateTime15.format();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "January" + "'", str13, "January");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "January" + "'", str20, "January");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1972.041095890411d) + "'", double32 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 719795L + "'", long47 == 719795L);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(calendar63);
        org.junit.Assert.assertEquals(calendar63.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 5 + "'", int67 == 5);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 55 + "'", int68 == 55);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "BAD-DATE-FORMAT" + "'", str74, "BAD-DATE-FORMAT");
    }

    @Test
    public void test8633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8633");
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
        boolean boolean35 = dateTime12.isGreaterThanOrEqual(dateTime34);
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(100L);
        double double43 = dateTime40.getDeltaYears(dateTime42);
        int int44 = dateTime40.getHour();
        dateTime40.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat49 = null;
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat49);
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double53 = dateTime50.getDeltaYears(dateTime52);
        boolean boolean54 = dateTime40.isEqual(dateTime52);
        java.text.SimpleDateFormat simpleDateFormat56 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat58 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat59 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime("", simpleDateFormat58, simpleDateFormat59);
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat56, simpleDateFormat59);
        dateTime40.setSdf(simpleDateFormat56);
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime("         1", simpleDateFormat56);
        double double64 = dateTime12.getDeltaYears(dateTime63);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1972.041095890411d) + "'", double43 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(simpleDateFormat56);
        org.junit.Assert.assertNotNull(simpleDateFormat58);
        org.junit.Assert.assertNotNull(simpleDateFormat59);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
    }

    @Test
    public void test8634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8634");
        java.lang.String[] strArray7 = new java.lang.String[] { "Invalid fmt", "", "                                                                                               52.00" };
        java.util.List<java.io.File> fileList8 = net.ajaskey.common.Utils.getDirTree("", strArray7);
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDirTree("Thu 10-Apr-0002 10:42:54", strArray7);
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDirTree("  -1.00", strArray7);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("                                                                                                                                                                                                                                                                                                                                                                                                                                                    62,190,310,484,635", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(fileList8);
        org.junit.Assert.assertNull(fileList9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
    }

    @Test
    public void test8635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8635");
        net.ajaskey.common.Utils.makeDir("                                                                                                                                                                                            108");
    }

    @Test
    public void test8636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8636");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) ' ', 1869, (-1960));
        dateTime3.add(1833, (-51));
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        double double13 = dateTime10.getDeltaYears(dateTime12);
        java.util.Date date14 = dateTime10.getTime();
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(date14);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(date14);
        java.text.SimpleDateFormat simpleDateFormat19 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat20 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("", simpleDateFormat19, simpleDateFormat20);
        java.text.SimpleDateFormat simpleDateFormat22 = null;
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("December", simpleDateFormat20, simpleDateFormat22);
        long long24 = dateTime16.getDeltaMilliSeconds(dateTime23);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((-1870), 1969, 1);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("5.00", "     10");
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
        double double38 = dateTime35.getDeltaYears(dateTime37);
        int int39 = dateTime35.getHour();
        java.text.SimpleDateFormat simpleDateFormat41 = null;
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat41);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double45 = dateTime42.getDeltaYears(dateTime44);
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean50 = dateTime44.isEqual(dateTime49);
        java.util.Calendar calendar51 = dateTime44.getCal();
        dateTime35.set(calendar51);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime(calendar51);
        dateTime31.set(calendar51);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime(100L);
        int int57 = dateTime56.getMs();
        java.lang.String str58 = dateTime56.toString();
        java.lang.String str60 = dateTime56.format("         1");
        net.ajaskey.common.DateTime dateTime61 = dateTime31.copy(dateTime56);
        int int62 = dateTime28.getYears(dateTime61);
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime(dateTime28);
        java.util.Date date64 = dateTime63.getTime();
        boolean boolean65 = dateTime23.isGreaterThan(dateTime63);
        boolean boolean66 = dateTime3.isGreaterThanOrEqual(dateTime63);
        java.lang.String str67 = dateTime63.toFullString();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1972.041095890411d) + "'", double13 == (-1972.041095890411d));
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Thu Apr 10 10:47:48 MST 2");
        org.junit.Assert.assertNotNull(simpleDateFormat19);
        org.junit.Assert.assertNotNull(simpleDateFormat20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1972.041095890411d) + "'", double38 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(calendar51);
        org.junit.Assert.assertEquals(calendar51.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "31-Dec-1969" + "'", str58, "31-Dec-1969");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "         1" + "'", str60, "         1");
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 262 + "'", int62 == 262);
        org.junit.Assert.assertNotNull(date64);
// flaky:         org.junit.Assert.assertEquals(date64.toString(), "Wed Feb 01 10:47:48 MST 1707");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Wed 01-Feb-1707 10:47:48" + "'", str67, "Wed 01-Feb-1707 10:47:48");
    }

    @Test
    public void test8637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8637");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:43:10", "   8.00");
        java.text.SimpleDateFormat simpleDateFormat4 = null;
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat4);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double8 = dateTime5.getDeltaYears(dateTime7);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean13 = dateTime7.isEqual(dateTime12);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
        int int16 = dateTime15.getMs();
        boolean boolean17 = dateTime12.isGreaterThanOrEqual(dateTime15);
        java.text.SimpleDateFormat simpleDateFormat19 = null;
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat19);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double23 = dateTime20.getDeltaYears(dateTime22);
        boolean boolean24 = dateTime20.isWeekday();
        boolean boolean25 = dateTime15.isLessThanOrEqual(dateTime20);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(100L);
        dateTime27.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean32 = dateTime27.isWeekday();
        boolean boolean33 = dateTime15.isGreaterThanOrEqual(dateTime27);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean38 = dateTime15.isGreaterThanOrEqual(dateTime37);
        int int39 = dateTime2.getYears(dateTime15);
        java.text.SimpleDateFormat simpleDateFormat42 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("January", simpleDateFormat42);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime("", simpleDateFormat42);
        dateTime44.setFirstWorkDay();
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat51 = null;
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat51);
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double55 = dateTime52.getDeltaYears(dateTime54);
        boolean boolean56 = dateTime49.isLessThan(dateTime54);
        java.lang.String str57 = dateTime54.toFullString();
        dateTime54.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat62 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat64 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat65 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime("", simpleDateFormat64, simpleDateFormat65);
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat62, simpleDateFormat65);
        boolean boolean68 = dateTime54.isGreaterThan(dateTime67);
        java.text.SimpleDateFormat simpleDateFormat70 = null;
        net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat70);
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double74 = dateTime71.getDeltaYears(dateTime73);
        boolean boolean75 = dateTime71.isWeekday();
        net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long80 = dateTime71.getDeltaDays(dateTime79);
        net.ajaskey.common.DateTime dateTime81 = new net.ajaskey.common.DateTime(dateTime71);
        boolean boolean82 = dateTime67.sameDate(dateTime71);
        boolean boolean83 = dateTime44.isGreaterThan(dateTime71);
        java.lang.String str84 = dateTime71.toFullString();
        net.ajaskey.common.DateTime dateTime86 = new net.ajaskey.common.DateTime(100L);
        int int87 = dateTime86.getMs();
        boolean boolean88 = dateTime86.isNull();
        java.util.Calendar calendar89 = dateTime86.getCal();
        net.ajaskey.common.DateTime dateTime90 = new net.ajaskey.common.DateTime(calendar89);
        net.ajaskey.common.DateTime dateTime91 = dateTime71.copy(dateTime90);
        boolean boolean92 = dateTime15.isLessThan(dateTime71);
        java.lang.String str93 = dateTime15.toString();
        java.lang.String str94 = dateTime15.getMonth();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(simpleDateFormat42);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str57, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat62);
        org.junit.Assert.assertNotNull(simpleDateFormat64);
        org.junit.Assert.assertNotNull(simpleDateFormat65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Invalid Time" + "'", str84, "Invalid Time");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 100 + "'", int87 == 100);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(calendar89);
        org.junit.Assert.assertEquals(calendar89.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "31-Dec-1969" + "'", str93, "31-Dec-1969");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "December" + "'", str94, "December");
    }

    @Test
    public void test8638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8638");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("", "");
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime(100L);
        dateTime4.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str9 = dateTime4.getMonth();
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        dateTime11.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str16 = dateTime11.getMonth();
        int int17 = dateTime11.getMs();
        net.ajaskey.common.DateTime dateTime18 = dateTime4.copy(dateTime11);
        boolean boolean19 = dateTime4.isWeekday();
        java.lang.String str20 = dateTime4.format();
        boolean boolean21 = net.ajaskey.common.Utils.sameMonth(dateTime2, dateTime4);
        int int22 = dateTime2.getSecond();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "January" + "'", str9, "January");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "January" + "'", str16, "January");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "BAD-DATE-FORMAT" + "'", str20, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test8639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8639");
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
        dateTime21.add(14, 2020);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(100L);
        double double31 = dateTime28.getDeltaYears(dateTime30);
        boolean boolean32 = dateTime30.isWeekday();
        java.util.Date date33 = dateTime30.getTime();
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(date33);
        java.text.SimpleDateFormat simpleDateFormat36 = null;
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat36);
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double40 = dateTime37.getDeltaYears(dateTime39);
        boolean boolean41 = dateTime37.isWeekday();
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long46 = dateTime37.getDeltaDays(dateTime45);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime(dateTime37);
        boolean boolean48 = dateTime34.isGreaterThan(dateTime37);
        java.lang.String str49 = dateTime37.getMonth();
        boolean boolean50 = dateTime21.sameDate(dateTime37);
        int int51 = dateTime21.getHour();
        java.lang.String str52 = dateTime21.toFullString();
        dateTime21.setFirstWorkDay();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1972.041095890411d) + "'", double31 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UNKNOWN" + "'", str49, "UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str52, "Wed 31-Dec-1969 17:00:00");
    }

    @Test
    public void test8640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8640");
        net.ajaskey.common.Utils.makeDir("                                                 153");
    }

    @Test
    public void test8641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8641");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     78", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      78 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8642");
        net.ajaskey.common.Utils.NL = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           31";
    }

    @Test
    public void test8643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8643");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8644");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  7", "                                                                                                                                                                                                                                                                                                                                                            10");
        java.lang.Class<?> wildcardClass3 = dateTime2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test8645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8645");
        net.ajaskey.common.Utils.TAB = "                                                                                                                                                                                                                                                       1,924";
    }

    @Test
    public void test8646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8646");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        dateTime1.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str6 = dateTime1.getMonth();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        dateTime8.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str13 = dateTime8.getMonth();
        int int14 = dateTime8.getMs();
        net.ajaskey.common.DateTime dateTime15 = dateTime1.copy(dateTime8);
        int int16 = dateTime8.getSecond();
        java.util.Date date17 = null;
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(date17);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(100L);
        double double25 = dateTime22.getDeltaYears(dateTime24);
        int int26 = dateTime22.getHour();
        java.text.SimpleDateFormat simpleDateFormat28 = null;
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat28);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double32 = dateTime29.getDeltaYears(dateTime31);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean37 = dateTime31.isEqual(dateTime36);
        java.util.Calendar calendar38 = dateTime31.getCal();
        dateTime22.set(calendar38);
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime(calendar38);
        net.ajaskey.common.DateTime dateTime41 = dateTime18.copy(dateTime40);
        boolean boolean42 = dateTime8.isLessThan(dateTime40);
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat48 = null;
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat48);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double52 = dateTime49.getDeltaYears(dateTime51);
        boolean boolean53 = dateTime46.isLessThan(dateTime51);
        java.text.SimpleDateFormat simpleDateFormat55 = null;
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat55);
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double59 = dateTime56.getDeltaYears(dateTime58);
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean64 = dateTime58.isEqual(dateTime63);
        net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime(100L);
        int int67 = dateTime66.getMs();
        boolean boolean68 = dateTime63.isGreaterThanOrEqual(dateTime66);
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime(100L);
        dateTime70.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime80 = new net.ajaskey.common.DateTime(100L);
        double double81 = dateTime78.getDeltaYears(dateTime80);
        boolean boolean82 = dateTime80.isWeekday();
        java.util.Date date83 = dateTime80.getTime();
        dateTime70.set(dateTime80);
        boolean boolean85 = net.ajaskey.common.Utils.sameDate(dateTime63, dateTime70);
        boolean boolean86 = dateTime63.isNull();
        double double87 = dateTime51.getDeltaYears(dateTime63);
        net.ajaskey.common.DateTime dateTime88 = null;
        net.ajaskey.common.DateTime dateTime89 = dateTime51.copy(dateTime88);
        int int90 = dateTime8.getYears(dateTime88);
        java.lang.String str92 = dateTime8.format("");
        int int93 = dateTime8.getDayOfYear();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "January" + "'", str13, "January");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1972.041095890411d) + "'", double25 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1972.041095890411d) + "'", double81 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1972.041095890411d + "'", double87 == 1972.041095890411d);
        org.junit.Assert.assertNull(dateTime89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 4 + "'", int93 == 4);
    }

    @Test
    public void test8647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8647");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        java.util.Calendar calendar11 = dateTime4.getCal();
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(1, (int) '4', 5);
        double double16 = dateTime4.getDeltaYears(dateTime15);
        java.lang.String str17 = dateTime15.format();
        net.ajaskey.common.DateTime dateTime20 = dateTime15.parse("Mon 06-Jan-0100 17:00:00", "JanuaryInvalid fmtInvalid fmt                                                                                               52.00Invalid fmthi!Invalid fmt");
        net.ajaskey.common.DateTime dateTime22 = dateTime15.parse("                                                                            62,190,310,590,917");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1965.9671232876713d + "'", double16 == 1965.9671232876713d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "BAD-DATE-FORMAT" + "'", str17, "BAD-DATE-FORMAT");
        org.junit.Assert.assertNull(dateTime20);
        org.junit.Assert.assertNull(dateTime22);
    }

    @Test
    public void test8648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8648");
        net.ajaskey.common.Utils.makeDir("Thu 10-Apr-0002 10:45:52");
    }

    @Test
    public void test8649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8649");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        dateTime1.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str6 = dateTime1.getMonth();
        int int7 = dateTime1.getMs();
        java.lang.String str9 = dateTime1.format("                                                                                               52.00");
        int int10 = dateTime1.getDayOfMonth();
        java.lang.String str12 = dateTime1.format(" 9");
        int int13 = dateTime1.getHour();
        java.text.SimpleDateFormat simpleDateFormat15 = null;
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat15);
        java.util.Calendar calendar17 = dateTime16.getCal();
        dateTime16.add(32, 286);
        boolean boolean21 = dateTime1.isLessThan(dateTime16);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(62190310610986L);
        boolean boolean24 = dateTime1.isGreaterThan(dateTime23);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.lang.String str29 = dateTime28.toFullString();
        int int30 = dateTime28.getHour();
        java.lang.String str31 = dateTime28.getDay();
        java.lang.String str32 = dateTime28.format();
        java.lang.String str34 = dateTime28.format("Thu 10-Apr-0002 10:46:33");
        boolean boolean35 = net.ajaskey.common.Utils.sameMonth(dateTime23, dateTime28);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "January" + "'", str6, "January");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                               52.00" + "'", str9, "                                                                                               52.00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " 9" + "'", str12, " 9");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNull(calendar17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Thu 10-Apr-0002 10:47:49" + "'", str29, "Thu 10-Apr-0002 10:47:49");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Thursday" + "'", str31, "Thursday");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "BAD-DATE-FORMAT" + "'", str32, "BAD-DATE-FORMAT");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "BAD-DATE-FORMAT" + "'", str34, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test8650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8650");
        java.text.SimpleDateFormat simpleDateFormat1 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime("", simpleDateFormat3, simpleDateFormat4);
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat1, simpleDateFormat4);
        int int7 = dateTime6.getYear();
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((long) (byte) 100);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        java.util.Calendar calendar12 = dateTime11.getCal();
        java.text.SimpleDateFormat simpleDateFormat14 = null;
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat14);
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double18 = dateTime15.getDeltaYears(dateTime17);
        boolean boolean19 = dateTime15.isWeekday();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long24 = dateTime15.getDeltaDays(dateTime23);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(dateTime15);
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        double double32 = dateTime29.getDeltaYears(dateTime31);
        boolean boolean33 = dateTime31.isWeekday();
        java.util.Date date34 = dateTime31.getTime();
        dateTime15.set(date34);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
        int int38 = dateTime37.getMs();
        java.lang.String str39 = dateTime37.toString();
        boolean boolean40 = dateTime15.isLessThanOrEqual(dateTime37);
        net.ajaskey.common.DateTime dateTime43 = dateTime15.parse("", "100.00");
        dateTime15.add((int) (short) 0, (int) (short) -1);
        double double47 = dateTime11.getDeltaYears(dateTime15);
        double double48 = dateTime9.getDeltaYears(dateTime15);
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime(100L);
        double double55 = dateTime52.getDeltaYears(dateTime54);
        int int56 = dateTime52.getHour();
        dateTime52.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat61 = null;
        net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat61);
        net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double65 = dateTime62.getDeltaYears(dateTime64);
        boolean boolean66 = dateTime52.isEqual(dateTime64);
        boolean boolean67 = dateTime9.isLessThan(dateTime52);
        java.util.Calendar calendar68 = dateTime9.getCal();
        dateTime6.set(calendar68);
        org.junit.Assert.assertNotNull(simpleDateFormat1);
        org.junit.Assert.assertNotNull(simpleDateFormat3);
        org.junit.Assert.assertNotNull(simpleDateFormat4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1972.041095890411d) + "'", double32 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "31-Dec-1969" + "'", str39, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(dateTime43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1972.041095890411d) + "'", double55 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(calendar68);
        org.junit.Assert.assertEquals(calendar68.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void test8651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8651");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 321);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8652");
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
        java.lang.String str52 = dateTime49.toString();
        boolean boolean53 = dateTime49.isNull();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test8653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8653");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(98, (-51), 59);
        boolean boolean4 = dateTime3.isNull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test8654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8654");
        net.ajaskey.common.DateTime dateTime0 = null;
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(dateTime0);
        dateTime1.set(42, 10, 10);
        java.util.Date date6 = dateTime1.getTime();
        int int7 = dateTime1.getSecond();
        dateTime1.setFirstWorkDay();
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime((int) (byte) 10, (int) (byte) 0, 2);
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(dateTime12);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime("        10", "         1");
        boolean boolean17 = dateTime12.sameDate(dateTime16);
        int int18 = dateTime16.getDayOfYear();
        java.text.SimpleDateFormat simpleDateFormat20 = null;
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat20);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double24 = dateTime21.getDeltaYears(dateTime23);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean29 = dateTime23.isEqual(dateTime28);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        int int32 = dateTime31.getMs();
        boolean boolean33 = dateTime28.isGreaterThanOrEqual(dateTime31);
        java.text.SimpleDateFormat simpleDateFormat35 = null;
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat35);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double39 = dateTime36.getDeltaYears(dateTime38);
        boolean boolean40 = dateTime36.isWeekday();
        boolean boolean41 = dateTime31.isLessThanOrEqual(dateTime36);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(100L);
        dateTime43.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean48 = dateTime43.isWeekday();
        boolean boolean49 = dateTime31.isGreaterThanOrEqual(dateTime43);
        java.lang.String str50 = dateTime31.toFullString();
        java.text.SimpleDateFormat simpleDateFormat52 = null;
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat52);
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double56 = dateTime53.getDeltaYears(dateTime55);
        boolean boolean57 = dateTime53.isWeekday();
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long62 = dateTime53.getDeltaDays(dateTime61);
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime(dateTime53);
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime(100L);
        double double70 = dateTime67.getDeltaYears(dateTime69);
        boolean boolean71 = dateTime69.isWeekday();
        java.util.Date date72 = dateTime69.getTime();
        dateTime53.set(date72);
        dateTime31.set(date72);
        dateTime16.set(dateTime31);
        int int76 = dateTime31.getDayOfWeek();
        java.util.Date date77 = dateTime31.getTime();
        long long78 = dateTime1.getDeltaDays(dateTime31);
        net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime(dateTime1);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 10 10:47:49 MST 42");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str50, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1972.041095890411d) + "'", double70 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 4 + "'", int76 == 4);
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-703873L) + "'", long78 == (-703873L));
    }

    @Test
    public void test8655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8655");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        dateTime3.add(2, 12);
        java.util.Date date7 = dateTime3.getTime();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(date7);
        java.text.SimpleDateFormat simpleDateFormat10 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat11 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("", simpleDateFormat10, simpleDateFormat11);
        dateTime8.setSdf(simpleDateFormat10);
        java.text.SimpleDateFormat simpleDateFormat16 = null;
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double20 = dateTime17.getDeltaYears(dateTime19);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean25 = dateTime19.isEqual(dateTime24);
        java.util.Calendar calendar26 = dateTime19.getCal();
        java.lang.String str27 = dateTime19.format();
        net.ajaskey.common.DateTime dateTime28 = null;
        long long29 = dateTime19.getDeltaDays(dateTime28);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime(100L);
        int int32 = dateTime31.getMs();
        java.lang.String str33 = dateTime31.toString();
        java.util.Date date34 = dateTime31.getTime();
        boolean boolean35 = net.ajaskey.common.Utils.sameDate(dateTime28, dateTime31);
        java.text.SimpleDateFormat simpleDateFormat36 = dateTime31.getSdf();
        java.text.SimpleDateFormat simpleDateFormat42 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat43 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime("", simpleDateFormat42, simpleDateFormat43);
        java.text.SimpleDateFormat simpleDateFormat46 = null;
        java.text.SimpleDateFormat simpleDateFormat47 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime("January", simpleDateFormat46, simpleDateFormat47);
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat42, simpleDateFormat47);
        java.text.SimpleDateFormat simpleDateFormat52 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat53 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime("", simpleDateFormat52, simpleDateFormat53);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime(100L);
        int int57 = dateTime56.getMs();
        java.text.SimpleDateFormat simpleDateFormat58 = net.ajaskey.common.Utils.sdf;
        dateTime56.setSdf(simpleDateFormat58);
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat53, simpleDateFormat58);
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime("                             100", simpleDateFormat47, simpleDateFormat53);
        java.text.SimpleDateFormat simpleDateFormat64 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat65 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime("", simpleDateFormat64, simpleDateFormat65);
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:54", simpleDateFormat64);
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime("5.00", simpleDateFormat47, simpleDateFormat64);
        java.text.SimpleDateFormat simpleDateFormat69 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat47, simpleDateFormat69);
        net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime("  53", simpleDateFormat36, simpleDateFormat47);
        boolean boolean72 = dateTime8.isEqual(dateTime71);
        boolean boolean73 = dateTime8.isNull();
        net.ajaskey.common.DateTime dateTime75 = new net.ajaskey.common.DateTime(100L);
        int int76 = dateTime75.getMs();
        boolean boolean77 = dateTime75.isWeekday();
        int int78 = dateTime75.getHour();
        dateTime75.setFirstWorkDay();
        java.lang.String str80 = dateTime75.format();
        net.ajaskey.common.DateTime dateTime82 = new net.ajaskey.common.DateTime(62190310608217L);
        boolean boolean83 = dateTime75.isGreaterThanOrEqual(dateTime82);
        net.ajaskey.common.DateTime dateTime85 = dateTime75.parse("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean86 = dateTime8.sameDate(dateTime85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Sat Apr 10 10:47:49 MST 1");
        org.junit.Assert.assertNotNull(simpleDateFormat10);
        org.junit.Assert.assertNotNull(simpleDateFormat11);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(calendar26);
        org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "BAD-DATE-FORMAT" + "'", str27, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "31-Dec-1969" + "'", str33, "31-Dec-1969");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(simpleDateFormat36);
        org.junit.Assert.assertNotNull(simpleDateFormat42);
        org.junit.Assert.assertNotNull(simpleDateFormat43);
        org.junit.Assert.assertNotNull(simpleDateFormat47);
        org.junit.Assert.assertNotNull(simpleDateFormat52);
        org.junit.Assert.assertNotNull(simpleDateFormat53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat58);
        org.junit.Assert.assertNotNull(simpleDateFormat64);
        org.junit.Assert.assertNotNull(simpleDateFormat65);
        org.junit.Assert.assertNotNull(simpleDateFormat69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 5 + "'", int78 == 5);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "BAD-DATE-FORMAT" + "'", str80, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(dateTime85);
    }

    @Test
    public void test8656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8656");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(25, 17, 1869);
        java.util.Calendar calendar4 = null;
        dateTime3.set(calendar4);
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime(dateTime3);
        int int7 = dateTime6.getSecond();
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
    }

    @Test
    public void test8657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8657");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        java.util.Calendar calendar3 = dateTime2.getCal();
        int int4 = dateTime2.getDayOfWeek();
        java.lang.String str5 = dateTime2.toFullString();
        boolean boolean6 = dateTime2.isNull();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 1);
        double double9 = dateTime2.getDeltaYears(dateTime8);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("5.00", "     10");
        dateTime12.add((int) (short) 0, (int) 'a');
        int int16 = dateTime12.getDayOfMonth();
        int int17 = dateTime12.getDayOfWeek();
        java.text.SimpleDateFormat simpleDateFormat19 = null;
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat19);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double23 = dateTime20.getDeltaYears(dateTime22);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean28 = dateTime22.isEqual(dateTime27);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(100L);
        int int31 = dateTime30.getMs();
        boolean boolean32 = dateTime27.isGreaterThanOrEqual(dateTime30);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(100L);
        dateTime34.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(100L);
        double double45 = dateTime42.getDeltaYears(dateTime44);
        boolean boolean46 = dateTime44.isWeekday();
        java.util.Date date47 = dateTime44.getTime();
        dateTime34.set(dateTime44);
        boolean boolean49 = net.ajaskey.common.Utils.sameDate(dateTime27, dateTime34);
        java.lang.String str51 = dateTime34.format("                             100");
        int int52 = dateTime34.getDayOfWeek();
        java.lang.String str53 = dateTime34.getDay();
        net.ajaskey.common.DateTime dateTime54 = dateTime12.copy(dateTime34);
        long long55 = dateTime2.getDeltaMilliSeconds(dateTime12);
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime(100L);
        boolean boolean58 = dateTime57.isWeekday();
        dateTime57.setFirstWorkDay();
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime(100L);
        dateTime61.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str66 = dateTime61.getMonth();
        boolean boolean67 = dateTime57.isLessThan(dateTime61);
        java.util.Date date68 = dateTime61.getTime();
        net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime(date68);
        net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime(100L);
        int int72 = dateTime71.getMs();
        net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime(100L);
        double double79 = dateTime76.getDeltaYears(dateTime78);
        java.text.SimpleDateFormat simpleDateFormat80 = dateTime76.getSdf();
        boolean boolean81 = dateTime71.isLessThanOrEqual(dateTime76);
        java.text.SimpleDateFormat simpleDateFormat83 = null;
        net.ajaskey.common.DateTime dateTime84 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat83);
        net.ajaskey.common.DateTime dateTime86 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double87 = dateTime84.getDeltaYears(dateTime86);
        boolean boolean88 = dateTime84.isWeekday();
        net.ajaskey.common.DateTime dateTime92 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long93 = dateTime84.getDeltaDays(dateTime92);
        long long94 = dateTime71.getDeltaDays(dateTime92);
        boolean boolean95 = dateTime71.isWeekday();
        boolean boolean96 = dateTime69.isLessThanOrEqual(dateTime71);
        boolean boolean97 = dateTime2.isLessThanOrEqual(dateTime69);
        org.junit.Assert.assertNull(calendar3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Invalid Time" + "'", str5, "Invalid Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1972.041095890411d) + "'", double45 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "                             100" + "'", str51, "                             100");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Wednesday" + "'", str53, "Wednesday");
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "January" + "'", str66, "January");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Sat Jan 04 17:00:00 MST 100");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1972.041095890411d) + "'", double79 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 719795L + "'", long94 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test8658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8658");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((-59011286399900L));
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime(100L);
        int int5 = dateTime4.getMs();
        java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
        dateTime4.setSdf(simpleDateFormat6);
        java.text.SimpleDateFormat simpleDateFormat8 = net.ajaskey.common.Utils.sdfFull;
        dateTime4.setSdf(simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("Mon 10-Apr-0002 00:00:00", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        boolean boolean18 = dateTime16.isWeekday();
        java.lang.String str20 = dateTime16.format("hi!");
        long long21 = dateTime10.getDeltaMilliSeconds(dateTime16);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(100L);
        double double28 = dateTime25.getDeltaYears(dateTime27);
        java.text.SimpleDateFormat simpleDateFormat29 = dateTime25.getSdf();
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("5.00", "     10");
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("5.00", "     10");
        dateTime35.add((int) (short) 0, (int) 'a');
        int int39 = dateTime35.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime(100L);
        int int42 = dateTime41.getMs();
        int int43 = dateTime41.getHour();
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat49 = null;
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat49);
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double53 = dateTime50.getDeltaYears(dateTime52);
        boolean boolean54 = dateTime47.isLessThan(dateTime52);
        java.lang.String str55 = dateTime52.toFullString();
        dateTime52.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat60 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat62 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat63 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime("", simpleDateFormat62, simpleDateFormat63);
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat60, simpleDateFormat63);
        boolean boolean66 = dateTime52.isGreaterThan(dateTime65);
        boolean boolean67 = dateTime41.isEqual(dateTime52);
        net.ajaskey.common.DateTime dateTime68 = null;
        net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime(dateTime68);
        dateTime69.set(42, 10, 10);
        java.util.Date date74 = dateTime69.getTime();
        net.ajaskey.common.DateTime dateTime75 = dateTime41.copy(dateTime69);
        net.ajaskey.common.DateTime dateTime76 = dateTime35.copy(dateTime41);
        boolean boolean77 = net.ajaskey.common.Utils.sameMonth(dateTime32, dateTime76);
        dateTime25.set(dateTime76);
        int int79 = dateTime76.getYear();
        boolean boolean80 = dateTime10.sameDate(dateTime76);
        dateTime1.set(dateTime76);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat6);
        org.junit.Assert.assertNotNull(simpleDateFormat8);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1972.041095890411d) + "'", double17 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "BAD-DATE-FORMAT" + "'", str20, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 62095654800100L + "'", long21 == 62095654800100L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1972.041095890411d) + "'", double28 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat29);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str55, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat60);
        org.junit.Assert.assertNotNull(simpleDateFormat62);
        org.junit.Assert.assertNotNull(simpleDateFormat63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(date74);
// flaky:         org.junit.Assert.assertEquals(date74.toString(), "Sat Nov 10 10:47:49 MST 42");
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1969 + "'", int79 == 1969);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test8659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8659");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = dateTime4.isEqual(dateTime9);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        int int13 = dateTime12.getMs();
        boolean boolean14 = dateTime9.isGreaterThanOrEqual(dateTime12);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
        dateTime16.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        double double27 = dateTime24.getDeltaYears(dateTime26);
        boolean boolean28 = dateTime26.isWeekday();
        java.util.Date date29 = dateTime26.getTime();
        dateTime16.set(dateTime26);
        boolean boolean31 = net.ajaskey.common.Utils.sameDate(dateTime9, dateTime16);
        java.lang.String str33 = dateTime16.format("                             100");
        int int34 = dateTime16.getDayOfWeek();
        int int35 = dateTime16.getMinute();
        java.util.Calendar calendar36 = dateTime16.getCal();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1972.041095890411d) + "'", double27 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "                             100" + "'", str33, "                             100");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(calendar36);
        org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void test8660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8660");
        net.ajaskey.common.TextUtils.printline("                                                                                                                                                                                                                                                                                                                   719,795");
    }

    @Test
    public void test8661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8661");
        java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat5 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("", simpleDateFormat4, simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat2, simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat14 = null;
        java.text.SimpleDateFormat simpleDateFormat15 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime("January", simpleDateFormat14, simpleDateFormat15);
        java.text.SimpleDateFormat simpleDateFormat19 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("January", simpleDateFormat19);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("", simpleDateFormat19);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("", simpleDateFormat15, simpleDateFormat19);
        dateTime11.setSdf(simpleDateFormat15);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("", simpleDateFormat5, simpleDateFormat15);
        java.lang.String str26 = dateTime24.format("25-Jun-2020");
        int int27 = dateTime24.getDayOfWeek();
        java.lang.String str28 = dateTime24.toString();
        boolean boolean29 = dateTime24.isWeekday();
        org.junit.Assert.assertNotNull(simpleDateFormat2);
        org.junit.Assert.assertNotNull(simpleDateFormat4);
        org.junit.Assert.assertNotNull(simpleDateFormat5);
        org.junit.Assert.assertNotNull(simpleDateFormat15);
        org.junit.Assert.assertNotNull(simpleDateFormat19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "BAD-DATE-FORMAT" + "'", str26, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test8662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8662");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (-98));
        java.lang.String str2 = dateTime1.getMonth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "December" + "'", str2, "December");
    }

    @Test
    public void test8663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8663");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat5 = null;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        boolean boolean10 = dateTime3.isLessThan(dateTime8);
        java.lang.String str11 = dateTime8.toFullString();
        int int12 = dateTime8.getSecond();
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(dateTime8);
        dateTime13.add(47, 378);
        int int17 = dateTime13.getSecond();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str11, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test8664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8664");
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
        int int43 = dateTime28.getDayOfWeek();
        dateTime28.add((int) (byte) -1, 9);
        java.lang.String str47 = dateTime28.getMonth();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "April" + "'", str47, "April");
    }

    @Test
    public void test8665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8665");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        double double13 = dateTime10.getDeltaYears(dateTime12);
        int int14 = dateTime10.getHour();
        int int15 = dateTime10.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        double double22 = dateTime19.getDeltaYears(dateTime21);
        boolean boolean23 = dateTime21.isWeekday();
        boolean boolean24 = net.ajaskey.common.Utils.sameDate(dateTime10, dateTime21);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        dateTime26.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime(100L);
        double double37 = dateTime34.getDeltaYears(dateTime36);
        boolean boolean38 = dateTime36.isWeekday();
        java.util.Date date39 = dateTime36.getTime();
        dateTime26.set(dateTime36);
        int int41 = dateTime26.getYear();
        boolean boolean42 = dateTime21.isGreaterThanOrEqual(dateTime26);
        boolean boolean43 = dateTime3.sameDate(dateTime21);
        boolean boolean44 = dateTime21.isWeekday();
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime(858, (-1928), 33);
        boolean boolean49 = net.ajaskey.common.Utils.sameMonth(dateTime21, dateTime48);
        boolean boolean50 = dateTime21.isWeekday();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1972.041095890411d) + "'", double13 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1972.041095890411d) + "'", double22 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1972.041095890411d) + "'", double37 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1969 + "'", int41 == 1969);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test8666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8666");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(39, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8667");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        java.lang.String str3 = dateTime1.toString();
        java.util.Date date4 = dateTime1.getTime();
        int int5 = dateTime1.getDayOfYear();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime("          264", "                             100");
        double double9 = dateTime1.getDeltaYears(dateTime8);
        boolean boolean10 = dateTime1.isWeekday();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31-Dec-1969" + "'", str3, "31-Dec-1969");
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test8668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8668");
        net.ajaskey.common.TextUtils.printline("          -1,593,103,388,831");
    }

    @Test
    public void test8669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8669");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(62190310608217L);
        int int2 = dateTime1.getDayOfWeek();
        int int3 = dateTime1.getMs();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
    }

    @Test
    public void test8670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8670");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.text.SimpleDateFormat simpleDateFormat8 = null;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime9.isWeekday();
        boolean boolean14 = dateTime3.sameDate(dateTime9);
        int int15 = dateTime3.getSecond();
        int int16 = dateTime3.getDayOfYear();
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(719528L);
        boolean boolean19 = dateTime3.isGreaterThan(dateTime18);
        boolean boolean20 = dateTime18.isNull();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8671");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("", "                    25");
        dateTime2.add(569, (-2005));
        boolean boolean6 = dateTime2.isNull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test8672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8672");
        java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat5 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("", simpleDateFormat5, simpleDateFormat6);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat3, simpleDateFormat6);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("10-Apr-0002", simpleDateFormat6);
        java.text.SimpleDateFormat simpleDateFormat12 = null;
        java.text.SimpleDateFormat simpleDateFormat13 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("January", simpleDateFormat12, simpleDateFormat13);
        java.text.SimpleDateFormat simpleDateFormat17 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime("January", simpleDateFormat17);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("", simpleDateFormat17);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("", simpleDateFormat13, simpleDateFormat17);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("January                                                                                               52.00                                                                                               52.00                                                                                               52.00                                                                                               52.00hi!                                                                                               52.00", simpleDateFormat6, simpleDateFormat17);
        java.lang.String str22 = dateTime21.toFullString();
        java.lang.String str24 = dateTime21.format("Thu 10-Apr-0002 10:43:37");
        int int25 = dateTime21.getDayOfYear();
        org.junit.Assert.assertNotNull(simpleDateFormat3);
        org.junit.Assert.assertNotNull(simpleDateFormat5);
        org.junit.Assert.assertNotNull(simpleDateFormat6);
        org.junit.Assert.assertNotNull(simpleDateFormat13);
        org.junit.Assert.assertNotNull(simpleDateFormat17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Invalid Time" + "'", str22, "Invalid Time");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "BAD-DATE-FORMAT" + "'", str24, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test8673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8673");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Wednesday", "Wed 12-Apr-0139 10:45:23");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'e'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8674");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:43:37", "   -18,438");
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime("10-Apr-0002", "    0");
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        dateTime11.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str16 = dateTime11.getMonth();
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
        dateTime18.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str23 = dateTime18.getMonth();
        int int24 = dateTime18.getMs();
        net.ajaskey.common.DateTime dateTime25 = dateTime11.copy(dateTime18);
        dateTime9.set(dateTime11);
        dateTime9.setFirstWorkDay();
        boolean boolean28 = net.ajaskey.common.Utils.sameMonth(dateTime5, dateTime9);
        java.lang.String str29 = dateTime9.getDay();
        java.text.SimpleDateFormat simpleDateFormat31 = null;
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat31);
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double35 = dateTime32.getDeltaYears(dateTime34);
        boolean boolean36 = dateTime32.isWeekday();
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long41 = dateTime32.getDeltaDays(dateTime40);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime(dateTime32);
        dateTime42.setFirstWorkDay();
        java.util.Date date44 = dateTime42.getTime();
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(date44);
        dateTime9.set(date44);
        dateTime2.set(date44);
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime(date44);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "January" + "'", str16, "January");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "January" + "'", str23, "January");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Monday" + "'", str29, "Monday");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Thu Jun 25 10:47:49 MDT 2020");
    }

    @Test
    public void test8675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8675");
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        int int6 = dateTime5.getMs();
        java.text.SimpleDateFormat simpleDateFormat7 = net.ajaskey.common.Utils.sdf;
        dateTime5.setSdf(simpleDateFormat7);
        java.text.SimpleDateFormat simpleDateFormat11 = null;
        java.text.SimpleDateFormat simpleDateFormat12 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("January", simpleDateFormat11, simpleDateFormat12);
        java.text.SimpleDateFormat simpleDateFormat16 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime("January", simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime("", simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("", simpleDateFormat12, simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("Thursday", simpleDateFormat7, simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
        int int24 = dateTime23.getMs();
        java.text.SimpleDateFormat simpleDateFormat25 = net.ajaskey.common.Utils.sdf;
        dateTime23.setSdf(simpleDateFormat25);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat25);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime("           6", simpleDateFormat16, simpleDateFormat25);
        java.text.SimpleDateFormat simpleDateFormat33 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat34 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("", simpleDateFormat33, simpleDateFormat34);
        java.text.SimpleDateFormat simpleDateFormat37 = null;
        java.text.SimpleDateFormat simpleDateFormat38 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime("January", simpleDateFormat37, simpleDateFormat38);
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat33, simpleDateFormat38);
        java.text.SimpleDateFormat simpleDateFormat43 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat44 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime("", simpleDateFormat43, simpleDateFormat44);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime(100L);
        int int48 = dateTime47.getMs();
        java.text.SimpleDateFormat simpleDateFormat49 = net.ajaskey.common.Utils.sdf;
        dateTime47.setSdf(simpleDateFormat49);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat44, simpleDateFormat49);
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime("                             100", simpleDateFormat38, simpleDateFormat44);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime("  53", simpleDateFormat44);
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime(" 9", simpleDateFormat16, simpleDateFormat44);
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:44:34", simpleDateFormat16);
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime((-44), 28, 933);
        long long60 = dateTime55.getDeltaDays(dateTime59);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat7);
        org.junit.Assert.assertNotNull(simpleDateFormat12);
        org.junit.Assert.assertNotNull(simpleDateFormat16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat25);
        org.junit.Assert.assertNotNull(simpleDateFormat33);
        org.junit.Assert.assertNotNull(simpleDateFormat34);
        org.junit.Assert.assertNotNull(simpleDateFormat38);
        org.junit.Assert.assertNotNull(simpleDateFormat43);
        org.junit.Assert.assertNotNull(simpleDateFormat44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat49);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
    }

    @Test
    public void test8676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8676");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                                       431", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test8677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8677");
        java.text.SimpleDateFormat simpleDateFormat7 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat8 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("", simpleDateFormat7, simpleDateFormat8);
        java.text.SimpleDateFormat simpleDateFormat11 = null;
        java.text.SimpleDateFormat simpleDateFormat12 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("January", simpleDateFormat11, simpleDateFormat12);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat7, simpleDateFormat12);
        java.text.SimpleDateFormat simpleDateFormat17 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat18 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("", simpleDateFormat17, simpleDateFormat18);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        int int22 = dateTime21.getMs();
        java.text.SimpleDateFormat simpleDateFormat23 = net.ajaskey.common.Utils.sdf;
        dateTime21.setSdf(simpleDateFormat23);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat18, simpleDateFormat23);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime("                             100", simpleDateFormat12, simpleDateFormat18);
        java.text.SimpleDateFormat simpleDateFormat29 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat30 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("", simpleDateFormat29, simpleDateFormat30);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:54", simpleDateFormat29);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime("5.00", simpleDateFormat12, simpleDateFormat29);
        java.text.SimpleDateFormat simpleDateFormat34 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat12, simpleDateFormat34);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("                          -1,928.42", simpleDateFormat34);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime("  62,190,310,586,261.00", simpleDateFormat34);
        java.lang.String str39 = dateTime37.format("           6");
        org.junit.Assert.assertNotNull(simpleDateFormat7);
        org.junit.Assert.assertNotNull(simpleDateFormat8);
        org.junit.Assert.assertNotNull(simpleDateFormat12);
        org.junit.Assert.assertNotNull(simpleDateFormat17);
        org.junit.Assert.assertNotNull(simpleDateFormat18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat23);
        org.junit.Assert.assertNotNull(simpleDateFormat29);
        org.junit.Assert.assertNotNull(simpleDateFormat30);
        org.junit.Assert.assertNotNull(simpleDateFormat34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "BAD-DATE-FORMAT" + "'", str39, "BAD-DATE-FORMAT");
    }

    @Test
    public void test8678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8678");
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
        int int43 = dateTime28.getDayOfWeek();
        java.util.Calendar calendar44 = dateTime28.getCal();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=-62190310330439,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=49,MILLISECOND=561,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void test8679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8679");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime6.getSdf();
        boolean boolean11 = dateTime1.isLessThanOrEqual(dateTime6);
        boolean boolean12 = dateTime1.isWeekday();
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((long) (short) 0);
        int int15 = dateTime14.getHour();
        int int16 = dateTime14.getSecond();
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
        int int19 = dateTime18.getMs();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(100L);
        double double26 = dateTime23.getDeltaYears(dateTime25);
        java.text.SimpleDateFormat simpleDateFormat27 = dateTime23.getSdf();
        boolean boolean28 = dateTime18.isLessThanOrEqual(dateTime23);
        java.text.SimpleDateFormat simpleDateFormat30 = null;
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat30);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double34 = dateTime31.getDeltaYears(dateTime33);
        boolean boolean35 = dateTime31.isWeekday();
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long40 = dateTime31.getDeltaDays(dateTime39);
        long long41 = dateTime18.getDeltaDays(dateTime39);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(100L);
        dateTime43.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean48 = dateTime43.isWeekday();
        int int49 = dateTime18.getYears(dateTime43);
        java.text.SimpleDateFormat simpleDateFormat51 = null;
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat51);
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double55 = dateTime52.getDeltaYears(dateTime54);
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean60 = dateTime54.isEqual(dateTime59);
        int int61 = dateTime54.getDayOfWeek();
        boolean boolean62 = dateTime43.isLessThan(dateTime54);
        long long63 = dateTime14.getDeltaMilliSeconds(dateTime43);
        dateTime14.add(13, 12);
        boolean boolean67 = dateTime1.isLessThanOrEqual(dateTime14);
        java.lang.String str68 = dateTime1.getDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1972.041095890411d) + "'", double26 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 719795L + "'", long41 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1870) + "'", int49 == (-1870));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 4 + "'", int61 == 4);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-59011286399900L) + "'", long63 == (-59011286399900L));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Wednesday" + "'", str68, "Wednesday");
    }

    @Test
    public void test8680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8680");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        double double13 = dateTime10.getDeltaYears(dateTime12);
        int int14 = dateTime10.getHour();
        int int15 = dateTime10.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        double double22 = dateTime19.getDeltaYears(dateTime21);
        boolean boolean23 = dateTime21.isWeekday();
        boolean boolean24 = net.ajaskey.common.Utils.sameDate(dateTime10, dateTime21);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        dateTime26.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime(100L);
        double double37 = dateTime34.getDeltaYears(dateTime36);
        boolean boolean38 = dateTime36.isWeekday();
        java.util.Date date39 = dateTime36.getTime();
        dateTime26.set(dateTime36);
        int int41 = dateTime26.getYear();
        boolean boolean42 = dateTime21.isGreaterThanOrEqual(dateTime26);
        boolean boolean43 = dateTime3.sameDate(dateTime21);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime(100L);
        double double50 = dateTime47.getDeltaYears(dateTime49);
        int int51 = dateTime47.getHour();
        java.text.SimpleDateFormat simpleDateFormat53 = null;
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat53);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double57 = dateTime54.getDeltaYears(dateTime56);
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean62 = dateTime56.isEqual(dateTime61);
        java.util.Calendar calendar63 = dateTime56.getCal();
        dateTime47.set(calendar63);
        dateTime3.set(calendar63);
        java.text.SimpleDateFormat simpleDateFormat66 = dateTime3.getSdf();
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime(100L);
        int int69 = dateTime68.getMs();
        java.lang.String str70 = dateTime68.toString();
        dateTime68.set(25, (-1), (int) (short) 10);
        net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime80 = new net.ajaskey.common.DateTime(100L);
        double double81 = dateTime78.getDeltaYears(dateTime80);
        boolean boolean82 = dateTime80.isWeekday();
        boolean boolean83 = net.ajaskey.common.Utils.sameMonth(dateTime68, dateTime80);
        net.ajaskey.common.DateTime dateTime85 = new net.ajaskey.common.DateTime((long) (short) 0);
        int int86 = dateTime85.getHour();
        boolean boolean87 = dateTime85.isNull();
        net.ajaskey.common.DateTime dateTime88 = new net.ajaskey.common.DateTime(dateTime85);
        boolean boolean89 = dateTime80.isGreaterThan(dateTime85);
        dateTime3.set(dateTime85);
        int int91 = dateTime3.getSecond();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1972.041095890411d) + "'", double13 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1972.041095890411d) + "'", double22 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1972.041095890411d) + "'", double37 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1969 + "'", int41 == 1969);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1972.041095890411d) + "'", double50 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(calendar63);
        org.junit.Assert.assertEquals(calendar63.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(simpleDateFormat66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "31-Dec-1969" + "'", str70, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1972.041095890411d) + "'", double81 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 5 + "'", int86 == 5);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test8681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8681");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           -1", false);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test8682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8682");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((-59011286399900L));
        boolean boolean2 = dateTime1.isWeekday();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        int int10 = dateTime6.getHour();
        dateTime6.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat15 = null;
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat15);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double19 = dateTime16.getDeltaYears(dateTime18);
        boolean boolean20 = dateTime6.isEqual(dateTime18);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
        dateTime22.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str27 = dateTime22.getMonth();
        int int28 = dateTime22.getMs();
        java.lang.String str30 = dateTime22.format("                                                                                               52.00");
        int int31 = dateTime22.getDayOfMonth();
        java.lang.String str33 = dateTime22.format(" 9");
        boolean boolean34 = dateTime6.isGreaterThanOrEqual(dateTime22);
        boolean boolean35 = dateTime1.isGreaterThan(dateTime22);
        net.ajaskey.common.DateTime dateTime38 = dateTime22.parse("                                                                                               36.00", "Thu 10-Apr-0002 10:43:43");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1972.041095890411d) + "'", double9 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "January" + "'", str27, "January");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "                                                                                               52.00" + "'", str30, "                                                                                               52.00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " 9" + "'", str33, " 9");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(dateTime38);
    }

    @Test
    public void test8683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8683");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        long long6 = dateTime3.getDeltaDays(dateTime5);
        java.util.Calendar calendar7 = dateTime5.getCal();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(calendar7);
        int int9 = dateTime8.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-719795L) + "'", long6 == (-719795L));
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test8684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8684");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        dateTime2.set((int) ' ', 0, 11);
        boolean boolean7 = dateTime2.isWeekday();
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
        int int10 = dateTime9.getMs();
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        java.text.SimpleDateFormat simpleDateFormat18 = dateTime14.getSdf();
        boolean boolean19 = dateTime9.isLessThanOrEqual(dateTime14);
        java.util.Date date20 = dateTime14.getTime();
        dateTime2.set(date20);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(date20);
        java.util.Date date23 = dateTime22.getTime();
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(date23);
        int int25 = dateTime24.getHour();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1972.041095890411d) + "'", double17 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Thu Apr 10 10:47:49 MST 2");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Thu Apr 10 10:47:49 MST 2");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test8685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8685");
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
        java.text.SimpleDateFormat simpleDateFormat33 = null;
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat33);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double37 = dateTime34.getDeltaYears(dateTime36);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean42 = dateTime36.isEqual(dateTime41);
        java.util.Calendar calendar43 = dateTime36.getCal();
        java.lang.String str44 = dateTime36.format();
        net.ajaskey.common.DateTime dateTime45 = null;
        long long46 = dateTime36.getDeltaDays(dateTime45);
        int int47 = dateTime36.getSecond();
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime(100L);
        int int50 = dateTime49.getMs();
        boolean boolean51 = dateTime49.isNull();
        java.util.Calendar calendar52 = dateTime49.getCal();
        dateTime36.set(calendar52);
        java.util.Calendar calendar54 = dateTime36.getCal();
        boolean boolean55 = net.ajaskey.common.Utils.sameMonth(dateTime11, dateTime36);
        int int56 = dateTime11.getMs();
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
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(calendar43);
        org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "BAD-DATE-FORMAT" + "'", str44, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(calendar52);
        org.junit.Assert.assertEquals(calendar52.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar54);
        org.junit.Assert.assertEquals(calendar54.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test8686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8686");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        double double13 = dateTime10.getDeltaYears(dateTime12);
        int int14 = dateTime10.getHour();
        int int15 = dateTime10.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        double double22 = dateTime19.getDeltaYears(dateTime21);
        boolean boolean23 = dateTime21.isWeekday();
        boolean boolean24 = net.ajaskey.common.Utils.sameDate(dateTime10, dateTime21);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        dateTime26.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime(100L);
        double double37 = dateTime34.getDeltaYears(dateTime36);
        boolean boolean38 = dateTime36.isWeekday();
        java.util.Date date39 = dateTime36.getTime();
        dateTime26.set(dateTime36);
        int int41 = dateTime26.getYear();
        boolean boolean42 = dateTime21.isGreaterThanOrEqual(dateTime26);
        boolean boolean43 = dateTime3.sameDate(dateTime21);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime(100L);
        double double50 = dateTime47.getDeltaYears(dateTime49);
        int int51 = dateTime47.getHour();
        java.text.SimpleDateFormat simpleDateFormat53 = null;
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat53);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double57 = dateTime54.getDeltaYears(dateTime56);
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean62 = dateTime56.isEqual(dateTime61);
        java.util.Calendar calendar63 = dateTime56.getCal();
        dateTime47.set(calendar63);
        dateTime3.set(calendar63);
        java.text.SimpleDateFormat simpleDateFormat66 = dateTime3.getSdf();
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime(100L);
        int int69 = dateTime68.getMs();
        java.lang.String str70 = dateTime68.toString();
        dateTime68.set(25, (-1), (int) (short) 10);
        net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime80 = new net.ajaskey.common.DateTime(100L);
        double double81 = dateTime78.getDeltaYears(dateTime80);
        boolean boolean82 = dateTime80.isWeekday();
        boolean boolean83 = net.ajaskey.common.Utils.sameMonth(dateTime68, dateTime80);
        net.ajaskey.common.DateTime dateTime85 = new net.ajaskey.common.DateTime((long) (short) 0);
        int int86 = dateTime85.getHour();
        boolean boolean87 = dateTime85.isNull();
        net.ajaskey.common.DateTime dateTime88 = new net.ajaskey.common.DateTime(dateTime85);
        boolean boolean89 = dateTime80.isGreaterThan(dateTime85);
        dateTime3.set(dateTime85);
        int int91 = dateTime3.getMs();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1972.041095890411d) + "'", double13 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1972.041095890411d) + "'", double22 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1972.041095890411d) + "'", double37 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1969 + "'", int41 == 1969);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1972.041095890411d) + "'", double50 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(calendar63);
        org.junit.Assert.assertEquals(calendar63.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(simpleDateFormat66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "31-Dec-1969" + "'", str70, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1972.041095890411d) + "'", double81 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 5 + "'", int86 == 5);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test8687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8687");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(76, 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                            76" + "'", str2, "                                                                            76");
    }

    @Test
    public void test8688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8688");
        java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime("January", simpleDateFormat2);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime("", simpleDateFormat2);
        dateTime4.setFirstWorkDay();
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat11 = null;
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat11);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double15 = dateTime12.getDeltaYears(dateTime14);
        boolean boolean16 = dateTime9.isLessThan(dateTime14);
        java.lang.String str17 = dateTime14.toFullString();
        dateTime14.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat22 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat24 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat25 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime("", simpleDateFormat24, simpleDateFormat25);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat22, simpleDateFormat25);
        boolean boolean28 = dateTime14.isGreaterThan(dateTime27);
        java.text.SimpleDateFormat simpleDateFormat30 = null;
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat30);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double34 = dateTime31.getDeltaYears(dateTime33);
        boolean boolean35 = dateTime31.isWeekday();
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long40 = dateTime31.getDeltaDays(dateTime39);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime(dateTime31);
        boolean boolean42 = dateTime27.sameDate(dateTime31);
        boolean boolean43 = dateTime4.isGreaterThan(dateTime31);
        java.lang.String str44 = dateTime31.toFullString();
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime(100L);
        int int47 = dateTime46.getMs();
        boolean boolean48 = dateTime46.isNull();
        java.util.Calendar calendar49 = dateTime46.getCal();
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime(calendar49);
        net.ajaskey.common.DateTime dateTime51 = dateTime31.copy(dateTime50);
        java.util.Date date52 = dateTime31.getTime();
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime(100L);
        double double59 = dateTime56.getDeltaYears(dateTime58);
        java.text.SimpleDateFormat simpleDateFormat61 = null;
        net.ajaskey.common.DateTime dateTime62 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat61);
        net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double65 = dateTime62.getDeltaYears(dateTime64);
        boolean boolean66 = dateTime62.isWeekday();
        boolean boolean67 = dateTime56.sameDate(dateTime62);
        dateTime31.set(dateTime62);
        org.junit.Assert.assertNotNull(simpleDateFormat2);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str17, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat22);
        org.junit.Assert.assertNotNull(simpleDateFormat24);
        org.junit.Assert.assertNotNull(simpleDateFormat25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Invalid Time" + "'", str44, "Invalid Time");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(calendar49);
        org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNull(date52);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1972.041095890411d) + "'", double59 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test8689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8689");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(145, 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                       145" + "'", str2, "                                                       145");
    }

    @Test
    public void test8690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8690");
        java.text.SimpleDateFormat simpleDateFormat1 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime("", simpleDateFormat1, simpleDateFormat2);
        int int4 = dateTime3.getHour();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime(100L);
        int int7 = dateTime6.getMs();
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
        double double14 = dateTime11.getDeltaYears(dateTime13);
        java.text.SimpleDateFormat simpleDateFormat15 = dateTime11.getSdf();
        boolean boolean16 = dateTime6.isLessThanOrEqual(dateTime11);
        boolean boolean17 = dateTime11.isWeekday();
        java.lang.String str18 = dateTime11.toString();
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
        int int21 = dateTime20.getMs();
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(100L);
        double double28 = dateTime25.getDeltaYears(dateTime27);
        java.text.SimpleDateFormat simpleDateFormat29 = dateTime25.getSdf();
        boolean boolean30 = dateTime20.isLessThanOrEqual(dateTime25);
        java.text.SimpleDateFormat simpleDateFormat32 = null;
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat32);
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double36 = dateTime33.getDeltaYears(dateTime35);
        boolean boolean37 = dateTime33.isWeekday();
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long42 = dateTime33.getDeltaDays(dateTime41);
        long long43 = dateTime20.getDeltaDays(dateTime41);
        java.lang.String str44 = dateTime41.toFullString();
        java.util.Calendar calendar45 = dateTime41.getCal();
        boolean boolean46 = dateTime11.isLessThan(dateTime41);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime(dateTime41);
        java.lang.String str48 = dateTime41.toString();
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime(dateTime41);
        double double50 = dateTime3.getDeltaYears(dateTime41);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(dateTime3);
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime(100L);
        double double58 = dateTime55.getDeltaYears(dateTime57);
        int int59 = dateTime55.getHour();
        dateTime55.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat64 = null;
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat64);
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double68 = dateTime65.getDeltaYears(dateTime67);
        boolean boolean69 = dateTime55.isEqual(dateTime67);
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat75 = null;
        net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat75);
        net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double79 = dateTime76.getDeltaYears(dateTime78);
        net.ajaskey.common.DateTime dateTime83 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean84 = dateTime78.isEqual(dateTime83);
        java.util.Calendar calendar85 = dateTime78.getCal();
        boolean boolean86 = dateTime73.isLessThan(dateTime78);
        dateTime73.setFirstWorkDay();
        boolean boolean88 = dateTime55.sameDate(dateTime73);
        net.ajaskey.common.DateTime dateTime89 = null;
        boolean boolean90 = net.ajaskey.common.Utils.sameMonth(dateTime55, dateTime89);
        java.lang.String str91 = dateTime55.getDay();
        int int92 = dateTime55.getHour();
        java.util.Date date93 = dateTime55.getTime();
        net.ajaskey.common.DateTime dateTime94 = dateTime51.copy(dateTime55);
        boolean boolean95 = dateTime94.isNull();
        org.junit.Assert.assertNotNull(simpleDateFormat1);
        org.junit.Assert.assertNotNull(simpleDateFormat2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-Apr-0002" + "'", str18, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1972.041095890411d) + "'", double28 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 719795L + "'", long43 == 719795L);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Thu 10-Apr-0002 10:47:49" + "'", str44, "Thu 10-Apr-0002 10:47:49");
        org.junit.Assert.assertNotNull(calendar45);
// flaky:         org.junit.Assert.assertEquals(calendar45.toString(), "java.util.GregorianCalendar[time=-62190310330213,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=49,MILLISECOND=787,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "10-Apr-0002" + "'", str48, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1972.041095890411d) + "'", double58 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(calendar85);
        org.junit.Assert.assertEquals(calendar85.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Thursday" + "'", str91, "Thursday");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 10 + "'", int92 == 10);
        org.junit.Assert.assertNotNull(date93);
// flaky:         org.junit.Assert.assertEquals(date93.toString(), "Thu Apr 10 10:47:49 MST 2");
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test8691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8691");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("Thu 10-Apr-0002 10:43:05", true);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test8692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8692");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        boolean boolean7 = dateTime5.isWeekday();
        java.util.Date date8 = dateTime5.getTime();
        int int9 = dateTime5.getDayOfWeek();
        java.lang.String str10 = dateTime5.toFullString();
        boolean boolean11 = dateTime5.isWeekday();
        java.lang.String str13 = dateTime5.format("");
        int int14 = dateTime5.getHour();
        net.ajaskey.common.DateTime dateTime16 = dateTime5.parse("Thu 25-Jun-2020 10:44:29");
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(100L);
        int int19 = dateTime18.getMs();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime(100L);
        double double26 = dateTime23.getDeltaYears(dateTime25);
        java.text.SimpleDateFormat simpleDateFormat27 = dateTime23.getSdf();
        boolean boolean28 = dateTime18.isLessThanOrEqual(dateTime23);
        java.text.SimpleDateFormat simpleDateFormat30 = null;
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat30);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double34 = dateTime31.getDeltaYears(dateTime33);
        boolean boolean35 = dateTime31.isWeekday();
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long40 = dateTime31.getDeltaDays(dateTime39);
        long long41 = dateTime18.getDeltaDays(dateTime39);
        long long42 = dateTime5.getDeltaMilliSeconds(dateTime18);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str10, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1972.041095890411d) + "'", double26 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 719795L + "'", long41 == 719795L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test8693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8693");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("        31", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test8694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8694");
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
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        int int27 = dateTime26.getMs();
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime(100L);
        double double34 = dateTime31.getDeltaYears(dateTime33);
        java.text.SimpleDateFormat simpleDateFormat35 = dateTime31.getSdf();
        boolean boolean36 = dateTime26.isLessThanOrEqual(dateTime31);
        java.text.SimpleDateFormat simpleDateFormat38 = null;
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat38);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double42 = dateTime39.getDeltaYears(dateTime41);
        boolean boolean43 = dateTime39.isWeekday();
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long48 = dateTime39.getDeltaDays(dateTime47);
        long long49 = dateTime26.getDeltaDays(dateTime47);
        java.lang.String str50 = dateTime47.toFullString();
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
        net.ajaskey.common.DateTime dateTime69 = dateTime47.copy(dateTime54);
        int int70 = dateTime69.getDayOfYear();
        dateTime1.set(dateTime69);
        net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime();
        net.ajaskey.common.DateTime dateTime73 = null;
        boolean boolean74 = dateTime72.isGreaterThan(dateTime73);
        java.text.SimpleDateFormat simpleDateFormat76 = null;
        net.ajaskey.common.DateTime dateTime77 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat76);
        net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double80 = dateTime77.getDeltaYears(dateTime79);
        net.ajaskey.common.DateTime dateTime84 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean85 = dateTime79.isEqual(dateTime84);
        java.util.Calendar calendar86 = dateTime79.getCal();
        net.ajaskey.common.DateTime dateTime87 = new net.ajaskey.common.DateTime(calendar86);
        net.ajaskey.common.DateTime dateTime88 = new net.ajaskey.common.DateTime(calendar86);
        boolean boolean89 = dateTime72.isLessThan(dateTime88);
        int int90 = dateTime88.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime93 = dateTime88.parse("     35", "                                                                                                                                                                                                                                                                                                                                                            32");
        int int94 = dateTime1.getYears(dateTime93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "January" + "'", str13, "January");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "January" + "'", str20, "January");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1972.041095890411d) + "'", double34 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 719795L + "'", long49 == 719795L);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Thu 10-Apr-0002 10:47:49" + "'", str50, "Thu 10-Apr-0002 10:47:49");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(calendar66);
        org.junit.Assert.assertEquals(calendar66.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(calendar86);
        org.junit.Assert.assertEquals(calendar86.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 31 + "'", int90 == 31);
        org.junit.Assert.assertNull(dateTime93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test8695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8695");
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
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
        int int23 = dateTime22.getMs();
        boolean boolean24 = dateTime22.isWeekday();
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((long) (short) 0);
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime(100L);
        int int29 = dateTime28.getMs();
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime(100L);
        double double36 = dateTime33.getDeltaYears(dateTime35);
        java.text.SimpleDateFormat simpleDateFormat37 = dateTime33.getSdf();
        boolean boolean38 = dateTime28.isLessThanOrEqual(dateTime33);
        java.text.SimpleDateFormat simpleDateFormat40 = null;
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat40);
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double44 = dateTime41.getDeltaYears(dateTime43);
        boolean boolean45 = dateTime41.isWeekday();
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long50 = dateTime41.getDeltaDays(dateTime49);
        long long51 = dateTime28.getDeltaDays(dateTime49);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime(100L);
        dateTime53.set((int) (byte) 100, (-1), (int) '#');
        boolean boolean58 = dateTime53.isWeekday();
        int int59 = dateTime28.getYears(dateTime53);
        int int60 = dateTime28.getYear();
        java.util.Calendar calendar61 = dateTime28.getCal();
        net.ajaskey.common.DateTime dateTime62 = dateTime26.copy(dateTime28);
        boolean boolean63 = dateTime22.isGreaterThan(dateTime28);
        java.text.SimpleDateFormat simpleDateFormat65 = null;
        net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat65);
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double69 = dateTime66.getDeltaYears(dateTime68);
        net.ajaskey.common.DateTime dateTime73 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean74 = dateTime68.isEqual(dateTime73);
        java.lang.String str75 = dateTime73.getMonth();
        net.ajaskey.common.DateTime dateTime76 = dateTime28.copy(dateTime73);
        java.util.Date date77 = dateTime28.getTime();
        net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime(date77);
        int int79 = dateTime78.getDayOfWeek();
        boolean boolean80 = net.ajaskey.common.Utils.sameDate(dateTime16, dateTime78);
        dateTime16.setFirstWorkDay();
        java.lang.String str82 = dateTime16.toFullString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1972.041095890411d) + "'", double17 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 365 + "'", int19 == 365);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1972.041095890411d) + "'", double36 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 719795L + "'", long51 == 719795L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1870) + "'", int59 == (-1870));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1969 + "'", int60 == 1969);
        org.junit.Assert.assertNotNull(calendar61);
        org.junit.Assert.assertEquals(calendar61.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "April" + "'", str75, "April");
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 4 + "'", int79 == 4);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str82, "Wed 31-Dec-1969 17:00:00");
    }

    @Test
    public void test8696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8696");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(86, 733, 98);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(753, 19, 0);
        boolean boolean8 = dateTime3.isGreaterThan(dateTime7);
        int int9 = dateTime7.getYear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 754 + "'", int9 == 754);
    }

    @Test
    public void test8697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8697");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:43:23", "                                                                                                                                                                                                                                                                            56,249,766,000,001");
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime(12, 42, (int) (byte) 1);
        java.util.Calendar calendar7 = dateTime6.getCal();
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime(100L);
        double double14 = dateTime11.getDeltaYears(dateTime13);
        java.util.Date date15 = dateTime11.getTime();
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(date15);
        net.ajaskey.common.DateTime dateTime19 = dateTime16.parse("31-Dec-1969", "January");
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        int int22 = dateTime21.getMs();
        java.lang.String str23 = dateTime21.toString();
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(100L);
        double double30 = dateTime27.getDeltaYears(dateTime29);
        int int31 = dateTime27.getHour();
        int int32 = dateTime27.getDayOfMonth();
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime(100L);
        double double39 = dateTime36.getDeltaYears(dateTime38);
        boolean boolean40 = dateTime38.isWeekday();
        boolean boolean41 = net.ajaskey.common.Utils.sameDate(dateTime27, dateTime38);
        boolean boolean42 = net.ajaskey.common.Utils.sameDate(dateTime21, dateTime27);
        dateTime16.set(dateTime27);
        java.util.Calendar calendar44 = dateTime27.getCal();
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(calendar44);
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime(calendar44);
        long long47 = dateTime6.getDeltaMilliSeconds(dateTime46);
        java.lang.String str48 = dateTime46.getMonth();
        boolean boolean49 = net.ajaskey.common.Utils.sameDate(dateTime2, dateTime46);
        int int50 = dateTime46.getMs();
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-61678303930097,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=15,MONTH=6,WEEK_OF_YEAR=27,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=182,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=49,MILLISECOND=903,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Thu Apr 10 10:47:49 MST 2");
        org.junit.Assert.assertNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "31-Dec-1969" + "'", str23, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1972.041095890411d) + "'", double30 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1972.041095890411d) + "'", double39 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=-62190310330096,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=49,MILLISECOND=904,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-512006399999L) + "'", long47 == (-512006399999L));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "April" + "'", str48, "April");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 904 + "'", int50 == 904);
    }

    @Test
    public void test8698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8698");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.lang.String str7 = dateTime3.toFullString();
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((-59011286399903L));
        java.text.SimpleDateFormat simpleDateFormat11 = null;
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat11);
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double15 = dateTime12.getDeltaYears(dateTime14);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean20 = dateTime14.isEqual(dateTime19);
        java.util.Calendar calendar21 = dateTime14.getCal();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
        int int24 = dateTime23.getMs();
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(100L);
        double double31 = dateTime28.getDeltaYears(dateTime30);
        java.text.SimpleDateFormat simpleDateFormat32 = dateTime28.getSdf();
        boolean boolean33 = dateTime23.isLessThanOrEqual(dateTime28);
        int int34 = dateTime23.getMinute();
        long long35 = dateTime14.getDeltaMilliSeconds(dateTime23);
        long long36 = dateTime9.getDeltaDays(dateTime14);
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:54", "                       25");
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((long) 10);
        boolean boolean42 = dateTime39.isGreaterThan(dateTime41);
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat48 = null;
        net.ajaskey.common.DateTime dateTime49 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat48);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double52 = dateTime49.getDeltaYears(dateTime51);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean57 = dateTime51.isEqual(dateTime56);
        java.util.Calendar calendar58 = dateTime51.getCal();
        boolean boolean59 = dateTime46.isLessThan(dateTime51);
        dateTime46.setFirstWorkDay();
        net.ajaskey.common.DateTime dateTime64 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime66 = new net.ajaskey.common.DateTime(100L);
        double double67 = dateTime64.getDeltaYears(dateTime66);
        java.text.SimpleDateFormat simpleDateFormat69 = null;
        net.ajaskey.common.DateTime dateTime70 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat69);
        net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double73 = dateTime70.getDeltaYears(dateTime72);
        boolean boolean74 = dateTime70.isWeekday();
        boolean boolean75 = dateTime64.sameDate(dateTime70);
        boolean boolean76 = dateTime46.sameDate(dateTime64);
        dateTime64.set(0, 0, (int) (short) 0);
        boolean boolean81 = net.ajaskey.common.Utils.sameDate(dateTime39, dateTime64);
        double double82 = dateTime14.getDeltaYears(dateTime39);
        int int83 = dateTime39.getDayOfMonth();
        long long84 = dateTime3.getDeltaMilliSeconds(dateTime39);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu 10-Apr-0002 10:47:49" + "'", str7, "Thu 10-Apr-0002 10:47:49");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1972.041095890411d) + "'", double31 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-683000L) + "'", long36 == (-683000L));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(calendar58);
        org.junit.Assert.assertEquals(calendar58.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1972.041095890411d) + "'", double67 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
    }

    @Test
    public void test8699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8699");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                        365", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                         365 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8700");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime(100L);
        int int3 = dateTime2.getMs();
        java.lang.String str4 = dateTime2.toString();
        java.util.Date date5 = dateTime2.getTime();
        int int6 = dateTime2.getDayOfYear();
        java.lang.String str8 = dateTime2.format("Thu 10-Apr-0002 10:43:03");
        java.text.SimpleDateFormat simpleDateFormat9 = dateTime2.getSdf();
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime(100L);
        int int13 = dateTime12.getMs();
        int int14 = dateTime12.getHour();
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat20 = null;
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat20);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double24 = dateTime21.getDeltaYears(dateTime23);
        boolean boolean25 = dateTime18.isLessThan(dateTime23);
        java.lang.String str26 = dateTime23.toFullString();
        dateTime23.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat31 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat33 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat34 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime("", simpleDateFormat33, simpleDateFormat34);
        net.ajaskey.common.DateTime dateTime36 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat31, simpleDateFormat34);
        boolean boolean37 = dateTime23.isGreaterThan(dateTime36);
        boolean boolean38 = dateTime12.isEqual(dateTime23);
        net.ajaskey.common.DateTime dateTime42 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.lang.String str43 = dateTime42.toFullString();
        dateTime42.add(7, 53);
        net.ajaskey.common.DateTime dateTime47 = dateTime12.copy(dateTime42);
        int int48 = dateTime47.getDayOfMonth();
        java.text.SimpleDateFormat simpleDateFormat53 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat54 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime("", simpleDateFormat53, simpleDateFormat54);
        java.text.SimpleDateFormat simpleDateFormat57 = null;
        java.text.SimpleDateFormat simpleDateFormat58 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime59 = new net.ajaskey.common.DateTime("January", simpleDateFormat57, simpleDateFormat58);
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat53, simpleDateFormat58);
        java.text.SimpleDateFormat simpleDateFormat63 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat64 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime("", simpleDateFormat63, simpleDateFormat64);
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime(100L);
        int int68 = dateTime67.getMs();
        java.text.SimpleDateFormat simpleDateFormat69 = net.ajaskey.common.Utils.sdf;
        dateTime67.setSdf(simpleDateFormat69);
        net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat64, simpleDateFormat69);
        net.ajaskey.common.DateTime dateTime72 = new net.ajaskey.common.DateTime("                             100", simpleDateFormat58, simpleDateFormat64);
        java.text.SimpleDateFormat simpleDateFormat75 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat76 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime77 = new net.ajaskey.common.DateTime("", simpleDateFormat75, simpleDateFormat76);
        net.ajaskey.common.DateTime dateTime78 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:54", simpleDateFormat75);
        net.ajaskey.common.DateTime dateTime79 = new net.ajaskey.common.DateTime("5.00", simpleDateFormat58, simpleDateFormat75);
        dateTime47.setSdf(simpleDateFormat75);
        net.ajaskey.common.DateTime dateTime83 = new net.ajaskey.common.DateTime(100L);
        int int84 = dateTime83.getMs();
        java.text.SimpleDateFormat simpleDateFormat85 = net.ajaskey.common.Utils.sdf;
        dateTime83.setSdf(simpleDateFormat85);
        java.text.SimpleDateFormat simpleDateFormat87 = net.ajaskey.common.Utils.sdfFull;
        dateTime83.setSdf(simpleDateFormat87);
        net.ajaskey.common.DateTime dateTime89 = new net.ajaskey.common.DateTime("Mon 10-Apr-0002 00:00:00", simpleDateFormat87);
        net.ajaskey.common.DateTime dateTime90 = new net.ajaskey.common.DateTime("Invalid Time", simpleDateFormat75, simpleDateFormat87);
        net.ajaskey.common.DateTime dateTime91 = new net.ajaskey.common.DateTime("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             39", simpleDateFormat9, simpleDateFormat87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "31-Dec-1969" + "'", str4, "31-Dec-1969");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "BAD-DATE-FORMAT" + "'", str8, "BAD-DATE-FORMAT");
        org.junit.Assert.assertNotNull(simpleDateFormat9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str26, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat31);
        org.junit.Assert.assertNotNull(simpleDateFormat33);
        org.junit.Assert.assertNotNull(simpleDateFormat34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Thu 10-Apr-0002 10:47:49" + "'", str43, "Thu 10-Apr-0002 10:47:49");
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(simpleDateFormat53);
        org.junit.Assert.assertNotNull(simpleDateFormat54);
        org.junit.Assert.assertNotNull(simpleDateFormat58);
        org.junit.Assert.assertNotNull(simpleDateFormat63);
        org.junit.Assert.assertNotNull(simpleDateFormat64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat69);
        org.junit.Assert.assertNotNull(simpleDateFormat75);
        org.junit.Assert.assertNotNull(simpleDateFormat76);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 100 + "'", int84 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat85);
        org.junit.Assert.assertNotNull(simpleDateFormat87);
    }

    @Test
    public void test8701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8701");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (byte) 10, (int) (byte) 0, 2);
        net.ajaskey.common.DateTime dateTime4 = null;
        int int5 = dateTime3.getYears(dateTime4);
        java.lang.String str6 = dateTime3.getDay();
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime(100L);
        int int10 = dateTime9.getMs();
        int int11 = dateTime9.getMinute();
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime(100L);
        int int15 = dateTime14.getMs();
        java.text.SimpleDateFormat simpleDateFormat16 = net.ajaskey.common.Utils.sdf;
        dateTime14.setSdf(simpleDateFormat16);
        int int18 = dateTime14.getDayOfWeek();
        java.text.SimpleDateFormat simpleDateFormat19 = dateTime14.getSdf();
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
        int int23 = dateTime22.getMs();
        java.text.SimpleDateFormat simpleDateFormat24 = net.ajaskey.common.Utils.sdf;
        dateTime22.setSdf(simpleDateFormat24);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat24);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:55", simpleDateFormat19, simpleDateFormat24);
        dateTime9.setSdf(simpleDateFormat24);
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime("JanuaryThu 10-Apr-0002 10:43:43Thu 10-Apr-0002 10:43:43                                                                                               52.00Thu 10-Apr-0002 10:43:43hi!Thu 10-Apr-0002 10:43:43", simpleDateFormat24);
        boolean boolean30 = dateTime3.isLessThan(dateTime29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thursday" + "'", str6, "Thursday");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(simpleDateFormat19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test8702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8702");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("Thu 10-Apr-0002 10:47:41", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Thu 10-Apr-0002 10:47:41 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8703");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime(" 1", "     5.00");
        java.text.SimpleDateFormat simpleDateFormat4 = null;
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat4);
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double8 = dateTime5.getDeltaYears(dateTime7);
        boolean boolean9 = dateTime5.isWeekday();
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long14 = dateTime5.getDeltaDays(dateTime13);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(dateTime5);
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime(100L);
        double double22 = dateTime19.getDeltaYears(dateTime21);
        boolean boolean23 = dateTime21.isWeekday();
        java.util.Date date24 = dateTime21.getTime();
        dateTime5.set(date24);
        net.ajaskey.common.DateTime dateTime27 = new net.ajaskey.common.DateTime(100L);
        int int28 = dateTime27.getMs();
        java.lang.String str29 = dateTime27.toString();
        boolean boolean30 = dateTime5.isLessThanOrEqual(dateTime27);
        java.text.SimpleDateFormat simpleDateFormat31 = dateTime5.getSdf();
        java.util.Calendar calendar32 = dateTime5.getCal();
        dateTime2.set(calendar32);
        int int34 = dateTime2.getMs();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1972.041095890411d) + "'", double22 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "31-Dec-1969" + "'", str29, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(simpleDateFormat31);
        org.junit.Assert.assertNotNull(calendar32);
        org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test8704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8704");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        int int2 = dateTime1.getMs();
        boolean boolean3 = dateTime1.isNull();
        java.util.Calendar calendar4 = dateTime1.getCal();
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(calendar4);
        int int6 = dateTime5.getSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test8705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8705");
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
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime(100L);
        int int17 = dateTime16.getMs();
        java.lang.String str18 = dateTime16.toString();
        java.util.Date date19 = dateTime16.getTime();
        boolean boolean20 = net.ajaskey.common.Utils.sameDate(dateTime13, dateTime16);
        dateTime16.setFirstWorkDay();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "BAD-DATE-FORMAT" + "'", str12, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "31-Dec-1969" + "'", str18, "31-Dec-1969");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8706");
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
        java.util.Calendar calendar35 = dateTime24.getCal();
        java.text.SimpleDateFormat simpleDateFormat36 = null;
        dateTime24.setSdf(simpleDateFormat36);
        java.lang.String str38 = dateTime24.toString();
        int int39 = dateTime24.getMinute();
        java.lang.String str40 = dateTime24.format();
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
        org.junit.Assert.assertNotNull(calendar35);
        org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "31-Dec-1969" + "'", str38, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "31-Dec-1969" + "'", str40, "31-Dec-1969");
    }

    @Test
    public void test8707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8707");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        boolean boolean6 = dateTime2.isWeekday();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime(100L);
        int int9 = dateTime8.getMs();
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime(100L);
        double double16 = dateTime13.getDeltaYears(dateTime15);
        java.text.SimpleDateFormat simpleDateFormat17 = dateTime13.getSdf();
        boolean boolean18 = dateTime8.isLessThanOrEqual(dateTime13);
        boolean boolean19 = dateTime2.isLessThanOrEqual(dateTime8);
        java.lang.String str21 = dateTime2.format("5.00");
        java.lang.String str22 = dateTime2.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1972.041095890411d) + "'", double16 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "BAD-DATE-FORMAT" + "'", str21, "BAD-DATE-FORMAT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8708");
        java.text.SimpleDateFormat simpleDateFormat1 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat2 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime("", simpleDateFormat1, simpleDateFormat2);
        int int4 = dateTime3.getHour();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime(100L);
        double double11 = dateTime8.getDeltaYears(dateTime10);
        java.text.SimpleDateFormat simpleDateFormat13 = null;
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat13);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        boolean boolean18 = dateTime14.isWeekday();
        boolean boolean19 = dateTime8.sameDate(dateTime14);
        java.text.SimpleDateFormat simpleDateFormat21 = null;
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat21);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double25 = dateTime22.getDeltaYears(dateTime24);
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean30 = dateTime24.isEqual(dateTime29);
        dateTime8.set(dateTime29);
        java.lang.String str32 = dateTime29.toString();
        net.ajaskey.common.DateTime dateTime33 = null;
        net.ajaskey.common.DateTime dateTime34 = new net.ajaskey.common.DateTime(dateTime33);
        boolean boolean35 = dateTime29.isGreaterThanOrEqual(dateTime34);
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime(100L);
        int int38 = dateTime37.getMs();
        int int39 = dateTime37.getHour();
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat45 = null;
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat45);
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double49 = dateTime46.getDeltaYears(dateTime48);
        boolean boolean50 = dateTime43.isLessThan(dateTime48);
        java.lang.String str51 = dateTime48.toFullString();
        dateTime48.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat56 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat58 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat59 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime("", simpleDateFormat58, simpleDateFormat59);
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat56, simpleDateFormat59);
        boolean boolean62 = dateTime48.isGreaterThan(dateTime61);
        boolean boolean63 = dateTime37.isEqual(dateTime48);
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.lang.String str68 = dateTime67.toFullString();
        dateTime67.add(7, 53);
        net.ajaskey.common.DateTime dateTime72 = dateTime37.copy(dateTime67);
        int int73 = dateTime72.getDayOfMonth();
        boolean boolean74 = dateTime34.isLessThanOrEqual(dateTime72);
        net.ajaskey.common.DateTime dateTime77 = new net.ajaskey.common.DateTime("                                                                                              100", "100");
        net.ajaskey.common.DateTime dateTime80 = new net.ajaskey.common.DateTime(100L);
        int int81 = dateTime80.getMs();
        java.text.SimpleDateFormat simpleDateFormat82 = net.ajaskey.common.Utils.sdf;
        dateTime80.setSdf(simpleDateFormat82);
        java.text.SimpleDateFormat simpleDateFormat84 = net.ajaskey.common.Utils.sdfFull;
        dateTime80.setSdf(simpleDateFormat84);
        net.ajaskey.common.DateTime dateTime86 = new net.ajaskey.common.DateTime("Mon 10-Apr-0002 00:00:00", simpleDateFormat84);
        dateTime77.setSdf(simpleDateFormat84);
        dateTime34.set(dateTime77);
        boolean boolean89 = dateTime3.isGreaterThan(dateTime34);
        int int90 = dateTime3.getSecond();
        org.junit.Assert.assertNotNull(simpleDateFormat1);
        org.junit.Assert.assertNotNull(simpleDateFormat2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1972.041095890411d) + "'", double11 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10-Apr-0002" + "'", str32, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str51, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat56);
        org.junit.Assert.assertNotNull(simpleDateFormat58);
        org.junit.Assert.assertNotNull(simpleDateFormat59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Thu 10-Apr-0002 10:47:50" + "'", str68, "Thu 10-Apr-0002 10:47:50");
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 100 + "'", int81 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat82);
        org.junit.Assert.assertNotNull(simpleDateFormat84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test8709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8709");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat5 = null;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        boolean boolean10 = dateTime3.isLessThan(dateTime8);
        java.lang.String str11 = dateTime8.toFullString();
        dateTime8.add(10, (int) (byte) -1);
        java.text.SimpleDateFormat simpleDateFormat16 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat18 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat19 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("", simpleDateFormat18, simpleDateFormat19);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat16, simpleDateFormat19);
        boolean boolean22 = dateTime8.isGreaterThan(dateTime21);
        net.ajaskey.common.DateTime dateTime25 = dateTime8.parse("                              10", "Mon 06-Jan-0100 17:00:00");
        // The following exception was thrown during execution in test generation
        try {
            int int26 = dateTime25.getYear();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str11, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNotNull(simpleDateFormat16);
        org.junit.Assert.assertNotNull(simpleDateFormat18);
        org.junit.Assert.assertNotNull(simpleDateFormat19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dateTime25);
    }

    @Test
    public void test8710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8710");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("          264", "                             100");
        int int3 = dateTime2.getDayOfWeek();
        dateTime2.setFirstWorkDay();
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime("5.00", "     10");
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
        dateTime11.set(calendar27);
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(calendar27);
        dateTime7.set(calendar27);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime(100L);
        int int33 = dateTime32.getMs();
        java.lang.String str34 = dateTime32.toString();
        java.lang.String str36 = dateTime32.format("         1");
        net.ajaskey.common.DateTime dateTime37 = dateTime7.copy(dateTime32);
        net.ajaskey.common.DateTime dateTime38 = new net.ajaskey.common.DateTime(dateTime7);
        java.lang.String str39 = dateTime7.format();
        java.util.Calendar calendar40 = dateTime7.getCal();
        dateTime2.set(calendar40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1972.041095890411d) + "'", double14 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(calendar27);
        org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "31-Dec-1969" + "'", str34, "31-Dec-1969");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "         1" + "'", str36, "         1");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "BAD-DATE-FORMAT" + "'", str39, "BAD-DATE-FORMAT");
        org.junit.Assert.assertNotNull(calendar40);
        org.junit.Assert.assertEquals(calendar40.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void test8711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8711");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(0.0d, (-51));
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test8712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8712");
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("JanuaryThu 25-Jun-2020 10:44:56Thu 25-Jun-2020 10:44:56                                                                                               52.00Thu 25-Jun-2020 10:44:56hi!Thu 25-Jun-2020 10:44:56", "Sat 10-Nov-0042 10:46:42");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 't'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8713");
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
        int int27 = dateTime24.getDayOfWeek();
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime();
        net.ajaskey.common.DateTime dateTime29 = null;
        boolean boolean30 = dateTime28.isGreaterThan(dateTime29);
        java.text.SimpleDateFormat simpleDateFormat32 = null;
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat32);
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double36 = dateTime33.getDeltaYears(dateTime35);
        net.ajaskey.common.DateTime dateTime40 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean41 = dateTime35.isEqual(dateTime40);
        java.util.Calendar calendar42 = dateTime35.getCal();
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(calendar42);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(calendar42);
        boolean boolean45 = dateTime28.isLessThan(dateTime44);
        long long46 = dateTime24.getDeltaDays(dateTime28);
        int int47 = dateTime24.getMinute();
        java.lang.String str48 = dateTime24.getDay();
        int int49 = dateTime24.getMs();
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime(100L);
        int int52 = dateTime51.getMs();
        java.lang.String str53 = dateTime51.toString();
        dateTime51.set(25, (-1), (int) (short) 10);
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime(100L);
        double double64 = dateTime61.getDeltaYears(dateTime63);
        boolean boolean65 = dateTime63.isWeekday();
        boolean boolean66 = net.ajaskey.common.Utils.sameMonth(dateTime51, dateTime63);
        net.ajaskey.common.DateTime dateTime68 = new net.ajaskey.common.DateTime((long) (short) 0);
        int int69 = dateTime68.getHour();
        boolean boolean70 = dateTime68.isNull();
        net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime(dateTime68);
        boolean boolean72 = dateTime63.isGreaterThan(dateTime68);
        java.text.SimpleDateFormat simpleDateFormat73 = dateTime68.getSdf();
        net.ajaskey.common.DateTime dateTime76 = new net.ajaskey.common.DateTime("5.00", "     10");
        dateTime76.add((int) (short) 0, (int) 'a');
        long long80 = dateTime68.getDeltaDays(dateTime76);
        boolean boolean81 = dateTime24.isEqual(dateTime68);
        java.lang.String str82 = dateTime68.toFullString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(calendar42);
        org.junit.Assert.assertEquals(calendar42.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-738233L) + "'", long46 == (-738233L));
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 47 + "'", int47 == 47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Thursday" + "'", str48, "Thursday");
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 146 + "'", int49 == 146);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "31-Dec-1969" + "'", str53, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1972.041095890411d) + "'", double64 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 5 + "'", int69 == 5);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(simpleDateFormat73);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str82, "Wed 31-Dec-1969 17:00:00");
    }

    @Test
    public void test8714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8714");
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
        java.lang.String str18 = dateTime3.toString();
        dateTime3.add(100, (int) (byte) 0);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("January", "100.00");
        boolean boolean25 = dateTime3.sameDate(dateTime24);
        java.util.Calendar calendar26 = dateTime3.getCal();
        java.text.SimpleDateFormat simpleDateFormat27 = dateTime3.getSdf();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10-Apr-0002" + "'", str18, "10-Apr-0002");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(calendar26);
// flaky:         org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=-62190310329833,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=50,MILLISECOND=167,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(simpleDateFormat27);
    }

    @Test
    public void test8715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8715");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        boolean boolean6 = dateTime2.isWeekday();
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long11 = dateTime2.getDeltaDays(dateTime10);
        dateTime10.set((int) (short) -1, (int) (byte) 0, (int) ' ');
        java.lang.String str16 = dateTime10.getDay();
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(dateTime10);
        dateTime17.add(872, 974);
        java.util.Calendar calendar21 = dateTime17.getCal();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Wednesday" + "'", str16, "Wednesday");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=-62101491129819,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2,MONTH=1,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=50,MILLISECOND=181,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
    }

    @Test
    public void test8716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8716");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime(1869, (-1968), 5);
        java.lang.String str4 = dateTime3.getMonth();
        java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat7 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime("", simpleDateFormat6, simpleDateFormat7);
        boolean boolean9 = dateTime8.isNull();
        java.lang.String str10 = dateTime8.getDay();
        double double11 = dateTime3.getDeltaYears(dateTime8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "January" + "'", str4, "January");
        org.junit.Assert.assertNotNull(simpleDateFormat6);
        org.junit.Assert.assertNotNull(simpleDateFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UNKNOWN" + "'", str10, "UNKNOWN");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test8717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8717");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(100L);
        dateTime1.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(100L);
        double double12 = dateTime9.getDeltaYears(dateTime11);
        boolean boolean13 = dateTime11.isWeekday();
        java.util.Date date14 = dateTime11.getTime();
        dateTime1.set(dateTime11);
        int int16 = dateTime1.getYear();
        int int17 = dateTime1.getSecond();
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat23 = null;
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat23);
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double27 = dateTime24.getDeltaYears(dateTime26);
        boolean boolean28 = dateTime21.isLessThan(dateTime26);
        net.ajaskey.common.DateTime dateTime29 = dateTime1.copy(dateTime21);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime35 = new net.ajaskey.common.DateTime(100L);
        double double36 = dateTime33.getDeltaYears(dateTime35);
        int int37 = dateTime33.getHour();
        dateTime33.add(9, 3);
        java.text.SimpleDateFormat simpleDateFormat42 = null;
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat42);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double46 = dateTime43.getDeltaYears(dateTime45);
        boolean boolean47 = dateTime33.isEqual(dateTime45);
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat53 = null;
        net.ajaskey.common.DateTime dateTime54 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat53);
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double57 = dateTime54.getDeltaYears(dateTime56);
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean62 = dateTime56.isEqual(dateTime61);
        java.util.Calendar calendar63 = dateTime56.getCal();
        boolean boolean64 = dateTime51.isLessThan(dateTime56);
        dateTime51.setFirstWorkDay();
        boolean boolean66 = dateTime33.sameDate(dateTime51);
        net.ajaskey.common.DateTime dateTime67 = null;
        boolean boolean68 = net.ajaskey.common.Utils.sameMonth(dateTime33, dateTime67);
        java.lang.String str69 = dateTime33.getDay();
        int int70 = dateTime33.getHour();
        boolean boolean71 = dateTime1.sameDate(dateTime33);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1972.041095890411d) + "'", double12 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1969 + "'", int16 == 1969);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1972.041095890411d) + "'", double36 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(calendar63);
        org.junit.Assert.assertEquals(calendar63.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Thursday" + "'", str69, "Thursday");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test8718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8718");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("                                     2", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              -1,593,103,388,831.00");
        java.lang.String str3 = dateTime2.toString();
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:54", "                       25");
        int int7 = dateTime6.getHour();
        boolean boolean8 = net.ajaskey.common.Utils.sameDate(dateTime2, dateTime6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test8719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8719");
        java.text.SimpleDateFormat simpleDateFormat3 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime("", simpleDateFormat3, simpleDateFormat4);
        java.text.SimpleDateFormat simpleDateFormat7 = null;
        java.text.SimpleDateFormat simpleDateFormat8 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("January", simpleDateFormat7, simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat3, simpleDateFormat8);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime("Mon 06-Jan-0100 17:00:00", simpleDateFormat8);
        java.text.SimpleDateFormat simpleDateFormat13 = null;
        net.ajaskey.common.DateTime dateTime14 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat13);
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double17 = dateTime14.getDeltaYears(dateTime16);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(dateTime14);
        int int19 = dateTime14.getDayOfYear();
        java.util.Date date20 = dateTime14.getTime();
        int int21 = dateTime14.getSecond();
        dateTime14.add(1866, (int) (short) 1);
        boolean boolean25 = dateTime11.isEqual(dateTime14);
        dateTime11.setFirstWorkDay();
        org.junit.Assert.assertNotNull(simpleDateFormat3);
        org.junit.Assert.assertNotNull(simpleDateFormat4);
        org.junit.Assert.assertNotNull(simpleDateFormat8);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test8720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8720");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("Thu 10-Apr-0002 10:45:13");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test8721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8721");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        int int7 = dateTime3.getHour();
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime();
        net.ajaskey.common.DateTime dateTime9 = null;
        boolean boolean10 = dateTime8.isGreaterThan(dateTime9);
        java.text.SimpleDateFormat simpleDateFormat12 = null;
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat12);
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double16 = dateTime13.getDeltaYears(dateTime15);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        boolean boolean21 = dateTime15.isEqual(dateTime20);
        java.util.Calendar calendar22 = dateTime15.getCal();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(calendar22);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime(calendar22);
        boolean boolean25 = dateTime8.isLessThan(dateTime24);
        boolean boolean26 = dateTime3.isLessThan(dateTime8);
        java.lang.String str28 = dateTime3.format("     0");
        java.lang.String str30 = dateTime3.format("BAD-DATE-FORMAT");
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime(100L);
        int int33 = dateTime32.getMs();
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime39 = new net.ajaskey.common.DateTime(100L);
        double double40 = dateTime37.getDeltaYears(dateTime39);
        java.text.SimpleDateFormat simpleDateFormat41 = dateTime37.getSdf();
        boolean boolean42 = dateTime32.isLessThanOrEqual(dateTime37);
        java.text.SimpleDateFormat simpleDateFormat44 = null;
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat44);
        net.ajaskey.common.DateTime dateTime47 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double48 = dateTime45.getDeltaYears(dateTime47);
        boolean boolean49 = dateTime45.isWeekday();
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long54 = dateTime45.getDeltaDays(dateTime53);
        long long55 = dateTime32.getDeltaDays(dateTime53);
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime(100L);
        dateTime57.set((int) (byte) 100, (-1), (int) '#');
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime67 = new net.ajaskey.common.DateTime(100L);
        double double68 = dateTime65.getDeltaYears(dateTime67);
        boolean boolean69 = dateTime67.isWeekday();
        java.util.Date date70 = dateTime67.getTime();
        dateTime57.set(dateTime67);
        boolean boolean72 = dateTime32.isEqual(dateTime57);
        java.util.Calendar calendar73 = dateTime32.getCal();
        net.ajaskey.common.DateTime dateTime77 = new net.ajaskey.common.DateTime(5, (int) (byte) 1, (int) '4');
        net.ajaskey.common.DateTime dateTime78 = dateTime32.copy(dateTime77);
        java.lang.String str79 = dateTime32.toString();
        boolean boolean80 = dateTime3.isEqual(dateTime32);
        net.ajaskey.common.DateTime dateTime81 = null;
        net.ajaskey.common.DateTime dateTime82 = new net.ajaskey.common.DateTime(dateTime81);
        dateTime82.set(42, 10, 10);
        java.lang.String str88 = dateTime82.format("                                                                                                                                                                                                                                                                                                                                                                        1,869");
        java.lang.String str89 = dateTime82.toFullString();
        boolean boolean90 = dateTime3.isGreaterThan(dateTime82);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "     0" + "'", str28, "     0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "BAD-DATE-FORMAT" + "'", str30, "BAD-DATE-FORMAT");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1972.041095890411d) + "'", double40 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 719795L + "'", long55 == 719795L);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1972.041095890411d) + "'", double68 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(calendar73);
        org.junit.Assert.assertEquals(calendar73.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "31-Dec-1969" + "'", str79, "31-Dec-1969");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                        1,869" + "'", str88, "                                                                                                                                                                                                                                                                                                                                                                        1,869");
// flaky:         org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Sat 10-Nov-0042 10:47:50" + "'", str89, "Sat 10-Nov-0042 10:47:50");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test8722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8722");
        java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat7 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime("", simpleDateFormat6, simpleDateFormat7);
        java.text.SimpleDateFormat simpleDateFormat10 = null;
        java.text.SimpleDateFormat simpleDateFormat11 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime12 = new net.ajaskey.common.DateTime("January", simpleDateFormat10, simpleDateFormat11);
        net.ajaskey.common.DateTime dateTime13 = new net.ajaskey.common.DateTime("Wednesday", simpleDateFormat6, simpleDateFormat11);
        java.text.SimpleDateFormat simpleDateFormat16 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat17 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime("", simpleDateFormat16, simpleDateFormat17);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime(100L);
        int int21 = dateTime20.getMs();
        java.text.SimpleDateFormat simpleDateFormat22 = net.ajaskey.common.Utils.sdf;
        dateTime20.setSdf(simpleDateFormat22);
        net.ajaskey.common.DateTime dateTime24 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat17, simpleDateFormat22);
        net.ajaskey.common.DateTime dateTime25 = new net.ajaskey.common.DateTime("                             100", simpleDateFormat11, simpleDateFormat17);
        java.text.SimpleDateFormat simpleDateFormat28 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat29 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime("", simpleDateFormat28, simpleDateFormat29);
        net.ajaskey.common.DateTime dateTime31 = new net.ajaskey.common.DateTime("Thu 10-Apr-0002 10:42:54", simpleDateFormat28);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("5.00", simpleDateFormat11, simpleDateFormat28);
        net.ajaskey.common.DateTime dateTime33 = new net.ajaskey.common.DateTime("", simpleDateFormat11);
        java.text.SimpleDateFormat simpleDateFormat36 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime37 = new net.ajaskey.common.DateTime("January", simpleDateFormat36);
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime(25, 1, 0);
        java.text.SimpleDateFormat simpleDateFormat44 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat45 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime("", simpleDateFormat44, simpleDateFormat45);
        java.text.SimpleDateFormat simpleDateFormat49 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat50 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime51 = new net.ajaskey.common.DateTime("", simpleDateFormat49, simpleDateFormat50);
        net.ajaskey.common.DateTime dateTime53 = new net.ajaskey.common.DateTime(100L);
        int int54 = dateTime53.getMs();
        java.text.SimpleDateFormat simpleDateFormat55 = net.ajaskey.common.Utils.sdf;
        dateTime53.setSdf(simpleDateFormat55);
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime("31-Dec-1969", simpleDateFormat50, simpleDateFormat55);
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime("     0", simpleDateFormat45, simpleDateFormat55);
        dateTime41.setSdf(simpleDateFormat45);
        net.ajaskey.common.DateTime dateTime60 = new net.ajaskey.common.DateTime("                              62,190,310,557,275", simpleDateFormat36, simpleDateFormat45);
        net.ajaskey.common.DateTime dateTime61 = new net.ajaskey.common.DateTime("                                                                                                                                                                                                                                                                                                                       857", simpleDateFormat11, simpleDateFormat36);
        org.junit.Assert.assertNotNull(simpleDateFormat6);
        org.junit.Assert.assertNotNull(simpleDateFormat7);
        org.junit.Assert.assertNotNull(simpleDateFormat11);
        org.junit.Assert.assertNotNull(simpleDateFormat16);
        org.junit.Assert.assertNotNull(simpleDateFormat17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat22);
        org.junit.Assert.assertNotNull(simpleDateFormat28);
        org.junit.Assert.assertNotNull(simpleDateFormat29);
        org.junit.Assert.assertNotNull(simpleDateFormat36);
        org.junit.Assert.assertNotNull(simpleDateFormat44);
        org.junit.Assert.assertNotNull(simpleDateFormat45);
        org.junit.Assert.assertNotNull(simpleDateFormat49);
        org.junit.Assert.assertNotNull(simpleDateFormat50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat55);
    }

    @Test
    public void test8723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8723");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 31, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test8724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8724");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Thu 10-Apr-0002 10:43:50", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test8725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8725");
        net.ajaskey.common.Utils.sleep(762);
    }

    @Test
    public void test8726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8726");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
        int int8 = dateTime3.getHour();
        int int9 = dateTime3.getHour();
        java.text.SimpleDateFormat simpleDateFormat10 = dateTime3.getSdf();
        java.lang.String str11 = dateTime3.format();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(simpleDateFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "BAD-DATE-FORMAT" + "'", str11, "BAD-DATE-FORMAT");
    }

    @Test
    public void test8727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8727");
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("Thu 25-Jun-2020 10:46:03", "                                                                                                                                                                              525");
    }

    @Test
    public void test8728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8728");
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime((long) (-1870));
        net.ajaskey.common.DateTime dateTime3 = dateTime1.parse("");
        dateTime1.add(30, 38);
        int int7 = dateTime1.getDayOfYear();
        org.junit.Assert.assertNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
    }

    @Test
    public void test8729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8729");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                                                                                                                                                                                                                                                                           821", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test8730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8730");
        net.ajaskey.common.Utils.TAB = "           323";
    }

    @Test
    public void test8731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8731");
        net.ajaskey.common.TextUtils.printline("                                                                                                                                                                                                                                                                       68");
    }

    @Test
    public void test8732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8732");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat5 = null;
        net.ajaskey.common.DateTime dateTime6 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat5);
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double9 = dateTime6.getDeltaYears(dateTime8);
        boolean boolean10 = dateTime3.isLessThan(dateTime8);
        dateTime8.set(3, 365, 0);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.text.SimpleDateFormat simpleDateFormat20 = null;
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat20);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double24 = dateTime21.getDeltaYears(dateTime23);
        boolean boolean25 = dateTime18.isLessThan(dateTime23);
        java.lang.String str26 = dateTime18.getDay();
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
        boolean boolean45 = dateTime18.isLessThanOrEqual(dateTime42);
        boolean boolean46 = dateTime8.isLessThan(dateTime42);
        int int47 = dateTime42.getHour();
        java.lang.String str49 = dateTime42.format("Thu 10-Apr-0002 10:46:56");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Thursday" + "'", str26, "Thursday");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1972.041095890411d) + "'", double33 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "BAD-DATE-FORMAT" + "'", str49, "BAD-DATE-FORMAT");
    }

    @Test
    public void test8733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8733");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 907);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8734");
        java.text.SimpleDateFormat simpleDateFormat1 = null;
        net.ajaskey.common.DateTime dateTime2 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat1);
        net.ajaskey.common.DateTime dateTime4 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double5 = dateTime2.getDeltaYears(dateTime4);
        java.lang.String str6 = dateTime4.getMonth();
        boolean boolean7 = dateTime4.isNull();
        boolean boolean8 = dateTime4.isNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "December" + "'", str6, "December");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test8735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8735");
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
        net.ajaskey.common.DateTime dateTime23 = dateTime3.parse("                                                                                                                                                                                                                                            10", "10-May-0100");
        net.ajaskey.common.DateTime dateTime26 = new net.ajaskey.common.DateTime(100L);
        int int27 = dateTime26.getMs();
        java.text.SimpleDateFormat simpleDateFormat28 = net.ajaskey.common.Utils.sdf;
        dateTime26.setSdf(simpleDateFormat28);
        java.text.SimpleDateFormat simpleDateFormat30 = net.ajaskey.common.Utils.sdfFull;
        dateTime26.setSdf(simpleDateFormat30);
        net.ajaskey.common.DateTime dateTime32 = new net.ajaskey.common.DateTime("Mon 10-Apr-0002 00:00:00", simpleDateFormat30);
        boolean boolean33 = net.ajaskey.common.Utils.sameDate(dateTime3, dateTime32);
        dateTime3.set((-1933), 314, 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(simpleDateFormat28);
        org.junit.Assert.assertNotNull(simpleDateFormat30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test8736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8736");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        java.text.SimpleDateFormat simpleDateFormat7 = dateTime3.getSdf();
        int int8 = dateTime3.getMinute();
        int int9 = dateTime3.getDayOfYear();
        net.ajaskey.common.DateTime dateTime10 = null;
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime(dateTime10);
        dateTime11.set(42, 10, 10);
        java.util.Date date16 = dateTime11.getTime();
        net.ajaskey.common.DateTime dateTime17 = new net.ajaskey.common.DateTime(date16);
        net.ajaskey.common.DateTime dateTime18 = new net.ajaskey.common.DateTime(date16);
        java.lang.String str19 = dateTime18.getMonth();
        boolean boolean20 = dateTime3.sameDate(dateTime18);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime(100L);
        dateTime22.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str27 = dateTime22.getMonth();
        net.ajaskey.common.DateTime dateTime29 = new net.ajaskey.common.DateTime(100L);
        dateTime29.set((int) (byte) 100, (-1), (int) '#');
        java.lang.String str34 = dateTime29.getMonth();
        int int35 = dateTime29.getMs();
        net.ajaskey.common.DateTime dateTime36 = dateTime22.copy(dateTime29);
        int int37 = dateTime36.getMs();
        net.ajaskey.common.DateTime dateTime39 = dateTime36.parse("                              1,927");
        net.ajaskey.common.DateTime dateTime40 = dateTime3.copy(dateTime39);
        net.ajaskey.common.DateTime dateTime44 = new net.ajaskey.common.DateTime(35, 262, 0);
        net.ajaskey.common.DateTime dateTime45 = new net.ajaskey.common.DateTime(dateTime44);
        java.text.SimpleDateFormat simpleDateFormat47 = null;
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat47);
        net.ajaskey.common.DateTime dateTime50 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double51 = dateTime48.getDeltaYears(dateTime50);
        java.text.SimpleDateFormat simpleDateFormat54 = null;
        java.text.SimpleDateFormat simpleDateFormat55 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime56 = new net.ajaskey.common.DateTime("January", simpleDateFormat54, simpleDateFormat55);
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime("Thursday", simpleDateFormat54);
        net.ajaskey.common.DateTime dateTime58 = new net.ajaskey.common.DateTime(dateTime57);
        boolean boolean59 = dateTime48.isEqual(dateTime57);
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime(100L);
        double double66 = dateTime63.getDeltaYears(dateTime65);
        int int67 = dateTime63.getHour();
        java.util.Calendar calendar68 = dateTime63.getCal();
        net.ajaskey.common.DateTime dateTime69 = new net.ajaskey.common.DateTime(calendar68);
        dateTime57.set(calendar68);
        net.ajaskey.common.DateTime dateTime71 = new net.ajaskey.common.DateTime(calendar68);
        dateTime44.set(dateTime71);
        dateTime71.set(94, 98, (int) '#');
        boolean boolean77 = net.ajaskey.common.Utils.sameMonth(dateTime3, dateTime71);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 47 + "'", int8 == 47);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 10 10:47:51 MST 42");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "November" + "'", str19, "November");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "January" + "'", str27, "January");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "January" + "'", str34, "January");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNull(dateTime39);
        org.junit.Assert.assertNull(dateTime40);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(simpleDateFormat55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1972.041095890411d) + "'", double66 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertNotNull(calendar68);
// flaky:         org.junit.Assert.assertEquals(calendar68.toString(), "java.util.GregorianCalendar[time=-62190310328770,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=51,MILLISECOND=230,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test8737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8737");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-4982L), (-15));
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test8738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8738");
        net.ajaskey.common.DateTime dateTime0 = null;
        net.ajaskey.common.DateTime dateTime1 = new net.ajaskey.common.DateTime(dateTime0);
        dateTime1.set(42, 10, 10);
        java.util.Date date6 = dateTime1.getTime();
        net.ajaskey.common.DateTime dateTime7 = new net.ajaskey.common.DateTime(date6);
        net.ajaskey.common.DateTime dateTime11 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        java.util.Calendar calendar12 = null;
        dateTime11.set(calendar12);
        java.text.SimpleDateFormat simpleDateFormat15 = null;
        net.ajaskey.common.DateTime dateTime16 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat15);
        dateTime16.set((int) ' ', 0, 11);
        boolean boolean21 = dateTime16.isWeekday();
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime(100L);
        int int24 = dateTime23.getMs();
        net.ajaskey.common.DateTime dateTime28 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime30 = new net.ajaskey.common.DateTime(100L);
        double double31 = dateTime28.getDeltaYears(dateTime30);
        java.text.SimpleDateFormat simpleDateFormat32 = dateTime28.getSdf();
        boolean boolean33 = dateTime23.isLessThanOrEqual(dateTime28);
        java.util.Date date34 = dateTime28.getTime();
        dateTime16.set(date34);
        long long36 = dateTime11.getDeltaMilliSeconds(dateTime16);
        boolean boolean37 = net.ajaskey.common.Utils.sameDate(dateTime7, dateTime11);
        int int38 = dateTime7.getSecond();
        java.lang.String str39 = dateTime7.getDay();
        net.ajaskey.common.DateTime dateTime41 = new net.ajaskey.common.DateTime((-1593103420513L));
        java.util.Date date42 = dateTime41.getTime();
        net.ajaskey.common.DateTime dateTime43 = new net.ajaskey.common.DateTime(date42);
        dateTime7.set(date42);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 10 10:47:51 MST 42");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1972.041095890411d) + "'", double31 == (-1972.041095890411d));
        org.junit.Assert.assertNull(simpleDateFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Thu Apr 10 10:47:51 MST 2");
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 51 + "'", int38 == 51);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Saturday" + "'", str39, "Saturday");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Jul 09 01:16:19 MDT 1919");
    }

    @Test
    public void test8739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8739");
        net.ajaskey.common.DateTime dateTime3 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime5 = new net.ajaskey.common.DateTime(100L);
        double double6 = dateTime3.getDeltaYears(dateTime5);
        boolean boolean7 = dateTime5.isWeekday();
        java.util.Date date8 = dateTime5.getTime();
        int int9 = dateTime5.getDayOfWeek();
        java.lang.String str10 = dateTime5.toFullString();
        net.ajaskey.common.DateTime dateTime13 = dateTime5.parse("    25", "                                                                                                   5");
        int int14 = dateTime5.getYear();
        dateTime5.add((int) (short) 0, 898);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1972.041095890411d) + "'", double6 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Wed 31-Dec-1969 17:00:00" + "'", str10, "Wed 31-Dec-1969 17:00:00");
        org.junit.Assert.assertNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1969 + "'", int14 == 1969);
    }

    @Test
    public void test8740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8740");
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
        net.ajaskey.common.DateTime dateTime46 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        net.ajaskey.common.DateTime dateTime48 = new net.ajaskey.common.DateTime(100L);
        double double49 = dateTime46.getDeltaYears(dateTime48);
        boolean boolean50 = dateTime48.isWeekday();
        java.util.Date date51 = dateTime48.getTime();
        net.ajaskey.common.DateTime dateTime52 = new net.ajaskey.common.DateTime(date51);
        java.text.SimpleDateFormat simpleDateFormat54 = null;
        net.ajaskey.common.DateTime dateTime55 = new net.ajaskey.common.DateTime("hi!", simpleDateFormat54);
        net.ajaskey.common.DateTime dateTime57 = new net.ajaskey.common.DateTime((long) (short) 0);
        double double58 = dateTime55.getDeltaYears(dateTime57);
        boolean boolean59 = dateTime55.isWeekday();
        net.ajaskey.common.DateTime dateTime63 = new net.ajaskey.common.DateTime((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        long long64 = dateTime55.getDeltaDays(dateTime63);
        net.ajaskey.common.DateTime dateTime65 = new net.ajaskey.common.DateTime(dateTime55);
        boolean boolean66 = dateTime52.isGreaterThan(dateTime55);
        boolean boolean67 = dateTime7.sameDate(dateTime52);
        java.lang.String str69 = dateTime52.format("January                                                                                               52.00                                                                                               52.00                                                                                               52.00                                                                                               52.00hi!                                                                                               52.00");
        java.util.Calendar calendar70 = dateTime52.getCal();
        dateTime52.setFirstWorkDay();
        java.lang.String str72 = dateTime52.toString();
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
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1972.041095890411d) + "'", double49 == (-1972.041095890411d));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Wed Dec 31 17:00:00 MST 1969");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "BAD-DATE-FORMAT" + "'", str69, "BAD-DATE-FORMAT");
        org.junit.Assert.assertNotNull(calendar70);
        org.junit.Assert.assertEquals(calendar70.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "31-Dec-1969" + "'", str72, "31-Dec-1969");
    }

    @Test
    public void test8741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests17.test8741");
        java.text.SimpleDateFormat simpleDateFormat4 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat6 = net.ajaskey.common.Utils.sdf;
        java.text.SimpleDateFormat simpleDateFormat7 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime8 = new net.ajaskey.common.DateTime("", simpleDateFormat6, simpleDateFormat7);
        net.ajaskey.common.DateTime dateTime9 = new net.ajaskey.common.DateTime("                                                                                               52.00", simpleDateFormat4, simpleDateFormat7);
        net.ajaskey.common.DateTime dateTime10 = new net.ajaskey.common.DateTime("10-Apr-0002", simpleDateFormat7);
        java.text.SimpleDateFormat simpleDateFormat13 = null;
        java.text.SimpleDateFormat simpleDateFormat14 = net.ajaskey.common.Utils.sdfFull;
        net.ajaskey.common.DateTime dateTime15 = new net.ajaskey.common.DateTime("January", simpleDateFormat13, simpleDateFormat14);
        java.text.SimpleDateFormat simpleDateFormat18 = net.ajaskey.common.Utils.sdf;
        net.ajaskey.common.DateTime dateTime19 = new net.ajaskey.common.DateTime("January", simpleDateFormat18);
        net.ajaskey.common.DateTime dateTime20 = new net.ajaskey.common.DateTime("", simpleDateFormat18);
        net.ajaskey.common.DateTime dateTime21 = new net.ajaskey.common.DateTime("", simpleDateFormat14, simpleDateFormat18);
        net.ajaskey.common.DateTime dateTime22 = new net.ajaskey.common.DateTime("January                                                                                               52.00                                                                                               52.00                                                                                               52.00                                                                                               52.00hi!                                                                                               52.00", simpleDateFormat7, simpleDateFormat18);
        net.ajaskey.common.DateTime dateTime23 = new net.ajaskey.common.DateTime("                                        33", simpleDateFormat7);
        net.ajaskey.common.DateTime dateTime25 = dateTime23.parse("Thu 10-Apr-0002 10:44:54");
        org.junit.Assert.assertNotNull(simpleDateFormat4);
        org.junit.Assert.assertNotNull(simpleDateFormat6);
        org.junit.Assert.assertNotNull(simpleDateFormat7);
        org.junit.Assert.assertNotNull(simpleDateFormat14);
        org.junit.Assert.assertNotNull(simpleDateFormat18);
        org.junit.Assert.assertNull(dateTime25);
    }
}
