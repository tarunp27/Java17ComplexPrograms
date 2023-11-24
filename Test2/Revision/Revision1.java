package Test2.Revision;

public class Revision1 {
//    var age = 25;     // var not allowed as instance variable
    public static void main(String[] args) {
        var age = 20;
        int a,b,c;  a = b = c = 100;   // this is allowed
//        var a,b,c;  // not allowed
//        int a = b = c = 100;
//        var aa = 100 , bb=200;
        int aa, bb, cc = 100;
//        int xx = yy = zz = 100;   // not allowed
        int xx, yy=5;
    }
}
