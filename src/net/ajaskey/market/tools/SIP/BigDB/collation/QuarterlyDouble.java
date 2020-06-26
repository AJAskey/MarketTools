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
package net.ajaskey.market.tools.SIP.BigDB.collation;

import net.ajaskey.common.Utils;

public class QuarterlyDouble {

  public double[] dArr = null;

  public QuarterlyDouble(double[] inArr) {
    if (inArr == null) {
      this.dArr = new double[10];
      for (double d : this.dArr) {
        d = 0.0;
      }
    }
    else {
      this.dArr = inArr;
    }
  }

  /**
   * Hidden Constructor
   */
  @SuppressWarnings("unused")
  private QuarterlyDouble() {
  }

  public double deltaQ(int q1, int q2) {

    final double ret = 0.0;
    if (q1 >= q2) {
      return ret;
    }
    if (q1 > 3 || q2 < 2) {
      return ret;
    }

    return this.dArr[q2] - this.dArr[q1];

  }

  /**
   *
   * @param desc
   * @return
   */
  public String fmtGrowth1Q(final String desc) {

    final String ret = String.format("\t%-18s: %s M (Seq= %s%% : QoQ= %s%%)", desc, Utils.fmt(this.dArr[1], 13), Utils.fmt(this.getQseqQ(), 7),
        Utils.fmt(this.getQoQ(), 7));

    return ret;
  }

  /**
   *
   * @param desc
   * @return
   */
  public String fmtGrowth4Q(final String desc) {

    final String ret = String.format("\t%-18s: %s M (Seq= %s%% : QoQ= %s%%)", desc, Utils.fmt(this.getTtm(), 13), Utils.fmt(this.getQseqQ(), 7),
        Utils.fmt(this.getQoQ(), 7));

    return ret;
  }

  public double get(int i) {
    double ret = 0.0;
    try {
      ret = this.dArr[i];
    }
    catch (final Exception e) {
      ret = -9999.9999;
    }
    return ret;
  }

  public double getMostRecent() {
    return this.dArr[1];
  }

  /**
   *
   * @return
   */
  public double getQoQ() {

    double ret = 0.0;
    if (this.dArr[5] != 0.0) {
      ret = (this.dArr[1] - this.dArr[5]) / Math.abs(this.dArr[5]) * 100.0;
    }
    return ret;
  }

  /**
   *
   * @return
   */
  public double getQseqQ() {

    double ret = 0.0;
    if (this.dArr[2] != 0.0) {
      ret = (this.dArr[1] - this.dArr[2]) / Math.abs(this.dArr[2]) * 100.0;
    }
    return ret;
  }

  /**
   *
   * @return
   */
  public double getTtm() {

    double ret = 0.0;
    try {
      if (this.dArr.length > 3) {
        ret = this.dArr[1] + this.dArr[2] + this.dArr[3] + this.dArr[4];
      }
    }
    catch (final Exception e) {
      ret = 0.0;
    }
    return ret;
  }

  public double getTtmAvg() {
    double d = 0.0;
    try {
      d = this.getTtm();
    }
    catch (final Exception e) {
    }
    return d / 4.0;
  }

}
