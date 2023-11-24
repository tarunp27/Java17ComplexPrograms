package Test4;

import java.io.Console;

public class Q27_Io {
    public static void main(String[] args) {
         Console c = System.console();
         String line = c.readLine("Please enter your name:");
         System.out.println("Hello, "+line);
    }
}
