package Eray.week6.uebungsBeispiele;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        printCalculatorBodyAndHead();
    }


    private static void printCalculatorHead() {
        System.out.println("XXXXXXXXXX                   Willkommen im TaschenRechner                       XXXXXXXXXXXX");
        System.out.println("XXXXXXXXXX     Bitte gebe ein welche RechenOperationen du durchführen willst    XXXXXXXXXXXX");
        System.out.println("XXXXXXXXXX     Bitte geben sie zuerst eine Zahl ein und dann den Operator       XXXXXXXXXXXX");
        System.out.println("XXXXXXXXXX                  Zum Addieren bitte        [+] drücken               XXXXXXXXXXXX");
        System.out.println("XXXXXXXXXX                  Zum Subtrahieren bitte    [-] drücken               XXXXXXXXXXXX");
        System.out.println("XXXXXXXXXX                  Zum Multiplizieren bitte  [*] drücken               XXXXXXXXXXXX");
        System.out.println("XXXXXXXXXX                  Zum Dividieren bitte      [/] drücken               XXXXXXXXXXXX");
        System.out.println("XXXXXXXXXX                  Zum Beenden des Menüß     [x] drücken               XXXXXXXXXXXX");
        System.out.println();
    }

    private static void printCalculatorBodyAndHead() {
        Scanner scanner = new Scanner(System.in);

        boolean runningCalculator = true;
        while (runningCalculator) {

            printCalculatorHead();

            System.out.println("Bitte gebe einen Operator ein (genau wie es oben aufgelistet ist): ");
            String operator = scanner.next();

            if(operator.equals("x")){
                System.out.println("Der TaschenRechner wurde erfolgreich beendet!");
                runningCalculator = false;
                break;
            }
            System.out.println("Bitte gebe eine beliebige erste Zahl ein (Ganz oder KommaZahl): ");
            double userInputFirstNumber = scanner.nextDouble();

            System.out.println("Bitte gebe eine beliebige zweite Zahl ein (Ganz oder KommaZahl): ");
            double userInputSecondNumber = scanner.nextDouble();

            switch (operator) {
                case "+":
                    double endResultAddition = userInputFirstNumber + userInputSecondNumber;
                    System.out.println();
                    System.out.println(userInputFirstNumber + " [+] " + userInputSecondNumber + " das Ergebnis ist = " + endResultAddition);
                    System.out.println();
                    System.out.println();
                    break;

                case "-":
                    double endResultSubtraktion = userInputFirstNumber - userInputSecondNumber;
                    System.out.println();
                    System.out.println(userInputFirstNumber + " [-] " + userInputSecondNumber + " das Ergebnis ist = " + endResultSubtraktion);
                    System.out.println();
                    System.out.println();
                    break;

                case "*":
                    double endResultMultiplikation = userInputFirstNumber * userInputSecondNumber;
                    System.out.println();
                    System.out.println(userInputFirstNumber + " [*] " + userInputSecondNumber + " das Ergebnis ist = " + endResultMultiplikation);
                    System.out.println();
                    System.out.println();
                    break;

                case "/":
                    double endResultDivide = userInputFirstNumber / userInputSecondNumber;
                    System.out.println();
                    System.out.println(userInputFirstNumber + " [/] " + userInputSecondNumber + " das Ergebnis ist = " + endResultDivide);
                    System.out.println();
                    System.out.println();
                    break;

            }


        }

    }
}
