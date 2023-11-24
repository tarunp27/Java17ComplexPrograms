package Test8;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q2_relativize {
    public static void main(String[] args) {
        Path p1 = Paths.get("photos/goa");
        Path p2 = Paths.get("/index.html");
        System.out.println(p2.getRoot());
//        Path p3 = p1.relativize(p2);
//        System.out.println(p3);
    }
}
