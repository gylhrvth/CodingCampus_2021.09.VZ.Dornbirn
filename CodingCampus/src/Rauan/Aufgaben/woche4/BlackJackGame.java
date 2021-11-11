package Rauan.Aufgaben.woche4;

import java.util.Scanner;

public class BlackJackGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //input
        System.out.print(" Enter player #1's hand-value:");
        int play1 = scan.nextInt();
        System.out.println(" Enter player #2's hand-value:");
        int play2 = scan.nextInt();

        //Both Bust, >21
        if ((play1 > 21) && (play2 > 21))
            System.out.println("both players bust");
        else if ((play1 > 21) && (play2 <= 21))
            System.out.println("player 2 Wins!");
        else if ((play2 > 21) && (play1 <= 21))
            System.out.println("player 1 Wins!");
            //Tie
        else if (play2 == play1)
            System.out.println("Tie");
            //player 1 Wins
        else if (play1 > play2)
            System.out.println("player 1 Wins1");
            //player 2 Wins
        else if (play2 > play1)
            System.out.println("payer 2 Wins!");
        else
            System.out.println("should never print");
    }
}
