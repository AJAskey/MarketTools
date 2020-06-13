package net.ajaskey.market.tools.options;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import net.ajaskey.common.DateTime;
import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;

public class PortfolioValue {

  String optName;
  double lPrice;
  double iv;
  int    quantity;
  double tPrice;
  double bsPrice;

  public PortfolioValue() {
    this.optName = "";
    this.lPrice = 0.0;
    this.tPrice = 0.0;
    this.bsPrice = 0.0;
    this.quantity = 0;
    this.iv = 0.0;
  }

  final static List<PortfolioValue> pvData = new ArrayList<>();;

  public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

    Object obj = new JSONParser().parse(new FileReader("data/AAPL.json"));

    JSONObject jo = (JSONObject) obj;
    JSONArray jaData = (JSONArray) jo.get("data");

    Iterator<?> itrData = jaData.iterator();

    while (itrData.hasNext()) {
      JSONObject joData = (JSONObject) itrData.next();
      String sData = (String) joData.get("expirationDate");
      // System.out.println(sData);

      JSONObject joOptExpiry = (JSONObject) joData.get("options");
      JSONArray jaOptPut = (JSONArray) joOptExpiry.get("PUT");
      JSONArray jaOptCall = (JSONArray) joOptExpiry.get("CALL");

      Iterator<?> itrPut = jaOptPut.iterator();


      OptionFromJson aput = new OptionFromJson(itrPut);
      aput.get();

      System.out.println(aput);


    }

//    String sData = (String) jaData.get("expirationDate");

    final List<String> data = TextUtils.readTextFile("data/positiondata.txt", true);

    String optName = "";
    int pos = 0;
    for (int i = 0; i < data.size(); i++) {
      String s = data.get(i);
      String fld[] = s.split("\t");
      if (fld[0].contains("----")) {
        pos = i;
        break;
      }
      optName = fld[0].replaceFirst("\\.", "").trim();
      // System.out.println(s + "\t" + optName);
      PortfolioValue pv = new PortfolioValue();
      pv.optName = optName;
      String sLast = fld[1].trim();
      pv.lPrice = Double.parseDouble(sLast);
      String sIv = fld[2].replace("%", "").trim();
      pv.iv = Double.parseDouble(sIv);
      pv.calcBs();
      pvData.add(pv);
    }

    for (PortfolioValue pv : pvData) {
      if (pv.quantity > 0) {
        for (int i = pos + 1; i < data.size(); i++) {
          String s = data.get(i);
          if (s.contains(pv.optName)) {
            String fld[] = s.split("\t");
            pv.quantity = Integer.parseInt(fld[5].trim());
            pv.tPrice = Double.parseDouble(fld[6].trim());
            // System.out.println(s);
            break;
          }
        }
      }
    }

//    for (PortfolioValue pv : pvData) {
//      System.out.println(pv);
//    }

  }

  private void calcBs() {

    int type = OptionsProcessor.ACALL;
    String back = this.optName.substring(5).toUpperCase();
    if (back.contains("P")) {
      type = OptionsProcessor.APUT;
    }
    /**
     * Creates a working object to process the option.
     *
     * @param type
     * @param id
     * @param strike
     * @param ulPrice
     * @param expiry
     * @param iv
     * @throws FileNotFoundException
     */
    double ul = 10.0;

    DateTime dt = getDt(this.optName);
    double strike = getStrike(this.optName);

    // OptionsProcessor op = new OptionsProcessor(type, this.optName, strike, ul,
    // dt, this.iv);
    // this.bsPrice = op.getPrice();
  }

  /**
   * 
   * @param optN
   * @return
   */
  private double getStrike(String optN) {
    // TODO Auto-generated method stub
    return 0;
  }

  /**
   * 
   * @param optN
   * @return
   */
  private DateTime getDt(String optN) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String toString() {
    String ret = this.optName + Utils.NL;
    double cost = this.tPrice * (double) this.quantity;
    double iv = this.iv / 100.0;
    ret += String.format("\t%.2f\t%d\t$%.2f%n\t%.4f\t$%.2f%n\t%.2f%n", this.tPrice, this.quantity, cost, iv,
        this.lPrice, this.bsPrice);
    return ret;
  }

}
