package Sandro.test;

public class methodsAndLoops {

    public static void main(String[] args) {

        certainAmountOfChar('X', 20);
        printSquare('X', 20);
    }

    public static void certainAmountOfChar(char letter, int amount) {
        System.out.println("\nErstelle eine Methode die eine bestimmte Anzahl parameterisierbarer Zeichen einer Zeile ausgibt.");

        for (int i = amount; 0 < i; i--) {
            System.out.print(letter);
        }
        System.out.println();
    }

    public static void printSquare(char letter, int height) {
        System.out.println("\nErstelle eine Methode welche ein Quader mit variabler Größe und mit angegebenem Zeichen ausgibt:");


        for (int i = 0; i < height; i++) {
            System.out.print(letter);
        }
        for (int i = 0; i < height - 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(letter);
                for (int k = 0; k < height - 2; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
