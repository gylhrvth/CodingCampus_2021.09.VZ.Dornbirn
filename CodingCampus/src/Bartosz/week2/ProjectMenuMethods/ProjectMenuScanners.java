package Bartosz.week2.ProjectMenuMethods;

import java.util.Scanner;

public class ProjectMenuScanners {
    public static int inputScanner() {
        System.out.println("type in the number: ");
        Scanner inputScanner = new Scanner(System.in);
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

    public static int number1Scanner() {
        System.out.println("type in the first number: ");
        Scanner number1Scanner = new Scanner(System.in);
        int number1 = number1Scanner.nextInt();
        return number1;
    }

    public static String operatorScanner() {
        System.out.println("type in the operator: ");
        Scanner operatorScanner = new Scanner(System.in);
        String operator = operatorScanner.next();
        return operator;
    }

    public static int number2Scanner() {
        System.out.println("type in the second number: ");
        Scanner number2Scanner = new Scanner(System.in);
        int number2 = number2Scanner.nextInt();
        return number2;
    }

}
