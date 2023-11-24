package CHapter2;

public class Q5 {
    public static void main(String[] args) {
         int m = 0, n = 0;
         while (m < 5) {
             n++;
             if (m == 3)
                continue;
             switch (m) {
                 case 0:
                     case 1:
                     n++;
                     default:
                     n++;
                     }
            m++;
             }
         System.out.println(m + " " + n);
    }
}
