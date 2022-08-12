package pl.cyber.trainees.wyjasnienia;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Petle {
    /*
    Pętla for i foreach

BUDOWA for
int i = 0 - inicjalizacja parametru początkowego 'do przechodzenia po pętli'
i<5 - warunek spełnienia kolejnego przejścia
i++ - inkrementacja wartości początkowej o 1
for(int i = 0; i<5; i++) {
//kod wykonania
//pritnln
//dodawnie w jakiś sposób
//dodawanie do listy elementy
}

JAK NIE STOSOWAĆ FOR
for(int i = 0; i<5; i++); {

}

PUŁAPKA:
for(int i = 0; i<5; i--); { -- tzw pętla nieskończona
 println(i);
 }

 for(int i = 0; i=-5; i++); { -- tzw pętla nieskończona
 println(i);
 }


 BUDOWA foreach
 for(TypDanych elementListy : lista) {
 }

 UWAGA!!!
 Usuwanie elementów z listy
 do rozwiązania usuwania elementów stosuję się wyłącznie for.
 for(int i = 0; i<5; i++) {
 lista.get(i)
 }

 List<>
 remove(); metoda do usuwania rekordów


     */

    //utowrzyć metodę true lub false jeśli podana liczba w parametrze nie jest równa 10

    public void uruchom() {

        //List<BigDecimal> lista = new ArrayList();
        //lista.add(BigDecimal.valueOf(10.0));
        //lista.add(BigDecimal.valueOf(2.0));
        //lista.add(BigDecimal.valueOf(5.6));
        //lista.add(BigDecimal.valueOf(21.8));
        //lista.add(BigDecimal.valueOf(2.1));
        //lista.add(BigDecimal.valueOf(41.0));
        //lista.add(BigDecimal.valueOf(14.0));
        //lista.add(BigDecimal.valueOf(1.0));
        //lista.add(BigDecimal.valueOf(4.0));

        //rozwiazanieZadanie1(lista); //odwołanie sie do metody z klasy Petle
        //choinkaProsta();
        //choinkaRozbudowana(3);
        // choinkaRozbudowana2(3);
        //wyswietlPodzielnePrzez5Od1Do100();
       // PodzielnePrzez5Od1Do100While();
       // TylkoPodzielneWhile(); //Pana
        //WhileDo100();//Pana
        //WhileLicznikx2Do100();
        // pierwszyProgramWhile();
        //sumaLiczbZForIWhile();
        //silniaProsta();
        //System.out.println("wynik silni dla 4!: "+ silniaRekurencja(4));
       // System.out.println("Ciąg Fibonacciego dla n=6: " + ciagFibonacciego(6));

    }

    // Zadanie nr 1
// Wykonać metodę która przyjmie jako parametr List<BigDecimal>, następnie wykona następujące zagadnienia:
// a) wyświetli każdy element listy jeden po drugim
// b) każdy element listy doda do siebie.

    private void rozwiazanieZadanie1(List<BigDecimal> list) {
        BigDecimal sumaLiczb = BigDecimal.ZERO;
        //for (int i = 0; i<10; i++) { JAK LISTA TO ZWYKŁEGO FOR NIE UŻYWAĆ, CHYBA, ŻE JAKO LIST SIZE

        // }


        for (BigDecimal liczba : list) {
            System.out.println(liczba);
            sumaLiczb = sumaLiczb.add(liczba);
        }

        System.out.println("Suma liczb: " + sumaLiczb);


    }
//zadanie CHoinka
    //klasyczne fory (a dokładnie dwa for)
    //metoda będzie przyjmować parametr jako wysokość
    /*
     *
     ***
     *****
     */

    // Integer iloscGwiazdekWSzczycie = 1;

    private void choinkaProsta() {
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
    }

    private void choinkaRozbudowana(Integer wysokoscChoinki) {
        Integer iloscWPodstawie = wysokoscChoinki + 2;

        for (int wysokosc = 0; wysokosc < wysokoscChoinki; wysokosc++) {
            for (int szerokosc = 0; szerokosc < wysokoscChoinki * 2; szerokosc++) {
                if (szerokosc < (wysokoscChoinki - wysokosc) || szerokosc > (wysokoscChoinki + wysokosc)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }

    private void choinkaRozbudowana2(Integer wysokoscChoinki) {
        {

            Integer maksymalnaLiczbaGwiazdek = (wysokoscChoinki * 2) - 1;
            System.out.println("Liczba gwiazdek w podstawie: " + maksymalnaLiczbaGwiazdek);
            System.out.println();

            for (int x = 1; x <= maksymalnaLiczbaGwiazdek; x += 2) {  //x = x + 2 ///  x++
                Integer spacje = (maksymalnaLiczbaGwiazdek - x) / 2;
                for (int y = 0; y < spacje + x; y++) {
                    if (y < spacje) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }

    }
    //Zadanie SILNIA:
    private void silniaProsta() {
        System.out.println("podaj liczbę n, dla której policzymy silnię: ");
        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        Integer s = 1;
        Integer i =0;

//        Integer result = 0;
        while (i<n) { //
            i+=1; //s*=i; ALE trzeba i = 1 zadeklarować, bo mnożenie *0
            s=s*i;//i++
        }
//        n! = s; można tu wyświetlić jako result = s; (wcześniej zadeklarować), ale to widać w sout pod s
        System.out.println("Liczba" + n +"! wynosi: " +s);
        // i na for to samo:
        s =1;
        for (int j = 1; j<=n; j++) {
            s = s * j;
        }
        System.out.println("n! wynosi "+ s);

    }
    private Integer silniaRekurencja(Integer n) { //w rekurencji parametr nie może być w metodzie tylko w ()
        // było void ale nie może musi być Integer!!!
        if (n>1) {
           return n * silniaRekurencja(n-1);
        }
        else {
            return 1;
        }
    }
// ZD CIĄG FIBONACCIEGO?
   /* private Integer ciagFibonacciego (Integer n) {
        switch (n>1) {
            case "1":
            return ciagFibonacciego(n-1)*ciagFibonacciego(n-2);
            case "2":
         (n==1){
            return 1;
        }
        else {
            return 0;
        }
    }

    // Zadanie
//  Utworzyć metodę, która przejdzie (będzie iterować) po liczbach od 1 do 100
//  Natomiast wyświetli tylko te które są podzielne przez 5
    //i dodanie ich do siebie

    private void wyswietlPodzielnePrzez5Od1Do100() { // tu w () nie trzeba deklarować zmiennej
        Integer sumaLiczb = 0;
        Integer iloscLiczb = 0;

        for (int i = 1; i <= 100; i++) { //wtedy tu przy i musi byc int
            if (i % 5 == 0) {
                System.out.println(i);
                sumaLiczb += i; //gdyby tu było zamiast i 1, to pokazuje ilosc liczb :5
                iloscLiczb += 1;
            }

            //else {
            //  System.out.println();//nie potrzeba bo będą niepotrzebne puste wiersze
            //}
        }
        System.out.println("Suma liczb wynosi: " + sumaLiczb);
        System.out.println("Ilość liczb wynosi: " + iloscLiczb);
    }

    private void PodzielnePrzez5Od1Do100While() {
        Integer i = 1;
        Integer sumaLiczb = 0;
        Integer ileRazy = 1;
        while (i < 100) {
            if (i % 5 == 0) {
                System.out.println(i);
                sumaLiczb += i; //gdyby tu było zamiast i 1, to pokazuje ilosc liczb :5
                ileRazy += 1;
                            }
            i+=1;
        }
        System.out.println("Suma liczb wynosi: " + sumaLiczb);
        System.out.println("Ilość pętli wynosi: " + ileRazy);
    }
    private void WhileLicznikx2Do100 () {
        Integer i = 0;
        Integer liczba = 1;
        while (true) {
            System.out.println("Liczba: " + liczba);
            liczba *=2;
            i++;
            if (liczba>100) {
                break;
            }
        }

        System.out.println("Ile razy w pętli: " + i);
    }

   /* //lub Pana wersja ZD:
    private void whileDo100() {
        Integer licznik = 0;
        Integer ileRazy = 0;

        while (licznik < 101) {

            ileRazy++;
            System.out.println(licznik + ", ");

            if (licznik!=0) {
                licznik *=2;
                            }
            else {
                licznik ++;
            }
        }
    }
    public void tylkoPodzielneWhile() {
        Integer sumaLiczb = 0;
        Integer iloscLiczb = 0;

        Integer licznik = 0;
        while(licznik <101) {
            if (licznik % 5 ==0) {
                System.out.println(licznik + ", ");

                sumaLiczb += licznik;
                iloscLiczb += 1;
            }
            licznik++;
        }
        System.out.println("Suma liczb:" + sumaLiczb);
        System.out.println("Ilość znalezionych liczb podzielnych przez 5: " + iloscLiczb);
    }
*/


    /*
    WHILE oraz DO WHILE połączenie foreach i if ( nie sprawdzamy konkretnego warunek od kiedy do kiedy, tylko
    czy warunek jest sprawdzony
while - słowo kluczowe określające deklarację pętli while
do - słowo kluczowe określające deklarację pętli do-while
(condition) - warunek, który określa nam zakończenie działania pętli, aby pętla while
zadziałała to piersze srawdzenie musi się nie spełniać
{} - rozpoczęcie i zakończenie bloku / struktury pętli w ramach tych nawiasów znajduje się kod funkcji, którą ma wykonać program

STRUKTURA DO ZAPAMIĘTANIA:
  while(condition) {
  //blok kodu
  }

  do {
  //blok kodu
  } while(condition)


int liczba = 1;

while(liczba < 1) {
println("to jest liczba: " + liczba);
liczba++;
}

do {
sout("to jest liczba: " + liczba);
liczba++;
} while (liczba <= 23)
   */

    private void pierwszyProgramWhile(){
        int liczba = 0;

        while(liczba < 1) {
            System.out.println("while to jest liczba: " + liczba);
            liczba++;
        }

        do {
            System.out.println("do-while to jest liczba: " + liczba);
            liczba++;
        } while (liczba <= 23);

    }
    //wykonać for od 1 do 10 wyświetlić sumęFor i następnie wykonać to samo przy użyciu while/do-while
    //oraz wykorzystać if do porównania liczb, jeśli się uzgodnią to wyświetlamy true w przeciwnym wypadku false

    public void sumaLiczbZForIWhile(){
        int i=1;
        int sumaLiczb1=0;
        int sumaLiczb2=0;

        for (i=1; i<=10; i++) {
            sumaLiczb1 = sumaLiczb1 + i;
//            sumaLiczb1 += i;


        }
        System.out.println("Suma liczb z for wynosi: " + sumaLiczb1);
      i = 1;
//
//         do { <-rozpoczęcie do?
//             sumaLiczb2 = sumaLiczb2 + i;
//
//         } System.out.println("Suma liczb z while wynosi: " + sumaLiczb1);
//             while (i<=10);
//
//
//             {
//               System.out.println("Suma liczb z while wynosi: " + sumaLiczb1);
//           }
//

       while (i<=10) {
            sumaLiczb2 = sumaLiczb2 + i;
            i++;
        }
        System.out.println("Suma liczb z while wynosi: " + sumaLiczb1);
       if(sumaLiczb1 == sumaLiczb2) {
           System.out.println(true);
       } else {
           System.out.println(false);
       }
    }



}


