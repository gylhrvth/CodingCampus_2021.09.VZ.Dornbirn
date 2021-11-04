package Mahir.strukturierteProgrammierung.week4;

import java.util.Random;

public class test {
    public static void main(String[] args) {


        int[] cardDeck = new int[52];

        shuffledDeck(cardDeck);



    }

    public static void shuffledDeck(int[] card) {

        Random rnd = new Random();
        for (int i = 1; i < card.length; i++) {
            card[i - 1] = i;
        }
        for (int i = 0; i < 100; i++) {
            int from = rnd.nextInt(52);
            int to = rnd.nextInt(52);
            int tmp = card[from];
            card[from] = card[to];
            card[to] = tmp;

        }
    }

}
