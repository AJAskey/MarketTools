package net.ajaskey.market.tools.SIP.BigDB;

public class FieldDataYear {

  private int year;

  private FieldDataQuarter q1;
  private FieldDataQuarter q2;
  private FieldDataQuarter q3;
  private FieldDataQuarter q4;

  private boolean inUse;

  public void set(int qtr, FieldDataQuarter fdq) {
    inUse = true;
    if (qtr == 1) {
      q1 = fdq;
    }
    else if (qtr == 2) {
      q2 = fdq;
    }
    else if (qtr == 3) {
      q3 = fdq;
    }
    else if (qtr == 4) {
      q4 = fdq;
    }
  }

  public int getYear() {
    return year;
  }

  public FieldDataQuarter getQ1() {
    return q1;
  }

  public FieldDataQuarter getQ2() {
    return q2;
  }

  public FieldDataQuarter getQ3() {
    return q3;
  }

  public FieldDataQuarter getQ4() {
    return q4;
  }

  public FieldDataYear(int yr) {
    inUse = false;
    this.year = yr;
    this.q1 = null;
    this.q2 = null;
    this.q3 = null;
    this.q4 = null;
  }

  public boolean isInUse() {
    return inUse;
  }
}
