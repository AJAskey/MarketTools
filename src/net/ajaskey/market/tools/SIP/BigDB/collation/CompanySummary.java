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
package net.ajaskey.market.tools.SIP.BigDB.collation;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.market.tools.SIP.BigDB.DowEnum;
import net.ajaskey.market.tools.SIP.BigDB.ExchEnum;
import net.ajaskey.market.tools.SIP.BigDB.SnpEnum;
import net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData;

/**
 * This class reads a company summary file and provides utility methods to
 * return lists of various ticker data. One company summary file
 * (CompanySummary.txt) will exist for each year/quarter combination.
 *
 * Lists generated: SnP, DOW, Exch, ADR
 *
 */
public class CompanySummary {

  /**
   * Returns List of tickers matching requested criteria
   *
   * @param yr    year
   * @param qtr   quarter (1-4)
   * @param snp   SNP enumeration
   * @param dow   DOW enumeration
   * @param exch  Exchange enumeration
   * @param price Lowest price
   * @param vol   Lowest volume
   * @return List of String
   */
  public static List<String> get(int yr, int qtr, SnpEnum snp, DowEnum dow, ExchEnum exch, double price, long vol) {

    final List<String> retList = new ArrayList<>();

    final List<CompanySummary> csList = CompanySummary.getCompanySummary(yr, qtr);

    for (final CompanySummary cs : csList) {

      if (CompanySummary.matchSnp(cs.snp, snp)) {
        if (CompanySummary.matchDow(cs.dow, dow)) {
          if (CompanySummary.matchExch(cs.exch, exch)) {
            if (cs.price >= price) {
              if (cs.volume >= vol) {
                retList.add(cs.ticker);
              }
            }
          }
        }
      }
    }

    return retList;
  }

  /**
   * Returns a list of tickers that are ADR.
   *
   * @param yr  year
   * @param qtr quarter (1-4)
   * @return List of String
   */
  public static List<String> getAdr(int yr, int qtr) {

    final List<String> retList = new ArrayList<>();
    final List<CompanySummary> csList = CompanySummary.getCompanySummary(yr, qtr);
    for (final CompanySummary cs : csList) {
      if (cs.isAdr) {
        retList.add(cs.ticker);
      }
    }
    return retList;
  }

  /**
   * Returns a list of tickers from the requested CompanySummary.txt file.
   *
   * @param yr  year
   * @param qtr quarter (1-4)
   * @return List of CompanySummary
   */
  public static List<CompanySummary> getCompanySummary(int yr, int qtr) {

    final List<CompanySummary> sumList = new ArrayList<>();

    try {

      final String fname = String.format("%s%d/Q%d/CompanySummary.txt", FieldData.outbasedir, yr, qtr);
      final List<String> retList = TextUtils.readTextFile(fname, true);

      for (final String s : retList) {
        final CompanySummary cs = new CompanySummary(s);
        if (cs.valid) {
          sumList.add(cs);
        }
      }
    }
    catch (Exception e) {
      FieldData.getWarning(e);
    }
    return sumList;
  }

  /**
   * Returns a list of tickers for the requested Dow Index.
   *
   * @param index SnpEnum : INDUSTRIAL, TRANSPORTATION, UTILITY, NONE
   * @param yr    year
   * @param qtr   quarter (1-4)
   * @return List of String
   */
  public static List<String> getDow(DowEnum index, int yr, int qtr) {

    final List<String> retList = new ArrayList<>();
    final List<CompanySummary> csList = CompanySummary.getCompanySummary(yr, qtr);
    for (final CompanySummary cs : csList) {
      if (cs.dow.equals(index)) {
        retList.add(cs.ticker);
      }
    }
    return retList;
  }

  /**
   * Returns a list of tickers for the requested Exchange.
   *
   * @param index SnpEnum : NYSE, NASDAQ, AMEX, OTC, NONE
   * @param yr    year
   * @param qtr   quarter (1-4)
   * @return List of String
   */
  public static List<String> getExch(ExchEnum index, int yr, int qtr) {

    final List<String> retList = new ArrayList<>();
    final List<CompanySummary> csList = CompanySummary.getCompanySummary(yr, qtr);
    for (final CompanySummary cs : csList) {
      if (cs.exch.equals(index)) {
        retList.add(cs.ticker);
      }
    }
    return retList;
  }

