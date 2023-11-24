package Test8;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Localization_Ex {
    public static void main(String[] args) {
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        LocalDate dt = LocalDate.of(1999, Month.OCTOBER,22);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd',since' yyy");
        System.out.println(f.format(dt));

        LocalDateTime d = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("'New! 'y',yay!,'hh:mm");
        System.out.println(d.format(df));

        var us = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(us.format(attendeesPerYear));
    }
}
