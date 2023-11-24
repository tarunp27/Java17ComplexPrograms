package Test10;

import java.text.NumberFormat;

abstract class q53 {
    static int age = 50;
    void calculate(){
        System.out.println("calculated....");
    };
    public static void main(String[] args) {
        System.out.println("main method");
       // q53 x = null;
       // x.calculate();
//        System.out.println(x.age);
        double x = 12345.123; String str = NumberFormat.getInstance().format(x);
        System.out.println(x);
    }
}
