package LetusGetCertifiec;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Q71_DnT {
    public static void main(String[] args) {
        Duration d = Duration.of(120005, ChronoUnit.SECONDS);
        System.out.println(d);
        d= Duration.of(61,ChronoUnit.SECONDS);
        System.out.println(d);

        Duration  d2 = Duration.ofMillis(10000);
        System.out.println(d2);

        Duration d3 = Duration.ofDays(3).plusSeconds(500);
        Duration d4 = Duration.ofDays(3).negated();
        Duration d5 = Duration.ofDays(2).withSeconds(61);
        Duration d6 = Duration.ofNanos(33333);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);

        Period p1 = Period.ofDays(400);
        System.out.println(p1);


    }
}
