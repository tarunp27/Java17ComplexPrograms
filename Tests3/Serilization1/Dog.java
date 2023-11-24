package Tests3.Serilization1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;

class Pugal {
    int age = 55;
}

class Animal implements Serializable{
//    private Object stripes = new Object();
    transient Pugal pug = new Pugal();
    Animal(){
        System.out.println("Animal constructor");
    }
    transient int i = 10;
    void sayHellox(){
        System.out.println("Hello Animal");
    }
}
public class Dog extends Animal implements Serializable{
    Dog(){
        System.out.println("Dog constructor");
    }
    int j = 22;
    void sayHelloy(){
        System.out.println("HEllo Dog");
    }
}
class Serilize_Ex {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog d = new Dog();
        d.i = 222;
        d.j = 444;
//        FileOutputStream fos = new FileOutputStream("Dog.dat");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(d);
        try (var oos = new ObjectOutputStream(
                new FileOutputStream("Dog.dat")
        )) {
            System.out.println("before writeobject");
            oos.writeObject(d);
        }
        d.i = 123;
        d.j = 321;

        FileInputStream fis = new FileInputStream("Dog.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println("before readobject");
        Dog d2 = (Dog) ois.readObject();
        System.out.println(d2.i + " " + d2.j);
        System.out.println(d.i + " " + d.j);
        d2.sayHelloy();
        d2.sayHellox();

        Supplier<ArrayList<String>> s3 = ArrayList::new;
        ArrayList<String> a1 =s3.get();
        System.out.println(a1);
    }

}
