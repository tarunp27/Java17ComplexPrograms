package Test4;

public class TestOuter {
    public static class TestInner{
        public void sayIt(){
            System.out.println("Hello from Static Nested");
        }
    }
    public static void main(String[] args) {
        new TestOuter.TestInner();
        new TestInner();
    }
}
