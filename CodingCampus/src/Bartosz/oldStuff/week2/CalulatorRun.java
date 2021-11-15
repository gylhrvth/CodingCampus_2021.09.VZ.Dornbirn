package Bartosz.oldStuff.week2;

import Bartosz.oldStuff.week2.calculatorMethods.Calculate;

import java.util.Scanner;

public class CalulatorRun {
    public static void printCalculator(double number1, String operator, double number2) {

/*        System.out.println("type in your first number");
        Scanner number1Scanner = new Scanner(System.in);
        double number1 = number1Scanner.nextDouble();

        System.out.println("type in the operation");
        Scanner operatorScanner = new Scanner(System.in);
        String operator = operatorScanner.nextLine();

        System.out.println("type in the second number");
        Scanner number2Scanner = new Scanner(System.in);
        double number2 = number2Scanner.nextDouble();
        */

        System.out.println("Is " + number1 + " " + operator + " " + number2 + " correct?");
        System.out.print("yes/no");
        System.out.println();
        Scanner correctScanner = new Scanner(System.in);
        String correct = correctScanner.nextLine();

        if (correct.equals("yes")) {
            double result = Calculate.calculate(number1, operator, number2);
            System.out.println("the result is: " + result);
        } else {
            System.out.println("Restart the programm.");
        }
    }
}

