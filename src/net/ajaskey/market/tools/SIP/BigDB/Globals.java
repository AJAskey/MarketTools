/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * Original author : Andy Askey (ajaskey34@gmail.com)
 */
package net.ajaskey.market.tools.SIP.BigDB;

import java.util.ArrayList;
import java.util.List;

import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear;

public class Globals {

  public static List<FieldDataYear> allDataList = new ArrayList<>();

  final public static int endYear   = 2020;
  final public static int startYear = 2015;

  /**
   * Returns the requested year from global memory.
   *
   * @param yr year
   * @return FieldDataYear if available.
   */
  public static FieldDataYear getYear(int yr) {

    if (yr >= Globals.startYear && yr <= Globals.endYear) {
      for (final FieldDataYear fdy : Globals.allDataList) {
        if (fdy.isInUse()) {
          if (fdy.getYear() == yr) {
            return fdy;
          }
        }
      }
    }
    return null;
  }

  /**
   * Sets internal memory (allDataList) to request year and quarter.
   *
   * @param yr     year
   * @param qtr    quarter
   * @param fdList The FieldData list for all companies in the requested year and
   *               quarter.
   */
  public static void setLists(int yr, int qtr, List<FieldData> fdList) {

    if (fdList == null) {
      System.out.printf("Warning. SetLists(): NULL fdList for %dQ%d%n", yr, qtr);
      return;
    }
    if (yr < Globals.startYear || yr > Globals.endYear) {
      System.out.printf("Warning. SetLists(): Invalid year %d%n", yr);
      return;
    }

    /**
     * Perform the first time through.
     */
    if (Globals.allDataList.size() == 0) {
      Globals.init(Globals.startYear, Globals.endYear);
    }

    final FieldDataQuarter fdq = new FieldDataQuarter(yr, qtr, fdList);
    for (final FieldDataYear fdy : Globals.allDataList) {
      if (fdy.getYear() == yr) {
        fdy.set(qtr, fdq);
        return;
      }
    }
    System.out.printf("Warning -- SetLists : Data not found. Year=%d Quarter=%d%n", yr, qtr);
  }

  /**
   * Private data structure initializer
   *
   * @param first
   * @param last
   */
  private static void init(int first, int last) {
    for (int i = first; i <= last; i++) {
      Globals.allDataList.add(new FieldDataYear(i));
    }
  }
}
