package net.ajaskey.market.tools.SIP.BigDB.derived;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum;
import net.ajaskey.market.tools.SIP.BigDB.reports.Reports;

public class IndexEarnings {

  /**
   *
   * @param args
   */
  public static void main(String[] args) {

    final IndexEarnings ie = new IndexEarnings(2020, 2);
    final double earnings = ie.process(SnpEnum.SP500);

    System.out.println(ie);
    System.out.println(earnings);

  }

  int               count;
  double            totalMarketCap;
  double            totalNetEarnings;
  double            totalShares;
  private final int quarter;
  private final int year;

  /**
   *
   * @param yr
   * @param qtr
   */
  public IndexEarnings(int yr, int qtr) {
    this.year = yr;
    this.quarter = qtr;
    this.totalNetEarnings = 0.0;
    this.totalShares = 0.0;
    this.totalMarketCap = 0.0;
    this.count = 0;
  }

  /**
   *
   * @param index
   * @return
   */
  public double process(SnpEnum index) {

    final List<FieldData> fdList = new ArrayList<>();

    FieldData.readDbData(this.year, this.quarter, false);
    final String s = Reports.getSnpIndex(this.year, this.quarter, index, true);
    final List<String> sList = Reports.outputToList(s);
    for (final String ticker : sList) {
      final FieldData fd = FieldData.readDbData(this.year, this.quarter, ticker);
      this.addToTotals(fd);
      fdList.add(fd);
    }

    double ret = 0.0;

    for (final FieldData fd : fdList) {
      ret += this.calcEarnings(fd);
    }

    return ret;

  }

  @Override
  public String toString() {
    final String ret = String.format("%.4f\t%.4f\t%.2f\t%d", this.totalNetEarnings, this.totalMarketCap, this.totalShares, this.count);
    return ret;
  }

  /**
   *
   * @param fd
   */
  private void addToTotals(FieldData fd) {

    this.count++;

    double val = calcNetEarnings(fd);
    this.totalNetEarnings += val;

    double[] d = fd.getShares().getSharesQ();
    val = d[1];
    this.totalShares += val;

    final double dd = fd.getShares().getMktCap();
    val = dd;
    this.totalMarketCap += val;

  }

  /**
   * 
   * @param fd
   * @return
   */
  public static double calcNetEarnings(FieldData fd) {

    double net = fd.getIncSheetData().getNetIncQtr()[0] + fd.getIncSheetData().getNetIncQtr()[1] + fd.getIncSheetData().getNetIncQtr()[2]
        + fd.getIncSheetData().getNetIncQtr()[3];

    // double net = fd.getIncSheetData().getNetIncYr()[0];
    return net;
  }

  /**
   *
   * @param fd
   * @return
   */
  private double calcEarnings(FieldData fd) {

    final double mc = fd.getShares().getMktCap();
    final double shr = fd.getShares().getSharesQ()[1];
    final double net = calcNetEarnings(fd);

    final double capRatio = mc / this.totalMarketCap;
    final double shrRatio = shr / this.totalShares;
    final double portion = net * capRatio * shrRatio;

    return portion;
  }

}
