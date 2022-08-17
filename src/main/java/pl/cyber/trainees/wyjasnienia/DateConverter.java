package pl.cyber.trainees.wyjasnienia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

public class DateConverter {

    public LocalDate stringToDate(String date) throws ParseException {
        var dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        //ewentualnie można zastosować DateTimeFormatter, ale prawdopodobnie należy użyć specjalistycznej biblioteki

        return LocalDate.ofInstant(dateFormat.parse(date).toInstant(), ZoneId.of("Europe/Warsaw")); //podkreśla parse, bo wyjątek ParseException
    }


}
