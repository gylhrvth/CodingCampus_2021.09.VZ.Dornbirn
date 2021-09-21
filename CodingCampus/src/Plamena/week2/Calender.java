package Plamena.week2;

public class Calender {
    public static void main(String[] args) {


        int offset = setOffset(8);
        int days = setAmountOfDays(8);
        printWeekdays();

        for (int i = 1; i <= 42; i++) {
            if (i <= offset || i > days + offset) {
                System.out.printf("|%3s", " ");
            } else {
                System.out.printf("|%3s", (i - offset));
            }
            if (i % 7 == 0) {
                System.out.println("|");
            }
        }


    }



    public static void printWeekdays() {
        System.out.println("| Mo| Di| Mi| Do| Fr| Sa| So|");
    }


    public static int setAmountOfDays(int months) {

        int days = 0;
        for (int i = 0; i <= months && i <= 12; i++) {
            if (i == 1) {
                days = 31;
            }
            if (i == 2) {
                days = 28;
            }
            if (i == 3) {
                days = 31;
            }
            if (i == 4) {
                days = 30;
            }
            if (i == 5) {
                days = 31;
            }
            if (i == 6) {
                days = 30;
            }
            if (i == 7) {
                days = 31;
            }
            if (i == 8) {
                days = 31;
            }
            if (i == 9) {
                days = 30;
            }
            if (i == 10) {
                days = 31;
            }
            if (i == 11) {
                days = 30;
            }
            if (i == 12) {
                days = 31;
            }
        }

        return days;
    }


    public static int setOffset(int months) {

        int offset = 0;


        for (int i = 1; i <= months && i <= 12; i++) {
            if (i == 1) {
                offset = 4;
            }
            if (i == 2) {
                offset = 0;
            }
            if (i == 3) {
                offset = 0;
            }
            if (i == 4) {
                offset = 3;
            }
            if (i == 5) {
                offset = 5;
            }
            if (i == 6) {
                offset = 1;
            }
            if (i == 7) {
                offset = 3;
            }
            if (i == 8) {
                offset = 6;
            }
            if (i == 9) {
                offset = 2;
            }
            if (i == 10) {
                offset = 4;
            }
            if (i == 11) {
                offset = 0;
            }
            if (i == 12) {
                offset = 2;
            }

        }
        return offset;

    }

}


