package Lena;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        playTicTacToe();
    }


    public static void playTicTacToe() {
        String[][] matchField = new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        Scanner s = new Scanner(System.in);
        int count = 1;

        printMatchfield(matchField);


        while (winCheck(matchField, count)) {
            System.out.println("Es ist Spieler " + getPlayer(count) + " an der Reihe");
            System.out.println("Zeile: ");
            int row = s.nextInt();
            System.out.println("Spalte: ");
            int column = s.nextInt();
            while (!inputCheck(row, column) || !emptyFieldCheck(matchField, row, column)) {
                System.out.println("Zeile: ");
                row = s.nextInt();
                System.out.println("Spalte: ");
                column = s.nextInt();
            }

            matchField[row - 1][column - 1] = getPlayerChar(getPlayer(count));

            printMatchfield(matchField);
            count++;
        }

    }

    public static int getPlayer(int count) {
        if (count % 2 == 0) {
            return 2;
        }
        return 1;
    }

    public static String getPlayerChar(int player) {
        if (player == 1) {
            return "X";
        }
        return "O";
    }

    public static boolean emptyFieldCheck(String[][] matchField, int row, int column) {
        if (matchField[row - 1][column - 1].equals(" ")) {
            return true;
        }
        System.out.println("Dieses Feld ist schon belegt!");
        System.out.println("Wähle ein anderes: ");
        printMatchfield(matchField);
        return false;
    }

    public static boolean inputCheck(int row, int column) {
        if (row > 3 || row < 1 || column > 3 || column < 1) {
            System.out.println("Diese Auswahl ist nicht möglich. Zeilen und Spalten sind nur von 1 - 3 möglich");
            return false;
        }
        return true;
    }

    public static void printMatchfield(String[][] matchField) {

        for (int i = 0; i < matchField.length; i++) {
            for (int j = 0; j < matchField[i].length; j++) {
                if (matchField[i][j] != null) {
                    System.out.print(" | " + matchField[i][j]);
                } else {
                    System.out.print(" |  ");
                }
            }
            System.out.println(" |");
            if (i != matchField.length - 1) {
                System.out.println(" |---|---|---|");
            }

        }
        System.out.println();

    }

    public static boolean winCheck(String[][] matchfield, int count) {

        for (int i = 0; i < matchfield.length; i++) {
            if (matchfield[i][0].equals("X") && matchfield[i][1].equals("X") && matchfield[i][2].equals("X")) {
                System.out.println("Es hat Spieler " + 1 + " gewonnen");
                return false;
            }
            if (matchfield[i][0].equals("O") && matchfield[i][1].equals("O") && matchfield[i][2].equals("O")) {
                System.out.println("Es hat Spieler " + 2 + " gewonnen");
                return false;
            }
        }

        for (int i = 0; i < matchfield.length; i++) {
            if (matchfield[0][i].equals("X") && matchfield[1][i].equals("X") && matchfield[2][i].equals("X")) {
                System.out.println("Es hat Spieler " + 1 + " gewonnen");
                return false;
            }
            if (matchfield[0][i].equals("O") && matchfield[1][i].equals("O") && matchfield[2][i].equals("O")) {
                System.out.println("Es hat Spieler " + 2 + " gewonnen");
                return false;
            }
        }

        if (matchfield[0][0].equals("X") && matchfield[1][1].equals("X") && matchfield[2][2].equals("X")) {
            System.out.println("Es hat Spieler 1 gewonnen");
            return false;
        }
        if (matchfield[0][0].equals("O") && matchfield[1][1].equals("O") && matchfield[2][2].equals("O")) {
            System.out.println("Es hat Spieler 2 gewonnen");
            return false;
        }

        if (count == 10) {
            System.out.println("Es hat leider niemand Gewonnen");
            return false;
        }

        return true;
    }

}

