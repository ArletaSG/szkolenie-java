package pl.cyber.trainees.wyjasnienia.zwierzeta;

import pl.cyber.trainees.wyjasnienia.DateConverter;

import java.text.ParseException;
import java.time.LocalDate;

public class Pies extends pl.cyber.trainees.wyjasnienia.zwierzeta.Zwierze {

    private final String imie;
    private final LocalDate dataUrodzenia;
    public Double waga;
    public String imieOpiekuna;

    public Pies(final Double wzrost, final boolean czyMaSiersc, final String imie, final LocalDate dataUrodzenia, final Double waga, final String imieOpiekuna) {
        super(wzrost, czyMaSiersc);
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }

    public Pies() {
        super(null, false);
        imie = "";
        dataUrodzenia = LocalDate.now();
    }


    public String przedstawSie() {
        return "Jestem pies. Na imię mam: " + this.imie + ", moja data ur.: " + this.dataUrodzenia + ", waga: " + this.waga
                + ". Mój opiekun to: " + this.imieOpiekuna;
    }

    @Override
    public String dajGlos() {
        return "Hau!";
    }

    public Pies convertFromFile(String rowInFile) {
        String[] tablicaPliku = rowInFile.split(",");
        DateConverter dateConverter = new DateConverter();
        LocalDate dataUrodzenia = null;
        try {
            dataUrodzenia = dateConverter.stringToDate(tablicaPliku[2]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return new Pies(
                Double.valueOf(tablicaPliku[5]), Boolean.parseBoolean(tablicaPliku[6]), tablicaPliku[1],
                dataUrodzenia, Double.valueOf(tablicaPliku[3]), tablicaPliku[4]
        );
    }
}

