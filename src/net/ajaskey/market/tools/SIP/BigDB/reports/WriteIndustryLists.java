package net.ajaskey.market.tools.SIP.BigDB.reports;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.ajaskey.market.tools.SIP.BigDB.dataio.Options;
import net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived;
import net.ajaskey.market.tools.SIP.BigDB.reports.utils.Scans;
import net.ajaskey.market.tools.SIP.BigDB.reports.utils.SortByMCap;

public class WriteIndustryLists {

  final static String listDir = "D:/dev/MarketTools - dev/lists/";

  public static void main(String[] args) {

    System.out.println("Writing IndustryLists...");

    final List<CompanyDerived> cdrList = new ArrayList<>();

    final List<CompanyDerived> dRList = Scans.findMajor(2021, 1, 20.0, 300000L);

    Options.readOptionData();
    for (final CompanyDerived cdr : dRList) {
      if (Options.isOptionable(cdr.getTicker())) {
        if (cdr.getMarketCapQdata().getMostRecent() > 1000.0) {
//          System.out.printf("%s : %d%n", cdr.getTicker(), (int) cdr.getMarketCapQdata().getMostRecent());
          cdrList.add(cdr);
        }
      }
    }

    final List<String> industryList = WriteIndustryLists.getIndustryList(cdrList);
    for (final String s : industryList) {
      System.out.println(s);
    }
    System.out.println(industryList.size());
    final List<String> sectorList = WriteIndustryLists.getSectorList(cdrList);
    for (final String s : sectorList) {
      System.out.println(s);
    }
    System.out.println(sectorList.size());

    WriteIndustryLists.buildEnergyList(cdrList);
    WriteIndustryLists.buildChemicalsList(cdrList);
    WriteIndustryLists.buildConstructionList(cdrList);
    WriteIndustryLists.buildElectronicsList(cdrList);
    WriteIndustryLists.buildFinanceList(cdrList);
    WriteIndustryLists.buildInsuranceList(cdrList);
    WriteIndustryLists.buildRealEstateList(cdrList);
    WriteIndustryLists.buildBiotechList(cdrList);
    WriteIndustryLists.buildHomeBuilderList(cdrList);
    WriteIndustryLists.buildRetailList(cdrList);
    WriteIndustryLists.buildMetalsList(cdrList);
    WriteIndustryLists.buildTransportsList(cdrList);
    WriteIndustryLists.buildRecreationList(cdrList);
    WriteIndustryLists.buildHealthCareList(cdrList);

    WriteIndustryLists.buildSectorMaterials(cdrList);

  }

  private static void buildBiotechList(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String ind = cdr.getFd().getIndustry();
      final int id = WriteIndustryLists.getId(ind, 8);
      if (id == 56202010) {
        list.add(cdr);
      }
    }

