package TextBook.IO;


import java.io.Serializable;
import java.util.List;

class Zebra implements Serializable {
    private transient String name = "George";
    private static String birthPlace = "Africa";
    private transient Integer age;
    List<Zebra> friends = new java.util.ArrayList<>();
    private Object stripes = new Object();

    {
        age = 10;
    }

    public Zebra() {
        this.name = "Sophia";
    }

    static Zebra writeAndRead(Zebra z) {
        return z;
    }

    public static void main(String[] args) {
        var zebra = new Zebra();
        zebra = writeAndRead(zebra);
    }
}
