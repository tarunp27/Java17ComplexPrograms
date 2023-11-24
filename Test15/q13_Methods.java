package Test15;

public class q13_Methods {
}


 class TestClassics{
    static TestClassics ref;
    String[] arguments;
    public static void main(String args[]){
        ref = new TestClassics();
        ref.func(args);
    }
    public void func(String[] args){
        ref.arguments = args;
    }
}

