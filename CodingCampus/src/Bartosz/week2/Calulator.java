package Bartosz.week2;

import Bartosz.week2.calculatorMethods.Calculate;

import java.util.Scanner;

public class Calulator {
    public static void printCalculator() {

        System.out.println("type in your first number");
        Scanner number1Scanner = new Scanner(System.in);
        double zahl1 = number1Scanner.nextDouble();

        System.out.println("type in the operation");
        Scanner operatorScanner = new Scanner(System.in);
        String operator = operatorScanner.nextLine();

        System.out.println("type in the second number");
        Scanner number2Scanner = new Scanner(System.in);
        double zahl2 = number2Scanner.nextDouble();

        System.out.println("Is " + zahl1 + " " + operator + " " + zahl2 + " correct?");
        System.out.print("yes/no");
        System.out.println();
        Scanner correctScanner = new Scanner(System.in);
        String correct = correctScanner.nextLine();

        if (correct.equals("yes")) {

            System.out.println("the result is: " + Calculate.calculate(zahl1, operator, zahl2));
        } else {
            System.out.println("Restart the programm.");
        }

    }
}

