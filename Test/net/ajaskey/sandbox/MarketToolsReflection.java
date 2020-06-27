package net.ajaskey.sandbox;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MarketToolsReflection {

  String scope;
  String type;
  String qname;
  String name;

  static List<MarketToolsReflection> dList = new ArrayList<>();

  /**
   * 
   * @param fields
   */
  public static void processQdata(List<String> fields) {

    for (String f : fields) {
      if (!f.contains("static")) {
        if (f.startsWith("private double[]")) {
          if (f.contains("Q")) {
            MarketToolsReflection fld = new MarketToolsReflection(f);
            System.out.println(fld);
            dList.add(fld);
          }
        }
      }
    }

    for (MarketToolsReflection d : dList) {
      d.genQuarterlyDecl();
    }

    for (MarketToolsReflection d : dList) {
      d.genQuarterlyAssign();
    }
  }

  /**
   * 
   * @param fields
   */
  public static void processCopyConstructor(List<String> fields) {

    for (String f : fields) {
      if (!f.contains("static")) {
        MarketToolsReflection fld = new MarketToolsReflection(f);
        System.out.println(fld);
        dList.add(fld);
      }
    }

    String prefix = "sfd";
    System.out.printf("if(%s != null) {%n", prefix);
    for (MarketToolsReflection d : dList) {
      d.genCopyConstructor(prefix);
    }
    System.out.println("}");

  }

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {

    Field[] allFields = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.class.getDeclaredFields();

    List<String> fields = new ArrayList<>();
    for (Field f : allFields) {
      fields.add(f.toString());
    }

    // processCopyConstructor(fields);
    processQdata(fields);

  }

  /**
   * 
   * @param flds
   */
  public MarketToolsReflection(String flds) {
    String[] fld = flds.split(" ");
    this.scope = fld[0];
    this.type = fld[1];
    this.qname = fld[2];
    int idx = this.qname.lastIndexOf('.');
    this.name = qname.substring(idx + 1);
  }

  public void genCopyConstructor(String prefix) {
    String s = String.format("this.%s = %s.%s;", name, prefix, name);
    System.out.println(s);
  }

  public void genQuarterlyDecl() {
    int idx = name.indexOf("Q");
    String prefix = name.substring(0, idx);
    String s = String.format("private QuarterlyDouble %s;", prefix + "Qdata");
    System.out.println(s);
  }

  public void genQuarterlyAssign() {
    int idx = name.indexOf("Q");
    String prefix = name.substring(0, idx);

    String methodName = name.substring(0, 1).toUpperCase();
    methodName += name.substring(1);

    String s = String.format("this.%s = new QuarterlyDouble(fd.get%s());", prefix + "Qdata", methodName);
    // this.cash = new QuarterlyDouble(fd.getCashQtr());
    System.out.println(s);
  }

  @Override
  public String toString() {
    return String.format("%-12s\t%-50s\t%-20s\t%-1s", this.scope, this.type, this.name, qname);
  }
}
