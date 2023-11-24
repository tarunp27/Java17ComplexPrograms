package Test2.Revision;

class ClassX{
    void m1(){
        System.out.println("m1()");
    }
}

class ClassY extends ClassX{
    void m2(){
        System.out.println("m2()");
    }
}

public class ClassZ extends ClassY {
    void m3(){
        System.out.println("m3()");
    }
    public static void main(String[] args) {
        ClassZ z = new ClassZ();
        z.m3();              // m1(),m2(),m3() available
        ((ClassY)z).m2();    // m1(),m2()      available
        ((ClassX)((ClassY)z)).m1(); // m1()    available
    }
}
