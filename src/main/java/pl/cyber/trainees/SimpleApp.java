package pl.cyber.trainees;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;
import pl.cyber.trainees.service.OdczytDanych;

import java.io.File;
import java.io.FileNotFoundException;

public class SimpleApp {

    private static java.lang.String String;

    public static void main(String[] args) throws FileNotFoundException {
        OdczytDanych odczytDanych = new OdczytDanych();

        //odczytujemy dane z klawiatury
       // System.out.println("Jak masz na imię?");
       // String firstName = odczytDanych.wprowadzonaWartoscZKlaswiatury();
      //  System.out.println("Witaj " + firstName + "!!!");


        System.out.println("Zadanie 2:");
        //String firstNameFromFile = odczytDanych.daneZPliku(new File("src/main/resources/daneZPliku.txt"));
        Model modelPojazduZPliku1 = odczytDanych.daneOModeluPojazdu(new File("src/main/resources/samochody/samochod1.txt"));
        Model modelPojazduZPliku2 = odczytDanych.daneOModeluPojazdu(new File("src/main/resources/samochody/samochod2.txt"));
        Model modelPojazduZPliku3 = odczytDanych.daneOModeluPojazdu(new File("src/main/resources/samochody/samochod3.txt"));

       // System.out.println(firstNameFromFile);
        System.out.println("Pojazd nr 1: " + modelPojazduZPliku1);
        System.out.println("Pojazd nr 2: " + modelPojazduZPliku2);
        System.out.println("Pojazd nr 3: " + modelPojazduZPliku3);
        Integer lacznyPrzebieg = modelPojazduZPliku1.getPrzebieg() + modelPojazduZPliku2.getPrzebieg() + modelPojazduZPliku3.getPrzebieg();
        System.out.println("Łączna ilość przejechanych km: " + lacznyPrzebieg);
        System.out.println("Dostępne pojemności silników samochodów to: " + modelPojazduZPliku1.getPojemnoscSilnika() + ", " + modelPojazduZPliku2.getPojemnoscSilnika() + ", " + modelPojazduZPliku3.getPojemnoscSilnika());



        //Model modelPojazdu1 = new Model();

        //var modelPojazdu1 = new Model("VW", "2020",
        //        "przód", "Passat", 10000,
        //        2.0, Kolor.ZIELONY);
        //var modelPojazdu1 = new Model("Ford", "2008",
        //        "przód", "Fiesta", 50000,
        //        1.4, Kolor.CZERWONY);
        //var modelPojazdu3 = new Model("Toyota", "2020",
        //        "4x4", "Rav4", 10000,
        //        2.0, Kolor.valueOf("NIEBIESKI"));


        //modelPojazdu1.setKolor(Kolor.CZERWONY);
        // modelPojazdu1.setNazwa("Fiesta");
        // modelPojazdu1.setPrzebieg(25000);
        // modelPojazdu1.setPojemnoscSilnika(1.4);
        // modelPojazdu1.setMarka("Ford");
        // modelPojazdu1.setNaped("przód");
        // modelPojazdu1.setRocznik("2015");

       // Petle petle = new Petle();
       // petle.wyswietlOd1Do100();
       // List<Double> listaDouble = null;
       // listaDouble = new ArrayList<>(Arrays.asList( //Ctrl+P oczekuje zmiennej Double zgodnej z listą
       //         1.0,
       //         2.0,
       //         5.0,
       //         10.0,
       //         20.0
       // ));
       // listaDouble.add(30.0);

       // petle.dodawanieElementowListy(listaDouble); //odwołanie się do klasy petle i metody dodawanieElementowListy

       // petle.wyswietlSet();






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

      //System.out.println(modelPojazdu1.toString());

      //System.out.println(modelPojazdu2.toString());
      //System.out.println(modelPojazdu3.toString());
     //   System.out.println(modelPojazdu2.getMarka());
     //   System.out.println(modelPojazdu3.getNaped());
     //   System.out.println(modelPojazdu3.getNazwa());

    }