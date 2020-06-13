package net.ajaskey.market.tools.options;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.DateTime;

public class ProcessDil {

  final static int MinOI = 50;

  public static void main(String[] args) {
    try {
      AddCboeDataFiles.main(null);
    } catch (IOException e) {
    }

    final DateTime buyDate = new DateTime();
    buyDate.add(DateTime.DATE, 1);

    final DateTime firstExpiry = new DateTime(buyDate);
    firstExpiry.add(DateTime.DATE, 10);

    String code = "qqq";
    String type = "CALL";

    int activeType = OptionsProcessor.ACALL;
    if (type.toUpperCase().contains("PUT")) {
      activeType = OptionsProcessor.APUT;
    }

    final String fname = String.format("data/options/%s-options.dat", code);
    final List<CboeOptionData> dil = CallPutList.readCboeData(fname, firstExpiry, buyDate, MinOI);

    double highStrike = 0.0;
    double lowStrike = 0.0;
    if (activeType == OptionsProcessor.ACALL) {
      highStrike = CallPutList.getcPrice() * 1.121;
      lowStrike = CallPutList.getcPrice() * 0.90;
      System.out.printf("%.2f\t%.2f\t%.2f%n", lowStrike, CallPutList.getcPrice(), highStrike);
    } else {
      highStrike = CallPutList.getcPrice() * 1.021;
      lowStrike = CallPutList.getcPrice() * 0.899;
      System.out.printf("%.2f\t%.2f%n", highStrike, lowStrike);
    }

    final List<CboeCallPutData> options = new ArrayList<>();
    for (CboeOptionData cod : dil) {

      if ((cod.strike < highStrike) && (cod.strike > lowStrike)) {

        if ((cod.call.vol > 0) && (cod.call.oi >= MinOI)) {
          if (cod.call.mark > 0.099) {
            if (activeType == OptionsProcessor.ACALL) {
              options.add(cod.call);
            } else {
              options.add(cod.put);
            }
          }
        }
      }
    }

    double processStrike = CallPutList.getcPrice() * 0.99;
    System.out.printf("processStrike %.2f%n", processStrike);
    for (CboeCallPutData opt : options) {

      if (opt.getStrike() > processStrike) {

        System.out.printf("Calling findProfitableCallStrikes for %.1f%n", opt.getStrike());

        List<String> strikes = findProfitableCallStrikes(opt, options, CallPutList.getcPrice());

        if (strikes.size() > 0) {
          System.out.println(opt);
          System.out.printf("%s,%.1f, %.1f%n", opt.id, opt.optionData.getStrike(), opt.mark);
          for (String s : strikes) {
            System.out.println(s);
          }
          System.out.println("");
        }
      }
    }
  }

  /**
   * 
   * @param opt
   * @param calls
   * @param cPrice
   * @return
   */
  private static List<String> findProfitableCallStrikes(CboeCallPutData opt, List<CboeCallPutData> calls,
      double cPrice) {

    List<String> ret = new ArrayList<>();
    List<CboeCallPutData> tmpList = new ArrayList<>();

    for (CboeCallPutData call : calls) {

      if (opt.optionData.getExpiry().isEqual(call.optionData.getExpiry())) {
        if (opt.optionData.getStrike() != call.optionData.getStrike()) {
          if (call.oi >= MinOI) {

            System.out.printf("Adding %.1f to tmpList%n", call.strike);
            tmpList.add(call);

          }
        }
      }
    }

    for (CboeCallPutData call : tmpList) {

      double profit = findOffsetStrike(tmpList, call, -10.0);

      ret.add(String.format("\t%.1f, %.2f, %.4f, %d, %d, %.1f%%", call.getStrike(), call.mark, call.iv, call.vol,
          call.oi, profit));

    }

    return ret;
  }

  /**
   * 
   * @param optList
   * @param option
   * @param offset
   * @return
   */
  private static double findOffsetStrike(List<CboeCallPutData> optList, CboeCallPutData option, double offset) {

    double profit = 0.0;
    double oStrike = option.strike + offset;
    CboeCallPutData lastOpt = null;
    CboeCallPutData activeOpt = null;

    System.out.printf("findOffsetStrike : Strike %.1f\t Offset %.2f\t%.2f%n", option.strike, offset, option.getPrice());

    int pos = (int) Math.abs(offset);
    for (int i = pos; i < optList.size(); i++) {
      if (optList.get(i).getStrike() == oStrike) {
        activeOpt = optList.get(i);
        System.out.printf("  Found == Strike %.1f%n", activeOpt.strike);
        break;
      } else if (optList.get(i).getStrike() > oStrike) {
        activeOpt = optList.get(i);
        System.out.printf("  Found == Strike %.1f%n", activeOpt.strike);
        break;
      }
      lastOpt = optList.get(i);
    }

    if (activeOpt != null) {
      if (activeOpt.getPrice() > 0.0) {
        profit = (option.getPrice() - activeOpt.getPrice()) / activeOpt.getPrice() * 100.0;
        System.out.printf("%.1f%%\t%.2f\t%.2f%n", profit, option.getPrice(), activeOpt.getPrice());
      }
    } else {
      System.out.println("Found no offset strike.");
    }

    return profit;
  }

}
