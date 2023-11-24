package Chapter3;

import java.util.Optional;
import java.util.stream.Stream;

public class q151 {
}
abstract class Book {
    protected static String material = "papyrus";
    public Book() {}
    abstract String read();
    public Book(String material) {this.material = material;}
}
 class Encyclopedia extends Book {
    public static String material = "cellulose";
    public Encyclopedia() {super();}
    public String read() { return "Reading is fun!"; }
    public String getMaterial() {return super.material;}
    public static void main(String[] pages) {
        System.out.print(new Encyclopedia().read());
        System.out.print("-" + new
                Encyclopedia().getMaterial());
    } }
