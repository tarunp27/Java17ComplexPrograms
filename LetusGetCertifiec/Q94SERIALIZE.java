package LetusGetCertifiec;

import java.io.*;

class Boo{
    int boo = 10;
    int boovar = 500;
    public Boo(){
        System.out.println("Default const Boo");
    }
    public Boo(int k) {
        System.out.println("In Boo k = " + k);
        boo = k;
    }
}

class BooBoo extends Boo implements Serializable {
    int booboovar = 600;
    public BooBoo(){
        System.out.println("Default const BooBoo");
    };
    public BooBoo(int k) {
        super(k);
        System.out.println("In BooBoo k = " + k);
    }
}

class Moo extends BooBoo {
    int moo = 10;
    int moovar = 700;
    static final int age = 99;
    public Moo() {
        super(5);
        System.out.println("In Moo");
    }
}

public class Q94SERIALIZE  {
    public static void main(String[] args) throws Exception{
        System.out.println("Program Started");
        Moo   moo  = new Moo();
        System.out.println("Object moo created");
        var fos = new FileOutputStream("c:\\temp\\moo1.ser");
        var os = new ObjectOutputStream(fos);
        System.out.println("Before writting serialized object moo");
        moo.boovar++;
        moo.booboovar++;
        moo.moovar++;
        os.writeObject(moo);

        System.out.println("After writting serialized object moo");
        os.close();
        var fis = new FileInputStream("c:\\temp\\moo1.ser");
        var is = new ObjectInputStream(fis);
        System.out.println("Deserialize started");
        moo = (Moo) is.readObject();
        is.close();
        System.out.println(moo.boovar);
        System.out.println(moo.booboovar);
        System.out.println(moo.moovar);
    }
}
