package net.ajaskey.market.tools.SIP.excel;

public class CellNumberModel extends CellModel {

  public CellNumberModel(double d) {
    val = d;
    cellType = CellModel.NumberType;
  }

  public double getVal() {
    return val;
  }

  private double val;

}
