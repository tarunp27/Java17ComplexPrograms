package TextBook.ExceptionLocalization;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class q16FormatPattern {
    public static void main(String[] args) {
//        var f = DateTimeFormatter.ofPattern("hh o'clock");
        var f = DateTimeFormatter.ofPattern("hh 'o''clock'");
        System.out.println(f.format(ZonedDateTime.now()));
    }
}
