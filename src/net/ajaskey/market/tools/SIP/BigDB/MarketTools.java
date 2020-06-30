
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
package net.ajaskey.market.tools.SIP.BigDB;

import java.io.FileNotFoundException;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData;

/**
 * This class is used as the public static API into all other classes.
 */
public class MarketTools {

  public static double[] getAcctPayableQtr(FieldData fd) {
    return fd.getBalSheetData().getAcctPayableQtr();
  }

  public static double[] getAcctPayableYr(FieldData fd) {
    return fd.getBalSheetData().getAcctPayableYr();
  }

  public static double[] getAcctRxQtr(FieldData fd) {
    return fd.getBalSheetData().getAcctRxQtr();
  }

  public static double[] getAcctRxYr(FieldData fd) {
    return fd.getBalSheetData().getAcctRxYr();
  }

  public static double[] getAdjToIncQtr(FieldData fd) {
    return fd.getIncSheetData().getAdjToIncQtr();
  }

  public static double[] getAdjToIncYr(FieldData fd) {
    return fd.getIncSheetData().getAdjToIncYr();
  }

  public static BalSheetFileData getBalSheetData(FieldData fd) {
    return fd.getBalSheetData();
  }

  public static double getBeta(FieldData fd) {
    return fd.getShareData().getBeta();
  }

  public static double[] getBvpsQtr(FieldData fd) {
    return fd.getBalSheetData().getBvpsQtr();
  }

  public static double[] getBvpsYr(FieldData fd) {
    return fd.getBalSheetData().getBvpsYr();
  }

  public static double[] getCapExQtr(FieldData fd) {
    return fd.getCashData().getCapExQtr();
  }

  public static CashFileData getCashData(FieldData fd) {
    return fd.getCashData();
  }

  public static double[] getCashFromFinQtr(FieldData fd) {
    return fd.getCashData().getCashFromFinQtr();
  }

  public static double[] getCashFromInvQtr(FieldData fd) {
    return fd.getCashData().getCashFromInvQtr();
  }

  public static double[] getCashFromOpsQtr(FieldData fd) {
    return fd.getCashData().getCashFromOpsQtr();
  }

  public static double[] getCashQtr(FieldData fd) {
    return fd.getBalSheetData().getCashQtr();
  }

  public static double[] getCashYr(FieldData fd) {
    return fd.getBalSheetData().getCashYr();
  }

  public static String getCity(FieldData fd) {
    return fd.getCompanyInfo().getCity();
  }

  public static double[] getCogsQtr(FieldData fd) {
    return fd.getIncSheetData().getCogsQtr();
  }

  public static double[] getCogsYr(FieldData fd) {
    return fd.getIncSheetData().getCogsYr();
  }

  public static CompanyFileData getCompanyInfo(FieldData fd) {
    return fd.getCompanyInfo();
  }

  public static String getCountry(FieldData fd) {
    return fd.getCompanyInfo().getCountry();
  }

  public static double[] getCurrAssetsQtr(FieldData fd) {
    return fd.getBalSheetData().getCurrAssetsQtr();
  }

  public static double[] getCurrAssetsYr(FieldData fd) {
    return fd.getBalSheetData().getCurrAssetsYr();
  }

  public static DateTime getCurrFiscalYear(FieldData fd) {
    return MarketTools.getEstimateData(fd).getCurrFiscalYear();
  }

  public static double[] getCurrLiabQtr(FieldData fd) {
    return fd.getBalSheetData().getCurrLiabQtr();
  }

  public static double[] getCurrLiabYr(FieldData fd) {
    return fd.getBalSheetData().getCurrLiabYr();
  }

  public static double[] getDepreciationQtr(FieldData fd) {
    return fd.getIncSheetData().getDepreciationQtr();
  }

  public static double[] getDepreciationYr(FieldData fd) {
    return fd.getIncSheetData().getDepreciationYr();
  }

  public static double[] getDividendQtr(FieldData fd) {
    return fd.getIncSheetData().getDividendQtr();
  }

  public static double[] getDividendYr(FieldData fd) {
    return fd.getIncSheetData().getDividendYr();
  }

  public static double getDollar3m(FieldData fd) {
    return fd.getShareData().getDollar3m();
  }

