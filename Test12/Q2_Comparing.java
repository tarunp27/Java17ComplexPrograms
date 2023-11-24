package Test12;

import java.util.Arrays;

public class Q2_Comparing {
    public static void main(String[] args) {
        Integer []a1 = {0,null,1,4,5,null};
        Integer []a2 = {0,null,1,5,6,null};
        int x = Arrays.compare(a1,a2);
        System.out.println(x);
    }
}
