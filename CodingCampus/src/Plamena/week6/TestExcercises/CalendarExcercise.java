package Plamena.week6.TestExcercises;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExcercise {
    public static void main(String[] args) {
       // sundaysInMonth(2021, 12);
        char test = 51;
        System.out.println(test);

    }

    private static void sundaysInMonth(int year, int month){
        java.util.Calendar cal = Calendar.getInstance();
        cal.set(year,month-1, 1);
        System.out.println(cal);
        int firstDayOfMonth = cal.getActualMinimum(month-1);
        int daysInMonth = cal.get(Calendar.DAY_OF_MONTH);
        int counter = 0;
        int weeksInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);


    }

    private static void calendar(){
        java.util.Calendar cal = java.util.Calendar.getInstance();
        int currentDate = cal.get(java.util.Calendar.DAY_OF_MONTH);
        int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
        int diff = 7 - dayOfWeek;
        int sunday = currentDate + diff + 1;
        System.out.println("Next sunday will be on " + sunday + "." + cal.get(java.util.Calendar.MONTH) + "." + cal.get(java.util.Calendar.YEAR));
    }
}
