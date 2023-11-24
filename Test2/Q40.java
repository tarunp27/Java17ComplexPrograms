package Test2;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Q40 {
    public static void main(String[] args) {
        var nums = List.of(1, 2, 3, 4, 5, 6, 7).stream();
        Predicate<Integer> p = a -> a < 0;
        Optional<Integer> value = nums.filter(p).reduce((a, b) -> a + b);
        value.ifPresent(System.out::println);
    }
}
