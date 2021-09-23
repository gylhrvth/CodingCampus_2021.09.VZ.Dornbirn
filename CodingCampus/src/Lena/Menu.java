package Lena;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Menu {

    public static void main(String[] args) {
        startMenu();
    }

    public static void startMenu() {

        Scanner scanner = new Scanner(System.in);
        int input = 0;

        while (input != 5) {
            printMenu();

            while (!scanner.hasNextInt()) {
                System.out.println("Das ist keine Zahl!!!");
                System.out.println();
                scanner.nextLine();
                printMenu();
            }

            input = scanner.nextInt();

            if (input == 1) {
                Calender.drawCalender();
                System.out.println();
            } else if (input == 2) {
                System.out.println("Welche Höhe soll der Christbaum haben?");
                int high = scanner.nextInt();
                Christmastree.drawChristmastree(high);
                System.out.println();
            } else if (input == 3) {
                System.out.println("Welchen Faktor möchtest du berechnen?");
                int faktor = scanner.nextInt();
                Recursion.printfactor(faktor);
                System.out.println();
            } else if (input == 4) {
                Recursion.fibonacciNumbers(0, 1);
                System.out.println();
            } else if (input != 5) {
                System.out.println("Der Wert ist nicht zugelassen!!");
                System.out.println();
            }
        }

        System.out.println("Menü wurde beendet");
    }

    public static void printMenu() {
        System.out.println("Was möchtest du ausführen?");
        System.out.println("Gib die jeweilige Nummer ein!");
        System.out.println("(1) Kalender");
        System.out.println("(2) Christbaum");
        System.out.println("(3) Faktor Berechnung");
        System.out.println("(4) Fibonacci Folge");
        System.out.println("(5) Exit");
    }


}
