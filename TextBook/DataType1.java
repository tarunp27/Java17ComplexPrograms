package TextBook;

import java.util.ArrayList;
import java.util.List;

public class DataType1 {
    public static void main(String[] args) {
        for (var penguin : new int[2])
            System.out.println(penguin);
        var ostrich = new Character[3];
        for (var emu : ostrich)
            System.out.println(emu);
        List<Integer> parrots = new ArrayList<Integer>(2);
        for (var macaw : parrots)
            System.out.println(macaw);

        int snake = 0;
        do{
            System.out.println(snake);
            snake++;
        } while(snake <= 5);


    }
}
