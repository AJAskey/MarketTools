
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

/**
 *
 * This class contains static utility methods used by this project.
 *
 * @author Andy Askey
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
public class Utils {

  public static DecimalFormatSymbols   decimalFormatSymbols = new DecimalFormatSymbols();
  public static DecimalFormat          df;
  public static String                 NL                   = System.lineSeparator();
  public final static SimpleDateFormat sdf                  = new SimpleDateFormat("dd-MMM-yyyy");

  public final static SimpleDateFormat sdfFull = new SimpleDateFormat("E dd-MMM-yyyy HH:mm:ss");

  public static String TAB = "\t";

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
//
//	/**
//	 *
//	 * net.ajaskey.market.ta.sameYear
//	 *
//	 * @param cal1
//	 * @param cal2
//	 * @return
//	 */
//	public static boolean sameYear(final Calendar cal1, final Calendar cal2) {
//
//		if (cal1 == null || cal2 == null) {
//			return false;
//		}
//		if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)) {
//			return true;
//		}
//		return false;
//	}
//
//	/**
//	 * net.ajaskey.market.misc.sleep
//	 *
//	 * @param i
//	 */

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
