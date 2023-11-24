package LetusGetCertifiec;

class X {
    int val = 10;
}

class Y extends X{
    Y val = null;
}

public class DotPrecedence extends Y {
    public static void main(String[] args) {
        Y y = new Y();
//        int j = (X) y.val;
        int k = ((X) y).val;
        System.out.println(y.val);
        System.out.println(k);
    }
}
