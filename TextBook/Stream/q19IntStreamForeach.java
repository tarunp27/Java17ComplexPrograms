package TextBook.Stream;

import java.util.stream.IntStream;

public class q19IntStreamForeach {
    public static void main(String[] args) {
        IntStream.range(1, 6)
                .forEach(System.out::println);
    }
}
