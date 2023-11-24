package LetusGetCertifiec;

public class Q528SelfObjectInside {

    public static void main(String[] args) {
        final var a = new Holder(5);
        var b = new Holder(10);

        a.link = b;
        b.link = setIt(a, b);
        System.out.println(b.link.value);
        System.out.println(a.link.value);

    }

    public static Holder setIt(final Holder x, final Holder y) {
        x.link = y.link;
        return x;
    }


}

class Holder {
    static int value = 1;
    Holder link;
    public Holder(int val) {
        this.value = val;
    }
}
