package Test8;

import java.io.IOException;

public class Q26 {
    public static int[] getArray() {
//        return new int[]{4,1,9};
        return null;
    }

    public static void main(String[] args) {
        int index = 1;
        try {
//            getArray()[index=2]--;
            getArray()[index=2]++;
        } catch (Exception e) {
            e.printStackTrace();
        }  //empty catch
        System.out.println("index = " + index);
    }
}
