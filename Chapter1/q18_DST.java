package Chapter1;

import java.time.*;

public class q18_DST {
    public static void main(String[] args) {
        var localDate = LocalDate.of(2022, Month.NOVEMBER, 6);
        var localTime = LocalTime.of(1, 0);
        var zone = ZoneId.of("America/New_York");
        var z = ZonedDateTime.of(localDate, localTime, zone);
        var offset = z.getOffset();
        for (int i = 0; i < 6; i++)
           z= z.plusHours(1);
        System.out.print(z.getHour() + " "
                + offset.equals(z.getOffset()));
    }
}
