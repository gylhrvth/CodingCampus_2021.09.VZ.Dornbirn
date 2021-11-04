package Plamena.week6.TestExcercises;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

    }
    private static void calculator() {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            float number1 = readNumber();

            System.out.println("What operation do you want to execute? Enter valid operator.");
            String operator = sc.next();

            float number2 = readNumber();

            switch (operator) {
                case "+" -> System.out.println(number1 + " " + operator + " " + number2 + " " + "=" + " " + (number1 + number2));
                case "-" -> System.out.println(number1 + " " + operator + " " + number2 + " " + "=" + " " + (number1 - number2));
                case "*" -> System.out.println(number1 + " " + operator + " " + number2 + " " + "=" + " " + (number1 * number2));
                case "/" -> System.out.println(number1 + " " + operator + " " + number2 + " " + "=" + " " + (number1 / number2));
                default -> System.out.println("Invalid operation.");
            }

            System.out.println("Enter YES to start over");
            String cont = sc.next();
            String compare = "yes";
            if (cont.toLowerCase().compareTo(compare) != 0) {
                System.out.println("Goodbye!");
                break;
            }
        }
    }

    private static int readNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");

        int number = 0;

        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid number! ");
            sc.next();
        }
        return number = sc.nextInt();
    }
    private static void readString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence.");
        System.out.println("The sentence you entered is: " + sc.nextLine());
        sc.close();
    }
}
