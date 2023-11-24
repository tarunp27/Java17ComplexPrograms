//package Test7;
//
//interface AI{
//    String value1 ="amazing";
//    void aMethod(String arg1);
//    void printMsg();
//}
//
//abstract class AC implements AI{
//    static String value1 = "Awesome";
//    abstract void aMethod(String agr1, String arg2);
//    public abstract void printMsg();
//}
//
//public class Q11Override extends AC implements AI {
//    public void aMethod(String arg1){
//        System.out.println(arg1);
//    };
//    public void aMethod(String arg1, String arg2) {
//        System.out.println(arg1+" "+arg2);
//    };
//    public void printMsg(){
//        System.out.println("Hello my Java training");
//    }
//    public static void main(String[] args) {
//        AI ai = new Q11Override();
//        //ai.aMethod("One", "Two");   // not available for ai object.  class reference pointing to AI.
//        ((AC) ai).aMethod("One",ai.value1);    // value cannot be referred without class name before gives ambiguity error.
//        //ai.aMethod(ai.value1);   // value error
//        ((AC) ai).aMethod(value1, ai.value1);    // value cannot be referred without class name before gives ambiguity error.
//        ai.printMsg();
//    }
//}
//
