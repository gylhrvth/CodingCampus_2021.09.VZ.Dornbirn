package Eray.week6.uebungsBeispiele;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class CalendarTask {
    public static void main(String[] args) {

        printCalendarMainMenu();
    }

    private static void printCalendarMainMenu() {

        //print Sundays
        getSunday();


    }


    private static GregorianCalendar today = new GregorianCalendar();
    private static GregorianCalendar firstDayOfMonth = new GregorianCalendar(
            today.get(java.util.Calendar.YEAR),
            today.get(java.util.Calendar.MONTH),
            1);

    private static int maxDays = today.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
    private static int startDay = today.get(java.util.Calendar.DAY_OF_WEEK) - 2;


    private static void getSunday() {
        System.out.println("Wie viele Sonntage hat der Monat");

        System.out.println("Der Monat hat " + countWeekendDays(2021, 10) + " Sonntage");
    }

    private static int countWeekendDays(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        // Note that month is 0-based in calendar, bizarrely.
        calendar.set(year, month - 1, 1);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (int day = 1; day <= daysInMonth; day++) {
            calendar.set(year, month - 1, day);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == Calendar.SATURDAY) {
                count++;

            }
        }
        return count;
    }


//
//    private static void getWorkingDays(String month) {
//        System.out.println("Wie viele Arbeitstage hat der Monat");
//        int getWorkingDays = checkDaysOfMonth(month) / 7;
//        System.out.println("Der Monat hat " + getWorkingDays + " Arbeitstage");
//    }


}
