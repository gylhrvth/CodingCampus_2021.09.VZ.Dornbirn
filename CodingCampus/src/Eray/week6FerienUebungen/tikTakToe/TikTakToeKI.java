package Eray.week6FerienUebungen.tikTakToe;

import java.util.Random;
import java.util.Scanner;

public class TikTakToeKI {
    public static void main(String[] args) {
        printAll();
    }

    public static int zeile, spalte;
    public static Scanner scanner = new Scanner(System.in);
    public static char[][] board = new char[3][3];
    public static char spielerWechsel = 'X';
    public static Random random = new Random();


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
        System.out.println("Der Computer ist X und du bist O");
        int countReplays = 0;

        boolean falseField = false;

        while (playing) {

            if (spielerWechsel == 'X') {
                zeile = random.nextInt(3);
                spalte = random.nextInt(3);
            } else {
                System.out.println("Gebe die Zeile ein: ");
                zeile = scanner.nextInt();
                System.out.println("Gebe die Spalte ein: ");
                spalte = scanner.nextInt();
            }

            if (board[zeile][spalte] == 'X' || board[zeile][spalte] == 'O') {
                falseField = true;
                while (falseField) {

                    if (spielerWechsel == 'X') {
                        zeile = random.nextInt(3);
                        spalte = random.nextInt(3);

                    } else {
                        System.out.println("Dieses Feld wird schon benutzt bitte gebe ein neues ein!");
                        System.out.println("\nGebe die Zeile ein!");
                        zeile = scanner.nextInt();
                        System.out.println("\nGebe die Spalte ein!");
                        spalte = scanner.nextInt();

                    }
                    if (board[zeile][spalte] == '_') {
                        falseField = false;
                    }
                }
            }


            board[zeile][spalte] = spielerWechsel;

            if (spielerWechsel == 'X') {
                System.out.println("Der Computer hat gesetzt!");
            } else {
                System.out.println("Du hast gesetzt!");
            }
            printBoard(board);


            if (gameOver(zeile, spalte)) {
                if (spielerWechsel == 'X') {
                    System.out.println("Game over! der Computer hat Gewonnen!!");
                } else {
                    System.out.println("Du hast den Computer besiegt!!");
                }
                playing = false;

            }

            countReplays++;
            if (countReplays == 9 && !gameOver(zeile,spalte)) {
                System.out.println("Keiner hat gewonnen");
                playing = false;
            }

            if (spielerWechsel == 'X') {
                spielerWechsel = 'O';
            } else {
                spielerWechsel = 'X';
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

    public static void printBoard(char[][] board) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("|");
                }
                System.out.print(board[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println();


    }
}
