package Test4;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q23_io {
    public static void main(String[] args) {
        Path p1 = Paths.get("c:\\personal\\.\\photos\\..\\readme.txt");
        System.out.println(p1.normalize());
    }
}
