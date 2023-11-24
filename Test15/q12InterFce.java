package Test15;

public class q12InterFce {
}

interface I {
    int getI(int a, int b);
}

interface J{
    int getJ(int a, int b, int c);
}

 abstract class MyIJ implements J , I {}

class MyI{
    int getI(int x, int y){ return x+y; }
}

interface K extends J{
    @Override
    default int getJ(int a, int b, int c) {
        return 0;
    }

    int getJ(int a, int b, int c, int d);
}
