package PractiseTest2;
//q27
//call by value/reference
public class Helicopter {
    public static void main(String[] climb) {
        final var h = new Helicopter();
        var length = 5;
        var type = new String[1];
        Integer intval =300;
        length = h.adjustPropellers(length, type, intval);
        System.out.print(length + "," + type[0]+","+intval);
    }

    public int adjustPropellers(int length, String[] type,Integer intval) {
        intval++;
        length++;
        type[0] = "LONG" ;
        return length;
    }
}
abstract non-sealed class Chimp extends Primate { }
abstract non-sealed class Bonabo extends Primate { }
final class Gorilla { }
abstract sealed class Primate permits Chimp, Bonabo
{
    abstract String getName();
}
