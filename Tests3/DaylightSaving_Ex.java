package Tests3;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DaylightSaving_Ex {
    public static void main(String[] args) {
        LocalDateTime ld1 = LocalDateTime.of(2022, Month.NOVEMBER, 6, 2, 0);
        ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
        LocalDateTime ld2 = LocalDateTime.of(2022, Month.NOVEMBER, 6, 1, 0);
        ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
        long x = ChronoUnit.HOURS.between(zd1, zd2);
        System.out.println(x);

        LocalDateTime ld3 = LocalDateTime.of(2022,Month.MARCH,13,4,0);
        ZonedDateTime zd3 = ZonedDateTime.of(ld3, ZoneId.of("US/Eastern"));
        LocalDateTime ld4 = LocalDateTime.of(2022,Month.MARCH,13,1,59);
        ZonedDateTime zd4 = ZonedDateTime.of(ld4, ZoneId.of("US/Eastern"));
        long y = ChronoUnit.HOURS.between(zd3,zd4);
        System.out.println(y);

    }
}
