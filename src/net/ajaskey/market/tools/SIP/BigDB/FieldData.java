package net.ajaskey.market.tools.SIP.BigDB;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;

public class FieldData {

  final static String inbasedir  = String.format("D:/dev/MarketTools/markettools.git/data/BigDB/");
  final static String outbasedir = String.format("out/BigDB/");

  public static List<FieldData> readData(int year, int quarter) {

    final String indir = String.format("%s%s/Q%d/", FieldData.outbasedir, year, quarter);

    final List<FieldData> fdList = new ArrayList<>();

    final String[] ext = { "txt" };
    final List<File> fList = Utils.getDirTree(indir, ext);
    for (final File f : fList) {

      final List<String> data = TextUtils.readTextFile(f, true);

      final FieldData fd = new FieldData(year, quarter);

      for (final String s : data) {

        final String[] tfld = s.split(":");

        // System.out.println(s);
        // System.out.println(tfld.length);

        final String fld = tfld[0].trim();

        String val = "";
        String val2 = "";
        if (tfld.length > 2) {
          val = "http:";
          val2 = tfld[2].trim();
        }
        else if (tfld.length > 1) {
          val = tfld[1].trim();
        }

        if (fld.equals("ticker")) {
          fd.companyInfo.setTicker(val);
          fd.ticker = fd.companyInfo.getTicker();
        }
        else if (fld.equals("name")) {
          fd.companyInfo.setName(val);
        }
        else if (fld.equals("exchange")) {
          fd.companyInfo.setExchange(val);
        }
        else if (fld.equals("sector")) {
          fd.companyInfo.setSector(val);
        }
        else if (fld.equals("industry")) {
          fd.companyInfo.setIndustry(val);
        }
        else if (fld.equals("sic")) {
          fd.companyInfo.setSic(val);
        }
        else if (fld.equals("employees")) {
          fd.companyInfo.setNumEmployees(val);
        }
        else if (fld.equals("snp index")) {
          fd.companyInfo.setSnpIndex(val);
        }
        else if (fld.equals("dow index")) {
          fd.companyInfo.setDowIndex(val);
        }
        else if (fld.equals("adr")) {
          fd.companyInfo.setAdr(val);
        }
        else if (fld.equals("drp")) {
          fd.companyInfo.setDrp(val);
        }
        else if (fld.equals("street")) {
          fd.companyInfo.setStreet(val);
        }
        else if (fld.equals("city")) {
          fd.companyInfo.setCity(val);
        }
        else if (fld.equals("state")) {
          fd.companyInfo.setState(val);
        }
        else if (fld.equals("country")) {
          fd.companyInfo.setCountry(val);
        }
        else if (fld.equals("zip")) {
          fd.companyInfo.setZip(val);
        }
        else if (fld.equals("phone")) {
          fd.companyInfo.setPhone(val);
        }
        else if (fld.equals("web")) {
          fd.companyInfo.setWeb(val + val2);
        }
        //
        // Share Data
        else if (fld.equals("price")) {
          fd.shareData.setPrice(val);
        }
        else if (fld.equals("float")) {
          fd.shareData.setFloatshr(val);
        }
        else if (fld.equals("market cap")) {
          fd.shareData.setMktCap(val);
        }
        else if (fld.equals("volume 3m avg")) {
          fd.shareData.setVolume3m(val);
        }
        else if (fld.equals("dollars 3m avg")) {
          fd.shareData.setDollar3m(val);
        }
        else if (fld.equals("beta")) {
          fd.shareData.setBeta(val);
        }
        else if (fld.equals("insider ownership")) {
          fd.shareData.setInsiderOwnership(val);
        }
        else if (fld.equals("insider buys")) {
          fd.shareData.setInsiderBuys(val);
        }
        else if (fld.equals("insider buy shares")) {
          fd.shareData.setInsiderBuyShrs(val);
        }
        else if (fld.equals("insider sells")) {
          fd.shareData.setInsiderSells(val);
        }
        else if (fld.equals("insider sell shares")) {
          fd.shareData.setInsiderSellShrs(val);
        }
        else if (fld.equals("insider net shares")) {
          fd.shareData.setInsiderNetTrades(val);
        }
        else if (fld.equals("inst buy shares")) {
          fd.shareData.setInstBuyShrs(val);
        }
        else if (fld.equals("inst sell shares")) {
          fd.shareData.setInstSellShrs(val);
        }
        else if (fld.equals("inst shareholders")) {
          fd.shareData.setInstShareholders(val);
        } //
        else if (fld.equals("inst ownership")) {
          fd.shareData.setInstOwnership(val);
        } //
        else if (fld.contains("Data for ")) {
        }
        else {
          // System.out.printf("Unknown tag '%s' in Company File Data%n", fld);
        }
      }
      if (fd.companyInfo.getTicker() != null) {
        fdList.add(fd);
      }
    }
    return fdList;
  }

