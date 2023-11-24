package TextBook.IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Q23walk {
    public static void main(String[] args) throws IOException {
        System.out.println("Q23Walk");
        var x = Path.of("c:\\users\\Tarun\\Practice\\src1\\");
        System.out.println(x.toRealPath().getParent());
        Files.walk(x.toRealPath().getParent()) // u1
                .map(p -> p.toAbsolutePath().toString()) // u2
                .filter(s -> s.endsWith(".java"))
                .forEach(System.out::println);
    }
}
