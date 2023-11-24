package ChapterArrays_Collection;

import java.util.HashMap;

public class Q38etryset {
    public static void main(String[] args) {
        var names = new HashMap<String, String>();
        names.put("peter", "pan");
        names.put("wendy", "darling");
        var first = names.entrySet(); // line x1
//        System.out.println(first.getKey()); // line x2
        first.forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
        System.out.println("---from map----");
        System.out.println(names.values());
        System.out.println(names.keySet());
        names.values().forEach(x-> System.out.println(x));
        names.keySet().forEach(x-> System.out.println(x));

    }
}
