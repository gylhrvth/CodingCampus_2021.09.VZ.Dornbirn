package Mahir.strukturierteProgrammierung.week2;


public class Day1manualCalender {


    public static void main(String[] args) {



        headline();


        int day = 5;
        int offset = 3;
        int month = 31;

        int overallCounter = 1;
        System.out.println();
        for (int i = 0; i < offset; i++) {
            System.out.print("|      ");
            overallCounter += 1;
        }
        for (int a = 1; a <= month; a++) {

            System.out.print("|  " + a);

            if (a == day) {
                System.out.print("* ");


            } else
                System.out.print("  ");
            if (a < 10) {
                System.out.print(" ");

            }

            if (overallCounter % 7 == 0) {
                System.out.println("|");
            }


            overallCounter += 1;
        }
        for (int i = offset; offset <= 4; offset++) {
            System.out.print("|      ");
        }


    }

    public static void headline() {
        String Headline = "|  MO  |  DI  |  MI  |  DO  |  FR  |  SA  |  SO  |";
        System.out.println(Headline);
    }

}




