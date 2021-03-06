package Lena;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int startCredit = 100;

        System.out.println("\u2663");
        System.out.println(setColorRed() + "\u2666" + resetColor());
        System.out.println(setColorRed() + "\u2665" + resetColor());
        System.out.println("\u2660");


        letsPlayBlackJack(startCredit);
    }

    public static void letsPlayBlackJack(int startCredit) {
        System.out.println(setColorGreen()+"****EINE NEUE RUNDE BEGINNT****"+resetColor());
        System.out.println();

        //Preperation for the Game
        int[] cardDeck = new int[52];
        int[] dealerHand = new int[13];
        int[] playerHand = new int[12];
        int playerCredit = startCredit;
        boolean playerInTheGame = true;



        fillCardDeck(cardDeck);

        for (int i = 0; i < cardDeck.length; i++) {
            System.out.println(printCard(cardDeck[i]));

        }

        shuffle(cardDeck);
        resetHand(dealerHand);
        resetHand(playerHand);

        //bet
        int playersBet = aksBet(playerCredit);

        //first handOut
        handOut(cardDeck, dealerHand);
        handOut(cardDeck, playerHand);
        handOut(cardDeck, playerHand);
        printHand(dealerHand);
        printHand(playerHand);

        //checks if Player got over 21 in the first Handout
        if (!bustcheck(playerHand)) {
            playerInTheGame = false;
        }

        //Player fill his Hands, while not bust or stands
        while (playerInTheGame && anotherCard(playerHand)) {
            handOut(cardDeck, playerHand);
            printHand(playerHand);
            if (!bustcheck(playerHand)) {
                playerInTheGame = false;
            }

        }

        //Dealer fill his hands, if player not bust
        if (playerInTheGame) {
            while (dealerHandCheck(dealerHand)) {
                handOut(cardDeck, dealerHand);
                printHand(dealerHand);
            }
            //Checks who won, after dealer stands over 16. Returns 2 == dealer won
            if (whoWon(playerHand, dealerHand) == 2) {
                playerInTheGame = false;
            }
        }
        if(whoWon(playerHand, dealerHand)==3){
            System.out.println();
            System.out.println(setColorYellow()+"--TIE GAME--"+resetColor());
            System.out.println();
            System.out.println("Dei Kontostand betr??gt "+playerCredit+"???.");
            newRound(playerCredit);
        }else if (!playerInTheGame) {
            System.out.println();
            System.out.println(setColorYellow() + "--BANK GEWINNT--" + resetColor());
            playerCredit = playerLost(playerCredit, playersBet);
            newRound(playerCredit);
        } else {
            playerCredit = playerWon(playerCredit, playersBet);
            newRound(playerCredit);
        }
    }

    public static int whoWon(int[] playerHand, int[] dealerHand) {

        //return 1-> Player won, return 2->Bank won, return 3->tieGame
        if (getHandValue(dealerHand) > 21) {
            return 1;
        }
        if (getHandValue(playerHand) > getHandValue(dealerHand)) {
            return 1;
        }
        if(getHandValue(playerHand)== getHandValue(dealerHand)){
            return 3;
        }
        return 2;
    }

    public static int playerWon(int playersCredit, int playersBet) {
        System.out.println();
        System.out.println(setColorGreen() + "--GEWONNEN!!--" + resetColor());
        System.out.println();
        System.out.println("Du hast deinen Einsatz verdoppelt!");
        System.out.println("Dein neuer Kontostand betr??gt:" + (playersCredit + playersBet ) + "???.");
        return playersCredit + playersBet ;
    }

    public static boolean dealerHandCheck(int[] hand) {
        int sum = getHandValue(hand);

        if (sum > 21) {
            System.out.println();
            System.out.println(setColorYellow() + "--BANK HAT SICH VERKAUFT--" + resetColor());
            return false;
            //DealerLost
        }
        if (sum >= 17) {
            System.out.println();
            System.out.println(setColorYellow() + "--DEALER STANDS AT " + sum + "--" + resetColor());
            return false;
        }

        return true;
    }

    public static void newRound(int playerCredit) {
        String input = "";

        if (playerCredit <= 0) {

            fillCredit();

        } else if (playerCredit > 0) {
            System.out.println();
            System.out.println("Noch eine Runde?");
            System.out.println("+ => noch eine Runde");
            System.out.println("- => Beenden");
            input = scanner.next();

            if (input.equals("+")) {
                letsPlayBlackJack(playerCredit);
            } else if (!input.equals("-")) {
                System.out.println();
                System.out.println("Keine g??ltige eingabe!!");
                newRound(playerCredit);
            }
        }
    }

    public static void fillCredit() {
        System.out.println();
        System.out.println(setColorYellow() + "--DU BIST PLEITE--" + resetColor());
        System.out.println();
        System.out.println("M??chtest du dein Konto auf??llen?");
        System.out.println("+ => Ja");
        System.out.println("- => Nein, Spiel beenden");
        String inputCreditFill = scanner.next();
        if (inputCreditFill.equals("+")) {
            System.out.println("Auf wie viel m??chtest du dein Konto auff??llen?");
            int newCredit = scanner.nextInt();
            letsPlayBlackJack(newCredit);
        } else if (!inputCreditFill.equals("-")) {
            System.out.println("Keine g??ltige Eingabe");
        } else {

        }
    }

    //korrigiert den kontostand, bei Verlust
    public static int playerLost(int playersCredit, int playersBet) {
        System.out.println();
        System.out.println(setColorRed() + "--VERLOREN--" + resetColor());
        System.out.println();
        System.out.println("Du hast leider " + playersBet + "??? verloren.");
        System.out.println("Dein neuer Kontostand betr??gt:" + (playersCredit - playersBet) + "???.");
        return playersCredit - playersBet;
    }


    //Check ob sich Spieler verkauft hat
    public static boolean bustcheck(int[] hand) {
        int sum = getHandValue(hand);
        if (sum > 21) {
            System.out.println();
            System.out.println(setColorYellow() + "--DU HAST DICH VERKAUFT--" + resetColor());
            System.out.println();
            return false;
        }
        return true;
    }

    //Ask for another Card
    public static boolean anotherCard(int[] hand) {
        boolean inputCheck = false;
        while (!inputCheck) {
            System.out.println();
            System.out.println("M??chtest du noch eine Karte?");
            System.out.println("+ => noch eine Karte");
            System.out.println("- => keine Karte mehr");

            String anotherCard = scanner.next();

            if (anotherCard.equals("+")) {
                return true;
            } else if (anotherCard.equals("-")) {
                System.out.println(setColorYellow() + "--PLAYER STANDS AT " + getHandValue(hand) + "--" + resetColor());
                return false;
            } else {
                System.out.println("Keine g??ltige Eingabe");
            }
        }
        return false;
    }

    //Methods for Preperation
    public static int[] fillCardDeck(int[] cardDeck) {
        for (int i = 0; i < cardDeck.length; i++) {
            cardDeck[i] = i + 1;
        }
        return cardDeck;
    }

    public static int[] shuffle(int[] cardDeck) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int index1 = random.nextInt(51);
            int index2 = random.nextInt(51);
            int helpVar = cardDeck[index1];
            cardDeck[index1] = cardDeck[index2];
            cardDeck[index2] = helpVar;
        }

        return cardDeck;
    }

    public static int[] resetHand(int[] hand) {
        for (int i = 0; i < hand.length; i++) {
            hand[i] = -1;
        }

        return hand;
    }

    //Bet
    public static int aksBet(int playersCredit) {
        boolean creditCheck = false;
        boolean inputCheck = false;
        int bet = 0;


        while (!creditCheck) {
            System.out.println("Wie viel Geld m??chtest du setzen?");
            System.out.println("Dein aktueller Kontostand betr??gt " + playersCredit + "???.");
            while (!scanner.hasNextInt() && !inputCheck) {
                System.out.println("Das ist keine Zahl!!!");
                System.out.println();
                System.out.println("Wie viel Geld m??chtest du setzen?");
                System.out.println("Dein aktueller Kontostand betr??gt " + playersCredit + "???.");
                scanner.nextLine();
            }
            inputCheck = true;
            bet = scanner.nextInt();
            if (bet > playersCredit) {
                System.out.println("Du hast leider nicht mehr genug Geld um soviel zu setzen.");
            } else {
                creditCheck = true;
            }
        }
        System.out.println("Dein Einsatz f??r diese Runde betr??gt " + bet + "???");
        return bet;
    }

    //Methods for Handout
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


    //Check Cards
    public static int getHandValue(int[] hand) {
        int sum = 0;
        boolean containsASS=false;
        for (int card : hand) {
            if(getCardValue(card)==11){
                containsASS=true;
            }
            if (card == -1) {
                break;
            }
            sum += getCardValue(card);
        }
        if(containsASS && sum>21){
            return sum-10;
        }
        return sum;
    }

    public static int getCardValue(int card) {
        int value=0;
        value=card%13;

        if(value==0){
            return 11;
        }
        if(value>=9){
            return 10;
        }
        return value+1;
    }

    public static String getCardName(int card) {
        double nameIndex = card / 13.0;
        if (nameIndex == 0) {
            return "";
        }
        if (nameIndex > 0 && nameIndex <= 1.0) {
            return getHeartSympol();
        }
        if (nameIndex > 1.0 && nameIndex <= 2.0) {
            return getPikSympol();
        }
        if (nameIndex > 2.0 && nameIndex <= 3.0) {
            return getKreuzSympol();
        }
        if (nameIndex > 3.0 && nameIndex <= 4.0) {
            return getKaroSympol();
        }
        return "Kein passender Name gefunden";
    }

    //Print Cards
    public static String printCard(int card) {
        if (card >= 0 && getCardValue(card) < 11) {
            return "[ " + getCardName(card) + " " + getCardValue(card) + " ]";
        } else if (card >= 0 && getCardValue(card) == 11) {
            return "[ " + getCardName(card) + " " + "ASS" + " ]";

        }
        return "";
    }

    public static void printHand(int[] hand) {
        System.out.println();
        if (hand.length == 13) {
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
        System.out.println("Handwert: "+getHandValue(hand));
    }

    //Set Colores
    public static String setColorYellow() {
        return "\u001B[33m";
    }

    public static String setColorRed() {
        return "\u001B[31m";
    }

    public static String resetColor() {
        return "\u001B[0m";
    }

    public static String setColorGreen() {
        return "\u001B[32m";
    }

    public static String getHeartSympol(){
        return setColorRed()+"\u2665"+resetColor();
    }
    public static String getPikSympol(){
        return "\u2660";
    }
    public static String getKaroSympol(){
        return setColorRed()+"\u2666"+resetColor();
    }
    public static String getKreuzSympol(){
        return "\u2663";
    }

}
