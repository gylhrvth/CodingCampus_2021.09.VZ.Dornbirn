package Niklas.blackjack;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    private static int currentIndexInCards = 0;
    private static int[] cards = new int[52];
    private static int[] userCards = new int[10];
    private static int[] dealerCards = new int[10];
    private static boolean gameOver = false;

    public static void start() {
        // shuffle the cards
        Util.generateCardDeck(cards);
        // user 2 cards + dealer 1 card
        passInitialCards();

        //loop for player to get cards or exit
        while(!gameOver) {
            askUserForAction();
        }
    }

    private static void askUserForAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want another card: \n + for yes \n - for no");
        String action = scanner.next();
        if(action.equals("+")) {
            drawCard();
            int userpoints = Util.calcualtePoints(userCards);
            gameOver = Util.checkWinCondition(userpoints);
        } else {
            //let computer finish
            gameOver = true;
        }
    }

    private static void drawCard() {
        int nextPosition = determineNextPosition();
        userCards[nextPosition] = cards[currentIndexInCards];
        currentIndexInCards++;
    }

    private static int determineNextPosition() {
        for (int i = 0; i < userCards.length; i++) {
            if(userCards[i] == 0) {
                return i;
            }
        }
        return 0;
    }

    private static void passInitialCards() {
        for (int i = 0; i < 2; i++) {
            userCards[i] = cards[currentIndexInCards];
            currentIndexInCards++;
        }
        dealerCards[0]  = cards[currentIndexInCards];
        currentIndexInCards++;

        int userPoints = Util.calcualtePoints(userCards);
        int dealerPoints = Util.calcualtePoints(dealerCards);
        System.out.println("The user has: " + userPoints);
        System.out.println("The dealer has: " + dealerPoints);
        gameOver = Util.checkWinCondition(userPoints);
    }
}
