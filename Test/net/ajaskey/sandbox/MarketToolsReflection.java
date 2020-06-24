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

  public static void main(String[] args) {

    Field[] allFields = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.class.getDeclaredFields();

    List<String> fields = new ArrayList<>();
    for (Field f : allFields) {
      fields.add(f.toString());
    }

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

  @Override
  public String toString() {
    return String.format("%-12s\t%-50s\t%-20s\t%-1s", this.scope, this.type, this.name, qname);
  }
}
