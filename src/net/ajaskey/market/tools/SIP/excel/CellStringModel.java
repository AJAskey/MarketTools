package net.ajaskey.market.tools.SIP.excel;

public class CellStringModel extends CellModel {

  public CellStringModel(String s) {
    val = s;
    cellType = CellModel.StringType;
  }

  public String getVal() {
    return val;
  }

  private String val;

}
