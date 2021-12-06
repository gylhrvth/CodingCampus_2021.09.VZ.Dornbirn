package Stefan.Week2.Scanner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Kalender1 {

    public static void main(String[] args) {
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_PURPLE = "\u001B[35m";
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


        String monat = new SimpleDateFormat("MMMM  yyyy", Locale.GERMAN).format(today.getTime());
        System.out.printf(ANSI_YELLOW + monat + ANSI_RESET + "\n");


        String headline = "| MO | DI | MI | DO | FR | SA | SO |";
        System.out.println(headline);

        for (int i = 0; i < offset; i++) {
            System.out.print("|    ");
        }
        for (int i = 1; i <= maxDays; i++) {

            System.out.print("| ");
            if (i == actualDayOfMonth) {
                System.out.printf("%s%2d%s ", ANSI_PURPLE, i, ANSI_RESET);
            } else if ((offset + i) % 7 == 0) {
                System.out.printf("%s%2d%s ", ANSI_RED, i, ANSI_RESET);
            } else {
                System.out.printf("%2d ", i);
            }

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


        {

        }
    }
}
