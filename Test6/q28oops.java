package Test6;

class Wrapper{
    static int x = 99;
    int w = 10;
}

public class q28oops {
    static Wrapper changeWrapper(Wrapper w){
        w = new Wrapper();
        w.w += 9;
        return w;
    }

    public static void main(String[] args){
        Wrapper ww= null;
        System.out.println(ww.x);   /// you can access static variable but not instance variable using null object reference
        var w = new Wrapper();
        w.w = 20;
        changeWrapper(w);
        w.w += 30;
        System.out.println(w.w);
        w = changeWrapper(w);
        System.out.println(w.w);
    }

}
