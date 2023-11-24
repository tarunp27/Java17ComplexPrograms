package Test10;

import java.util.TreeSet;

public class Q22 {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<Integer>();
        TreeSet<Integer> subs = new TreeSet<Integer>();
        for (int i = 324; i <= 328; i++) {
            s.add(i);
        }
        subs = (TreeSet) s.subSet(326, true, 328, true);
        s.remove(Integer.valueOf(326));
        System.out.println(subs.add(326));
        System.out.println(s + " " + subs);
    }
}
