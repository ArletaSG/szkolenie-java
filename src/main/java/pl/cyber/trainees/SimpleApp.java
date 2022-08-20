//1. Konstrukcja klass i metod

package pl.cyber.trainees; // oreślenie pakietu wramach projektu, gdzie
// znajduje się nasza klasa.
//pole package ustawia się automatycznie jeśli nasz plik zawiera się w odpowiedniej strukturze
//katalogów tj src/main/java/......
//w naszym przykładzie src/main/java/pl.cyber.trainees

//region miejsce na importy

import pl.cyber.trainees.wyjasnienia.*;
import pl.cyber.trainees.wyjasnienia.bankomat.BankomatService;
import pl.cyber.trainees.wyjasnienia.zwierzeta.Kot;

import java.io.IOException;
import java.time.LocalDate;

//poprzez importy powinniśmy rozumieć użycie dodatkowych bibliotek w naszej klasie

//endregion

//Linia public class SimpleApp. Opisuje definicję klasy o nazwie SimpleApp.
//modyfikator dostępu klasy public / private
//class - słowo kluczowe określające definicję klasy
//SimpleApp - nazwa klasy tutaj nazwa może być dowolna, aby była zgodna z dwoma warunkami:
//1) Nazwa pliku i nazwa klasy musi się równać
//2) Nazwy klas zawsze piszemy CamelCase'm z zastrzeżeniem że pierwsza litera i każda kolejna nowego wyrazu jest pisana
//z wielkiej litery

//Cały kod w klasie powinien być zapisany w jej ramach które określone są poprzez nawiasy {} poza klasą
//nie może być żadnego kodu, natomiast przed klasą możemy jedynie pisać import'y oraz package.
public class SimpleApp {

