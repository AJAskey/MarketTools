package net.ajaskey.market.tools.SIP.excel;

import java.util.ArrayList;
import java.util.List;

public class WorkbookModel {

  private String           wbName;
  private List<SheetModel> wbSheets = new ArrayList<>();

  public WorkbookModel(String name) {
    this.setName(name);
  }

  public void addSheet(SheetModel sm) {
    sm.setParent(this);
    wbSheets.add(sm);
  }

  public String getName() {
    return wbName;
  }

  public void setName(String wbName) {
    this.wbName = wbName;
  }

  public List<SheetModel> getWbSheets() {
    return wbSheets;
  }

  public void setWbSheets(List<SheetModel> wbSheets) {
    this.wbSheets = wbSheets;
  }

  public SheetModel addSheet(String name) {
    SheetModel sm = new SheetModel(name, this);
    sm.setParent(this);
    wbSheets.add(sm);
    return sm;
  }

  public List<SheetModel> getSheets() {
    return wbSheets;
  }

}
