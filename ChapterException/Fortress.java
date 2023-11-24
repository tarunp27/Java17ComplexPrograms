package ChapterException;

import java.util.Scanner;

public class Fortress {
    public void openDrawbridge() throws Exception { // p1
        try {
            throw new Exception("Circle"); // p2
        }
        catch (Exception e) {
            System.out.print("Opening!");
        }
        finally {
            System.out.print("Walls");
        }
    }
    public static void main(String[] moat) throws Exception {
        try (var e = new Scanner(System.in)) {
            new Fortress().openDrawbridge(); // p3
        }
    } }