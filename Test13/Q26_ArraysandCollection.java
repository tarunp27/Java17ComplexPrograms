package Test13;

import java.util.Arrays;
import java.util.List;

public class Q26_ArraysandCollection {
    public static void main(String[] args) {
        var numA = new Integer[]{1, 2};
        var list1 = List.of(numA);
        var alist1 = Arrays.asList(numA);
        System.out.println(list1);
        System.out.println(alist1);
        numA[0] = 2;
        var listx = List.of(numA);
        System.out.println(alist1);
        System.out.println(listx);
        System.out.println(list1);
        var list2 = List.copyOf(list1);
        System.out.println(list1+" "+list2);
    }
}
