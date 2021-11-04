package Plamena.week7;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeKI {
    private static int row;
    private static int column;
    private static int rounds;
    private static boolean compTurn = true;
    private static String[][] board = {{"", "", ""},
            {"", "", ""},
            {"", "", ""}};

    public static void main(String[] args) {

        printField(board);
        rounds = 1;

        while (rounds <= 10) {
            if (rounds % 2 != 0) {
                player();
                printField(board);
                rounds++;
            } else {
                computer();
                printField(board);
                rounds++;
            }
            if (rounds > 4) {
                chekWinner(board);
            }
        }

    }

    private static void startOver() {
        Scanner sc = new Scanner(System.in);
        System.out.println("To start over enter YES!");
        String wantToStartOver = sc.nextLine();

        if (wantToStartOver.equalsIgnoreCase("yes")) {
            board = new String[][]{{"", "", ""},
                    {"", "", ""},
                    {"", "", ""}};
            printField(board);
            rounds = 1;

        } else {
            System.out.println("Goodbye!");
            rounds = 11;
        }
    }

    private static void chekWinner(String[][] board) {

        for (int i = 0; i < board.length; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                if (board[i][0].contains("o")) {
                    System.out.println("Computer wins!");
                    startOver();
                } else if (board[i][0].contains("x")) {
                    System.out.println("Player 1 wins!");
                    startOver();
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
                if (board[0][i].contains("o")) {
                    System.out.println("Computer wins!");
                    startOver();
                } else if (board[0][i].contains("x")) {
                    System.out.println("Player 1 wins!");
                    startOver();
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
                if (board[0][0].contains("x")) {
                    System.out.println("Player 1 wins!");
                    startOver();
                } else if (board[0][0].contains("o")) {
                    System.out.println("Computer wins!");
                    startOver();
                }
            } else if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
                if (board[0][2].matches("x")) {
                    System.out.println("Player 1 wins!");
                    startOver();
                } else if (board[0][2].matches("o")) {
                    System.out.println("Computer wins!");
                    startOver();
                }
            }
        }
        if (rounds == 10) {
            System.out.println("You are even!");
            startOver();
        }
    }

    private static void player() {
        boolean fieldIsFree = false;
        while (!fieldIsFree) {
            System.out.println("Player, set row");
            row = input();
            System.out.println("Player, set column");
            column = input();
            if (rounds > 1 && !checkIfFieldIsFree(board)) {
                continue;
            } else {
                break;
            }
        }
        board[row - 1][column - 1] = "\u001B[31m" + "x" + "\u001B[0m";

    }

    private static void computer() {

        while (compTurn) {
            System.out.println("Computer playing");
            checkRows(board, "x");
            checkColumns(board, "x");
            checkDiagonals(board, "x");
            checkRows(board, "o");
            checkColumns(board, "o");
            checkDiagonals(board, "o");
            compRandomTurn(board);
        }
    }

    private static void compRandomTurn(String[][] board) {
        boolean freeField = false;
        while (!freeField) {
            Random rn = new Random();
            int row = rn.nextInt(2);
            int column = rn.nextInt(2);
            if (board[row][column].equals("")) {
                setTurn(row, column);
                break;
            }
        }
        compTurn = false;
    }

    private static void setTurn(int row, int column) {
        board[row][column] = "\u001B[32m" + "o" + "\u001B[0m";
    }

    private static void checkRows(String[][] board, String check) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((j == 0 & !checkIfFieldIsFreeComp(board,i,j)) && (board[i][1].contains(check) && board[i][2].contains(check))) {
                    setTurn(i, j);
                    compTurn = false;
                } else if ((j == 1 & !checkIfFieldIsFreeComp(board,i,j)) && (board[i][0].contains(check) && board[i][2].contains(check))) {
                    setTurn(i, j);
                    compTurn = false;
                } else if ((j == 2 & !checkIfFieldIsFreeComp(board,i,j)) && (board[i][1].contains(check) && board[i][0].contains(check))) {
                    setTurn(i, j);
                    compTurn = false;
                } else {
                    break;
                }
            }
        }
    }

    private static void checkColumns(String[][] board, String check) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if ((i == 0 && !checkIfFieldIsFreeComp(board,i,j)) && (board[1][j].contains(check) && board[2][j].contains(check))) {
                    setTurn(i, j);
                    compTurn = false;
                } else if ((i == 1 && !checkIfFieldIsFreeComp(board,i,j)) && (board[0][j].contains(check) && board[2][j].contains(check))) {
                    setTurn(i, j);
                    compTurn = false;
                } else if ((i == 2 && !checkIfFieldIsFreeComp(board,i,j)) && (board[1][j].contains(check) && board[0][j].contains(check))) {
                    setTurn(i, j);
                    compTurn = false;
                } else {
                    break;
                }
            }
        }
    }

    private static void checkDiagonals(String[][] board, String check) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if ((i == 0 && j == 0 && !checkIfFieldIsFreeComp(board,i,j)) && (board[1][1].contains(check) && board[2][2].contains(check))) {
                    setTurn(i, j);
                    compTurn = false;
                } else if ((i == 0 && j == 2 && !checkIfFieldIsFreeComp(board,i,j)) && (board[1][1].contains(check) && board[2][0].contains(check))) {
                    setTurn(i, j);
                    compTurn = false;
                } else if ((i == 2 && j == 2 && !checkIfFieldIsFreeComp(board,i,j)) && (board[1][1].contains(check) && board[0][0].contains(check))) {
                    setTurn(i, j);
                    compTurn = false;
                } else if ((i == 2 && j == 0 && !checkIfFieldIsFreeComp(board,i,j)) && (board[1][1].contains(check) && board[0][2].contains(check))) {
                    setTurn(i, j);
                    compTurn = false;
                } else if ((i == 1 && j == 1 && !checkIfFieldIsFreeComp(board,i,j)) && (board[0][0].contains(check) && board[2][2].contains(check))) {
                    setTurn(i, j);
                    compTurn = false;
                } else if ((i == 1 && j == 1 && !checkIfFieldIsFreeComp(board,i,j)) && ((board[0][0].contains(check) && board[2][2].contains(check)) || (board[0][2].contains(check) && board[2][0].contains(check)))) {
                    setTurn(i, j);
                    compTurn = false;
                } else {
                    break;
                }
            }
        }
    }

    private static int input() {
        int input;
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Enter valid number!");
        }
        input = sc.nextInt();
        if (input < 1 || input > 3) {
            System.out.println("Enter a valid number between 1 and 3");
            return input();
        } else return input;
    }

    private static boolean checkIfFieldIsFree(String[][] board) {
        if (!board[row - 1][column - 1].equals("")) {
            System.out.println("Field already taken! Try again!");
            return false;
        } else {
            return true;
        }
    }


    private static boolean checkIfFieldIsFreeComp(String[][] board, int row, int column) {
        if (board[row][column].equals("")) {
            return false;
        } else {
            return true;
        }
    }


    public static void printField(String[][] board) {

        System.out.println("-------------------");
        System.out.printf("|  %1s  |  %1s  |  %1s  |%n", board[0][0], board[0][1], board[0][2]);
        System.out.println("-------------------");
        System.out.printf("|  %1s  |  %1s  |  %1s  |%n", board[1][0], board[1][1], board[1][2]);
        System.out.println("-------------------");
        System.out.printf("|  %1s  |  %1s  |  %1s  |%n", board[2][0], board[2][1], board[2][2]);
        System.out.println("-------------------");
    }
}
