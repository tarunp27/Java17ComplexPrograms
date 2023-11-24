package Test4;

import java.time.LocalDate;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.TUESDAY;

// CONTROL FLOW
public class Q48CF {
    public static void main(String[] args) {
        int var = 20, i=0;
        while(true){
            var = var + i;
            if( i++ > var) break;
        }
        int x = 3;

//        for(int j = 0; true ; i++)
//        {
//            x = 3;
//        }
        var day = LocalDate.now().with(TUESDAY).getDayOfWeek();
        System.out.println(day);
    }
}
