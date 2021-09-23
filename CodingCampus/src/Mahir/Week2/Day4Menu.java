package Mahir.Week2;

import Mahir.Week1.Day5Methods;

import java.util.Scanner;

public class Day4Menu {
    public static void main(String[] args) {

        while (true) {

            System.out.println("\033[0;35m" + "What would you like to print?" + "\033[0m");
            System.out.println();
            System.out.println("(1)" + "\033[0;32m" + "Print square"+"\033[0m" );
            System.out.println("(2)" + "\033[0;32m" + "Print christmastree"+"\033[0m" );
            System.out.println("(3)" + "\033[0;32m" + "Print triangle"+"\033[0m" );
            System.out.println("(0)" + "\033[0;31m" + "exit" + "\033[0m");


            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            if (input == 0){
                System.out.println("");
                break;
            }


            if (input == 1) {

                System.out.println("\u001B[36m" + "wide?");
                int wide = scanner.nextInt();


                System.out.println("height?");
                int height = scanner.nextInt();

                System.out.println("charackter?" + "\033[0m");
                String charackter = scanner.next();

                Day5Methods.square(wide, height, charackter);

                System.out.println();

            } else if (input == 2) {

                System.out.println("\u001B[36m" + "height?" + "\033[0m");
                int height = scanner.nextInt();

                Day5Methods.printChristmasTree(height);

                System.out.println("");

            } else if (input == 3) {

                System.out.println("\u001B[36m" + "height?" + "\033[0m");
                int height = scanner.nextInt();

                Day5Methods.printtriangle(height);

                System.out.println();

            } else {
                System.out.println();
                System.out.println("\033[0;31m" + "Invalid Input");
                System.out.println("Please retry" + "\033[0m");
                System.out.println();
            }



        }


    }
}
