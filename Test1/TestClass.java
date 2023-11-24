package Test1;

public class TestClass {
    int x = 5;                   // this is instance variable
    int getX() {
        return x;
    }
    public static void main(String args[]) throws Exception {
        TestClass tc = new TestClass();
        tc.looper();
        System.out.println(tc.x);
    }
    public void looper() {
        var x = 0;               // this is local variable.  possible.
        while ((x = getX()) != 0) {
            for (int m = 10; m >= 0; m--) {
                x = m;
                System.out.println(x);
            }
        }
    }
}