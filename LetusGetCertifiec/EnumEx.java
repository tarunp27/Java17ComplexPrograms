package LetusGetCertifiec;

enum Switch{
    ON, OFF;
    Switch(){
        System.out.println("Constructor called");
    }
};

public class EnumEx {
    public static void main(String[] args) {
        Switch s = Switch.OFF;
        Switch x = Switch.OFF;
        System.out.println(x==s);
    }
}
