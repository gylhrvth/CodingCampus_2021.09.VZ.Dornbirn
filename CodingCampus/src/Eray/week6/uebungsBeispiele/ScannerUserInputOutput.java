package Eray.week6.uebungsBeispiele;

import java.util.Scanner;

public class ScannerUserInputOutput {
    public static void main(String[] args) {
        printUserInput();
    }

    private static void printUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gebe eine Zahl ein:");

        while (!scanner.hasNextInt()) {
            System.out.println("Bitte gebe eine richtige Zahl ein und nichts anderes!!");
            scanner.nextLine();
        }
        int userInputNumber = scanner.nextInt();
        System.out.println("Du hast die Zahl " + userInputNumber + " eingegeben!");
    }
}
