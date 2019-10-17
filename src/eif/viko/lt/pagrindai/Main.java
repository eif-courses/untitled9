package eif.viko.lt.pagrindai;

public class Main {

    public static void main(String[] args) {
        Preke preke = new Plansete("iPAD", "qqq", 500);
        Preke preke2 = new TV("Samsung", "qqq", 1000);
        Preke preke3= new Telefonas("Iphone", "qqq", 2000);

        Krepselis krepselis = new Krepselis();

        Klientas klientas = new Klientas(985552, 5000, krepselis);

        klientas.idetiIkrepseli(preke);
        klientas.idetiIkrepseli(preke2);
        klientas.idetiIkrepseli(preke3);


        klientas.perziuretiKrepseli();
        System.out.println("PINIGAI: "+klientas.getPinigai());
        klientas.apmoketiKrepseli(klientas);
        System.out.println("PINIGAI: "+klientas.getPinigai());




    }
}
