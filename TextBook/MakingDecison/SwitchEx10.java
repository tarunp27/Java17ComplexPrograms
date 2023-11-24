package TextBook.MakingDecison;

import java.time.DayOfWeek;

public class SwitchEx10 {
    public static void main(String[] args) {
        SwitchEx10 sw = new SwitchEx10();
        sw.getWeekDay(2,1);
    }

    private DayOfWeek getWeekDay(int day, final int thursday) {
        int otherDay = day;
        final int Sunday = 0;
        switch (otherDay) {
            default:
            case 1:
            case 3:
                return DayOfWeek.THURSDAY;
            case 2, 10:
                break;
            case Sunday:
                return DayOfWeek.SUNDAY;
            case 7:
                return DayOfWeek.MONDAY;
        }
        return DayOfWeek.FRIDAY;
    }
}

