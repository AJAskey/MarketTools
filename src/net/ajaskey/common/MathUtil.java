package net.ajaskey.common;

public class MathUtil {

  public static void main(String[] args) {
    double d = 2.94;
    double rd = MathUtil.Mround(d, 0.05);
    System.out.printf("%.2f\t%.2f%n", d, rd);

    d = 2.99;
    rd = MathUtil.Mround(d, 0.05);
    System.out.printf("%.2f\t%.2f%n", d, rd);

    d = 3.10;
    rd = MathUtil.Mround(d, 0.05);
    System.out.printf("%.2f\t%.2f%n", d, rd);

    d = 3.11;
    rd = MathUtil.Mround(d, 0.05);
    System.out.printf("%.2f\t%.2f%n", d, rd);

    d = 3.12;
    rd = MathUtil.Mround(d, 0.05);
    System.out.printf("%.2f\t%.2f%n", d, rd);

    d = 3.13;
    rd = MathUtil.Mround(d, 0.05);
    System.out.printf("%.2f\t%.2f%n", d, rd);

    d = 3.14;
    rd = MathUtil.Mround(d, 0.05);
    System.out.printf("%.2f\t%.2f%n", d, rd);

    d = 3.15;
    rd = MathUtil.Mround(d, 0.05);
    System.out.printf("%.2f\t%.2f%n", d, rd);

    d = 3.16;
    rd = MathUtil.Mround(d, 0.05);
    System.out.printf("%.2f\t%.2f%n", d, rd);

    d = 3.17;
    rd = MathUtil.Mround(d, 0.05);
    System.out.printf("%.2f\t%.2f%n", d, rd);

    d = 3.18;
    rd = MathUtil.Mround(d, 0.05);
    System.out.printf("%.2f\t%.2f%n", d, rd);

    d = 3.19;
    rd = MathUtil.Mround(d, 0.05);
    System.out.printf("%.2f\t%.2f%n", d, rd);

    d = 3.20;
    rd = MathUtil.Mround(d, 0.05);
    System.out.printf("%.2f\t%.2f%n", d, rd);

  }

  /**
   *
   * @param val   Value to round
   * @param scale Value for rounding (0.05 == a nickel)
   * @return
   */
  public static double Mround(double val, double scale) {

    return Math.floor(val / scale + 0.5) * scale;

  }

}
