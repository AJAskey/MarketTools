package net.ajaskey.market.tools.options.workbench;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TestOption {

  public static void main(String[] args) throws FileNotFoundException {

    final List<String> codes = new ArrayList<>();
//    codes.add("SPY");
//    codes.add("OEF");
//    codes.add("QQQ");
//    codes.add("IWM");
//    codes.add("XLB");
//    codes.add("XLE");
//    codes.add("XLK");
//    codes.add("XLU");
//    codes.add("XHB");
//    codes.add("VNQ");
//    codes.add("XRT");
//    codes.add("GLD");

    codes.add("GSPC.indx");

    // codes.add("OEX.indx");

    try (PrintWriter pw = new PrintWriter("out/eod.txt")) {
      for (final String c : codes) {

        final Option opt = new Option();

        opt.processJson(c);

        // String fname = opt.writeBasefile();
        // pw.println(fname);

//        OptionStatistics os = new OptionStatistics(opt);
//        pw.println(os);

      }
    }
  }
}
