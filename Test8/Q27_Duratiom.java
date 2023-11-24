package Test8;

import java.time.Duration;

public class Q27_Duratiom {
    public static void main(String[] args) {
        Duration d = Duration.ofMillis(1100);
        System.out.println(d);
        d = Duration.ofMinutes(61);
        System.out.println(d);
        d = Duration.ofDays(2);
        System.out.println(d);
        d = Duration.ofHours(48);
        System.out.println(d);
        d = Duration.ofDays(789);
        System.out.println(d);
        d = Duration.ofSeconds(20,5000000);
        System.out.println(d);
    }
}
