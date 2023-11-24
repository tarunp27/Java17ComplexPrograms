package UT3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Q44DateFormat {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);
        ZonedDateTime dateTime = ZonedDateTime.now();

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(2022, 1, 20,
                6, 15, 30, 200, zone);

        var dateTime1 = LocalDateTime.of(2022, 12, 20, 6, 15, 30);
        var dateTime2 = LocalDateTime.of(date, time);

// Formating the date

        System.out.println(DateTimeFormatter.ISO_ZONED_DATE_TIME.format(dateTime));
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

        var dtfm = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        var res1 = dt.format(dtfm);

// formatter using pattern
        System.out.println(res1);
        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        var result1 = f.format(dateTime1);  // use formatter object
        var result2 = dateTime1.format(f);  // use date object

        Map m = new HashMap();
//        Map<Object, ? super ArrayList> m = new LinkedHashMap<Object, ArrayList>();
//        Map<Object, ?> m = new LinkedHashMap<Object, Object>();


        m.put("1", new ArrayList());
        m.put(1, new Object());
        m.put(1.0, "Hello");





//        List<? super CharSequence> lst = new ArrayList<>();
//        lst.add("Mala");
//        lst.forEach(System.out::println);
    }
}
