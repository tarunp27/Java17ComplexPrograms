package TextBook.ExceptionLocalization;

import java.io.IOException;

public class q1throws {
    public static void main(String[] args) throws IOException {
        new q1throws().whatHappensNext();
    }

    public void whatHappensNext() throws IOException {
        System.out.println("Its okay");
//        throw new IllegalArgumentException();
//        throw new RuntimeException();
//        throw new java.io.IOException();
    }
}
