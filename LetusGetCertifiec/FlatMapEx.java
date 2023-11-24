package LetusGetCertifiec;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapEx {
    public static void main(String[] args) {
        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.forEach(x-> System.out.println(x));
        System.out.println("--------after flat map-------------");
        Stream<List<String>> animals2 = Stream.of(zero, one, two);
        animals2.flatMap(x->x.stream()).forEach(x-> System.out.println(x));
    }
}
