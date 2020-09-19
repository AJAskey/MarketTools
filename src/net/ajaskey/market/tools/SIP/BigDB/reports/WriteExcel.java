package net.ajaskey.market.tools.SIP.BigDB.reports;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import net.ajaskey.market.tools.SIP.BigDB.reports.excel.SipWorkbook;

public class WriteExcel {

  public static void main(String[] args) throws Exception {

    try (SipWorkbook wbook = new SipWorkbook("out/testpoi.xlsx")) {

      Sheet sheet = wbook.setSheet("Company Info");

      Row row = wbook.setRow(sheet, 1);

      wbook.setValue(row, 1, "Ticker");
      wbook.setValue(row, 2, "AAPL");
      wbook.setValue(row, 3, 100);
      wbook.setValue(row, 4, 123.456);

    }

  }

}
