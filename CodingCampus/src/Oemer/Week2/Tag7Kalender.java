package Oemer;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tag7Kalender {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar firstDay = new GregorianCalendar(
                today.get(Calendar.YEAR),
                today.get(Calendar.MONTH),
                1);

        ;
        int offset = firstDay.get(Calendar.DAY_OF_WEEK) - 2;
        if (offset < 0) {
            offset = 7 + offset;
        }

        System.out.println("| Mo | Di | Mi | Do | Fr | Sa | So |");
        int dayOfWeek = 1;
        for (int i = 0; i < offset; i++) {
            System.out.print("|    ");
            ++dayOfWeek;
        }
        for (int i = 1; i <= today.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            if (i == today.get(Calendar.DAY_OF_MONTH)) {
                System.out.print("|*");
            } else {
                System.out.print("| ");
            }
            System.out.printf("%2d ", i);
        }
        {
            // Corrected by Gyula
            //int restDaysOfMonth= offset+ firstDay.getActualMaximum();

            if (dayOfWeek % 7 == 0) {
                System.out.println("|");
            }
            ++dayOfWeek;

        }
    }
}