    WriteIndustryLists.writeList(list, "ind_biotech.csv");
  }

  private static void buildChemicalsList(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String ind = cdr.getFd().getIndustry();
      final int id = WriteIndustryLists.getId(ind, 3);
      if (id == 511) {
        list.add(cdr);
      }
    }

    WriteIndustryLists.writeList(list, "ind_chemicals.csv");
  }

  private static void buildConstructionList(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String ind = cdr.getFd().getIndustry();
      final int id = WriteIndustryLists.getId(ind, 8);
      if (id == 51202010 || id == 52201020 || id == 53203020 || id == 52102020) {
        list.add(cdr);
      }
    }

    WriteIndustryLists.writeList(list, "ind_construction.csv");
  }

  private static void buildElectronicsList(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String ind = cdr.getFd().getIndustry();
      final int id1 = WriteIndustryLists.getId(ind, 3);
      final int id2 = WriteIndustryLists.getId(ind, 8);
      if (id1 == 571 || id2 == 52102030) {
        list.add(cdr);
      }
    }

    WriteIndustryLists.writeList(list, "ind_electronics.csv");
  }

  /**
   *
   * @param dRList
   * @throws FileNotFoundException
   */
  private static void buildEnergyList(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String ind = cdr.getFd().getIndustry();
      final int id = WriteIndustryLists.getId(ind, 2);
      if (id == 50) {
        list.add(cdr);
      }
    }

    WriteIndustryLists.writeList(list, "ind_energy.csv");
  }

  private static void buildFinanceList(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String ind = cdr.getFd().getIndustry();
      final int id = WriteIndustryLists.getId(ind, 3);
      if (id == 551) {
        list.add(cdr);
      }
    }

    WriteIndustryLists.writeList(list, "ind_finance.csv");
  }

  private static void buildHealthCareList(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String ind = cdr.getFd().getIndustry();
      final int id = WriteIndustryLists.getId(ind, 3);
      if (id == 561) {
        list.add(cdr);
      }
    }

    WriteIndustryLists.writeList(list, "ind_healthcare.csv");
  }

  private static void buildHomeBuilderList(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String ind = cdr.getFd().getIndustry();
      final int id = WriteIndustryLists.getId(ind, 8);
      if (id == 53203010 || id == 53204030 || id == 53204040 || id == 51301010) {
        list.add(cdr);
      }
    }

    WriteIndustryLists.writeList(list, "ind_homebuilder.csv");
  }

  private static void buildInsuranceList(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String ind = cdr.getFd().getIndustry();
      final int id = WriteIndustryLists.getId(ind, 3);
      if (id == 553) {
        list.add(cdr);
      }
    }

    WriteIndustryLists.writeList(list, "ind_insurance.csv");
  }

  /**
   *
   * @param dRList
   */
  private static void buildMetalsList(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String ind = cdr.getFd().getIndustry();
      final int id = WriteIndustryLists.getId(ind, 3);
      if (id == 512) {
        final int id2 = WriteIndustryLists.getId(ind, 8);
        if (id2 != 51202010) {
          list.add(cdr);
        }
      }
    }

    WriteIndustryLists.writeList(list, "ind_metals.csv");
  }

  /**
   *
   * @param dRList
   */
  private static void buildRealEstateList(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String ind = cdr.getFd().getIndustry();
      final int id = WriteIndustryLists.getId(ind, 3);
      if (id == 601) {
        list.add(cdr);
      }
    }

    WriteIndustryLists.writeList(list, "ind_realestate.csv");
  }

  /**
   *
   * @param dRList
   */
  private static void buildRecreationList(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String ind = cdr.getFd().getIndustry();
      final int id = WriteIndustryLists.getId(ind, 8);
      if (id == 53205020 || id == 53301010 || id == 53301020 || id == 53301030 || id == 53301040 || id == 52406020) {
        list.add(cdr);
      }
    }

    WriteIndustryLists.writeList(list, "ind_recreation.csv");
  }

  /**
   *
   * @param dRList
   */
  private static void buildRetailList(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String ind = cdr.getFd().getIndustry();
      final int id = WriteIndustryLists.getId(ind, 3);
      if (id == 534) {
        list.add(cdr);
      }
    }

    WriteIndustryLists.writeList(list, "ind_retail.csv");
  }

  private static void buildSectorMaterials(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String sec = cdr.getFd().getSector();
      if (sec.equals("51  - Basic Materials")) {
        list.add(cdr);
      }
    }

    WriteIndustryLists.writeList(list, "sec_materials.csv");

  }

  /**
   *
   * @param dRList
   */
  private static void buildTransportsList(List<CompanyDerived> dRList) {
    final List<CompanyDerived> list = new ArrayList<>();

    for (final CompanyDerived cdr : dRList) {
      final String ind = cdr.getFd().getIndustry();
      final int id = WriteIndustryLists.getId(ind, 3);
      if (id == 524) {
        list.add(cdr);
      }
    }

    WriteIndustryLists.writeList(list, "ind_transports.csv");
  }

  /**
   *
   * @param ind
   * @param len
   * @return
   */
  private static int getId(String ind, int len) {
    final int ret = Integer.parseInt(ind.substring(0, len));
    return ret;
  }

  /**
   *
   * @param dRList
   * @return
   */
  private static List<String> getIndustryList(List<CompanyDerived> dRList) {
    final Set<String> indSet = new HashSet<>();
    for (final CompanyDerived cdr : dRList) {
      indSet.add(cdr.getFd().getIndustry());
    }

    final List<String> retList = new ArrayList<>(indSet);
    Collections.sort(retList);
    return new ArrayList<>(retList);
  }

  /**
   *
   * @param dRList
   * @return
   */
  private static List<String> getSectorList(List<CompanyDerived> dRList) {
    final Set<String> secSet = new HashSet<>();
    for (final CompanyDerived cdr : dRList) {
      secSet.add(cdr.getFd().getSector());
    }

    final List<String> retList = new ArrayList<>(secSet);
    Collections.sort(retList);
    return new ArrayList<>(retList);
  }

  /**
   *
   * @param list
   * @param fname
   */
  private static void writeList(List<CompanyDerived> list, String fname) {
    List<String> idxGroup = new ArrayList<>();
    Collections.sort(list, new SortByMCap());
    try (PrintWriter pw = new PrintWriter(WriteIndustryLists.listDir + fname)) {
      pw.println("Code,Exchange");
      int knt = 0;
      for (final CompanyDerived cdr : list) {
        String str = String.format("%S,US", cdr.getTicker());
        pw.printf("%s%n", str);
        idxGroup.add(str.replace(",", ":"));
        knt++;
        if (knt >= 20) {
          break;
        }
      }
    }
    catch (final FileNotFoundException e) {
      e.printStackTrace();
    }

    String fname2 = String.format("out/customcode-%s", fname.replace(".csv", ".txt"));
    double power = 1.0 / (double) idxGroup.size();
    try (PrintWriter pw = new PrintWriter(fname2)) {
      pw.printf("POWER(%s", idxGroup.get(0));
      for (int i = 1; i < idxGroup.size(); i++) {
        String s = idxGroup.get(i);
        pw.printf(" * %s", s);
      }
      pw.printf(", POWER=%.4f)%n", power);
    }
    // POWER(BA:US * NOC:US * LMT:US * RTX:US, POWER=0.25)
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

}
