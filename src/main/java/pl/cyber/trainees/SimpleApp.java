package pl.cyber.trainees;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

import java.util.ArrayList;
import java.util.List;

public class SimpleApp {

    private static java.lang.String String;

    public static void main(String[] args) {
        Model modelPojazdu1 = new Model();

        var modelPojazdu2 = new Model( "VW",  "2020",
                "przód", "Passat",  10000,
                 2.0, Kolor.ZIELONY);
        var modelPojazdu3 = new Model("Toyota", "2020",
        "4x4", "Rav4", 10000,
        2.0, Kolor.valueOf("CZERWONY"));

        //modelPojazdu1.setKolor(Kolor.CZERWONY);
       // modelPojazdu1.setNazwa("Fiesta");
       // modelPojazdu1.setPrzebieg(25000);
       // modelPojazdu1.setPojemnoscSilnika(1.4);
        // modelPojazdu1.setMarka("Ford");
       // modelPojazdu1.setNaped("przód");
       // modelPojazdu1.setRocznik("2015");

        public class Petle {
            public static void main(String[] args) {
                for (int i = 1; i < 101; i++) {

                    System.out.println("Liczby od 1 do 100:" + i);

                }
            }
            private void wyswietlOd1Do100(){

            }
        }
        //List<String> strings = new ArrayList<>();
       // strings.add("pierwszy");
       // strings.add("drugi");
       // strings.add("trzeci");

        //for (int i=0; i < 3; i++) {
       // }
       // for (int i=0; i < strings.size(); i++) {
       //     var tmp = strings.get(i);

        //    if (tmp == "pierwszy") {
        //        System.out.println("pierwszy element" + strings.get(i));
        //    } else {
        //        System.out.println("inny element " + strings.get(i));
        //    }
       //  }

        //for (String element : strings) {

        //    if (element == "pierwszy") {
        //        System.out.println("pierwszy element" + element);
        //    } else {
        //        System.out.println("inny element " + element);
        //    }
       // }



        //  System.out.println(strings.get(1));

     //   System.out.println(modelPojazdu1.toString());

      //  System.out.println(modelPojazdu2.toString());
       // System.out.println(modelPojazdu3.toString());
     //   System.out.println(modelPojazdu2.getMarka());
     //   System.out.println(modelPojazdu3.getNaped());
     //   System.out.println(modelPojazdu3.getNazwa());
    }







}