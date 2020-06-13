package net.ajaskey.market.tools.SIP.BigDB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.Utils;

public class SipDbData {

  public CompanyFileData companyData = null;

  public static void main(final String[] args) throws FileNotFoundException {

    SipDbData.readData(2020, 1);
  }

  private static List<FieldData> setfromDB(int year, int quarter) {

    final String inbasedir = String.format("D:/dev/eclipse-workspace/Market/out/BigDB/");
    final String indir = String.format("%s%s/Q%d/", inbasedir, year, quarter);

    final List<FieldData> retList = new ArrayList<>();

    new ArrayList<>();

    final String[] ext = { "txt" };
    final List<File> fList = Utils.getDirTree(indir, ext);

    for (final File f : fList) {
//      System.out.println(f.getAbsolutePath());
//      List<String> data = TextUtils.readTextFile(f, true);
//      CompanyFileData cfd = new CompanyFileData();
//      badFlds = cfd.set(data);
//      Shares
//      System.out.println(badFlds);

    }

    return retList;
    // TODO Auto-generated method stub

  }

  /**
   *
   * @param year
   * @param quarter
   * @throws FileNotFoundException
   */
  protected static void readData(int year, int quarter) throws FileNotFoundException {

    String.format("D:/dev/eclipse-workspace/Market/data/BigDB/%s/Q%d/", year, quarter);
    String.format("%dQ%d.txt", year, quarter);

//    String head = String.format("CompanyInfo-");
//    String ffname = String.format("%s%s%s", dir, head, tail);
//    CompanyFileData.readData(ffname);
//
//    head = "Shares-";
//    ffname = String.format("%s%s%s", dir, head, tail);
//    SharesFileData.readData(ffname);
//    // System.out.println(SharesFileData.listToString());
//
//    head = "Estimates-";
//    ffname = String.format("%s%s%s", dir, head, tail);
//    EstimateFileData.readData(ffname);
//    // System.out.println(EstimateFileData.listToString());
//
//    head = "Balsheet-";
//    BalSheetFileData.readData(dir + head + "QTR-" + tail, dir + head + "ANN-" + tail);
//    // System.out.println(BalSheetFileData.listToString());
//
//    head = "Income-";
//    IncSheetFileData.readData(dir + head + "QTR-" + tail, dir + head + "ANN-" + tail);
//    // System.out.println(IncSheetFileData.listToString());
//
//    final String outbasedir = String.format("D:/dev/eclipse-workspace/Market/out/BigDB/");
//
//    final String outdir = String.format("%s%s/Q%d/", outbasedir, year, quarter);
//    Utils.makeDir(outbasedir);
//    Utils.makeDir(String.format("%s%d", outbasedir, year));
//    Utils.makeDir(outdir);

//    for (CompanyFileData cfd : CompanyFileData.getList()) {
//      String ticker = cfd.getTicker();
//
//      SharesFileData sfd = SharesFileData.find(ticker);
//      EstimateFileData efd = EstimateFileData.find(ticker);
//      BalSheetFileData bfd = BalSheetFileData.find(ticker);
//      IncSheetFileData ifd = IncSheetFileData.find(ticker);
//
//      String fname = String.format("%s%s-fundamental-data-%dQ%d.txt", outdir, ticker, year, quarter);
//
//      FieldData fd = new FieldData(cfd, efd, sfd, bfd, ifd);
//      String rpt = fd.genOutput(year, quarter);
//      try (PrintWriter pw = new PrintWriter(fname)) {
//        pw.println(rpt);
//      }
//    }

    final List<FieldData> fdList = FieldData.readData(2020, 1);

    for (final FieldData fd : fdList) {
      System.out.println(fd);
    }

  }

}
