package LetusGetCertifiec;

public class q657_Prec {
}


class Xx{
    int val = 10;
}

class Yy extends Xx{
    Integer val = null; //1
}

class TestClassess extends Xx{

    public static void main(String[] args){
        Yy y = new Yy();
        int k = ((Xx) y).val ; //2
        System.out.println(k);

    }
}

