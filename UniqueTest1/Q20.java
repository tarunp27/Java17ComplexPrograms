package UniqueTest1;

import java.util.ArrayList;

public class Q20 {
    public static void main(String[] args) {
        ArrayList<Double> al = new ArrayList<>();
        al.add(44.0);
        //al.add(111);   // not valid you cant box it.
        System.out.println(al.indexOf(44)) ;
        System.out.println(al.contains("Pugal"));
        System.out.println(al.contains(44.0));
    }
}
