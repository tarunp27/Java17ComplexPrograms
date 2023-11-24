package Test7;

public class Q41Overloading {
    void probe(int x) {
        System.out.println("In int");
    }
    void probe(Integer x) {
        System.out.println("In Integer");
    }
    void probe(float x) {
        System.out.println("In float");
    }

    void probe(long x) {
        System.out.println("In long");
    }
    void probe(Long x) {
        System.out.println("In Long");
    }

    public static void main(String[] args) {
//        Integer a = 5;
//        new Q41Overloading().probe(a);
        short b = 4;
        new Q41Overloading().probe(b);
//        long  l = 9999999;
//        new Q41Overloading().probe(l);
//        float f= 12.4f;
//        new Q41Overloading().probe();


    }


}
class Roller<E extends Wheel> {
    public void roll(E e) { }
}
class Wheel { }
class CartWheel extends Wheel { }
class RollingContest {
    Roller<CartWheel> wheel1 = new Roller<CartWheel>();
  // Roller<Wheel> wheel2 = new Roller<CartWheel>();
    Roller<? extends Wheel> wheel3 = new Roller<CartWheel>
            ();
    Roller<? extends Wheel> wheel4 = new Roller<Wheel>();
  //  Roller<? super Wheel> wheel5 = new Roller<CartWheel>();
    Roller<? super Wheel> wheel6 = new Roller<Wheel>();
}