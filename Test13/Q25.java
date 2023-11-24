package Test13;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q25 {
    public static void main(String[] args) throws IOException {
        var p1 = Paths.get("c:\\temp\\test1.txt");
        var p2 = Paths.get("c:\\temp\\test2.txt");
        var p3 =  p1.relativize(Path.of("c:\\temp\\test2.txt"));
        System.out.println(p3);
        p1.resolveSibling("test2.txt");
        var bw = new BufferedWriter(new FileWriter(p3.toFile()));
        bw.write("hello");
        bw.close();
    }
}
