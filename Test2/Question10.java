package Test2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question10 {
    public static void main(String[] args) {

        IntStream is1 = IntStream.range(1, 3);
        IntStream is2 = IntStream.rangeClosed(1, 4);
        IntStream is3 = IntStream.concat(is1, is2);
//        Object val = is3.boxed().collect(Collectors.groupingBy(k -> k)).get(2);
        Object val = is3.boxed().collect(Collectors.groupingBy(k -> k%2 == 0 ? "Even " : "Odd")).get("Odd");
        System.out.println(val);
    }
}
