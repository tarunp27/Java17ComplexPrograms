package LetusGetCertifiec;

public class MyGenerics <E, F> {
    E name ;
    F age;
    <T> void play(T parm){
        System.out.println("Method play "+name +" "+parm);
    }
}

class Main{
    public static void main(String[] args) {
        MyGenerics<String, Integer> mg1 = new MyGenerics<>();
        MyGenerics<StringBuilder, Double> mg2 = new MyGenerics<>();

        mg1.name ="Pugal";
        mg1.age = 58;

        mg2.name =new StringBuilder("Pugal");
        mg2.age = 58.0;

        mg1.<Double>play(999.99);

        final var tu1 = new Tarun(5);
        var tu2 = new Tarun(10);
        tu1.link = tu2;
        tu2.link = setIt(tu1,tu2);

        System.out.println(tu1==null);
//        System.out.println(tu1);

        System.out.println(tu1.link+" "+tu2.link.value);


    }

    public static Tarun setIt(final Tarun x, final Tarun y){
        x.link = y.link;
        return x;
    }
}

class Tarun{
    int value = 5;
    Tarun link;
    public Tarun(int val) {
        this.value = val;
    }


}
