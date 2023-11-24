package TextBook.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Q5Average {
    public static void main(String[] args) {
        double result =
//        TreeSet<Integer> set =
                LongStream.of(6L, 8L, 10L)
                        .mapToInt(x -> (int) x)
                        .boxed()
                        .collect(Collectors.groupingBy(x ->
                                x, Collectors.toSet()))
                        .keySet()
//                .values()
                        .stream()
//                        .collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(set);
                        .collect(Collectors.averagingInt(x ->
                                x));
        System.out.println(result);


        Collection<List<Integer>> result2 = LongStream.of(6L, 8L, 10L, 6L, 8L, 6L)
                .mapToInt(x ->
                        (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toList())).values();
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x ->
//                        x));
        result2.forEach(x -> System.out.println(x));


        double result3 =
                LongStream.of(6L, 8L, 10L)
                        .mapToInt(x -> (int) x).average().getAsDouble();

        System.out.println(result3);

    }
}
