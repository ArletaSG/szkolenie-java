package pl.cyber.trainees.service;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class OdczytDanych {
    public String wprowadzonaWartoscZKlaswiatury() {
        // do naszej apki wprowadzamy wartości które poda użytkownik
        // Scanner --> obiekt pozwalający na odczyt danych z klawiatury
        // System.in --> obiekt reprezentujący InputStream, odpowiada za przetwarzanie danych
        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
    }

    //nowa metoda, zwracająca stringa daneZPliku
    public String daneZPliku(File plikZew) throws FileNotFoundException
    {

        Scanner scan = new Scanner(plikZew);
        return scan.nextLine();
    }

    public Model daneOModeluPojazdu(File plikZew) throws FileNotFoundException {
        Model modelPojazdu = new Model();
        Scanner scan = new Scanner(plikZew);
        String liniaWPliku = scan.nextLine();
        //deklaracja tablic stringowych:
        String[] tablicaPliku = liniaWPliku.split(", ");
        modelPojazdu.setMarka(tablicaPliku[0]);
        modelPojazdu.setRocznik(tablicaPliku[1]);
        modelPojazdu.setNaped(tablicaPliku[2]);
        modelPojazdu.setNazwa(tablicaPliku[3]);
        modelPojazdu.setPrzebieg(Integer.valueOf(tablicaPliku[4]));
        //podkreślone bo w tablicy nie jest string!, Użyć odpowiedniego typu!
        modelPojazdu.setPojemnoscSilnika(Double.valueOf(tablicaPliku[5]));
        modelPojazdu.setKolor(Kolor.valueOf(tablicaPliku[6]));
        return modelPojazdu;
        //jeszcze nie ma pliku,  żeby nie pokazywało błędu to THROWS przekazuje z ciała etody do miejsca w którym jest wykonywane u nas SimpleApp
        //dopóki nie wyświtlimy na konsolę, ale wtedy w klasie SimpleApp też to powtórzyć
        //druga opcja to obsłużenie wyjątków--> na następnych zajęciach!!!
    }
}
