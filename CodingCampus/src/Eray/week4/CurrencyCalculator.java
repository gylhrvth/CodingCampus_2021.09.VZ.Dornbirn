package Eray.week4;

import java.util.Scanner;

public class CurrencyCalculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        currencyConverter();
    }


    private static void currencyConverter() {

        double usd = 1.15702;
        double gbp = 0.84956;
        double tryMoney = 10.3507;
        boolean changeMoneyAgain = true;

        while (changeMoneyAgain) {

            System.out.println("Bitte geben sie ein in welche Währung sie ihr Geld umwandeln wollen");
            System.out.println("[1] für EUR in USD");
            System.out.println("[2] für EUR in GBP");
            System.out.println("[3] für EUR in TRY");
            System.out.println("[4] zum Beenden");

            int userInput = scanner.nextInt();
            System.out.println("Bitte geben sie an wie viel Geld sie umwandeln wollen");
            double moneyChange = scanner.nextDouble();


            switch (userInput) {
                case 1:
                    System.out.println("Sie wechseln " + moneyChange + "€ in USD das macht " + moneyChange * usd + "$");
                    break;
                case 2:
                    System.out.println("Sie wechseln " + moneyChange + "€ in GBP das macht " + moneyChange * gbp + "Pfund");
                    break;
                case 3:
                    System.out.println("Sie wechseln " + moneyChange + "€ in TRY das macht " + moneyChange * tryMoney + "Lira ");
                    break;
                case 4:
                    changeMoneyAgain = false;

                    break;

            }

        }
    }
}
