package TextBook;

public class MakingDecsion {
    public static void main(String[] args) {
        int count = 0;
        BUNNY: for(int row = 1; row <=3; row++)
            RABBIT: for(int col = 0; col <3 ; col++) {
                if((col + row) % 2 == 0)
                    break RABBIT;
                count++;
            }
        System.out.println(count);
    }
}
