package Chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.nio.file.Paths.*;
import java.util.List;
import java.util.Spliterator;

public class ArrayCompare {
    public static void main(String[] args) {
        var arr1 = new String[]{"a", "b", "c", "d"};
        var arr2 = new String[]{"a", "f", "c"};
        System.out.println(Arrays.compare(arr1, arr2));

        var stream = List.of("bird-",
                "bunny-",
                "cat-",
                "dog-",
                "fish-",
                "lamb-",
                "mouse-");
        Spliterator<String> originalBagOfFood = stream.spliterator();
        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
        emmasBag.forEachRemaining(System.out::print); // bird-bunny-cat
        System.out.println("");
        //originalBagOfFood.forEachRemaining(System.out::print);

        Spliterator<String> tarunsbag = originalBagOfFood.trySplit();
        tarunsbag.tryAdvance(System.out::print);
        System.out.println("");
        tarunsbag.forEachRemaining(System.out::print);
    }
}
