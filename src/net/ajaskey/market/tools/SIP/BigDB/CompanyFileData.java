package net.ajaskey.market.tools.SIP.BigDB;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.SipOutput;
import net.ajaskey.market.tools.SIP.SipUtils;

public class CompanyFileData {

  private String  name;
  private String  ticker;
  private String  exchange;
  private String  sector;
  private String  industry;
  private String  sic;
  private boolean adr;
  private String  dowIndex;
  private String  snpIndex;
  private boolean drp;
  private String  street;
  private String  city;
  private String  state;
  private String  country;
  private String  zip;
  private String  phone;
  private String  web;
  private int     numEmployees;

  public String getCity() {
    return this.city;
  }

  public String getCountry() {
    return this.country;
  }

  public String getDowIndex() {
    return this.dowIndex;
  }

  public String getExchange() {
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

  public String getSnpIndex() {
    return this.snpIndex;
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

  public void readDBFile() {

  }

  public String report() {
    String ret = String.format("ticker     : %s%n", this.ticker);
    ret += String.format("  name      : %s%n", this.name);
    ret += String.format("  exchange  : %s%n", this.exchange);
    ret += String.format("  sector    : %s%n", this.sector);
    ret += String.format("  industry  : %s%n", this.industry);
    ret += String.format("  sic       : %s%n", this.getSic());
    ret += String.format("  employees : %d%n", this.getNumEmployees());
    ret += String.format("  snp index : %s%n", this.snpIndex);
    ret += String.format("  dow index : %s%n", this.dowIndex);
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
        this.exchange = val;
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
        this.snpIndex = val;
      }
      else if (fld.equals("dow index")) {
        this.dowIndex = val;
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

  public void setDowIndex(String dowIndex) {
    this.dowIndex = dowIndex;
  }

  public void setDrp(String drp) {
    this.drp = SipUtils.parseBoolean(drp);
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
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

  public void setSnpIndex(String snpIndex) {
    this.snpIndex = snpIndex;
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

  @Override
  public String toString() {
    String ret = SipOutput.SipHeader(this.ticker, this.name, this.exchange, this.sector, this.industry);
    ret += String.format("  SIC     : %s%n", this.getSic());
    ret += String.format("  Index   : %-10s\t%-12s\t%s\t%s%n", this.getSnpIndex(), this.dowIndex, this.isAdr(), this.isDrp());
    ret += String.format("  Num Emp : %d%n", this.getNumEmployees());
    ret += String.format("  Address : %s\t%s\t%s\t%s\t%s\t%s%n", this.getStreet(), this.getCity(), this.getState(), this.getCountry(), this.getZip(),
        this.getPhone());
    ret += String.format("  Web     : %s%n", this.getWeb());
    return ret;
  }

  private static List<CompanyFileData> cfdList = new ArrayList<>();
  private static String                fld[]   = null;

  private static int NAME = 0;

  private static int TICKER = 1;

  private static int EXCHANGE = 2;

  private static int SECTOR = 3;

  private static int INDUSTRY = 4;

  private static int SIC = 5;

  private static int ADR = 6;

  private static int DOW = 7;

  private static int SNP = 8;

  private static int DRP = 9;

  private static int STREET = 10;

  private static int CITY = 11;

  private static int STATE = 12;

  private static int COUNTRY = 13;

  private static int ZIP = 14;

  private static int PHONE = 15;

  private static int WEB = 16;

  private static int EMP = 17;

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

  public static int getCITY() {
    return CompanyFileData.CITY;
  }

  public static int getCOUNTRY() {
    return CompanyFileData.COUNTRY;
  }

  public static int getDOW() {
    return CompanyFileData.DOW;
  }

  public static int getDRP() {
    return CompanyFileData.DRP;
  }

  public static int getEMP() {
    return CompanyFileData.EMP;
  }

  public static int getEXCHANGE() {
    return CompanyFileData.EXCHANGE;
  }

  public static String[] getFld() {
    return CompanyFileData.fld;
  }

  public static int getINDUSTRY() {
    return CompanyFileData.INDUSTRY;
  }

  public static List<CompanyFileData> getList() {
    return CompanyFileData.cfdList;
  }

  public static int getListCount() {
    return CompanyFileData.cfdList.size();
  }

  public static int getNAME() {
    return CompanyFileData.NAME;
  }

  public static int getPHONE() {
    return CompanyFileData.PHONE;
  }

  public static int getSECTOR() {
    return CompanyFileData.SECTOR;
  }

  public static int getSIC() {
    return CompanyFileData.SIC;
  }

  public static int getSNP() {
    return CompanyFileData.SNP;
  }

  public static int getSTATE() {
    return CompanyFileData.STATE;
  }

  public static int getSTREET() {
    return CompanyFileData.STREET;
  }

  public static int getTICKER() {
    return CompanyFileData.TICKER;
  }

  public static int getWEB() {
    return CompanyFileData.WEB;
  }

  public static int getZIP() {
    return CompanyFileData.ZIP;
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
  public static void readData(String filename) {

    final List<String> data = TextUtils.readTextFile(filename, true);

    for (final String c : data) {

      CompanyFileData.fld = c.replace("\"", "").split(Utils.TAB);

      final CompanyFileData cfd = new CompanyFileData();

      cfd.ticker = CompanyFileData.fld[CompanyFileData.TICKER].trim();
      cfd.name = CompanyFileData.fld[CompanyFileData.NAME].trim();
      cfd.exchange = CompanyFileData.fld[CompanyFileData.EXCHANGE].trim();
      cfd.sector = CompanyFileData.fld[CompanyFileData.SECTOR].trim();
      cfd.industry = CompanyFileData.fld[CompanyFileData.INDUSTRY].trim();
      cfd.sic = CompanyFileData.fld[CompanyFileData.SIC].trim();
      final String tmp = CompanyFileData.fld[CompanyFileData.SNP].trim();
      if (tmp.equals("500")) {
        cfd.snpIndex = "SP500";
      }
      else if (tmp.equals("SmallCap 600")) {
        cfd.snpIndex = "SP600";
      }
      else if (tmp.equals("MidCap 400")) {
        cfd.snpIndex = "SP400";
      }
      else {
        cfd.snpIndex = tmp;
      }
      cfd.dowIndex = CompanyFileData.fld[CompanyFileData.DOW].trim();
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

  public static void setADR(int aDR) {
    CompanyFileData.ADR = aDR;
  }

  public static void setCfdList(List<CompanyFileData> cfdList) {
    CompanyFileData.cfdList = cfdList;
  }

  public static void setCITY(int cITY) {
    CompanyFileData.CITY = cITY;
  }

  public static void setCOUNTRY(int cOUNTRY) {
    CompanyFileData.COUNTRY = cOUNTRY;
  }

  public static void setDOW(int dOW) {
    CompanyFileData.DOW = dOW;
  }

  public static void setDRP(int dRP) {
    CompanyFileData.DRP = dRP;
  }

  public static void setEMP(int eMP) {
    CompanyFileData.EMP = eMP;
  }

  public static void setEXCHANGE(int eXCHANGE) {
    CompanyFileData.EXCHANGE = eXCHANGE;
  }

  public static void setFld(String[] fld) {
    CompanyFileData.fld = fld;
  }

  public static void setINDUSTRY(int iNDUSTRY) {
    CompanyFileData.INDUSTRY = iNDUSTRY;
  }

  public static void setNAME(int nAME) {
    CompanyFileData.NAME = nAME;
  }

  public static void setPHONE(int pHONE) {
    CompanyFileData.PHONE = pHONE;
  }

  public static void setSECTOR(int sECTOR) {
    CompanyFileData.SECTOR = sECTOR;
  }

  public static void setSIC(int sIC) {
    CompanyFileData.SIC = sIC;
  }

  public static void setSNP(int sNP) {
    CompanyFileData.SNP = sNP;
  }

  public static void setSTATE(int sTATE) {
    CompanyFileData.STATE = sTATE;
  }

  public static void setSTREET(int sTREET) {
    CompanyFileData.STREET = sTREET;
  }

  public static void setTICKER(int tICKER) {
    CompanyFileData.TICKER = tICKER;
  }

  public static void setWEB(int wEB) {
    CompanyFileData.WEB = wEB;
  }

  public static void setZIP(int zIP) {
    CompanyFileData.ZIP = zIP;
  }

}
