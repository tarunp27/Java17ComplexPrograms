package Test2;

class Super1 {
    static String ID ="QBANK1";
    static {
        System.out.println("static block in Super1");
    }
}

class Sub extends Super1{
//    static String ID ="QBANK2";
    static {
        System.out.println("Static block in Sub");
    }
    {
        System.out.println("Instance block in Sub");
    }
}

public class Question17 {
    public static void main(String[] args) {
        System.out.println(Sub.ID);
//        Sub s = new Sub();
    }

    public static String hidePhone(String fullPhoneNumber)
    {
        return new StringBuilder(fullPhoneNumber).append("xxxx", 8, 12).toString();
    }


}

