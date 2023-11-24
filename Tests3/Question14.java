package Tests3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;


public class Question14 {
    public static void main(String[] args) {
        List<String> vowels = new ArrayList<String>();
        vowels.add("e");
        vowels.add("a");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        Function<List<String>, List<String>> f = list -> list.subList(2, 4);
        //f.apply(vowels);   // in exam it was like this.  This return sublist list. like below
        // so the vowels list value does not change.
        // the answer is eaiou.
        vowels.forEach(System.out::print);

        List<String> arrlist2 = f.apply(vowels);
        System.out.println();
        System.out.println(arrlist2);    // [i, o]

//        vowels.sort((t,s)->t.compareTo(s));  // this is one way of sorting
//        System.out.println(vowels);

        Collections.sort(vowels);              // this will also sort
        System.out.println(vowels);

    }
}
