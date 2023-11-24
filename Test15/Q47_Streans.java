package Test15;

import java.util.stream.IntStream;

public class Q47_Streans {
    public static void main(String[] args) {
        IntStream is = IntStream.range(1, 6);
        IntStream is2 = is.takeWhile(x-> x%2==0);
        is2.forEach(System.out::print);
    }
}
