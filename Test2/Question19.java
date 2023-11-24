package Test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.NoSuchFileException;

public class Question19 {
    public static void main(String[] args) {
        try(InputStream is = new FileInputStream("mydata.txt");){
            byte[] buffer = new byte[1024];
        }
        catch (IOException| RuntimeException ex){
            ex.printStackTrace();
        }
    }
}
