/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * Original author : Andy Askey (ajaskey34@gmail.com)
 */
package net.ajaskey.market.tools.SIP.BigDB.dataio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.BigDB.Globals;
import net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary;

public class FieldData implements Serializable {

  /**
   * Set this to the directories you store you SIP data (inbasedir) and where you
   * want your DB output to be stored (outbasedir).
   *
   * You do not need the SIP data as I have uploaded the database data to the DB
   * folder.
   */
  final public static String inbasedir  = String.format("data/BigDB/");
  final public static String outbasedir = String.format("out/BigDB/");

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
   *
   * Returns a list of FieldData for the requested year and quarter from DB files.
   *
   * @param year
   * @param quarter
   * @param ft
   * @return
   */
  public static List<FieldData> getAllFromDb(int year, int quarter, FiletypeEnum ft) {

    List<FieldData> fdList = null;
    if (ft == FiletypeEnum.TEXT) {
      fdList = FieldData.parseFromDbData(year, quarter);
    }
    else if (ft == FiletypeEnum.BINARY) {
      fdList = FieldData.parseFromDbBinData(year, quarter);
    }
    else {
      System.out.printf("Waring. Invalid Filetype in getAllFromDb : %s%n", ft.toString());
    }

    return fdList;
  }

  /**
   * Returns a list of FieldData for all tickers from year and quarter from
   * internal memory.
   *
   * @param yr
   * @param qtr
   * @return List of FieldData
   */
  public static List<FieldData> getAllFromMemory(int yr, int qtr) {

    final List<FieldData> fdList = new ArrayList<>();

    System.out.printf("Retrieving from memory : %dQ%d%n", yr, qtr);

    for (final FieldDataYear fdy : Globals.allDataList) {

      if (yr == fdy.getYear()) {

        if (fdy.isInUse()) {

          if (fdy.quarterDataAvailable(qtr)) {

            final FieldDataQuarter fdq = fdy.getQ(qtr);

            for (final FieldData fd : fdq.fieldDataList) {
              fdList.add(fd);
            }
          }
        }
      }
    }
    return fdList;
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
   * Returns FieldData for requested ticker from year and quarter from DB file
   * data.
   *
   * @param ticker
   * @param year
   * @param quarter
   * @param ft
   * @return
   */
  public static FieldData getFromDb(String ticker, int year, int quarter, FiletypeEnum ft) {

    FieldData fd = null;
    if (ft == FiletypeEnum.TEXT) {
      fd = FieldData.parseFromDbData(year, quarter, ticker);
    }
    else if (ft == FiletypeEnum.BINARY) {
      fd = FieldData.parseFromDbBinData(year, quarter, ticker);
    }
    else {
      System.out.printf("Waring. Invalid Filetype in getFromDb : %s%n", ft.toString());
    }

    return fd;
  }

  /**
   * Returns FieldData for requested ticker from year and quarter from internal
   * memory.
   *
   * @param tkr
   * @param yr
   * @param qtr
   * @return FieldData
   */
  public static FieldData getFromMemory(String tkr, int yr, int qtr) {

    final String ticker = tkr.trim().toUpperCase();

    for (final FieldDataYear fdy : Globals.allDataList) {

      if (yr == fdy.getYear()) {

        if (fdy.isInUse()) {

          if (fdy.quarterDataAvailable(qtr)) {

            final FieldDataQuarter fdq = fdy.getQ(qtr);

            for (final FieldData fd : fdq.fieldDataList) {
              if (fd.getTicker().equals(ticker)) {
                return fd;
              }
            }
          }
        }
      }
    }
    return null;
  }

  /**
   * Creates a full filename based on the input parameters.
   *
   * @param yr
   * @param qtr
   * @param ticker
   * @param ext    The desired extension of the returned file.
   * @return String
   */
  public static String getOutfileName(int yr, int qtr, String ticker, String ext) {

    final String yearDir = String.format("%s%s", FieldData.outbasedir, yr);
    final String qtrDir = String.format("%s/Q%s", yearDir, qtr);

    final String outdir = qtrDir;

    Utils.makeDir(String.format("%s", FieldData.outbasedir));
    Utils.makeDir(yearDir);
    Utils.makeDir(qtrDir);

    final String fname = String.format("%s/%s-fundamental-data-%dQ%d.%s", outdir, ticker, yr, qtr, ext);

    return fname;
  }

  public static double getTtm(double[] dArr) {
    final double ret = dArr[1] + dArr[2] + dArr[3] + dArr[4];
    return ret;
  }

  /**
   * Reads SIP tab separated data files. Stores the data in array for later use.
   *
   * @param year
   * @param quarter
   * @throws FileNotFoundException
   */
  public static void parseSipData(int year, int quarter, FiletypeEnum ft) throws FileNotFoundException {

    CompanyFileData.clearList();
    EstimateFileData.clearList();
    SharesFileData.clearList();
    IncSheetFileData.clearList();
    BalSheetFileData.clearList();

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

    head = "Cash-";
    ffname = String.format("%s%s%s", dir, head, tail);
    dirCk = new File(ffname);
    if (dirCk.exists()) {
      CashFileData.readSipData(ffname);
    }

    for (final CompanyFileData cfd : CompanyFileData.getList()) {

      final String ticker = cfd.getTicker();

      final SharesFileData sfd = SharesFileData.find(ticker);
      final EstimateFileData efd = EstimateFileData.find(ticker);
      final IncSheetFileData ifd = IncSheetFileData.find(ticker);
      final BalSheetFileData bfd = BalSheetFileData.find(ticker);
      final CashFileData cashfd = CashFileData.find(ticker);

      final FieldData fd = new FieldData(cfd, efd, sfd, ifd, bfd, cashfd, year, quarter);

      if (ft == FiletypeEnum.BINARY) {
        final String fname = FieldData.getOutfileName(year, quarter, ticker, "bin");
        FieldData.writeDbBinary(fname, fd);
      }
      else if (ft == FiletypeEnum.TEXT) {
        FieldData.writeDbOutput(cfd, efd, sfd, ifd, bfd, cashfd, year, quarter);
      }
      else if (ft == FiletypeEnum.BIG_BINARY) {
        FieldDataBinary.add(cfd, efd, sfd, ifd, bfd, cashfd, year, quarter);
      }
    }

    /**
     * Write big binary file for year and quarter data
     */
    if (ft == FiletypeEnum.BIG_BINARY) {
      FieldDataBinary.writeBinaryFile(year, quarter);
    }
  }

  /**
   * Set internal memory to data from firstYear to endYear.
   *
   * @param firstYear
   * @param endYear
   * @param ft        FiletypeEnum BIG_BINARY valid
   */
  public static void setMemory(int firstYear, int endYear, FiletypeEnum ft) {

    if (ft == FiletypeEnum.BIG_BINARY) {
      for (int yr = firstYear; yr <= endYear; yr++) {
        for (int qtr = 1; qtr <= 4; qtr++) {
          FieldData.readDbBigBinData(yr, qtr);
        }
      }
    }
  }

  /**
   * Sets internal memory to request year and quarter.
   *
   * @param yr  year
   * @param qtr quarter
   * @param ft  FiletypeEnum BINARY or TEXT valid
   */
  public static void setQMemory(int yr, int qtr, FiletypeEnum ft) {

    System.out.printf("Setting internal memory : %dQ%d%n", yr, qtr);

    if (ft == FiletypeEnum.BINARY) {

      FieldData.readDbBigBinData(yr, qtr);
    }
    else if (ft == FiletypeEnum.TEXT) {

      FieldData.readDbData(yr, qtr, ft);
    }
    else if (ft == FiletypeEnum.BIG_BINARY) {

      FieldData.readDbBigBinData(yr, qtr);
    }

    else {
      System.out.printf("Waring. Invalid Filetype in setQMemory : %s%n", ft.toString());
    }
  }

  /**
   * Reads binary DB file.
   *
   * @param yr
   * @param qtr
   * @return List of FieldData
   */
  private static List<FieldData> parseFromDbBigBinData(int yr, int qtr) {

    final String fname = String.format("%s%d/all-companies-%dQ%d.bin", FieldData.outbasedir, yr, yr, qtr);

    List<FieldData> fdList = null;

    final File f = new File(fname);
    if (f.exists()) {

      fdList = FieldDataBinary.readBinaryFile(fname);

    }
    return fdList;
  }

  /**
   * Read the company binary DB file corresponding to year and quarter
   *
   * @param year
   * @param quarter
   * @return List of FieldData
   */
  private static List<FieldData> parseFromDbBinData(int year, int quarter) {

    final String indir = String.format("%s%s/Q%d/", FieldData.outbasedir, year, quarter);

    final File indirCk = new File(indir);
    if (!indirCk.exists()) {
      System.out.printf("Warning... DB directory does not exists. %s%n", indir);
      return null;
    }

    final List<FieldData> fdList = new ArrayList<>();
    final String[] ext = { "bin" };
    final List<File> fList = Utils.getDirTree(indir, ext);
    for (final File f : fList) {
      final FieldData fd = FieldData.readBinaryFieldData(f.getAbsoluteFile());
      if (fd != null && fd.companyInfo.getTicker() != null) {
        fdList.add(fd);
      }
    }

    return fdList;

  }

  private static FieldData parseFromDbBinData(int year, int quarter, String ticker) {

    final String fname = FieldData.getOutfileName(year, quarter, ticker, "bin");
    final File f = new File(fname);
    FieldData fd = null;

    if (f.exists()) {
      fd = FieldData.readBinaryFieldData(f);
    }
    return fd;

  }

  /**
   * Reads data from DB into global memory. Calls to this for various years and
   * quarters "may" make processing faster for large comprehensive reports.
   *
   * @param year
   * @param quarter
   * @return List of FieldData for year and quarter
   */
  private static List<FieldData> parseFromDbData(int year, int quarter) {

    final String indir = String.format("%s%s/Q%d/", FieldData.outbasedir, year, quarter);

    final File indirCk = new File(indir);
    if (!indirCk.exists()) {
      System.out.printf("Warning... DB directory does not exists. %s%n", indir);
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
      fd.cashData = CashFileData.readFromDb(data);
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

    final String fname = FieldData.getOutfileName(year, quarter, ticker, "txt");

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
   * Perform physical read on binary data file containing FieldData.
   *
   * @param fname Full path of binary file to read.
   * @return FieldData
   */
  private static FieldData readBinaryFieldData(File fname) {

    FieldData fd;
    try {
      final ObjectInputStream objBinFile = new ObjectInputStream(new FileInputStream(fname));

      fd = (FieldData) objBinFile.readObject();
      objBinFile.close();

      return fd;
    }
    catch (final Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * Reads the DB for specific year and quarter into memory for future use. All
   * tickers are returned.
   *
   * @param year
   * @param quarter 1-4
   * @param binary  False for text output and TRUE for binary output
   * @return A list of FieldData for each ticket in the DB for year and quarter.
   *
   * @exception FileNotFoundException when year, quarter, ticker does not match
   *                                  any data in DB
   *
   */
  private static List<FieldData> readDbBigBinData(int year, int quarter) {

    System.out.printf("Processing DB %d %d%n", year, quarter);

    List<FieldData> fdList = null;

    fdList = FieldData.parseFromDbBigBinData(year, quarter);

    Globals.setLists(year, quarter, fdList);

    return fdList;
  }

  /**
   * Reads the DB for specific year and quarter into memory for future use. All
   * tickers are returned.
   *
   * @param year
   * @param quarter 1-4
   * @param binary  False for text output and TRUE for binary output
   * @return A list of FieldData for each ticket in the DB for year and quarter.
   *
   * @exception FileNotFoundException when year, quarter, ticker does not match
   *                                  any data in DB
   *
   */
  private static List<FieldData> readDbData(int year, int quarter, FiletypeEnum ft) {

    System.out.printf("Processing DB %d %d%n", year, quarter);

    List<FieldData> fdList = null;
    if (ft == FiletypeEnum.BINARY) {
      fdList = FieldData.parseFromDbBinData(year, quarter);
    }
    else if (ft == FiletypeEnum.TEXT) {
      fdList = FieldData.parseFromDbData(year, quarter);
    }
    else {
      System.out.printf("Waring. Invalid Filetype in readDbData : %s%n", ft.toString());
      return null;
    }

    Globals.setLists(year, quarter, fdList);

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
  private static FieldData readDbData(int year, int quarter, String ticker) {

    final FieldData fd = FieldData.parseFromDbData(year, quarter, ticker);

    return fd;
  }

  /**
   * Writes each set of ticker data in binary format so the reading is much
   * faster.
   *
   * @param fname
   * @param fd
   */
  private static void writeDbBinary(String fname, FieldData fd) {
    try {
      final ObjectOutputStream binObjFile = new ObjectOutputStream(new FileOutputStream(fname));

      binObjFile.writeObject(fd);
      binObjFile.close();
    }
    catch (final IOException e) {
      System.out.printf("Warning. Problems writing binary file %s", fname);
    }

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
      CashFileData cash, int year, int quarter) throws FileNotFoundException {

    final String fname = FieldData.getOutfileName(year, quarter, cfd.getTicker(), "txt");

    final FieldData fd = new FieldData(cfd, efd, sfd, ifd, bfd, cash, year, quarter);

    final String rpt = fd.genOutput();

    if (rpt != null && rpt.length() > 0) {
      try (PrintWriter pw = new PrintWriter(fname)) {
        pw.println(rpt);
      }
    }
  }

  private BalSheetFileData balSheetData;
  private CashFileData     cashData;
  private CompanyFileData  companyInfo;
  private EstimateFileData estimateData;
  private ExchEnum         exchange;
  private IncSheetFileData incSheetData;
  private String           industry;
  private String           name;
  private int              quarter;
  private String           sector;
  private SharesFileData   shareData;
  private String           ticker;

  private int year;

  /**
   * Constructor
   *
   * @param cfd CompanyFileData
   * @param efd EstimateFileData
   * @param sfd SharesFileData
   * @param ifd IncSheetFileData
   * @param bfd BalSheetFileData
   * @param yr
   * @param qtr
   */
  public FieldData(CompanyFileData cfd, EstimateFileData efd, SharesFileData sfd, IncSheetFileData ifd, BalSheetFileData bfd, CashFileData cash,
      int yr, int qtr) {
    this.companyInfo = cfd;
    this.cashData = cash;
    this.estimateData = efd;
    this.shareData = sfd;
    this.incSheetData = ifd;
    this.balSheetData = bfd;
    if (cfd != null) {
      this.ticker = cfd.getTicker();
      this.name = cfd.getName();
      this.exchange = cfd.getExchange();
      this.sector = cfd.getSector();
      this.industry = cfd.getIndustry();
    }
    else {
      this.ticker = "";
      this.name = "";
      this.exchange = ExchEnum.NONE;
      this.sector = "";
      this.industry = "";
    }
    this.year = yr;
    this.quarter = qtr;
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
    this.cashData = new CashFileData();
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
    String ret = "";
    try {
      ret = String.format("Data for %s from %d Q%d%n", this.companyInfo.getTicker(), this.year, this.quarter);
      ret += this.companyInfo.toDbOuput();
      ret += this.shareData.toDbOutput();
      ret += this.estimateData.toDbOutput();
      ret += this.incSheetData.toDbOutput();
      ret += this.balSheetData.toDbOutput();
      ret += this.cashData.toDbOutput();
    }
    catch (final Exception e) {
      ret = "";
    }
    return ret;

  }

  public double[] getAcctPayableQtr() {
    return this.getBalSheetData().getAcctPayableQtr();
  }

  public double[] getAcctPayableYr() {
    return this.getBalSheetData().getAcctPayableYr();
  }

  public double[] getAcctRxQtr() {
    return this.getBalSheetData().getAcctRxQtr();
  }

  public double[] getAcctRxYr() {
    return this.getBalSheetData().getAcctRxYr();
  }

  public double[] getAdjToIncQtr() {
    return this.getIncSheetData().getAdjToIncQtr();
  }

  public double[] getAdjToIncYr() {
    return this.getIncSheetData().getAdjToIncYr();
  }

  public BalSheetFileData getBalSheetData() {
    return this.balSheetData;
  }

  public double getBeta() {
    return this.shareData.getBeta();
  }

  public double[] getBvpsQtr() {
    return this.getBalSheetData().getBvpsQtr();
  }

  public double[] getBvpsYr() {
    return this.getBalSheetData().getBvpsYr();
  }

  public double[] getCapEx() {
    return this.cashData.getCapExQtr();
  }

  public CashFileData getCashData() {
    return this.cashData;
  }

  public double[] getCashFromFin() {
    return this.cashData.getCashFromFinQtr();
  }

  public double[] getCashFromInv() {
    return this.cashData.getCashFromInvQtr();
  }

  public double[] getCashFromOps() {
    return this.cashData.getCashFromOpsQtr();
  }

  public double[] getCashQtr() {
    return this.getBalSheetData().getCashQtr();
  }

  public double[] getCashYr() {
    return this.getBalSheetData().getCashYr();
  }

  /**
   *
   */

  public String getCity() {
    return this.getCompanyInfo().getCity();
  }

  public double[] getCogsQtr() {
    return this.getIncSheetData().getCogsQtr();
  }

  public double[] getCogsYr() {
    return this.getIncSheetData().getCogsYr();
  }

  public CompanyFileData getCompanyInfo() {
    return this.companyInfo;
  }

  public String getCountry() {
    return this.getCompanyInfo().getCountry();
  }

  public double[] getCurrAssetsQtr() {
    return this.getBalSheetData().getCurrAssetsQtr();
  }

  public double[] getCurrAssetsYr() {
    return this.getBalSheetData().getCurrAssetsYr();
  }

  public DateTime getCurrFiscalYear() {
    return this.getEstimateData().getCurrFiscalYear();
  }

  public double[] getCurrLiabQtr() {
    return this.getBalSheetData().getCurrLiabQtr();
  }

  public double[] getCurrLiabYr() {
    return this.getBalSheetData().getCurrLiabYr();
  }

  public double[] getDepreciationQtr() {
    return this.getIncSheetData().getDepreciationQtr();
  }

  public double[] getDepreciationYr() {
    return this.getIncSheetData().getDepreciationYr();
  }

  public double[] getDividendQtr() {
    return this.getIncSheetData().getDividendQtr();
  }

  public double[] getDividendYr() {
    return this.getIncSheetData().getDividendYr();
  }

  public double getDollar3m() {
    return this.shareData.getDollar3m();
  }

  public DowEnum getDowIndex() {
    return this.getCompanyInfo().getDowIndex();
  }

  public String getDowIndexStr() {
    return this.getCompanyInfo().getDowIndexStr();
  }

  public double[] getEpsContQtr() {
    return this.getIncSheetData().getEpsContQtr();
  }

  public double[] getEpsContYr() {
    return this.getIncSheetData().getEpsContYr();
  }

  // ******************

  public double[] getEpsDilContQtr() {
    return this.getIncSheetData().getEpsDilContQtr();
  }

  public double[] getEpsDilContYr() {
    return this.getIncSheetData().getEpsDilContYr();
  }

  public double[] getEpsDilQtr() {
    return this.getIncSheetData().getEpsDilQtr();
  }

  public double[] getEpsDilYr() {
    return this.getIncSheetData().getEpsDilYr();
  }

  public double getEpsQ0() {
    return this.getEstimateData().getEpsQ0();
  }

  public double getEpsQ1() {
    return this.getEstimateData().getEpsQ1();
  }

  public double[] getEpsQtr() {
    return this.getIncSheetData().getEpsQtr();
  }

  public double getEpsY0() {
    return this.getEstimateData().getEpsY0();
  }

  public double getEpsY1() {
    return this.getEstimateData().getEpsY1();
  }

  public double getEpsY2() {
    return this.getEstimateData().getEpsY2();
  }

  public double[] getEpsYr() {
    return this.getIncSheetData().getEpsYr();
  }

  public double[] getEquityQtr() {
    return this.getBalSheetData().getEquityQtr();
  }

  public double[] getEquityYr() {
    return this.getBalSheetData().getEquityYr();
  }

  public EstimateFileData getEstimateData() {
    return this.estimateData;
  }

  public ExchEnum getExchange() {
    return this.exchange;
  }

  public double getFloatshr() {
    return this.shareData.getFloatshr();
  }

  public double[] getGoodwillQtr() {
    return this.getBalSheetData().getGoodwillQtr();
  }

  public double[] getGoodwillYr() {
    return this.getBalSheetData().getGoodwillYr();
  }

  public double[] getGrossIncQtr() {
    return this.getIncSheetData().getGrossIncQtr();
  }

  // ******************

  public double[] getGrossIncYr() {
    return this.getIncSheetData().getGrossIncYr();
  }

  public double[] getGrossOpExpQtr() {
    return this.getIncSheetData().getGrossOpExpQtr();
  }

  public double[] getGrossOpExpYr() {
    return this.getIncSheetData().getGrossOpExpYr();
  }

  public double[] getIncAfterTaxQtr() {
    return this.getIncSheetData().getIncAfterTaxQtr();
  }

  public double[] getIncAfterTaxYr() {
    return this.getIncSheetData().getIncAfterTaxYr();
  }

  public double[] getIncPrimaryEpsQtr() {
    return this.getIncSheetData().getIncPrimaryEpsQtr();
  }

  public double[] getIncPrimaryEpsYr() {
    return this.getIncSheetData().getIncPrimaryEpsYr();
  }

  public IncSheetFileData getIncSheetData() {
    return this.incSheetData;
  }

  public double[] getIncTaxQtr() {
    return this.getIncSheetData().getIncTaxQtr();
  }

  public double[] getIncTaxYr() {
    return this.getIncSheetData().getIncTaxYr();
  }

  public String getIndustry() {
    return this.industry;
  }

  public int getInsiderBuys() {
    return this.shareData.getInsiderBuys();
  }

  public int getInsiderBuyShrs() {
    return this.shareData.getInsiderBuyShrs();
  }

  public double getInsiderNetPercentOutstanding() {
    return this.shareData.getInsiderNetPercentOutstanding();
  }

  public int getInsiderNetTrades() {
    return this.shareData.getInsiderNetTrades();
  }

  public double getInsiderOwnership() {
    return this.shareData.getInsiderOwnership();
  }

  public int getInsiderSells() {
    return this.shareData.getInsiderSells();
  }

  public int getInsiderSellShrs() {
    return this.shareData.getInsiderSellShrs();
  }

  public int getInstBuyShrs() {
    return this.shareData.getInstBuyShrs();
  }

  public double getInstOwnership() {
    return this.shareData.getInstOwnership();
  }

  public int getInstSellShrs() {
    return this.shareData.getInstSellShrs();
  }

  public int getInstShareholders() {
    return this.shareData.getInstShareholders();
  }

  public double[] getIntExpNonOpQtr() {
    return this.getIncSheetData().getIntExpNonOpQtr();
  }

  public double[] getIntExpNonOpYr() {
    return this.getIncSheetData().getIntExpNonOpYr();
  }

  public double[] getIntExpQtr() {
    return this.getIncSheetData().getIntExpQtr();
  }

  public double[] getIntExpYr() {
    return this.getIncSheetData().getIntExpYr();
  }

  public double[] getInventoryQtr() {
    return this.getBalSheetData().getInventoryQtr();
  }

  public double[] getInventoryYr() {
    return this.getBalSheetData().getInventoryYr();
  }

  public DateTime getLatestQtrEps() {
    return this.getEstimateData().getLatestQtrEps();
  }

  public double[] getLiabEquityQtr() {
    return this.getBalSheetData().getLiabEquityQtr();
  }

  public double[] getLiabEquityYr() {
    return this.getBalSheetData().getLiabEquityYr();
  }

  public double[] getLtDebtQtr() {
    return this.getBalSheetData().getLtDebtQtr();
  }

  public double[] getLtDebtYr() {
    return this.getBalSheetData().getLtDebtYr();
  }

  public double[] getLtInvestQtr() {
    return this.getBalSheetData().getLtInvestQtr();
  }

  public double[] getLtInvestYr() {
    return this.getBalSheetData().getLtInvestYr();
  }

  public double getMktCap() {
    return this.shareData.getMktCap();
  }

  public String getName() {
    return this.name;
  }

  public double[] getNetFixedAssetsQtr() {
    return this.getBalSheetData().getNetFixedAssetsQtr();
  }

  public double[] getNetFixedAssetsYr() {
    return this.getBalSheetData().getNetFixedAssetsYr();
  }

  public double[] getNetIncQtr() {
    return this.getIncSheetData().getNetIncQtr();
  }

  public double[] getNetIncYr() {
    return this.getIncSheetData().getNetIncYr();
  }

  public double[] getNonrecurringItemsQtr() {
    return this.getIncSheetData().getNonrecurringItemsQtr();
  }

  public double[] getNonrecurringItemsYr() {
    return this.getIncSheetData().getNonrecurringItemsYr();
  }

  public int getNumEmployees() {
    return this.getCompanyInfo().getNumEmployees();
  }

  public double[] getOtherCurrAssetsQtr() {
    return this.getBalSheetData().getOtherCurrAssetsQtr();
  }

  public double[] getOtherCurrAssetsYr() {
    return this.getBalSheetData().getOtherCurrAssetsYr();
  }

  // *************************

  public double[] getOtherCurrLiabQtr() {
    return this.getBalSheetData().getOtherCurrLiabQtr();
  }

  public double[] getOtherCurrLiabYr() {
    return this.getBalSheetData().getOtherCurrLiabYr();
  }

  public double[] getOtherIncQtr() {
    return this.getIncSheetData().getOtherIncQtr();
  }

  public double[] getOtherIncYr() {
    return this.getIncSheetData().getOtherIncYr();
  }

  public double[] getOtherLtAssetsQtr() {
    return this.getBalSheetData().getOtherLtAssetsQtr();
  }

  public double[] getOtherLtAssetsYr() {
    return this.getBalSheetData().getOtherLtAssetsYr();
  }

  public double[] getOtherLtLiabQtr() {
    return this.getBalSheetData().getOtherLtLiabQtr();
  }

  public double[] getOtherLtLiabYr() {
    return this.getBalSheetData().getOtherLtLiabYr();
  }

  public String getPhone() {
    return this.getCompanyInfo().getPhone();
  }

  public double[] getPrefStockQtr() {
    return this.getBalSheetData().getPrefStockQtr();
  }

  public double[] getPrefStockYr() {
    return this.getBalSheetData().getPrefStockYr();
  }

  public double[] getPreTaxIncQtr() {
    return this.getIncSheetData().getPreTaxIncQtr();
  }

  public double[] getPreTaxIncYr() {
    return this.getIncSheetData().getPreTaxIncYr();
  }

  public double getPrice() {
    return this.shareData.getPrice();
  }

  public double getPrice52hi() {
    return this.shareData.getPrice52hi();
  }

  public double getPrice52lo() {
    return this.shareData.getPrice52lo();
  }

  public int getQuarter() {
    return this.quarter;
  }

  public double[] getRdQtr() {
    return this.getIncSheetData().getRdQtr();
  }

  public double[] getRdYr() {
    return this.getIncSheetData().getRdYr();
  }

  public double[] getSalesQtr() {
    return this.getIncSheetData().getSalesQtr();
  }

  public double[] getSalesYr() {
    return this.getIncSheetData().getSalesYr();
  }

  public String getSector() {
    return this.sector;
  }

  public SharesFileData getShares() {
    return this.shareData;
  }

  public double[] getSharesQ() {
    return this.shareData.getSharesQ();
  }

  public double[] getSharesY() {
    return this.shareData.getSharesY();
  }

  public String getSic() {
    return this.getCompanyInfo().getSic();
  }

  public SnpEnum getSnpIndex() {
    return this.getCompanyInfo().getSnpIndex();
  }

  public String getSnpIndexStr() {
    return this.getCompanyInfo().getSnpIndexStr();
  }

  public String getState() {
    return this.getCompanyInfo().getState();
  }

  public double[] getStDebtQtr() {
    return this.getBalSheetData().getStDebtQtr();
  }

  public double[] getStDebtYr() {
    return this.getBalSheetData().getStDebtYr();
  }

  public double[] getStInvestQtr() {
    return this.getBalSheetData().getStInvestQtr();
  }

  public double[] getStInvestYr() {
    return this.getBalSheetData().getStInvestYr();
  }

  public String getStreet() {
    return this.getCompanyInfo().getStreet();
  }

  public String getTicker() {
    return this.ticker;
  }

  public double[] getTotalOpExpQtr() {
    return this.getIncSheetData().getTotalOpExpQtr();
  }

  public double[] getTotalOpExpYr() {
    return this.getIncSheetData().getTotalOpExpYr();
  }

  public double[] getUnusualIncQtr() {
    return this.getIncSheetData().getUnusualIncQtr();
  }

  public double[] getUnusualIncYr() {
    return this.getIncSheetData().getUnusualIncYr();
  }

  public long getVolume10d() {
    return this.shareData.getVolume10d();
  }

  public long getVolumeMonth3m() {
    return this.shareData.getVolumeMonth3m();
  }

  public String getWeb() {
    return this.getCompanyInfo().getWeb();
  }

  public int getYear() {
    return this.year;
  }

  public String getZip() {
    return this.getCompanyInfo().getZip();
  }

  public boolean isAdr() {
    return this.getCompanyInfo().isAdr();
  }

  public boolean isDrp() {
    return this.getCompanyInfo().isDrp();
  }

  public void setQuarter(int quarter) {
    this.quarter = quarter;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    String ret = "";
    try {
      if (this.companyInfo.getTicker() == null) {
        ret = "";
      }
      else {
        ret = String.format("%d Q%d%n", this.year, this.quarter);
        ret += this.companyInfo.toDbOuput();
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
