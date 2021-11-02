package Sandro.test;

import java.util.Scanner;

public class input {

    public static void main(String[] args) {

        scanStringAndOutput();
        calculator();

    }

    public static void scanStringAndOutput() {
        System.out.println("\nLies mit Hilfe des berühmten Scanners einen String des Benutzers ein und gib diesen aus:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Ihre Eingabe: " + input);
    }

    public static void calculator() {
        Scanner benutzereingabe = new Scanner(System.in);
        float number1;
        float number2;

        while (true) {

            System.out.println("Geben Sie Ihre erste Zahl (Bei Kommazahlen bitte ',' verwenden):");
            number1 = benutzereingabe.nextFloat();

            System.out.println("Geben Sie ein Rechenoperator ein (*, /, +, -):");
            char operator = benutzereingabe.next().charAt(0);

            System.out.println("Geben Sie Ihre zweite Zahl ein:");
            number2 = benutzereingabe.nextFloat();


            if (operator == '*') {
                System.out.println("Ihr Ergebnis ist: " + (number1 * number2) + "\n");

            } else if (operator == '/') {
                System.out.println("Ihr Ergebnis ist: " + (number1 / number2) + "\n");

            } else if (operator == '+') {
                System.out.println("Ihr Ergebnis ist: " + (number1 + number2) + "\n");

            } else if (operator == '-') {
                System.out.println("Ihr Ergebnis ist: " + (number1 - number2) + "\n");
            }

            System.out.println("Programm neustarten? Tippen Sie: Ja. Andernfalls schließt sich das Programm");
            String answer = benutzereingabe.next();

            if (answer.equals("Ja"))
                System.out.println("Neustart erfolgt\n");
            else {
                System.out.println("Ihr Programm wurde beendet");
                System.exit(0);
            }
        }
    }
}

