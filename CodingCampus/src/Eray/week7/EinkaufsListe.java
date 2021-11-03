package Eray.week7;

import java.util.Scanner;

public class EinkaufsListe {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printAll();
    }

    public static void printAll() {
        printFullMenu();
    }

    public static void printFullMenu() {
        boolean inTheMenu = true;
        while (inTheMenu) {
            printFirstMenuAndGetUserInput();
            String userInputAsText = scanner.nextLine();
            int userInput = 0;
            try {
                userInput = Integer.parseInt(userInputAsText);
            } catch (NumberFormatException nfe) {
                // Do nothing
            }


            if (userInput == 1) {
                createShoppingList(userInput);
            } else if (userInput == 2) {
                System.out.println("Sie haben in Ihrer Liste aufgeschrieben: ");
                System.out.println();
                for (int i = 0; i < shoppingList.length; i++) {
                    System.out.println(i + ": " + shoppingList[i]);
                }

                System.out.println();
                System.out.println();
            } else if (userInput == 3) {
                System.out.println("Sie haben das Programm erfolgreich beendet!");
                inTheMenu = false;
            } else {
                System.out.println("Bitte geben sie ein welches Menü sie wollen!");
            }
        }

    }

    private static String[] shoppingList = new String[0];

    public static void createShoppingList(int userInput) {


        boolean userIsFillingList = true;

        System.out.println("Willkommen im Shopping Listen ersteller");
        System.out.println("Geben sie an wie viele Sachen sie in die Liste Schreiben wollen: ");

        String lengthAsText = scanner.nextLine();
        int lengthOfShoppingList = 0;
        try {
            lengthOfShoppingList = Integer.parseInt(lengthAsText);
        } catch (NumberFormatException nfe) {
            // Do nothing
        }

        shoppingList = new String[lengthOfShoppingList];

        System.out.println("Bitte geben sie ein was sie Einkaufen wollen");
        System.out.println("Wenn sie ihre " + lengthOfShoppingList + " Einkaufsgegenstände eingegeben haben aber doch weniger brauchen drücken sie [x] !");

        int i = 0;
        String shoppingListInput = "";
        while ((i < shoppingList.length) && (!shoppingListInput.equals("x"))) {
            System.out.println("Verbleibende Gegenstände = " + (shoppingList.length - i));
            shoppingListInput = scanner.nextLine();
            shoppingList[i] = shoppingListInput;
            ++i;
        }
        System.out.println("Sie haben ihre ShoppingListe erfolgreich beendet");

        System.out.println();

    }

    public static void printFirstMenuAndGetUserInput() {
        System.out.println("Hallo Willkommen im EinkaufsListen Menü                    ");
        System.out.println("Um eine Liste zu erstellen drücken sie die              [1]");
        System.out.println("Um die aufgeschrieben Liste zu sehen drücken sie die    [2]");
        System.out.println("Um das Programm zu beenden drücken sie die              [3]");
    }
}
