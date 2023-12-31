package Test8;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Q33 {
    public static int operate(IntUnaryOperator iuo) {
        return iuo.applyAsInt(5);
    }

    public static void main(String[] args) {
        IntFunction<IntUnaryOperator> fo = a -> b -> a - b;  //1
        int x = operate(fo.apply(20)); //2
        System.out.println(x);
    }
}
