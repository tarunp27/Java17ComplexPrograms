package Test10;

public class Q47 {
    public void method(Object o) {
        System.out.println("Object Version");
    }

    public void method(java.io.FileNotFoundException s) {
        System.out.println("java.io.FileNotFoundException Version");
    }

    public void method(java.io.IOException s) {
        System.out.println("IOException Version");
    }

    public static void main(String args[]) {
        Q47 tc = new Q47();
        tc.method(null);
    }
}

class TestClass {
    public void method(Object o) {
        System.out.println("Object Version");
    }

    public void method(String s) {
        System.out.println("String Version");
    }

    public void method(StringBuffer s) {
        System.out.println("StringBuffer Version");
    }

    public static void main(String args[]) {
        TestClass tc = new TestClass();
        tc.method("Pugal");
    }
}
