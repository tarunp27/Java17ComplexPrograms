package UT4;

public class Q7STRING {
    static String insStr;
    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};
//        String newStr="";
        String newStr=null;
        for (char ch : myCharArr) {
            newStr = newStr + ch;
            insStr = insStr + ch;
        }
        System.out.println(newStr+" "+myStr+" "+insStr);
        System.out.println((newStr == myStr) + " " + (newStr.equals(myStr)));
        System.out.println(myStr.equals(insStr));
    }
}
