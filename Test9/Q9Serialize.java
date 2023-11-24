package Test9;

import java.io.*;

class Boo {
    public Boo() {
        System.out.println("In Boo");
    }
}

class BooBoo extends Boo {
    public BooBoo() {
        System.out.println("In BooBoo");
    }
}

class Moo extends BooBoo implements Serializable{
    int moo = 10;

    {
        System.out.println("moo set to 10");
    }

    public Moo() {
        System.out.println("In Moo");
    }
}

public class Q9Serialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Moo moo = new Moo();
        moo.moo = 20;
        FileOutputStream fos = new FileOutputStream("c:\\temp\\moo1.ser");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(moo);
        os.close();
        System.out.println("-----------------------------");
        FileInputStream fis = new FileInputStream("c:\\temp\\moo1.ser");
        ObjectInputStream is = new ObjectInputStream(fis);
        Moo moo1 = (Moo) is.readObject();
        is.close();
        System.out.println(moo1.moo);


    }
}
