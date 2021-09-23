package Danny.Woche2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMet {

    public static void main(String[] args) {


        GregorianCalendar today = new GregorianCalendar(2021, 7, 10); // für aktuelles Datum leer lassen
        GregorianCalendar firstDayOfMonth = new GregorianCalendar(
                today.get(Calendar.YEAR),
                today.get(Calendar.MONTH),
                1);

        int actualDayOfMonth = today.get(Calendar.DAY_OF_MONTH);
        int daysPerMonth = today.getActualMaximum(Calendar.DAY_OF_MONTH);
        int space = firstDayOfMonth.get(Calendar.DAY_OF_WEEK) - 2;

        if (space < 0) {
            space += 7;
        }


        weekdays();
        indentation(space);
        representDays(daysPerMonth, actualDayOfMonth, space);
        restFields(space, daysPerMonth);

    }

    public static void weekdays() {
        System.out.println("|  Mo  |  Di  |  Mi  |  Do  |  Fr  |  Sa  |  So  |");

    }

    public static void indentation(int space) {
        for (int y = 0; y < space; y++) {
            System.out.print("|      ");
        }
    }

    public static void representDays(int daysPerMonth, int actualDayOfMonth, int space) {
        int dayCounter = 1;
        for (int x = 1; x <= daysPerMonth; x++) {
            boolean isSaturday = (x + space) % 7 == 6;
            boolean isSunday = (x + space) % 7 == 0;
            if (x == actualDayOfMonth && isSaturday) {
                System.out.printf("| WE%2d*", x);
            } else if (x == actualDayOfMonth && isSunday) {
                System.out.printf("| WE%2d*", x);
                System.out.println("|");
            } else if (x == actualDayOfMonth) {
                System.out.printf("|  %2d* ", x);
            } else if (isSaturday) {
                System.out.printf("| WE%2d ", x);
            } else if (isSunday) {
                System.out.printf("| WE%2d ", x);
                System.out.println("|");
            } else {
                System.out.printf("|  %2d  ", x);
            }
            dayCounter++;
            if (dayCounter == 7) {
                dayCounter = 0;
            }
        }
    }


    public static void restFields(int space, int daysPerMonth) {
        int rest = (space + daysPerMonth) % 7;
        for (int x = 0; x < 7 - rest; x++) {
            System.out.print("|      ");
        }
        System.out.println("|");
    }


}

