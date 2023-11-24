package Chapter1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class q13_Period {
    public static void main(String[] args) {
        var waffleDay = LocalDate.of(2022, Month.MARCH, 25);
         var period = Period.of(1, 6, 3);
         var later = waffleDay.plus(period);
         later.plusDays(1);
         System.out.println(later);
         var thisOne = LocalDate.of(2023, Month.SEPTEMBER, 28);
         var thatOne = LocalDate.of(2023, Month.SEPTEMBER, 29);
         System.out.println(later.isBefore(thisOne) + " "
                 + later.isBefore(thatOne));
    }
}
