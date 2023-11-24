package Test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClassA {
    ClassA() {
        print();
    }

    void print() {
        System.out.println("A");
    }
}

class ClassB extends ClassA {
    int i = 10;

    public static void main(String[] args) {
        ClassA a = new ClassB();
        a.print();


    }

    void print() {

        System.out.println(i + " *");   //0 * and 10 * very interesting problem.
    }
}

