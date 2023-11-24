package UT3;

public class ArgsExample {

    public static void main(String[] args) {

        String[] argh = {"x", "y", "b"};
//        System.out.println(args[0]);
        args = argh;
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        String[] argi = {"x", "y", "b", "c", "d"};
        args = argi;
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }
}



