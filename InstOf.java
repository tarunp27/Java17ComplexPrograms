
class A{}
class B extends A{}
class C extends B{}
class D extends C{}

public class InstOf {
    public static void main(String[] args) {
        A b = new D();
        A a = b;
        if(b instanceof A){
            System.out.println("True");
        }
        if(b instanceof B){
            System.out.println("True");
        }
        if (b instanceof C){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        if (b instanceof D){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
//       if(b instanceof  A a1){}
        if(b instanceof  B b1){}
        if(b instanceof  C c1){}
        if(b instanceof  D d1){}


    }
}
