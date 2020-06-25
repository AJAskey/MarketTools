package net.ajaskey.market.tools.SIP.BigDB.collation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData;

public class FieldDataBinary implements Serializable {

  public static final long serialVersionUID = 2600255321596652398L;

  private static List<FieldDataBinary> bigList = new ArrayList<>();

  /**
   *
   * @param cfd
   * @param efd
   * @param sfd
   * @param ifd
   * @param bfd
   * @param cashfd
   * @param yr
   * @param qtr
   */
  public static void add(CompanyFileData cfd, EstimateFileData efd, SharesFileData sfd, IncSheetFileData ifd, BalSheetFileData bfd,
      CashFileData cashfd, int yr, int qtr) {

    new FieldDataBinary(cfd, efd, sfd, ifd, bfd, cashfd, yr, qtr);
  }

  /**
   *
   * @param fname
   * @return
   */
  public static List<FieldData> readBinaryFile(String fname) {

    final List<FieldData> fdList = new ArrayList<>();

    FieldDataBinaryFile fdbf = null;
    try {

      final File f = new File(fname);

      if (f.exists()) {
        final ObjectInputStream objBinFile = new ObjectInputStream(new FileInputStream(fname));

        fdbf = (FieldDataBinaryFile) objBinFile.readObject();
        objBinFile.close();
      }
    }
    catch (final Exception e) {
      fdbf = null;
      e.printStackTrace();
    }

    if (fdbf != null) {
      for (final FieldDataBinary f : fdbf.bigList) {
        final FieldData fd = new FieldData(f.companyInfo, f.estimateData, f.shareData, f.incSheetData, f.balSheetData, f.cashData, f.year, f.quarter);
        fdList.add(fd);
      }
    }

    return fdList;
  }

  /**
   *
   * @param year
   * @param quarter
   */
  public static void writeBinaryFile(int year, int quarter) {

    final FieldDataBinaryFile fdbf = new FieldDataBinaryFile(year, quarter, FieldDataBinary.bigList);

    try {
      final String fname = String.format("%s%s/all-companies-%dQ%d.bin", FieldData.outbasedir, year, year, quarter);
      final ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fname));
      o.writeObject(fdbf);
      o.close();
    }
    catch (final IOException e) {
      e.printStackTrace();
    }
  }

  public BalSheetFileData balSheetData;
  public CashFileData     cashData;
  public CompanyFileData  companyInfo;
  public EstimateFileData estimateData;
  public ExchEnum         exchange;
  public IncSheetFileData incSheetData;
  public String           industry;
  public String           name;
  public int              quarter;
  public String           sector;
  public SharesFileData   shareData;
  public String           ticker;
  public boolean          valid;
  public int              year;

  /**
   *
   * @param cfd
   * @param efd
   * @param sfd
   * @param ifd
   * @param bfd
   * @param cashfd
   * @param yr
   * @param qtr
   */
  private FieldDataBinary(CompanyFileData cfd, EstimateFileData efd, SharesFileData sfd, IncSheetFileData ifd, BalSheetFileData bfd,
      CashFileData cashfd, int yr, int qtr) {

    if (cfd == null || efd == null || sfd == null || ifd == null || bfd == null) {
      this.companyInfo = new CompanyFileData();
      this.valid = false;
    }
    else if (cfd.getTicker().trim().length() < 1) {
      this.companyInfo = new CompanyFileData();
      this.valid = false;
    }
    else {
      this.year = yr;
      this.quarter = qtr;
      this.balSheetData = new BalSheetFileData(bfd);
      this.cashData = new CashFileData(cashfd);
      this.companyInfo = new CompanyFileData(cfd);
      this.estimateData = new EstimateFileData(efd);
      this.exchange = cfd.getExchange();
      this.incSheetData = new IncSheetFileData(ifd);
      this.industry = cfd.getIndustry();
      this.name = cfd.getName();
      this.sector = cfd.getSector();
      this.shareData = new SharesFileData(sfd);
      this.valid = true;
    }

    if (this.valid) {
      FieldDataBinary.bigList.add(this);
    }

    // System.out.println(balSheetData);
    // System.out.println(balSheetData);

  }

  public List<FieldDataBinary> getBigList() {
    return FieldDataBinary.bigList;
  }

}
