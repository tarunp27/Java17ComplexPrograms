package Test15;

public class Q27_NestedClass {
}
class TestClasss {
    static int val = 10;
    public static int reduce(int val){
        class Inner{
            int val =10;
            public int reduce(int mval){
                return mval-val--;
            }
        }
        val--;
        return new Inner().reduce(val);
    }

    public static void main(String[] args) {
        reduce(5);
        System.out.println(val);
    }
}

