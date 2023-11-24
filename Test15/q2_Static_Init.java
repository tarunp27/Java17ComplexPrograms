package Test15;

import javax.xml.crypto.Data;

public class q2_Static_Init {
}


class DatabaseWrapper
{
    String url = "jdbc://derby://localhost:1527//mydb";
    static DatabaseWrapper getDatabase()
    {
        System.out.println("Getting DB");
        return null;
    }
    public static void main(String[ ] args)
    {
        System.out.println(getDatabase().url );
    }

}