    public static void main(String[] args) throws Exception{ //TO ZAWSZE MUSI BYĆ PO STRUKTURZE KLASY
                                                //ZMIENIĆ NA OGÓLNY EXCEPTION
        //Petle petle = new Petle();
        //petle.uruchom();
        //4ChoinkaZGwiazdekTablica choinka = new ChoinkaZGwiazdekTablica();
        //choinka.wyswietlanieGwiazdek();
        //InstrukcjeWarunkowe instrukcjeWarunkowe = new InstrukcjeWarunkowe();
        //instrukcjeWarunkowe.uruchom();
        //Tablice tablice = new Tablice();
       // tablice.uruchom();
      //  Wyjatki wyjatki = new Wyjatki();
      //  wyjatki.uruchom();
       // Obiekty obiekty = new Obiekty();
       // obiekty.uruchom();

//        Kot kot = new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "MARIUSZ");
//        System.out.println(kot.przedstawSie());

        //Obiekty obiekty = new Obiekty();
        //obiekty.uruchom();
        BankomatService service = new BankomatService();
        //service.uruchomRozwiązanie1();
        service.uruchomRozwiązanie2();


    }
}

    /*
    //w ramach klasy deklarujemy zmienne globalne oraz metody
    public static String SEPARATOR_SPACJA = " "; //zmienna globalna dostępna w całej klasie.
    //konstrukcja zmiennych globalnych
    //modyfikator dostępu
    //słowo kluczowe static - określa że nasza zmienna jest statyczna
    //TypDanych
    //nazwa zmiennej. Dobrą praktyką jest aby nazwa zmiennej globalnej była pisana wyłącznie z wielkich liter a kolejne słowa
    //oddzielone zostały znakiem '_'
    //następnie przypisanie wartości

    //Deklaracja metod
    //W przypadku metody uruchomieniowej powinna ona występować tylko raz w całym projekcie
    //Konstrukcja metory uruchomieniowej:
    //modyfikator dostępu zawsze jako public
    //słowo kluczowe static
    //typ  metody zawsze void
    //nazwa metody zawsze main
    //parametry wejściowe metody, może ich nie być
    // ale z reguły powinna być to tablica args (tj. String[] args)
    public static void main(String[] args) {

        //UWAGA należy pilnować {} metody aby nie piesać tzw. metody w metodzie
        //W ramach metody uruchomieniowej możemy deklarować zmienne oraz pisać kod,
//    natomiast dobrą praktyką jest aby metoda uruchomieniowa wywoływała konkretne klasy
        // z kodem, który chcemy uruchomić.

        Basics testKonstr = new Basics(124);

        //pierwsze rozwiązanie
        Basics basics = new Basics();
//    basics.wyswietlTekst1("Jakiś tekst do wyświetlenia");

        //drugie rozwiązanie
        Basics basics2 = new Basics(" Nowy tekst do wyświetlenia ");
//    basics2.wyswietlTekst2("Jakiś tekst do wyświetlenia");


        //trzecie rozwiązanie
        Basics basics3 = new Basics("tekst1", "tekst2", " tekst3");
//    basics3.wyswietlTekst3("Jakiś tekst do wyświetlenia");

        BasicsInteger basicsInteger = new BasicsInteger();
//    basicsInteger.wyswietlLiczbe(12314);
//    basicsInteger.wyswietlLiczbe2(12314);

        String txt = "Teraz dodamy dwie liczby";
        Integer a = 1;
        Integer b = 2;
        basicsInteger.sumaDwóchLiczb(txt, a, b);


        Integer suma = basicsInteger.obliczSuma(a,b );
        basics.wyswietlTekst1(txt + suma);
        basics.wyswietlTekstSuma(txt, suma.toString());

    }

    //Należy pamiętać, że metody funkcjonalne deklarujemy w taki sposób:
    //nie mają słowka static
    //modyfikator dostępu może być public /private / protected/ default
    //Typ zwracajych informacji, aczkolwiem może metoda nic nie zwracać.
    //void - jeśli metoda nic nie zwraca
    //String/Integer/BigDecimal/Model/........ jeśli chcemy aby nasza metoda zwracała
    //konkretny typ danych i była możliwa bo użycia w innym miejscu np. klasy lub projektu
    //Należy pamiętać aby nazwy metod były pisane camelCase'm z zastrzeżeniem
    // że pierwsza litera jest mała
    public String nazwaMetody() {
        return ""; //return zawsze musi się pojawić jeśli nasza metoda jest inna niż void
    }

    public void wyswietlTekst(String tekst) {
        System.out.println(tekst);
    }

    private Integer kolejnaMetoda() {

        //w tym miejscu możliwe jest deklarowanie zmiennych
        //używanie instrukcji warunkowych
        //uzywanie pętli
        //uzywanie innych metod lub odwołanie do metod innych klad poprzez wcześniejszą deklaracje
        return 0;
    }


    //w tym miejscu możemy deklarować kolejne metody ich ilość jest dowolna.
    //Zalecana wielość klasy nie powinna przekroczyć 200 linii pliku
    //private void wyswietlStringSuma(String){

   // }


}

/*

    //Należy pamiętać, że metody funkcjonalne deklarujemy w taki sposób:
    //nie mają słowka static
    //modyfikator dostępu może być public /private / protected/ default
    //Typ zwracajych informacji, aczkolwiem może metoda nic nie zwracać.
    //void - jeśli metoda nic nie zwraca
    //String/Integer/BigDecimal/Model/........ jeśli chcemy aby nasza metoda zwracała
    //konkretny typ danych i była możliwa bo użycia w innym miejscu np. klasy lub projektu
    //Pamiętaj, nazey metod CamelCase, ale pierwsza litera jest MAła!!!

    public String nazwaMetody() {
        return ""; //return zawsze musi pojawić się jeśli nasza metoda jest inna niż void
    }

    public void wyswietTekst(String tekst) {
        System.out.println(tekst);
    }

    private Integer kolejnaMatoda() {
        //w tym miejscu możliwe jest deklarowanie zmiennych
        //używanie instrukcji warunkowych
        //uzywanie pętli
        //i innych metod lub odwołanie do metod innych klas poprzez wcześiejszą deklarację (albo deklaracja konstruktorów metody)
        return 0;
    }


    //w tym miejscu możemy deklarować kolejne metody ich ilość jest dowolna.
    //Zalecana wielkośc klasy nie powinna przekroczyć 200 linii pliku???
    public Integer wyswietlLiczbe(Integer a) {
        System.out.println(a);

    }

    public Integer wyswietlLiczbe2(Integer a) {
        System.out.println("Wyświetl podaną liczbę" + a);


    }
}

*/
