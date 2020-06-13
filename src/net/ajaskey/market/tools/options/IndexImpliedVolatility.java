package net.ajaskey.market.tools.options;

import net.ajaskey.common.DateTime;
import net.ajaskey.market.optuma.TickerPriceData;

public class IndexImpliedVolatility {

  public static void main(String[] args) {

    final TickerPriceData spxData = new TickerPriceData("WI", "SPX");
    final double spxClose = spxData.getLatest();

    final double spx30dma = spxData.getMA(30);

    System.out.println(spxClose);
    System.out.println(spx30dma);

    final OptionsProcessor spxOp = new OptionsProcessor(OptionsProcessor.APUT, "SPX", spx30dma, spxClose, new DateTime(2019, DateTime.DECEMBER, 10),
        10.0);

    final double price = spxOp.getPrice();
    System.out.println(price);

    final double newIv = spxOp.findIv(price, 0.5);
    System.out.println(newIv);

  }

}
