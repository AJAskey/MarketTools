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

package net.ajaskey.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class Utils {

  public static DecimalFormatSymbols   decimalFormatSymbols = new DecimalFormatSymbols();
  public static DecimalFormat          df;
  public static String                 NL                   = System.lineSeparator();
  public final static SimpleDateFormat sdf                  = new SimpleDateFormat("dd-MMM-yyyy");
  public final static SimpleDateFormat sdfFull              = new SimpleDateFormat("E dd-MMM-yyyy HH:mm:ss");
  public static String                 TAB                  = "\t";

  private static DecimalFormat dfmt = new DecimalFormat("#,###");

  /**
   *
   * @param map
   * @param key
   * @return
   */
  public static String findName(final Map<String, Integer> map, final Integer key) {

    for (final Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() == key) {
        return entry.getKey();
      }
    }
    return "NotFound";
  }

  /**
   *
   * @param d
   * @param len
   * @return
   */
  public static String fmt(final double d, final int len) {
    String ret = "";
    try {
      if (Utils.df == null) {
        Utils.df = new DecimalFormat("#,###,##0.00", Utils.decimalFormatSymbols);
      }
      final String sfmt = String.format("%%%ds", len);
      ret = String.format(sfmt, Utils.df.format(d));
    }
    catch (final Exception e) {
      ret = "Invalid fmt";
    }
    return ret;
  }

  /**
   *
   * @param top
   * @param ext
   * @return
   */
  public static List<File> getDirTree(final String top, final String[] ext) {

    final File d = new File(top);
    if (d.exists()) {
      final List<File> retFiles = (List<File>) FileUtils.listFiles(d, ext, true);
      return retFiles;
    }
    return null;

  }

  /**
   *
   * @param f
   * @return File name without extension
   */
  public static String getFileBaseName(File f) {
    String ret = "";
    if (f.exists()) {
      final String ext = FilenameUtils.getExtension(f.getName());
      ret = f.getName().replace("." + ext, "");
    }
    return ret;
  }

  /**
   *
   * @param f
   * @return File extension
   */
  public static String getFileExt(File f) {
    String ret = "";
    if (f.exists()) {
      ret = FilenameUtils.getExtension(f.getName());
    }
    return ret;
  }

  /**
   *
   * @param url
   * @return
   */
  public static String getFromUrl(final String url) {

    final StringBuilder sb = new StringBuilder();

    URL myURL;
    try {
      myURL = new URL(url);

      final URLConnection myURLConnection = myURL.openConnection();
      myURLConnection.connect();
      String line;
      try (BufferedReader resp = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()))) {
        while ((line = resp.readLine()) != null) {
          if (line.length() > 0) {
            sb.append(line + Utils.NL);
          }
        }
      }
    }
    catch (final IOException e) {
      return "";
    }
    return sb.toString();
  }

  /**
   *
   * @param i
   * @param len
   * @return
   */
  public static String ifmt(final int i, final int len) {

    return Utils.lfmt(i, len);
  }

  /**
   *
   * @param i
   * @param len
   * @return
   */
  public static String lfmt(final long i, final int len) {

    final String s = Utils.dfmt.format(i);
    final String sfmt = String.format("%%%ds", len);
    return String.format(sfmt, s);
  }

  /**
   *
   * @param dir
   */
  static public void makeDir(final String dir) {

    final File theDir = new File(dir);
    if (!theDir.exists()) {
      theDir.mkdir();
    }
  }

  /**
   *
   * @param dt1
   * @param dt2
   * @return
   */
  public static boolean sameDate(final DateTime dt1, final DateTime dt2) {

    if (dt1 == null || dt2 == null) {
      return false;
    }
    if (dt1.getYear() == dt2.getYear()) {
      if (dt1.getMonth() == dt2.getMonth()) {
        if (dt1.getDay() == dt2.getDay()) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   *
   * @param dt1
   * @param dt2
   * @return
   */
  public static boolean sameMonth(final DateTime dt1, final DateTime dt2) {

    if (dt1 == null || dt2 == null) {
      return false;
    }
    if (dt1.getYear() == dt2.getYear()) {
      if (dt1.getMonth() == dt2.getMonth()) {
        return true;
      }
    }
    return false;
  }

  /**
   *
   * @param milliseconds
   */
  public static void sleep(final int milliseconds) {

    if (milliseconds < 1) {
      return;
    }

    try {
      Thread.sleep(milliseconds);
    }
    catch (final InterruptedException e) {
    }

  }

  /**
   *
   * @param path
   * @param zipStream
   * @throws FileNotFoundException
   * @throws IOException
   */
  public static void writeToZipFile(final String path, final ZipOutputStream zipStream) throws FileNotFoundException, IOException {

    final File file = new File(path);
    try (final FileInputStream fis = new FileInputStream(file)) {
      final ZipEntry zipEntry = new ZipEntry(path);
      zipStream.putNextEntry(zipEntry);

      final byte[] bytes = new byte[1024];
      int length;
      while ((length = fis.read(bytes)) >= 0) {
        zipStream.write(bytes, 0, length);
      }

      zipStream.closeEntry();
    }
  }
}
