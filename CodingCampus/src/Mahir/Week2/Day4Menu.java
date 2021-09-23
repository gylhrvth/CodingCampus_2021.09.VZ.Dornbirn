package Mahir.Week2;

import Mahir.Week1.Day5Methods;

import java.util.Scanner;

public class Day4Menu {
    public static void main(String[] args) {

        while (true) {
            System.out.println("What would you like to print?" );
            System.out.println();
            System.out.println("(1) Print square");
            System.out.println("(2) Print christmastree");
            System.out.println("(3) Print triangle");


            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();


            if (input == 1) {

                System.out.println("wide?");
                int wide = scanner.nextInt();


                System.out.println("height?");
                int height = scanner.nextInt();

                System.out.println("charackter?");
                String charackter = scanner.next();

                Day5Methods.square(wide, height, charackter);

                System.out.println();
                break;
            } else if (input == 2) {

                System.out.println("height?");
                int height = scanner.nextInt();

                Day5Methods.printChristmasTree(height);

                System.out.println("");
                break;
            } else if (input == 3) {

                System.out.println("height?");
                int height = scanner.nextInt();

                Day5Methods.printtriangle(height);

                System.out.println();
                break;
            } else {
                System.out.println("Invalid Input");
                System.out.println("Please retry");
                System.out.println();
            }

        }

    }
}
