package ChapterIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WalkRose {

    public static void main(String... thorns) throws
            Exception {
        new WalkRose().tendGarden(Paths.get(thorns[0]));
    }

    public void tendGarden(Path p) throws Exception {
        Files.walk(p, 1)
//                .map(q -> q.toRealPath())
                .forEach(System.out::println);
    }
}
