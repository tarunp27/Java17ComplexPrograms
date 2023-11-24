package Chapter1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Countdown {
    public static void main(String[] args) {

        var builder = "54321";
         builder = builder.substring(3);
        System.out.println(builder);
        // System.out.println(builder.charAt(2));



        int[] a = { 'h', 'e', 'l'};
        int[] b = { 'h', 'e', 'l', 'l', 'o','e'};

        int x = Arrays.compare(a, b);
        int y = Arrays.mismatch(a, b);
        System.out.println(x+" "+y);

    }
}


