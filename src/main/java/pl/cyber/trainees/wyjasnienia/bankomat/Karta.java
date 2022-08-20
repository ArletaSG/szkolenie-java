package pl.cyber.trainees.wyjasnienia.bankomat;

public class Karta {

    private final Integer nrKarty;
    private final Integer pinKarty;
    private Integer saldo;

    public Karta(final Integer nrKarty, final Integer pinKarty, final Integer saldo) {
        this.nrKarty = nrKarty;
        this.pinKarty = pinKarty;
        this.saldo = saldo;
    }

    public Integer getNrKarty() { //za konstruktorem
        return nrKarty;
    }

    public void sprawdzNrPin(final Integer pinKarty) { //samo po alt+Enter
        if(!this.pinKarty.equals(pinKarty)) {
            throw new KartaException("Niepoprawny pin dla karty");
        }
    }

    public void wplacGotowke(final Integer kwota) {
        this.saldo += kwota;


    }

    public void sprawdzWyplate(final Integer kwota) {
        if (this.saldo - kwota < 0) {
            throw new KartaException("Niewystarczająca ilość środków na karcie");
        }

    }

    public void wyplacGotowke(final Integer kwota) {
        this.saldo -= kwota;
    }


    public Integer stanKonta() {
        return this.saldo;

    }
}
