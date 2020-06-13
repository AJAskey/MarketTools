package net.ajaskey.market.tools.options;

import java.io.IOException;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.common.PropertyData;

public class PriceOption {

  public static void main(String[] args) {

    try {
      AddCboeDataFiles.main(null);
    }
    catch (final IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    final PropertyData oprop = new PropertyData("option-vix.properties");

    final String code = oprop.getPropertyS("price.code");
    final String type = oprop.getPropertyS("price.type");
    final Double ulBuy = oprop.getPropertyD("price.ulBuy");
    final Double ulSell = oprop.getPropertyD("price.ulSell");
    final Integer holdDays = oprop.getPropertyI("price.hold");
    final Integer minOi = oprop.getPropertyI("price.minoi");
    final Double minOptPrice = oprop.getPropertyD("price.minoptprice");
    Double ivScaler = 1.0;
    final double tmp = oprop.getPropertyD("price.ivscaler");
    if (!PropertyData.isErr(tmp)) {
      ivScaler = tmp;
    }

    int activeType = OptionsProcessor.ACALL;
    // String strType = "CALL";
    if (type.toUpperCase().contains("PUT")) {
      activeType = OptionsProcessor.APUT;
      // strType = "PUT";
    }

    final DateTime buyDate = new DateTime();
    buyDate.add(DateTime.DATE, 1);

    final DateTime sellDate = new DateTime(buyDate);
    sellDate.add(DateTime.DATE, holdDays);

    final DateTime firstExpiry = new DateTime(sellDate);
    firstExpiry.add(DateTime.DATE, 1);

    final String fname = String.format("data/options/%s-options.dat", code);
    final List<CboeOptionData> dil = CallPutList.readCboeData(fname, firstExpiry, buyDate, minOi);

    for (final CboeOptionData cod : dil) {
      CboeCallPutData option = null;
      if (activeType == OptionsProcessor.ACALL) {
        option = cod.call;
      }
      else {
        option = cod.put;
      }
      final String id = option.id;
      final OptionsProcessor op = new OptionsProcessor(option.optionData);
      op.setUlPrice(ulBuy);
      op.setSellDate(buyDate);
      final double newIv = op.getIv() * ivScaler;
      op.setIv(newIv);
      final double price = op.getPrice();
      if (price >= minOptPrice) {
        op.setUlPrice(ulSell);
        op.setSellDate(sellDate);
        final double sellprice = op.getPrice();
        final double profit = (sellprice - price) / price * 100.0;
        if (sellprice > price && profit > 249.9) {
          System.out.printf("%s\t%s\t%.2f\t%.2f\t%s\t%.2f\t%.1f%%\t--\t%.4f\t--\t%.2f  %.2f%n", op.getExpiry(), id, op.getStrike(), price, sellDate,
              sellprice, profit, op.getIv(), ulBuy, ulSell);
        }
      }
    }

  }

}
