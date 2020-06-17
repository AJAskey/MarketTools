package net.ajaskey.market.tools.SIP.BigDB;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.SipOutput;
import net.ajaskey.market.tools.SIP.SipUtils;

public class SharesFileData {

  private static List<SharesFileData> sfdList = new ArrayList<>();

  public static SharesFileData find(String ticker) {
    for (final SharesFileData s : SharesFileData.sfdList) {
      if (s.getTicker().equalsIgnoreCase(ticker)) {
        return s;
      }
    }
    return null;
  }

  public static int getListCount() {
    return SharesFileData.sfdList.size();
  }

  public static String listToString() {
    String ret = "";
    for (final SharesFileData s : SharesFileData.sfdList) {
      ret += s.toString();
    }
    return ret;
  }

  /**
   *
   * @param filename
   * @return
   */
  public static void readSipData(String filename) {

    final List<String> shrData = TextUtils.readTextFile(filename, true);
    for (final String s : shrData) {
      final String[] fld = s.replace("\"", "").split(Utils.TAB);
      final SharesFileData sfd = new SharesFileData(fld);
      SharesFileData.sfdList.add(sfd);
    }
  }

  public static SharesFileData readFromDb(List<String> data) {

    final SharesFileData sfd = new SharesFileData();

    for (final String s : data) {

      final String[] tfld = s.split(":");

      final String fld = tfld[0].trim();

      String val = "";
      if (tfld.length > 1) {
        val = tfld[1].trim();
      }

      if (fld.equals("price")) {
        sfd.setPrice(val);
      }
      else if (fld.equals("float")) {
        sfd.setFloatshr(val);
      }
      else if (fld.equals("market cap")) {
        sfd.setMktCap(val);
      }
      else if (fld.equals("volume 3m avg")) {
        sfd.setVolume3m(val);
      }
      else if (fld.equals("dollars 3m avg")) {
        sfd.setDollar3m(val);
      }
      else if (fld.equals("beta")) {
        sfd.setBeta(val);
      }
      else if (fld.equals("insider ownership")) {
        sfd.setInsiderOwnership(val);
      }
      else if (fld.equals("insider buys")) {
        sfd.setInsiderBuys(val);
      }
      else if (fld.equals("insider buy shares")) {
        sfd.setInsiderBuyShrs(val);
      }
      else if (fld.equals("insider sells")) {
        sfd.setInsiderSells(val);
      }
      else if (fld.equals("insider sell shares")) {
        sfd.setInsiderSellShrs(val);
      }
      else if (fld.equals("insider net shares")) {
        sfd.setInsiderNetTrades(val);
      }
      else if (fld.equals("inst buy shares")) {
        sfd.setInstBuyShrs(val);
      }
      else if (fld.equals("inst sell shares")) {
        sfd.setInstSellShrs(val);
      }
      else if (fld.equals("inst shareholders")) {
        sfd.setInstShareholders(val);
      } //
      else if (fld.equals("inst ownership")) {
        sfd.setInstOwnership(val);
      }
      else if (fld.equals("shares quarterly")) {
        final double[] sharesQ = SipUtils.parseArrayDoubles(tfld[1], 1);
        sfd.setSharesQ(sharesQ);
      }
      else if (fld.equals("shares yearly")) {
        final double[] sharesY = SipUtils.parseArrayDoubles(tfld[1], 1);
        sfd.setSharesY(sharesY);
      }

    }
    return sfd;

  }

  public static void setSfdList(List<SharesFileData> sfdList) {
    SharesFileData.sfdList = sfdList;
  }

  private String name;
  private String ticker;

  private String exchange;

  private String sector;

  private String industry;

  private double beta;

  private double floatshr;

  private double insiderOwnership;

  private int insiderBuys;

  private int insiderNetTrades;

  private int insiderSells;

  private int insiderBuyShrs;

  private int insiderSellShrs;

  private double instOwnership;

  private int instShareholders;

  private int instBuyShrs;

  private int instSellShrs;

  private double mktCap;

  private double insiderNetPercentOutstanding;

  private double price;

  private double[] sharesQ;

  private double[] sharesY;

  private long   volume3m;
  private double dollar3m;

  public SharesFileData() {
    this.sharesQ = new double[1];
    this.sharesQ[0] = 0.0;
    this.sharesY = new double[1];
    this.sharesY[0] = 0.0;
  }

