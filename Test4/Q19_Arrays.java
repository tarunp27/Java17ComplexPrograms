package Test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q19_Arrays {
    public static void main(String[] args) {
        char[] a = {'h', 'e', 'l', 'l'};
        char[] b = {'h', 'e', 'l', 'l', 's'};
        char[] c = {'h', 'e', 'l', 'l', 's', '1'};
        char[] d = {'h', 'e', 'l'};
        char[] e = {'h', 'e'};
        char[] f = {'h', 'o', 'l', 'l'};   //difference between e and o at position 2. (-10)
        // Object[] ob =  new Object[]{ "aaa", new Object(), new ArrayList(), 10 , null };


        int x1 = Arrays.compare(a, b);     //-1
        int x2 = Arrays.compare(a, c);     //-2
        int x3 = Arrays.compare(a, d);     //1
        int x4 = Arrays.compare(a, e);     //2
        int x5 = Arrays.compare(a, f);     //-10
        System.out.println(x1 + " " + x2 + " " + x3 + " " + x4 + " " + x5);


        /*
//test 3 q 51
        String str1 = "Pugal";
        String str2 = "Pu"+"gal";
        String str3 = "";
        str3 ="Pu"+"gal";
        String str4 = "";
        char[] charArr = {'g','o','o','d'};

        for(char ch: charArr) {
            str4 += ch;
        }

        System.out.println(str1==str2);   // true
        System.out.println(str1==str3);   // true
        System.out.println(str1==str4);   // false because of run time does not un-interned.
    }

         */
    }
}
