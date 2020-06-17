package net.ajaskey.market.tools.SIP.BigDB;

public class IndividualCompanyData {

  private final int    year;
  private final String ticker;
  private FieldData    q1;
  private FieldData    q2;
  private FieldData    q3;
  private FieldData    q4;

  public IndividualCompanyData(String t, FieldDataYear fdy) {

    this.q1 = null;
    this.q2 = null;
    this.q3 = null;
    this.q4 = null;

    this.year = fdy.getYear();
    this.ticker = t;
    if (fdy.quarterDataAvailable(1)) {
      for (final FieldData fd : fdy.getQuarterData(1).fieldDataList) {
        if (fd.getTicker().equalsIgnoreCase(t)) {
          this.q1 = fd;
          break;
        }
      }
    }
    if (fdy.quarterDataAvailable(2)) {
      for (final FieldData fd : fdy.getQuarterData(2).fieldDataList) {
        if (fd.getTicker().equalsIgnoreCase(t)) {
          this.q2 = fd;
          break;
        }
      }
    }
    if (fdy.quarterDataAvailable(3)) {
      for (final FieldData fd : fdy.getQuarterData(3).fieldDataList) {
        if (fd.getTicker().equalsIgnoreCase(t)) {
          this.q3 = fd;
          break;
        }
      }
    }
    if (fdy.quarterDataAvailable(4)) {
      for (final FieldData fd : fdy.getQuarterData(4).fieldDataList) {
        if (fd.getTicker().equalsIgnoreCase(t)) {
          this.q4 = fd;
          break;
        }
      }
    }

  }

  public FieldData getQ1() {
    return this.q1;
  }

  public FieldData getQ2() {
    return this.q2;
  }

  public FieldData getQ3() {
    return this.q3;
  }

  public FieldData getQ4() {
    return this.q4;
  }

  public String getTicker() {
    return this.ticker;
  }

  public int getYear() {
    return this.year;
  }

}
