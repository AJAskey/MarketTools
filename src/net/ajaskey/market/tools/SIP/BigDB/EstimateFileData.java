package net.ajaskey.market.tools.SIP.BigDB;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.SipOutput;
import net.ajaskey.market.tools.SIP.SipUtils;

public class EstimateFileData {

  private String   name;
  private String   ticker;
  private String   exchange;
  private String   sector;
  private String   industry;
  private DateTime currFiscalYear;
  private DateTime latestQtrEps;
  private double   epsQ0;
  private double   epsQ1;
  private double   epsY0;
  private double   epsY1;
  private double   epsY2;

  public EstimateFileData(String[] fld) {

    this.name = fld[0].trim();
    this.ticker = fld[1].trim();
    this.exchange = fld[2].trim();
    this.sector = fld[3].trim();
    this.industry = fld[4].trim();
    this.currFiscalYear = new DateTime(fld[5].trim(), "MM/dd/yyyy");
    this.latestQtrEps = new DateTime(fld[6].trim(), "MM/dd/yyyy");
    this.epsQ0 = SipUtils.parseDouble(fld[7]);
    this.epsQ1 = SipUtils.parseDouble(fld[8]);
    this.epsY0 = SipUtils.parseDouble(fld[9]);
    this.epsY1 = SipUtils.parseDouble(fld[10]);
    this.epsY2 = SipUtils.parseDouble(fld[11]);
  }

  public EstimateFileData() {
    // TODO Auto-generated constructor stub
  }

  public static int getListCount() {
    return efdList.size();
  }

  public DateTime getCurrFiscalYear() {
    return this.currFiscalYear;
  }

  public double getEpsQ0() {
    return this.epsQ0;
  }

  public double getEpsQ1() {
    return this.epsQ1;
  }

  public double getEpsY0() {
    return this.epsY0;
  }

  public double getEpsY1() {
    return this.epsY1;
  }

  public double getEpsY2() {
    return this.epsY2;
  }

  public String getExchange() {
    return this.exchange;
  }

  public String getIndustry() {
    return this.industry;
  }

  public DateTime getLatestQtrEps() {
    return this.latestQtrEps;
  }

  public String getName() {
    return this.name;
  }

  public String getSector() {
    return this.sector;
  }

  public String getTicker() {
    return this.ticker;
  }

  @Override
  public String toString() {
    String ret = SipOutput.SipHeader(this.ticker, this.name, this.exchange, this.sector, this.industry);
    ret += String.format("  %s  %s%n", this.currFiscalYear, this.latestQtrEps);
    ret += String.format("  Est Q0 Q1    : %10.3f %10.3f%n", this.epsQ0, this.epsQ1);
    ret += String.format("  Est Y0 Y1 Y2 : %10.3f %10.2f %10.3f", this.epsY0, this.epsY1, this.epsY2);
    return ret;
  }

  private static List<EstimateFileData> efdList = new ArrayList<>();

  /**
   * 
   * @param ticker
   * @return
   */
  public static EstimateFileData find(String ticker) {
    for (EstimateFileData e : EstimateFileData.efdList) {
      if (e.getTicker().equalsIgnoreCase(ticker)) {
        return e;
      }
    }
    return null;
  }

  /**
   * 
   * @return
   */
  public static String listToString() {
    String ret = "";
    for (EstimateFileData e : EstimateFileData.efdList) {
      ret += e.toString();
    }
    return ret;
  }

  /**
   *
   * @param filename
   * @return
   */
  public static void readData(String filename) {

    List<String> estData = TextUtils.readTextFile(filename, true);
    for (String s : estData) {
      String[] fld = s.replace("\"", "").split(Utils.TAB);
      EstimateFileData efd = new EstimateFileData(fld);
      EstimateFileData.efdList.add(efd);
    }

  }
}
