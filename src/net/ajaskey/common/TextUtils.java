package net.ajaskey.common;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
      e.printStackTrace();
      return ret;
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
}
