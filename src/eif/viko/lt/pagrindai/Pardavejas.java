package eif.viko.lt.pagrindai;

public class Pardavejas extends Darbuotojas {

  public Pardavejas(long id, String vardas, String pareigos) {
    super(id, vardas, pareigos);
  }
  @Override
  double atlyginimas() {
    return 800 * 40 / 10;
  }
}
