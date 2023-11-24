package Chapter3;

import java.io.FileNotFoundException;
import java.io.IOException;

// overriding method should throw subclass exception (checked exception)
// constructor method should throw super class exception (checked exception)

public class ConstructorExceptionA {
    ConstructorExceptionA() throws IOException {
    }
    void M1() throws IOException{
        System.out.println("hello parent");
    }
}

class Classb extends ConstructorExceptionA{
    Classb() throws Exception {
    }
    void M1() throws FileNotFoundException{
        System.out.println("hello child");
    }

}
