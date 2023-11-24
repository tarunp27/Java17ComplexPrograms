package LetusGetCertifiec;

public enum Coffee {
    ESPRESSO("Very Strong"), MOCHA("Bold"), LATTE("Mild");
    public String strength;
    public static String prefix ="Pugal";

    Coffee(String strength) {
//        this.strength = strength+prefix;
        this.strength = strength;
//        System.out.println(prefix);   //static non-final variable cannot be used in constructor.
    }

    void printPrefix(){
        System.out.println(prefix);
    }

    public static void main(String[] args) {
        System.out.println(Coffee.ESPRESSO.strength);
        Coffee[] c = Coffee.values();
        System.out.println("First array "+c[0]);
        System.out.println(Coffee.values()[0].strength);
        for (Coffee c1: c){
            System.out.println(c1);
        }
    }
}
