package Test9;

public class Q13 {
    final int ii;
    final static int si;
    static {
        si = 10;
    }
    {
        ii=20;
//        si=20;
    }
    Q13(){
//        ii=20;
//        si=30;
    }
    public static void main(String[] args)
    {
//        si=0;
        System.out.println("Main method");
    }   //1
}
