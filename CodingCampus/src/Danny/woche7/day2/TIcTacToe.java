package Danny.woche7.day2;

import java.util.NoSuchElementException;
import java.util.Scanner;


public class TIcTacToe {

    public static final String[][] matrix = new String[4][4];
    public static final String player1 = "|X";
    public static final String player2 = "|O";

    public static void main(String[] args) {


        createMatrix();
        askPlayer(1);
//        askPlayers2();
//        printMatrix();


    }
    public static boolean checkWin () {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == player1) {

                }
            }

        }
    }





    public static boolean checkCoordinate(int row, int column) {
        boolean occupied = false;
        if (matrix[row][column] == "|X" || matrix[row][column] == "|O") {
            System.out.println("Dieses Feld ist bereits belegt!");
            occupied = true;
        }
        return occupied;
    }

    public static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int scanNumber = 0;
        while (!scan.hasNextInt()) {
            System.out.println("Bitte Zahl eingeben");
            scan.nextLine();
        }
        scanNumber = scan.nextInt();
        return scanNumber;
    }


    public static void askPlayer(int player) {
        System.out.println();
        System.out.println("Player " + player + " gib eine Koordinate ein.");
        System.out.println("Wert 1: Für die Zeile gib eine Zahl von 1 bis " + matrix.length + " ein.");
        int row = scanNumber();
        System.out.println("Wert 2: Für die Spalte gib eine Zahl von 1 bis " + matrix.length + " ein.");
        int column = scanNumber();

        while (checkCoordinate(row, column)) {
            System.out.println("Player " + player + " gib eine Koordinate ein.");
            System.out.println("1. Gib für die Zeile eine Zahl von 1 bis " + matrix.length + "ein.");
            row = scanNumber();
            System.out.println("2. Gib für die Spalte eine Zahl von 1 bis " + matrix.length + "ein.");
            column = scanNumber();
        }
        if (player == 1) {
            matrix[row][column] = player1;
        } else {
            matrix[row][column] = player2;
        }
    }

    public static void askPlayers2() {
        Scanner scan = new Scanner(System.in);
        //Player 2
        System.out.println("Player 2 gib eine Koordinate ein.");
        System.out.println("1.Eingabe für die Zeile dann ENTER");
        System.out.println("2.Eingabe für die Spalte dann ENTER");
        matrix[scan.nextInt() - 1][scan.nextInt() - 1] = "|" + player2;
    }

    public static void createMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = "|_";
            }
        }
    }

    public static void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("|");
        }
    }
}