  /**
   * Returns a list of tickers for the requested SnP Index.
   *
   * @param index SnpEnum : SP500, SP400, SP600, NONE
   * @param yr    year
   * @param qtr   quarter (1-4)
   * @return List of String
   */
  public static List<String> getSnp(SnpEnum index, int yr, int qtr) {

    final List<String> retList = new ArrayList<>();
    final List<CompanySummary> csList = CompanySummary.getCompanySummary(yr, qtr);
    for (final CompanySummary cs : csList) {
      if (cs.snp.equals(index)) {
        retList.add(cs.ticker);
      }
    }
    return retList;
  }

  /**
   * Writes existing company summary data to file CompanySummary.txt
   *
   * @param yr  year
   * @param qtr quarter (1-4)
   */
  public static void write(int yr, int qtr) {

    final String fnameout = String.format("%s%d/Q%d/CompanySummary.txt", FieldData.outbasedir, yr, qtr);
    try (PrintWriter pw = new PrintWriter(fnameout)) {
      for (final CompanyFileData cfd : CompanyFileData.getList()) {
        final SharesFileData sfd = SharesFileData.find(cfd.getTicker());
        if (sfd != null) {
          final double avgPrice = (sfd.getPrice() * 8.0 + sfd.getPrice52hi() + sfd.getPrice52lo()) / 10.0;
          final long avgVol = sfd.getVolumeMonth3m() / 21 * 1000;
          pw.printf("%s\t%s\t%s\t%s\t%s\t%s\t%.2f\t%d%n", cfd.getTicker(), cfd.getName(), cfd.getSnpIndexStr(), cfd.getDowIndexStr(),
              cfd.getExchangeStr(), cfd.isAdr(), avgPrice, avgVol);
        }
        else {
          System.out.println("Warning. CompanySummary.write() sfd is null for " + cfd.getTicker());
        }
      }
    }
    catch (final Exception e) {
      System.out.println("Error. Unable to write CompanySummary.txt file");
    }
  }

  /**
   * Returns dow1 equals dow2
   *
   * @param dow1
   * @param dow2
   * @return boolean
   */
  private static boolean matchDow(DowEnum dow1, DowEnum dow2) {
    boolean ret = false;
    try {
      if (dow2.equals(DowEnum.NONE)) {
        return true;
      }
      ret = dow1.equals(dow2);
    }
    catch (final Exception e) {
      ret = false;
    }
    return ret;
  }

  /**
   * Returns exch1 equals exch2
   *
   * @param exch1
   * @param exch2
   * @return boolean
   */
  private static boolean matchExch(ExchEnum exch1, ExchEnum exch2) {
    boolean ret = false;
    try {
      if (exch2.equals(ExchEnum.NONE)) {
        return true;
      }
      ret = exch1.equals(exch2);
    }
    catch (final Exception e) {
      ret = false;
    }
    return ret;
  }

  /**
   * Returns snp1 equals snp2
   *
   * @param snp1
   * @param snp2
   * @return boolean
   */
  private static boolean matchSnp(SnpEnum snp1, SnpEnum snp2) {
    boolean ret = false;
    try {
      if (snp2.equals(SnpEnum.NONE)) {
        return true;
      }
      ret = snp1.equals(snp2);
    }
    catch (final Exception e) {
      ret = false;
    }
    return ret;
  }

  public DowEnum  dow;
  public ExchEnum exch;
  public boolean  isAdr;
  public String   name;
  public double   price;
  public SnpEnum  snp;
  public String   ticker;
  public long     volume;
  private boolean valid;

  /**
   * Constructor private
   */
  private CompanySummary() {
  }

  /**
   * Constructor private
   *
   * @param s String describing one company of data
   */
  private CompanySummary(String s) {
    try {
      final String[] fld = s.split("\t");
      this.ticker = fld[0].trim();
      this.name = fld[1].trim();
      this.snp = SnpEnum.valueOf(fld[2].trim());
      this.dow = DowEnum.valueOf(fld[3].trim());
      this.exch = ExchEnum.valueOf(fld[4].trim());
      this.isAdr = Boolean.parseBoolean(fld[5].trim());
      this.price = Double.parseDouble(fld[6].trim());
      this.volume = Integer.parseInt(fld[7].trim());
      this.valid = true;
    }
    catch (final Exception e) {
      this.valid = false;
    }
  }

  @Override
  public String toString() {
    String ret = String.format("%s\t%s", this.ticker, this.name);
    ret += String.format("%n SnP  : %s", this.snp);
    ret += String.format("%n Dow  : %s", this.dow);
    ret += String.format("%n Exch : %s", this.exch);
    ret += String.format("%n ADR  : %s", this.isAdr);
    return ret;
  }

}
