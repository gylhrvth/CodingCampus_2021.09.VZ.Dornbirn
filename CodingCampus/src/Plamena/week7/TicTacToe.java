package Plamena.week7;

import java.util.Scanner;

public class TicTacToe {
    private static int row;
    private static int column;
    private static int rounds;
    private static String[][] board = {{"", "", ""},
            {"", "", ""},
            {"", "", ""}};

    public static void main(String[] args) {

        printField(board);
        rounds = 1;

        while (rounds <= 10) {
            if (rounds % 2 != 0) {
                player1();
                printField(board);
                rounds++;
            } else {
                player2();
                printField(board);
                rounds++;
            }
            if (rounds > 4) {
                chekWinner(board);
            }
        }

    }

    private static void startOver(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To start over enter YES!");
        String wantToStartOver = sc.nextLine();

        if(wantToStartOver.equalsIgnoreCase("yes")){
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
                    System.out.println("Player 2 wins!");
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
                    System.out.println("Player 2 wins!");
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
                    System.out.println("Player 2 wins!");
                    startOver();
                }
            } else if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
                if (board[0][2].matches("x")) {
                    System.out.println("Player 1 wins!");
                    startOver();
                } else if (board[0][2].matches("o")) {
                    System.out.println("Player 2 wins!");
                    startOver();
                }
            }
        }
        if(rounds == 10){
            System.out.println("You are even!");
            startOver();
        }
    }

    private static void player1() {
        boolean fieldIsFree = false;
        while (!fieldIsFree) {
            System.out.println("Player 1, set row");
            row = input();
            System.out.println("Player 1, set column");
            column = input();
            if (rounds > 1 && !checkIfFieldIsFree(board)) {
                continue;
            } else {
                break;
            }
        }
        board[row - 1][column - 1] = "\u001B[31m" + "x" + "\u001B[0m";

    }

    private static void player2() {
        boolean fieldIsFree = false;
        while (!fieldIsFree) {
            System.out.println("Player 2, set row");
            row = input();
            System.out.println("Player 2, set column");
            column = input();
            if (checkIfFieldIsFree(board)) {
                board[row - 1][column - 1] = "\u001B[32m" + "o" + "\u001B[0m";
                break;
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
