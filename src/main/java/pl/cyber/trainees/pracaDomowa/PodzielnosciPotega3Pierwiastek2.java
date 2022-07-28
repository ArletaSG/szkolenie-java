package pl.cyber.trainees.pracaDomowa;


public class PodzielnosciPotega3Pierwiastek2 {
    public static boolean podzielnaPrzez2(Double liczba) {
        if (liczba % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean podzielnaPrzez3i5(Double liczba) {
        return liczba % 3 == 0 && liczba % 5 == 0;
    }

    public static Double doPotegiTrzeciej(Double liczba) {
        return Math.pow(liczba, 3);
    }

    public static Double pierwiastekKwadratowy(Double liczba) {
        return Math.sqrt(liczba);
    }

}

