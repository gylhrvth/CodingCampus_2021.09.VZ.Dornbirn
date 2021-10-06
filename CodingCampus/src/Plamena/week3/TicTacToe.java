package Plamena.week3;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        printField();

        int [] []board = new int [3] [3];


        Scanner sc = new Scanner(System.in);

        System.out.println("Player 1, set row");

        int row = sc.nextInt();
        int column = sc.nextInt();
     //   String [row] [column] board = new String [][];

        System.out.println("Player 1, set column");

        System.out.println("Player 2, set row");
        System.out.println("Player 2, set column");




    }


    public static void printField (){
        System.out.println("----------");
        System.out.println("|  |  |  |");
        System.out.println("----------");
        System.out.println("|  |  |  |");
        System.out.println("----------");
    }
}
