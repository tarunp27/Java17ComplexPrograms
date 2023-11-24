package ChapterIO;

import java.io.IOException;
import java.nio.file.Path;

public class ResolveEx {
    public static void main(String[] args) throws IOException {
        Path p = Path.of("/", "objC", "bin");
        System.out.print(p.resolve("../../java/Sort.java").toRealPath());
    }
}
