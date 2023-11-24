package Test8;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class NumberFormatEx {
    public static void main(String[] args) {
        var l = 228822.5;
        //NumberFormat f = new DecimalFormat("000,000,000.0");
        NumberFormat f = new DecimalFormat("###,###,###.0");
        System.out.println(f.format(l));
        LocalDate date = LocalDate.of(2022, Month.DECEMBER, 7);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(date.getDayOfYear());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
    }
}
