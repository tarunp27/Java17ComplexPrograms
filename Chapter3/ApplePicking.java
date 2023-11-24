package Chapter3;

interface Tasty {
    default void eat() {
        System.out.print("Spoiled!");
    }
}

public class ApplePicking {
     void price(){}
    public static void main(String[] food) {
        var apple = new Tasty() {
            @Override
            public void eat() {
                System.out.print("Yummy!");
            }
        };
        apple.eat();
    }
}