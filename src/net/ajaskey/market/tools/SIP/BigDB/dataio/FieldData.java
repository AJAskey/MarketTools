package net.ajaskey.market.tools.SIP.BigDB.dataio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.BigDB.BigLists;

/**
 * This class contains data structures and procedures for reading SIP data and
 * writing to the DB.
 *
 * @author Andy Askey
 *
 *         <p>
 *         Copyright (c) 2020, Andy Askey. All rights reserved.
 *         </p>
 *         <p>
 *         Permission is hereby granted, free of charge, to any person obtaining
 *         a copy of this software and associated documentation files (the
 *         "Software"), to deal in the Software without restriction, including
 *         without limitation the rights to use, copy, modify, merge, publish,
 *         distribute, sublicense, and/or sell copies of the Software, and to
 *         permit persons to whom the Software is furnished to do so, subject to
 *         the following conditions:
 *
 *         The above copyright notice and this permission notice shall be
 *         included in all copies or substantial portions of the Software.
 *         </p>
 *
 *         <p>
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *         EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *         MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *         NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 *         BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 *         ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 *         CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *         SOFTWARE.
 *         </p>
 *
 */
public class FieldData {

  final static String inbasedir  = String.format("D:/dev/MarketTools/markettools.git/data/BigDB/");
  final static String outbasedir = String.format("out/BigDB/");

