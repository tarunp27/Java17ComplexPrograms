package LetusGetCertifiec;

import java.io.FileNotFoundException;
import java.io.IOException;

public class q567_ooa {
}

class Great {
    public void doStuff() throws IOException{
    }
}

class Amazing extends Great {
    public void doStuff() throws FileNotFoundException,IllegalArgumentException{
    }
}

class TestingClass {
    public static void main(String[] args) throws Throwable {
        Great g = new Amazing();
        g.doStuff();
    }
}
