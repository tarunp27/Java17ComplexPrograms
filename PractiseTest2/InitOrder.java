package PractiseTest2;

//36 instance static method call
public class InitOrder {
    static {
        System.out.print("2");
    }

    {
        System.out.print("1");
    }

    public InitOrder() {
        System.out.print("3");
    }

    public void InitOrder(){
        System.out.println("Iniitorder method");
    }

    public void MasterMethod(){
        InitOrder();
        callMe();
    }

    public static void callMe() {
        System.out.print("4");
    }

    public static void main(String[] args) {
        callMe();
        callMe();
        new InitOrder().InitOrder();
        System.out.print("5");
    }
}
