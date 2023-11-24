package Test6;

public class Q35OOPS {
    public class A{

    }
    public static class B{

    }
    public void useClasses(){
        new Q35OOPS().new A();
        new Q35OOPS.B();
        new A();
        new Q35OOPS.A();
    }
    public static void useSClasses(){
        new Q35OOPS().new A();
        new Q35OOPS.B();
//        new A();
//        new Q35OOPS.A();
    }
}
