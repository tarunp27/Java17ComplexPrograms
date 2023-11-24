package Test1;

public class A {
     int fi = 10;
}
class B extends A {
    int fi = 15;
    public static void main(String[] args) {
        A b = new C();

        b.fi = 20;
        System.out.println(b.fi);
        System.out.println(((A)b).fi);

        if(b instanceof A) System.out.println("A True");
        if(b instanceof B) System.out.println("B True");
        if(b instanceof C) System.out.println("C True");
        if(b instanceof D) System.out.println("D True");
//        if(b instanceof E) System.out.println("D True");

// pattern can be given only for subclass of A and beyond.  that is b, C and D we can give pattern
//        if(b instanceof A q) System.out.println("A True");
        if(b instanceof B r) System.out.println("B True pattern");
        if(b instanceof C s) System.out.println("C True pattern");
        if(b instanceof D t) System.out.println("D True pattern");
    }
}
class C extends B {

}
class D extends  C{

}
class E {

}
class F extends E{

}
