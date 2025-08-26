package OOP_skill;
import java.util.Date;

public class DateExample {
    public static void main(String args[]) {
        Date d = new Date();
        System.out.println("Current date is " + d);

        @SuppressWarnings("deprecation") int month = d.getMonth();  // 0-based
        @SuppressWarnings("deprecation") int year = d.getYear();    // Years since 1900
        @SuppressWarnings("deprecation") int minutes = d.getMinutes();
        @SuppressWarnings("deprecation") int hours = d.getHours();

        System.out.println("Month: " + (month + 1));
        System.out.println("Year: " + (year + 1900));
        System.out.println("Minutes: " + minutes);
        System.out.println("Hours: " + hours);
    }
}
