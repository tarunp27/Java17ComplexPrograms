package LetusGetCertifiec;

import java.util.ArrayList;
import java.util.Arrays;

public class q678_Arr {
    public static void main(String[] args) {
       Object arr[]= new Object[]{ "aaa", new Object(), new ArrayList(), };
       Object arr1[]= new Object[]{new Object()};


        int[] a = { 'h', 'e', 'l', 'l','l','l'};
        int[] b = {'a','e','l','l','l'};

//          char[] a = { 'h', 'e', 'l', 'l'};
//          char[] b = {};
////
//          String []a={"h","e","l","l"};
//          String []b={"h","o","l","l"} ;

         int x = Arrays.compare(a, b);
         int y = Arrays.mismatch(a, b);
         System.out.println(x+" "+y);

    }
}
