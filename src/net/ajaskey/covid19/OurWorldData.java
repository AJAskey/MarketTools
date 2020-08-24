package net.ajaskey.covid19;

import java.text.SimpleDateFormat;

import net.ajaskey.common.DateTime;

public class OurWorldData {

  private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");

  private final static int AGED_65_OLDER                   = 29;
  private final static int AGED_70_OLDER                   = 30;
  private final static int CARDIOVASC_DEATH_RATE           = 33;
  private final static int CONTINENT                       = 1;
  private final static int DATE                            = 3;
  private final static int DIABETES_PREVALENCE             = 34;
  private final static int EXTREME_POVERTY                 = 32;
  private final static int FEMALE_SMOKERS                  = 35;
  private final static int GDP_PER_CAPITA                  = 31;
  private final static int HANDWASHING_FACILITIES          = 37;
  private final static int HOSPITAL_BEDS_PER_THOUSAND      = 38;
  private final static int ISO_CODE                        = 0;
  private final static int LIFE_EXPECTANCY                 = 39;
  private final static int LOCATION                        = 2;
  private final static int MALE_SMOKERS                    = 36;
  private final static int MEDIAN_AGE                      = 28;
  private final static int NEW_CASES                       = 5;
  private final static int NEW_CASES_PER_MILLION           = 11;
  private final static int NEW_CASES_SMOOTHED              = 6;
  private final static int NEW_CASES_SMOOTHED_PER_MILLION  = 12;
  private final static int NEW_DEATHS                      = 8;
  private final static int NEW_DEATHS_PER_MILLION          = 14;
  private final static int NEW_DEATHS_SMOOTHED             = 9;
  private final static int NEW_DEATHS_SMOOTHED_PER_MILLION = 15;
  private final static int NEW_TESTS                       = 16;
  private final static int NEW_TESTS_PER_THOUSAND          = 19;
  private final static int NEW_TESTS_SMOOTHED              = 20;
  private final static int NEW_TESTS_SMOOTHED_PER_THOUSAND = 21;
  private final static int POPULATION                      = 26;
  private final static int POPULATION_DENSITY              = 27;
  private final static int POSITIVE_RATE                   = 23;
  private final static int STRINGENCY_INDEX                = 25;
  private final static int TESTS_PER_CASE                  = 22;
  private final static int TESTS_UNITS                     = 24;
  private final static int TOTAL_CASES                     = 4;
  private final static int TOTAL_CASES_PER_MILLION         = 10;
  private final static int TOTAL_DEATHS                    = 7;
  private final static int TOTAL_DEATHS_PER_MILLION        = 13;
  private final static int TOTAL_TESTS                     = 17;
  private final static int TOTAL_TESTS_PER_THOUSAND        = 18;

  public String    raw;
  private double   aged_65_older;
  private double   aged_70_older;
  private double   cardiovasc_death_rate;
  private String   continent;
  private DateTime date;
  private double   diabetes_prevalence;
  private double   extreme_poverty;
  private double   female_smokers;
  private double   gdp_per_capita;
  private int      handwashing_facilities;
  private double   hospital_beds_per_thousand;
  private String   iso_code;
  private double   life_expectancy;
  private String   location;
  private double   male_smokers;
  private double   median_age;
  private int      new_cases;
  private double   new_cases_per_million;
  private double   new_cases_smoothed;
  private double   new_cases_smoothed_per_million;
  private int      new_deaths;
  private double   new_deaths_per_million;
  private double   new_deaths_smoothed;
  private double   new_deaths_smoothed_per_million;
  private int      new_tests;
  private double   new_tests_per_thousand;
  private double   new_tests_smoothed;
  private double   new_tests_smoothed_per_thousand;
  private int      population;
  private double   population_density;
  private double   positive_rate;
  private double   stringency_index;
  private double   tests_per_case;
  private String   tests_units;
  private int      total_cases;
  private double   total_cases_per_million;
  private int      total_deaths;
  private double   total_deaths_per_million;
  private int      total_tests;
  private double   total_tests_per_thousand;
  private boolean  valid;

  /**
   * 
   * @param s
   */
  public OurWorldData(String s) {
    final String fld[] = s.trim().split("\t");
    this.valid = false;
    if (fld.length > 38) {
      this.raw = s.trim();
      this.iso_code = fld[OurWorldData.ISO_CODE].trim();
      this.continent = fld[OurWorldData.CONTINENT].trim();
      this.location = fld[OurWorldData.LOCATION].trim();
      this.date = new DateTime(fld[OurWorldData.DATE].trim(), "yyyy-MM-dd");
      this.date.setSdf(OurWorldData.sdf);
      this.total_cases = this.ParseInteger(fld[OurWorldData.TOTAL_CASES]);
      this.new_cases = this.ParseInteger(fld[OurWorldData.NEW_CASES]);
      this.new_cases_smoothed = this.ParseDouble(fld[OurWorldData.NEW_CASES_SMOOTHED]);
      this.total_deaths = this.ParseInteger(fld[OurWorldData.TOTAL_DEATHS]);
      this.new_deaths = this.ParseInteger(fld[OurWorldData.NEW_DEATHS]);
      this.new_deaths_smoothed = this.ParseDouble(fld[OurWorldData.NEW_DEATHS_SMOOTHED]);
      this.new_tests = this.ParseInteger(fld[OurWorldData.NEW_TESTS]);
      this.total_tests = this.ParseInteger(fld[OurWorldData.TOTAL_TESTS]);
      this.tests_per_case = this.ParseDouble(fld[OurWorldData.TESTS_PER_CASE]);
      this.population = this.ParseInteger(fld[OurWorldData.POPULATION]);
      this.valid = true;
    }
  }

