package LetusGetCertifiec;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Q72 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.of(9,30);
        LocalTime gameStart = LocalTime.of(10, 15);
        long timeConsumed = 0;
        long timeToStart = 0;

        if (now.isAfter(gameStart)) {
            timeConsumed = gameStart.until(now, ChronoUnit.MINUTES);
        } else {
            timeToStart = now.until(gameStart, ChronoUnit.MINUTES);
        }
        System.out.println(timeToStart + " " + timeConsumed);
    }
}
