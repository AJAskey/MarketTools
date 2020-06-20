package net.ajaskey.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.FileUtils;

public class TextUtils {

  /**
   *
   * @param args
   */
  public static void main(String[] args) {
    final List<String> data = TextUtils.readTextFile("data/test.txt", true);

    for (final String s : data) {
      System.out.println(s);
    }

  }

  public static void print(List<String> list) {
    System.out.println(TextUtils.toString(list));
  }

  public static void printline(String s) {
    System.out.println(s);
  }

  /**
   *
   * @param file
   * @param ignoreBlanks
   * @return
   */
  public static List<String> readTextFile(File file, boolean ignoreBlanks) {

    List<String> lines = null;
    final List<String> ret = new ArrayList<>();

    try {
      lines = FileUtils.readLines(file, "UTF-8");
    }
    catch (final IOException e) {
      return null;
    }

    if (ignoreBlanks) {
      for (final String s : lines) {
        if (s.trim().length() > 0) {
          ret.add(s.trim());
        }
      }
    }
    else {
      return lines;
    }
    return ret;
  }

  /**
   *
   * @param fname
   * @param ignoreBlanks
   * @return
   */
  public static List<String> readTextFile(String fname, boolean ignoreBlanks) {
    final File f = new File(fname);
    return TextUtils.readTextFile(f, ignoreBlanks);
  }

  public static String toString(List<String> data) {
    String ret = "";
    for (final String s : data) {
      ret += s + Utils.NL;
    }
    return ret;
  }

  /**
   * 
   * @param fname
   * @return
   */
  public static List<String> readGzipFile(String fname) {

    List<String> retList = new ArrayList<>();
    File file = new File(fname);

    try (GZIPInputStream gzip = new GZIPInputStream(new FileInputStream(file));
        BufferedReader br = new BufferedReader(new InputStreamReader(gzip));) {

      String line = null;
      while ((line = br.readLine()) != null) {
        retList.add(line);
      }
    }
    catch (Exception e) {
      retList = null;
    }
    return retList;
  }
}
