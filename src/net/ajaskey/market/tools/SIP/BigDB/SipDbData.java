package net.ajaskey.market.tools.SIP.BigDB;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import net.ajaskey.common.Utils;

public class SipDbData {

  public CompanyFileData companyData = null;

  public static void main(final String[] args) throws FileNotFoundException {

    SipDbData.readData(2020, 1);
  }

  /**
   *
   * @param year
   * @param quarter
   * @throws FileNotFoundException
   */
  protected static void readData(int year, int quarter) throws FileNotFoundException {

    Utils.makeDir("out");
    Utils.makeDir("out/BigDB");

    String dir = String.format("%s%s/Q%d/", FieldData.inbasedir, year, quarter);
    String tail = String.format("%dQ%d.txt", year, quarter);

    String head = String.format("CompanyInfo-");
    String ffname = String.format("%s%s%s", dir, head, tail);
    CompanyFileData.readData(ffname);

    head = "Shares-";
    ffname = String.format("%s%s%s", dir, head, tail);
    SharesFileData.readData(ffname);
    // System.out.println(SharesFileData.listToString());

    head = "Estimates-";
    ffname = String.format("%s%s%s", dir, head, tail);
    EstimateFileData.readData(ffname);
    // System.out.println(EstimateFileData.listToString());

    head = "Balsheet-";
    BalSheetFileData.readData(dir + head + "QTR-" + tail, dir + head + "ANN-" + tail);
    // System.out.println(BalSheetFileData.listToString());

    head = "Income-";
    IncSheetFileData.readData(dir + head + "QTR-" + tail, dir + head + "ANN-" + tail);
    // System.out.println(IncSheetFileData.listToString());

    //
    //

    String yearDir = String.format("%s%s", FieldData.outbasedir, year);
    String qtrDir = String.format("%s/Q%s", yearDir, quarter);

    final String outdir = qtrDir;

    Utils.makeDir(String.format("%s", FieldData.outbasedir));
    Utils.makeDir(yearDir);
    Utils.makeDir(qtrDir);

    for (CompanyFileData cfd : CompanyFileData.getList()) {

      String ticker = cfd.getTicker();

      // if (ticker.equals("MSFT")) {

      SharesFileData sfd = SharesFileData.find(ticker);
      EstimateFileData efd = EstimateFileData.find(ticker);
      BalSheetFileData bfd = BalSheetFileData.find(ticker);
      IncSheetFileData ifd = IncSheetFileData.find(ticker);

      String fname = String.format("%s/%s-fundamental-data-%dQ%d.txt", outdir, ticker, year, quarter);

      FieldData fd = new FieldData(cfd, efd, sfd, bfd, ifd);
      String rpt = fd.genOutput(year, quarter);
      if (rpt != null && rpt.length() > 0) {
        try (PrintWriter pw = new PrintWriter(fname)) {
          pw.println(rpt);
        }
      }

      // }
    }

    final List<FieldData> fdList = FieldData.readData(2020, 1);

    try (PrintWriter pw = new PrintWriter(outdir + "/tickers.txt")) {
      for (final FieldData fd : fdList) {
        pw.printf("%-10s : %s%n", fd.getCompanyInfo().getTicker(), fd.getCompanyInfo().getName());
      }
    }

    for (final FieldData fd : fdList) {
      System.out.println(fd);
    }

  }

}
