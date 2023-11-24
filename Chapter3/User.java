package Chapter3;

import java.time.*;
import java.time.temporal.*;
public record User(LocalDate creationDate) {
    static LocalDate today = LocalDate.now();
    static LocalDate yesterday = LocalDate.now()
            .minus(1, ChronoUnit.DAYS);

    public User {
        creationDate = yesterday;
        creationDate = yesterday;
    }
    public static void main(String[] p) {
        var u = new User(yesterday);
        System.out.print(u.creationDate());
    } }