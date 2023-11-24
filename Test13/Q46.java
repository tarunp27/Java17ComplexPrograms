package Test13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q46 {
    public static void main(String[] args) {
        String[] p = {"1", "2", "3" };
        List<?> list2 = new ArrayList<>(Arrays.asList(p));
        System.out.println(list2.get(0));
        System.out.println(list2.get(1));

        var wi = new Integer("6");
    }
}
