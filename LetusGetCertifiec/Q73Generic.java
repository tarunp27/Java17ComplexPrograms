package LetusGetCertifiec;

import java.util.ArrayList;
import java.util.List;

public class Q73Generic {
    public static void main(String[] args) {
        ArrayList<CharSequence> in = new ArrayList<>();
        in.add("P");
        in.add("M");
        in.add("T");
        in.add("S");
        List result = null;
        result = doIt(in);
        System.out.println(result);
    }

    public static <A extends CharSequence> List<? super A> doIt(List<A> nums){
        return nums;
    }

}
