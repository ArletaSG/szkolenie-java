package pl.cyber.trainees.wyjasnienia.bankomat;

import java.util.Scanner;

public class BankomatProsty {
    private Integer stanKonta;

    public BankomatProsty(){
        stanKonta = 0;
    }

    private void wplacGotowke() {
        Integer wplata;
        System.out.println("Ile chcesz wpłacić gotówki (kwota może zawierać tylko banknoty " +
                "10, 20, 50, 100, 200, 500 zł)");
        Scanner scan = new Scanner(System.in);
        wplata = scan.nextInt();
        if (wplata == 10 || wplata == 20 || wplata == 50 || wplata == 100 || wplata == 200 || wplata == 500) {
            stanKonta = stanKonta + wplata;
            System.out.println("Aktualny stan konta po wpłacie wynosi: " + stanKonta );
            uruchom();
        }
        else {
            System.out.println("Zła wartość banknotu. Spróbuj jeszcze raz. Menu poczatkowe...");
            uruchom();
        }

    }
    private void wyplacGotowke() {
        Integer wyplata;
        System.out.println("Ile chcesz wypłacić gotówki (kwota może zawierać tylko banknoty " +
                "10, 20, 50, 100, 200, 500 zł)");
        Scanner scan = new Scanner(System.in);
        wyplata = scan.nextInt();
        if (wyplata == 10 || wyplata == 20 || wyplata == 50 || wyplata == 100 || wyplata == 200 || wyplata == 500) {
            if (wyplata <= stanKonta) {
                stanKonta = stanKonta - wyplata;
                System.out.println("Aktualny stan konta po wypłacie wynosi: " + stanKonta);
            } else {
                System.out.println("Niewystarczająca ilość gotówki");
            }
        } else {
            System.out.println("Zła wartość banknotu. Spróbuj jeszcze raz. Menu poczatkowe...");
        }
        uruchom();
    }
    private void sprawdzanieStanuKonta () { // z return musi być private Integer sprawdzanieStanuKonta()
       System.out.println("Aktualny stan konta: " + stanKonta);
        //return stanKonta; jak zmienić???
        uruchom();
    }
    public void uruchom() {
        System.out.println("Wciśnij odpowiednią literę: ");
        System.out.println("1 -->Wpłata ");
        System.out.println("2 -->Wypłata");
        System.out.println("3 -->Sprawdzenie stanu konta");
        System.out.println("4 -->Przewij operację");

        Integer menu;
        Scanner scan = new Scanner(System.in);
        menu = scan.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Wpłacasz");
                wplacGotowke();
                break;
            case 2:
                System.out.println("Wypłacasz");
                wyplacGotowke();
                break;
            case 3:
                System.out.println("Sprawdzasz stan konta");
                sprawdzanieStanuKonta();
                break;
            case 4:
                System.out.println("Dziękuję, zapraszamy ponownie");
                break;
            default:
                System.out.println("Nie rozpoznaję, wybierz 1, 2, 3, 4 - zgodnie z menu");
        }
    }
}

