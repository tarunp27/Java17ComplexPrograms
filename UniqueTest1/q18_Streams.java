package UniqueTest1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class q18_Streams {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("a","b","c");
        String str =s.collect(Collectors.joining(",","-","+"));
        System.out.println(str);
    }
}
