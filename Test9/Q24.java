package Test9;

import java.util.stream.Stream;

public class Q24 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Sarah Adams", "Suzy Pinnell", "Paul Basgall");
        names.map(s -> s.split(" ")[1]).forEach(s-> System.out.println(s));
    }
}
