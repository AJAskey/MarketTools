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
package net.ajaskey.market.tools.quandl;

public class ShillerData {

  public double ShillerEarnings;
  public double ShillerPE;
  public double Sp500BVPS;
  public double Sp500Dividends;
  public double Sp500Sales;

  /**
   * This method serves as a constructor for the class.
   *
   */
  public ShillerData() {

    this.ShillerEarnings = 116.19;
    this.ShillerPE = 31.00;
    this.Sp500Dividends = 59.68;
    this.Sp500BVPS = 885.59;
    this.Sp500Sales = 1408.74;
  }

}
