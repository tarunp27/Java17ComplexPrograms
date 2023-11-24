package LetusGetCertifiec;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Q295SWITCH {
    public static void main(String[] args) {
        int x = 3;
        final var y = 8;
        switch (y) {
            case 8:
                System.out.println("BIG");
                break;
            case y + 1:
                System.out.println("SMALL");
            default:
                System.out.println("CORRECT");
                break;
        }

        Path p1 = Paths.get("c:\\User\\..\\..\\temp\\test.txt");
        System.out.println(p1.normalize());

        System.out.println("".isEmpty());
        System.out.println("".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());
        System.out.println("A".isEmpty());
        System.out.println("A".isBlank());

        List s1 = new ArrayList();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        List s2 = new ArrayList(s1.subList(1,2));
        s1.addAll(s2);
        System.out.println(s1);
    }
}
