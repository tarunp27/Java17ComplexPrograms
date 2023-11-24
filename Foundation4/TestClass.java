package Foundation4;

public class TestClass {
    static int si = 10;   int ii = 20;
    public  void inner()
    {
        var ai = 30; //automatic variable
        ai = 31;//ai is not effectively final anymore.
        var fai = 40; //automatic final variable.
        //Yes, a final local variable may also use var declaration
        class Inner
        {
            public Inner()  {  System.out.println(si+"  "+ii+"   "+fai);  }
        }
        new Inner();
    }
    public static void main(String[] args){  new TestClass().inner();
    }
}

