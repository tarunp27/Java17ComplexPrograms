package UT4;

public class Q28 {
    static int si = 10;
    static int age = 20;
    public static void main(String args[]) {

        new Q28();
    }

    public Q28() {

        System.out.println(this);
    }

    public String toString() {
        System.out.println("Age "+this.age);
        System.out.println(this.si);
        return "TestClass.si = " + this.si;
    }

}
