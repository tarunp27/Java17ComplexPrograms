package TextBook.IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Q21Find {
    public static void main(String[] args) {
        var f = Path.of("/users/Tarun/Practice");
        try (var m =
                     Files.find(f, 3, (p, a) ->
                             !(a.isSymbolicLink()))) { // y1
            m.map(s -> s.toString())
                    .collect(Collectors.toList())
                    .stream()
                    .filter(s -> s.toString().endsWith(".java")) // y2
                    //.count();
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
