package LetusGetCertifiec;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Blogger {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Pugal","Tarun"));
        names.add("Sarvesh");
        names.add("Mala");

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }

        for(String nm: names) {
            System.out.println(nm);
        }

    }
}
