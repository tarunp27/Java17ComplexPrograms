package UT3;

public class q47instance {
}

class TestClass {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(b instanceof A);
        System.out.println(b instanceof B);
    }
}

class A implements T1, T2 {
}

class B extends A implements T1 {
}

interface T1 {
}

interface T2 {
}
