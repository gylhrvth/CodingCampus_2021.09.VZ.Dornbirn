package Gerhard.week3.day1;

import java.util.Random;
import java.util.Scanner;


public class Zahlenratespiel {


    public static void Header() {


        System.out.println("\u001B[31m" + " ________   ______   __    __  __        ________  __    __  _______    ______  ________  ________   ______   _______  ______  ________  __       ");
        System.out.println("|        \\ /      \\ |  \\  |  \\|  \\      |        \\|  \\  |  \\|       \\  /      \\|        \\|        \\ /      \\ |       \\|      \\|        \\|  \\      ");
        System.out.println(" \\$$$$$$$$|  $$$$$$\\| $$  | $$| $$      | $$$$$$$$| $$\\ | $$| $$$$$$$\\|  $$$$$$\\\\$$$$$$$$| $$$$$$$$|  $$$$$$\\| $$$$$$$\\\\$$$$$$| $$$$$$$$| $$      ");
        System.out.println("    /  $$ | $$__| $$| $$__| $$| $$      | $$__    | $$$\\| $$| $$__| $$| $$__| $$  | $$   | $$__    | $$___\\$$| $$__/ $$ | $$  | $$__    | $$      ");
        System.out.println("   /  $$  | $$    $$| $$    $$| $$      | $$  \\   | $$$$\\ $$| $$    $$| $$    $$  | $$   | $$  \\    \\$$    \\ | $$    $$ | $$  | $$  \\   | $$      ");
        System.out.println("  /  $$   | $$$$$$$$| $$$$$$$$| $$      | $$$$$   | $$\\$$ $$| $$$$$$$\\| $$$$$$$$  | $$   | $$$$$    _\\$$$$$$\\| $$$$$$$  | $$  | $$$$$   | $$      ");
        System.out.println(" /  $$___ | $$  | $$| $$  | $$| $$_____ | $$_____ | $$ \\$$$$| $$  | $$| $$  | $$  | $$   | $$_____ |  \\__| $$| $$      _| $$_ | $$_____ | $$_____ ");
        System.out.println("|  $$    \\| $$  | $$| $$  | $$| $$     \\| $$     \\| $$  \\$$$| $$  | $$| $$  | $$  | $$   | $$     \\ \\$$    $$| $$     |   $$ \\| $$     \\| $$     \\");
        System.out.println(" \\$$$$$$$$ \\$$   \\$$ \\$$   \\$$ \\$$$$$$$$ \\$$$$$$$$ \\$$   \\$$ \\$$   \\$$ \\$$   \\$$   \\$$    \\$$$$$$$$  \\$$$$$$  \\$$      \\$$$$$$ \\$$$$$$$$ \\$$$$$$$$" + "\u001B[0m");
        System.out.println();
        System.out.println();
        System.out.println();
    }


    public static void game() {

        int min = 1;
        int max = 9;


        Random random = new Random();

        int value = random.nextInt(max) + 1;

        System.out.println(value);

        Scanner scanner = new Scanner(System.in);
        System.out.println("                                         Der Comnputer hat eine Zahl zwischen 1 und 10 gew??hlt");
        System.out.println("                                                     Versuche die Zahl zu erraten:");
        int numberGuess = scanner.nextInt();
        System.out.println("                                                    Die von Ihnen gew??hlte Zahl ist: ");
        System.out.println("                                                                  " + numberGuess);


        while (numberGuess != value) {
            if (numberGuess <= value) {
                System.out.println("                                                     Die gesuchte Zahl ist h??her!");


                numberGuess = scanner.nextInt();
                System.out.println("                                                    Die von Ihnen gew??hlte Zahl ist: ");
                System.out.println("                                                                  " + numberGuess);

            }
            if (numberGuess >= value) {
                System.out.println("                                                    Die gesuchte Zahl ist niedriger");


                numberGuess = scanner.nextInt();
                System.out.println("                                                    Die von Ihnen gew??hlte Zahl ist: ");
                System.out.println("                                                                  " + numberGuess);
            }


            if (numberGuess >= 10) {
                System.out.println("                                                   Die gew??hlte Zahl ist h??her als 10");
                System.out.println("                                                   Bitte w??hlen Sie eine neue Zahl");
                numberGuess = scanner.nextInt();
                System.out.println("                                                    Die von Ihnen gew??hlte Zahl ist: ");
                System.out.println("                                                                  " + numberGuess);

            }


            System.out.println();
            System.out.println();
            System.out.println();


            if (numberGuess == value) {
                System.out.println("\u001B[33m" + "                /$$$$$$  /$$$$$$$   /$$$$$$  /$$$$$$$$ /$$   /$$ /$$        /$$$$$$  /$$$$$$$$ /$$$$$$  /$$$$$$  /$$   /$$");
                System.out.println("               /$$__  $$| $$__  $$ /$$__  $$|__  $$__/| $$  | $$| $$       /$$__  $$|__  $$__/|_  $$_/ /$$__  $$| $$$ | $$");
                System.out.println("              | $$  \\__/| $$  \\ $$| $$  \\ $$   | $$   | $$  | $$| $$      | $$  \\ $$   | $$     | $$  | $$  \\ $$| $$$$| $$");
                System.out.println("              | $$ /$$$$| $$$$$$$/| $$$$$$$$   | $$   | $$  | $$| $$      | $$$$$$$$   | $$     | $$  | $$  | $$| $$ $$ $$");
                System.out.println("              | $$|_  $$| $$__  $$| $$__  $$   | $$   | $$  | $$| $$      | $$__  $$   | $$     | $$  | $$  | $$| $$  $$$$");
                System.out.println("              | $$  \\ $$| $$  \\ $$| $$  | $$   | $$   | $$  | $$| $$      | $$  | $$   | $$     | $$  | $$  | $$| $$\\  $$$");
                System.out.println("              |  $$$$$$/| $$  | $$| $$  | $$   | $$   |  $$$$$$/| $$$$$$$$| $$  | $$   | $$    /$$$$$$|  $$$$$$/| $$ \\  $$");
                System.out.println("               \\______/ |__/  |__/|__/  |__/   |__/    \\______/ |________/|__/  |__/   |__/   |______/ \\______/ |__/  \\__/" + "\u001B[0m");
                System.out.println(5);


                System.out.println("                                                 Sie haben die gesuchte Zahl erraten! :)");
            }
        }

    }
    //      public static int abfrage(){


    public static void main(String[] args) {
        Header();
        game();
    }
}



