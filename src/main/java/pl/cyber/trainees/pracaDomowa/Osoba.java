package pl.cyber.trainees.pracaDomowa;

public class Osoba {

        public Integer wiek;
        public String imie;

    public Osoba(int w, String imie2) {
        wiek = w;
        imie = imie2;

    }

    public Integer getWiek() {
       // System.out.println("Twój wiek to: " + wiek);
            return wiek;
        }

        public String getImie() {
        // System.out.println("Twoje imię to: " + imie); LEPIEJ SOUT TYLKO W KLASIE URUCHOMIENIOWEJ NIŻ TU GDZIE GETWIEK
            return imie;
        }



    }


