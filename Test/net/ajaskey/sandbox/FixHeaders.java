package net.ajaskey.sandbox;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;

public class FixHeaders {

  static List<String> header = null;

  /**
   * 
   * @param args
   * @throws FileNotFoundException
   */
  public static void main(String[] args) throws FileNotFoundException {

    header = readHeader();

    final String[] ext = { "java" };
    // final List<File> fList = Utils.getDirTree("D:/dev/MarketTools -
    // dev/src/net/ajaskey/market/tools/SIP", ext);
    final List<File> fList = Utils.getDir("D:/dev/MarketTools - dev/src/net/ajaskey/market/tools/quandl", ext);
    for (final File f : fList) {

      System.out.println(f.getAbsolutePath());

      if (!f.getName().equals("MarketToolsLicense.java")) {

        List<String> code = processFile(f);

        String outfname = String.format("%s", f.getAbsoluteFile());
        try (PrintWriter pw = new PrintWriter(outfname)) {
          for (String s : code) {
            pw.println(s);
          }
        }
      }
    }
  }

  /**
   * 
   * @param f
   * @return
   * @throws FileNotFoundException
   */
  static List<String> processFile(File f) throws FileNotFoundException {

    List<String> codeOriginal = TextUtils.readTextFile(f, false);

    String outfname = String.format("%s.old", f.getAbsoluteFile());
    try (PrintWriter pw = new PrintWriter(outfname)) {
      for (String s : codeOriginal) {
        pw.println(s);
      }
    }

    List<String> codeMod1 = new ArrayList<>();
    List<String> codeMod2 = new ArrayList<>();

    int startComment = getStartComment(codeOriginal);
    int commentConfirm = checkComment(codeOriginal, startComment + 1);
    int endComment = -1;

    boolean found = false;
    if (commentConfirm > startComment) {

      endComment = getEndComment(codeOriginal, commentConfirm + 1);

      if (endComment > commentConfirm) {

        found = true;
        for (int i = 0; i < codeOriginal.size(); i++) {
          if (i < startComment || i > endComment) {
            codeMod1.add(codeOriginal.get(i));
          }
        }
      }
    }

    if (!found) {
      codeMod1 = codeOriginal;
    }

    for (String s : header) {
      if (s.trim().length() > 0) {
        codeMod2.add(s);
      }
    }
//
    for (String s : codeMod1) {
      codeMod2.add(s);
    }

    return codeMod2;
  }

  static int getStartComment(List<String> co) {
    int ret = -1;
    for (int i = 0; i < co.size(); i++) {
      String s = co.get(i);
      if (s.startsWith("/**")) {
        ret = i;
        break;
      }
    }
    return ret;
  }

  static int checkComment(List<String> co, int start) {
    int ret = -1;
    for (int i = start; i < co.size(); i++) {
      String s = co.get(i);
      if (s.startsWith(" * This class")) {
        ret = i;
        break;
      }
    }
    return ret;
  }

  static int getEndComment(List<String> co, int start) {
    int ret = -1;
    for (int i = start; i < co.size(); i++) {
      String s = co.get(i);
      if (s.startsWith(" */")) {
        ret = i;
        break;
      }
    }
    return ret;
  }

  /**
   * 
   * @return
   */
  static List<String> readHeader() {

    String fname = "D:/dev/MarketTools - dev/src/net/ajaskey/common/MarketToolsLicense.java";

    List<String> header = TextUtils.readTextFile(fname, false);

    for (int i = 0; i < header.size(); i++) {
      if (header.get(i).equals("package net.ajaskey.common;")) {
        header.remove(i);
      }
    }

//    for (String s : header) {
//      System.out.println(s);
//    }

    return header;
  }

}
