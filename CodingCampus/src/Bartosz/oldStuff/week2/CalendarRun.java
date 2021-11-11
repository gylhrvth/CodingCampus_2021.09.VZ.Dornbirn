package Bartosz.oldStuff.week2;

import Bartosz.oldStuff.week2.calender.monthAndDate;
import Bartosz.oldStuff.week2.calender.weekDays;

public class CalendarRun {
    public static void printCalendar(int maxDays, int offset) {
        weekDays.printWeekdays();
        monthAndDate.printDate(maxDays, offset);
        System.out.println();
    }
}
