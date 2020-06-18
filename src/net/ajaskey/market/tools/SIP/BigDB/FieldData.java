package net.ajaskey.market.tools.SIP.BigDB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;

public class FieldData {

  final static String inbasedir  = String.format("D:/dev/MarketTools/markettools.git/data/BigDB/");
  final static String outbasedir = String.format("out/BigDB/");

  /**
   *
   * @param year
   * @param quarter
   * @throws FileNotFoundException
   */
  protected static void parseSipData(int year, int quarter) throws FileNotFoundException {

    Utils.makeDir("out");
    Utils.makeDir("out/BigDB");

    final String dir = String.format("%s%s/Q%d/", FieldData.inbasedir, year, quarter);
    final String tail = String.format("%dQ%d.txt", year, quarter);

    String head = String.format("CompanyInfo-");
    String ffname = String.format("%s%s%s", dir, head, tail);
    CompanyFileData.readSipData(ffname);

    head = "Shares-";
    ffname = String.format("%s%s%s", dir, head, tail);
    SharesFileData.readSipData(ffname);
    // System.out.println(SharesFileData.listToString());

    head = "Estimates-";
    ffname = String.format("%s%s%s", dir, head, tail);
    EstimateFileData.readSipData(ffname);
    // System.out.println(EstimateFileData.listToString());

    head = "Balsheet-";
    BalSheetFileData.readSipData(dir + head + "QTR-" + tail, dir + head + "ANN-" + tail);
    // System.out.println(BalSheetFileData.listToString());

    head = "Income-";
    IncSheetFileData.readSipData(dir + head + "QTR-" + tail, dir + head + "ANN-" + tail);
    // System.out.println(IncSheetFileData.listToString());

    for (final CompanyFileData cfd : CompanyFileData.getList()) {

      final String ticker = cfd.getTicker();

      final SharesFileData sfd = SharesFileData.find(ticker);
      final EstimateFileData efd = EstimateFileData.find(ticker);
      final IncSheetFileData ifd = IncSheetFileData.find(ticker);
      final BalSheetFileData bfd = BalSheetFileData.find(ticker);

      FieldData.writeDbOutput(cfd, efd, sfd, ifd, bfd, year, quarter);

    }
  }

  /**
   * 
   * @param cfd
   * @param efd
   * @param sfd
   * @param bfd
   * @param ifd
   * @param year
   * @param quarter
   * @throws FileNotFoundException
   */
  protected static void writeDbOutput(CompanyFileData cfd, EstimateFileData efd, SharesFileData sfd, IncSheetFileData ifd, BalSheetFileData bfd,
      int year, int quarter) throws FileNotFoundException {

    final String yearDir = String.format("%s%s", FieldData.outbasedir, year);
    final String qtrDir = String.format("%s/Q%s", yearDir, quarter);

    final String outdir = qtrDir;

    Utils.makeDir(String.format("%s", FieldData.outbasedir));
    Utils.makeDir(yearDir);
    Utils.makeDir(qtrDir);

    final String fname = String.format("%s/%s-fundamental-data-%dQ%d.txt", outdir, cfd.getTicker(), year, quarter);

    final FieldData fd = new FieldData(cfd, efd, sfd, bfd, ifd, year, quarter);

    final String rpt = fd.genOutput();

    if (rpt != null && rpt.length() > 0) {
      try (PrintWriter pw = new PrintWriter(fname)) {
        pw.println(rpt);
      }
    }
  }

  /**
   *
   * @param year
   * @param quarter
   * @return
   */
  public static List<FieldData> readFromDbData(int year, int quarter) {

    final String indir = String.format("%s%s/Q%d/", FieldData.outbasedir, year, quarter);

    final List<FieldData> fdList = new ArrayList<>();

    final String[] ext = { "txt" };
    final List<File> fList = Utils.getDirTree(indir, ext);
    for (final File f : fList) {

      final List<String> data = TextUtils.readTextFile(f, true);

      final FieldData fd = new FieldData(year, quarter);

      fd.companyInfo = CompanyFileData.readFromDb(data);
      fd.shareData = SharesFileData.readFromDb(data);
      fd.estimateData = EstimateFileData.readFromDb(data);
      fd.incSheetData = IncSheetFileData.readFromDb(data);
      fd.balSheetData = BalSheetFileData.readFromDb(data);
      fd.setNameFields(fd.companyInfo);
      fd.shareData.setNameFields(fd.companyInfo);
      fd.estimateData.setNameFields(fd.companyInfo);
      fd.incSheetData.setNameFields(fd.companyInfo);
      fd.balSheetData.setNameFields(fd.companyInfo);

      if (fd.companyInfo.getTicker() != null) {
        fdList.add(fd);
      }
    }
    return fdList;
  }