  public static DowEnum getDowIndex(FieldData fd) {
    return fd.getCompanyInfo().getDowIndex();
  }

  public static String getDowIndexStr(FieldData fd) {
    return fd.getCompanyInfo().getDowIndexStr();
  }

  public static double[] getEpsContQtr(FieldData fd) {
    return fd.getIncSheetData().getEpsContQtr();
  }

  public static double[] getEpsContYr(FieldData fd) {
    return fd.getIncSheetData().getEpsContYr();
  }

  public static double[] getEpsDilContQtr(FieldData fd) {
    return fd.getIncSheetData().getEpsDilContQtr();
  }

  public static double[] getEpsDilContYr(FieldData fd) {
    return fd.getIncSheetData().getEpsDilContYr();
  }

  public static double[] getEpsDilQtr(FieldData fd) {
    return fd.getIncSheetData().getEpsDilQtr();
  }

  public static double[] getEpsDilYr(FieldData fd) {
    return fd.getIncSheetData().getEpsDilYr();
  }

  public static double getEpsQ0(FieldData fd) {
    return fd.getEstimateData().getEpsQ0();
  }

  public static double getEpsQ1(FieldData fd) {
    return MarketTools.getEstimateData(fd).getEpsQ1();
  }

  public static double[] getEpsQtr(FieldData fd) {
    return fd.getIncSheetData().getEpsQtr();
  }

  public static double getEpsY0(FieldData fd) {
    return fd.getEstimateData().getEpsY0();
  }

  public static double getEpsY1(FieldData fd) {
    return fd.getEstimateData().getEpsY1();
  }

  public static double getEpsY2(FieldData fd) {
    return fd.getEstimateData().getEpsY2();
  }

  public static double[] getEpsYr(FieldData fd) {
    return fd.getIncSheetData().getEpsYr();
  }

  public static double[] getEquityQtr(FieldData fd) {
    return fd.getBalSheetData().getEquityQtr();
  }

  public static double[] getEquityYr(FieldData fd) {
    return fd.getBalSheetData().getEquityYr();
  }

  public static EstimateFileData getEstimateData(FieldData fd) {
    return fd.getEstimateData();
  }

  public static ExchEnum getExchange(FieldData fd) {
    return fd.getExchange();
  }

  public static double getFloatshr(FieldData fd) {
    return fd.getShareData().getFloatshr();
  }

  /**
   *
   * Calls FieldData class to return FieldData for requested ticker from year and
   * quarter from DB file data.
   *
   * @param ticker The individual stock symbol
   * @param yr     year
   * @param qtr    quarter
   * @param ft     FiletypeEnum TEXT or BINARY
   * @return FieldData
   *
   * @see net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData#getFromDb
   */
  public static FieldData getFromDb(String ticker, int yr, int qtr, FiletypeEnum ft) {
    return FieldData.getFromDb(ticker, yr, qtr, ft);
  }

  /**
   * memory.
   *
   * @param tkr The individual stock symbol
   * @param yr  year
   * @param qtr quarter (1-4)
   * @return FieldData
   *
   * @see net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData#getFromMemory
   */
  public static FieldData getFromMemory(String tkr, int yr, int qtr) {
    return FieldData.getFromMemory(tkr, yr, qtr);
  }

  public static double[] getGoodwillQtr(FieldData fd) {
    return fd.getBalSheetData().getGoodwillQtr();
  }

  public static double[] getGoodwillYr(FieldData fd) {
    return fd.getBalSheetData().getGoodwillYr();
  }

  public static double[] getGrossIncQtr(FieldData fd) {
    return fd.getIncSheetData().getGrossIncQtr();
  }

  public static double[] getGrossIncYr(FieldData fd) {
    return fd.getIncSheetData().getGrossIncYr();
  }

  public static double[] getGrossOpIncQtr(FieldData fd) {
    return fd.getIncSheetData().getGrossOpIncQtr();
  }

  public static double[] getGrossOpIncYr(FieldData fd) {
    return fd.getIncSheetData().getGrossOpIncYr();
  }

  public static double[] getIncAfterTaxQtr(FieldData fd) {
    return fd.getIncSheetData().getIncAfterTaxQtr();
  }

