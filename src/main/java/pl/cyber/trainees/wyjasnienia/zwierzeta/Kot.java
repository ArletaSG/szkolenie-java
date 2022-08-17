package pl.cyber.trainees.wyjasnienia.zwierzeta;

import pl.cyber.trainees.wyjasnienia.DateConverter;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/* ZADANIE 1
  Utwórz klasę Kot . Klasa ta powinna mieć następujące pola:

    imię (ciąg znaków)
    data urodzenia (data)
    waga (liczba zmiennoprzecinkowa)
    imię opiekuna (ciąg znaków)

  Klasa ta powinna też mieć jedną metodę o nazwie przedstawSie. Metoda ta nie przyjmuje żadnych argumentów i zwraca
        ciąg znaków, który jest zdaniem zawierającym imię kotka, jego datę urodzenia, wagę oraz imię opiekuna.
   */


public class Kot extends Zwierze{
    private final String imie;
    private final LocalDate dataUrodzenia;
    public Double waga;
    public String imieOpiekuna;


    public Kot(final String imie, final LocalDate dataUrodzenia,final Double waga, final String imieOpiekuna) {
        super(0.0, false);//trzeba utworzyć bo Kot dziedziczy po Zwierze
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;

    }

         public Kot(final Double wzrost, final boolean czyMaSiersc, final String imie, final LocalDate dataUrodzenia,
        final Double waga, final String imieOpiekuna) {
             super(wzrost, czyMaSiersc); //trzeba utworzyć bo Kot dziedziczy po Zwierze
             this.imie = imie;
             this.dataUrodzenia = dataUrodzenia;
             this.waga = waga;
             this.imieOpiekuna = imieOpiekuna;
    }

        public String getImie() {
            return imie;
        }
        public LocalDate getDataUrodzenia() {
            return dataUrodzenia;
        }
        public Double getWaga () {
            return waga;
        }
        public String getImieOpiekuna () {
            return imieOpiekuna;
        }
    public Kot() {
        super(null, true);
        imie = "";
        dataUrodzenia = LocalDate.now();
    }

    public Kot convertFromFile(String rowInFile) {
        String[] tablicaPliku = rowInFile.split(",");
        DateConverter dateConverter = new DateConverter();
        LocalDate dataUrodzenia = null;
        try {
            dataUrodzenia = dateConverter.stringToDate(tablicaPliku[2]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return new Kot(
                Double.valueOf(tablicaPliku[5]), Boolean.parseBoolean(tablicaPliku[6]), tablicaPliku[1],
                dataUrodzenia, Double.valueOf(tablicaPliku[3]), tablicaPliku[4]
        );
    }

    /*
    public void setWaga(Double waga) {
        this.waga = waga;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }

     */


    public String przedstawSie() {
        /*List<String> list = new ArrayList<>();
        list.add("kot1");
        Kot kot = new Kot()
 */
        return "Jestem kot. Na imię mam: " + this.imie + ", moja data ur.: "+ this.dataUrodzenia + ", waga: "+ this.waga
                + ". Mój opiekun to: " + this.imieOpiekuna;
//        return "Na imię mam: " + getImie() + "moja data ur.: "+ getDataUrodzenia() + "waga: "+ getWaga()
//                + "Mój opiekun to: " + getImieOpiekuna();


            //System.out.println("Na imię mam: " + getImie() + "moja data ur.: "+ getDataUrodzenia() + "waga: "+ getWaga()
            //        + "Mój opiekun to: " + getImieOpiekuna());

        }
    @Override
    public String dajGlos() {
        return "Miauuuuu";
    }

}

