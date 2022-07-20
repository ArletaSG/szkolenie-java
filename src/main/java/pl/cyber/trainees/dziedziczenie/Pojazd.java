package pl.cyber.trainees.dziedziczenie;

public class Pojazd {
    private String marka;
    private String rocznik;
    private String naped;
    public Pojazd(){
        marka = "";
        rocznik = "";
        naped = "";
    }

    public Pojazd(String marka, String rocznik, String naped) {
        this.marka = marka;
        this.rocznik = rocznik;
        this.naped = naped;
    }
    public String toString(){
        return " Marka: " + this.marka
                + " rocznik: " + this.rocznik
                + " napęd: " + this.naped;
    }
    public String getMarka(){
        return marka;
    }
    public String getRocznik(){
        return rocznik;
    }
    public String getNaped(){
        return naped;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setRocznik(String rocznik) {
        this.rocznik = rocznik;
    }

    public void setNaped(String naped) {
        this.naped = naped;
    }
}

