package Bartosz.week2;

import Bartosz.week2.calender.weekDays;
import Bartosz.week2.calender.monthAndDate;

public class CalendarRun {
    public static void printCalendar() {
        weekDays.printWeekdays();
        System.out.println();

        monthAndDate.printDate(31, 4);
    }
}
