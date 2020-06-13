package net.ajaskey.market.tools.SIP.BigDB;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;

public class FieldData {

  private CompanyFileData  companyInfo;
  private EstimateFileData estimateData;
  private SharesFileData   shareData;

  private YearQuarterData shares;

  private YearQuarterData cash;
  private YearQuarterData stInvestments;
  private YearQuarterData acctRx;
  private YearQuarterData inventory;
  private YearQuarterData otherCurrAssets;
  private YearQuarterData currAssets;
  private YearQuarterData netFixedAssets;
  private YearQuarterData ltInvestments;
  private YearQuarterData goodwill;
  private YearQuarterData otherLtAssets;
  private YearQuarterData totalAssets;
  private YearQuarterData acctPayable;
  private YearQuarterData stDebt;
  private YearQuarterData otherCurrLiab;
  private YearQuarterData currLiab;
  private YearQuarterData ltDebt;
  private YearQuarterData otherLtLiab;
  private YearQuarterData totalLiab;
  private YearQuarterData prefStock;
  private YearQuarterData equity;
  private YearQuarterData liabEquity;
  private YearQuarterData bvps;

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
  public FieldData() {

    this.companyInfo = new CompanyFileData();
    this.estimateData = new EstimateFileData();
    this.shareData = new SharesFileData();

//    this.shares = new YearQuarterData(sfd.getSharesY(), sfd.getSharesQ());
//
//    this.cash = new YearQuarterData(bfd.getCashYr(), bfd.getCashQtr());
//    this.stInvestments = new YearQuarterData(bfd.getStInvestYr(), bfd.getStInvestQtr());
//    this.acctRx = new YearQuarterData(bfd.getAcctRxYr(), bfd.getAcctRxQtr());
//    this.inventory = new YearQuarterData(bfd.getInventoryYr(), bfd.getInventoryQtr());
//    this.otherCurrAssets = new YearQuarterData(bfd.getOtherCurrAssetsYr(), bfd.getOtherCurrAssetsQtr());
//    this.currAssets = new YearQuarterData(bfd.getCurrAssetsYr(), bfd.getCurrAssetsQtr());
//    this.netFixedAssets = new YearQuarterData(bfd.getNetFixedAssetsYr(), bfd.getNetFixedAssetsQtr());
//    this.ltInvestments = new YearQuarterData(bfd.getLtInvestYr(), bfd.getLtInvestQtr());
//    this.goodwill = new YearQuarterData(bfd.getGoodwillYr(), bfd.getGoodwillQtr());
//    this.otherLtAssets = new YearQuarterData(bfd.getOtherLtAssetsYr(), bfd.getOtherLtAssetsQtr());
//    this.totalAssets = new YearQuarterData(bfd.getTotalAssetsYr(), bfd.getTotalAssetsQtr());
//    this.acctPayable = new YearQuarterData(bfd.getAcctPayableYr(), bfd.getAcctPayableQtr());
//    this.stDebt = new YearQuarterData(bfd.getStDebtYr(), bfd.getStDebtQtr());
//    this.otherCurrLiab = new YearQuarterData(bfd.getOtherCurrLiabYr(), bfd.getOtherCurrLiabQtr());
//    this.currLiab = new YearQuarterData(bfd.getCurrLiabYr(), bfd.getCurrLiabQtr());
//    this.ltDebt = new YearQuarterData(bfd.getLtDebtYr(), bfd.getLtDebtQtr());
//    this.otherLtLiab = new YearQuarterData(bfd.getOtherLtLiabYr(), bfd.getOtherLtLiabQtr());
//    this.totalLiab = new YearQuarterData(bfd.getTotalLiabYr(), bfd.getTotalLiabQtr());
//    this.prefStock = new YearQuarterData(bfd.getPrefStockYr(), bfd.getPrefStockQtr());
//    this.equity = new YearQuarterData(bfd.getEquityYr(), bfd.getEquityQtr());
//    this.liabEquity = new YearQuarterData(bfd.getLiabEquityYr(), bfd.getLiabEquityQtr());
//    this.bvps = new YearQuarterData(bfd.getBvpsYr(), bfd.getBvpsQtr());
//
//    this.sales = new YearQuarterData(ifd.getSalesYr(), ifd.getSalesQtr());
//    this.cogs = new YearQuarterData(ifd.getCogsYr(), ifd.getCogsQtr());
//    this.grossInc = new YearQuarterData(ifd.getGrossIncYr(), ifd.getGrossIncQtr());
//    this.rd = new YearQuarterData(ifd.getRdYr(), ifd.getRdQtr());
//    this.depreciation = new YearQuarterData(ifd.getDepreciationYr(), ifd.getDepreciationQtr());
//    this.intExp = new YearQuarterData(ifd.getIntExpYr(), ifd.getIntExpQtr());
//    this.unusualInc = new YearQuarterData(ifd.getUnusualIncYr(), ifd.getUnusualIncQtr());
//    this.totOpExp = new YearQuarterData(ifd.getTotalOpExpYr(), ifd.getTotalOpExpQtr());
//    this.grossOpInc = new YearQuarterData(ifd.getGrossOpExpYr(), ifd.getGrossOpExpQtr());
//    // this.otherIntExp = new YearQuarterData(ifd.geto, ifd.getSalesQtr());
//    this.otherInc = new YearQuarterData(ifd.getOtherIncYr(), ifd.getOtherIncQtr());
//    this.incAfterTax = new YearQuarterData(ifd.getIncAfterTaxYr(), ifd.getIncAfterTaxQtr());
//    this.adjToInc = new YearQuarterData(ifd.getAdjToIncYr(), ifd.getAdjToIncQtr());
//    this.incPrimaryEps = new YearQuarterData(ifd.getIncPrimaryEpsYr(), ifd.getIncPrimaryEpsQtr());
//    this.nonrecurringItem = new YearQuarterData(ifd.getNonrecurringItemsYr(), ifd.getNonrecurringItemsQtr());
//    this.netInc = new YearQuarterData(ifd.getNetIncYr(), ifd.getNetIncQtr());
//    this.eps = new YearQuarterData(ifd.getEpsYr(), ifd.getEpsQtr());
//    this.epsCont = new YearQuarterData(ifd.getEpsContYr(), ifd.getEpsContQtr());
//    this.epsDil = new YearQuarterData(ifd.getEpsDilYr(), ifd.getEpsDilQtr());
//    this.epsDilCont = new YearQuarterData(ifd.getEpsDilContYr(), ifd.getEpsDilContQtr());
//    this.dividend = new YearQuarterData(ifd.getDividendYr(), ifd.getDividendQtr());
  }

