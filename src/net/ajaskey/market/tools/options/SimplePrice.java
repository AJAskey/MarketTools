package net.ajaskey.market.tools.options;

import net.ajaskey.common.DateTime;

public class SimplePrice {

  public static void main(String[] args) {

    final double ul = 290.0;
    final double strike = 300.0;
    final double iv = .2500;
    final DateTime expiry = new DateTime(2020, DateTime.MARCH, 15);

    /**
     *
     * @param type
     * @param id
     * @param strike
     * @param ulPrice
     * @param expiry
     * @param iv
     */
    final OptionsProcessor op = new OptionsProcessor(OptionsProcessor.APUT, "SPY", strike, ul, expiry, iv);

    System.out.println(op);

  }

}
