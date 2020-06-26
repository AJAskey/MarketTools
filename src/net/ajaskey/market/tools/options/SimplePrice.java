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
