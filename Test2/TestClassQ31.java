package Test2;

//static enum Bear{KF, FO, KO}  // not allowed

abstract class Base{
    abstract int power();
}

class   AA extends Base{
    int power(){
        return 0;
    }
}

public class TestClassQ31 {
    static void processBase(Base base){
        AA a = null;
        if(base instanceof AA aa) {         //A pattern variable is not allowed to shadow a local variable. Here, the processBase method already has a local variable named a.
            System.out.println(aa.power());
        }
        System.out.println("a");
    }
}
