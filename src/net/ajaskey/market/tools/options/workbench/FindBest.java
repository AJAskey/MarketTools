package net.ajaskey.market.tools.options.workbench;

import java.io.IOException;

public class FindBest {

  public static void main(String[] args) throws IOException {

    OptionUtils.getDownloads();

    final Option opt = new Option();

    new OptionCboe("SPY", opt);

    opt.filter(0.10, 3.00, 100, 1000, 10.0, 90.0);

    opt.writeBasefile("out/SPY-base.txt");

  }

}
