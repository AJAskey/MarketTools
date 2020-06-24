package net.ajaskey.market.tools.SIP.BigDB.collation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData;

public class FieldDataBinary implements Serializable {

  public static final long serialVersionUID = 2600255321596652398L;

  public int             year;
  public int             quarter;
  public List<FieldData> fdList = null;

  public BalSheetFileData balSheetData;
  public CompanyFileData  companyInfo;
  public EstimateFileData estimateData;
  public ExchEnum         exchange;
  public IncSheetFileData incSheetData;
  public String           industry;
  public String           name;
  public String           sector;
  public SharesFileData   shareData;
  public String           ticker;

  public boolean valid;

  public FieldDataBinary(CompanyFileData cfd, EstimateFileData efd, SharesFileData sfd, IncSheetFileData ifd, BalSheetFileData bfd, int yr, int qtr) {

    // balSheetData = new setBalSheetFileData(bfd);

  }

  /**
   * Constructor
   * 
   * @param yr
   * @param qtr
   */
  public FieldDataBinary(int yr, int qtr) {
    this.year = yr;
    this.quarter = qtr;
    fdList = new ArrayList<>();
  }

  /**
   * 
   */
  public void clearList() {
    fdList.clear();
  }

}
