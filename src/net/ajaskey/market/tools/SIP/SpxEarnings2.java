package net.ajaskey.market.tools.SIP;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.ajaskey.common.DateTime;
import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;

public class SpxEarnings2 {

  public String   ticker;
  public String   name;
  public String   exchange;
  public String   sector;
  public String   industry;
  public DateTime currentFiscalYear;
  public DateTime lastQtrEps;

  public Double[] mktCap = new Double[SpxEarnings2.QoD];

  public Double[] incEps = new Double[SpxEarnings2.QoD];
  public Double[] shares = new Double[SpxEarnings2.QoD];
  public double   est1;

  public double   estNet1;
  private boolean valid;

  /**
   *
   * @param s
   */
  public SpxEarnings2(String s) {

    final String ss = s.replace("\"", "");
    final String fld[] = ss.split("\t");

    this.ticker = fld[0].trim();
    this.name = fld[1].trim();
    this.exchange = fld[2].trim();
    this.sector = fld[3].trim();
    this.industry = fld[4].trim();

    this.currentFiscalYear = new DateTime(fld[5].trim(), SpxEarnings2.sdf);
    this.lastQtrEps = new DateTime(fld[6].trim(), SpxEarnings2.sdf);

    this.mktCap[1] = SipUtils.parseDouble(fld[7].trim());
    this.mktCap[2] = SipUtils.parseDouble(fld[8].trim());
    this.mktCap[3] = SipUtils.parseDouble(fld[9].trim());
    this.mktCap[4] = SipUtils.parseDouble(fld[10].trim());
    this.mktCap[5] = SipUtils.parseDouble(fld[11].trim());
    this.mktCap[6] = SipUtils.parseDouble(fld[12].trim());
    this.mktCap[7] = SipUtils.parseDouble(fld[13].trim());

    this.incEps[1] = SipUtils.parseDouble(fld[14].trim());
    this.incEps[2] = SipUtils.parseDouble(fld[15].trim());
    this.incEps[3] = SipUtils.parseDouble(fld[16].trim());
    this.incEps[4] = SipUtils.parseDouble(fld[17].trim());
    this.incEps[5] = SipUtils.parseDouble(fld[18].trim());
    this.incEps[6] = SipUtils.parseDouble(fld[19].trim());
    this.incEps[7] = SipUtils.parseDouble(fld[20].trim());

    this.shares[1] = SipUtils.parseDouble(fld[21].trim());
    this.shares[2] = SipUtils.parseDouble(fld[22].trim());
    this.shares[3] = SipUtils.parseDouble(fld[23].trim());
    this.shares[4] = SipUtils.parseDouble(fld[24].trim());
    this.shares[5] = SipUtils.parseDouble(fld[25].trim());
    this.shares[6] = SipUtils.parseDouble(fld[26].trim());
    this.shares[7] = SipUtils.parseDouble(fld[27].trim());

    this.est1 = SipUtils.parseDouble(fld[28].trim());

    this.shares[0] = this.shares[1];
    this.mktCap[0] = this.mktCap[1];
    this.incEps[0] = this.est1 * this.shares[0];

    this.currentFiscalYear.setSdf(SpxEarnings2.sdfout);
    this.lastQtrEps.setSdf(SpxEarnings2.sdfout);

    this.valid = true;

    try {

    } catch (final Exception e) {
      e.printStackTrace();
      this.valid = false;
    }
  }

  @Override
  public String toString() {
    String ret = String.format("%s : %s : %s : %s : %s\t", this.ticker, this.name, this.exchange, this.sector,
        this.industry);
    ret += String.format("  %s : %s%n", this.currentFiscalYear, this.lastQtrEps);
    ret += String.format("  %12.2f%12.2f%12.2f%12.2f%12.2f%12.2f%12.2f%n", this.mktCap[1], this.mktCap[2],
        this.mktCap[3], this.mktCap[4], this.mktCap[5], this.mktCap[6], this.mktCap[7]);
    ret += String.format("  %12.2f%12.2f%12.2f%12.2f%12.2f%12.2f%12.2f\t[%.2f -- %.2f]%n", this.incEps[1],
        this.incEps[2], this.incEps[3], this.incEps[4], this.incEps[5], this.incEps[6], this.incEps[7], this.est1,
        this.estNet1);
    ret += String.format("  %12.2f%12.2f%12.2f%12.2f%12.2f%12.2f%12.2f", this.shares[1], this.shares[2], this.shares[3],
        this.shares[4], this.shares[5], this.shares[6], this.shares[7]);
    return ret;
  }

  final private static int QoD = 8;

  private static List<SpxEarnings2> spxList = new ArrayList<>();

  private static Double totalShares[] = new Double[8];
  private static Double totalMCap[]   = new Double[8];

  private static SimpleDateFormat sdf    = new SimpleDateFormat("MM/dd/yyyy");
  private static SimpleDateFormat sdfout = new SimpleDateFormat("yyyy-MMM-dd");

