package pl.cyber.trainees.dziedziczenie;

public class Model extends Pojazd {

    private String nazwa;
    private Integer przebieg;
    private Double pojemnoscSilnika;
    private Kolor kolor;

    public Model(){
        super();
        this.nazwa = "";
        this.przebieg = 0;
        this.pojemnoscSilnika = 0.0;
        this.kolor = null;
    }

    public Model(String marka, String rocznik,
                 String naped, String nazwa,
                 Integer przebieg, Double pojemnoscSilnika,
                 Kolor kolor) {
        super(marka, rocznik, naped);
        this.nazwa = nazwa;
        this.przebieg = przebieg;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.kolor = kolor;
    }
    @Override
    public String toString() {
        return " Marka: " + getMarka()
                + " rocznik: " + getRocznik()
                + " napęd: " + getNaped()
                + "nazwa modelu: " +this.nazwa
                + "przebieg: " +this.przebieg
                + "pojemnoscSilnika: " +this.pojemnoscSilnika
                + "kolor: " +this.kolor;

    }

    public Double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public Integer getPrzebieg() {
        return przebieg;
    }

    public Kolor getKolor() {
        return kolor;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setPojemnoscSilnika(Double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public void setPrzebieg(Integer przebieg) {
        this.przebieg = przebieg;
    }

    public void setKolor(Kolor kolor) {
        this.kolor = kolor;
    }
}
