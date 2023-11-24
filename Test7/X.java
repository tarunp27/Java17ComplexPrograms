package Test7;

import java.util.StringTokenizer;

public class X {
    public int getCode(){
        return 2;
    }
}
class Y extends  X{

    public int getCode(){
        return 3;
    }
}
class TestClass{
    public static void main(String[] args){
        X x = new X();
        Y y = new Y();
        System.out.println(x.getCode()+" "+y.getCode());
    }
}
