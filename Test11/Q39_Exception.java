//package Test11;
//
//
//import java.io.FileNotFoundException;
//import java.text.RuleBasedCollator;
//
//public class Q39_Exception {
//    public static void main(String[] args) {
//        try {
//            amethod();
//            System.out.println("try");
//        } catch (Exception e) {
//            System.out.println("catch");
//        } finally {
//            System.out.println("finally");
//        }
//        System.out.println("out");
//    }
//
//    public static void amethod() {
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("l");
//        }
//    }
//}
