package Test2;

import java.util.ArrayList;
import java.util.List;

public class Q29 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("val1");
        list.add("val2");
        list.add(2,"Pug");
        list.add(3,"Pug");  // exception
        System.out.println(list);
    }
}
