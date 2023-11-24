package UniqueTest1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q6 {
    public static void main(String[] args) {
        LocalDateTime greatDay = LocalDateTime.parse("2022-01-01T15:33:33");//2
        String greatDayStr = greatDay.format(DateTimeFormatter.ISO_DATE_TIME); //3
        System.out.println(greatDayStr);//4
    }
}
