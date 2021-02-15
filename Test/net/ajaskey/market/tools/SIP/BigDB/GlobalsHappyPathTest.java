package net.ajaskey.market.tools.SIP.BigDB;

import org.junit.jupiter.api.Test;

class GlobalsHappyPathTest {

  @Test
  void testCheckList() {

    boolean sipb = MarketTools.parseSipData(2020, 2, FiletypeEnum.BIG_BINARY, false);
    org.junit.Assert.assertTrue(sipb);

    sipb = MarketTools.parseSipData(2019, 1, FiletypeEnum.BIG_BINARY, false);
    org.junit.Assert.assertTrue(sipb);

    boolean b = Globals.checkLists(2020, 2);
    org.junit.Assert.assertFalse(b);

    sipb = MarketTools.parseSipData(2020, 2, FiletypeEnum.BIG_BINARY, false);
    org.junit.Assert.assertTrue(sipb);

    MarketTools.setQMemory(2020, 2, FiletypeEnum.BIG_BINARY);

    MarketTools.setQMemory(2020, 2, FiletypeEnum.BIG_BINARY);

    MarketTools.setQMemory(2020, 2, FiletypeEnum.BIG_BINARY);

    b = Globals.checkLists(2020, 2);
    org.junit.Assert.assertTrue(b);

    b = Globals.checkLists(2018, 4);
    org.junit.Assert.assertFalse(b);

    MarketTools.setQMemory(2019, 1, FiletypeEnum.BIG_BINARY);

    b = Globals.checkLists(2019, 1);
    org.junit.Assert.assertTrue(b);

    b = Globals.checkLists(2020, 2);
    org.junit.Assert.assertTrue(b);

    b = Globals.checkLists(2020, 4);
    org.junit.Assert.assertFalse(b);

  }

}
