package Test9;

interface I1 {
    void m1() throws java.io.IOException;
}

interface I2 {
    void m1() throws java.sql.SQLException;
}

public class Q3 implements I1, I2{
    public static void main(String[] args) {
        Q3 q = new Q3();
        q.m1();

//        I1 i1=  (I1) q;    // you should put this in try/catch block or throws Exceptin in main method.
//        i1.m1();
//
//        I1 i = new Q3();
//        i.m1();

        try{
            I2 i2 = (I2) q;
            i2.m1();
        } catch (Exception e) {};

    }
    public void m1(){
        System.out.println("implemented m1()");
    }
}
