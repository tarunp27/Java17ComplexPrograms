package LetusGetCertifiec;

import java.util.ArrayList;
import java.util.List;

public interface Birdie {
    void fly();
}

class Dino implements Birdie {
    public void fly(){ System.out.println("Dino flies"); }
    public void eat(){ System.out.println("Dino eats");}
}

class Bino extends Dino {
    public void fly(){ System.out.println("Bino flies"); }
    public void eat(){ System.out.println("Bino eats");}

}

class TestClasses {
    public static void main(String[] args)    {
        List<Birdie> m = new ArrayList<>();
        m.add(new Dino());
        //m.add(new Bino());
        for(Birdie b : m) {
            b.fly();
            //b.eat();
        }
    }
}
class Vehicle{
}
sealed class Bike permits TwoSeater {}
non-sealed class TwoSeater extends Bike{}