  public String genOutput(int year, int quarter) {
    String ret = String.format("Data for %s from %d Q%d%n", this.companyInfo.getTicker(), year, quarter);
    ret += this.companyInfo.report();
    ret += this.shareData.report();
    // ret += this.estimateData;
    return ret;

  }

  @Override
  public String toString() {
    String ret = this.companyInfo.report();
    return ret;
  }

  public static List<FieldData> readData(int year, int quarter) {

    final String inbasedir = String.format("D:/dev/eclipse-workspace/Market/out/BigDB/");
    final String indir = String.format("%s%s/Q%d/", inbasedir, year, quarter);

    List<FieldData> fdList = new ArrayList<>();

    String[] ext = { "txt" };
    List<File> fList = Utils.getDirTree(indir, ext);
    for (File f : fList) {

      List<String> data = TextUtils.readTextFile(f, true);

      FieldData fd = new FieldData();

      for (final String s : data) {

        String[] tfld = s.split(":");

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
          fd.companyInfo.setWeb(val);
        }
        else if (fld.contains("Data for ")) {
        }
        else {
          // System.out.printf("Unknown tag '%s' in Company File Data%n", fld);
        }
      }
      fdList.add(fd);
    }
    return fdList;
  }

  public SharesFileData getShareData() {
    return shareData;
  }

  public void setShareData(SharesFileData shareData) {
    this.shareData = shareData;
  }

  public YearQuarterData getShares() {
    return shares;
  }

  public void setShares(YearQuarterData shares) {
    this.shares = shares;
  }

  public YearQuarterData getPrefStock() {
    return prefStock;
  }

  public void setPrefStock(YearQuarterData prefStock) {
    this.prefStock = prefStock;
  }

  public void setCompanyInfo(CompanyFileData companyInfo) {
    this.companyInfo = companyInfo;
  }

  public void setEstimateData(EstimateFileData estimateData) {
    this.estimateData = estimateData;
  }

  public void setCash(YearQuarterData cash) {
    this.cash = cash;
  }

  public void setStInvestments(YearQuarterData stInvestments) {
    this.stInvestments = stInvestments;
  }

  public void setAcctRx(YearQuarterData acctRx) {
    this.acctRx = acctRx;
  }

  public void setInventory(YearQuarterData inventory) {
    this.inventory = inventory;
  }

  public void setOtherCurrAssets(YearQuarterData otherCurrAssets) {
    this.otherCurrAssets = otherCurrAssets;
  }

  public void setCurrAssets(YearQuarterData currAssets) {
    this.currAssets = currAssets;
  }

  public void setNetFixedAssets(YearQuarterData netFixedAssets) {
    this.netFixedAssets = netFixedAssets;
  }

  public void setLtInvestments(YearQuarterData ltInvestments) {
    this.ltInvestments = ltInvestments;
  }

  public void setGoodwill(YearQuarterData goodwill) {
    this.goodwill = goodwill;
  }

  public void setOtherLtAssets(YearQuarterData otherLtAssets) {
    this.otherLtAssets = otherLtAssets;
  }

  public void setTotalAssets(YearQuarterData totalAssets) {
    this.totalAssets = totalAssets;
  }

  public void setAcctPayable(YearQuarterData acctPayable) {
    this.acctPayable = acctPayable;
  }

  public void setStDebt(YearQuarterData stDebt) {
    this.stDebt = stDebt;
  }

  public void setOtherCurrLiab(YearQuarterData otherCurrLiab) {
    this.otherCurrLiab = otherCurrLiab;
  }

  public void setCurrLiab(YearQuarterData currLiab) {
    this.currLiab = currLiab;
  }

  public void setLtDebt(YearQuarterData ltDebt) {
    this.ltDebt = ltDebt;
  }

  public void setOtherLtLiab(YearQuarterData otherLtLiab) {
    this.otherLtLiab = otherLtLiab;
  }

  public void setTotalLiab(YearQuarterData totalLiab) {
    this.totalLiab = totalLiab;
  }

  public void setEquity(YearQuarterData equity) {
    this.equity = equity;
  }

  public void setLiabEquity(YearQuarterData liabEquity) {
    this.liabEquity = liabEquity;
  }

  public void setBvps(YearQuarterData bvps) {
    this.bvps = bvps;
  }

  public void setSales(YearQuarterData sales) {
    this.sales = sales;
  }

  public void setCogs(YearQuarterData cogs) {
    this.cogs = cogs;
  }

  public void setGrossInc(YearQuarterData grossInc) {
    this.grossInc = grossInc;
  }

  public void setRd(YearQuarterData rd) {
    this.rd = rd;
  }

  public void setDepreciation(YearQuarterData depreciation) {
    this.depreciation = depreciation;
  }

  public void setIntExp(YearQuarterData intExp) {
    this.intExp = intExp;
  }

  public void setUnusualInc(YearQuarterData unusualInc) {
    this.unusualInc = unusualInc;
  }

  public void setTotOpExp(YearQuarterData totOpExp) {
    this.totOpExp = totOpExp;
  }

  public void setGrossOpInc(YearQuarterData grossOpInc) {
    this.grossOpInc = grossOpInc;
  }

  public void setOtherIntExp(YearQuarterData otherIntExp) {
    this.otherIntExp = otherIntExp;
  }

  public void setOtherInc(YearQuarterData otherInc) {
    this.otherInc = otherInc;
  }

  public void setPretaxInc(YearQuarterData pretaxInc) {
    this.pretaxInc = pretaxInc;
  }

  public void setIncomeTax(YearQuarterData incomeTax) {
    this.incomeTax = incomeTax;
  }

  public void setIncAfterTax(YearQuarterData incAfterTax) {
    this.incAfterTax = incAfterTax;
  }

  public void setAdjToInc(YearQuarterData adjToInc) {
    this.adjToInc = adjToInc;
  }

  public void setIncPrimaryEps(YearQuarterData incPrimaryEps) {
    this.incPrimaryEps = incPrimaryEps;
  }

  public void setNonrecurringItem(YearQuarterData nonrecurringItem) {
    this.nonrecurringItem = nonrecurringItem;
  }

  public void setNetInc(YearQuarterData netInc) {
    this.netInc = netInc;
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

  public void setDividend(YearQuarterData dividend) {
    this.dividend = dividend;
  }

  public CompanyFileData getCompanyInfo() {
    return companyInfo;
  }

  public EstimateFileData getEstimateData() {
    return estimateData;
  }

  public YearQuarterData getCash() {
    return cash;
  }

  public YearQuarterData getStInvestments() {
    return stInvestments;
  }

  public YearQuarterData getAcctRx() {
    return acctRx;
  }

  public YearQuarterData getInventory() {
    return inventory;
  }

  public YearQuarterData getOtherCurrAssets() {
    return otherCurrAssets;
  }

  public YearQuarterData getCurrAssets() {
    return currAssets;
  }

  public YearQuarterData getNetFixedAssets() {
    return netFixedAssets;
  }

  public YearQuarterData getLtInvestments() {
    return ltInvestments;
  }

  public YearQuarterData getGoodwill() {
    return goodwill;
  }

  public YearQuarterData getOtherLtAssets() {
    return otherLtAssets;
  }

  public YearQuarterData getTotalAssets() {
    return totalAssets;
  }

  public YearQuarterData getAcctPayable() {
    return acctPayable;
  }

  public YearQuarterData getStDebt() {
    return stDebt;
  }

  public YearQuarterData getOtherCurrLiab() {
    return otherCurrLiab;
  }

  public YearQuarterData getCurrLiab() {
    return currLiab;
  }

  public YearQuarterData getLtDebt() {
    return ltDebt;
  }

  public YearQuarterData getOtherLtLiab() {
    return otherLtLiab;
  }

  public YearQuarterData getTotalLiab() {
    return totalLiab;
  }

  public YearQuarterData getPrefLiab() {
    return prefStock;
  }

  public YearQuarterData getEquity() {
    return equity;
  }

  public YearQuarterData getLiabEquity() {
    return liabEquity;
  }

  public YearQuarterData getBvps() {
    return bvps;
  }

  public YearQuarterData getSales() {
    return sales;
  }

  public YearQuarterData getCogs() {
    return cogs;
  }

  public YearQuarterData getGrossInc() {
    return grossInc;
  }

  public YearQuarterData getRd() {
    return rd;
  }

  public YearQuarterData getDepreciation() {
    return depreciation;
  }

  public YearQuarterData getIntExp() {
    return intExp;
  }

  public YearQuarterData getUnusualInc() {
    return unusualInc;
  }

  public YearQuarterData getTotOpExp() {
    return totOpExp;
  }

  public YearQuarterData getGrossOpInc() {
    return grossOpInc;
  }

  public YearQuarterData getOtherIntExp() {
    return otherIntExp;
  }

  public YearQuarterData getOtherInc() {
    return otherInc;
  }

  public YearQuarterData getPretaxInc() {
    return pretaxInc;
  }

  public YearQuarterData getIncomeTax() {
    return incomeTax;
  }

  public YearQuarterData getIncAfterTax() {
    return incAfterTax;
  }

  public YearQuarterData getAdjToInc() {
    return adjToInc;
  }

  public YearQuarterData getIncPrimaryEps() {
    return incPrimaryEps;
  }

  public YearQuarterData getNonrecurringItem() {
    return nonrecurringItem;
  }

  public YearQuarterData getNetInc() {
    return netInc;
  }

  public YearQuarterData getEps() {
    return eps;
  }

  public YearQuarterData getEpsCont() {
    return epsCont;
  }

  public YearQuarterData getEpsDil() {
    return epsDil;
  }

  public YearQuarterData getEpsDilCont() {
    return epsDilCont;
  }

  public YearQuarterData getDividend() {
    return dividend;
  }

}
