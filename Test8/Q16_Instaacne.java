package Test8;

public class Q16_Instaacne {
    public static void main(String[] args) {
        C obj = new C();
        System.out.println((obj instanceof A) && ! (obj instanceof C) && ! (obj instanceof D));
    }
}
class A {}
class B extends A {}
class C extends B {}
class D extends C {}

