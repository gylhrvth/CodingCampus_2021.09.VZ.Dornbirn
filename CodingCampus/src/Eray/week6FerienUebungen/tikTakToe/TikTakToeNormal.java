package Eray.week6FerienUebungen.tikTakToe;

import java.util.Scanner;

public class TikTakToeNormal {
    public static void main(String[] args) {
        printAll();
    }

    public static int zeile, spalte;
    public static Scanner scanner = new Scanner(System.in);
    public static char[][] board = new char[3][3];
    public static char spielerWechsel = 'X';


    public static void printAll() {
        game();

    }

    private static void game() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '_';
            }
        }
        printFirstBoard();
        play();


    }

    private static void play() {

        boolean playing = true;
        System.out.println("Spieler X ist dran");

        while (playing) {
            System.out.println("\nGebe die Zeile ein!");
            zeile = scanner.nextInt();
            System.out.println("\nGebe die Spalte ein!");
            spalte = scanner.nextInt();
            board[zeile][spalte] = spielerWechsel;

            printBoard();
            if (spielerWechsel == 'X') {
                spielerWechsel = 'O';
            } else {
                spielerWechsel = 'X';
            }
            if (spielerWechsel == 'X') {
                System.out.println("Spieler X ist dran !");
            } else {
                System.out.println("Spieler O ist dran !");
            }

            if (gameOver(zeile, spalte)) {
                System.out.println("Game over! Spieler " + spielerWechsel + " hat Gewonnen!!");
                playing = false;

            }
        }

    }

    public static boolean gameOver(int move1, int move2) {
        if (board[0][move2] == board[1][move2] && board[0][move2] == board[2][move2]) {
            return true;
        }
        if (board[move1][0] == board[move1][1] && board[move1][0] == board[move1][2]) {
            return true;
        }
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] != '_') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[1][1] != '_') {
            return true;
        }

        return false;
    }

    public static void printFirstBoard() {
        System.out.println("Bitte gebe ein in welches Feld du setzen möchtest");
        System.out.println("Bitte merke dir genau die Zahlen fürs feld später werden sie nicht mehr erscheinen!!!");
        System.out.println();
        System.out.println("        S P A L T E N");
        System.out.println();
        System.out.println("     [0,0]  [0,1]  [0,2] ");
        System.out.println(" Z     0  |   1  |   2   ");
        System.out.println(" E  _____________________");
        System.out.println(" I   [1,0]  [1,1]  [1,2] ");
        System.out.println(" L     3  |   4  |   5   ");
        System.out.println(" E  _____________________");
        System.out.println(" N   [2,0]  [2,1]  [2,2] ");
        System.out.println("       6  |   7  |   8   ");
        System.out.println();
    }

    public static void printBoard() {

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("|");
                }
                System.out.print(board[i][j] + " |");
            }
        }
        System.out.println();


    }
}
