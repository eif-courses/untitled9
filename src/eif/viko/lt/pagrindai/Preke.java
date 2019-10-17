package eif.viko.lt.pagrindai;

public class Preke {
  private String pavadinimas;
  private String aprasymas;
  private double kaina;

  public Preke(String pavadinimas, String aprasymas, double kaina) {
    this.pavadinimas = pavadinimas;
    this.aprasymas = aprasymas;
    this.kaina = kaina;
  }

  public String getPavadinimas() {
    return pavadinimas;
  }

  public void setPavadinimas(String pavadinimas) {
    this.pavadinimas = pavadinimas;
  }

  public String getAprasymas() {
    return aprasymas;
  }

  public void setAprasymas(String aprasymas) {
    this.aprasymas = aprasymas;
  }

  public double getKaina() {
    return kaina;
  }

  public void setKaina(double kaina) {
    this.kaina = kaina;
  }

  @Override
  public String toString() {
    return "Preke{" +
        "pavadinimas='" + pavadinimas + '\'' +
        ", aprasymas='" + aprasymas + '\'' +
        ", kaina=" + kaina +
        '}';
  }
}
