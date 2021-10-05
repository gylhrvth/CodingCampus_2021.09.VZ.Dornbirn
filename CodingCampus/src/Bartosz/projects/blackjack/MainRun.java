package Bartosz.projects.blackjack;

public class MainRun {
    public static void main(String[] args) {
        boolean start = initClass.gameStart();

        int[] cardDeck = new int[52];
        int[] playHand = new int [10];
        int[] dealerHand = new int [10];
        int playerPoints= 0;
        int dealerPoints;

        initClass.shuffleCards(cardDeck);
    }
}
