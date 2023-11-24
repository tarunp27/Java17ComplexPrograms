package PractiseTest2;


import java.util.*;
import java.util.stream.IntStream;

public class SpliteratorExample {
    public static void main(String[] args) {
        var stream = List.of("bird-",
                "bunny-",
                "cat-",
                "dog-",
                "fish-",
                "lamb-", "mouse-");

        Spliterator<String> originalBagOfFood = stream.spliterator();
        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
        originalBagOfFood.forEachRemaining(System.out::print);
        emmasBag.forEachRemaining(System.out::print);
    }
}
 class Dance {
    public static void swing(int... beats)
            throws ClassCastException {
        try {
            System.out.print("1"+beats[2]); // p1
        } catch (RuntimeException e) {
            System.out.print("2");
        } catch (Exception e) {
            System.out.print("3");
        } finally {
            System.out.print("4");
        } }
    public static void main(String[] music) {
        new Dance().swing(0,0); // p2
        System.out.print("5");
    } }