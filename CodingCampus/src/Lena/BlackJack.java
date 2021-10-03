package Lena;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int startCredit = 100;
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

        if (!playerInTheGame) {
            playerCredit = playerLost(playerCredit, playersBet);
            newRound(playerCredit);
        } else {
            playerCredit = playerWon(playerCredit, playersBet);
            newRound(playerCredit);
        }
    }

    public static int whoWon(int[] playerHand, int[] dealerHand) {

        //return 1-> Player won, return 2->Bank won
        if (getHandValue(dealerHand) > 21) {
            return 1;
        }
        if (getHandValue(playerHand) > getHandValue(dealerHand)) {
            return 1;
        }
        System.out.println();
        System.out.println(setColorYellow() + "--BANK GEWINNT--" + resetColor());
        return 2;
    }

    public static int playerWon(int playersCredit, int playersBet) {
        System.out.println();
        System.out.println(setColorGreen() + "--GEWONNEN!!--" + resetColor());
        System.out.println();
        System.out.println("Du hast deinen Einsatz verdoppelt!");
        System.out.println("Dein neuer Kontostand beträgt:" + (playersCredit + playersBet * 2) + "€.");
        return playersCredit + playersBet * 2;
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
                System.out.println("Keine gültige eingabe!!");
                newRound(playerCredit);
            }
        }
    }

    public static void fillCredit() {
        System.out.println();
        System.out.println(setColorYellow() + "--DU BIST PLEITE--" + resetColor());
        System.out.println();
        System.out.println("Möchtest du dein Konto aufüllen?");
        System.out.println("+ => Ja");
        System.out.println("- => Nein, Spiel beenden");
        String inputCreditFill = scanner.next();
        if (inputCreditFill.equals("+")) {
            System.out.println("Auf wie viel möchtest du dein Konto auffüllen?");
            int newCredit = scanner.nextInt();
            letsPlayBlackJack(newCredit);
        } else if (!inputCreditFill.equals("-")) {
            System.out.println("Keine gültige Eingabe");
        } else {

        }
    }

    //korrigiert den kontostand, bei Verlust
    public static int playerLost(int playersCredit, int playersBet) {
        System.out.println();
        System.out.println(setColorRed() + "--VERLOREN--" + resetColor());
        System.out.println();
        System.out.println("Du hast leider " + playersBet + "€ verloren.");
        System.out.println("Dein neuer Kontostand beträgt:" + (playersCredit - playersBet) + "€.");
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
            System.out.println("Möchtest du noch eine Karte?");
            System.out.println("+ => noch eine Karte");
            System.out.println("- => keine Karte mehr");

            String anotherCard = scanner.next();

            if (anotherCard.equals("+")) {
                return true;
            } else if (anotherCard.equals("-")) {
                System.out.println(setColorYellow() + "--PLAYER STANDS AT " + getHandValue(hand) + "--" + resetColor());
                return false;
            } else {
                System.out.println("Keine gültige Eingabe");
            }
        }
        return false;
    }

    //Preperation Methods
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
            System.out.println("Wie viel Geld möchtest du setzen?");
            System.out.println("Dein aktueller Kontostand beträgt " + playersCredit + "€.");
            while (!scanner.hasNextInt() && !inputCheck) {
                System.out.println("Das ist keine Zahl!!!");
                System.out.println();
                System.out.println("Wie viel Geld möchtest du setzen?");
                System.out.println("Dein aktueller Kontostand beträgt " + playersCredit + "€.");
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
        System.out.println("Dein Einsatz für diese Runde beträgt " + bet + "€");
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
        if (card < 10) {
            return card;
        }
        int value = 13 - card % 13;
        if (value >= 10 && value < 13) {
            return 10;
        }
        if (value == 13) {
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
            return setColorRed()+"Herz"+resetColor();
        }
        if (nameIndex > 1.0 && nameIndex <= 2.0) {
            return "Pik";
        }
        if (nameIndex > 2.0 && nameIndex <= 3.0) {
            return "Kreuz";
        }
        if (nameIndex > 3.0 && nameIndex <= 4.0) {
            return setColorRed()+"Karo"+resetColor();
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

}
