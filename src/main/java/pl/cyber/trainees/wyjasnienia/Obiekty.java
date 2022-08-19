package pl.cyber.trainees.wyjasnienia;

import pl.cyber.trainees.wyjasnienia.Wyjatek.MojPierwszyException;
import pl.cyber.trainees.wyjasnienia.zwierzeta.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Obiekty {

    private void wyswietlTalkDTO() {
        List<String> list = new ArrayList<>();
        list.add("przyklad1");

        TalkDTO talkDTO = new TalkDTO("Obiektowosc", "Operacje na obiektach", list); //jeżeli obiekt ma konstruktor i
        // parametry, to trzeba tu uzupełnić konstruktor czyli tematRozmowy i przyklad listy null
        // System.out.println(talkDTO.toString());

        // System.out.println("Dziś zajmujemy się tematem: " + talkDTO.getTematRozmowy());

        System.out.println((talkDTO.getTematRozmowy()));
        System.out.println(talkDTO.opis);

        talkDTO.setOpis("1234");

        // talkDTO.tematRozmowy = ""; //na czerwono bo jest zmienną prywatną
        // talkDTO.opis = ""; //NIEPORZĄDANE!!! bez modyfikatora private i ustawienia zmiennej jako final możemy dopuścić do
        //sytuacji, w której nieświadomie damy możliwość zmiany parametrtu klasy
        System.out.println((talkDTO.getTematRozmowy()));
        System.out.println(talkDTO.getOpis());

        System.out.println(talkDTO.getPrzyklady());

        //deklarujemy zmienną
        List<String> wiecej = new ArrayList<>();
        wiecej.add("przyklad2");
        wiecej.add("przyklad3");
        talkDTO.modifyList(wiecej);

        System.out.println(talkDTO.getPrzyklady());

        List<String> wiecej2 = new ArrayList<>(); //dodanie elementu 4, jako drugi przykład
        wiecej2.addAll(talkDTO.getPrzyklady());
        wiecej2.add("przyklad4");
        talkDTO.setPrzyklady(wiecej2);
        System.out.println(talkDTO.getPrzyklady());

        //trzeci hardcorowy przykład: referencja (nieczytelne lepiej przez wewn metodę modify albo setter)
        //bo tu jest nadpisanie nowej zmiennej
        talkDTO = new TalkDTO(talkDTO.getTematRozmowy(), talkDTO.getOpis(), wiecej2);
        System.out.println(talkDTO.getPrzyklady());



//        talkDTO.setPrzyklady();  // nie można dodać elementów, można na 3 sposoby
        //pierwsza w TalkDTO klasie public void modifyList(List<String> wiecejPrzykladow {
        //this.przyklady.addAll(wiecejPrzykladow);
        //}


    }


   /*
  Utwórz klasę Kot . Klasa ta powinna mieć następujące pola:

    imię (ciąg znaków)
    data urodzenia (data)
    waga (liczba zmiennoprzecinkowa)
    imię opiekuna (ciąg znaków)

  Klasa ta powinna też mieć jedną metodę o nazwie przedstawSie. Metoda ta nie przyjmuje żadnych argumentów i zwraca
        ciąg znaków, który jest zdaniem zawierającym imię kotka, jego datę urodzenia, wagę oraz imię opiekuna.
   */

private void zadanie1() {
    Kot kot = new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz");
    System.out.println(kot.przedstawSie()); //jak w TalkDTO.wyswietl czyli obiekt i metoda String to String
}

    /*
  zadanie nr 2

  utworzyć listę 3 kotów a następnie niech każdy z nich się przedstawi.
   */

    //    var kot1 = new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz"); --> pierwsza opcja
//    var kot2 = new Kot("Felix2", LocalDate.of(2020, 8, 2), 3.5, "Mariusz");
//    var kot3 = new Kot("Felix3", LocalDate.of(2020, 9, 2), 4.0, "Mariusz");
//
//    List<Kot> koty = new ArrayList<>();
//    koty.add(kot1);
//    koty.add(kot2);
//    koty.add(kot3);


    private void zadanie2() { // przy pomocy list - druga lepsza opcja
        List<Kot> koty = new ArrayList<>();
        koty.add(new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz"));
        koty.add(new Kot("Felix2", LocalDate.of(2020, 8, 3), 3.5, "Mariusz"));
        koty.add(new Kot("Felix3", LocalDate.of(2020, 9, 4), 4.0, "Mariusz"));

        for (Kot kot : koty) {
            System.out.println(kot.przedstawSie());
        }
    }

        /* ZADANIE 3
Utworzyć listę 3 kotów dodać je do List<Zwierze> a następnie niech każdy z nich się przedstawi
         */

        private void zadanie3() { // przy pomocy list - druga lepsza opcja
            List<Zwierze> zwierze = new ArrayList<>();
            zwierze.add(new Kot(200.0, false,"Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz"));
            zwierze.add(new Kot("Felix2", LocalDate.of(2020, 8, 3), 3.5, "Mariusz"));
            zwierze.add(new Kot("Felix3", LocalDate.of(2020, 9, 4), 4.0, "Mariusz"));

            for (Zwierze zw : zwierze) {
                if(zw instanceof Kot){ //instanceof--> upewnienie się czy byt ogólny zw jest bytem
                    //szczegółowym, jeżeli tak, to można wywołać metodę z Kota
                    System.out.println( ((Kot)zw).przedstawSie()); //tu RZUTOWANIE (Kot)zw oznacza (szczególny)ogólny
                }
            }
            }
/*
   Firma
      Osoba
        Pracownik
          Sekretarka
          Programista
          Tester
        Szef
      adres

   class Firma {
   List<Osoba> osoby;
   String adres
   }

   class Osoba {
     String pietroNaKtorymPracuje;
   }

   class Szef extends Osoba {
     String imie;
   }

   class Sekretarka extends Pracownik {
     String imie;
   }

   class Pracownik extends Osoba {

   }

    */
/*
ZADANIE 4
Utworzyć klasę Pies, któa dziedziczy po klasie Zwierze
Utworzyć listę 3 kotów, 1 psa następnie dodać je do List<Zwierze>
a następnie niech każdy z nich się przedstawi.
Dodatkowo wywołać metodę (skorzystamy z przys łaniani metod) dajGlos()
 */

    private void zadanie4() { // przy pomocy list - druga lepsza opcja
        List<Zwierze> zwierze = new ArrayList<>();
        zwierze.add(new Kot(200.0, false,"Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz"));
        zwierze.add(new Kot("Felix2", LocalDate.of(2020, 8, 3), 3.5, "Mariusz"));
        zwierze.add(new Kot("Felix3", LocalDate.of(2020, 9, 4), 4.0, "Mariusz"));
        zwierze.add(new Pies(500.0, true, "Luna", LocalDate.of(2014, 9, 20), 26.0, "Arleta"));

        for (Zwierze zw : zwierze) {
            if(zw instanceof Kot){ //instanceof--> upewnienie się czy byt ogólny zw jest bytem
                //szczegółowym, jeżeli tak, to można wywołać metodę z Kota
                System.out.println( ((Kot)zw).przedstawSie()); //tu RZUTOWANIE (Kot)zw oznacza (szczególny)ogólny
                System.out.println((zw).dajGlos()); // tu przysłaniamy i możemy użyć tego poza if
            } else if (zw instanceof Pies) {
                System.out.println( ((Pies)zw).przedstawSie()); //tu RZUTOWANIE (Kot)zw oznacza (szczególny)ogólny
                System.out.println((zw).dajGlos()); // tu przysłaniamy i możemy użyć tego poza if
            }
           // System.out.println((zw).dajGlos()); // albo tu zamiast tych dwóch linii powyżej w if'ach
        }
    }

    /*
ZADANIE 5
Utworzyć Enum o nazwie ZwierzeEnum, w którym będą dostępne opcje:
KOT
PIES

Utworzyć listę 3 kotów i 1 psa poprzez utworzenie pliku zwierzeta.txt
następnie odczytaniu pliku przez aplikację.

Następnie dodać zwietzęta do List<Zwierze> przy użyciu enuma
a następnie niech każdy z nich się przedstawi.
Dodatkowo wywołać metodę (skorzystamy z przys łaniani metod) dajGlos()
 */


    private void zadanie5() {
        File file = new File("src/main/resources/zwierzeta.txt");

        List<Zwierze> zwierzeList = pobierzInformacjeZPliku(file);

        for (Zwierze zw : zwierzeList) {
            if(zw instanceof Pies) {
                System.out.println(((Pies) zw).przedstawSie());
            } else if(zw instanceof Kot) {
                System.out.println(((Kot) zw).przedstawSie());
            }
        }
    }

    private void zadanie6() {
        //DOKOŃCZYĆ zwierzęta dwa rodzaje i ich przedstawienie
        File file = new File("src/main/resources/zwierzeta.txt");
        List<Zwierze> zwierzeList = pobierzInformacjeZPliku(file);

        for (Zwierze zw : zwierzeList) {
            if(zw instanceof Pies) {
                System.out.println(((Pies) zw).przedstawSie());
            } else if(zw instanceof Kot) {
                System.out.println(((Kot) zw).przedstawSie());
            } else if(zw instanceof Gad) {
                System.out.println(((Gad) zw).przedstawSie());
            } else if(zw instanceof Ptaki) {
                System.out.println(((Ptaki) zw).przedstawSie());
            }
        }
    }

    private List<Zwierze> pobierzInformacjeZPliku(File file) {
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new MojPierwszyException("Komunikat naszego błędu!");
        }

        List<Zwierze> zwierzeta = new ArrayList<>();

        while (scan.hasNext()){
            String rowInFile = scan.nextLine(); //deklaracja pojedynczej linii z pliku
            String[] tablicaPliku = rowInFile.split(","); //stworzenie tablicy tego co się znajduje split
            if(ZwierzeEnum.PIES.name().equals(tablicaPliku[0])) {
                Pies pies = new Pies();
                zwierzeta.add(pies.convertFromFile(rowInFile));
            } else if (ZwierzeEnum.KOT.name().equals(tablicaPliku[0])) {
                Kot kot = new Kot();
                zwierzeta.add(kot.convertFromFile(rowInFile));
            } else if (ZwierzeEnum.GAD.name().equals(tablicaPliku[0])) {
                Gad gad = new Gad();
                zwierzeta.add(gad.convertFromFile(rowInFile));
            }else if (ZwierzeEnum.PTAKI.name().equals(tablicaPliku[0])) {
                Ptaki ptaki = new Ptaki();
                zwierzeta.add(ptaki.convertFromFile(rowInFile));
            }
        }
        /* albo switch
        switch(zw.getClass().getSimpleName()) {
        case "Kot":
          System.out.println("kottttttttttt");
          break;
        case "Pies":
          System.out.println("piessssss");
          break;
      }

         */

        return zwierzeta;
    }



    public void uruchom() {
        //wyswietlTalkDTO();
//        zadanie1();
        // zadanie2();
        //
        // zadanie4();
        DateConverter dateConverter = new DateConverter();
        try {
            System.out.println(dateConverter.stringToDate("2022/05/10"));
        } catch(ParseException e){
                throw new RuntimeException(e);
            }

        //zadanie5();
        zadanie6();

        }
    }






