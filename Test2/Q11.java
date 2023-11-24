package Test2;

import java.util.ArrayList;
import java.util.List;

public class Q11 {
    public static void main(String[] args) {
        var ia =new int [][] {{1, 2}, null};  // valid
        int ia1[][] = new int[2][];    // valid
        int ia2[][] = {{1,2},null};    // valid

//        for (int i = 0; i < 2; i++) for (int j = 0; j < 2; j++) System.out.println(ia[i][j]);   // any this will give nullpointerexception
        List list = new ArrayList();
        list.add("val1");
        list.add(0,"pug1");
//        list.add(1,"pug2");
        list.add(2,"pug3");
        System.out.println(list);
    }
}
