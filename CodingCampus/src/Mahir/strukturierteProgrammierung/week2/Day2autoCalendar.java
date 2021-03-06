package Mahir.strukturierteProgrammierung.week2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Day2autoCalendar {


    public static void main(String[] args) {
        GregorianCalendar day = new GregorianCalendar(2021, 8, 19);
        GregorianCalendar start = new GregorianCalendar(
                day.get(Calendar.YEAR),
                day.get(Calendar.MONTH),
                1
        );


        int maxDaysOfMonth = day.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        int offset = start.get(Calendar.DAY_OF_WEEK) - 2;

        if (offset < 0) {
            offset = 7 + offset;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM Y");
        System.out.println(sdf.format(day.getTime()));
        headline();
        System.out.println();
        for (int i = 0; i < offset; i++) {
            System.out.print("|      ");
        }
        for (int a = 1; a <= maxDaysOfMonth; a++) {
            boolean isSaturday = (offset + a) % 7 == 6;
            boolean isSunday = (offset + a) % 7 == 0;


            if (a == day.get(GregorianCalendar.DAY_OF_MONTH)) {
                System.out.print("|  " + "\u001B[31m");
            } else {
                System.out.print("|  ");
            }
            if (isSaturday || isSunday) {
                System.out.print("WE  ");
            } else {
                System.out.printf("%2d  ", a);
            }
            System.out.print("\u001B[0m");
            if (isSunday) {
                System.out.println("|");
            }
        }
        int restDaysOfTheMonth = offset + maxDaysOfMonth;
        if (restDaysOfTheMonth % 7 != 0) {
            while (restDaysOfTheMonth % 7 != 0) {
                restDaysOfTheMonth++;
                System.out.print("|      ");
            }
            System.out.print("|");
        }
    }

    public static void headline() {
        String Headline = "|  Mo  |  Di  |  Mi  |  Do  |  Fr  |  Sa  |  So  |";
        System.out.print(Headline);
    }
    public static void calender(){
         GregorianCalendar day = new GregorianCalendar(2021, 8, 19);
        GregorianCalendar start = new GregorianCalendar(
                day.get(Calendar.YEAR),
                day.get(Calendar.MONTH),
                1
        );


        int maxDaysOfMonth = day.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        int offset = start.get(Calendar.DAY_OF_WEEK) - 2;

        if (offset < 0) {
            offset = 7 + offset;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM Y");
        System.out.println(sdf.format(day.getTime()));
        headline();
        System.out.println();
        for (int i = 0; i < offset; i++) {
            System.out.print("|      ");
        }
        for (int a = 1; a <= maxDaysOfMonth; a++) {
            boolean isSaturday = (offset + a) % 7 == 6;
            boolean isSunday = (offset + a) % 7 == 0;


            if (a == day.get(GregorianCalendar.DAY_OF_MONTH)) {
                System.out.print("|  " + "\u001B[31m");
            } else {
                System.out.print("|  ");
            }
            if (isSaturday || isSunday) {
                System.out.print("WE  ");
            } else {
                System.out.printf("%2d  ", a);
            }
            System.out.print("\u001B[0m");
            if (isSunday) {
                System.out.println("|");
            }
        }
        int restDaysOfTheMonth = offset + maxDaysOfMonth;
        if (restDaysOfTheMonth % 7 != 0) {
            while (restDaysOfTheMonth % 7 != 0) {
                restDaysOfTheMonth++;
                System.out.print("|      ");
            }
            System.out.print("|");
        }

    }

}




