package pl.cyber.trainees.spotkania;

public class Petle {

    public void wyswietlOd1Do100() {
        // for (int i = 0; i < 100; i++) {

        //    System.out.print(i + 1);
        //    System.out.print(", ");

        //} L UB
        for (int i = 1; i<=100; i++){
            if(i < 100) {
                System.out.print(i + ",");
            } else {
                System.out.print(i + ".");
            }
        }
    }
}
