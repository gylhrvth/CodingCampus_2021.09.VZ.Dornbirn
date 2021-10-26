package Danny.woche7.day2;

import java.util.Scanner;


public class TIcTacToe {

    public static String[][] matrix = new String[4][4];
    public static final String player1 = "X";
    public static final String player2 = "O";

    public static void main(String[] args) {


//        createMatrix();
//        askPlayers1();
//        askPlayers2();
//        printMatrix();
        System.out.println(inputCheck());

    }

    public static int inputCheck() {
        Scanner scan = new Scanner(System.in);
        int scanNumber = 0;
        while (!scan.hasNextInt()){
            if (scan.hasNextInt()) {
                scanNumber = scan.nextInt();
            }
            scan.close();



        }
        return scanNumber;
    }


    public static void askPlayers1() {

        //Player 1
        System.out.println("Player 1 gib eine Koordinate ein.");
        System.out.println("1.Eingabe für die Zeile dann ENTER");

        System.out.println("2.Eingabe für die Spalte dann ENTER");


//        if ((matrix[scan.nextInt()-1][scan.nextInt()-1]).compareTo("|_"))
//        matrix[scan.nextInt()-1][scan.nextInt()-1] = "|" + player1;
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
