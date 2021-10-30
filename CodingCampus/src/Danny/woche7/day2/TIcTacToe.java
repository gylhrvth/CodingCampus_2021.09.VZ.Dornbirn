package Danny.woche7.day2;


import Danny.woche7.day3.FindBestMove;
import Lukas.week4.day3.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class TIcTacToe {

    public static final String[][] matrix = new String[3][3];
    public static final String player1 = "|X";
    public static final String playerKI = "|O";
    public static final String emty = "|_";
    public static boolean winner = false;

    public static void main(String[] args) {


        createMatrix();
        printMatrix();
        do {
            askPlayer(1);
            printMatrix();
            checkWin();
            if (winner == true) {
                break;
            }
            System.out.println();
            System.out.println("Computer hat spielt");
            FindBestMove.main();
            printMatrix();
            checkWin();
        } while (winner == false);


    }

    public static void winPlayer1(int countPlayer1) {
        if (countPlayer1 == 3) {
            System.out.println("Player 1 hat gewonnen");
            winner = true;
        }
    }

    public static void winPlayer2(int countPlayer2) {
        if (countPlayer2 == 3) {
            System.out.println("Computer hat gewonnen");
            winner = true;
        }
    }

    public static void checkWin() {
        int countPlayer1 = 0;
        int countPlayer2 = 0;

        // checken wagerecht
        for (String[] strings : matrix) {
            for (String string : strings) {
                if (string.equals(player1))
                    countPlayer1++;
                else if (string.equals(playerKI))
                    countPlayer2++;

            }
            winPlayer1(countPlayer1);
            winPlayer2(countPlayer2);
            countPlayer1 = 0;
            countPlayer2 = 0;
        }
        // checken senkrecht
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i].equals(player1))
                    countPlayer1++;
                else if (matrix[j][i].equals(playerKI))
                    countPlayer2++;

            }
            winPlayer1(countPlayer1);
            winPlayer2(countPlayer2);
            countPlayer1 = 0;
            countPlayer2 = 0;
        }
        // checken diagonal
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i].equals(player1))
                countPlayer1++;
            else if (matrix[i][i].equals(playerKI))
                countPlayer2++;

        }
        winPlayer1(countPlayer1);
        winPlayer2(countPlayer2);
        countPlayer1 = 0;
        countPlayer2 = 0;
        int j = 0;
        for (int i = matrix.length - 1; i > 0; i--) {
            if (matrix[i][j].equals(player1))
                countPlayer1++;
            else if (matrix[i][j].equals(playerKI))
                countPlayer2++;

            j++;
        }
        winPlayer1(countPlayer1);
        winPlayer2(countPlayer2);
    }


    public static boolean checkCoordinate(int row, int column) {
        boolean occupied = false;
        if (matrix[row][column].equals("|X") || matrix[row][column].equals("|O")) {
            System.out.println("Dieses Feld ist bereits belegt!");
            occupied = true;
        }
        return occupied;
    }

    public static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int scanNumber;
        while (!scan.hasNextInt()) {
            System.out.println("Bitte Zahl eingeben");
            scan.nextLine();
        }
        scanNumber = scan.nextInt() - 1;
        return scanNumber;
    }

    public static void askPlayer(int player) {

        int row;
        int column;

        do {
            System.out.println("Player " + player + " gib eine Koordinate nach dem Schema Zeile/Spalte ein.");
            System.out.println("1. Für die Zeile wähle eine Zahl von 1 bis " + matrix.length + " ein.");
            row = scanNumber();
            System.out.println("2. Für die Spalte wähle eine Zahl von 1 bis " + matrix.length + " ein.");
            column = scanNumber();
        } while (checkCoordinate(row, column));

            matrix[row][column] = player1;

    }

    public static void createMatrix() {
        for (String[] strings : matrix) {
            Arrays.fill(strings, emty);
        }
    }

    public static void printMatrix() {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println("|");
        }
    }
}
