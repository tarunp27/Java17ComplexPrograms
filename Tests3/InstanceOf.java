package Tests3;

public class InstanceOf {
    public static void main(String[] args) {
        Bs b = new Bs();
        if (b instanceof As){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
class As{
}
class Bs extends As{
}


