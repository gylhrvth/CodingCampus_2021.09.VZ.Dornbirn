package Bartosz.week2;

import Bartosz.week2.calender.weekDays;
import Bartosz.week2.calender.monthAndDate;

public class CalendarRun {
    public static void main(String[] args) {
        weekDays.printWeekdays();
        System.out.println();

        monthAndDate.printDate(31, 4);
    }
}
