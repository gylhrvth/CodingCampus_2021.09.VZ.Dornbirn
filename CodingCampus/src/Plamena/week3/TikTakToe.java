package Plamena.week3;

import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {

        printField();

        int [] row = new int [2];
        int [] column = new int [2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Player 1, set height");
        row [0] = sc.nextInt();
        System.out.println("Player 1, set width");

        System.out.println("Player 2, set height");
        System.out.println("Player 2, set width");




    }


    public static void printField (){
        System.out.println("----------");
        System.out.println("|  |  |  |");
        System.out.println("----------");
        System.out.println("|  |  |  |");
        System.out.println("----------");
    }
}