  public SharesFileData(String[] fld) {
    this.name = fld[0].trim();
    this.ticker = fld[1].trim();
    this.exchange = fld[2].trim();
    this.sector = fld[3].trim();
    this.industry = fld[4].trim();
    this.beta = SipUtils.parseDouble(fld[5]);
    this.floatshr = SipUtils.parseDouble(fld[6]);
    this.insiderOwnership = SipUtils.parseDouble(fld[7]);
    this.insiderBuys = SipUtils.parseInt(fld[8]);
    this.insiderNetTrades = SipUtils.parseInt(fld[9]);
    this.insiderSells = SipUtils.parseInt(fld[10]);
    this.insiderBuyShrs = SipUtils.parseInt(fld[11]);
    this.insiderSellShrs = SipUtils.parseInt(fld[12]);
    this.instOwnership = SipUtils.parseDouble(fld[13]);
    this.instShareholders = SipUtils.parseInt(fld[14]);
    this.instBuyShrs = SipUtils.parseInt(fld[15]);
    this.instSellShrs = SipUtils.parseInt(fld[16]);
    this.mktCap = SipUtils.parseDouble(fld[17]);
    this.insiderNetPercentOutstanding = SipUtils.parseDouble(fld[18]);
    this.price = SipUtils.parseDouble(fld[19]);
    this.sharesQ = SipUtils.parseDoubles(fld, 38, 8);
    this.sharesY = SipUtils.parseDoubles(fld, 46, 7);
    this.volume3m = SipUtils.parseLong(fld[57]);
    this.dollar3m = SipUtils.parseDouble(fld[58]);
  }

  public double getBeta() {
    return this.beta;
  }

  public double getDollar3m() {
    return this.dollar3m;
  }

  public String getExchange() {
    return this.exchange;
  }

  public double getFloatshr() {
    return this.floatshr;
  }

  public String getIndustry() {
    return this.industry;
  }

  public int getInsiderBuys() {
    return this.insiderBuys;
  }

  public int getInsiderBuyShrs() {
    return this.insiderBuyShrs;
  }

  public double getInsiderNetPercentOutstanding() {
    return this.insiderNetPercentOutstanding;
  }

  public int getInsiderNetTrades() {
    return this.insiderNetTrades;
  }

  public double getInsiderOwnership() {
    return this.insiderOwnership;
  }

  public int getInsiderSells() {
    return this.insiderSells;
  }

  public int getInsiderSellShrs() {
    return this.insiderSellShrs;
  }

  public int getInstBuyShrs() {
    return this.instBuyShrs;
  }

  public double getInstOwnership() {
    return this.instOwnership;
  }

  public int getInstSellShrs() {
    return this.instSellShrs;
  }

  public int getInstShareholders() {
    return this.instShareholders;
  }

