package TextBook;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class PutIfAbs {
    public static void main(String[] args) {
        Map<String,String> fav = new HashMap<>();
        //fav.put("Jenny","Bus Tour");
        fav.put("Tom",null);
        fav.putIfAbsent("Jenny", "Tram");
        fav.putIfAbsent("Sam", "Tram");
        fav.putIfAbsent("Tom", "Tram");
        System.out.println(fav);
        System.out.println("-------------------------------------------------");
        BiFunction<String,String,String> mapper=(v1, v2)->v1.length()>v2.length()?v1:v2;
        Map<String, String> favorites = new HashMap<>();
         favorites.put("Jenny", "Bus Tour");
         favorites.put("Tom", "Tram");
         String jenny = favorites.merge("Jenny", "Skyride", mapper);
         String tom = favorites.merge("Tom", "Skyride", mapper);
         System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
         System.out.println(jenny); // Bus Tour
         System.out.println(tom); // Skyride
    }
}
