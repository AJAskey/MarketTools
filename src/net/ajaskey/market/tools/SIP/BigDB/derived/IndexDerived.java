package net.ajaskey.market.tools.SIP.BigDB.derived;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import net.ajaskey.common.TextUtils;
import net.ajaskey.common.Utils;
import net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum;
import net.ajaskey.market.tools.SIP.BigDB.MarketTools;
import net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData;

public class IndexDerived {

  public static void main(String[] args) {
    List<String> tickers = new ArrayList<>();
    tickers.add("msft");
    tickers.add("GE");
    IndexDerived id = new IndexDerived(" msft", tickers, 2020, 2);
    System.out.println(id.valid);
    System.out.println(id.indexList.size());
    for (String s : id.indexList) {
      System.out.println(s);
    }
  }

  /**
   *
   * @param fullFileName
   * @return
   */
  public void readList(String fullFileName) {
    try {
      final List<String> inList = TextUtils.readTextFile(fullFileName, true);
      for (String s : inList) {
        this.checkAndAdd(s);
      }
    }
    catch (final Exception e) {
      System.out.println(FieldData.getWarning(e));
    }
  }

  /**
   * 
   * @param s
   */
  private void checkAndAdd(String s) {
    if (isStringValid(s)) {
      if (!isInList(s)) {
        this.indexList.add(s.trim().toUpperCase());
      }
    }
  }

  /**
   * 
   * @param s
   * @return
   */
  private static boolean isStringValid(String s) {
    if (s != null) {
      if (s.length() > 0) {
        return true;
      }
    }
    return false;
  }

  List<String>             indexList;
  List<CompanyDerivedData> idList;
  String                   listName;
  boolean                  valid;

  /**
   * Constructor
   * 
   * @param name   Index name
   * @param inList List of ticker making up index
   */
  public IndexDerived(String name, List<String> inList, int yr, int qtr) {
    this.indexList = new ArrayList<String>();
    this.valid = build(name, inList);
    if (this.valid) {
      FieldData.setQMemory(yr, qtr, FiletypeEnum.BIG_BINARY);
      CompanyDerivedData cdd = new CompanyDerivedData(yr, qtr);
      for (String ticker : indexList) {
        FieldData fd = MarketTools.getFromMemory(ticker, yr, qtr);
        if (fd.isDataValid()) {
          CompanyDerived cd = new CompanyDerived(yr, qtr, fd);
          if (cd.isValid()) {
            cdd.dList.add(cd);
          }
        }
      }
      this.idList.add(cdd);
    }
  }

  /**
   * Constructor
   * 
   * @param name Index name
   */
  public IndexDerived(String name, int yr, int qtr) {
    this.indexList = new ArrayList<String>();
    this.valid = build(name, null);
  }

  /**
   * Constructor - hidden
   */
  @SuppressWarnings("unused")
  private IndexDerived() {
  }

  /**
   * Used by constructors
   * 
   * @param n    Name of index
   * @param list List of tickers to add to index
   * @return TRUE if all is well, FALSE otherwise
   */
  private boolean build(String n, List<String> list) {

    try {
      if (n == null) {
        System.out.println("Warning. IndexDerived Constructor with NULL name.");
        return false;
      }
      if (n.length() < 1) {
        System.out.println("Warning. IndexDerived Constructor with zero length name.");
        return false;
      }

      this.listName = n;
      if (list != null) {
        for (final String s : list) {
          this.checkAndAdd(s);
        }
      }
    }
    catch (final Exception e) {
      System.out.println(FieldData.getConstructorError(e));
      return false;
    }

    return true;
  }

  /**
   * 
   * @param addList List of tickers to add
   */
  public void addToList(List<String> addList) {
    try {
      for (final String s : addList) {
        this.checkAndAdd(s);
      }
    }
    catch (final Exception e) {
      System.out.println(FieldData.getWarning(e));
    }
  }

  /**
   * 
   * @param s String to check against existing List
   * @return
   */
  public boolean isInList(String s) {
    try {
      if (s != null) {
        if (s.length() > 0) {
          for (final String t : this.indexList) {
            if (s.trim().toUpperCase().equals(t)) {
              return true;
            }
          }
        }
      }
    }
    catch (final Exception e) {
      System.out.println(FieldData.getWarning(e));
    }
    return false;
  }

  /**
   * 
   * @param path
   */
  public void writeList(String path) {
    final String fname = String.format("%s/IndexList-%s.txt", path, this.listName);
    Utils.makeDirs(path);
    try (PrintWriter pw = new PrintWriter(fname)) {
      for (final String s : this.indexList) {
        pw.println(s);
      }
    }
    catch (final Exception e) {
      System.out.println(FieldData.getWarning(e));
    }
  }

}
