package Test10;

import java.util.Arrays;
import java.util.stream.Stream;

public class Q5 {
    public static void main(String[] args) {
        Arrays.stream(Card.values()).takeWhile(c -> c.isRed()).forEach(System.out::print);
        System.out.println();
        Stream<Integer> si = Stream.of(1,2,3,4,5,6,7,8,9,10).dropWhile(s->s<6);
//        Stream<Integer> si = Stream.of(1,2,3,4,5,6,7,8,9,10).takeWhile(s->s<6);
        si.forEach(s-> System.out.println(s));
    }
}

enum Card {
    HEART, CLUB, SPADE, DIAMOND;

    public boolean isRed() {
        return switch (this) {
            case HEART, DIAMOND -> true;
            default -> false;
        };
    }
}

