package Oemer.Week2;

import Oemer.Week2.Tag6;
import Oemer.Week1.Tag5Methoden;

import java.util.Scanner;


public class Tag8Menu {
    public static void main(String[] args) {

        System.out.println("What would you like to print?");
         while (true) {
            System.out.println();
            System.out.println("1 " + "weinachtsBaum");
            sleepFor(200);
            System.out.println("2 " + "printTriangel");
            sleepFor(200);
            System.out.println("3 " + "baumStamm");
            sleepFor(200);
            System.out.println("4 " + "kugel");
            sleepFor(200);


            Scanner scanner = new Scanner(System.in);
            System.out.println();

            System.out.println();

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid Input Please retry");
                scanner.nextLine();
            }

            int input = scanner.nextInt();
            scanner.nextLine();


            if (input == 1) {

                System.out.println("height?");

                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid Input Please retry");
                    scanner.nextLine();
                }

                int height = scanner.nextInt();
                scanner.nextLine();

                Tag6.weinachtsBaum(height);

                System.out.println();

            } else if (input == 2) {

                System.out.println("height?");

                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid Input Please retry");
                    scanner.nextLine();
                }
                int height = scanner.nextInt();
                scanner.nextLine();

                Tag5Methoden.printTriangle(height);

                System.out.println();

            } else if (input == 3) {

                System.out.println("height?");

                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid Input Please retry");
                    scanner.nextLine();
                }
                int height = scanner.nextInt();
                scanner.nextLine();

                Tag6.baumStamm(height);

                System.out.println();

            } else if (input == 4) {

                System.out.println("number?");

                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid Input Please retry");
                    scanner.nextLine();
                }

                int num = scanner.nextInt();
                scanner.nextLine();

                Tag6.kugel(num);

                System.out.println();

            } else {
                System.out.println();
                System.out.println("Invalid Input");
                System.out.println("Please retry");
                System.out.println();
            }


            System.out.println("What would you like to print next?");


        }


    }

    public static void sleepFor(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ie) {
        }
    }
}


