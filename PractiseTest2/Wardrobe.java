package PractiseTest2;

import java.util.ArrayList;
import java.util.List;

abstract class TShirt {
    abstract int insulate();
    public TShirt() {
        System.out.print("Starting…");
    }
}
public class Wardrobe {
    abstract class Sweater extends TShirt {
        int insulate() {return 5;}
    }
    private void dress() {
         class Jacket extends Sweater { // v1
            int insulate() {return 10;}
        };
        final TShirt outfit = new Jacket() { // v2
            int insulate() {return 20;}
        };
        System.out.println("Insulation:"+outfit.insulate());
    }
    public static void main(String... snow) {
        new Wardrobe().dress();
    } }