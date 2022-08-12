package pl.cyber.trainees.wyjasnienia;

import pl.cyber.trainees.wyjasnienia.Wyjatek.MojUncheckedException;
import pl.cyber.trainees.wyjasnienia.Wyjatek.MojCheckedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatki {

//IndexOutOfBoundsException
// IOException
// IllegalArgumentsException

    //throw
    //wywołanie (rzucenie) wyjątku w kodzie
    //throw new IOException();

    /*mamy dostępne 2 rodzaje wyjątków checked () --> trzeba obsłużyć inaczej program się nie skompiluje oraz nie
    uruchomi i unchecked
    Przykład checked:
    IOException, ponieważ dzeidziczy (extends) on po klasie Exception (extends Exception)
    Takiego typu wyjątek i wiele innych trzeba zawsze obsłużyć w takim kodzie

    Wyjątki unchecked to są wyjątki niezagrażające działaniu aplikacji, bo będzie wyrzucony, a aplikacja
    będzie działała niezależnie od niego
    Przykładem wyjątku unchecked jest IndexOutOfBoundsException, ponieważ dziziesziczy po klasie RuntimeException
     */

    /*Obsłużenie wyjątków:

    1) poprzez słowo kluczowe THROWS, które zwykle piszemy po deklaracji metody a przed nawiasem { otwierającym metodę
    np.
    private void dzielenieLiczb(Integer a, Integer b) throws IOException {

    Dzięki słowu throws nasz wyjątek zostanie przekazany do metody niżej, jeśli będzie konstrukcja użyta przy
    metodzie main, to wtedy nasz wyjątek checked zostanie wyświetlony na konsoli.

    StackTrace - czyli inf o wyjątku dostępne z kosoli.

     */
    public void uruchom() throws Exception { //tu w metodzie String3 musi być Exception, przy reszcie IOException
        // dzielenieLiczb();
        //dzielenieLiczb2();
        //pierwiastek();
        //pierwiastekAlternatywa();
        //System.out.println("Wyświetla String zmienna: ");
        //String zmienna = null; //albo zamist tych dwóch linii:
        //wyswietlDlugoscParametruString(zmienna);// wyswietlString(null) tu by musiało być IOException???
       // wyswietlDlugoscParametruString1();
        //wyswietlDlugoscParametruString2();
        //wyswietlDlugoscParametruString3();
       // pobierzInformacjeZPliku();

        try {
            dzielenieChecked();

        } catch (MojCheckedException ex){
                System.out.println("Podano dzielnik 0");
           }



    } //tutaj też trzeba throws IOException

    private void dzielenieLiczb() throws IOException {
        //Użyć Scanner aby pobrać 2 zmienne od Użytkownika
        //i wykonać działanie dzielenia liczb.
        //!TRZEBA WPISYWAĆ WSZĘDZIE W KAŻDĄ METODĘ, tu w dzielenie liczb, w uruchom i SimpleApp

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę a--> ");
        Integer a = scanner.nextInt();
        System.out.println("podaj liczbę b--> ");
        Integer b = scanner.nextInt();
        //Integer dzielenie; nie potrzeba, wystarczy w wyświetleniu
        //dzielenie = a / b;
        System.out.println("Wynik dzielenia a/b to--> ");
        //throw powoduje rzucenie wyjątku. Dzięki temu możemy rzucić dowolym wyjątkiem w dowolnym momencie aplikacji
        throw new IOException("test"); //podkreślony na czerwono bo nie obsłużony, trzeba wpisać do metody po () a przed {
    }

    /* obsługa wyjątów zalecana:
     Używamy konstrukcji try / catch

      try {
     //w tym miejscu powinien być kod, który może generować jakiś Exception
        throw new IOException("test");
      } catch(IOException ex) {
      // konstrukcja obsługi błędu. W tym miejscu np podajemy informację na konsolę ewentualnie możemy wykonać inne działania
        System.out.println("wiadomość");
      }

      try {
      System.out.println("Wynik dzielenia: " + a/b);
      } catch (ArithmeticException ex) {

      System.out.println("Niedozwolona operacja dzielenia przez 0. Zostanie wykonane dzielenie przez 1.");
      System.out.println("Wynik dzielenia: " + a/1);

      }

     */
    private void dzielenieLiczb2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę a--> ");
        Integer a = scanner.nextInt();
        System.out.println("podaj liczbę b--> ");
        Integer b = scanner.nextInt();
        try {

            System.out.println("Wynik dzielenia: " + a / b);

        } catch (ArithmeticException ex) {

            System.out.println("Wynik dzielenia a/b to zawsze jest 0. Podano dzielnik 0");
        }

    }

    /*rozwinięcie konstrukcji try/catch ZAWSZE kolejnośc od wewnętrznego na zewnątrz
    (od szczegółu Arithmetic Exception) do ogółu czyli Exception zmiana powoduje błąd: has already been caught
 try {

  } catch(ArithmeticException ex) {

  } catch(IllegalArgumentException ex) {
    println("Podaj poprawne informacje!!!");
  } catch(RuntimeException ex) {
    println("Ojej !!!");
  } catch(Exception ex) {
     println("Coś się stało!!!");
  }


Catch można parametryzować dla wielu wyjątków i można grupować tzn kilka "obsłużeń" wyjątków zawęzić do jednego bloku catch,
stosując wtedy

try {

  } catch(ArithmeticException | IllegalArgumentException | RuntimeException | Exception ex) {
    println("Podaj poprawne informacje!!!");
  }


Catcha nie trzeba stosowac jeśli zastosujemy finally
try {
//throw new IOException("test"); // w błędach typu checked musi być catch
throw new IllegalArgumentException("test");
} catch (IllegalArgumentException e) {
println("IllegalArgumentException thrown");
}
finally {
sout("to jest finally!);
     */

    /*Db ZASADY przy stosowaniu wyjątków:
    1) blok try powinien mieć jak najmniej kodu do weryfikacji
    2) Powinniśmy używać szczegółowych wyjątków tj. np. IllegalArgumentException zamiast Exception
    3) W blokach catch należy podać najbardziej szczegółowe inf o problemie z ich opisem
    4) POwinniśmy używać wyjątków typu checked aby inni programiści któzy wykorzystują obiekty musieli się zabezpieczyć

     */

    //Zadanie 2
    //Utworzyć metodę, która pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
    //Jeśli użytkownik poda liczbę ujemną to należy rzucić IllegalArgumentException oraz obsłużyć sytuację, w której uzytkownik
    // poda ciąg znaków, który nie jest liczbą

    private void pierwiastek() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe, z której policzymy pierwiastek drugiego stopnia: ");
        Double n; //gdyby było tu String
        try {
            n = scanner.nextDouble(); //n = scanner.next
        } catch (InputMismatchException e) {
            System.out.println("...");
            n = 3.0; //wtedy tu n=" ";
        }

