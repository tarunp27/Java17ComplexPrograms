package UT4;

public class q8_StaticInitError {
}

class AX{
    static int[] x = new int[0];
    static{
        x[0] = 10;
    }
    public static void main(String[] args){
        var ax = new AX();
    }
}