  public static double[] getIncAfterTaxYr(FieldData fd) {
    return fd.getIncSheetData().getIncAfterTaxYr();
  }

  public static double[] getIncPrimaryEpsQtr(FieldData fd) {
    return fd.getIncSheetData().getIncPrimaryEpsQtr();
  }

  public static double[] getIncPrimaryEpsYr(FieldData fd) {
    return fd.getIncSheetData().getIncPrimaryEpsYr();
  }

  public static IncSheetFileData getIncSheetData(FieldData fd) {
    return fd.getIncSheetData();
  }

  public static double[] getIncTaxQtr(FieldData fd) {
    return fd.getIncSheetData().getIncTaxQtr();
  }

  public static double[] getIncTaxYr(FieldData fd) {
    return fd.getIncSheetData().getIncTaxYr();
  }

  public static String getIndustry(FieldData fd) {
    return fd.getIndustry();
  }

  public static int getInsiderBuys(FieldData fd) {
    return fd.getShareData().getInsiderBuys();
  }

  public static int getInsiderBuyShrs(FieldData fd) {
    return fd.getShareData().getInsiderBuyShrs();
  }

  public static double getInsiderNetPercentOutstanding(FieldData fd) {
    return fd.getShareData().getInsiderNetPercentOutstanding();
  }

  public static int getInsiderNetTrades(FieldData fd) {
    return fd.getShareData().getInsiderNetTrades();
  }

  public static double getInsiderOwnership(FieldData fd) {
    return fd.getShareData().getInsiderOwnership();
  }

  public static int getInsiderSells(FieldData fd) {
    return fd.getShareData().getInsiderSells();
  }

  public static int getInsiderSellShrs(FieldData fd) {
    return fd.getShareData().getInsiderSellShrs();
  }

  public static int getInstBuyShrs(FieldData fd) {
    return fd.getShareData().getInstBuyShrs();
  }

  public static double getInstOwnership(FieldData fd) {
    return fd.getShareData().getInstOwnership();
  }

  public static int getInstSellShrs(FieldData fd) {
    return fd.getShareData().getInstSellShrs();
  }

  public static int getInstShareholders(FieldData fd) {
    return fd.getShareData().getInstShareholders();
  }

  public static double[] getIntExpNonOpQtr(FieldData fd) {
    return fd.getIncSheetData().getIntExpNonOpQtr();
  }

  public static double[] getIntExpNonOpYr(FieldData fd) {
    return fd.getIncSheetData().getIntExpNonOpYr();
  }

  public static double[] getIntExpQtr(FieldData fd) {
    return fd.getIncSheetData().getIntExpQtr();
  }

  public static double[] getIntExpYr(FieldData fd) {
    return fd.getIncSheetData().getIntExpYr();
  }

  public static double[] getInventoryQtr(FieldData fd) {
    return fd.getBalSheetData().getInventoryQtr();
  }

  public static double[] getInventoryYr(FieldData fd) {
    return fd.getBalSheetData().getInventoryYr();
  }

  public static DateTime getLatestQtrEps(FieldData fd) {
    return fd.getEstimateData().getLatestQtrEps();
  }

  public static double[] getLiabEquityQtr(FieldData fd) {
    return fd.getBalSheetData().getLiabEquityQtr();
  }

  public static double[] getLiabEquityYr(FieldData fd) {
    return fd.getBalSheetData().getLiabEquityYr();
  }

  /**
   * Calls FieldData class to return List of FieldData for requested ticker list
   * for year and quarter from internal memory.
   *
   * @param tList The list of individual stock symbols
   * @param yr    year
   * @param qtr   quarter (1-4)
   * @return List of FieldData
   *
   * @see net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData#getListFromMemory
   */
  public static List<FieldData> getListFromMemory(List<String> tList, int yr, int qtr) {
    return FieldData.getListFromMemory(tList, yr, qtr);
  }

  public static double[] getLtDebtQtr(FieldData fd) {
    return fd.getBalSheetData().getLtDebtQtr();
  }

  public static double[] getLtDebtYr(FieldData fd) {
    return fd.getBalSheetData().getLtDebtYr();
  }

