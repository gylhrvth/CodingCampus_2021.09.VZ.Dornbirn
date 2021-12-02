package Stefan.Week5;

import java.util.Scanner;

public class numberWeekday {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int input = -1;

        while (input < 0 || input > 7) {
            System.out.println("Gib eine Zahl zwischen 1 - 7 ein!!!");
            while (!scanner.hasNextInt()) {
                System.out.println("Sie müssen eine Zahl eingeben");
                scanner.nextLine();
            }
            input = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println(weekday(input));
    }

    public static String weekday (int input) {
        String dayName = "";
        switch (input) {
            case 1: dayName = "Montag"; break;
            case 2: dayName = "Dienstag"; break;
            case 3: dayName = "Mittwoch"; break;
            case 4: dayName = "Donnerstag"; break;
            case 5: dayName = "Freitag"; break;
            case 6: dayName = "Samstag"; break;
            case 7: dayName = "Sonntag"; break;
        }
        return dayName;
    }
}
