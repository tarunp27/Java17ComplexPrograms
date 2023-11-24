package Test2;

// Question #20

public class TestClass {
    public static void main(String[] args) {
        //B b = new C();
        //A a = b;
        A a = new C();

        if (a instanceof B b1) b1.b();
        if (a instanceof C c1) c1.c();
        if (a instanceof D d1) d1.d();

        Number num = 5 ;
        if (num instanceof Integer da){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        calcMe(10);
//        calcMe(2.2);
        calcMe(Integer.valueOf("10"));


    }
//    public static void calcMe(long l){
//        System.out.println("Calling long");
//    }

//    public static void calcMe(double d) {
//        System.out.println("Calling double");
//    }

    public static void calcMe(Integer i) {
        System.out.println("Calling Integer");
    }

}

class A {
    void a() {
        System.out.println("a");
    }
    void m1() {
        System.out.println("A");
    }
}

class B extends A{
    void b() {
        System.out.println("b");
    }
    void m1() {
        System.out.println("B");
    }
}

class C extends B {
    void c() {
        System.out.println("c");
    }
    void m1() {
        System.out.println("C");
        this.m1();
        super.m1();
    }
}

class D extends C {
    void d() {
        System.out.println("d");
    }
    void m1() {
        System.out.println("D");
    }
}
