package pl.cyber.trainees;

public class Divide {
    int x;
    int y;
    int dzielenie;
    Divide(int arg1, int arg2)
    {
        x=arg1;
        y=arg2;
        if (y == 0) {
            System.out.println("Nie dzielimy przez zero! Wybierz inny dzielnik");
        }
        else {
            dzielenie = x / y;
            System.out.println("Dzielenie wynosi: " + dzielenie);
        }
    }
}