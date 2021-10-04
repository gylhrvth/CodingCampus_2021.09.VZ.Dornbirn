package Niklas.calendar;

public class Calendar {

    public static void printNumber(int i) {
        if(i > 0) {
            if (i < 10) {
                System.out.print("| " + i + "  ");
            } else {
                System.out.print("| " + i + " ");
            }
        }else{
            System.out.print("|    ");
        }
    }

    public static void checkLineEnd(int i ) {
        if(i % 7 == 0) {
            System.out.println("|");
        }
    }
    public static void drawCalendar(int amountOfDays, int offset) {
        for(int i = 1; i <= amountOfDays + offset; i++) {
            printNumber(i - offset);
            checkLineEnd(i);
        }

        int missing = 7 - (amountOfDays + offset) % 7;
        for(int i = 0; i < missing; i++ ){
            System.out.print("|    ");
        }
        System.out.println("|");
    }

    public static void main(String[] args) {
        String headline = "| Mo | Di | Mi | Do | Fr | Sa | So |";

        System.out.println(headline);
        drawCalendar(27,6);
    }
}
