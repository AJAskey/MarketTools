package net.ajaskey.market.tools.options;

import net.ajaskey.common.DateTime;

public class CboeCallPutData {

  public double           ask;
  public double           bid;
  public double           delta;
  public double           gamma;
  public String           id;
  public double           iv;
  public double           last;
  public double           mark;
  public double           net;
  public int              oi;
  public OptionsProcessor optionData;
  public double           premium;
  public double           strike;
  public int              vol;

  /**
   *
   */
  public CboeCallPutData() {
    this.id = "";
    this.strike = 0.0;
    this.last = 0.0;
    this.net = 0.0;
    this.bid = 0.0;
    this.ask = 0.0;
    this.mark = 0.0;
    this.vol = 0;
    this.oi = 0;
    this.delta = 0.0;
    this.gamma = 0.0;
    this.premium = 0.0;

    this.optionData = null;
  }

  /**
   * Copy Constructor
   *
   * @param in
   */
  public CboeCallPutData(CboeCallPutData in) {
    this.id = in.id;
    this.strike = in.strike;
    this.last = in.last;
    this.net = in.net;
    this.bid = in.bid;
    this.ask = in.ask;
    this.mark = in.mark;
    this.vol = in.vol;
    this.oi = in.oi;
    this.delta = in.delta;
    this.gamma = in.gamma;
    this.premium = in.premium;

    this.optionData = new OptionsProcessor(in.optionData);
  }

  /**
   * Utility function to get option price.
   *
   * @return price
   */
  public double getPrice() {
    if (this.optionData == null) {
      return 0.0;
    }
    return this.optionData.getPrice();
  }

  /**
   * Utility function to get option instance sell date.
   *
   * @return sellDate
   */
  public DateTime getSellDate() {
    if (this.optionData == null) {
      return null;
    }
    return this.optionData.getSellDate();
  }

  public double getStrike() {
    return this.strike;
  }

  public void setSellDate(DateTime sellDt) {
    if (this.optionData != null) {
      this.optionData.setSellDate(sellDt);
    }
  }

  /**
   *
   * @param ul
   */
  public void setUlPrice(double ul) {
    if (this.optionData != null) {
      this.optionData.setUlPrice(ul);
    }

  }

  /**
   *
   */
  @Override
  public String toString() {
    String ret = "";

    ret += String.format("Id       : %s%n", this.id);
    ret += String.format(" Strike  : %.2f%n", this.strike);
    ret += String.format(" Last    : %.2f%n", this.last);
    ret += String.format(" Bid     : %.2f%n", this.bid);
    ret += String.format(" Ask     : %.2f%n", this.ask);
    ret += String.format(" Mark    : %.2f%n", this.mark);
    ret += String.format(" Premium : %.2f%%%n", this.premium * 100.0);
    ret += String.format(" Volume  : %d%n", this.vol);
    ret += String.format(" OI      : %d%n", this.oi);
    ret += String.format(" IV      : %.2f%%%n", this.iv * 100.0);
    ret += String.format(" Data    : %s%n", this.optionData);

    return ret;
  }

}
