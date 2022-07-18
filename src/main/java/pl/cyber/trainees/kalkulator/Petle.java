package pl.cyber.trainees.kalkulator;

import pl.cyber.trainees.kalkulator.Dodawanie;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Petle {

    public void wyswietlOd1Do100() {
        // zad.1 Utworzyć listę od 1..100 po przecinku w jednej linii, na końcu . i prawidłowo wywołac w SimpleApp
        // for (int i = 0; i < 100; i++) {

        //    System.out.print(i + 1);
        //    System.out.print(", ");

        //} L UB
        for (int i = 1; i <= 100; i++) {
            if (i < 100) {
                System.out.print(i + ",");
            } else {
                System.out.print(i + ".");
            }
        }
        //zad.2 Utworzyć nową metodę nazwa DodawanieElementówListy, w której przekażemy jako parametr ListęDouble.
        // W ramach pętli foreach wykonamy dodawanie wartości z listy i wyświetlić w postaci:
        //Wynik dodawania listy: XYZ
        //XYZ-wynik dodawania
    }

    public void dodawanieElementowListy(List<Double> lista) {
        Double result = 0.0;

        for (Double element : lista) {
            System.out.println("Teraz wykonuję operację: " + element + "+" + result);
            result = Dodawanie.add(result, element);
            //lub bez klas
            //result = result + element;
        }
        System.out.println("Wynik dodawania listy: " + result);

        //SETY
        //  Set<Integer> intSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11));
        //Set.of() można ustawić kolekcję na 10 elementów
        // public void wyswietlSet(){

        // }

        // }

    }
        public void wyswietlSet () {
            Set<Integer> intSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
            for (Integer el: intSet) {
                System.out.println("To jest element seta: " + el);
            }
        }
}
