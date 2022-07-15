package pl.cyber.trainees;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

public class SimpleApp {
    public static void main(String[] args) {
        Model modelPojazdu1 = new Model();

        var modelPojazdu2 = new Model( "VW",  "2020",
                "przód", "Passat",  10000,
                 2.0, Kolor.ZIELONY);
        var modelPojazdu3 = new Model("Toyota", "2020",
        "4x4", "Rav4", 10000,
        2.0, Kolor.valueOf("CZERWONY"));
        modelPojazdu1.setKolor(Kolor.CZERWONY);
        modelPojazdu1.setNazwa("Fiesta");
        modelPojazdu1.setPrzebieg(25000);
        modelPojazdu1.setPojemnoscSilnika(1.4);
        modelPojazdu1.setMarka("Ford");
        modelPojazdu1.setNaped("przód");
        modelPojazdu1.setRocznik("2015");

        System.out.println(modelPojazdu1.toString());

        System.out.println(modelPojazdu2.toString());
        System.out.println(modelPojazdu3.toString());
        System.out.println(modelPojazdu2.getMarka());
        System.out.println(modelPojazdu3.getNaped());
        System.out.println(modelPojazdu3.getNazwa());
    }



}