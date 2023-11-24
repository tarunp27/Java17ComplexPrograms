package Test10;
//actually 45
class Baap {
    public int h = 4;

    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

public class Q44 extends Baap {
    public int h = 44;

    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }

    public static void main(String[] args) {
        Baap b = new Q44();
        System.out.println(b.h + " " + b.getH());
        Q44 bb = (Q44) b;
        System.out.println(bb.h + " " + bb.getH());
    }
}
