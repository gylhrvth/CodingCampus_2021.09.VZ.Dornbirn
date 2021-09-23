package Bartosz.week2;

import Bartosz.week2.calender.weekDays;
import Bartosz.week2.calender.monthAndDate;

public class CalendarRun {
    public static void printCalendar(int maxDays, int offset) {
        weekDays.printWeekdays();
        monthAndDate.printDate(maxDays, offset);
    }
}
