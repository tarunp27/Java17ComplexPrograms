package TextBook.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class q16FileWrite {
    public static void main(String[] args) throws IOException {
        var o = new FileWriter("C:\\Users\\tarun\\Q16Testout.txt");
        try (var f = new FileReader("C:\\Users\\tarun\\test.txt");
             var b = new BufferedReader(f);
             o
        )
        {
            o.write(b.readLine());
        }
        o.write("");
    }
}
