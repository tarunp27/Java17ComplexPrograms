package Test2.Revision;

class ClassA {
    ClassA() { print();}
    void print(){ System.out.println("ClassA"); }
}
public class Override extends ClassA {
    int i = 4;
    public static void main(String[] args) {
        ClassA a = new Override();
        a.print();
    }
    void print(){ System.out.println(i+" *"); }
}
