package Tests3;

public class Q33 {
    public static void main(String[] args) {
        A[] a, a1;
        B[] b;
        a = new A[10];
        a1 = a;
        b = new B[20];
        a = b;  // 1
//        a1 = b;
        b = (B[]) a;  // 2
        b = (B[]) a1; // 3
    }
}
