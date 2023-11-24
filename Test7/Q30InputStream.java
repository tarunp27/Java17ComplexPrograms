package Test7;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Q30InputStream {
    public static void main(String[] args) throws Exception {
        try (var fis = new FileInputStream("c:\\Users\\tarun\\test1.txt");
             var isr = new InputStreamReader(fis))
        {
            while (isr.ready()) {
//                isr.skip(1);
                int i = isr.read();
                char c = (char) i;
                System.out.print(c);
            }
        }
    }
}
