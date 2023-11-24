package LetusGetCertifiec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Overriding_Variables {
}
class TestClassic{

    public static void main(String[] args) {
        A o = new C();
        System.out.println(o.m1()+" "+o.i);
        C oo = (C)o;
        System.out.println(oo.m1()+" "+oo.i);

    }
}
class A{
    int i=10;
    int m1(){
        return i;
    }

}
class B extends A{
    int i =20;
    int m1(){
        return i;
    }
}
class C extends B{
    int i =30;
    int m1(){
        return i;
    }
}
