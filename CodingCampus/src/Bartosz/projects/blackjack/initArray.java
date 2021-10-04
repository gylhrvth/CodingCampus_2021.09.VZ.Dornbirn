package Bartosz.projects.blackjack;

import java.util.Scanner;

public class initArray {

     int[] cardDeck = new int[52];

     public static void shuffleCards(int[] cardDeck) {
         for (int i = 1; i < cardDeck.length; i++) {

         }
     }


    // checkt player's input ob spielbeginn
    public static boolean gameStart() {

        System.out.println("------------Blackjack------------");
        System.out.println("Do you want to play? y / n");
        Scanner playGame = new Scanner(System.in);
        String playerInput = playGame.next();

        boolean start;
        if(playerInput.equals("yes") || playerInput.equals("y")){
            start = true;
        }else {
            start = false;
        }
        return start;
    }

    // checkt, ob genug Geld
    public static boolean checkCreditScore(int creditScore) {
        boolean canPlay;
        System.out.println("your credit Score is : " + creditScore);
        if (creditScore > 0) {
            canPlay = true;
        }else {
            System.out.println("Not enough Credit left.");
            canPlay = false;
        }
        return canPlay;
    }       // True - False

    // Checkt ob Partei Karte haben möchte
    public static boolean checkForMoreCard(){
        System.out.println("Do you want another card?");
        Scanner playerHandAddition = new Scanner(System.in);
        String oneMoreCard =  playerHandAddition.next();
        boolean cardPlusOne;
        if(oneMoreCard.equals("yes") || oneMoreCard.equals("y")) {
            cardPlusOne = true;
        }else {
            cardPlusOne = false;
        }
        return cardPlusOne;
    }       // True - False


}
