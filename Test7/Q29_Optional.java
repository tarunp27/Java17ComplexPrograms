package Test7;

import java.util.Optional;

public class Q29_Optional {
    public static String getValue(){
        return null;
    }
    public static void main(String[] args) {
        Optional<String> sro = Optional.of("55");      // null pointer exception
//        Optional<String> sro = Optional.of(getValue());  // Null Pointer exception
//        Optional<String> sro = Optional.ofNullable(getValue());  // Null Pointer exception
        System.out.println(sro.isPresent());
//        System.out.println(sro.get());
        System.out.println(sro.orElse(getValue()));
    }
}
