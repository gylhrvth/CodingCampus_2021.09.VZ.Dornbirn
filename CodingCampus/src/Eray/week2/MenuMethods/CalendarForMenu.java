package Eray.week2.MenuMethods;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarForMenu {
    public static void main(String[] args) {

       printCalendar();
    }

    public static void printCalendar(){
        //Here you can write a Date in
        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar firstDayOfMonth = new GregorianCalendar(
                today.get(Calendar.YEAR),
                today.get(Calendar.MONTH),
                1);


        int actuallyDayOfMonth = today.get(Calendar.DAY_OF_MONTH);
        int maxDays = today.getActualMaximum(Calendar.DAY_OF_MONTH);
        int offset = firstDayOfMonth.get(Calendar.DAY_OF_WEEK) - 2;
        if (offset < 0) {
            offset += 7;
        }

        System.out.println("| Mo | Di | Mi | Do | Fr | Sa | So |");

        for (int j = 0; j < offset; j++) {
            System.out.print("|    ");
        }
        for (int i = 1; i <= maxDays; i++) {
            if (i == actuallyDayOfMonth) {
                System.out.print("|*");
            } else {
                System.out.print("| ");
            }
            System.out.printf("%2d ", i);

            if ((offset + i) % 7 == 0) {
                System.out.println("|");
            }
        }

        int restDaysOfMonth = offset + maxDays;
        if (restDaysOfMonth % 7 != 0) {
            while (restDaysOfMonth % 7 != 0) {
                ++restDaysOfMonth;
                System.out.print("|    ");
            }
            System.out.println("|");
        }
    }
}