//       if("".equals(n) || Double.parseDouble(n)<0.0) {        // i wtedy to musi być
//           throw new IllegalArgumentException("Nie ma pierwiastka kwadratowego z liczby ujemnej");
//       }


        if (n < 0) {
            throw new IllegalArgumentException("Nie ma pierwiastka kwadratowego z liczby ujemnej");
//            System.out.println("Nie ma pierwiastka kwadratowego z liczby ujemnej");
        }
        try {
            System.out.println("pierwiastek kwadratowy z liczby " + n + "wynosi : " + Math.sqrt(n)); //
        } catch (IllegalArgumentException ex) {

        }
    }

    private void pierwiastekAlternatywa() {
        System.out.println("Podaj liczbę: ");
        Scanner scan = new Scanner(System.in);
        String liczba = scan.next();
        liczba = null;

        try {
            if ("".equals(liczba) || Integer.parseInt(liczba) < 0) {
                throw new IllegalArgumentException("Została podana liczba ujemna!");
            }
        } catch (NumberFormatException e) {
            System.out.println(" Get Message: " + e.getMessage());
            System.out.println(" Get StackTrace: ");
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }
            System.out.println();
            throw new IllegalArgumentException("Została podana inna wartość niż liczbowa jej wartość: " + liczba);
        }


        System.out.println("Pierwiastek liczby " + liczba + " to: " + Math.sqrt(Integer.parseInt(liczba)));
    }

    /*Zadanie 3


     */
    private Integer wyswietlDlugoscParametruString(String s) {
        return s.length();
    }

    private Integer wyswietlDlugoscParametruString1() {
        String scan = null;
        if (scan.equals(null)) {
            throw new NullPointerException("podana wartośc null");

        }

        return scan.length(); //Zwraca NullPointerException
    }

    private Integer wyswietlDlugoscParametruString2() {
        String scan = null;
        try {
            return scan.length();

        } catch (NumberFormatException ex) {

            System.out.println("Nieprawidłowa wartość dla zmiennej-->null");
            return 0; //musi tu byc return!!!
        }
    }

    //zad.5
    //Rozwinąc zad.3 o blok try catch tak jak w zad.4 zamiast komunikatu należy
    //rzucić wyjątek typu Exception z informacją z wyjątku NullPointerException (getmessage)
    private Integer wyswietlDlugoscParametruString3() throws Exception { //musii byc throws bo Exceprion typu checked
        //ale wtedy w uruchomieniu musi być throws Exception a NIE IOException
        String scan = null;
        try {
            return scan.length();

        } catch (NullPointerException ex) {
            System.out.println(" Get Message: " + ex.getMessage());

            System.out.println("Nieprawidłowa wartość dla zmiennej-->null");
            throw new Exception(ex.getMessage());
        }
    }
    private void pobierzInformacjeZPliku() throws MojCheckedException { //trudniejsza to try i catch more actions surround(Alt +Enter) i sam wstawi try i catch
        //try {
        //            scan = new Scanner(new File("src/main/java/resources/test.txt"));
        //        } catch (FileNotFoundException e) {
        //            throw new RuntimeException(e);
        //        }
        // lub łatwiejsza to Alt+Shift+Enter
        //nie zrobimy tego przy unchecked, bo są nieznaczące dla działani aplikacji
        //dla checked

        Scanner scan = null;
        try {
            scan = new Scanner(new File("src/main/resources/test.txt"));
        } catch (FileNotFoundException e) {
            throw new MojCheckedException("KOMUNIKAT"); // TRZEBA BYŁO WPISAĆ KOMUNIKAT BO KONSTRUKTOR Z...
            // wcześniej gdy nie było swojego RunTimeException(e);
            //wstawiając swój trzeba Alt+Shift+Enter
            //tu możemy wpisać ("Komunikat naszego błędu!")
        }
        System.out.println(scan.nextLine());


    }
    //Zadanie: Utowrzyć dwie metody i dwa rodzaje Exceptions:
    /*
    jeden jako checked, ma dziedziczyć po Exception
    drugi jako unchecked powinien dziedziczyć po RuntimeException

    pierwsza metoda powinna wykonywać dzielenie natomiast powinna zwracać przygotowane przez nas Exception typu checked
    (musi być throws), następnie w metodzie uruchom należy obsłużyć wyjątek

    druga metoda powinna wykonywać dzielenie natomiast powinna zwracać przygotowane przez nas Exception typu unchecked
     */
    public void dzielenieChecked() throws MojCheckedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę a--> ");
        Integer a = scanner.nextInt();
        System.out.println("podaj liczbę b--> ");
        Integer b = scanner.nextInt();
        try {

            System.out.println("Wynik dzielenia: " + a / b);

        } catch (ArithmeticException ex) {

            throw new MojCheckedException("Wynik dzielenia a/b to zawsze jest 0. Podano dzielnik 0, rzucam checked: " + ex.getMessage());
        }
//            try {
//
//            System.out.println("Wynik dzielenia a/b to zawsze jest 0. Podano dzielnik 0");
//        } catch (MojPierwszyException ex){
//                System.out.println("Podano dzielnik 0");
//            }
    }
    private void dzielenieUnchecked() { //w uruchomieniu musi być RuntimeException
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę a--> ");
        Integer a = scanner.nextInt();
        System.out.println("podaj liczbę b--> ");
        Integer b = scanner.nextInt();
        try {

            System.out.println("Wynik dzielenia: " + a / b);

        } catch (ArithmeticException ex) {

            throw new MojUncheckedException("Wynik dzielenia a/b to zawsze jest 0. Podano dzielnik 0, rzucam unchecked: " + ex.getMessage());
        }


    }


}


