package LetusGetCertifiec;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q98 {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("a", "b");
        List<String> l2 = Arrays.asList("1", "2");
        Stream.of(l1, l2).flatMap((x)->Stream.of(x)).forEach((x)->System.out.println(x));
        Stream.of(l1, l2).flatMap((x)->x.stream()).forEach((x)->System.out.print(x+" "));


    }
}
