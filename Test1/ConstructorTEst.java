package Test1;

import java.util.ArrayList;
import java.util.List;

class Animal{
    int age =0;
    Animal(int age) {
        super();
        this.age= age;
    }
    Animal(){
        super();
//        this(5);  // not allowed.
        this.age=10;
    }
    List fly1(List<String> s){
        return  null;
    }
}
public class ConstructorTEst extends Animal{
    ArrayList fly1(List<String> s){
        return  null;
    }

    ConstructorTEst(){
        super(1);
    }
    public double getAverageWeight() {
        return getAverageWeight(); // StackOverflowError
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        ConstructorTEst ct = new ConstructorTEst();
        ct.getAverageWeight();
    }
}
