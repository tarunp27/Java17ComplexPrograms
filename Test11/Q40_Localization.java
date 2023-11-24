package Test11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q40_Localization {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("eeee");
        LocalDate d =  LocalDate.of(2022,12,20);
        System.out.println(df.format(d));
    }
}
