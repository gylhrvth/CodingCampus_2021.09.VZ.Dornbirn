package Bartosz.week2.calender;

public class WeekDays {
    public static void printWeekdays() {
        String[] weekdays = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};

        System.out.print("|");
        for (int dayRegister = 0; dayRegister < weekdays.length; dayRegister++) {
            System.out.print(" " + weekdays[dayRegister] + " " + "|");
        }

    }
}

