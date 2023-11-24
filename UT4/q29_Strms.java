package UT4;

import java.util.stream.IntStream;

public class q29_Strms {
    public static void main(String[] args) {

        Object v1 = IntStream.rangeClosed(10, 55)
                .boxed()
                .filter(x->x>10)
                .parallel()
                .findAny();

        Object v2 = IntStream.rangeClosed(10, 55)
                .boxed()
                .filter(x->x>10)
                .sequential()
                .findAny();

        System.out.println(v1+":"+v2);
    }
}
