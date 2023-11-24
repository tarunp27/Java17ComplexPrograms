package LetusGetCertifiec;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class XXX {
    public void m1() throws RuntimeException {
        System.out.println("XXX");
//        throw new RuntimeException();
    }
}

class YYY extends XXX {
    public void m1() {
//        throw new RuntimeException();
        System.out.println("YYYY");
    }
}

public class OverideXXXException {
    static int result = 0;

    public static void main(String[] args) throws Exception  {
        XXX obj = new XXX();
        obj.m1();

        try {
            int[] array = new int[4];
            array[4] = 4;
        }
        catch (NullPointerException e) {
        }

        List<Double> dList = Arrays.asList(10.0, 12.0);
        dList.set(1,13.2);


        dList.forEach(x -> {
            result += x;
        });

        System.out.println(result);

        dList.forEach(x -> System.out.println(x));

    }
}