  public double getAged_65_older() {
    return this.aged_65_older;
  }

  public double getAged_70_older() {
    return this.aged_70_older;
  }

  public double getCardiovasc_death_rate() {
    return this.cardiovasc_death_rate;
  }

  public String getContinent() {
    return this.continent;
  }

  public DateTime getDate() {
    return this.date;
  }

  public double getDiabetes_prevalence() {
    return this.diabetes_prevalence;
  }

  public double getExtreme_poverty() {
    return this.extreme_poverty;
  }

  public double getFemale_smokers() {
    return this.female_smokers;
  }

  public double getGdp_per_capita() {
    return this.gdp_per_capita;
  }

  public int getHandwashing_facilities() {
    return this.handwashing_facilities;
  }

  public double getHospital_beds_per_thousand() {
    return this.hospital_beds_per_thousand;
  }

  public String getIso_code() {
    return this.iso_code;
  }

  public double getLife_expectancy() {
    return this.life_expectancy;
  }

  public String getLocation() {
    return this.location;
  }

  public double getMale_smokers() {
    return this.male_smokers;
  }

  public double getMedian_age() {
    return this.median_age;
  }

  public int getNew_cases() {
    return this.new_cases;
  }

  public double getNew_cases_per_million() {
    return this.new_cases_per_million;
  }

  public double getNew_cases_smoothed() {
    return this.new_cases_smoothed;
  }

  public double getNew_cases_smoothed_per_million() {
    return this.new_cases_smoothed_per_million;
  }

  public int getNew_deaths() {
    return this.new_deaths;
  }

  public double getNew_deaths_per_million() {
    return this.new_deaths_per_million;
  }

  public double getNew_deaths_smoothed() {
    return this.new_deaths_smoothed;
  }

  public double getNew_deaths_smoothed_per_million() {
    return this.new_deaths_smoothed_per_million;
  }

  public int getNew_tests() {
    return this.new_tests;
  }

  public double getNew_tests_per_thousand() {
    return this.new_tests_per_thousand;
  }

  public double getNew_tests_smoothed() {
    return this.new_tests_smoothed;
  }

  public double getNew_tests_smoothed_per_thousand() {
    return this.new_tests_smoothed_per_thousand;
  }

  public int getPopulation() {
    return this.population;
  }

  public double getPopulation_density() {
    return this.population_density;
  }

  public double getPositive_rate() {
    return this.positive_rate;
  }

  public double getStringency_index() {
    return this.stringency_index;
  }

  public double getTests_per_case() {
    return this.tests_per_case;
  }

  public String getTests_units() {
    return this.tests_units;
  }

  public int getTotal_cases() {
    return this.total_cases;
  }

  public double getTotal_cases_per_million() {
    return this.total_cases_per_million;
  }

  public int getTotal_deaths() {
    return this.total_deaths;
  }

  public double getTotal_deaths_per_million() {
    return this.total_deaths_per_million;
  }

  public int getTotal_tests() {
    return this.total_tests;
  }

  public double getTotal_tests_per_thousand() {
    return this.total_tests_per_thousand;
  }

  public boolean isValid() {
    return this.valid;
  }

  @Override
  public String toString() {
    String ret = "";
    if (this.valid) {
      ret += String.format("%6s %25s %25s%12s%12d%12d%12d%15.3f%12d", this.iso_code, this.continent, this.location, this.date.toString(),
          this.total_cases, this.total_deaths, this.total_tests, this.tests_per_case, this.population);
      // ret += this.raw;
    }
    return ret;
  }

  /**
   * 
   * @param s
   * @return
   */
  private double ParseDouble(String s) {
    double ret = 0.0;
    final String ss = s.trim();
    if (ss.length() > 0) {
      try {
        ret = Double.parseDouble(ss);
      }
      catch (final Exception e) {
        ret = 0.0;
      }
    }
    return ret;
  }

  /**
   * 
   * @param s
   * @return
   */
  private int ParseInteger(String s) {
    int ret = 0;
    final String ss = s.trim();
    if (ss.length() > 0) {
      try {
        ret = Integer.parseInt(ss);
      }
      catch (final Exception e) {
        ret = 0;
      }
    }
    return ret;
  }

}
