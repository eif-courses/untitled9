package eif.viko.lt.pagrindai;

import java.util.ArrayList;
import java.util.List;

public class Klientas {
  private long id;
  private double pinigai;
  private Krepselis krepselis;


  public Klientas(long id, double pinigai, Krepselis krepselis) {
    this.id = id;
    this.pinigai = pinigai;
    this.krepselis = krepselis;
  }

  public void idetiIkrepseli(Preke preke){
    krepselis.ideti(preke);
  }

  public void perziuretiKrepseli(){
    krepselis.perziureti();
  }
  public void apmoketiKrepseli(Klientas klientas){
    krepselis.apmoketi(klientas);
  }


  public double getPinigai() {
    return pinigai;
  }

  public void setPinigai(double pinigai) {
    this.pinigai = pinigai;
  }
}
