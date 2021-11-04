package Mahir.strukturierteProgrammierung.week2;

import Mahir.strukturierteProgrammierung.week1.Day5Methods;

import java.util.Scanner;

public class Day4Menu {
    public static void main(String[] args) throws InterruptedException {


        System.out.println("\033[0;35m" + "What would you like to print?" + "\033[0m");
        while (true) {

            selectMenu();
            Scanner scanner = new Scanner(System.in);

            System.out.println();

            int input = invalidInput(scanner);
              scanner.nextLine();

            if (input == 0) {
                System.out.println("\033[0;32m" + "Goodbye" + "\033[0m");
                break;
            } else if (input == 1) {

                System.out.println("\u001B[36m" + "height?" + "\033[0m");
                int height = invalidInput(scanner);



                Day5Methods.square(height);
                Thread.sleep(1000);

                System.out.println();

            } else if (input == 2) {

                System.out.println("\u001B[36m" + "height?" + "\033[0m");

               int height =  invalidInput(scanner);

                Day5Methods.printChristmasTree(height);
                Thread.sleep(1000);

                System.out.println();

            } else if (input == 3) {

                System.out.println("\u001B[36m" + "height?" + "\033[0m");

                int height = invalidInput(scanner);


                Day5Methods.printtriangle(height);
                Thread.sleep(1000);

                System.out.println();

            } else if (input == 4) {

                System.out.println("\u001B[36m" + "number?" + "\033[0m");

                int num = invalidInput(scanner);

                Day5Methods.multTable(num);
                Thread.sleep(1000);

                System.out.println();

            } else {
                System.out.println();
                System.out.println("\033[0;31m" + "Invalid Input");
                System.out.println("Please retry" + "\033[0m");
                System.out.println();
                Thread.sleep(1000);
            }
        }
        System.out.println("\033[0;35m" + "What would you like to print next?" + "\033[0m");


    }

    //Methods


    public static int getIntValue(Scanner sc) {
        int value = Integer.MIN_VALUE;
        while (value == Integer.MIN_VALUE) {
            String line = sc.nextLine();
            try {
                value = Integer.parseInt(line);
            } catch (NumberFormatException nfe) {
                System.out.println("Pleas use a valid integer value");
                         /*   System.out.println("Please enter the first value:");
            int value1 = getIntValue(scanner);
            System.out.println("Please enter the second value:");
            int value2 = getIntValue(scanner);
            System.out.println("Values: " + value1 + ", " + value2); */
            }
        }
        return value;
    }

    public static int invalidInput(Scanner scanner) throws InterruptedException {
        while (!scanner.hasNextInt()) {
            System.out.println("\033[0;31m" + "Invalid Input Please retry" + "\033[0m");
            Thread.sleep(1000);
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public static void selectMenu() {
        System.out.println();
        System.out.println("(1)" + "\033[0;32m" + "Print square" + "\033[0m");
        System.out.println("(2)" + "\033[0;32m" + "Print christmastree" + "\033[0m");
        System.out.println("(3)" + "\033[0;32m" + "Print triangle" + "\033[0m");
        System.out.println("(4)" + "\033[0;32m" + "simple multiplication" + "\033[0m");
        System.out.println("(0)" + "\033[0;31m" + "exit" + "\033[0m");
    }


}
