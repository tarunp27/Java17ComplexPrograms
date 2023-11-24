package LetusGetCertifiec;

import java.util.Arrays;

public class Q76 {
    public static void main(String[] args) {
        int[] ia1 = {'a', 'c'};
        int[] ia2 = {'a', 'f', 'g'};
        int x = Arrays.compare(ia1, ia2);
        int y = Arrays.mismatch(ia1, ia2);
        System.out.println(x + " " + y);
    }
}
