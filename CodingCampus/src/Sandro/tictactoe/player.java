package Sandro.tictactoe;


import java.util.Scanner;

public class player {

    int number;                                                 //es existiert eine Zahl aber wird später initialisiert
    Scanner scanner = new Scanner(System.in);


    public player(int number) {                                 // Konstruktor muss genau gleich wie die Klasse heißen !
        this.number = number;
    }

    public int getTurn() {
        System.out.println("Player " + number + " - du bist am Zug");
        int input = scanner.nextInt();
        if (input < 9 && input >= 0) {
            return input;
        }
        System.out.println("Ungültige Eingabe. Bitte nochmal eingeben.");
        return getTurn();
    }

    public boolean validateTurn(int[] board, int turn) {
        if (board[turn] == -1) {
            return true;
        }
        return false;
    }
}
