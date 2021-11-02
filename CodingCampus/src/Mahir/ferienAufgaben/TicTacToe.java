package Mahir.ferienAufgaben;


import java.util.Scanner;

public class TicTacToe {
    public static int row, col;
    public static Scanner scanner = new Scanner(System.in);
    public static char[][] board = new char[3][3];
    public static char playerTurn = 'X';

    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
        play();
    }

    public static void play() {
        boolean playing = true;
        System.out.println("Player X'sturn to play!");
        printBoard();
        while (playing) {
            System.out.println("\n Enter row and column");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
            board[row][col] = playerTurn;

            if (gameOver(row, col)) {
                playing = false;
                System.out.println("Game over! player " + playerTurn + " wins! ");
            }
            printBoard();
            if (playerTurn == 'X') {
                playerTurn = 'o';
            } else {
                playerTurn = 'X';
            }
            if (playerTurn == 'X') {
                System.out.println("Player X'sturn to play!  ");
            } else if (playerTurn == 'o') {
                System.out.println("Player O's turn to play! ");

            }
        }
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

    public static boolean gameOver(int move1, int move2) {

        if (board[0][move2] == board[1][move2] && board[0][move2] == board[2][move2])
            return true;
        if (board[move1][0] == board[move1][1] && board[move1][0] == board[move1][2])
            return true;
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] != '_')
            return true;
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[1][1] != '_')
            return true;
        return false;
    }
}
