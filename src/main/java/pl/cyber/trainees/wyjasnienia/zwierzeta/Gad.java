package pl.cyber.trainees.wyjasnienia.zwierzeta;

import pl.cyber.trainees.wyjasnienia.DateConverter;

import java.text.ParseException;
import java.time.LocalDate;


public class Gad extends Zwierze {
    private final String imie;
    private final LocalDate dataUrodzenia;
    public Double waga;
    public String imieOpiekuna;


    public Gad(final String imie, final LocalDate dataUrodzenia, final Double waga, final String imieOpiekuna) {
        super(0.0, false);
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;

    }
    public Gad(final Double wzrost, final boolean czyMaSiersc, final String imie, final LocalDate dataUrodzenia,
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

    public Double getWaga() {
        return waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public Gad() {
        super(null, true);
        imie = "";
        dataUrodzenia = LocalDate.now();
    }
    @Override
    public String dajGlos() {
        return "Ssssss... albo bez odgłosu";
    }
    public Gad convertFromFile(String rowInFile) {
        String[] tablicaPliku = rowInFile.split(",");
        DateConverter dateConverter = new DateConverter();
        LocalDate dataUrodzenia = null;
        try {
            dataUrodzenia = dateConverter.stringToDate(tablicaPliku[2]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return new Gad(Double.valueOf(tablicaPliku[5]), Boolean.parseBoolean(tablicaPliku[6]), tablicaPliku[1],
                dataUrodzenia, Double.valueOf(tablicaPliku[3]), tablicaPliku[4]);
    }
    public String przedstawSie() {

        return "Jestem gadem. Na imię mam: " + this.imie + ", moja data ur.: "+ this.dataUrodzenia + ", waga: "+ this.waga
                + ". Mój opiekun to: " + this.imieOpiekuna;

    }
}



