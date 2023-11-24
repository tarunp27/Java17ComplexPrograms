package Chapter3;

public class q88 {
}
 class Cars {
    static {
        System.out.println("static");
    }
    private static void drive() {
        System.out.println("fast");
    }

    { System.out.println("faster"); }
    public static void main(String[] args) {
        drive();
        drive();
    } }