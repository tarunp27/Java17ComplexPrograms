package LetusGetCertifiec;

interface InterFaces{}

public class A1 {
   int i = 10;
    void temp(){
        int i=20;
    }
}
abstract class  Dummy implements InterFaces{}

class B1 extends A1 {
}

class TestClass {
    public static void main(String[] args) {
        B1 b = new B1();
        System.out.println(b.i);

    }

    public B1 process(String str) {
        return new B1();
    }
}