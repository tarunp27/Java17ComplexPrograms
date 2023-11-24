package UT4;

import java.util.function.Function;

public class Q5LamdaDouble {
    public static void main(String[] args) {
        double principle = 5;
        int rate = 5;
        double result = compute(principle, x->x*rate);
        System.out.println(result);
    }

    public static double compute(double base, Function<Double,Double> func) {
        return func.apply(base);
    }
//    public static double compute(double base, Function<Integer,Double> func) {
//        return func.apply((int)base);
//    }
}
