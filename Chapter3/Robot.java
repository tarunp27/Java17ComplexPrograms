package Chapter3;

import com.mysql.cj.x.protobuf.MysqlxExpr;

interface Pump {
    public abstract String toString();
}

interface Bend extends Pump {
    void bend(double tensileStrength);
}

public class Robot extends Object {
    public static final void apply(Bend instruction, double input) {
        instruction.bend(input);
    }


    public static void main(String... future) {
        final Robot r = new Robot();
        r.apply(x -> System.out.print(x + " bent!"), 15);
    }
}

abstract class ChildRobot1 {
    void walk(){
        var name = "Pugal";
        name = null;
        System.out.println("Only 100 km");
    }

    ChildRobot1(){
        System.out.println("Abstract ChildRobot");
    }

}