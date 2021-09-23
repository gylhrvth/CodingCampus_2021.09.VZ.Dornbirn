package Eray.week2;

import Eray.week2.MenuMethods.ArrowTaskForMenu;
import Eray.week2.MenuMethods.CalendarForMenu;
import Eray.week2.MenuMethods.NewChristmasForMenu;
import Eray.week2.MenuMethods.RhombusForMenu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainMenuToPrintMethods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean neverEnd = true;

        while (neverEnd) {

            System.out.println("\u001B[32m" + "######### Hallo Welcome in the Menu  #########" );
            System.out.println("######### What would you like to do? #########" + "\u001B[0m");
            System.out.println();
            System.out.println("[1] Christmas Tree");
            System.out.println("[2] Arrow");
            System.out.println("[3] Rhombus");
            System.out.println("[4] Calendar");
            System.out.println("\u001B[31m" + "[5] End" + "\u001B[0m" );
            System.out.println();
            System.out.println("Please enter a Number in");


            int input;

            while (true) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter a Correct Number");
                    scanner.nextLine();
                }

                input = scanner.nextInt();

                if (input > 0 && input < 6) {
                    break;
                } else {
                    System.out.println("Please enter a Correct Number");
                }
            }

            switch (input) {
                case 1 -> {
                    System.out.println();
                    System.out.println("Please enter a Tree height");
                    int height = scanner.nextInt();
                    NewChristmasForMenu.christmasTree(height);
                    System.out.println();
                    System.out.println();
                }
                case 2 -> {
                    System.out.println();
                    System.out.println("Please enter a Arrow height");
                    int heightArrow = scanner.nextInt();
                    ArrowTaskForMenu.printArrow(heightArrow);
                    System.out.println();
                    System.out.println();
                }
                case 3 -> {
                    System.out.println();
                    System.out.println("Please enter a Rhombus height");
                    int heightRhombus = scanner.nextInt();
                    RhombusForMenu.printRhombus(heightRhombus);
                    System.out.println();
                    System.out.println();
                }
                case 4 -> {
                    System.out.println();
                    CalendarForMenu.printCalendar();
                    System.out.println();
                    System.out.println();
                }
                case 5 -> neverEnd = false;

            }
        }
        clearScreen();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

