package net.ajaskey.market.tools.SIP.BigDB;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.SipOutput;
import net.ajaskey.market.tools.SIP.SipUtils;

public class CompanyFileData {

  private static List<CompanyFileData> cfdList = new ArrayList<>();

  private static String fld[] = null;

  private static int NAME     = 0;
  private static int TICKER   = 1;
  private static int EXCHANGE = 2;
  private static int SECTOR   = 3;
  private static int INDUSTRY = 4;
  private static int SIC      = 5;
  private static int ADR      = 6;
  private static int DOW      = 7;
  private static int SNP      = 8;
  private static int DRP      = 9;
  private static int STREET   = 10;
  private static int CITY     = 11;
  private static int STATE    = 12;
  private static int COUNTRY  = 13;
  private static int ZIP      = 14;
  private static int PHONE    = 15;
  private static int WEB      = 16;
  private static int EMP      = 17;

  /**
   *
   * @param ticker
   * @return
   */
  public static CompanyFileData find(String ticker) {
    for (final CompanyFileData c : CompanyFileData.cfdList) {
      if (c.getTicker().equalsIgnoreCase(ticker)) {
        return c;
      }
    }
    return null;
  }

  public static int getADR() {
    return CompanyFileData.ADR;
  }

  public static List<CompanyFileData> getCfdList() {
    return CompanyFileData.cfdList;
  }

  public static List<CompanyFileData> getList() {
    return CompanyFileData.cfdList;
  }

  public static int getListCount() {
    return CompanyFileData.cfdList.size();
  }

  /**
   *
   * @return
   */
  public static String listToString() {
    String ret = "";
    for (final CompanyFileData c : CompanyFileData.cfdList) {
      ret += c.toString();
    }
    return ret;
  }

  /**
   *
   * @param filename
   * @return
   */
  public static void readSipData(String filename) {

    final List<String> data = TextUtils.readTextFile(filename, true);

    for (final String c : data) {

      CompanyFileData.fld = c.replace("\"", "").split(Utils.TAB);

      final CompanyFileData cfd = new CompanyFileData();

      cfd.ticker = CompanyFileData.fld[CompanyFileData.TICKER].trim();
      cfd.name = CompanyFileData.fld[CompanyFileData.NAME].trim();
      cfd.exchange = FieldData.convertExchange(CompanyFileData.fld[CompanyFileData.EXCHANGE].trim());
      cfd.sector = CompanyFileData.fld[CompanyFileData.SECTOR].trim();
      cfd.industry = CompanyFileData.fld[CompanyFileData.INDUSTRY].trim();
      cfd.sic = CompanyFileData.fld[CompanyFileData.SIC].trim();

      String tmp = CompanyFileData.fld[CompanyFileData.SNP].trim();
      if (tmp.equals("500")) {
        cfd.snpIndex = SnpEnum.SP500;
      }
      else if (tmp.equals("SmallCap 600")) {
        cfd.snpIndex = SnpEnum.SP600;
      }
      else if (tmp.equals("MidCap 400")) {
        cfd.snpIndex = SnpEnum.SP400;
      }
      else {
        cfd.snpIndex = SnpEnum.NONE;
      }

      try {
        cfd.dowIndex = DowEnum.valueOf(CompanyFileData.fld[CompanyFileData.DOW].trim().toUpperCase());
      }
      catch (Exception e) {
        cfd.dowIndex = DowEnum.NONE;
      }

      cfd.adr = Boolean.parseBoolean(CompanyFileData.fld[CompanyFileData.ADR].trim());
      cfd.drp = SipUtils.parseBoolean(CompanyFileData.fld[CompanyFileData.DRP].trim());
      cfd.street = CompanyFileData.fld[CompanyFileData.STREET].trim();
      cfd.city = CompanyFileData.fld[CompanyFileData.CITY].trim();
      cfd.state = CompanyFileData.fld[CompanyFileData.STATE].trim();
      cfd.country = CompanyFileData.fld[CompanyFileData.COUNTRY].trim();
      cfd.zip = CompanyFileData.fld[CompanyFileData.ZIP].trim();
      cfd.phone = CompanyFileData.fld[CompanyFileData.PHONE].trim();
      cfd.web = CompanyFileData.fld[CompanyFileData.WEB].trim();
      cfd.numEmployees = SipUtils.parseInt(CompanyFileData.fld[CompanyFileData.EMP].trim());

      CompanyFileData.cfdList.add(cfd);
    }
  }

