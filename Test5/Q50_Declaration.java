package Test5;

public class Q50_Declaration {
    int a;

    int f() {
        return a;
    }

    static int b;
    //    static int g(){    valid too
    static int g
    () {
        return b;
    }
}

