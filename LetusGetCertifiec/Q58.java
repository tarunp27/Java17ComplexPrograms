package LetusGetCertifiec;

class DatabaseWrapper {
    String url = "jdbc://derby://localhost:1527//mydb";

    static DatabaseWrapper getDatabase() {
        System.out.println("Getting DB");
        return new DatabaseWrapper();
    }
    public static void main(String[] args) {
        System.out.println(getDatabase().url);
    }

}

public class Q58 {

}