  /**
   * 
   * @param input
   * @return
   */
  public static CompanyFileData readFromDb(List<String> input) {

    final CompanyFileData cfd = new CompanyFileData();

    for (final String s : input) {

      final String[] tfld = s.split(":");

      final String fld = tfld[0].trim();

      String val = "";
      String val2 = "";
      if (tfld.length > 2) {
        val = "http:";
        val2 = tfld[2].trim();
      }
      else if (tfld.length > 1) {
        val = tfld[1].trim();
      }

      if (fld.equals("ticker")) {
        cfd.setTicker(val);
      }
      else if (fld.equals("name")) {
        cfd.setName(val);
      }
      else if (fld.equals("exchange")) {
        cfd.setExchange(val);
      }
      else if (fld.equals("sector")) {
        cfd.setSector(val);
      }
      else if (fld.equals("industry")) {
        cfd.setIndustry(val);
      }
      else if (fld.equals("sic")) {
        cfd.setSic(val);
      }
      else if (fld.equals("employees")) {
        cfd.setNumEmployees(val);
      }
      else if (fld.equals("snp index")) {
        cfd.setSnpIndex(val);
      }
      else if (fld.equals("dow index")) {
        cfd.setDowIndex(val);
      }
      else if (fld.equals("adr")) {
        cfd.setAdr(val);
      }
      else if (fld.equals("drp")) {
        cfd.setDrp(val);
      }
      else if (fld.equals("street")) {
        cfd.setStreet(val);
      }
      else if (fld.equals("city")) {
        cfd.setCity(val);
      }
      else if (fld.equals("state")) {
        cfd.setState(val);
      }
      else if (fld.equals("country")) {
        cfd.setCountry(val);
      }
      else if (fld.equals("zip")) {
        cfd.setZip(val);
      }
      else if (fld.equals("phone")) {
        cfd.setPhone(val);
      }
      else if (fld.equals("web")) {
        cfd.setWeb(val + val2);
      }
    }

    return cfd;
  }

  private String   name;
  private String   ticker;
  private ExchEnum exchange;
  private String   sector;
  private String   industry;
  private String   sic;
  private boolean  adr;
  private DowEnum  dowIndex;
  private SnpEnum  snpIndex;
  private boolean  drp;
  private String   street;
  private String   city;
  private String   state;
  private String   country;
  private String   zip;
  private String   phone;
  private String   web;
  private int      numEmployees;

  public String getCity() {
    return this.city;
  }

  public String getCountry() {
    return this.country;
  }

  public DowEnum getDowIndex() {
    return this.dowIndex;
  }

  public String getDowIndexStr() {
    return this.dowIndex.toString().toUpperCase();
  }

  public ExchEnum getExchange() {
    return this.exchange;
  }

  public String getIndustry() {
    return this.industry;
  }

  public String getName() {
    return this.name;
  }

  public int getNumEmployees() {
    return this.numEmployees;
  }

  public String getPhone() {
    return this.phone;
  }

  public String getSector() {
    return this.sector;
  }

  public String getSic() {
    return this.sic;
  }

  public SnpEnum getSnpIndex() {
    return this.snpIndex;
  }

  public String getSnpIndexStr() {
    return this.snpIndex.toString().toUpperCase();
  }

  public String getState() {
    return this.state;
  }

  public String getStreet() {
    return this.street;
  }

  public String getTicker() {
    return this.ticker;
  }

  public String getWeb() {
    return this.web;
  }

  public String getZip() {
    return this.zip;
  }

  public boolean isAdr() {
    return this.adr;
  }

  public boolean isDrp() {
    return this.drp;
  }

