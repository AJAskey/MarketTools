package net.ajaskey.market.tools.options;

import java.text.SimpleDateFormat;
import java.util.Iterator;

import org.json.simple.JSONObject;

import net.ajaskey.common.DateTime;

public class OptionFromJson {

  private Iterator<?> itr;

  public String   contractName;
  public String   contractSize;
  public String   currency;
  public String   type;
  public Boolean  itm;
  public DateTime lastTradeDateTime;
  public DateTime expirationDate;
  public Double   strike;
  public Double   lastPrice;
  public Double   bid;
  public Double   ask;
  public Double   change;
  public Double   changePercent;
  public Long     volume;
  public Long     openInterest;
  public Double   impliedVolatility;
  public Double   delta;
  public Double   gamma;
  public Double   theta;
  public Double   vega;
  public Double   rho;
  public Double   theoretical;
  public Double   intrinsicValue;
  public Double   timeValue;
  public DateTime updatedAt;
  public Long     daysBeforeExpiration;

  public OptionFromJson(Iterator<?> inItr) {
    itr = inItr;
  }

  SimpleDateFormat sdftime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
  SimpleDateFormat sdf     = new SimpleDateFormat("yyyy-MM-dd");
  SimpleDateFormat sdfOut  = new SimpleDateFormat("dd-MMM-yyyy");

  public void get() {
    String s = "";
    while (itr.hasNext()) {
      JSONObject jopt = (JSONObject) itr.next();
      this.contractName = (String) jopt.get("contractName");
      this.contractSize = (String) jopt.get("contractSize");
      this.currency = (String) jopt.get("currency");
      this.itm = Boolean.parseBoolean((String) jopt.get("inTheMoney"));

      s = (String) jopt.get("lastTradeDateTime");
      this.lastTradeDateTime = new DateTime(s, sdftime);
      s = (String) jopt.get("expirationDate");
      this.expirationDate = new DateTime(s, sdf, sdfOut);

      this.strike = getDouble(jopt, "strike");
      this.lastPrice = getDouble(jopt, "lastPrice");
      this.bid = getDouble(jopt, "bid");
      this.ask = getDouble(jopt, "ask");
      this.change = getDouble(jopt, "change");
      this.volume = getLong(jopt, "volume");
      this.openInterest = getLong(jopt, "openInterest");

      this.impliedVolatility = getDouble(jopt, "impliedVolatility");
      this.delta = getDouble(jopt, "delta");
      this.gamma = getDouble(jopt, "gamma");
      this.theta = getDouble(jopt, "theta");
      this.vega = getDouble(jopt, "vega");
      this.rho = getDouble(jopt, "rho");
      this.theoretical = getDouble(jopt, "theoretical");
      this.intrinsicValue = getDouble(jopt, "intrinsicValue");
      this.timeValue = getDouble(jopt, "timeValue");

      s = (String) jopt.get("updatedAt");
      this.updatedAt = new DateTime(s, sdftime, sdfOut);
      this.daysBeforeExpiration = getLong(jopt, "daysBeforeExpiration");

    }
  }

  private static Long getLong(JSONObject jo, String key) {
    Long ret = 0L;
    try {
      return ((Number) jo.get(key)).longValue();
    } catch (Exception e) {
    }
    return ret;
  }

  private static Double getDouble(JSONObject jo, String key) {
    Double ret = 0.0;
    try {
      return ((Number) jo.get(key)).doubleValue();
    } catch (Exception e) {
    }
    return ret;
  }

//  "contractName": "AAPL220121C00110000",
//  "contractSize": "REGULAR",
//  "currency": "USD",
//  "type": "CALL",
//  "inTheMoney": "TRUE",
//  "lastTradeDateTime": "2020-03-09 11:16:42",
//  "expirationDate": "2022-01-21",
//  "strike": 110,
//  "lastPrice": 165.95,
//  "bid": 139,
//  "ask": 144,
//  "change": -24.55,
//  "changePercent": -0.1289,
//  "volume": 1,
//  "openInterest": 369,
//  "impliedVolatility": 52.2919,
//  "delta": 0.9329,
//  "gamma": 0.0008,
//  "theta": -0.0199,
//  "vega": 0.4284,
//  "rho": 1.5616,
//  "theoretical": 141.5,
//  "intrinsicValue": 0,
//  "timeValue": 0,
//  "updatedAt": "2020-03-13 23:45:39",
//  "daysBeforeExpiration": 678

  @Override
  public String toString() {
    String ret = this.contractName;
    ret += String.format("  %s  %s  %s  %s%n  %s  %.2f  %.2f  %.2f  %d  %d%n", this.contractSize, this.currency,
        this.itm, this.lastTradeDateTime, this.expirationDate, this.strike, this.bid, this.ask, this.volume,
        this.openInterest);
    return ret;
  }

}
