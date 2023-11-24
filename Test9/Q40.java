package Test9;

import java.util.function.Supplier;

public class Q40 {
    public static void main(String[] args) {
        int value = 10;
       // Supplier<Integer> valueS = () -> value; //1
        value++;//2
       // System.out.println(value+" "+valueS.get()); //3
    }
}
