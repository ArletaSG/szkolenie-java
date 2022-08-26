package pl.cyber.trainees.wyjasnienia.bankomat

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

//klasa testowa musi rozszerzać klasę specyfikacji z pakietu spock.lang

class KartaSpec extends Specification { //może być bez modyfikatora dostępu public/private... i rozszerza Specification

    private Karta underTest
//deklaracja zmiennych
    static def nrKartyStub = 12345678 //dwa sposoby na deklarację zmiennych, częściej to niż drugi sposób
    @Shared // bez tego przy mockowaniu nie może być tej samej zmiennej, propagujemy zmienną dla całej klasy testowej czy modułach czy mockowania
    def pinKartyStub = 1234 //ta linijka i ta powyżej to drugi sposób, @sahred z akietu spock.lang
    static def saldoStub = 0

    //metoda startowa/modul
    void  setup() { //przysłonięcie metoda spocka, ma za zadanie ustawić pewne parametry, które maja być z góry założone
       // underTest = new Karta(1214, 123, 12)    //tu niepotrzebne, normalnie nowe obiekty do testowania tak deklarujemy
    }

    //definiujemy metodę testową, w "" co sprawdza
    def "Subject" () {
        //ddeklaracja sekcji testowej given/when/then do datkowo jest where
        given: // sekcja w której jest np. mokowanie obiektów, inicjalizacja zmiennych lokalnych dla przypadku testowego
        //sekcja given jest sekcją nieobowiązkową


        when: //sekcja, w której wykonujemy nasz przypadek testowy i zazwyczaj powinniśmy deklarować w tym miejscu
        //parametr, który będzie naszym wynikiem
            def result = "test"
            printf(result)

        then: //sekcja, w której weryfikujemy nasze założenia w ramach przpadku testowego
        noExceptionThrown() // metoda, którą stosuję zawsze, jeśli mój przypadek testowy nie powinien rzucać Exception'a
        result == "test"
        /*where: sekcja, w któej będziemy deklarowali wiele parametrów WE oraz przewidywane ich wyniki
        ------------------------------------------------------
        struktura:
        where:
        parametr1 | parametr2 ||sekcja wyników np. wynikParam1
        1234      | 15432     || 988734
         */
    }

        def "Przykład nie związany z obiektem Karta"() {
            //nie może być dwóch takich samych trzeba zmienić nazwę
            given:
                def zmienna1 = 2
                def zmienna2 = 5

            when:
                def result = zmienna1 + zmienna2 //zwróci nam integer,
                printf(result as String) //jak inny typ, to zastosować metodę, która ma zadanie wyświetlenie wartości na konsolę
            //as String -> przez określenie as String mówimy, że nasz wynik ma być cast'owany na String

            then:
            noExceptionThrown()
                result != null //sprawdzać, żeby nie było null
                result == 7

        }



    @Unroll
//gdyby w drzewach na dole przy Run nie pokazało wszystkich testów, tylko jeden, to dodaje się @Unroll
    //pozwala na rozbicie na oknie 'Run' przypadku testowego na oddzielne testy
    def "Przykład nie związany z obiektem Karta z wykorzystaniem where"() {
        when:

        def result = zmienna1+zmienna2

        then:
        noExceptionThrown()
        result == expectedResult

        where:
        zmienna1 | zmienna2 || expectedResult
        1        | 1        || 2
        10       | 100      || 110
        -10      | 10       || 0
        -100     | -100     || -200

    }

    def "Powinien prawidłowo utworzyć obiekt Karta przez konstruktor oraz zweryfikować jego parametry" () { //nie może być dwóch takich samych trzeba zmienić nazwę
        when:
        def result = new Karta(nrKartyStub, pinKartyStub, saldoStub)



        then:
        noExceptionThrown()
        result != null
        result.nrKarty == nrKartyStub //o ile jest getter w klasie Karty z tego
        //result.getNrKarty()
        result.pinKarty == pinKartyStub
        result.saldo == saldoStub

    }

    def "Powinien prawidłowo utworzyć obiekt Karta przez konstruktor oraz zweryfikować czy użytkownik podał nr PIN. Happy Path" () {
        given:
        def pinFromUser = 1234
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)

        when:
        underTest.sprawdzNrPin(pinFromUser)

        then:
        noExceptionThrown()

    }

    def "Powinien prawidłowo utworzyć obiekt Karta przez konstruktor oraz zweryfikować czy użytkownik podał nr PIN. not Happy Path" () {
        given:
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)

        when:
        underTest.sprawdzNrPin(pinFromUser)

        then:
        def error = thrown(expected)
        error.message == expectedMessage

        where:
        pinFromUser || expected         | expectedMessage
        8888        || KartaException   | "Niepoprawny pin dla karty" //tu musi być identyczny komentarz jak w klasie Karta nie może się różnić nawet kropką ani innym znakiem
        999         || KartaException   | "Niepoprawny pin dla karty" // tzw. KartaExpection
        1010        || KartaException   | "Niepoprawny pin dla karty"
        7567        || KartaException   | "Niepoprawny pin dla karty"

    }

    def "Powinno wyświetlić saldo karty"() {
        given:
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)

        when:

        def result = underTest.stanKonta()

        then:
        noExceptionThrown()
        result == saldoStub
    }

    def "Powinno wpłacić oraz wypłacić gotówkę następnie wyświetlić saldo karty"() {
        given:
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)

        when:

        underTest.wplacGotowke(100)
        underTest.wyplacGotowke(100)// komentarz pod w //
        def result = underTest.stanKonta()

        then:
        noExceptionThrown()
        result == saldoStub
    }

    def "Powinno wpłacić gotówkę następnie wyświetlić saldo karty"() {
        given:
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)

        when:

        underTest.wplacGotowke(100)
        def result = underTest.stanKonta()

        then:
        noExceptionThrown()
        result == 100
    }

//    underTest.wplacGotowke(100)
//       // underTest.wyplacGotowke(100) można dwa w jednym albo w osobnych
//        def result = underTest.stanKonta() //musi być def bo jest Integer
//
//        then:
//        noExceptionThrown()
//        result == saldoStub
    }




//prosta klasa testowa

