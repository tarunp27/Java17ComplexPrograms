package TextBook.Operators;

import java.util.ArrayList;
import java.util.List;

public class CandyCounter {
    static long addCandy(double fruit, float vegetables) {
         return (int)(fruit+vegetables);
    }
    public static void main(String[] args) {
        System.out.print(addCandy(1.4, 2.4f) + ", ");
        System.out.print(addCandy(1.9, (float)4) + ", ");
        System.out.print(addCandy((long)(int)(short)2, (float)4));
        System.out.println();
        String s = "Java";
        StringBuilder d = new StringBuilder(s);
        d.reverse();
        System.out.println(d);
    }
}
class ParentOverrride{
    public List<String> hairy(List<String> list) { return null; }
}
class ChildOverride extends ParentOverrride{
    public List<String> hairy(ArrayList<String> list) { return null; }
}