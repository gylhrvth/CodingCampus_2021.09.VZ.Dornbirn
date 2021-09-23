package Stefan.SecondWeek;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Kalender {

    public static void main(String[] args) {


        GregorianCalendar cal = new GregorianCalendar();
        String monat = new SimpleDateFormat("MMMM  yyyy", Locale.GERMAN).format(cal.getTime());
        System.out.println(monat + "\n");


        int days = 30;
        int offset = 5;

        String headline = "| MO | DI | MI | DO | FR | SA | SO |";


        System.out.println(headline);

        for (int monthDays = 1; monthDays < days + offset; monthDays++) {
            if (monthDays - offset < 0) {
                System.out.print("|    ");
            }
            else if (monthDays - offset +1  < 10) {
                System.out.print("| " + (monthDays - offset +1) + "  ");
            } else {
                System.out.print("| " + (monthDays - offset +1) + " ");
            }
            if (monthDays % 7 == 0) {
                System.out.print("|");
                System.out.println();
            }
        }

        int missingSpaces = 7 - ((days + offset -1) % 7);

        for (int i = 0; i < missingSpaces; i++) {
            System.out.print("|    ");
        }
        System.out.print("|");

    }
}
