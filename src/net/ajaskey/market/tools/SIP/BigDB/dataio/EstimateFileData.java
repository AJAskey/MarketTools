package net.ajaskey.market.tools.SIP.BigDB.dataio;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.SipOutput;
import net.ajaskey.market.tools.SIP.SipUtils;

/**
 * This class contains procedures for reading Estimate SIP data and writing
 * common format file data.
 *
 * @author Andy Askey
 *         <p>
 *         Copyright (c) 2020, Andy Askey. All rights reserved.
 *         </p>
 *         <p>
 *         Permission is hereby granted, free of charge, to any person obtaining
 *         a copy of this software and associated documentation files (the
 *         "Software"), to deal in the Software without restriction, including
 *         without limitation the rights to use, copy, modify, merge, publish,
 *         distribute, sublicense, and/or sell copies of the Software, and to
 *         permit persons to whom the Software is furnished to do so, subject to
 *         the following conditions:
 *
 *         The above copyright notice and this permission notice shall be
 *         included in all copies or substantial portions of the Software.
 *         </p>
 *
 *         <p>
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *         EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *         MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *         NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 *         BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 *         ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 *         CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *         SOFTWARE.
 *         </p>
 *
 */
public class EstimateFileData {

  private static List<EstimateFileData> efdList = new ArrayList<>();

  /**
   *
   * @param ticker
   * @return
   */
  public static EstimateFileData find(String ticker) {
    for (final EstimateFileData e : EstimateFileData.efdList) {
      if (e.getTicker().equalsIgnoreCase(ticker)) {
        return e;
      }
    }
    return null;
  }

  public static int getListCount() {
    return EstimateFileData.efdList.size();
  }

  /**
   *
   * @return
   */
  public static String listToString() {
    String ret = "";
    for (final EstimateFileData e : EstimateFileData.efdList) {
      ret += e.toString();
    }
    return ret;
  }

  /**
   *
   * @param data
   * @return
   */
  public static EstimateFileData readFromDb(List<String> data) {

    final EstimateFileData efd = new EstimateFileData();

    for (final String s : data) {

      final String[] tfld = s.split(":");

      final String fld = tfld[0].trim();

      String val = "";
      if (tfld.length > 1) {
        val = tfld[1].trim();
      }

      if (fld.equals("eps Q0")) {
        efd.epsQ0 = SipUtils.parseDouble(val);
      }
      else if (fld.equals("eqp Q1")) {
        efd.epsQ1 = SipUtils.parseDouble(val);
      }
      else if (fld.equals("eps Y0")) {
        efd.epsY0 = SipUtils.parseDouble(val);
      }
      else if (fld.equals("eps Y1")) {
        efd.epsY1 = SipUtils.parseDouble(val);
      }
      else if (fld.equals("eps Y2")) {
        efd.epsY2 = SipUtils.parseDouble(val);
      }
      else if (fld.equals("current fiscal year")) {
        efd.currFiscalYear = new DateTime(val, "yyyy-MM-dd");
      }
      else if (fld.equals("latest quarter eps")) {
        efd.latestQtrEps = new DateTime(val, "yyyy-MM-dd");
      }
    }
    return efd;

  }

  /**
   *
   * @param filename
   * @return
   */
  public static void readSipData(String filename) {

    final List<String> estData = TextUtils.readTextFile(filename, true);
    for (final String s : estData) {
      final String[] fld = s.replace("\"", "").split(Utils.TAB);
      final EstimateFileData efd = new EstimateFileData(fld);
      EstimateFileData.efdList.add(efd);
    }

  }

  private DateTime currFiscalYear;
  private double epsQ0;
  private double epsQ1;
  private double epsY0;
  private double epsY1;
  private double epsY2;

  private ExchEnum exchange;

  private String   industry;

  private DateTime latestQtrEps;

  private String   name;

  private String   sector;

  private String   ticker;

  public EstimateFileData() {
    // TODO Auto-generated constructor stub
  }

  public EstimateFileData(String[] fld) {

    this.name = fld[0].trim();
    this.ticker = fld[1].trim();
    this.exchange = FieldData.convertExchange(fld[2].trim());
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

  public ExchEnum getExchange() {
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

  public void setNameFields(CompanyFileData cfd) {
    this.ticker = cfd.getTicker();
    this.name = cfd.getName();
    this.sector = cfd.getSector();
    this.industry = cfd.getIndustry();
    this.exchange = cfd.getExchange();

  }

  public String toDbOutput() {
    String ret = "";

    String tmp = "";
    if (!this.currFiscalYear.isNull()) {
      tmp = this.currFiscalYear.format("yyyy-MM-dd");
    }
    ret += String.format("  current fiscal year : %s%n", tmp);

    tmp = "";
    if (!this.latestQtrEps.isNull()) {
      tmp = this.latestQtrEps.format("yyyy-MM-dd");
    }
    ret += String.format("  latest quarter eps  : %s%n", tmp);

    ret += String.format("  eps Q0              : %f%n", this.epsQ0);
    ret += String.format("  eps Q1              : %f%n", this.epsQ1);
    ret += String.format("  eps Y0              : %f%n", this.epsY0);
    ret += String.format("  eps Y1              : %f%n", this.epsY1);
    ret += String.format("  eps Y2              : %f%n", this.epsY2);

    return ret;
  }

  @Override
  public String toString() {
    String ret = SipOutput.SipHeader(this.ticker, this.name, FieldData.getExchangeStr(this.exchange), this.sector, this.industry);
    ret += String.format("  %s  %s%n", this.currFiscalYear, this.latestQtrEps);
    ret += String.format("  Est Q0 Q1    : %10.3f %10.3f%n", this.epsQ0, this.epsQ1);
    ret += String.format("  Est Y0 Y1 Y2 : %10.3f %10.2f %10.3f", this.epsY0, this.epsY1, this.epsY2);
    return ret;
  }
}
