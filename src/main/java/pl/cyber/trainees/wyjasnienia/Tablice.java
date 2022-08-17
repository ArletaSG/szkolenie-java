package pl.cyber.trainees.wyjasnienia;

/*
  Tworzenie tablic jednowymiarowych w Java
  TypDanych[] nazwa_tablicy = new TypDanych[(int) zakres_tablicy];

  np.
  Integer[] tablicaInt = new Integer[10];

  Integer[] nowaTablica = {1, 2, 3, 4, 19};

  Zalecana forma:
  Integer[] nowaTablica = new Integer[5];
  nowaTablica[0] = 1;
  nowaTablica[1] = 2;
  nowaTablica[2] = 3;
  nowaTablica[3] = 4;
  nowaTablica[4] = 19;
   */
  /*
  Tworzenie tablic wielowymiarowych w Java
  TypDanych[][] nazwa_tablicy = new TypDanych[(int) zakres_tablicy1][zakres_tablicy2];
  Integer[][] tablicaInt = new Integer[10][10];

  Integer[][] nowaTablica = new Integer[1][1];
  nowaTablica[A][1] = 1;
  nowaTablica[0][1] = 1;
  nowaTablica[1][0] = 1;
  nowaTablica[1][1] = 1;
   */
/*
odwołanie się do tablic
Sout(nowaTablica[0]);
sout(nowaTablica[0][0];
 */

/* częsty błąd przy tablicach
ArrayIndexOutBoundsException - przekroczenie wielkości tablicy
np.   Integer[] tablicaInt = new Integer[10];
  tablicaInt[11] = 2;

 */
//zadanie 1
//Utworzyć tablicę o wymiarze 5 el. i przypisać do niej randomowe wartości
//Następnie proszę o wyświetlenie wszystkich el tablicy (tak działa hile oraz for)

import pl.cyber.trainees.wyjasnienia.Wyjatek.MojCheckedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tablice {


    public void uruchom() {
        wpisywanieElementowTablicy();
        wpisywanieElementowTablicyRandom();
        System.out.println("zadanie z listami");
        wpisywanieElemntowListy();
        System.out.println("tablica 10x10");
        tablica10x10();

        Wyjatki wyjatki = new Wyjatki();

        try {
            wyjatki.dzielenieChecked();
        } catch (MojCheckedException ex){
            System.out.println("Błąd nr 1");
        }
    }



    private void wpisywanieElementowTablicy() {
        Integer[] nowaTablica = new Integer[5];
        nowaTablica[0] = 0;
        nowaTablica[1] = 2;
        nowaTablica[2] = 4;
        nowaTablica[3] = 6;
        nowaTablica[4] = 8;

        Integer i = 0;

        while (i<nowaTablica.length) {
            System.out.println("element " + nowaTablica[i]);
                        i++;
        }
        //lub for
        for (i = 0; i < nowaTablica.length; i++) {
            System.out.println("Wyświetla element " + nowaTablica[i]);
        }
        //lub foreach
        for (Integer element :
        nowaTablica) {
            System.out.println(element);
        }
    }
    private void wpisywanieElementowTablicyRandom() {
            Integer[] tablica1 = new Integer[5];

            Random rand = new Random();

            //użyć wystarczy rand.nextInt();
            // rand.nextInt(liczba);
            // rand.nextInt(200); -> losowanie liczb z zakresu 0 - 200
            // rand.nextInt(150)+50; -> losowanie liczb z zakresu 50 - 200
            // rand.nextInt(KoniecZakresu-PoczątekZakresu)+Początek zakresu;

            for (int i=0; i<tablica1.length; i++){
                tablica1[i] = rand.nextInt(150)+50;
            }

            for (Integer element :
                    tablica1) {
                System.out.println(element);
            }
        }
        private void wpisywanieElemntowListy() {
            List<Integer> tablica1 = new ArrayList<>();

            Random rand = new Random();

            //użyć wystarczy rand.nextInt();
            // rand.nextInt(liczba);
            // rand.nextInt(200); -> losowanie liczb z zakresu 0 - 200
            // rand.nextInt(150)+50; -> losowanie liczb z zakresu 50 - 200
            // rand.nextInt(KoniecZakresu-PoczątekZakresu)+Początek zakresu;

            for (int i=0; i<5; i++){
                tablica1.add(rand.nextInt(150)+50);
            }

            for (Integer element :
                    tablica1) {
                System.out.println(element);
            }




    }
    //Zadanie 4
    //na przykładzie powyższych zadań utworzyć tablicę wielowymiarową 10x10 i wypełnić losowymi danych
    private void tablica10x10() {

        Integer[][] nowaTablica = new Integer[10][10];

        Random rand = new Random();
        for (int i = 0; i<nowaTablica.length; i++) {
            for (int j = 0; j< nowaTablica.length; j++) {
                nowaTablica[i][j] = rand.nextInt(150)+50;
            }
        }

        for (int i = 0; i<nowaTablica.length; i++) {
            for (int j = 0; j< nowaTablica.length; j++) {
                System.out.println(nowaTablica[i][j]);
            }
        }
    }





}
