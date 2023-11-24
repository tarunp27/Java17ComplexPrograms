import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExUnmmodi {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Apple");
        l.add("Orange");
        l = Collections.unmodifiableList(l);
        System.out.println(l);
        l.add("Kwiw");
      //  System.out.println(l);
    }
}
