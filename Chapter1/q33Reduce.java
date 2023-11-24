package Chapter1;

import java.util.List;

public class q33Reduce {
    public static void main(String[] args) {
        var bed = List.of((short) 2, (short) 5, (short)9);
        var pillow = bed.parallelStream().reduce(0.0,
                (a, b) -> b + a,
                (c, d) -> d + c);
        System.out.println(pillow);
    }
}
