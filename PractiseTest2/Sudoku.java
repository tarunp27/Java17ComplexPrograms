package PractiseTest2;
//q23
//array index null pointer exception
public class Sudoku {
    static int[][] game ;

    public static void main(String[] args) {
//        game[3][3]= 6;
        Object[] obj = game;
        obj[1] = 6;
    }
}
