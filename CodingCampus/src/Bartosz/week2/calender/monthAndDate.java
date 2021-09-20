package Bartosz.week2.calender;

public class monthAndDate {
    public static void printDate(/*int maxDays, int offset*/) {

        int maxDays = 31;
        int offset = 4;

            System.out.print("|");
            for (int counterDays = 1; counterDays < maxDays; counterDays++) {   // Tagzähler

                if (counterDays < 10) {
                    System.out.print(" " + counterDays + "  " + "|");
                } else {
                    System.out.print(" " + counterDays + " " + "|");
                }

                if (counterDays % 7 == 0) {
                    System.out.println();
                    System.out.print("|");
                }

            }
    }

}
