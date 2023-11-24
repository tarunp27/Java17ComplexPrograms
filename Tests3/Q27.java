package Tests3;

import java.util.Optional;
import java.util.stream.Stream;

public class Q27 {
    public static void main(String[] args) {
        String sentence = "Life is a box of chocolates, Forrest. You never know what you're gonna get.";
        //Optional<String> theword = Stream.of(sentence.split("[ ,.]")).anyMatch(w->w.startsWith("g"));
        boolean theword = Stream.of(sentence.split("[ ,.]")).anyMatch(w->w.startsWith("g"));
    }
}
