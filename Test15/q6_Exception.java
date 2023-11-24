package Test15;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class q6_Exception {
}


class TestClassic
{
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("aaa.a");  //1
        try(reader){
            reader.read(); //2
        }finally{
            reader.read(); //3
        }
        reader.read(); //4
    }
}

