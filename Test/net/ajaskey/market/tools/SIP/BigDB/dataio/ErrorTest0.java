package net.ajaskey.market.tools.SIP.BigDB.dataio;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = companyFileData5.toDbOuput();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String str7 = companyFileData5.getDowIndexStr();
        companyFileData5.setSnpIndex("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = companyFileData5.toDbOuput();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getSnpIndexStr();
        companyFileData5.setTicker("");
        java.lang.String str11 = companyFileData5.getZip();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = companyFileData5.toDbOuput();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        java.lang.String str9 = companyFileData5.getSector();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = companyFileData5.toDbOuput();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = companyFileData1.toDbOuput();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = companyFileData12.toDbOuput();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        companyFileData5.setSector("");
        companyFileData5.setSnpIndex("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        companyFileData5.setCountry("out/BigDB/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = companyFileData5.getExchangeStr();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = companyFileData5.getExchange();
        java.lang.String str8 = companyFileData5.getWeb();
        companyFileData5.setCountry("NONE");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = companyFileData5.toDbOuput();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String str7 = companyFileData5.getDowIndexStr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = companyFileData5.toDbOuput();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = companyFileData13.getExchangeStr();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = companyFileData5.getExchangeStr();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = companyFileData5.getExchangeStr();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        java.lang.String str9 = companyFileData5.toString();
        java.lang.String str10 = companyFileData5.getIndustry();
        companyFileData5.setCountry("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = companyFileData5.getExchangeStr();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        boolean boolean6 = companyFileData5.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum7 = companyFileData5.getSnpIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = companyFileData5.getExchangeStr();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getSnpIndexStr();
        companyFileData5.setDowIndex("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        companyFileData5.setDowIndex("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = companyFileData5.toDbOuput();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        companyFileData10.setNumEmployees("data/BigDB/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = companyFileData10.getExchangeStr();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        companyFileData10.setCountry("Cash File Data");
        companyFileData10.setWeb("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        companyFileData10.setNumEmployees("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = companyFileData10.getExchangeStr();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData10);
        java.lang.String str16 = companyFileData10.getSic();
        java.lang.String str17 = companyFileData10.getTicker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = companyFileData10.getExchangeStr();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsYr();
        double[] doubleArray4 = incSheetFileData0.getNonrecurringItemsYr();
        double[] doubleArray5 = incSheetFileData0.getIncPrimaryEpsYr();
        double[] doubleArray6 = incSheetFileData0.getEpsDilYr();
        java.lang.String str7 = incSheetFileData0.toDbOutput();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str13 = estimateFileData12.getSector();
        java.lang.String str14 = estimateFileData12.toString();
        double double15 = estimateFileData12.getEpsY1();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = companyFileData21.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum23 = companyFileData21.getExchange();
        java.lang.String str24 = companyFileData21.getWeb();
        estimateFileData12.setNameFields(companyFileData21);
        boolean boolean26 = companyFileData21.isAdr();
        incSheetFileData0.setNameFields(companyFileData21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = companyFileData21.toDbOuput();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        companyFileData7.setStreet("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        java.lang.String str10 = companyFileData7.getZip();
        java.lang.String str11 = companyFileData7.getState();
        companyFileData7.setTicker("out/BigDB/10/Q-1/out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE-fundamental-data-10Q-1.Cash File Data");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = companyFileData7.toDbOuput();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        java.lang.String str9 = companyFileData5.getSector();
        java.lang.String str10 = companyFileData5.getSector();
        companyFileData5.setState("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        companyFileData5.setTicker("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = companyFileData5.toDbOuput();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        boolean boolean6 = companyFileData5.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum7 = companyFileData5.getSnpIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = companyFileData5.toDbOuput();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        java.lang.String str9 = companyFileData5.getSector();
        java.lang.String str10 = companyFileData5.getSector();
        companyFileData5.setState("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = companyFileData5.toDbOuput();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        companyFileData7.setStreet("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = companyFileData7.getExchangeStr();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        companyFileData10.setTicker("out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE");
        int int22 = companyFileData10.getNumEmployees();
        int int23 = companyFileData10.getNumEmployees();
        java.lang.String str24 = companyFileData10.getSic();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = companyFileData10.toDbOuput();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        double[] doubleArray1 = companyFileData0.getPriceQtr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = companyFileData0.getExchangeStr();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
        java.lang.String str21 = companyFileData13.getSector();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = companyFileData13.toDbOuput();
    }
}

