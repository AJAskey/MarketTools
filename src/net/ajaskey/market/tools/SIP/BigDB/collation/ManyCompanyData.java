package net.ajaskey.market.tools.SIP.BigDB.collation;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains procedures for returning multiple sets of company data
 * from the DB.
 *
 * @author Andy Askey
 *         <p>
 *         Copyright (c) 2020, Andy Askey. All rights reserved.
 *         </p>
 *         <p>
 *         Permission is hereby granted, free of charge, to any person obtaining
 *         a copy of this software and associated documentation files (the
 *         "Software"), to deal in the Software without restriction, including
 *         without limitation the rights to use, copy, modify, merge, publish,
 *         distribute, sublicense, and/or sell copies of the Software, and to
 *         permit persons to whom the Software is furnished to do so, subject to
 *         the following conditions:
 *
 *         The above copyright notice and this permission notice shall be
 *         included in all copies or substantial portions of the Software.
 *         </p>
 *
 *         <p>
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *         EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *         MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *         NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 *         BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 *         ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 *         CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *         SOFTWARE.
 *         </p>
 *
 */
public class ManyCompanyData {

  /**
   * Create of list of company data from input list of tickers
   * 
   * @param tickers
   * @return List of ManyCompanyData
   */
  public static List<ManyCompanyData> createList(List<String> tickers) {

    List<ManyCompanyData> retList = new ArrayList<>();

    for (String ticker : tickers) {

      ManyCompanyData mcd = new ManyCompanyData(OneCompanyData.getCompany(ticker), ticker);
      retList.add(mcd);
    }

    return retList;
  }

  public List<OneCompanyData> ocdList = new ArrayList<>();
  public String               ticker;

  /**
   * Constructor is private for use by internal procedures.
   * 
   * @param list
   * @param ticker
   */
  private ManyCompanyData(List<OneCompanyData> list, String ticker) {
    this.ticker = ticker;
    this.ocdList = list;
  }

  @Override
  public String toString() {
    String ret = String.format("%s : %d%n", this.ticker, this.ocdList.size());
    return ret;
  }
}
