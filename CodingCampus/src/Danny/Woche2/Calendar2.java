package Danny.Woche2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar2 {

    public static void main(String[] args) {


        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar firstDayOfMonth = new GregorianCalendar(
                today.get(Calendar.YEAR),
                today.get(Calendar.MONTH),
                1);

        int i = 0;
        int actualDayOfMonth = today.get(Calendar.DAY_OF_MONTH);
        int daysPerMonth = today.getActualMaximum(Calendar.DAY_OF_MONTH);
        int space = firstDayOfMonth.get(Calendar.DAY_OF_WEEK) - 2;
        if (space < 0) {
            space += 7;
        }

        System.out.println("|  Mo  |  Di  |  Mi  |  Do  |  Fr  |  Sa  |  So  |");

        for (int y = 0; y < space; y++) {
            System.out.print("|      ");
        }
        for (int x = 1; x <= daysPerMonth; x++) {
            if (x == actualDayOfMonth && ((x + space - i) % 6 == 0)) {
                System.out.printf("| WE%2d*", x);
            } else {
                if (x == actualDayOfMonth && ((x + space ) % 7 == 0)) {
                    System.out.printf("| WE%2d*", x);
                    System.out.println("|");
                    i++;
                } else {
                    if (x == actualDayOfMonth) {
                        System.out.printf("|  %2d* ", x);
                    } else {
                        if ((x + space - i) % 6 == 0) {
                            System.out.printf("| WE%2d ", x);
                        } else {
                            if ((x + space) % 7 == 0) {
                                System.out.printf("| WE%2d ", x);
                                System.out.println("|");
                                i++;
                            } else {
                                System.out.printf("|  %2d  ", x);
                            }
                        }
                    }
                }
            }
        }
        int rest = (space + daysPerMonth) % 7;
        for (int x = 0; x < 7 - rest; x++) {
            System.out.print("|      ");
        }
        System.out.println("|");
    }
}
