package LetusGetCertifiec;

public class instanceOf {
    public static void main(String[] args) {

        Xs x = new Zs();
        Ws w = x;
        if (w instanceof Xs w1) {
            w1.x();
        }
        if (w instanceof Ys w2) {
            w2.y();
        }
        if (w instanceof Zs w3) {
            w3.z();
        }

        Ws class1 = new Ws();
        Xs class2 = new Xs();
        Ys class3 = new Ys();
        Zsss class4  = new Zsss();
        class1 = class2;
//        class2 = class1;
//        class4 = class1;

    }

}

interface Is{

}

class Ws {
    void w() {
        System.out.println("w");
    }
}

class Xs extends Ws {
    void x() {
        System.out.println("x");
    }
}

class Ys extends Xs {
    void y() {
        System.out.println("y");
    }
}

class Zs extends Ys {
    void z() {
        System.out.println("z");
    }
}

class Zsss implements Is{

}
