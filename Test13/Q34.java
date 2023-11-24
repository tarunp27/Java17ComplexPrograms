package Test13;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q34 {
    public static void main(String[] args) {
        Path p = Paths.get("c:\\temp\\out");
        File f = new File("c:\\temp\\out");
        try {
            var c = f.delete();
            var b = Files.deleteIfExists(p);
            System.out.println(b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
