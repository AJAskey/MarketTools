package net.ajaskey.market.tools.SIP.BigDB.dataio;

public class FieldDataYear {

  private boolean inUse;

  private FieldDataQuarter q1;
  private FieldDataQuarter q2;
  private FieldDataQuarter q3;
  private FieldDataQuarter q4;

  private final int year;

  public FieldDataYear(int yr) {
    this.inUse = false;
    this.year = yr;
    this.q1 = null;
    this.q2 = null;
    this.q3 = null;
    this.q4 = null;
  }

  public FieldDataQuarter getQ1() {
    return this.q1;
  }

  public FieldDataQuarter getQ2() {
    return this.q2;
  }

  public FieldDataQuarter getQ3() {
    return this.q3;
  }

  public FieldDataQuarter getQ4() {
    return this.q4;
  }

  public FieldDataQuarter getQuarterData(int qtr) {

    FieldDataQuarter ret = null;

    if (this.inUse) {

      if (qtr == 1) {
        ret = this.q1;
      }
      else if (qtr == 2) {
        ret = this.q2;
      }
      else if (qtr == 3) {
        ret = this.q3;
      }
      else if (qtr == 4) {
        ret = this.q4;
      }
    }
    return ret;
  }

  public int getYear() {
    return this.year;
  }

  public boolean isInUse() {
    return this.inUse;
  }

  public boolean quarterDataAvailable(int qtr) {

    if (this.inUse) {
      if (qtr == 1) {
        return this.q1 != null;
      }
      else if (qtr == 2) {
        return this.q2 != null;
      }
      else if (qtr == 3) {
        return this.q3 != null;
      }
      else if (qtr == 4) {
        return this.q4 != null;
      }
    }
    return false;
  }

  public void set(int qtr, FieldDataQuarter fdq) {
    this.inUse = true;
    if (qtr == 1) {
      this.q1 = fdq;
    }
    else if (qtr == 2) {
      this.q2 = fdq;
    }
    else if (qtr == 3) {
      this.q3 = fdq;
    }
    else if (qtr == 4) {
      this.q4 = fdq;
    }
  }
}