  public static double[] getLtInvestQtr(FieldData fd) {
    return fd.getBalSheetData().getLtInvestQtr();
  }

  public static double[] getLtInvestYr(FieldData fd) {
    return fd.getBalSheetData().getLtInvestYr();
  }

  public static double getMktCap(FieldData fd) {
    return fd.getShareData().getMktCap();
  }

  public static String getName(FieldData fd) {
    return fd.getName();
  }

  public static double[] getNetFixedAssetsQtr(FieldData fd) {
    return fd.getBalSheetData().getNetFixedAssetsQtr();
  }

  public static double[] getNetFixedAssetsYr(FieldData fd) {
    return fd.getBalSheetData().getNetFixedAssetsYr();
  }

  public static double[] getNetIncQtr(FieldData fd) {
    return fd.getIncSheetData().getNetIncQtr();
  }

  public static double[] getNetIncYr(FieldData fd) {
    return fd.getIncSheetData().getNetIncYr();
  }

  public static double[] getNonrecurringItemsQtr(FieldData fd) {
    return fd.getIncSheetData().getNonrecurringItemsQtr();
  }

  public static double[] getNonrecurringItemsYr(FieldData fd) {
    return fd.getIncSheetData().getNonrecurringItemsYr();
  }

  public static int getNumEmployees(FieldData fd) {
    return fd.getCompanyInfo().getNumEmployees();
  }

  public static double[] getOtherCurrAssetsQtr(FieldData fd) {
    return fd.getBalSheetData().getOtherCurrAssetsQtr();
  }

  public static double[] getOtherCurrAssetsYr(FieldData fd) {
    return fd.getBalSheetData().getOtherCurrAssetsYr();
  }

  public static double[] getOtherCurrLiabQtr(FieldData fd) {
    return fd.getBalSheetData().getOtherCurrLiabQtr();
  }

  public static double[] getOtherCurrLiabYr(FieldData fd) {
    return fd.getBalSheetData().getOtherCurrLiabYr();
  }

  public static double[] getOtherIncQtr(FieldData fd) {
    return fd.getIncSheetData().getOtherIncQtr();
  }

  public static double[] getOtherIncYr(FieldData fd) {
    return fd.getIncSheetData().getOtherIncYr();
  }

  public static double[] getOtherLtAssetsQtr(FieldData fd) {
    return fd.getBalSheetData().getOtherLtAssetsQtr();
  }

  public static double[] getOtherLtAssetsYr(FieldData fd) {
    return fd.getBalSheetData().getOtherLtAssetsYr();
  }

  public static double[] getOtherLtLiabQtr(FieldData fd) {
    return fd.getBalSheetData().getOtherLtLiabQtr();
  }

  public static double[] getOtherLtLiabYr(FieldData fd) {
    return fd.getBalSheetData().getOtherLtLiabYr();
  }

  public static String getPhone(FieldData fd) {
    return fd.getCompanyInfo().getPhone();
  }

  public static double[] getPrefStockQtr(FieldData fd) {
    return fd.getBalSheetData().getPrefStockQtr();
  }

  public static double[] getPrefStockYr(FieldData fd) {
    return fd.getBalSheetData().getPrefStockYr();
  }

  public static double[] getPreTaxIncQtr(FieldData fd) {
    return fd.getIncSheetData().getPreTaxIncQtr();
  }

  public static double[] getPreTaxIncYr(FieldData fd) {
    return fd.getIncSheetData().getPreTaxIncYr();
  }

  public static double getPrice(FieldData fd) {
    return fd.getShareData().getPrice();
  }

  public static double getPrice52hi(FieldData fd) {
    return fd.getShareData().getPrice52hi();
  }

  public static double getPrice52lo(FieldData fd) {
    return fd.getShareData().getPrice52lo();
  }

  public static double[] getPricesQtr(FieldData fd) {
    return fd.getCompanyInfo().getPriceQtr();
  }

  public static int getQuarter(FieldData fd) {
    return fd.getQuarter();
  }

  public static double[] getRdQtr(FieldData fd) {
    return fd.getIncSheetData().getRdQtr();
  }

  public static double[] getRdYr(FieldData fd) {
    return fd.getIncSheetData().getRdYr();
  }