  public double getMktCap() {
    return this.mktCap;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public String getSector() {
    return this.sector;
  }

  public double[] getSharesQ() {
    return this.sharesQ;
  }

  public double[] getSharesY() {
    return this.sharesY;
  }

  public String getTicker() {
    return this.ticker;
  }

  public long getVolume3m() {
    return this.volume3m;
  }

  public void setBeta(String fld) {
    this.beta = SipUtils.parseDouble(fld);
  }

  public void setDollar3m(String fld) {
    this.dollar3m = SipUtils.parseLong(fld);
  }

  public void setFloatshr(String fld) {
    this.floatshr = SipUtils.parseDouble(fld);
  }

  public void setFromReport(int year, int quarter) {

  }

  public void setInsiderBuys(String fld) {
    this.insiderBuys = SipUtils.parseInt(fld);
  }

  public void setInsiderBuyShrs(String fld) {
    this.insiderBuyShrs = SipUtils.parseInt(fld);
  }

  public void setInsiderNetPercentOutstanding(String fld) {
    this.insiderNetPercentOutstanding = SipUtils.parseDouble(fld);
  }

  public void setInsiderNetTrades(String fld) {
    this.insiderNetTrades = SipUtils.parseInt(fld);
  }

  public void setInsiderOwnership(String fld) {
    this.insiderOwnership = SipUtils.parseDouble(fld);
  }

  public void setInsiderSells(String fld) {
    this.insiderSells = SipUtils.parseInt(fld);
  }

  public void setInsiderSellShrs(String fld) {
    this.insiderSellShrs = SipUtils.parseInt(fld);
  }

  public void setInstBuyShrs(String fld) {
    this.instBuyShrs = SipUtils.parseInt(fld);
  }

  public void setInstOwnership(String fld) {
    this.instOwnership = SipUtils.parseDouble(fld);
  }

  public void setInstSellShrs(String fld) {
    this.instSellShrs = SipUtils.parseInt(fld);
  }

  public void setInstShareholders(String fld) {
    this.instShareholders = SipUtils.parseInt(fld);
  }

  public void setMktCap(String fld) {
    this.mktCap = SipUtils.parseDouble(fld);
  }

  public void setNameFields(CompanyFileData cfd) {
    this.ticker = cfd.getTicker();
    this.name = cfd.getName();
    this.sector = cfd.getSector();
    this.industry = cfd.getIndustry();
    this.exchange = cfd.getExchange();
  }

  public void setPrice(String fld) {
    this.price = SipUtils.parseDouble(fld);
  }

  public void setSharesQ(double[] flds) {
    this.sharesQ = flds;
  }

  public void setSharesY(double[] flds) {
    this.sharesY = flds;
  }

  public void setVolume3m(String fld) {
    this.volume3m = SipUtils.parseLong(fld);
  }

  public String toDbOutput() {
    String ret = "";
    ret += String.format("  price               : %f%n", this.price);
    ret += String.format("  float               : %f%n", this.floatshr);
    ret += String.format("  market cap          : %f%n", this.mktCap);
    ret += String.format("  volume 3m avg       : %d%n", this.volume3m);
    ret += String.format("  dollars 3m avg      : %f%n", this.dollar3m);
    ret += String.format("  beta                : %f%n", this.beta);
    ret += String.format("  insider ownership   : %f%n", this.insiderOwnership);
    ret += String.format("  insider buys        : %d%n", this.insiderBuys);
    ret += String.format("  insider sells       : %d%n", this.insiderSells);
    ret += String.format("  insider buy shares  : %d%n", this.insiderBuyShrs);
    ret += String.format("  insider sell shares : %d%n", this.insiderSellShrs);
    ret += String.format("  insider net shares  : %d%n", this.insiderNetTrades);
    ret += String.format("  inst buy shares     : %d%n", this.instBuyShrs);
    ret += String.format("  inst sell shares    : %d%n", this.instSellShrs);
    ret += String.format("  inst shareholders   : %d%n", this.instShareholders);
    ret += String.format("  inst ownership      : %f%n", this.instOwnership);
    ret += String.format("  shares quarterly    : %s%n", SipOutput.buildArray("", this.sharesQ, 10, 4, 1));
    ret += String.format("  shares yearly       : %s%n", SipOutput.buildArray("", this.sharesY, 10, 4, 1));
    return ret;
  }

  @Override
  public String toString() {
    String ret = SipOutput.SipHeader(this.ticker, this.name, this.exchange, this.sector, this.industry);
    ret += String.format("  Price / Beta                 : %s  %s%n", SipOutput.fmt(this.price, 1, 2), SipOutput.fmt(this.beta, 1, 3));
    ret += String.format("  Volume3m / Dollars3m         : %s  %s%n", SipOutput.ifmt(this.volume3m, 1), SipOutput.fmt(this.dollar3m, 15, 2));
    ret += String.format("  Float / MCap / Insiders      : %s %s  %s%%  %s%% %n", SipOutput.fmt(this.floatshr, 1, 3),
        SipOutput.ifmt((long) this.mktCap, 1), SipOutput.fmt(this.insiderOwnership, 1, 3), SipOutput.fmt(this.insiderNetPercentOutstanding, 1, 2));
    ret += String.format("  Institutions B/S Num Percent : %s  %s  %s  %s%% %n", SipOutput.ifmt(this.instBuyShrs, 1),
        SipOutput.ifmt(this.instSellShrs, 1), SipOutput.ifmt(this.instShareholders, 1), SipOutput.fmt(this.instOwnership, 1, 1));
    ret += String.format("  Insider B / S / Net          : %d-%d  %d-%d  %d%n", this.insiderBuys, this.insiderBuyShrs, this.insiderSells,
        this.insiderSellShrs, this.insiderNetTrades);
    ret += String.format("  Shares Quarterly             : %s%n", SipOutput.buildArray("", this.sharesQ, 10, 4));
    ret += String.format("  Shares Yearly                : %s%n", SipOutput.buildArray("", this.sharesY, 10, 4));
    return ret;
  }

}
