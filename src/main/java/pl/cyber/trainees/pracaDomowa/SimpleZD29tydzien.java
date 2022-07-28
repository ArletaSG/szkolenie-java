package pl.cyber.trainees.pracaDomowa;

import pl.cyber.trainees.pracaDomowa.Osoba;

import static pl.cyber.trainees.pracaDomowa.PodzielnosciPotega3Pierwiastek2.*;

/*      1. Napisz metodę, która zwróci Twój aktualny wiek.
        2. Napisz metodę, która zwróci Twoje imię,
        3. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
        parzystość sprawdzamy przez znak % 2 inaczej sprawdzamy jej podzielność przez 2
        np. 2 % 2
        4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5,
        5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
        podniesienie do potęgi realizujemy przez bibliotekę Math i jej metodę pow(liczba, doJakiejPotęgi)
        np. Math.pow(2,3)
        6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy
        pierwiastek kwadratowy realizujemy przez bibliotekę Math i jej metodę sqrt(number)
        Math.sqrt(number)

 */
public class SimpleZD29tydzien {


    public static void main(String[] args) {
        Osoba osoba1 = new Osoba(42, "Arleta");
        //System.out.println("Twój wiek to: " + osoba1.wiek);
        //System.out.println("Twoje imię to: " +osoba1.imie);
        osoba1.getWiek();
        osoba1.getImie();

        podzielnaPrzez2(10.0);
        PodzielnosciPotega3Pierwiastek2.podzielnaPrzez3i5(35.0);
        PodzielnosciPotega3Pierwiastek2.doPotegiTrzeciej(5.0);
        PodzielnosciPotega3Pierwiastek2.pierwiastekKwadratowy(5.0);

        System.out.println(podzielnaPrzez2(15.0));
        System.out.println(podzielnaPrzez3i5(4.0));
        System.out.println(doPotegiTrzeciej(4.0));
        System.out.println(pierwiastekKwadratowy(9.0));


        }

    }


