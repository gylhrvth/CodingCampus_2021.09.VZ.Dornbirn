package danny.array.TicTacToe;


import java.util.Arrays;
import java.util.Scanner;

public class TIcTacToe {

    public static final String[][] matrix = new String[3][3];
    public static final String player1 = "|X";
    public static final String player2 = "|O";
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
                askPlayer(2);
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
            System.out.println("Player 2 hat gewonnen");
            winner = true;
        }
    }

    public static void checkWin() {
        int countPlayer1 = 0;
        int countPlayer2 = 0;

        // checken wagerecht
        for (String[] strings : matrix) {
            for (String string : strings) {
                if (string.equals(player1)) {
                    countPlayer1++;
                }
                if (string.equals(player2)) {
                    countPlayer2++;
                }
            }
            winPlayer1(countPlayer1);
            winPlayer2(countPlayer2);
            countPlayer1 = 0;
            countPlayer2 = 0;
        }
        // checken senkrecht
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i].equals(player1)) {
                    countPlayer1++;
                }
                if (matrix[j][i].equals(player2)) {
                    countPlayer2++;
                }
            }
            winPlayer1(countPlayer1);
            winPlayer2(countPlayer2);
            countPlayer1 = 0;
            countPlayer2 = 0;
        }
        // checken diagonal
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i].equals(player1)) {
                countPlayer1++;
            }
            if (matrix[i][i].equals(player2)) {
                countPlayer2++;
            }
        }
        winPlayer1(countPlayer1);
        winPlayer2(countPlayer2);
        countPlayer1 = 0;
        countPlayer2 = 0;
        int j = 0;
        for (int i = matrix.length - 1; i > 0; i--) {
            if (matrix[i][j].equals(player1)) {
                countPlayer1++;
            }
            if (matrix[i][j].equals(player2)) {
                countPlayer2++;
            }
            j++;
        }
        winPlayer1(countPlayer1);
        winPlayer2(countPlayer2);
        countPlayer1 = 0;
        countPlayer2 = 0;
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

        if (player == 1) {
            matrix[row][column] = player1;
        } else {
            matrix[row][column] = player2;
        }
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
