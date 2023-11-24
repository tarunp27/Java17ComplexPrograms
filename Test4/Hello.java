package Test4;

public interface Hello {
    public int hello(int x ,int y);
    public long hello(long x,long y);
}
interface Hello2 extends Hello{
    private static void print(){
    }
    public int hello(int x,int y);
}
abstract class A_Hello implements Hello,Hello2{
    public short hello(short a , short b)
    {return 0;}
    public int hello(int d,int f){
        return 0;
    }
}

