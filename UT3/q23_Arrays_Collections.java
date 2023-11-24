package UT3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q23_Arrays_Collections{
    public static void main(String[] args) {
        List<String> letters =new ArrayList<String>();
        letters.addAll(List.of("a","b","c"));

        Collections.sort(letters);
        System.out.println(Collections.binarySearch(letters,"c"));
        Collections.reverse(letters);
        System.out.println(Collections.binarySearch(letters, "c"));
    }
}
