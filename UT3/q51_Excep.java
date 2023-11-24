package UT3;

public class q51_Excep {
    public static void main(String[] args) {
        Exception e = null;
        try{throw e;}
        catch (Exception s){
            System.out.println(s.getMessage());
        }
    }
}