  /**
   * Used when reading SIP exchange SIP data.
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
    catch (final Exception e) {
      ret = ExchEnum.NONE;
    }
    return ret;
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
   * Reads SIP tab separated data files. Stores the data in array for later use.
   *
   * @param year
   * @param quarter
   * @throws FileNotFoundException
   */
  public static void parseSipData(int year, int quarter) throws FileNotFoundException {

    Utils.makeDir("out");
    Utils.makeDir("out/BigDB");

    final String dir = String.format("%s%s/Q%d/", FieldData.inbasedir, year, quarter);
    final String tail = String.format("%dQ%d.txt", year, quarter);

    File dirCk = new File(dir);
    if (!dirCk.exists()) {
      System.out.printf("Warning ... Requested SIP Data Directory does not exist! %s%n", dir);
      return;
    }

    System.out.printf("Processing SIP Year %d Quarter %d data.%n", year, quarter);

    String head = String.format("CompanyInfo-");
    String ffname = String.format("%s%s%s", dir, head, tail);
    dirCk = new File(ffname);
    if (!dirCk.exists()) {
      System.out.printf("Warning ... Requested File does not exist! %s%n", ffname);
      return;
    }
    CompanyFileData.readSipData(ffname);

    head = "Shares-";
    ffname = String.format("%s%s%s", dir, head, tail);
    dirCk = new File(ffname);
    if (!dirCk.exists()) {
      System.out.printf("Warning ... Requested File does not exist! %s%n", ffname);
      return;
    }
    SharesFileData.readSipData(ffname);
    // System.out.println(SharesFileData.listToString());

    head = "Estimates-";
    ffname = String.format("%s%s%s", dir, head, tail);
    dirCk = new File(ffname);
    if (!dirCk.exists()) {
      System.out.printf("Warning ... Requested File does not exist! %s%n", ffname);
      return;
    }
    EstimateFileData.readSipData(ffname);
    // System.out.println(EstimateFileData.listToString());

    head = "Balsheet-";
    String ffname1 = dir + head + "QTR-" + tail;
    String ffname2 = dir + head + "ANN-" + tail;
    dirCk = new File(ffname1);
    if (!dirCk.exists()) {
      System.out.printf("Warning ... Requested File does not exist! %s%n", ffname1);
      return;
    }
    dirCk = new File(ffname2);
    if (!dirCk.exists()) {
      System.out.printf("Warning ... Requested File does not exist! %s%n", ffname2);
      return;
    }
    BalSheetFileData.readSipData(ffname1, ffname2);
    // System.out.println(BalSheetFileData.listToString());

    head = "Income-";
    ffname1 = dir + head + "QTR-" + tail;
    ffname2 = dir + head + "ANN-" + tail;
    dirCk = new File(ffname1);
    if (!dirCk.exists()) {
      System.out.printf("Warning ... Requested File does not exist! %s%n", ffname1);
      return;
    }
    dirCk = new File(ffname2);
    if (!dirCk.exists()) {
      System.out.printf("Warning ... Requested File does not exist! %s%n", ffname2);
      return;
    }
    IncSheetFileData.readSipData(ffname1, ffname2);
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
   * Reads the DB for specific year and quarter. All tickers are returned and also
   * added to a combined list for future use.
   *
   * @param year
   * @param quarter 1-4
   * @return A list of FieldData for each ticket in the DB for year and quarter.
   *
   * @exception FileNotFoundException when year, quarter, ticker does not match
   *                                  any data in DB
   *
   */
  public static List<FieldData> readDbData(int year, int quarter) {

    System.out.printf("Processing DB %d %d%n", year, quarter);
    final List<FieldData> fdList = FieldData.parseFromDbData(year, quarter);
    BigLists.setLists(year, quarter, fdList);

    return fdList;
  }

  /**
   * Reads the DB for specific year, quarter and ticker inputs.
   *
   * @param year
   * @param quarter 1-4
   * @param ticker
   * @return FieldData
   *
   * @exception FileNotFoundException when year, quarter, ticker does not match
   *                                  any data in DB
   */
  public static FieldData readDbData(int year, int quarter, String ticker) {

    final FieldData fd = FieldData.parseFromDbData(year, quarter, ticker);
    return fd;
  }

  /**
   * Reads data from DB.
   *
   * @param year
   * @param quarter
   * @return List of FieldData for year and quarter
   */
  private static List<FieldData> parseFromDbData(int year, int quarter) {

    final String indir = String.format("%s%s/Q%d/", FieldData.outbasedir, year, quarter);

    File indirCk = new File(indir);
    if (!indirCk.exists()) {
      System.out.printf("Warning... DB directory does not exists. %s", indir);
      return null;
    }

    final List<FieldData> fdList = new ArrayList<>();

    final String[] ext = { "txt", "gz" };
    final List<File> fList = Utils.getDirTree(indir, ext);
    for (final File f : fList) {

      List<String> data = null;
      if (f.getName().endsWith(".gz")) {
        data = TextUtils.readGzipFile(f, true);
      }
      else {
        data = TextUtils.readTextFile(f, true);
      }

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

  /**
   * Reads one file from DB based on year, quarter, and ticker.
   *
   * @param year
   * @param quarter
   * @param ticker
   * @return FieldData for year, quarter, and ticker.
   */
  private static FieldData parseFromDbData(int year, int quarter, String ticker) {

    final String indir = String.format("%s%s/Q%d/", FieldData.outbasedir, year, quarter);

    String fname = String.format("%s%s-fundamental-data-%dQ%d.txt", indir, ticker, year, quarter);

    List<String> data = null;

    data = TextUtils.readTextFile(fname, true);
    if (data == null) {
      data = TextUtils.readGzipFile(fname + ".gz", true);
    }
    if (data == null) {
      System.out.printf("Warning... File not found %s", fname);
      return null;
    }

    final FieldData fd = new FieldData(year, quarter);

    fd.companyInfo = CompanyFileData.readFromDb(data);
    fd.shareData = SharesFileData.readFromDb(data);
    fd.estimateData = EstimateFileData.readFromDb(data);
    fd.incSheetData = IncSheetFileData.readFromDb(data);
    fd.balSheetData = BalSheetFileData.readFromDb(data);
    fd.setNameFields(fd.companyInfo);

    return fd;
  }

  /**
   * Sets up file names and writes data to DB files. Calls genOutput to create
   * data to be written.
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
  private static void writeDbOutput(CompanyFileData cfd, EstimateFileData efd, SharesFileData sfd, IncSheetFileData ifd, BalSheetFileData bfd,
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

  private BalSheetFileData balSheetData;
  private CompanyFileData  companyInfo;
  private EstimateFileData estimateData;
  private ExchEnum         exchange;
  private IncSheetFileData incSheetData;
  private String           industry;
  private String           name;

  private final int      quarter;
  private String         sector;
  private SharesFileData shareData;
  private String         ticker;
  private final int      year;

  /**
   * Constructor
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
   * Constructor
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
   * Creates String containing data to write to DB files.
   *
   * @return String
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

  public SharesFileData getShares() {
    return this.shareData;
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
    return this.quarter;
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

  @Override
  public String toString() {
    String ret = "";
    try {
      if (this.companyInfo.getTicker() == null) {
        ret = "";
      }
      else {
        ret = this.companyInfo.toDbOuput();
        ret += this.estimateData.toDbOutput();
        ret += this.shareData.toDbOutput();
        ret += this.incSheetData.toDbOutput();
        ret += this.balSheetData.toDbOutput();
      }
    }
    catch (final Exception e) {
      ret = "";
    }
    return ret;
  }

  /**
   * Sets local "name" fields from CompanyFileData
   *
   * @param cfd
   */
  private void setNameFields(CompanyFileData cfd) {
    this.ticker = cfd.getTicker();
    this.name = cfd.getName();
    this.sector = cfd.getSector();
    this.industry = cfd.getIndustry();
    this.exchange = cfd.getExchange();

  }

}
