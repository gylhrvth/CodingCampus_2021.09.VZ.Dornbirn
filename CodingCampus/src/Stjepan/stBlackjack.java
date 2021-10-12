package Stjepan;

import java.util.Random;
import java.util.Scanner;

public class stBlackjack {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int startCash = 100;
        letsplayBlackJack(startCash);


    }

    public static void letsplayBlackJack(int startCash) {
        System.out.println(" START NEW ROUND ");
        System.out.println();

        int[] cardDeck = new int[52];
        int[] dealerHand = new int[13];
        int[] playerHand = new int[12];
        int playerCash = startCash;
        boolean playerInTheGame = true;
            }
    public static void generateCardDeck(int[] cards){
        Random random = new Random();
        for (int i = 1; i < cards.length ; i++) {
            cards[i - 1]= i;
        }
        for (int i = 0; i < 100; i++) {
            int from = random.nextInt(51);
            int to = random.nextInt(51);
            int tmp = cards[from];
            cards[from] = cards[to];
            cards[to]= tmp;

        }
    }
}


