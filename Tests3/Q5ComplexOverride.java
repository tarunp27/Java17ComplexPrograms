package Tests3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Base {
    public <T extends Number, Z extends Number> Map<T, Z> getMap(T x, Z y) {
        System.out.println("Base class");
        return new HashMap<T, Z>();
    }

    int sayHello(int i) {
        System.out.println("HEllo");
        return 4;
    }
}

public class Q5ComplexOverride  extends Base{
    int sayHello(long i) {
        System.out.println("Hello long");
        return 3;
    }

    public  <T, Z> TreeMap<T, Z> getMap(T t, Z z) {
        System.out.println("Derived class");
        return new TreeMap<T, Z>();
    };

    public static void main(String[] args) {
       Q5ComplexOverride  q = new Q5ComplexOverride();
       q.getMap(5,55);
       q.getMap(6,66);
    }

}
