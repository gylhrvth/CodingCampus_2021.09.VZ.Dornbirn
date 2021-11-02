package Rauan.woche7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    //1-Beide Spieler wählen entweder X oder O, um ihre Felder zu markieren.
    //2-Es wird ein 3×3-Raster mit Nummern geben, die jeder der 9 Zellen zugewiesen sind.
    //3-Der Spieler, der X gewählt hat, beginnt zuerst zu spielen.
    //4-Er gibt die Zellennummer ein, in der er X platzieren möchte.
    //5-Nun spielen O und X abwechselnd, bis einer der beiden gewinnt.
    //6-Gewinnkriterien: Immer wenn einer der beiden Spieler eine Reihe/Spalte/Diagonale vollständig
    // mit seinem Symbol (X/O) gefüllt hat, gewinnt er und das Spiel endet.
    //7-Gewinnt keiner der beiden Spieler, gilt das Spiel als unentschieden.

    static String[] board;
    static String turn;

    static Object checkWinner() {
        for (int i = 0; i < 8; i++) {
            String line = null;
            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;

            }// for x winner
            if (line.equals("XXX")) {
                return "X";
            }
            // for O winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }
        for (int i = 0; i < 9; i++) {
            // to enter x or o at the exact place on board.

        }
        System.out.println(turn + "'s turn; enter a slot number to place " + turn + "in");
        return null;
        // To print out the board.
    /* |---|---|---|
       | 1 | 2 | 3 |
       |-----------|
       | 4 | 5 | 6 |
       |-----------|
       | 7 | 8 | 9 |
       |---|---|---|*/

    }

    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();

        System.out.println(
                "X will play first. Enter a slot number to place X in:");
        while (winner == null) {
            int numInput;
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input; re-enter slot number:");
                continue;
            }
            // This game has two player x and O.
            // Here is the logic to decide the turn.
            if (board[numInput - 1].equals(String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }

                printBoard();
                winner = (String) checkWinner();
            } else {
                System.out.println(
                        "Slot already taken; re-enter slot number:");
            }
        }
        // If no one win or lose from both player x and O.
        // then here is the logic to print "draw".
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                    "It's a draw! Thanks for playing.");
        }

        // For winner -to display Congratulations! message.
        else {
            System.out.println(
                    "Congratulations! " + winner
                            + "'s have won! Thanks for playing.");


        }
    }
}
