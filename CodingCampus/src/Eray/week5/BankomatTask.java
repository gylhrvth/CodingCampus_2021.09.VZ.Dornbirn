package Eray.week5;

import java.util.Scanner;

public class BankomatTask {
    private static Scanner scanner = new Scanner(System.in);
    private static double kontostand = 0.00;
    private static double abheben = 0.00;
    private static double einzahlen = 0.00;

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        boolean nichtBeenden = true;
        while (nichtBeenden) {
            System.out.println();
            System.out.println("Bitte geben sie an was sie tuhn möchten?");
            System.out.println("Ihr aktueller Kontostand beträgt " + kontostand + " €");
            System.out.println("[1] Geld Einzahlen");
            System.out.println("[2] Geld Abheben");
            System.out.println("[3] Aktueller KontoStand");
            System.out.println("[4] Beenden");
            int userNumberInput = scanner.nextInt();


            switch (userNumberInput) {
                case 1:
                    einzahlen();
                    break;
                case 2:
                    abheben();
                    break;
                case 3:
                    System.out.println("Ihr aktueller Kontostand beträgt " + kontostand + " €");
                    break;
                case 4:
                    nichtBeenden = false;
                    break;
            }
        }

    }

    private static double abheben() {
        System.out.println("Wie viel Geld wollen sie von ihrem Konto abheben? Ihr aktueller Kontostand beträgt " + kontostand + " €");
        abheben = scanner.nextDouble();
        System.out.println("Sie haben erfolgreich " + abheben + " € abgehoben. Ihr aktueller Kontostand beträgt " + (kontostand -= abheben) + " €");
        return abheben;
    }

    private static double einzahlen() {
        System.out.println("Wie viel Geld wollen sie auf ihr Konto einzahlen? Ihr aktueller Kontostand beträgt " + kontostand + " €");
        einzahlen = scanner.nextDouble();
        System.out.println("Sie haben erfolgreich " + einzahlen + " € eingezahlt. Ihr aktueller Kontostand beträgt " + (kontostand += einzahlen) + " €");
        return einzahlen;
    }
}
