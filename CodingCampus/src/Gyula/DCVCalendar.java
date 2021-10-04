package Gyula;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DCVCalendar {
    public static void main(String[] args) {

        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar firstDayOfMonth = new GregorianCalendar(
                today.get(Calendar.YEAR),
                today.get(Calendar.MONTH),
                1);

        int actualDayOfMonth = today.get(Calendar.DAY_OF_MONTH);
        int maxDays = today.getActualMaximum(Calendar.DAY_OF_MONTH);
        int offset = firstDayOfMonth.get(Calendar.DAY_OF_WEEK) - 2;
        if (offset < 0) {
            offset += 7;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("MMMM Y");
        String textDate = sdf.format(today.getTime());
        String headerText = "| Mo | Di | Mi | Do | Fr | Sa | So |";

        System.out.println(" ".repeat((headerText.length() - textDate.length())/2) + textDate);
        System.out.println(headerText);


        for (int i = 0; i < offset; i++) {
            System.out.print("|    ");
        }
        for (int i = 1; i <= maxDays; i++) {
            if (i == actualDayOfMonth){
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
