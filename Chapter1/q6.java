package Chapter1;

import java.time.LocalDate;
import java.time.Month;

public class q6 {
    public static void main(String[] args) {
        int meal = 5;
        int tip = 2;
        var total = meal + (meal>6 ? tip++ : tip--);
        System.out.println(total);

        int year = 1874;
        Month month = Month.MARCH;
        int day = 24;
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.isBefore(LocalDate.now()));
    }
}
