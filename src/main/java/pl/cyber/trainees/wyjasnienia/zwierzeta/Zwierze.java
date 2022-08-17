package pl.cyber.trainees.wyjasnienia.zwierzeta;

public class Zwierze {

    final Double wzrost;

    final boolean czyMaSiersc;

    public Zwierze(Double wzrost, boolean czyMaSiersc) {
        this.wzrost = wzrost;
        this.czyMaSiersc = czyMaSiersc;
    }

    public Double getWzrost() {
        return wzrost;
    }

    public boolean isCzyMaSiersc() {
        return czyMaSiersc;
    }
    public String dajGlos() {
        return ""; //bo nie wiemy jakie to zwierzę
    }

}
