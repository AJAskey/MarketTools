package net.ajaskey.sandbox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData;

public class TestBinary implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  int    num;
  double dnum;
  String text;
  int[]  iArr;

  public TestBinary() {
    num = 666;
    dnum = 666.666;
    text = "this is some text.";
    iArr = new int[256];
    for (int i = 0; i < 256; i++) {
      iArr[i] = i * 100;
    }

  }

  public static void main(final String[] args) throws FileNotFoundException, IOException {
//    TestBinary tb = new TestBinary();
//    try {
//      ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("foo.bin"));
//
//      o.writeObject(tb);
//      o.close();
//    }
//    catch (IOException e) {
//      System.out.println(e);
//    }

    CompanyData cd;
    ObjectInputStream o = new ObjectInputStream(
        new FileInputStream("D:\\dev\\eclipse-markettools\\MarketTools\\out\\BigDB\\2020\\all-companies-2020Q2.bin"));
    try {
      cd = (CompanyData) o.readObject();
      System.out.println(cd.getTicker());
    }
    catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
}
