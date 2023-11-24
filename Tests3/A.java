package Tests3;

public class A {
    public static void m1(){
        System.out.println("A");
    }
}
class B extends  A{
    public static void m1(){
        System.out.println("B");
    }
}
class Test{
    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}
