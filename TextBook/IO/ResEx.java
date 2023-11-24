package TextBook.IO;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResEx {
    public static void main(String[] args) {
        var p3 = Path.of("/pets/../cat.txt");
        var p4 = Paths.get("./dog.txt");
        System.out.println(p4.resolve(p3));
        var p1 = Path.of("/lizard",".").resolve(Path.of("walking.txt"));
        var p2 = new File("/lizard/././actions/../walking.txt").toPath();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.normalize());
        System.out.println(p2.normalize());
    }
}
