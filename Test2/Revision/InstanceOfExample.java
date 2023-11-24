package Test2.Revision;

class E {
    void m1(){
        System.out.println("E");
    }
}
class F extends E {
    void m2(){
        System.out.println("F");
    }
}
class G extends F {
    void m3(){
        System.out.println("G");
    }
}
class H extends G {
    void m4() {
        System.out.println("H");
    }
}
class I extends H {
    void m5(){
        System.out.println("I");
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        E obj = new G();
    //    if (obj instanceof E i1) {i1.m1();}
        if (obj instanceof F i1) {i1.m2();}
        if (obj instanceof G i1) {i1.m3();}
        if (obj instanceof H i1) {i1.m4();}
        if (obj instanceof I i1) {i1.m5();}
    }
}
