package TextBook.Stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q11map {
    public static void main(String[] args) {
        var str= Stream.iterate(1, x -> x++)
                .limit(5).map(x -> ""+x)
                .collect(Collectors.joining());
        System.out.println(str);
    }
}
