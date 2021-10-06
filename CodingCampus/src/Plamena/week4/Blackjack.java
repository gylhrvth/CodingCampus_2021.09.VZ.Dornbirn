package Plamena.week4;

import java.util.Arrays;
import java.util.Random;

public class Blackjack {
    public static void main(String[] args) {



    }

    public static int[] createCardDeck() {
        int[] playCards = new int[52];
        for (int i = 0; i < playCards.length; i++) {
            playCards[i] = i;
        }
        return playCards;
    }

    public static String defineCardColor(int[] playCards, double card) {
        String color = "";
        for (int playCard : playCards) {
            card = (double) playCard / 13;
            if (card > 0 && card < 1) {
                color = "Club";
            }
            if (card > 1.0 && card <= 2) {
                color = "Spade";
            }
            if (card > 2.0 && card <= 3) {
                color = "Heart";
            }
            if (card > 3.0 && card <= 4) {
                color = "Diamond";
            }
        }
        return color;
    }
/*
    public static String defineCardFigure(int[] playCards, double card) {
        String name = "";
        for (int i = 0; i < playCards.length; i++) {
            card = (double) playCards[i] % 13;
            if (card == 0) {
                name = "Ace";
            }
            if (card > 0 && card <= 10) {
                name = card;
            }
            if (card == 11) {
                name = "Jack";
            }
            if (card == 12) {
                name = "Queen";
            }
            if (card == 13) {
                name = "King";
            }
        }
        return name;
    }*/

    public static int[] shuffle(int[] playCards) {
        int[] shuffle = playCards;
        for (int i = 0; i < playCards.length; i++) {
            Random rnd = new Random();
            int shuffleVar = rnd.nextInt(52);
            int tmp = shuffle[i];
            shuffle[i] = playCards[shuffleVar];
            shuffle[shuffleVar] = tmp;
        }
        return shuffle;
    }
}

