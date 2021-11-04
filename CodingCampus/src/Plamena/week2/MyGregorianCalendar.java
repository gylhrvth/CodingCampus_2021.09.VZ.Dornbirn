package Plamena.week2;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class MyGregorianCalendar {
    public static void main(String[] args) {
        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();

        java.util.GregorianCalendar firstDayOfMonth = new java.util.GregorianCalendar(
                gc.get(java.util.GregorianCalendar.YEAR),
                gc.get(java.util.GregorianCalendar.MONTH),
                1
        );

        int daysInMonth = gc.getActualMaximum(java.util.GregorianCalendar.DAY_OF_MONTH);
        int currentDay = gc.get(java.util.GregorianCalendar.DAY_OF_MONTH);
        int offset = firstDayOfMonth.get(java.util.Calendar.DAY_OF_WEEK) - 2;

        if (offset < 0) {
            offset += 7;
        }

        SimpleDateFormat currentDate = new SimpleDateFormat("yyyy, MMMM");
        System.out.println(currentDate.format(gc.getTime()));

        Calendar.printWeekdays();

        for (int i = 1; i <= offset; i++) {
            System.out.print("|    ");
        }

        for (int i = 1; i <= daysInMonth; i++) {
            if ((i + offset) % 7 == 0 || (i + offset + 1) % 7 == 0) {
                System.out.print("|  WE");
            } else {
                System.out.printf("|  %2d", i);
            }

            if ((i + offset) % 7 == 0) {
                System.out.println("|");
            }
        }

        int rest = offset + daysInMonth;

        while (rest % 7 != 0) {
            rest++;
            System.out.printf("| %3s", " ");
        }

        if ((offset + daysInMonth + rest) % 7 != 0) {
            System.out.println("|");
        }

    }

    public static void printAnyYearWithWE(int year) {


        for (int month = 0; month <= 11; month++) {
            java.util.GregorianCalendar firstDayOfYear = new java.util.GregorianCalendar(year, month, 1);

            int daysInMonth = firstDayOfYear.getActualMaximum(java.util.GregorianCalendar.DAY_OF_MONTH);
         //   int currentDay = firstDayOfYear.get(GregorianCalendar.DAY_OF_MONTH);
            int offset = firstDayOfYear.get(java.util.Calendar.DAY_OF_WEEK) - 2;

            if (offset < 0) {
                offset += 7;
            }

            //       SimpleDateFormat currentDate = new SimpleDateFormat("yyyy, MMMM");
            //       System.out.println(currentDate.format(gc.getTime()));

            Calendar.printWeekdays();

            for (int i = 1; i <= offset; i++) {
                System.out.print("|    ");
            }

            for (int i = 1; i <= daysInMonth; i++) {
                if ((i + offset) % 7 == 0 || ((i + offset) % 7 == 6)) {
                    System.out.print("|  WE");
                } else {
                    System.out.printf("|  %2d", i);
                }

                if ((i + offset) % 7 == 0) {
                    System.out.println("|");
                }
            }

            int rest = offset + daysInMonth;

            while (rest % 7 != 0) {
                rest++;
                System.out.printf("| %3s", " ");
            }

            if ((offset + daysInMonth + rest) % 7 != 0) {
                System.out.println("|");
            }

        }
    }


    public static void printGregorianCalenderWithWE(int year, int month, int day) {
        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();

        java.util.GregorianCalendar firstDayOfMonth = new java.util.GregorianCalendar(
                gc.get(java.util.GregorianCalendar.YEAR),
                gc.get(java.util.GregorianCalendar.MONTH),
                1
        );

        int daysInMonth = gc.getActualMaximum(java.util.GregorianCalendar.DAY_OF_MONTH);
        int currentDay = gc.get(java.util.GregorianCalendar.DAY_OF_MONTH);
        int offset = firstDayOfMonth.get(java.util.Calendar.DAY_OF_WEEK) - 2;

        if (offset < 0) {
            offset += 7;
        }

        SimpleDateFormat currentDate = new SimpleDateFormat("yyyy, MMMM");
        System.out.println(currentDate.format(gc.getTime()));

        Calendar.printWeekdays();

        for (int i = 1; i <= offset; i++) {
            System.out.print("|    ");
        }

        for (int i = 1; i <= daysInMonth; i++) {
            if ((i + offset) % 7 == 0 || ((i + offset) % 7 == 6)) {
                System.out.print("|  WE");
            } else {
                System.out.printf("|  %2d", i);
            }

            if ((i + offset) % 7 == 0) {
                System.out.println("|");
            }
        }

        int rest = offset + daysInMonth;

        while (rest % 7 != 0) {
            rest++;
            System.out.printf("| %3s", " ");
        }

        if ((offset + daysInMonth + rest) % 7 != 0) {
            System.out.println("|");
        }

    }


    public static void printGregorianCalender(int year, int month, int day) {
        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();

        java.util.GregorianCalendar firstDayOfMonth = new java.util.GregorianCalendar(
                gc.get(java.util.GregorianCalendar.YEAR),
                gc.get(java.util.GregorianCalendar.MONTH),
                1
        );

        int daysInMonth = gc.getActualMaximum(java.util.GregorianCalendar.DAY_OF_MONTH);
        int currentDay = gc.get(java.util.GregorianCalendar.DAY_OF_MONTH);
        int offset = firstDayOfMonth.get(java.util.Calendar.DAY_OF_WEEK) - 2;

        if (offset < 0) {
            offset += 7;
        }

        SimpleDateFormat currentDate = new SimpleDateFormat("yyyy, MMMM");
        System.out.println(currentDate.format(gc.getTime()));

        Calendar.printWeekdays();

        for (int i = 1; i <= offset; i++) {
            System.out.print("|    ");
        }

        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("| %s%2d", (i == currentDay ? "*" : " "), i);
            if ((i + offset) % 7 == 0) {
                System.out.println("|");
            }
        }

        int rest = offset + daysInMonth;

        while (rest % 7 != 0) {
            rest++;
            System.out.printf("| %3s", " ");
        }

        if ((offset + daysInMonth + rest) % 7 != 0) {
            System.out.println("|");
        }


    }
}
