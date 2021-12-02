package Lena;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe_KI {
    private static final Scanner s = new Scanner(System.in);
    private static final  Random random = new Random();

    private static final String PLAYER_CHAR = "X";
    private static final String KI_CHAR = "O";
    private static final String TIE ="Tie";
    private static final String PLAYER_WON = "DU HAST GEWONNEN!";
    private static final String KI_WON = "DU HAST VERLOREN!";
    private static final String TIE_GAME = "UNENTSCHIEDEN!";

    public static void main(String[] args) {
        playTicTacToe();
    }


    public static void playTicTacToe() {
        String[][] matchField = new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

        int count = 1;

        printMatchfield(matchField);
        String winner=null;


        while (winner==null) {
            if(count%2!=0) {
                playersRound(matchField);
            }else{
                bestMoveForKI(matchField);
            }
            printMatchfield(matchField);
            count++;
            winner=winCheck(matchField);

        }

        if(winner.equals(PLAYER_CHAR)){
            System.out.println(PLAYER_WON);
        }else if(winner.equals(KI_CHAR)){
            System.out.println(KI_WON);
        }else if(winner.equals(TIE)){
            System.out.println(TIE_GAME);
        }

    }

    private static void bestMoveForKI(String[][]matchField){
        int bestScore = Integer.MIN_VALUE;
        int besti=-1;
        int bestj=-1;

        for (int i = 0; i < matchField.length; i++) {
            for (int j = 0; j < matchField[i].length; j++) {
                if(matchField[i][j].equals(" ")){
                    matchField[i][j]=KI_CHAR;
                    int score = minimax(matchField, 0, false);
                    matchField[i][j]=" ";
                    if(score>bestScore){
                        bestScore=score;
                        besti=i;
                        bestj=j;
                    }
                }
            }
        }
        System.out.println("Best Score for this move: "+bestScore);
        matchField[besti][bestj]=KI_CHAR;
    }

    private static int minimax(String[][]matchField, int depth,boolean isMaximizing){
        String winner = winCheck(matchField);
        if(winner!=null){
            return scores(winner);
        }

        if(isMaximizing){
            int bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < matchField.length; i++) {
                for (int j = 0; j < matchField[i].length; j++) {
                    if(matchField[i][j]==" "){
                        matchField[i][j]=KI_CHAR;
                        int score = minimax(matchField,depth+1,false);
                        matchField[i][j]=" ";
                        if(score>bestScore){
                            bestScore=score;
                        }
                    }
                }
            }

            return bestScore;
        }else{
            int bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < matchField.length; i++) {
                for (int j = 0; j < matchField[i].length; j++) {
                    if(matchField[i][j]==" "){
                        matchField[i][j]=PLAYER_CHAR;
                        int score = minimax(matchField,depth+1,true);
                        matchField[i][j]=" ";
                        if(score<bestScore){
                            bestScore=score;
                        }
                    }
                }
            }

            return bestScore;

        }
    }

    private static int scores(String winner){
        if(winner.equals(PLAYER_CHAR)){
            return -10;
        }else if(winner.equals(KI_CHAR)){
            return 10;
        }else if(winner.equals(TIE)){
            return 0;
        }

        return 0;
    }


    private static void playersRound(String [][] matchField){
        System.out.println("Du bist an der Reihe");
        System.out.println("Zeile: ");
        int row = s.nextInt();
        System.out.println("Spalte: ");
        int column = s.nextInt();
        while (!inputCheck(row, column, true) || !emptyFieldCheck(matchField, row, column,true)) {
            System.out.println("Zeile: ");
            row = s.nextInt();
            System.out.println("Spalte: ");
            column = s.nextInt();
        }


        matchField[row - 1][column - 1] = PLAYER_CHAR;
    }

    public static boolean emptyFieldCheck(String[][] matchField, int row, int column, boolean playersRound) {
        if(playersRound) {
            if (matchField[row - 1][column - 1].equals(" ")) {
            return true;
        }

            System.out.println("Dieses Feld ist schon belegt!");
            System.out.println("Wähle ein anderes: ");
            printMatchfield(matchField);
        }else{
            if (matchField[row][column].equals(" ")){
                return true;
            }
        }

        return false;
    }

    public static boolean inputCheck(int row, int column, boolean playersRound) {
        if (row > 3 || row < 1 || column > 3 || column < 1) {
            if(playersRound) {
                System.out.println("Diese Auswahl ist nicht möglich. Zeilen und Spalten sind nur von 1 - 3 möglich");
            }
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

    public static String winCheck(String[][] matchfield) {
        String winner = null;
        int openSpots=0;

        for (int i = 0; i < matchfield.length; i++) {
            if (matchfield[i][0].equals(PLAYER_CHAR) && matchfield[i][1].equals(PLAYER_CHAR) && matchfield[i][2].equals(PLAYER_CHAR)) {
                return PLAYER_CHAR;
            }
            if (matchfield[i][0].equals(KI_CHAR) && matchfield[i][1].equals(KI_CHAR) && matchfield[i][2].equals(KI_CHAR)) {
                return KI_CHAR;
            }
        }

        for (int i = 0; i < matchfield.length; i++) {
            if (matchfield[0][i].equals(PLAYER_CHAR) && matchfield[1][i].equals(PLAYER_CHAR) && matchfield[2][i].equals(PLAYER_CHAR)) {
                return PLAYER_CHAR;
            }
            if (matchfield[0][i].equals(KI_CHAR) && matchfield[1][i].equals(KI_CHAR) && matchfield[2][i].equals(KI_CHAR)) {
                return KI_CHAR;
            }
        }

        if (matchfield[0][0].equals(PLAYER_CHAR) && matchfield[1][1].equals(PLAYER_CHAR) && matchfield[2][2].equals(PLAYER_CHAR)) {
            return PLAYER_CHAR;
        }
        if (matchfield[0][0].equals(KI_CHAR) && matchfield[1][1].equals(KI_CHAR) && matchfield[2][2].equals(KI_CHAR)) {
            return KI_CHAR;
        }

        if (matchfield[2][0].equals(PLAYER_CHAR) && matchfield[1][1].equals(PLAYER_CHAR) && matchfield[0][2].equals(PLAYER_CHAR)) {
            return PLAYER_CHAR;
        }
        if (matchfield[2][0].equals(KI_CHAR) && matchfield[1][1].equals(KI_CHAR) && matchfield[0][2].equals(KI_CHAR)) {
            return KI_CHAR;
        }

        for (int i = 0; i < matchfield.length; i++) {
            for (int j = 0; j < matchfield[i].length; j++) {
                if(matchfield[i][j].equals(" ")){
                    openSpots++;
                }
            }
        }

        if(winner==null&&openSpots==0){
            return TIE;
        }else{
            return winner;
        }

    }
}