  private final int year;
  private final int quarter;
  private String    ticker;

  private CompanyFileData companyInfo;

  public int getYear() {
    return year;
  }

  public int getQuarter() {
    return quarter;
  }

  private EstimateFileData estimateData;
  private SharesFileData   shareData;
  private YearQuarterData  shares;
  private YearQuarterData  cash;
  private YearQuarterData  stInvestments;
  private YearQuarterData  acctRx;
  private YearQuarterData  inventory;
  private YearQuarterData  otherCurrAssets;
  private YearQuarterData  currAssets;
  private YearQuarterData  netFixedAssets;
  private YearQuarterData  ltInvestments;
  private YearQuarterData  goodwill;
  private YearQuarterData  otherLtAssets;
  private YearQuarterData  totalAssets;
  private YearQuarterData  acctPayable;
  private YearQuarterData  stDebt;
  private YearQuarterData  otherCurrLiab;
  private YearQuarterData  currLiab;
  private YearQuarterData  ltDebt;
  private YearQuarterData  otherLtLiab;
  private YearQuarterData  totalLiab;
  private YearQuarterData  prefStock;
  private YearQuarterData  equity;
  private YearQuarterData  liabEquity;
  private YearQuarterData  bvps;
  //
  private YearQuarterData sales;
  private YearQuarterData cogs;
  private YearQuarterData grossInc;
  private YearQuarterData rd;
  private YearQuarterData depreciation;
  private YearQuarterData intExp;
  private YearQuarterData unusualInc;
  private YearQuarterData totOpExp;
  private YearQuarterData grossOpInc;
  private YearQuarterData otherIntExp;
  private YearQuarterData otherInc;
  private YearQuarterData pretaxInc;
  private YearQuarterData incomeTax;
  private YearQuarterData incAfterTax;
  private YearQuarterData adjToInc;
  private YearQuarterData incPrimaryEps;
  private YearQuarterData nonrecurringItem;
  private YearQuarterData netInc;
  private YearQuarterData eps;
  private YearQuarterData epsCont;
  private YearQuarterData epsDil;
  private YearQuarterData epsDilCont;
  private YearQuarterData dividend;

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

    this.companyInfo = cfd;
    this.estimateData = efd;
    this.shareData = sfd;

    this.shares = new YearQuarterData(sfd.getSharesY(), sfd.getSharesQ());

    this.cash = new YearQuarterData(bfd.getCashYr(), bfd.getCashQtr());
    this.stInvestments = new YearQuarterData(bfd.getStInvestYr(), bfd.getStInvestQtr());
    this.acctRx = new YearQuarterData(bfd.getAcctRxYr(), bfd.getAcctRxQtr());
    this.inventory = new YearQuarterData(bfd.getInventoryYr(), bfd.getInventoryQtr());
    this.otherCurrAssets = new YearQuarterData(bfd.getOtherCurrAssetsYr(), bfd.getOtherCurrAssetsQtr());
    this.currAssets = new YearQuarterData(bfd.getCurrAssetsYr(), bfd.getCurrAssetsQtr());
    this.netFixedAssets = new YearQuarterData(bfd.getNetFixedAssetsYr(), bfd.getNetFixedAssetsQtr());
    this.ltInvestments = new YearQuarterData(bfd.getLtInvestYr(), bfd.getLtInvestQtr());
    this.goodwill = new YearQuarterData(bfd.getGoodwillYr(), bfd.getGoodwillQtr());
    this.otherLtAssets = new YearQuarterData(bfd.getOtherLtAssetsYr(), bfd.getOtherLtAssetsQtr());
    this.totalAssets = new YearQuarterData(bfd.getTotalAssetsYr(), bfd.getTotalAssetsQtr());
    this.acctPayable = new YearQuarterData(bfd.getAcctPayableYr(), bfd.getAcctPayableQtr());
    this.stDebt = new YearQuarterData(bfd.getStDebtYr(), bfd.getStDebtQtr());
    this.otherCurrLiab = new YearQuarterData(bfd.getOtherCurrLiabYr(), bfd.getOtherCurrLiabQtr());
    this.currLiab = new YearQuarterData(bfd.getCurrLiabYr(), bfd.getCurrLiabQtr());
    this.ltDebt = new YearQuarterData(bfd.getLtDebtYr(), bfd.getLtDebtQtr());
    this.otherLtLiab = new YearQuarterData(bfd.getOtherLtLiabYr(), bfd.getOtherLtLiabQtr());
    this.totalLiab = new YearQuarterData(bfd.getTotalLiabYr(), bfd.getTotalLiabQtr());
    this.prefStock = new YearQuarterData(bfd.getPrefStockYr(), bfd.getPrefStockQtr());
    this.equity = new YearQuarterData(bfd.getEquityYr(), bfd.getEquityQtr());
    this.liabEquity = new YearQuarterData(bfd.getLiabEquityYr(), bfd.getLiabEquityQtr());
    this.bvps = new YearQuarterData(bfd.getBvpsYr(), bfd.getBvpsQtr());

