package net.ajaskey.market.tools.SIP.excel;

public class RowModel {

  private static final int MAXCOL = 1000;

  private SheetModel  parent;
  private int         rowNumber;
  private CellModel[] rowCells = new CellModel[100];

  public SheetModel getParent() {
    return parent;
  }

  protected void setParent(SheetModel parent) {
    this.parent = parent;
  }

  public int getRowNumber() {
    return rowNumber;
  }

  public void setRowNumber(int rowNumber) {
    this.rowNumber = rowNumber;
  }

  public void set(CellModel cm, int col) {
    if (col > 0 && col < MAXCOL) {
      rowCells[col] = cm;
    }
  }

  public CellModel get(int col) {
    if (col > 0 && col < MAXCOL) {
      return rowCells[col];
    }
    return null;
  }

}
