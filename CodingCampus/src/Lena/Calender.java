package Lena;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calender {


    public static void main(String[] args) throws ParseException {
        Calendar now = new GregorianCalendar();
        GregorianCalendar midday = new GregorianCalendar(
                now.get(Calendar.YEAR),
                now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH),
                12,
                0
        );
        GregorianCalendar tomorrow = (GregorianCalendar) midday.clone();
        tomorrow.add(Calendar.DAY_OF_MONTH, 1);

        System.out.println(now.getTime());


        drawCalender();

        findeDifferenz(tomorrow.getTime());


    }

    public static void drawCalender() {
        Calendar calendar = new GregorianCalendar();

        int offset = getOffset(calendar);
        int amountOfDayOfMonth = getAmountOfDaysOfMonth(calendar.get((Calendar.MONTH)), calendar);
        drawCalenderHead();

        drawNumbers(amountOfDayOfMonth, offset, calendar);

        drawEmptyDays(amountOfDayOfMonth, offset);
    }

    public static void drawNumbers(int amountOfDayOfMonth, int offset, Calendar calendar) {
        for (int i = 1; i <= amountOfDayOfMonth + offset; i++) {
            printNumber(i - offset, calendar);
            checkLineEnd(i);
        }
    }

    public static void checkLineEnd(int i) {
        if (i % 7 == 0) {
            System.out.println("|");
        }
    }

    public static void printNumber(int i, Calendar calendar) {
        if (i > 0) {
            if (i < 10) {
                System.out.print("| " + i + "  ");
            } else if (i == calendar.get(Calendar.DAY_OF_MONTH)) {
                System.out.print("| " + i + "*");
            } else {
                System.out.print("| " + i + " ");
            }
        } else {
            System.out.print("|    ");
        }
    }


    public static void drawCalenderHead() {
        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
    }


    public static void drawEmptyDays(int amountOfDays, int offset) {
        int missing = 7 - (amountOfDays + offset) % 7;
        for (int i = 0; i < missing; i++) {
            System.out.print("|    ");
        }
        System.out.println("|");
    }


    public static int getOffset(Calendar calendar) {
        int offset = 2;

        offset = (calendar.get(Calendar.DAY_OF_MONTH) + calendar.get(Calendar.DAY_OF_WEEK)) % 7 - 1;


        return offset;

    }

    public static int getAmountOfDaysOfMonth(int actualMonth1, Calendar calendar) {
        int actualMonth = actualMonth1 + 1;
        int amountOfDays = 0;

        switch (actualMonth) {

            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                amountOfDays = 31;
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                amountOfDays = 30;
                break;
            case (2):
                if (calendar.get(Calendar.YEAR) % 4 == 0 && calendar.get(Calendar.YEAR) % 100 != 0) {
                    amountOfDays = 29;
                } else amountOfDays = 28;
                break;
        }

        return amountOfDays;
    }


    public static void findeDifferenz(Date date) throws ParseException {
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        Date newMoon = sdf.parse("13-01-2021 06:00:00");
        Date fullmoon2 = date;
        long difference_In_Time1 = fullmoon2.getTime() - newMoon.getTime();


        long moonCycleInMs = 2953058L * 24 * 6 * 6;

        System.out.println(difference_In_Time1);
        System.out.println(difference_In_Time1 % moonCycleInMs);
        System.out.println((difference_In_Time1 % moonCycleInMs) * 100.0 / moonCycleInMs);
        // 0 - Neumond
        // 25 - w.Halbmond
        // 50 - Vollmond
        // 75 - a.Halbmond
        // 100 - Neumond


        //double difference_In_Minutes = (result);

//        System.out.println(difference_In_Minutes);


    }

}