    this.sales = new YearQuarterData(ifd.getSalesYr(), ifd.getSalesQtr());
    this.cogs = new YearQuarterData(ifd.getCogsYr(), ifd.getCogsQtr());
    this.grossInc = new YearQuarterData(ifd.getGrossIncYr(), ifd.getGrossIncQtr());
    this.rd = new YearQuarterData(ifd.getRdYr(), ifd.getRdQtr());
    this.depreciation = new YearQuarterData(ifd.getDepreciationYr(), ifd.getDepreciationQtr());
    this.intExp = new YearQuarterData(ifd.getIntExpYr(), ifd.getIntExpQtr());
    this.unusualInc = new YearQuarterData(ifd.getUnusualIncYr(), ifd.getUnusualIncQtr());
    this.totOpExp = new YearQuarterData(ifd.getTotalOpExpYr(), ifd.getTotalOpExpQtr());
    this.grossOpInc = new YearQuarterData(ifd.getGrossOpExpYr(), ifd.getGrossOpExpQtr());
    // this.otherIntExp = new YearQuarterData(ifd.geto, ifd.getSalesQtr());
    this.otherInc = new YearQuarterData(ifd.getOtherIncYr(), ifd.getOtherIncQtr());
    this.incAfterTax = new YearQuarterData(ifd.getIncAfterTaxYr(), ifd.getIncAfterTaxQtr());
    this.adjToInc = new YearQuarterData(ifd.getAdjToIncYr(), ifd.getAdjToIncQtr());
    this.incPrimaryEps = new YearQuarterData(ifd.getIncPrimaryEpsYr(), ifd.getIncPrimaryEpsQtr());
    this.nonrecurringItem = new YearQuarterData(ifd.getNonrecurringItemsYr(), ifd.getNonrecurringItemsQtr());
    this.netInc = new YearQuarterData(ifd.getNetIncYr(), ifd.getNetIncQtr());
    this.eps = new YearQuarterData(ifd.getEpsYr(), ifd.getEpsQtr());
    this.epsCont = new YearQuarterData(ifd.getEpsContYr(), ifd.getEpsContQtr());
    this.epsDil = new YearQuarterData(ifd.getEpsDilYr(), ifd.getEpsDilQtr());
    this.epsDilCont = new YearQuarterData(ifd.getEpsDilContYr(), ifd.getEpsDilContQtr());
    this.dividend = new YearQuarterData(ifd.getDividendYr(), ifd.getDividendQtr());
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
    this.companyInfo = new CompanyFileData();
    this.estimateData = new EstimateFileData();
    this.shareData = new SharesFileData();

  }

  /**
   *
   * @return
   */
  public String genOutput() {
    String ret = String.format("Data for %s from %d Q%d%n", this.companyInfo.getTicker(), this.year, this.quarter);
    ret += this.companyInfo.report();
    ret += this.shareData.report();
    // ret += this.estimateData;
    return ret;

  }

  public YearQuarterData getAcctPayable() {
    return this.acctPayable;
  }

  public YearQuarterData getAcctRx() {
    return this.acctRx;
  }

  public YearQuarterData getAdjToInc() {
    return this.adjToInc;
  }

  public YearQuarterData getBvps() {
    return this.bvps;
  }

  public YearQuarterData getCash() {
    return this.cash;
  }

  public YearQuarterData getCogs() {
    return this.cogs;
  }

  public CompanyFileData getCompanyInfo() {
    return this.companyInfo;
  }

  public YearQuarterData getCurrAssets() {
    return this.currAssets;
  }

  public YearQuarterData getCurrLiab() {
    return this.currLiab;
  }

  public YearQuarterData getDepreciation() {
    return this.depreciation;
  }

  public YearQuarterData getDividend() {
    return this.dividend;
  }

  public YearQuarterData getEps() {
    return this.eps;
  }

  public YearQuarterData getEpsCont() {
    return this.epsCont;
  }

  public YearQuarterData getEpsDil() {
    return this.epsDil;
  }

  public YearQuarterData getEpsDilCont() {
    return this.epsDilCont;
  }

  public YearQuarterData getEquity() {
    return this.equity;
  }

  public EstimateFileData getEstimateData() {
    return this.estimateData;
  }

  public YearQuarterData getGoodwill() {
    return this.goodwill;
  }

  public YearQuarterData getGrossInc() {
    return this.grossInc;
  }

  public YearQuarterData getGrossOpInc() {
    return this.grossOpInc;
  }

  public YearQuarterData getIncAfterTax() {
    return this.incAfterTax;
  }

  public YearQuarterData getIncomeTax() {
    return this.incomeTax;
  }

  public YearQuarterData getIncPrimaryEps() {
    return this.incPrimaryEps;
  }

  public YearQuarterData getIntExp() {
    return this.intExp;
  }

  public YearQuarterData getInventory() {
    return this.inventory;
  }

  public YearQuarterData getLiabEquity() {
    return this.liabEquity;
  }

  public YearQuarterData getLtDebt() {
    return this.ltDebt;
  }

  public YearQuarterData getLtInvestments() {
    return this.ltInvestments;
  }

  public YearQuarterData getNetFixedAssets() {
    return this.netFixedAssets;
  }

  public YearQuarterData getNetInc() {
    return this.netInc;
  }

  public YearQuarterData getNonrecurringItem() {
    return this.nonrecurringItem;
  }

  public YearQuarterData getOtherCurrAssets() {
    return this.otherCurrAssets;
  }

  public YearQuarterData getOtherCurrLiab() {
    return this.otherCurrLiab;
  }

  public YearQuarterData getOtherInc() {
    return this.otherInc;
  }

  public YearQuarterData getOtherIntExp() {
    return this.otherIntExp;
  }

  public YearQuarterData getOtherLtAssets() {
    return this.otherLtAssets;
  }

  public YearQuarterData getOtherLtLiab() {
    return this.otherLtLiab;
  }

  public YearQuarterData getPrefLiab() {
    return this.prefStock;
  }

  public YearQuarterData getPrefStock() {
    return this.prefStock;
  }

  public YearQuarterData getPretaxInc() {
    return this.pretaxInc;
  }

  public YearQuarterData getRd() {
    return this.rd;
  }

  public YearQuarterData getSales() {
    return this.sales;
  }

  public SharesFileData getShareData() {
    return this.shareData;
  }

  public YearQuarterData getShares() {
    return this.shares;
  }

  public YearQuarterData getStDebt() {
    return this.stDebt;
  }

  public YearQuarterData getStInvestments() {
    return this.stInvestments;
  }

  public String getTicker() {
    return this.ticker;
  }

  public YearQuarterData getTotalAssets() {
    return this.totalAssets;
  }

  public YearQuarterData getTotalLiab() {
    return this.totalLiab;
  }

  public YearQuarterData getTotOpExp() {
    return this.totOpExp;
  }

  public YearQuarterData getUnusualInc() {
    return this.unusualInc;
  }

  public void setAcctPayable(YearQuarterData acctPayable) {
    this.acctPayable = acctPayable;
  }

  public void setAcctRx(YearQuarterData acctRx) {
    this.acctRx = acctRx;
  }

  public void setAdjToInc(YearQuarterData adjToInc) {
    this.adjToInc = adjToInc;
  }

  public void setBvps(YearQuarterData bvps) {
    this.bvps = bvps;
  }

  public void setCash(YearQuarterData cash) {
    this.cash = cash;
  }

  public void setCogs(YearQuarterData cogs) {
    this.cogs = cogs;
  }

  public void setCompanyInfo(CompanyFileData companyInfo) {
    this.companyInfo = companyInfo;
  }

  public void setCurrAssets(YearQuarterData currAssets) {
    this.currAssets = currAssets;
  }

  public void setCurrLiab(YearQuarterData currLiab) {
    this.currLiab = currLiab;
  }

  public void setDepreciation(YearQuarterData depreciation) {
    this.depreciation = depreciation;
  }

  public void setDividend(YearQuarterData dividend) {
    this.dividend = dividend;
  }

  public void setEps(YearQuarterData eps) {
    this.eps = eps;
  }

  public void setEpsCont(YearQuarterData epsCont) {
    this.epsCont = epsCont;
  }

  public void setEpsDil(YearQuarterData epsDil) {
    this.epsDil = epsDil;
  }

  public void setEpsDilCont(YearQuarterData epsDilCont) {
    this.epsDilCont = epsDilCont;
  }

  public void setEquity(YearQuarterData equity) {
    this.equity = equity;
  }

  public void setEstimateData(EstimateFileData estimateData) {
    this.estimateData = estimateData;
  }

  public void setGoodwill(YearQuarterData goodwill) {
    this.goodwill = goodwill;
  }

  public void setGrossInc(YearQuarterData grossInc) {
    this.grossInc = grossInc;
  }

  public void setGrossOpInc(YearQuarterData grossOpInc) {
    this.grossOpInc = grossOpInc;
  }

  public void setIncAfterTax(YearQuarterData incAfterTax) {
    this.incAfterTax = incAfterTax;
  }

  public void setIncomeTax(YearQuarterData incomeTax) {
    this.incomeTax = incomeTax;
  }

  public void setIncPrimaryEps(YearQuarterData incPrimaryEps) {
    this.incPrimaryEps = incPrimaryEps;
  }

  public void setIntExp(YearQuarterData intExp) {
    this.intExp = intExp;
  }

  public void setInventory(YearQuarterData inventory) {
    this.inventory = inventory;
  }

  public void setLiabEquity(YearQuarterData liabEquity) {
    this.liabEquity = liabEquity;
  }

  public void setLtDebt(YearQuarterData ltDebt) {
    this.ltDebt = ltDebt;
  }

  public void setLtInvestments(YearQuarterData ltInvestments) {
    this.ltInvestments = ltInvestments;
  }

  public void setNetFixedAssets(YearQuarterData netFixedAssets) {
    this.netFixedAssets = netFixedAssets;
  }

  public void setNetInc(YearQuarterData netInc) {
    this.netInc = netInc;
  }

  public void setNonrecurringItem(YearQuarterData nonrecurringItem) {
    this.nonrecurringItem = nonrecurringItem;
  }

  public void setOtherCurrAssets(YearQuarterData otherCurrAssets) {
    this.otherCurrAssets = otherCurrAssets;
  }

  public void setOtherCurrLiab(YearQuarterData otherCurrLiab) {
    this.otherCurrLiab = otherCurrLiab;
  }

  public void setOtherInc(YearQuarterData otherInc) {
    this.otherInc = otherInc;
  }

  public void setOtherIntExp(YearQuarterData otherIntExp) {
    this.otherIntExp = otherIntExp;
  }

  public void setOtherLtAssets(YearQuarterData otherLtAssets) {
    this.otherLtAssets = otherLtAssets;
  }

  public void setOtherLtLiab(YearQuarterData otherLtLiab) {
    this.otherLtLiab = otherLtLiab;
  }

  public void setPrefStock(YearQuarterData prefStock) {
    this.prefStock = prefStock;
  }

  public void setPretaxInc(YearQuarterData pretaxInc) {
    this.pretaxInc = pretaxInc;
  }

  public void setRd(YearQuarterData rd) {
    this.rd = rd;
  }

  public void setSales(YearQuarterData sales) {
    this.sales = sales;
  }

  public void setShareData(SharesFileData shareData) {
    this.shareData = shareData;
  }

  public void setShares(YearQuarterData shares) {
    this.shares = shares;
  }

  public void setStDebt(YearQuarterData stDebt) {
    this.stDebt = stDebt;
  }

  public void setStInvestments(YearQuarterData stInvestments) {
    this.stInvestments = stInvestments;
  }

  public void setTotalAssets(YearQuarterData totalAssets) {
    this.totalAssets = totalAssets;
  }

  public void setTotalLiab(YearQuarterData totalLiab) {
    this.totalLiab = totalLiab;
  }

  public void setTotOpExp(YearQuarterData totOpExp) {
    this.totOpExp = totOpExp;
  }

  public void setUnusualInc(YearQuarterData unusualInc) {
    this.unusualInc = unusualInc;
  }

  @Override
  public String toString() {
    String ret = "";
    try {
      if (this.companyInfo.getTicker() == null) {
        ret = "";
      }
      else {
        ret = this.companyInfo.report();
        ret += this.shareData.report();
      }
    }
    catch (final Exception e) {
      ret = "";
    }
    return ret;
  }

}
