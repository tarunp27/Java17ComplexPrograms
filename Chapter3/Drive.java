package Chapter3;

import java.util.*;
import java.util.stream.IntStream;

interface Road{
    void route(int fun);
}
abstract class Drive {
    abstract void route(int fun);
}
class New{
    public static void main(String[] args) {
         long sum = IntStream.of(4, 6, 8)
         .boxed()
         .parallel()
         .mapToInt(x -> x)
         .sum();
         System.out.print(sum);
    }
}
