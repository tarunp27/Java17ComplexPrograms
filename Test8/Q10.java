package Test8;

import java.io.IOException;

public class Q10 implements AutoCloseable {
    String header = null;

    public Q10(String name) throws IOException {
        header = name;
        if ("D2".equals(name)) throw new IOException("Unknown");
        System.out.println(header + " Opened");
    }

    public String read() throws IOException {
        return "";
    }

    public void close() {
        System.out.println("Closing device " + header);
        throw new RuntimeException("RTE while closing " + header);
    }

    public static void main(String[] args) throws Exception {
        try (Q10 d1 = new Q10("D1");
             Q10 d2 = new Q10("D2")) {
            System.out.println("Is it coming here?");
            throw new Exception("test");
        }
    }
}
