package net.ajaskey.market.tools.options.workbench;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.DateTime;
import net.ajaskey.common.Utils;

public class RecentData {

  static List<File> codeList = new ArrayList<>();

  /**
   *
   * @param code
   * @return
   */
  public static String getMostRecent(String code) {

    final String ext[] = { "csv" };
    final List<File> files = Utils.getDirTree("D:\\dev\\Eclipse-03-2002\\workspace\\OptionsWorkbench\\data\\options", ext);
    for (final File f : files) {
      if (f.getName().startsWith(code)) {
        RecentData.codeList.add(f);
        System.out.println(f.getName());
      }
    }

    File recentF = null;
    DateTime recentD = new DateTime(1990, DateTime.JANUARY, 1);
    for (final File f : RecentData.codeList) {
      final String name = f.getName();
      final String dStr = name.replace(code, "").replace("_optiondata.csv", "").replace("_", "");
      System.out.println(dStr);
      final DateTime dt = new DateTime(dStr, "yyyyMMddHHmmss");
      if (dt.isGreaterThan(recentD)) {
        recentD = dt;
        recentF = f;
      }
    }
    String ret = "";
    if (recentF != null) {
      ret = recentF.getAbsolutePath();
    }
    return ret;
  }

  public static void main(String[] args) {

    final String code = "XLK";

    final String fname = RecentData.getMostRecent(code);
    System.out.println(fname);

  }

}
