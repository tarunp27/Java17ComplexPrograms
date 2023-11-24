package Test4;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class SortedTest {
    public static void main(String[] args) {
        Object [] sa= {100,100.0,"100"};
        Collections.sort(Arrays.asList(sa),null);
        System.out.println(sa[0]+" "+sa[1]+" "+sa[2]);
    }
}