  /**
   *
   * @param args
   * @throws FileNotFoundException
   */
  public static void main(String[] args) throws FileNotFoundException {

    final List<String> input = TextUtils.readTextFile("data/SPX-Earnings.txt", true);

    for (final String s : input) {
      final SpxEarnings2 data = new SpxEarnings2(s);
      if (data.valid) {
        SpxEarnings2.spxList.add(data);
      }
    }

    List<String> allSectors = findSectors(spxList);
    List<String> allIndustries = findIndustries(spxList);

    String dir = "out/earnings";
    Utils.makeDir(dir);
    DateTime today = new DateTime();
    today.setSdf(new SimpleDateFormat("yyyyMMdd"));
    String fname = String.format("%s/SPX_%s_Historic_Earnings.txt", dir, today);
    process(spxList, fname);

    for (String sec : allSectors) {
      List<SpxEarnings2> seList = findSectors(spxList, sec);
      process(seList, String.format("%s/%s_%s_Historic-Earnings.txt", dir, sec, today));
    }

  }

  /**
   * 
   * @param seList
   * @throws FileNotFoundException
   */
  private static void process(List<SpxEarnings2> seList, String filename) throws FileNotFoundException {

    System.out.println(filename);

    Double[] te = new Double[QoD];

    SpxEarnings2.calcTotals(spxList);

    for (int i = 0; i < SpxEarnings2.QoD; i++) {
      te[i] = SpxEarnings2.calcEarnings(i, seList);
    }
    try (PrintWriter pw = new PrintWriter(filename)) {
      pw.println(filename);
      for (int i = 0; i < te.length; i++) {

        double chg = 0.0;
        if (i < (te.length - 1)) {
          double delta = te[i] - te[i + 1];
          chg = delta / te[i + 1] * 100.0;
          pw.printf("  Year %d : %12.2f%10.1f%%%n", i, te[i], chg);

        } else {
          pw.printf("  Year %d : %12.2f%n", i, te[i]);
        }
      }
    }
  }

  private static void calcTotals(List<SpxEarnings2> seList) {

    for (int i = 0; i < QoD; i++) {
      totalShares[i] = 0.0;
      totalMCap[i] = 0.0;
    }
    for (final SpxEarnings2 se : seList) {
      SpxEarnings2.totalShares[1] += se.shares[1];
      SpxEarnings2.totalShares[2] += se.shares[2];
      SpxEarnings2.totalShares[3] += se.shares[3];
      SpxEarnings2.totalShares[4] += se.shares[4];
      SpxEarnings2.totalShares[5] += se.shares[5];
      SpxEarnings2.totalShares[6] += se.shares[6];
      SpxEarnings2.totalShares[7] += se.shares[7];
      SpxEarnings2.totalShares[0] += se.shares[1];

      SpxEarnings2.totalMCap[1] += se.mktCap[1];
      SpxEarnings2.totalMCap[2] += se.mktCap[2];
      SpxEarnings2.totalMCap[3] += se.mktCap[3];
      SpxEarnings2.totalMCap[4] += se.mktCap[4];
      SpxEarnings2.totalMCap[5] += se.mktCap[5];
      SpxEarnings2.totalMCap[6] += se.mktCap[6];
      SpxEarnings2.totalMCap[7] += se.mktCap[7];
      SpxEarnings2.totalMCap[0] += se.mktCap[1];
    }

    for (int i = 0; i < QoD; i++) {
      System.out.printf("%15.2f", totalShares[i]);
    }
    System.out.println();
    for (int i = 0; i < QoD; i++) {
      System.out.printf("%15.2f", totalMCap[i]);
    }
    System.out.println();
  }

  /**
   *
   * @param i
   * @return
   */
  private static double calcEarnings(int i, List<SpxEarnings2> seList) {
    double totearn = 0.0;
    for (final SpxEarnings2 se : seList) {
      final double earn = SpxEarnings2.calcEarnings(se, i);
      totearn += earn;
    }
    return totearn;
  }

  /**
   *
   * @param se
   * @param i
   * @return
   */
  private static double calcEarnings(SpxEarnings2 se, int i) {
    final double capRatio = se.mktCap[i] / SpxEarnings2.totalMCap[i];
    final double shrRatio = se.shares[i] / SpxEarnings2.totalShares[i];
    final double ret = se.incEps[i] * capRatio * shrRatio;
    return ret;
  }

  /**
   *
   * @param seList
   * @return
   */
  private static List<String> findIndustries(List<SpxEarnings2> seList) {
    final Set<String> ind = new HashSet<>();
    for (final SpxEarnings2 cd : seList) {
      final String i = cd.industry.toUpperCase().trim();
      ind.add(i);
    }

    final List<String> ret = new ArrayList<>(ind);
    return ret;
  }

  /**
   *
   * @param seList
   * @param industry
   * @return
   */
  private static List<SpxEarnings2> findIndustries(List<SpxEarnings2> seList, String industry) {
    final List<SpxEarnings2> retList = new ArrayList<>();

    for (final SpxEarnings2 se : seList) {
      if (se.industry.equalsIgnoreCase(industry)) {
        retList.add(se);
      }
    }

    return retList;
  }

  /**
   *
   * @param cdList
   * @return
   */
  private static List<String> findSectors(List<SpxEarnings2> seList) {
    final Set<String> sec = new HashSet<>();
    for (final SpxEarnings2 se : seList) {
      final String s = se.sector.toUpperCase().trim();
      sec.add(s);
    }

    final List<String> ret = new ArrayList<>(sec);
    return ret;
  }

  /**
   *
   * @param seList
   * @param sector
   * @return
   */
  private static List<SpxEarnings2> findSectors(List<SpxEarnings2> seList, String sector) {
    final List<SpxEarnings2> retList = new ArrayList<>();

    for (final SpxEarnings2 se : seList) {
      if (se.sector.equalsIgnoreCase(sector)) {
        retList.add(se);
      }
    }

    return retList;
  }

}
