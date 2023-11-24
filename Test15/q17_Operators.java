package Test15;

import static java.lang.Integer.valueOf;

public class q17_Operators {
    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;
        Double d = 1.0;

        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        //System.out.println(i1 == b1);
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(g1));
        System.out.println(i1.equals(b1));
        System.out.println(d > 1L);
    }
}
