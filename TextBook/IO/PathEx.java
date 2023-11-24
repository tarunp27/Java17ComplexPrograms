package TextBook.IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PathEx {
    public static void main(String[] args) throws IOException {
        File f = new File("/home/parrot");
        System.out.println(f.isAbsolute());
        Path p = Paths.get("C:\\Users\\tarun\\fox\\food-scehdule.csv.txt");
        PathEx ps = new PathEx();
        ps.printData(p);
    }
    void printData(Path path) throws IOException {
        Files.lines(path) // r1
                .flatMap(p ->
                        Stream.of(p.split(","))) // r2
                .map(q ->
                        q.toUpperCase()) // r3
                .forEach(System.out::println);
    }
}
