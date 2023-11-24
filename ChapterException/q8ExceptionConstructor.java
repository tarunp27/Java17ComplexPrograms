package ChapterException;

class Parent{
    Parent(){
        System.out.println("Parent Constructor called");
    }
    Parent(Parent p){
        System.out.println("Parent 1 arg constructor");
    }
}

public class q8ExceptionConstructor extends Parent {
//    q8ExceptionConstructor(){
//        super();
//        System.out.println("No arg constructor in q8ExceptionConstructor");
//    }
    q8ExceptionConstructor(String msg){
        super(new Parent(new Parent()));
    }
    public static void main(String[] args) {
        new q8ExceptionConstructor("Tarun");
    }
}
