package Test12;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Q1io {
    public static void main(String[] args) throws Exception {
        String fileName = "C:/Users/tarun/FileSystem/File22Dec2022.txt";
        createFile(fileName);

    }

    public static void createFile(String name) throws Exception{
        try(OutputStream os = new FileOutputStream(name);){
            var bos = new BufferedOutputStream(os);
            var pw = new PrintWriter(bos);
            pw.write(999);
            pw.flush();
        }
    }
}
