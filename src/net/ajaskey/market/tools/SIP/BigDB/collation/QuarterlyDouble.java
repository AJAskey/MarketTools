package net.ajaskey.market.tools.SIP.BigDB.collation;

import net.ajaskey.common.Utils;

public class QuarterlyDouble {

  public double[] dArr = null;

  public QuarterlyDouble(double[] inArr) {
    if (inArr == null) {
      this.dArr = new double[10];
      for (double d : this.dArr) {
        d = 0.0;
      }
    }
    else {
      this.dArr = inArr;
    }
  }

  /**
   * Hidden Constructor
   */
  @SuppressWarnings("unused")
  private QuarterlyDouble() {
  }

  public double getMostRecent() {
    return this.dArr[1];
  }

  public double get(int i) {
    double ret = 0.0;
    try {
      ret = this.dArr[i];
    }
    catch (Exception e) {
      ret = -9999.9999;
    }
    return ret;
  }

  /**
   * 
   * @return
   */
  public double getQoQ() {

    double ret = 0.0;
    if (this.dArr[5] != 0.0) {
      ret = (this.dArr[1] - this.dArr[5]) / Math.abs(this.dArr[5]) * 100.0;
    }
    return ret;
  }

  /**
   * 
   * @return
   */
  public double getQseqQ() {

    double ret = 0.0;
    if (this.dArr[2] != 0.0) {
      ret = (this.dArr[1] - this.dArr[2]) / Math.abs(this.dArr[2]) * 100.0;
    }
    return ret;
  }

  /**
   * 
   * @return
   */
  public double getTtm() {

    double ret = 0.0;
    try {
      ret = this.dArr[1] + this.dArr[2] + this.dArr[3] + this.dArr[4];
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    return ret;
  }

  public double getTtmAvg() {
    double d = getTtm();
    return d / 4.0;
  }

  /**
   * 
   * @param desc
   * @return
   */
  public String fmtGrowth1Q(final String desc) {

    final String ret = String.format("\t%-18s: %s M (Seq= %s%% : QoQ= %s%%)", desc, Utils.fmt(this.dArr[1], 13), Utils.fmt(this.getQseqQ(), 7),
        Utils.fmt(this.getQoQ(), 7));

    return ret;
  }

  /**
   * 
   * @param desc
   * @return
   */
  public String fmtGrowth4Q(final String desc) {

    final String ret = String.format("\t%-18s: %s M (Seq= %s%% : QoQ= %s%%)", desc, Utils.fmt(this.getTtm(), 13), Utils.fmt(this.getQseqQ(), 7),
        Utils.fmt(this.getQoQ(), 7));

    return ret;
  }

  public double deltaQ(int q1, int q2) {

    double ret = 0.0;
    if (q1 >= q2) {
      return ret;
    }
    if ((q1 > 3) || (q2 < 2)) {
      return ret;
    }

    return this.dArr[q2] - this.dArr[q1];

  }

}