  public static double[] getSalesQtr(FieldData fd) {
    return fd.getIncSheetData().getSalesQtr();
  }

  public static double[] getSalesYr(FieldData fd) {
    return fd.getIncSheetData().getSalesYr();
  }

  public static String getSector(FieldData fd) {
    return fd.getSector();
  }

  public static SharesFileData getShares(FieldData fd) {
    return fd.getShareData();
  }

  public static double[] getSharesQtr(FieldData fd) {
    return fd.getShareData().getSharesQtr();
  }

  public static double[] getSharesYr(FieldData fd) {
    return fd.getShareData().getSharesYr();
  }

  public static String getSic(FieldData fd) {
    return fd.getCompanyInfo().getSic();
  }

  public static SnpEnum getSnpIndex(FieldData fd) {
    return fd.getCompanyInfo().getSnpIndex();
  }

  public static String getSnpIndexStr(FieldData fd) {
    return fd.getCompanyInfo().getSnpIndexStr();
  }

  public static String getState(FieldData fd) {
    return fd.getCompanyInfo().getState();
  }

  public static double[] getStDebtQtr(FieldData fd) {
    return fd.getBalSheetData().getStDebtQtr();
  }

  public static double[] getStDebtYr(FieldData fd) {
    return fd.getBalSheetData().getStDebtYr();
  }

  public static double[] getStInvestQtr(FieldData fd) {
    return fd.getBalSheetData().getStInvestQtr();
  }

  public static double[] getStInvestYr(FieldData fd) {
    return fd.getBalSheetData().getStInvestYr();
  }

  public static String getStreet(FieldData fd) {
    return fd.getCompanyInfo().getStreet();
  }

  public static String getTicker(FieldData fd) {
    return fd.getTicker();
  }

  public static double[] getTotalOpExpQtr(FieldData fd) {
    return fd.getIncSheetData().getTotalOpExpQtr();
  }

  public static double[] getTotalOpExpYr(FieldData fd) {
    return fd.getIncSheetData().getTotalOpExpYr();
  }

  public static double[] getUnusualIncQtr(FieldData fd) {
    return fd.getIncSheetData().getUnusualIncQtr();
  }

  public static double[] getUnusualIncYr(FieldData fd) {
    return fd.getIncSheetData().getUnusualIncYr();
  }

  public static long getVolume10d(FieldData fd) {
    return fd.getShareData().getVolume10d();
  }

  public static long getVolumeMonth3m(FieldData fd) {
    return fd.getShareData().getVolumeMonth3m();
  }

  public static String getWeb(FieldData fd) {
    return fd.getCompanyInfo().getWeb();
  }

  public static int getYear(FieldData fd) {
    return fd.getYear();
  }

  public static String getZip(FieldData fd) {
    return fd.getCompanyInfo().getZip();
  }

  /**
   * Calls FieldData class to read SIP tab separated data files. Stores the data
   * in array for later use.
   *
   * @param yr  year
   * @param qtr quarter (1-4)
   * @param ft  FiletypeEnum
   * @throws FileNotFoundException Requested file not found
   *
   * @see net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData#parseSipData
   */
  public static void parseSipData(int yr, int qtr, FiletypeEnum ft) throws FileNotFoundException {
    FieldData.parseSipData(yr, qtr, ft);
  }

  /**
   * Calls FieldData class to set internal memory to data from firstYear to
   * endYear.
   *
   * @param firstYear First full year of data
   * @param endYear   Last full year of data
   * @param ft        FiletypeEnum BIG_BINARY valid
   *
   * @see net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData#setMemory
   */
  public static void setMemory(int firstYear, int endYear, FiletypeEnum ft) {
    FieldData.setMemory(firstYear, endYear, ft);
  }

  /**
   * Calls FieldData class to set internal memory to request year and quarter.
   *
   * @param yr  year
   * @param qtr quarter (1-4)
   * @param ft  FiletypeEnum BINARY or TEXT valid
   *
   * @see net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData#setQMemory
   */
  public static void setQMemory(int yr, int qtr, FiletypeEnum ft) {
    FieldData.setQMemory(yr, qtr, ft);
  }

}
