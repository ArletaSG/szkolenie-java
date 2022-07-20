package pl.cyber.trainees;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;
import pl.cyber.trainees.kalkulator.Dodawanie;
import pl.cyber.trainees.kalkulator.Mnozenie;
import pl.cyber.trainees.service.OdczytDanych;

import java.io.File;
import java.io.FileNotFoundException;

public class SimpleApp {

    private static java.lang.String String;

    public static void main(String[] args) throws FileNotFoundException {
        OdczytDanych odczytDanych = new OdczytDanych();

       // odczytujemy dane z klawiatury
       //System.out.println("Jak masz na imię?");
      // String firstName = odczytDanych.wprowadzonaWartoscZKlaswiatury();
       //System.out.println("Witaj " + firstName + "!!!");



        //dodawanie 5 liczb z klawiatury z parseInt i z klas i ich wypisanie
        System.out.println("podaj pierwszą liczbę całkowitą: ");
        String liczba1 = odczytDanych.wprowadzonaWartoscZKlaswiatury();
        System.out.println("podaj drugą liczbę całkowitą: ");
        String liczba2 = odczytDanych.wprowadzonaWartoscZKlaswiatury();
        System.out.println("podaj trzecią liczbę całkowitą: ");
        String liczba3 = odczytDanych.wprowadzonaWartoscZKlaswiatury();
        System.out.println("podaj czwartą liczbę całkowitą: ");
        String liczba4 = odczytDanych.wprowadzonaWartoscZKlaswiatury();
        System.out.println("podaj piątą liczbę całkowitą: ");
        String liczba5 = odczytDanych.wprowadzonaWartoscZKlaswiatury();
        Dodawanie dodawanie5liczbInt = new Dodawanie();

        //String w = dodawanie5liczb.add(liczba1, liczba2);
        //System.out.println("Witaj " + w + "!!!");
        int l1 = Integer.parseInt(liczba1);
        int l2 = Integer.parseInt(liczba2);
        int l3 = Integer.parseInt(liczba3);
        int l4 = Integer.parseInt(liczba4);
        int l5 = Integer.parseInt(liczba5);
        Integer w = l1+l2+l3+l4+l5;
        System.out.println("Dodawanie liczb [a, b, c, d, e]:" + w);
        Integer z = dodawanie5liczbInt.add(l1+l2+l3,l4+l5);
        System.out.println("z użyciem klas:Dodawanie liczb [a, b, c, d, e]:" + z);

             //dodawanie 5 liczb Double z klawiatury i  ich wypisanie


        System.out.println("podaj pierwszą liczbę double np. 2.5: ");
        String liczbad1 = odczytDanych.wprowadzonaWartoscZKlaswiatury();
        System.out.println("podaj drugą liczbę double: ");
        String liczbad2 = odczytDanych.wprowadzonaWartoscZKlaswiatury();
        System.out.println("podaj trzecią liczbę double: ");
        String liczbad3 = odczytDanych.wprowadzonaWartoscZKlaswiatury();
        System.out.println("podaj czwartą liczbę double: ");
        String liczbad4 = odczytDanych.wprowadzonaWartoscZKlaswiatury();
        System.out.println("podaj piątą liczbę double: ");
        String liczbad5 = odczytDanych.wprowadzonaWartoscZKlaswiatury();
        Dodawanie dodawanie5liczbDouble = new Dodawanie();
        Double d1 = Double.parseDouble(liczbad1);
        Double d2 = Double.parseDouble(liczbad2);
        Double d3 = Double.parseDouble(liczbad3);
        Double d4 = Double.parseDouble(liczbad4);
        Double d5 = Double.parseDouble(liczbad5);
        Double x = d1 + d2 + d3 + d4 + d5;
        System.out.println("Dodawanie liczb [a, b, c, d, e]:" + x);


        //mnożenie 5 liczb każda razy 10 i wyświetlenie (Integer i Double)
        Mnozenie mnozenieliczbIntRazy10 = new Mnozenie();
        Integer n1 = mnozenieliczbIntRazy10.multiplication(10, l1);
        Integer n2 = mnozenieliczbIntRazy10.multiplication(10, l2);
        Integer n3 = mnozenieliczbIntRazy10.multiplication(10, l3);
        Integer n4 = mnozenieliczbIntRazy10.multiplication(10, l4);
        Integer n5 = mnozenieliczbIntRazy10.multiplication(10, l5);
        System.out.println("Mnożenie przez 10 liczb: ");
        System.out.println("a*10: " + n1);
        System.out.println("b*10: " + n2);
        System.out.println("c*10: " + n3);
        System.out.println("d*10: " + n4);
        System.out.println("e*10: " + n5);

        Mnozenie mnozenieliczbDoubleRazy10 = new Mnozenie();
        Double m1 = mnozenieliczbDoubleRazy10.multiplication(10.0, d1);
        Double m2 = mnozenieliczbDoubleRazy10.multiplication(10.0, d2);
        Double m3 = mnozenieliczbDoubleRazy10.multiplication(10.0, d3);
        Double m4 = mnozenieliczbDoubleRazy10.multiplication(10.0, d4);
        Double m5 = mnozenieliczbDoubleRazy10.multiplication(10.0, d5);
        System.out.println("Mnożenie przez 10 liczb: ");
        System.out.println("a*10: " + m1);
        System.out.println("b*10: " + m2);
        System.out.println("c*10: " + m3);
        System.out.println("d*10: " + m4);
        System.out.println("e*10: " + m5);








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