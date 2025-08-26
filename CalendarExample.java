package OOP_skill;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();  // No conflict now

        System.out.println("Current date: " + d);

        c.set(2023, Calendar.SEPTEMBER, 13);
        int year = c.getWeekYear();
        System.out.println("Week Year: " + year);

        int firstDayOfWeek = c.getFirstDayOfWeek();
        System.out.println("First Day of Week: " + firstDayOfWeek);
    }
}