  /**
   *
   * @param i
   * @return
   */
  public List<String> set(List<String> data) {

    final List<String> notFound = new ArrayList<>();

    for (final String s : data) {

      final String[] tfld = s.split(":");

      final String fld = tfld[0].trim();

      String val = "";
      String val2 = "";
      if (tfld.length > 2) {
        val = "http:";
        val2 = tfld[2].trim();
      }
      else if (tfld.length > 1) {
        val = tfld[1].trim();
      }

      if (fld.equals("ticker")) {
        this.ticker = val;
      }
      else if (fld.equals("name")) {
        this.name = val;
      }
      else if (fld.equals("exchange")) {
        this.exchange = ExchEnum.valueOf(val);
      }
      else if (fld.equals("sector")) {
        this.sector = val;
      }
      else if (fld.equals("industry")) {
        this.industry = val;
      }
      else if (fld.equals("sic")) {
        this.sic = val;
      }
      else if (fld.equals("employees")) {
        this.numEmployees = SipUtils.parseInt(val);
      }
      else if (fld.equals("snp index")) {
        this.snpIndex = SnpEnum.valueOf(val);
      }
      else if (fld.equals("dow index")) {
        this.dowIndex = DowEnum.valueOf(val);
      }
      else if (fld.equals("adr")) {
        this.adr = SipUtils.parseBoolean(val);
      }
      else if (fld.equals("drp")) {
        this.drp = SipUtils.parseBoolean(val);
      }
      else if (fld.equals("street")) {
        this.street = val;
      }
      else if (fld.equals("city")) {
        this.city = val;
      }
      else if (fld.equals("state")) {
        this.state = val;
      }
      else if (fld.equals("country")) {
        this.country = val;
      }
      else if (fld.equals("zip")) {
        this.zip = val;
      }
      else if (fld.equals("phone")) {
        this.phone = val;
      }
      else if (fld.equals("web")) {
        this.web = val + val2;
      }
      else if (fld.contains("Data for ")) {
      }
      else {
        notFound.add(fld);
        // System.out.printf("Unknown tag '%s' in Company File Data%n", fld);
      }
    }
    return notFound;
  }

  public void setAdr(String adr) {
    this.adr = SipUtils.parseBoolean(adr);
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public void setDowIndex(String dowIdx) {
    try {
      this.dowIndex = DowEnum.valueOf(dowIdx.toUpperCase());
    }
    catch (Exception e) {
      this.dowIndex = DowEnum.NONE;
    }
  }

  public void setDrp(String drp) {
    this.drp = SipUtils.parseBoolean(drp);
  }

  public void setExchange(String exch) {

    this.exchange = ExchEnum.valueOf(exch);
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNumEmployees(String numEmployees) {
    this.numEmployees = SipUtils.parseInt(numEmployees);
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setSector(String sector) {
    this.sector = sector;
  }

  public void setSic(String sic) {
    this.sic = sic;
  }

  public void setSnpIndex(String strIdx) {
    try {
      this.snpIndex = SnpEnum.valueOf(strIdx.toUpperCase());
    }
    catch (Exception e) {
      this.snpIndex = SnpEnum.NONE;
    }
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public void setWeb(String web) {
    this.web = web;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String toDbOuput() {
    String ret = String.format("ticker      : %s%n", this.ticker);
    ret += String.format("  name      : %s%n", this.name);
    ret += String.format("  exchange  : %s%n", this.exchange);
    ret += String.format("  sector    : %s%n", this.sector);
    ret += String.format("  industry  : %s%n", this.industry);
    ret += String.format("  sic       : %s%n", this.getSic());
    ret += String.format("  employees : %d%n", this.getNumEmployees());
    ret += String.format("  snp index : %s%n", this.getSnpIndexStr());
    ret += String.format("  dow index : %s%n", this.getDowIndexStr());
    ret += String.format("  adr       : %s%n", this.adr);
    ret += String.format("  drp       : %s%n", this.drp);
    ret += String.format("  street    : %s%n", this.street);
    ret += String.format("  city      : %s%n", this.city);
    ret += String.format("  state     : %s%n", this.state);
    ret += String.format("  country   : %s%n", this.country);
    ret += String.format("  zip       : %s%n", this.zip);
    ret += String.format("  phone     : %s%n", this.phone);
    ret += String.format("  web       : %s%n", this.getWeb());
    return ret;
  }

  @Override
  public String toString() {
    String ret = SipOutput.SipHeader(this.ticker, this.name, this.getExchangeStr(), this.sector, this.industry);
    ret += String.format("  SIC     : %s%n", this.getSic());
    ret += String.format("  Index   : %-10s\t%-12s\t%s\t%s%n", this.getSnpIndexStr(), this.getDowIndexStr(), this.isAdr(), this.isDrp());
    ret += String.format("  Num Emp : %d%n", this.getNumEmployees());
    ret += String.format("  Address : %s\t%s\t%s\t%s\t%s\t%s%n", this.getStreet(), this.getCity(), this.getState(), this.getCountry(), this.getZip(),
        this.getPhone());
    ret += String.format("  Web     : %s%n", this.getWeb());
    return ret;
  }

  private String getExchangeStr() {
    return this.exchange.toString().toUpperCase();
  }

}
