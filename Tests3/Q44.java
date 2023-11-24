package Tests3;

import java.util.Arrays;
import java.util.List;

public class Q44 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3,4,6,9,2,5,7);
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b));
//        System.out.println(ls.stream().max(Integer::compare).get());
        System.out.println(ls.stream().max((x,y)-> x.compareTo(y)).get());

        var sb = new StringBuilder("animals");
        int sub = sb.indexOf("al");
        System.out.println(sub);
        var sb1 = new StringBuilder("abcdef");
        System.out.println(sb1);
        System.out.println(sb1.delete(1, 3));
        System.out.println(sb1);
        System.out.println(sb1.deleteCharAt(2));

        String[] array = new String[] {"a", "b", "c"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);



    }
}
