package Test4;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q11_paths {
    static Path p1= Paths.get("c:\\a\\b\\c");
    public static String getValue() {
        String  x = p1.getName(1).toString();
        return (x);
    }
    public static void main(String[] args) {
        System.out.println(getValue());
        System.out.println(p1.isAbsolute());
        System.out.println(p1.normalize() );
        System.out.println(p1.getRoot());
    }
}
