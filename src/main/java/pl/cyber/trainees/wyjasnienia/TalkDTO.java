package pl.cyber.trainees.wyjasnienia;

import pl.cyber.trainees.wyjasnienia.Wyjatek.MojUncheckedException;

import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;



// DTO - Data Transfer Object (obiekt java, którego zadaniem jest przenoszenie specyficznych danych
/*
Najczęściej wykorzystywane
1) komunikacja klient-serwer, innymi słowy Frontend(WEB) - Backend, aplikacja Mobile - Backend.
2) komunikacja baza danych - Backend (np aplikacja zapisana w Javie plus SpringFrameWork)

Obiekty DTO posiadaja oprócz metod parametry, który przenosi inf dla nas

Cechy szczególne obiektów (obowiązkowo pierwsze trzy!):
1) pola (parametry) opisujące konkretny obiekt np. Samochod--> pola samochodu to np. Marka, kolor, przebieg, ...
2) klasy te najczęściej posiadają konstruktor (do prawidłowego utworzenia obiektu danej klasy)
3) posiada konkretne metody odwołujące się do utworzonego obiektu (getter, Setter, toString, ...) lub

4) (mogą nie muszą mieć) te co coś konwertują, czyli takie które mają swój konwerter (dla Samochodu tworzenie encję bazy danych w Javie-->
obiekt DTO i był jest wysyłany do aplikacji Frontend (żeby ukryć jak jest zapisany obiekt w bazie danych
 */
public class TalkDTO {

    private final String tematRozmowy; //tu parametry, stąd pobiera info i NIE ZMIENI ICH bo private final!
    public String opis; // tu będzie można zmieniać bo public
    private List<String> przyklady; // gdy nie będzie final , to zastosować poniżej setter jak poniżej, ale
    //tu może być być final
    //tu można zmieniać poprzez modifyList czyli jak działa jak setter, albo sam setter

    public TalkDTO(String tematRozmowy, String opis, List<String> przyklady) {
        this.tematRozmowy = tematRozmowy;
        this.opis = opis;
        this.przyklady = przyklady;
    }

    public String getTematRozmowy() {
        return tematRozmowy;
    }

    public String getOpis() {
        return opis;
    }

    public List<String> getPrzyklady() {
        return przyklady;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setPrzyklady(List<String> przyklady) {
        this.przyklady = przyklady;
    }
    public void modifyList(List<String> wiecejPrzykladow) {
    this.przyklady.addAll(wiecejPrzykladow);
    }
}

   /* public TalkDTO(                      //tu konstruktor
            final String tematRozmowy,
            final List<String> przyklady) {

        if(przyklady ==null || przyklady.isEmpty()) { //pierwsza z wersji
            throw new MojUncheckedException("parametr przyklady jest pusty");
        }
        this.tematRozmowy = tematRozmowy;
         /*
        IV konstrukcja warunkowa if
        przyklady.isEmpty() ? new ArrayList<>() : przyklady

        wszystko przed znakiem ? to jest warunek sprawdzający czyli if(przyklady.isEmpty())
        między znakiem ? a znakiem : znajduje się instrukcja, jeżeli true inaczej mówiąc zawartość pierwszego bloku w instrukcji if
        wszystko po znaku : znajduje się instrukcja, jeżeli false, inaczej mówiąc zawartość bloku w instrukcji else
     */

        //jak jest 1 operacja do wykonania to jednolinijkowo jak poniżej
       // this.przyklady = przyklady.isEmpty() ? new ArrayList<>() : przyklady;//druga z wersji
        //postać równoważna do : this.przyklady = przyklady.isEmpty() ? new ArrayList<>() : przyklady; to poniżej
    /*    if (przyklady ==null || przyklady.isEmpty()) {
            this.przyklady = new ArrayList<>();
        } else {
            this.przyklady = przyklady;
        }
    }

    public String getTematRozmowy() {
        return tematRozmowy;
    }
    public List<String> getPrzyklady() {
        return przyklady;
    }
    public String toString() {
        return "Informacja o klasie TalkDTO: {tematRozmowy: " + this.tematRozmowy
                + "Pierwszy pzykład : " + this.przyklady.get(0) + "}";
    }
}
*/