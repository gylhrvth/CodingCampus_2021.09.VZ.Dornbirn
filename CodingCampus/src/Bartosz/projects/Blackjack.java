package Bartosz.projects;

import java.util.Arrays;
import java.util.Random;

public class Blackjack {
    public static void main(String[] args) {
        int[] cardDeck = new int[52];
        int[] player = new int[10];
        int[] bank = new int[10];


        filledDeck(cardDeck);       // fill the Deck
        int card = cardValue(cardDeck);     // card = CardValue
        System.out.println(card);

        int[] updatedDeck = updatedDeck(filledDeck(cardDeck), card);    // updated Deck safed
        System.out.println(Arrays.toString(updatedDeck));
        System.out.print(getCardColor(card));     // get color of Card
        System.out.print(" " + getCardValue(card));
    }

    // Fill the deck
    public static int[] filledDeck(int[] deck) {        // fill card Deck
        for (int i = 1; i <= deck.length; i++) {
            deck[i - 1] = i;
        }
        return deck;
    }

    // get random card from deck
    public static int cardValue(int[] deck) {
        Random number = new Random();
        return 1 + number.nextInt(deck.length);
    }

    // delete card from deck
    public static int[] updatedDeck(int[] deck, int card) {
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] == card) {
                if (deck[i] <= deck.length) {
                    deck[i] = deck[i - 1];
                }else {
                    deck[i] = deck [i+1];
                }
            }
        }
        return deck;
    }

    public static String getCardColor(double cardValue) {
        String cardColor;

        if(cardValue / 13 <=1 ) {
            cardColor = "Herz";
        }else if(cardValue / 13 > 1 && cardValue / 13 <=2) {
            cardColor = "Pike";
        }else if(cardValue / 13 > 2 && cardValue / 13 <= 3) {
            cardColor = "Karo";
        }else if (cardValue / 13 > 3 && cardValue / 13 <= 4) {
            cardColor = "Kreuz";
        }else {
            cardColor = "Fehler beim definieren der Farbe!";
        }
        return cardColor;
    }

    public static int getCardValue(int cardValue) {
        switch (cardValue % 13) {
            case 1 -> cardValue = 11;   // Ass
            case 2 -> cardValue = 2;
            case 3 -> cardValue = 3;
            case 4 -> cardValue = 4;
            case 5 -> cardValue = 5;
            case 6 -> cardValue = 6;
            case 7 -> cardValue = 7;
            case 8 -> cardValue = 8;
            case 9 -> cardValue = 9;
            case 10 -> cardValue = 10;  // 10er
            case 11 -> cardValue = 10;  // Bube
            case 12 -> cardValue = 10;  // Dame
            case 0 -> cardValue = 10;  // König
        }
        return cardValue;
    }
}
