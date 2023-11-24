package Test13;

import java.util.Random;

public class Q42 {
    int value = 1;
    Q42 link;

    public Q42(int val) {
        this.value = val;
    }

    public static void main(String[] args) {
        final var a = new Q42(5);
        var b = new Q42(10);
        var c = new Q42(98);
        var d = new Q42(99);
        b.link = a;
        c.link = b;
        d.link = c;
        System.out.println("First :"+a.link);
        System.out.println("2nd   :"+b.link);
        System.out.println("3rd   :"+c.link);
        System.out.println("4th   :"+d.link);
        b.link = setIt(a, b);
        System.out.println(a.link.value + " " + b.link.value);

        Random r = new Random();
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));
        System.out.println(r.nextDouble(333));

    }

    public static Q42 setIt(final Q42 x, final Q42 y) {
        x.link = y.link;
        return x;
    }

    @Override
    public String toString() {
        return "Q42{" +
                "value=" + value +
                ", link=" + link +
                '}';
    }
}
