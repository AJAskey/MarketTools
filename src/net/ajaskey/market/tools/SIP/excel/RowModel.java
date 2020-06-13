package net.ajaskey.market.tools.SIP.excel;

public class RowModel {

  private SheetModel parent;

  private int               rowNumber;
  private final CellModel[] rowCells = new CellModel[100];

  public CellModel get(int col) {
    if (col > 0 && col < RowModel.MAXCOL) {
      return this.rowCells[col];
    }
    return null;
  }

  public SheetModel getParent() {
    return this.parent;
  }

  public int getRowNumber() {
    return this.rowNumber;
  }

  public void set(CellModel cm, int col) {
    if (col > 0 && col < RowModel.MAXCOL) {
      this.rowCells[col] = cm;
    }
  }

  public void setRowNumber(int rowNumber) {
    this.rowNumber = rowNumber;
  }

  protected void setParent(SheetModel parent) {
    this.parent = parent;
  }

  private static final int MAXCOL = 1000;

}
