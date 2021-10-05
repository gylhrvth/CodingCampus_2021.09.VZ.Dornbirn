package Bartosz.projects.blackjack;

import java.util.Scanner;
import java.util.Random;

public class initClass {


    // create & shuffle Cards
     public static int[] shuffleCards(int[] cardDeck) {
         for (int i = 0; i < cardDeck.length; i++) {
             cardDeck[i] = i+1;
         }

        for (int i = 0; i < cardDeck.length-1; i++) {
             Random rand = new Random();
             int index1 = rand.nextInt(52-1) + 1;
            int index2 = rand.nextInt(52-1) + 1;
            int temp = cardDeck[index1];
            cardDeck[index1] = cardDeck[index2];
            cardDeck[index2] = temp;
         }

        return cardDeck;
     }


     //playerhand befüllen
    public static int[] playerHand(int[] playerHand) {
         return playerHand;
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
        if(oneMoreCard.equals("yes") || oneMoreCard.equals("y") || oneMoreCard.equals("+")) {
            cardPlusOne = true;
        }else {
            cardPlusOne = false;
        }
        return cardPlusOne;
    }       // True - False


}
