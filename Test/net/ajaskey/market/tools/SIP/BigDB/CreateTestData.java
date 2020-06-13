package net.ajaskey.market.tools.SIP.BigDB;

import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;

public class CreateTestData {

  public static void main(String[] args) {

    parseData(2019, 4, "MSFT");

  }

  private static void parseData(int year, int quarter, String ticker) {

    final String dir = String.format("D:/dev/eclipse-workspace/Market/data/BigDB/%s/Q%d/", year, quarter);
    final String tail = String.format("%dQ%d.txt", year, quarter);

    readTheKeys(year, quarter);

    String head = String.format("CompanyInfo-");
    String ffname = String.format("%s%s%s", dir, head, tail);
    CompanyFileData.readData(ffname);
    System.out.println("CompanyFileData count : " + CompanyFileData.getListCount());

    writeCompanyFileKeyData(ticker);
//
//    head = "Shares-";
//    ffname = String.format("%s%s%s", dir, head, tail);
//    SharesFileData.readData(ffname);
//    System.out.println("SharesFileData count : " + SharesFileData.getListCount());
//
//    head = "Estimates-";
//    ffname = String.format("%s%s%s", dir, head, tail);
//    EstimateFileData.readData(ffname);
//    System.out.println("EstimateFileData count : " + EstimateFileData.getListCount());
//
//    head = "Balsheet-";
//    BalSheetFileData.readData(dir + head + "QTR-" + tail, dir + head + "ANN-" + tail);
//    System.out.println("BalSheetFileData count : " + BalSheetFileData.getListCount());
//
//    head = "Income-";
//    IncSheetFileData.readData(dir + head + "QTR-" + tail, dir + head + "ANN-" + tail);
//    System.out.println("IncSheetFileData count : " + IncSheetFileData.getListCount());

  }

  private static void writeCompanyFileKeyData(String ticker) {
    CompanyFileData cfd = CompanyFileData.find(ticker);
    for (int i = 0; i < companyDataKeys.length; i++) {
      System.out.printf("", companyDataKeys[i], cfd);
    }

  }

  static String[] companyDataKeys;
  static String[] sharesDataKeys;
  static String[] estimatesDataKeys;
  static String[] balsheetQDataKeys;
  static String[] balsheetYDataKeys;
  static String[] incsheetQDataKeys;
  static String[] incsheetYDataKeys;

  private static void readTheKeys(int year, int quarter) {

    final String dir = String.format("D:/dev/eclipse-workspace/Market/data/BigDB/%s/Q%d/", year, quarter);
    final String tail = String.format("%dQ%d_Key.txt", year, quarter);

    String head = String.format("CompanyInfo-");
    String ffname = String.format("%s%s%s", dir, head, tail);
    List<String> sList = TextUtils.readTextFile(ffname, true);
    companyDataKeys = new String[sList.size() + 1];
    int knt = 1;
    for (String s : sList) {
      String fld[] = s.split(Utils.TAB);
      companyDataKeys[knt++] = fld[1].replace("\"", "").trim();
    }

    head = String.format("Shares-");
    ffname = String.format("%s%s%s", dir, head, tail);
    sList = TextUtils.readTextFile(ffname, true);
    sharesDataKeys = new String[sList.size() + 1];
    knt = 1;
    for (String s : sList) {
      String fld[] = s.split(Utils.TAB);
      sharesDataKeys[knt++] = fld[1].replace("\"", "").trim();
    }

    head = String.format("Estimates-");
    ffname = String.format("%s%s%s", dir, head, tail);
    sList = TextUtils.readTextFile(ffname, true);
    estimatesDataKeys = new String[sList.size() + 1];
    knt = 1;
    for (String s : sList) {
      String fld[] = s.split(Utils.TAB);
      estimatesDataKeys[knt++] = fld[1].replace("\"", "").trim();
    }

    head = String.format("BalSheet-QTR-");
    ffname = String.format("%s%s%s", dir, head, tail);
    sList = TextUtils.readTextFile(ffname, true);
    balsheetQDataKeys = new String[sList.size() + 1];
    knt = 1;
    for (String s : sList) {
      String fld[] = s.split(Utils.TAB);
      balsheetQDataKeys[knt++] = fld[1].replace("\"", "").trim();
    }

    head = String.format("BalSheet-ANN-");
    ffname = String.format("%s%s%s", dir, head, tail);
    sList = TextUtils.readTextFile(ffname, true);
    balsheetYDataKeys = new String[sList.size() + 1];
    knt = 1;
    for (String s : sList) {
      String fld[] = s.split(Utils.TAB);
      balsheetYDataKeys[knt++] = fld[1].replace("\"", "").trim();
    }

    head = String.format("Income-QTR-");
    ffname = String.format("%s%s%s", dir, head, tail);
    sList = TextUtils.readTextFile(ffname, true);
    incsheetQDataKeys = new String[sList.size() + 1];
    knt = 1;
    for (String s : sList) {
      String fld[] = s.split(Utils.TAB);
      incsheetQDataKeys[knt++] = fld[1].replace("\"", "").trim();
    }

    head = String.format("Income-ANN-");
    ffname = String.format("%s%s%s", dir, head, tail);
    sList = TextUtils.readTextFile(ffname, true);
    incsheetYDataKeys = new String[sList.size() + 1];
    knt = 1;
    for (String s : sList) {
      String fld[] = s.split(Utils.TAB);
      incsheetYDataKeys[knt++] = fld[1].replace("\"", "").trim();
    }

    // TextUtils.print(sList);

  }

}
