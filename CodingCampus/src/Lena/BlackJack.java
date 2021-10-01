package Lena;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int startCredit=100;
        letsPlayBlackJack(startCredit);


    }

    public static void letsPlayBlackJack(int playerCredit) {
        //Preperation for the Game
        int[] cardDeck = new int[52];
        int[] dealerHand = new int[26];
        int[] playerHand = new int[25];
        int playerCreditAcutally = playerCredit;
        fillCardDeck(cardDeck);
        shuffle(cardDeck);
        resetHand(dealerHand);
        resetHand(playerHand);

        //bet
        int playersBet = aksBet(playerCreditAcutally);

        //first handOut
        handOut(cardDeck, dealerHand);
        handOut(cardDeck, playerHand);
        handOut(cardDeck, playerHand);
        printHand(dealerHand);
        printHand(playerHand);

        // while player wants more cards

        while (anotherCard(playerHand)) {
            handOut(cardDeck, playerHand);
            printHand(playerHand);
            if (!bustCheck(playerHand)) {
                playerLost(playerCreditAcutally, playersBet);
                break;
            }
        }


        //Dealer fills his Hand
        while (dealerHandCheck(dealerHand)){
            handOut(cardDeck, dealerHand);
            printHand(dealerHand);

        }

        if(getHandValue(dealerHand)>21){
            playerWon(playerCreditAcutally,playersBet);
        }else {
            if(whoWon(playerHand,dealerHand)==1){
                playerWon(playerCreditAcutally,playersBet);
            }else {
                playerLost(playerCreditAcutally,playersBet);
            }

        }

    }

    public static void newGame(int playerCredit){
        if(playerCredit>0) {
            System.out.println();
            System.out.println("Noch eine Runde?");
            System.out.println("+ => noch eine Runde");
            System.out.println("- => Beenden");
            String input = scanner.next();

            if (input.equals("+")) {
                letsPlayBlackJack(playerCredit);
            } else if (!input.equals("-")) {
                System.out.println();
                System.out.println("Keine gültige eingabe!!");
                newGame(playerCredit);
            }
        }else {
            System.out.println();
            System.out.println(setColorYellow()+"--DU BIST PLEITE--"+resetColor());
        }

    }
    public static int whoWon(int[] playerHand, int[]dealerHand){
        if(getHandValue(playerHand)>getHandValue(dealerHand)){
            return 1;
        }
        System.out.println();
        System.out.println(setColorYellow()+"--BANK GEWINNT--"+resetColor());
        return 2;
    }
    public static boolean dealerHandCheck(int[]hand){
        int sum =getHandValue(hand);

        if(sum>21){
            System.out.println();
            System.out.println(setColorYellow()+"--BANK HAT SICH VERKAUFT--"+resetColor());
            return false;
            //DealerLost
        }
        if(sum>=17){
            System.out.println();
            System.out.println(setColorYellow()+"--DEALER STANDS AT "+getHandValue(hand)+"--"+resetColor());
            return false;
        }

        return true;
    }
    public static boolean bustCheck(int[] hand) {
        int sum = getHandValue(hand);
        if (sum > 21) {
            System.out.println();
            System.out.println(setColorYellow()+"--DU HAST DICH VERKAUFT--"+resetColor());
            System.out.println();
            return false;
        }
        return true;
    }

    public static int[] fillCardDeck(int[] cardDeck) {
        for (int i = 0; i < cardDeck.length; i++) {
            cardDeck[i] = i + 1;
        }
        return cardDeck;
    }

    public static int[] shuffle(int[] cardDeck) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int index1 = random.nextInt(52);
            int index2 = random.nextInt(52);
            int helpVar = cardDeck[index1];
            cardDeck[index1] = cardDeck[index2];
            cardDeck[index2] = helpVar;
        }

        return cardDeck;
    }

    public static int getCardValue(int card) {
        if (card < 0) {
            return card;
        }
        int value = 13 - card % 13;
        if (value >= 10 &&value<13) {
            return 10;
        }
        if (value==13){
            return 11;
        }
        return value;
    }

    public static String getCardName(int card) {
        double nameIndex = card / 13.0;
        if (nameIndex == 0) {
            return "";
        }
        if (nameIndex > 0 && nameIndex <= 1.0) {
            return "Herz";
        }
        if (nameIndex > 1.0 && nameIndex <= 2.0) {
            return "Pik";
        }
        if (nameIndex > 2.0 && nameIndex <= 3.0) {
            return "Kreuz";
        }
        if (nameIndex > 3.0 && nameIndex <= 4.0) {
            return "Karo";
        }
        return "Kein passender Name gefunden";
    }

    public static String printCard(int card) {
        if (card >= 0) {
            return "[ " + getCardName(card) + " " + getCardValue(card) + " ]";
        }
        return "";
    }

    public static void printHand(int[] hand) {
        System.out.println();
        if (hand.length == 26) {
            System.out.println("Dealer Hand:");
        } else {
            System.out.println("Player Hand:");
        }
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != -1) {
                System.out.print(printCard(hand[i]) + " ");
            }
        }
        System.out.println();
    }

    public static int[] resetHand(int[] hand) {
        for (int i = 0; i < hand.length; i++) {
            hand[i] = -1;
        }

        return hand;
    }

    public static int[] handOut(int[] cardDeck, int[] hand) {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == -1) {
                hand[i] = takeACardfromDeck(cardDeck);
                break;
            }
        }
        return hand;
    }

    public static int takeACardfromDeck(int[] cardDeck) {
        for (int i = 0; i < cardDeck.length; i++) {
            if (cardDeck[i] != -1) {
                int card = cardDeck[i];
                cardDeck[i] = -1;
                return card;
            }
        }
        return -1;
    }

    public static int aksBet(int playersCredit) {
        boolean creditCheck = false;
        int bet = 0;

        while (!creditCheck) {
            System.out.println("Wie viel Geld möchtest du setzen?");
            System.out.println("Dein aktueller Kontostand beträgt " + playersCredit + "€.");
            bet = scanner.nextInt();
            if (bet > playersCredit) {
                System.out.println("Du hast leider nicht mehr genug Geld um soviel zu setzen.");
            } else {
                creditCheck = true;
            }
        }
        System.out.println("Dein Einsatz für diese Runde beträgt " + bet + "€");
        return bet;
    }

    public static boolean anotherCard(int[]hand) {
        System.out.println();
        System.out.println("Möchtest du noch eine Karte?");
        System.out.println("+ => noch eine Karte");
        System.out.println("- => keine Karte mehr");

        String anotherCard = scanner.next();

        if (anotherCard.equals("+")) {
            return true;
        } else if (anotherCard.equals("-")) {
            System.out.println(setColorYellow()+"--PLAYER STANDS AT "+getHandValue(hand)+"--"+resetColor());
            return false;
        } else {
            System.out.println("Keine gültige Eingabe");
            anotherCard(hand);
        }

        return true;

    }

    public static int playerLost(int playersCredit, int playersBet){
        System.out.println("Du hast leider "+playersBet+"€ verloren :-(");
        System.out.println("Dein neuer Kontostand beträgt:"+(playersCredit-playersBet)+"€.");
        newGame(playersCredit-playersBet);
        return playersCredit-playersBet;
    }

    public static int playerWon(int playersCredit, int playersBet){
        System.out.println();
        System.out.println(setColorGreen()+"--GEWONNEN!!--"+resetColor());
        System.out.println();
        System.out.println("Du hast deinen Einsatz verdoppelt!");
        System.out.println("Dein neuer Kontostand beträgt:"+(playersCredit+playersBet*2)+"€.");
        newGame(playersCredit+playersBet*2);
        return playersCredit+playersBet*2;
    }

    public static int getHandValue(int[]hand){
        int sum=0;
        for (int card:hand){
            if(card==-1){
                break;
            }
            sum+=getCardValue(card);
        }
        return sum;
    }

    public static String setColorYellow(){
        return "\u001B[33m";
    }
    public static String setColorRed(){
        return "\u001B[31m";
    }

    public static String resetColor(){
        return "\u001B[0m";
    }
    public static String setColorGreen(){
        return "\u001B[32m";
    }


}
