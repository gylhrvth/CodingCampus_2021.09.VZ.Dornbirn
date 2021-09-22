package Saadaq.weekTwo;

import java.util.GregorianCalendar;

public class Calendar {
    public static void main(String[] args) {

        int offset = 2;
        int maxDays = 31;

        String Headline = "| MO | DI | MI | DO | FR | SA | SO |";
        System.out.println(Headline);
        GregorianCalendar gc = new GregorianCalendar(); // Actual time and date
        GregorianCalendar gc2 = new GregorianCalendar(1989, 10, 22);
        GregorianCalendar gc3 = new GregorianCalendar(1989, 10, 22, 10, 20);

        for (int i = 0; i < offset; i++) {
            System.out.print("|    ");
        }

        for (int i = 1; i <= maxDays; i++) {


            if (i < 10) {
                System.out.print("|  " + i + " ");


            } else {
                System.out.print("| " + i + " ");
            }


            if (i == 7 - offset) {
                System.out.println("|");
            }
            if (i == 14 - offset) {
                System.out.println("|");

            }
            if (i == 21 - offset) {
                System.out.println("|");
            }
            if (i == 28 - offset) {
                System.out.println("|");
            }


        }


    }
}
