package Test4;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q15_Io {
    public static boolean isValid(Path p){
        return p.startsWith("temp") && p.endsWith("Clients.dat");
    }
    public static void main(String[] args) {
     var p1 = Paths.get("\\temp\\records");
     var p2 = p1.resolve("clients.dat");
        System.out.println(p2.isAbsolute());
        System.out.println(p2+" "+isValid(p2));
    }
}
