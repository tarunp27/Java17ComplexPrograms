package LetusGetCertifiec;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class q52 {
    public static void main(String[] args) {
        String s1 = new String("Tarun");
        String sx = s1;
        String s2 = s1.intern();
        String s3 = "Tarun";
        System.out.println(s1==s2);
        System.out.println(s1==sx);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
    }
}
