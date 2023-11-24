import java.util.List;
import java.util.Spliterator;

public class Constructor {
    Constructor(int age){
        this();
        System.out.println("One parameter parent Constructor");
    }
    Constructor(){
        System.out.println("NO arg constructor");
    }
}
class ConstConstructor extends Constructor{
    ConstConstructor(){
        super(3);
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }

}
