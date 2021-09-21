package Bartosz.week2.calender;

public class monthAndDate {
    public static void printDate(/*int maxDays, int offset*/) {

        int maxDays = 31;
        int offset = 6;


        for (int counterDays = 1; counterDays <= maxDays + offset; counterDays++) {   // Tagzähler

            if (counterDays - offset > 0) {

                if (counterDays < 10 + offset) {
                    System.out.print("|  " + (counterDays - offset) + " ");

                } else if (counterDays == maxDays + offset) {
                    System.out.print("| " + (counterDays - offset) + " |");

                } else {
                    System.out.print("| " + (counterDays - offset) + " ");
                }

                if (counterDays % 7 == 0) {
                    System.out.print("|");
                    System.out.println();
                }

            } else {
                System.out.print("|  " + "  ");
            }

        }

    }

}
