package pl.cyber.trainees.wyjasnienia.bankomat;

public class Bankomat {

    private Integer saldo;

    public Bankomat() {
        this.saldo = 0;
    }


    public Integer stanKonta() {
        return this.saldo;
    }

    public void wplacGotowke(final Integer kwota) {
       //rozpisane, ale to samo byłoby this.saldo = this.saldo + kwota;
        this.saldo += kwota; //w skrócie
    }

    public void sprawdzWyplate(final Integer kwota) {
        if (this.saldo - kwota < 0) {
            throw new StanKontaBankomatuException("Niewystarczająca ilość środków w bankomacie");
        }
    }

    public void wyplacGotowke(final Integer kwota) {
        this.saldo -= kwota;
    }
}

