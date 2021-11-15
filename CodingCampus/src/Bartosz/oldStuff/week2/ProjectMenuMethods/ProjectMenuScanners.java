package Bartosz.oldStuff.week2.ProjectMenuMethods;

import java.util.Scanner;

public class ProjectMenuScanners {
    public static int inputScanner() {
        System.out.println("type in the number: ");
        Scanner inputScanner = new Scanner(System.in);

        while(!inputScanner.hasNextInt()){
            System.out.println("type in one of the numbers!");
            inputScanner.nextLine();
        }

        int input = inputScanner.nextInt();
        return input;
    }

    public static int heightScanner() {
        System.out.println("type in the height: ");
        Scanner heightScanner = new Scanner(System.in);
        int height = heightScanner.nextInt();
        return height;
    }

    public static int widthScanner() {
        System.out.println("type in the width: ");
        Scanner widthScanner = new Scanner(System.in);
        int width = widthScanner.nextInt();
        return width;
    }

    public static int readInt(String message, String errorMessage) {
        System.out.println(message);
        Scanner widthScanner = new Scanner(System.in);
        int width = widthScanner.nextInt();
        return width;
    }

    public static double number1Scanner() {
        System.out.println("type in the first number: ");
        Scanner number1Scanner = new Scanner(System.in);
        double number1 = number1Scanner.nextDouble();
        return number1;
    }

    public static String operatorScanner() {
        System.out.println("type in the operator: ");
        Scanner operatorScanner = new Scanner(System.in);
        String operator = operatorScanner.next();
        return operator;
    }

    public static double number2Scanner() {
        System.out.println("type in the second number: ");
        Scanner number2Scanner = new Scanner(System.in);
        double number2 = number2Scanner.nextDouble();
        return number2;
    }

    public static int maxDaysScanner() {
        System.out.println("type in the Max Days of month: ");
        Scanner maxDaysScanner = new Scanner(System.in);
        int maxDays = maxDaysScanner.nextInt();
        return maxDays;
    }

    public static int offsetScanner() {
        System.out.println("type in the Weekday at monthstart: ");
        Scanner offsetScanner = new Scanner(System.in);
        int offset = offsetScanner.nextInt();
        return offset;
    }
}
