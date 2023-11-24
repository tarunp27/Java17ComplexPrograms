package Chapter3;

interface Flavor {
    private static void excited() {
//        printFlavor("Peanut butter");
    }

    public static void sad() {
//        printFlavor("Butter pecan");
    }

    public default void happy() {
        printFlavor("Rocky road");
        excited();
    }

    private void printFlavor(String f) {
        System.out.println("Favorite Flavor is: " + f);
    }
}

public class a76 {
}

class IceCream implements Flavor {
    @Override
    public void happy() {
       // printFlavor("Cherry chocolate chip");
    }
}