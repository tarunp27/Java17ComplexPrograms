package Test7;
public class Q34_Initialize {
}
interface Instrument{
    default void reset(){
        System.out.println("In Instrument");
    }
}
class Debt implements Instrument{}

class Bond extends Debt{
    public void reset(){
        super.reset();
        System.out.println("In Bond");
    }
}
class ZCBond extends Bond {
    ZCBond() {
        reset();        // this run first
    }

    public void reset() {    // this run second
        super.reset();
        System.out.println("In ZCBond");
    }

    public static void main(String[] args) {
        Instrument i = new ZCBond();
    }
}