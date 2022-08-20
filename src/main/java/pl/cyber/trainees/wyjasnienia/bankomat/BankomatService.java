package pl.cyber.trainees.wyjasnienia.bankomat;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BankomatService {

    Scanner scanUser = new Scanner(System.in);
    Bankomat bankomat = new Bankomat();


    private boolean menu(final Integer pozycja) {

        Integer kwota = 0; //bez incjalizacji lub z wartością = 0

            try {

                switch (pozycja) {
                    case 1:
                        System.out.println("Wpłacam gotówkę");
                        System.out.print("Proszę podać kwotę wpłaty: ");
                        System.out.println("Banknoty do wyboru: 10, 20, 50, 100, 200, 500");

                        kwota = scanUser.nextInt();

                        sprawdzWprowadzaneKwoty(kwota);

                        bankomat.wplacGotowke(kwota);
                        break;
                    case 2:
                        System.out.println("Wypłacam gotówkę");
                        System.out.print("Proszę podać kwotę wypłaty: ");
                        System.out.println("Banknoty do wyboru: 10, 20, 50, 100, 200, 500");

                        kwota = scanUser.nextInt();

                        sprawdzWprowadzaneKwoty(kwota);

                        bankomat.sprawdzWyplate(kwota);

                        bankomat.wyplacGotowke(kwota);
                        break;
                    case 3:
                        System.out.println("Stan konta");
                        System.out.println("Bankomat posiada: " + bankomat.stanKonta());
                        break; // gdyby nie zapis return pozycja !=4 poniżej musielibyśmy jeszcze dopisać default (nie 1, 2, 3), ale wtedy
                    //wszedzie trzebaby dopisać return  true

                }
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidłowej liczby odnoszącej się do wpłaty/wypłaty");

            }


        return pozycja != 4;
    }

    private void sprawdzWprowadzaneKwoty(final Integer kwota) {
        List<Integer> lista = List.of(10, 20, 50, 100, 200, 500);

        if (!lista.contains(kwota)) { // negacja z ! to zaprzeczenie metody, co ma robić jeśli kwota nie należy
            // do listy if(!lista.contains(kwota)) - co ma robić jak kwota jest z listy
            throw new BusinessException("Wprowadź poprawną kwotę");
        } else {//tu teraz co ma robić gdy true
            // gdyby if(lista...) wcześniej, to teraz to czeka nie ma robić
            //odwrócony if


        }
    }

        public void uruchomRozwiązanie1 () {
            boolean czyKontynuowac; //bez deklaracji to jest false

            do {
                System.out.println("Wybierz dostępną opcję:");
                System.out.println("1. Wpłać Gotówkę");
                System.out.println("2. Wypłać Gotówkę");
                System.out.println("3. Sprawdź stan konta");
                System.out.println("4. Przerwij Operację");

                Integer userInfo = 4;

                try {
                    userInfo = scanUser.nextInt();
                } catch (InputMismatchException e) {
                    throw new BusinessException("Nie podano prawidłowej liczby z menu");
                }

//            java.lang.String userInfo = scanUser.nextLine();
//            alternative
                // var userInfo = scanUser.nextInt(); // jak będzie Integer/String (bo nextInt/nextLine) to samo zmieni na Integer/String
                //ma błąd więc try catch, wtedy przed obsługujemy wyjątek
                czyKontynuowac = menu(userInfo);

            } while (czyKontynuowac);

        }

    public void uruchomRozwiązanie2 () {

        List<Karta> karty = List.of(
                new Karta(12345678, 1234, 1000),
                new Karta(33345678, 9876, 2000)
        );
        boolean czyKontynuowac; //bez deklaracji to jest false

        //czy nasza karta jest prawidłowa (weryfikacja)
        boolean czyPrawidlowaKarta = false;
        Karta karta = null; //bo jeszcze nie wiemy co to za karta
        System.out.println("Włóż kartę");
        Integer nrKarty = scanUser.nextInt();
        System.out.println("Wprowadź PIN dla karty: ");
        Integer pinKarty = scanUser.nextInt();

        for (Karta el: karty) {//przeszukujemy karty, lista obiektów, pojedynczy element kolekcji
            if(el.getNrKarty().equals(nrKarty)) { //porównanie z nrKarty nie ma sensu, trzeba getter!!! zadeklarować kartę getter
                //kolejny if z weryfikacją nrPIN
                el.sprawdzNrPin(pinKarty);
                czyPrawidlowaKarta = true; //teraz wiemy, że db nr karty i pin
                karta = el; //przypisanie zmiennej karta wartości naszego elementu
            }
        }
//ALTERNATYWA
        /*
        //inny zapis za pomocą stream for powyżej:
        karta = karty.stream() //Kolekcja stream na obiekcie karta
                .filter(Objects::nonNull) //metoda do dofiltrowywania rekordów z listy .filter(element -> Objects::nonNull(element)
        //strzałka wewnątrz streamów w metodzie filter używamy wyrażenia lambda to jest strzałka (może być string lub integer, element
        //nie musi być zadeklarowany, kompilator sam to odczyta-> po strzałce określenie pewnego rodzaju funkcji
        // mogłoby być .filter(element -> {
        //return false} dzięki temu można odfiltrować kartę null
               // .allMatch(karta1 -> karta1 instanceof Karta) // czy obiekt Karty czy jest instanceof Karta lub w zwierzetach czy wszystkie zwierzeta są klasy Pies
                .filter(element -> element.getNrKarty().equals(nrKarty))
        .findFirst() //zwraca pierwszy znaleziony rekord, findFirst posiada kontener objektów(Optional<Karta> o nienullowych wartościach, zawiera ifPresent i orElse (np. new Karta(nr Karty, pinKarty, saldo)
        .orElseThrow(() -> {
            throw new BusinessException("Wprowadzono błędne dane karty.");
        });
        //streamowy zapis jest wolniejszy niż nasz for

        //        findAny() zwróci dowolny rekord w ramach listy
/*linia 129->otwieramy streama, mamy listę kart
List<Karta> karty = List.of(null, new Karta(12345678, 1234, 1000),new Karta(33345678, 9876, 2000)
linia 130-> lista juz bez null
linia 136
przykłąd 1 użytkownik podał klarta z pierwszymi danymi 12345678, to dostaniemy tylko pierwszą  kartę
linia 137:
odfiltrował resztę i została tylko prawidłowa karta z 12345678
przyklad 2 użytkowanik podał nr inny niż zadeklarowany np.45678
List<Karta> karty = List.of();
linia 138 zwróci exception i linia 139 przejmuje kontrolę oraz zwróci wyjątek typu Business Exception z opisem Wprowadzono błędne dane

więc nie ma takiej karty i finffirst zwróci wyjątek
 */


        if(!czyPrawidlowaKarta || karta == null) {
            throw new BusinessException("Wprowadzono błędne dane z karty.");
        }



        do {
            System.out.println("Wybierz dostępną opcję:");
            System.out.println("1. Wpłać Gotówkę");
            System.out.println("2. Wypłać Gotówkę");
            System.out.println("3. Sprawdź stan konta");
            System.out.println("4. Sprawdź stan konta karty");
            System.out.println("0. Przerwij Operację");

            Integer userInfo = 0;

            try {
                userInfo = scanUser.nextInt();
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidłowej liczby z menu");
            }

//            java.lang.String userInfo = scanUser.nextLine();
//            alternative
            // var userInfo = scanUser.nextInt(); // jak będzie Integer/String (bo nextInt/nextLine) to samo zmieni na Integer/String
            //ma błąd więc try catch, wtedy przed obsługujemy wyjątek
            czyKontynuowac = menu2(userInfo, karta);

        } while (czyKontynuowac);

    }

    private boolean menu2(final Integer pozycja, Karta karta) {

        Integer kwota = 0;

        try {
            switch (pozycja) {
                case 1:
                    System.out.println("Wpłacam gotówkę");

                    System.out.print("Proszę podać kwotę wpłaty: ");
                    kwota = scanUser.nextInt();
                    sprawdzWprowadzaneKwoty(kwota);

                    bankomat.wplacGotowke(kwota);
                    karta.wplacGotowke(kwota);
                    break;

                case 2:
                    System.out.println("Wypłacam gotówkę");
                    System.out.print("Proszę podać kwotę wypłaty: ");
                    kwota = scanUser.nextInt();
                    sprawdzWprowadzaneKwoty(kwota);

                    bankomat.sprawdzWyplate(kwota);
                    karta.sprawdzWyplate(kwota);
                    bankomat.wyplacGotowke(kwota);
                    karta.wyplacGotowke(kwota);

                    break;

                case 3:
                    System.out.println("Stan konta");
                    System.out.println("Bankomant posiada: " + bankomat.stanKonta());
                    break;
                case 4:
                    System.out.println("Saldo karty");
                    System.out.println("Na karcie posiadasz: " + karta.stanKonta());
                    break;
            }
        } catch (InputMismatchException e) {
            throw new BusinessException("Nie podano prawidłowej liczby odnoszącej się do wpłaty/wypłaty.");
        }

        return pozycja != 0;
    }


    }