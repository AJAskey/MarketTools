package net.ajaskey.market.tools.options;

import java.util.List;

import net.ajaskey.common.DateTime;

public class FindSkew {

  public static void main(String[] args) {

    if (args.length < 1) {
      System.out.println("Command line format : Code --->  SPY");
      return;
    }

    final String code = args[0].trim();

    final String fname = String.format("data/options/%s-options.dat", code);

    final DateTime firstExpiry = new DateTime();
    firstExpiry.add(DateTime.DATE, 15);
    System.out.println(firstExpiry);

    final List<CboeOptionData> dil = CallPutList.readCboeData(fname, firstExpiry, new DateTime(), 0);

    final double dilCPrice = CallPutList.getcPrice();

    final double chg = 25.0;

    final int callPrice = (int) (dilCPrice + chg);
    final int putPrice = (int) (dilCPrice - chg);

    final DateTime expiry = new DateTime();
    expiry.add(DateTime.DATE, 30);
    System.out.println("Expiry : " + expiry);

    final CboeOptionData callCod = CboeOptionData.findStrike(dil, callPrice, expiry);
    System.out.println(callPrice);
    System.out.println(callCod);

    final CboeOptionData putCod = CboeOptionData.findStrike(dil, putPrice, callCod.expiry);
    System.out.println(putPrice);
    System.out.println(putCod);

    final double skew = putCod.put.iv / callCod.call.iv;
    System.out.println(skew);
    System.out.println(chg);
  }

}
