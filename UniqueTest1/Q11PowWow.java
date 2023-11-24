package UniqueTest1;

interface Pow{
    static void wow(){
        System.out.println("in pow.wow");
    }
}

abstract class Wow{
    static void wow(){
        System.out.println("in wow.wow");
    }
}

public class Q11PowWow extends Wow implements Pow {
//    static void wow(){
//        System.out.println("in Q11PowWow.wow");
//    }
    public static void main(String[] args) {
     Q11PowWow pw = new Q11PowWow();
     pw.wow();
//     Wow.wow();
//     Pow.wow();
//     Q11PowWow.wow();
    }
}
