package UT4;

import java.nio.charset.StandardCharsets;

public class Q16 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("12345678");
        System.out.println(sb.length());
        sb.setLength(5);
        sb.setLength(10);
        sb.setLength(20);
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