  protected static void parseDbData(int year, int quarter) {

    final List<FieldData> fdList = FieldData.readFromDbData(year, quarter);
    BigLists.setLists(year, quarter, fdList);

  }

  /**
   * Used for writing enum in CAPS.
   * 
   * @param enm
   * @return
   */
  public static String getExchangeStr(ExchEnum enm) {
    return enm.toString().toUpperCase();
  }

  /**
   * Used when reading SIP exchange field data
   * 
   * @param enumStr
   * @return
   */
  public static ExchEnum convertExchange(String enumStr) {
    ExchEnum ret = ExchEnum.NONE;
    try {
      if (enumStr.contains("M - Nasdaq")) {
        ret = ExchEnum.NASDAQ;
      }
      else if (enumStr.contains("N - New York")) {
        ret = ExchEnum.NYSE;
      }
      else if (enumStr.contains("A - American")) {
        ret = ExchEnum.AMEX;
      }
      else if (enumStr.contains("O - Over the counter")) {
        ret = ExchEnum.OTC;
      }
    }
    catch (Exception e) {
      ret = ExchEnum.NONE;
    }
    return ret;
  }

  private final int year;
  private final int quarter;
  private String    ticker;
  private String    name;
  private String    sector;
  private String    industry;

  private ExchEnum         exchange;
  private CompanyFileData  companyInfo;
  private EstimateFileData estimateData;
  private SharesFileData   shareData;

  private IncSheetFileData incSheetData;

  private BalSheetFileData balSheetData;

  /**
   *
   * @param cfd
   * @param efd
   * @param sfd
   * @param ifd
   * @param bfd
   */
  public FieldData(CompanyFileData cfd, EstimateFileData efd, SharesFileData sfd, BalSheetFileData bfd, IncSheetFileData ifd, int yr, int qtr) {

    this.year = yr;
    this.quarter = qtr;
    this.ticker = cfd.getTicker();
    this.name = cfd.getName();
    this.industry = cfd.getIndustry();
    this.sector = cfd.getSector();

    this.companyInfo = cfd;
    this.estimateData = efd;
    this.shareData = sfd;
    this.incSheetData = ifd;
    this.balSheetData = bfd;
  }

  /**
   *
   * @param yr
   * @param qtr
   */
  public FieldData(int yr, int qtr) {

    this.year = yr;
    this.quarter = qtr;
    this.ticker = "";
    this.name = "";
    this.sector = "";
    this.industry = "";
    this.companyInfo = new CompanyFileData();
    this.estimateData = new EstimateFileData();
    this.shareData = new SharesFileData();
    this.incSheetData = new IncSheetFileData();
    this.balSheetData = new BalSheetFileData();

  }

  /**
   *
   * @return
   */
  public String genOutput() {
    String ret = String.format("Data for %s from %d Q%d%n", this.companyInfo.getTicker(), this.year, this.quarter);
    ret += this.companyInfo.toDbOuput();
    ret += this.shareData.toDbOutput();
    ret += this.estimateData.toDbOutput();
    ret += this.incSheetData.toDbOutput();
    ret += this.balSheetData.toDbOutput();
    return ret;

  }

  public BalSheetFileData getBalSheetData() {
    return this.balSheetData;
  }

  public CompanyFileData getCompanyInfo() {
    return this.companyInfo;
  }

  public EstimateFileData getEstimateData() {
    return this.estimateData;
  }

  public ExchEnum getExchange() {
    return this.exchange;
  }

  public IncSheetFileData getIncSheetData() {
    return this.incSheetData;
  }

  public String getIndustry() {
    return this.industry;
  }

  public String getName() {
    return this.name;
  }

  public int getQuarter() {
    // TODO Auto-generated method stub
    return 1;
  }

  public String getSector() {
    return this.sector;
  }

  public String getTicker() {
    return this.ticker;
  }

  public int getYear() {
    return this.year;
  }

  public void setCompanyInfo(CompanyFileData companyInfo) {
    this.companyInfo = companyInfo;
  }

  public void setEstimateData(EstimateFileData estimateData) {
    this.estimateData = estimateData;
  }

  private void setNameFields(CompanyFileData cfd) {
    this.ticker = cfd.getTicker();
    this.name = cfd.getName();
    this.sector = cfd.getSector();
    this.industry = cfd.getIndustry();
    this.exchange = cfd.getExchange();

  }

  public void setShareData(SharesFileData shareData) {
    this.shareData = shareData;
  }

  @Override
  public String toString() {
    String ret = "";
    try {
      if (this.companyInfo.getTicker() == null) {
        ret = "";
      }
      else {
        ret = this.companyInfo.toDbOuput();
        ret += this.shareData.toDbOutput();
      }
    }
    catch (final Exception e) {
      ret = "";
    }
    return ret;
  }

}
