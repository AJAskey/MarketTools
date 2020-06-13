package net.ajaskey.market.misc;

import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * This class...
 *
 * @author ajask_000
 *         <p>
 *         PTV-Parser Copyright (c) 2015, Andy Askey. All rights reserved.
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
public class Debug {

  // private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd
  // HH:mm:ss.SSS");

  private static final Logger LOGGER = Logger.getLogger("FredDataDownloader");

  public static final Level INFO    = Level.INFO;
  public static final Level WARNING = Level.WARNING;
  public static final Level SEVERE  = Level.SEVERE;

  private static boolean isInit = false;

  /**
   *
   * net.ajaskey.market.tools.fred.init
   *
   * @param logfileName
   */
  public static void init(final String logfileName) {

    if (Debug.isInit) {
      return;
    }

    Handler fileHandler = null;
    Formatter simpleFormatter = null;

    try {

      LogManager.getLogManager().reset();

      fileHandler = new FileHandler(logfileName);
      Debug.LOGGER.addHandler(fileHandler);

      simpleFormatter = new SimpleFormatter();
      fileHandler.setFormatter(simpleFormatter);

      fileHandler.setLevel(Level.INFO);

      Debug.isInit = true;

    }
    catch (final Exception e) {
      e.printStackTrace();
    }
  }

  /**
   *
   * net.ajaskey.market.tools.fred.log
   *
   * @param s
   */
  public static void log(final Level l, final String s) {

    Debug.LOGGER.log(l, s);
  }

  public static void log(final String s) {

    Debug.LOGGER.info(s);
  }
}
