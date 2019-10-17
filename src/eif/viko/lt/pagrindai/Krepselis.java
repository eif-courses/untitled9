package eif.viko.lt.pagrindai;

import java.util.ArrayList;
import java.util.List;

public class Krepselis {
  private List<Preke> list = new ArrayList<>();
  double kaina;
  public void ideti(Preke preke){
    list.add(preke);
  }
  public void apmoketi(Klientas klientas){
    for (Preke preke : list) {
      kaina += preke.getKaina();
    }
    klientas.setPinigai(klientas.getPinigai() - kaina);
  }
  public void perziureti(){
    for (Preke preke : list) {
      System.out.println(preke);
    }
  }

}
