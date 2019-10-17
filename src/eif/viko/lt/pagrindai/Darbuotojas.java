package eif.viko.lt.pagrindai;

public abstract class Darbuotojas{
  private long id;
  private String vardas;
  private String pareigos;

  public Darbuotojas(long id, String vardas, String pareigos) {
    this.id = id;
    this.vardas = vardas;
    this.pareigos = pareigos;
  }


  abstract double atlyginimas();

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getVardas() {
    return vardas;
  }

  public void setVardas(String vardas) {
    this.vardas = vardas;
  }

  public String getPareigos() {
    return pareigos;
  }

  public void setPareigos(String pareigos) {
    this.pareigos = pareigos;
  }

  @Override
  public String toString() {
    return "Darbuotojas{" +
        "id=" + id +
        ", vardas='" + vardas + '\'' +
        ", pareigos='" + pareigos + '\'' +
        '}';
  }
}
