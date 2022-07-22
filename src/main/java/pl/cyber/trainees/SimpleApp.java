//1. Konstrukcja klas i metod

package pl.cyber.trainees; //określenie pakietu w ramach projektu, gdzie znajduje się nasza klasa

// pole package ustawia się automatycznie jeśli nasz plik zawiera się w odpowiednim strukturze
//katalogów tj. src/main/java/...
//w naszym przykładzie src/main/java/pl.cyber.trainees   TO jest potrzebne do modyfikataorów dostępu (public, private/protected i difault)

//region miejsca ba importy
//tu można wrzucać i zwijać
import java.io.File; //importy zazwyczaj dodają się same, ewent. można je dodać poprzez CTRL+Enter
                     // poprzez importy powinniśmy rozumieć użycie dodatkowych bibliotek w naszej klasie
import java.math.*;  //  z * mówimy, że chcemy zaimportowac wszystkie biblioteki w ramach pakietu (package) w tym java.math
                     // jak usunuemy * to można zaiportować BigDecimal RoundingMode i inne, z * wszystkie
//endregion

public class SimpleApp {
    public static void main(String[] args) {
    }


}