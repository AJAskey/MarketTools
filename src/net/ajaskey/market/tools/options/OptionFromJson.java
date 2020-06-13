package net.ajaskey.market.tools.options;

import java.text.SimpleDateFormat;
import java.util.Iterator;

import org.json.simple.JSONObject;

import net.ajaskey.common.DateTime;

public class OptionFromJson {

  private final Iterator<?> itr;

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

  SimpleDateFormat sdftime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

  SimpleDateFormat sdf    = new SimpleDateFormat("yyyy-MM-dd");
  SimpleDateFormat sdfOut = new SimpleDateFormat("dd-MMM-yyyy");

  public OptionFromJson(Iterator<?> inItr) {
    this.itr = inItr;
  }

  public void get() {
    String s = "";
    while (this.itr.hasNext()) {
      final JSONObject jopt = (JSONObject) this.itr.next();
      this.contractName = (String) jopt.get("contractName");
      this.contractSize = (String) jopt.get("contractSize");
      this.currency = (String) jopt.get("currency");
      this.itm = Boolean.parseBoolean((String) jopt.get("inTheMoney"));

      s = (String) jopt.get("lastTradeDateTime");
      this.lastTradeDateTime = new DateTime(s, this.sdftime);
      s = (String) jopt.get("expirationDate");
      this.expirationDate = new DateTime(s, this.sdf, this.sdfOut);

      this.strike = OptionFromJson.getDouble(jopt, "strike");
      this.lastPrice = OptionFromJson.getDouble(jopt, "lastPrice");
      this.bid = OptionFromJson.getDouble(jopt, "bid");
      this.ask = OptionFromJson.getDouble(jopt, "ask");
      this.change = OptionFromJson.getDouble(jopt, "change");
      this.volume = OptionFromJson.getLong(jopt, "volume");
      this.openInterest = OptionFromJson.getLong(jopt, "openInterest");

      this.impliedVolatility = OptionFromJson.getDouble(jopt, "impliedVolatility");
      this.delta = OptionFromJson.getDouble(jopt, "delta");
      this.gamma = OptionFromJson.getDouble(jopt, "gamma");
      this.theta = OptionFromJson.getDouble(jopt, "theta");
      this.vega = OptionFromJson.getDouble(jopt, "vega");
      this.rho = OptionFromJson.getDouble(jopt, "rho");
      this.theoretical = OptionFromJson.getDouble(jopt, "theoretical");
      this.intrinsicValue = OptionFromJson.getDouble(jopt, "intrinsicValue");
      this.timeValue = OptionFromJson.getDouble(jopt, "timeValue");

      s = (String) jopt.get("updatedAt");
      this.updatedAt = new DateTime(s, this.sdftime, this.sdfOut);
      this.daysBeforeExpiration = OptionFromJson.getLong(jopt, "daysBeforeExpiration");

    }
  }

  @Override
  public String toString() {
    String ret = this.contractName;
    ret += String.format("  %s  %s  %s  %s%n  %s  %.2f  %.2f  %.2f  %d  %d%n", this.contractSize, this.currency, this.itm, this.lastTradeDateTime,
        this.expirationDate, this.strike, this.bid, this.ask, this.volume, this.openInterest);
    return ret;
  }

  private static Double getDouble(JSONObject jo, String key) {
    final Double ret = 0.0;
    try {
      return ((Number) jo.get(key)).doubleValue();
    }
    catch (final Exception e) {
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

  private static Long getLong(JSONObject jo, String key) {
    final Long ret = 0L;
    try {
      return ((Number) jo.get(key)).longValue();
    }
    catch (final Exception e) {
    }
    return ret;
  }

}
