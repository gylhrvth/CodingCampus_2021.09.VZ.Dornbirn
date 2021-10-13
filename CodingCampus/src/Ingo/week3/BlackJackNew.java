package Ingo.week3;

import java.util.Random;
import java.util.Scanner;

public class BlackJackNew {


    public static void main(String[] args) {
        start();

    }

    private static Random random = new Random();
    private static int currentIndexInCards = 0;
    private static int[] cards = new int[52];
    private static int[] userCards = new int[10];
    private static int[] points = new int[1];
    private static boolean gameOver = false;
    private static int[] dealerCards = new int[10];

    public static void start() {

        generateCardDeck(cards);

        passInitialCards();

        while (!gameOver) {
            askUserForAction();
        }
    }

    private static void askUserForAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want another card: \n + for yes \n - for no");
        String action = scanner.next();
        int dealerPoints = calculatePoints(dealerCards);
        int userPoints = calculatePoints(userCards);
        if (action.equals("+")) {
            drawCard();
            userPoints = calculatePoints(userCards);
            gameOver = checkWinCondition(userPoints, true);
        } else {
            drawDealerCard();
            dealerPoints = calculatePoints(dealerCards);
            gameOver = checkWinCondition(dealerPoints, false);
            if (dealerPoints > userPoints) {
                System.out.println("Du hast verloren!!! ");
            } else {
                System.out.println("Du hast Gewonnen");
            }

            gameOver = true;
        }
    }

    private static void drawCard() {
        int nextPosition = deterMineNextPosition();
        userCards[nextPosition] = cards[currentIndexInCards];
        currentIndexInCards++;
    }

    private static void drawDealerCard() {
        int nextPosition = deterMineNextPositionDealer();
        dealerCards[nextPosition] = cards[currentIndexInCards];
        currentIndexInCards++;
    }

    private static int deterMineNextPositionDealer() {
        for (int i = 0; i < dealerCards.length; i++) {
            if (dealerCards[i] == 0) {
                return i;
            }
        }
        return 0;
    }

    private static int deterMineNextPosition() {
        for (int i = 0; i < userCards.length; i++) {
            if (userCards[i] == 0) {
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

        dealerCards[0] = cards[currentIndexInCards];
        currentIndexInCards++;


        int userPoints = calculatePoints(userCards);
        int dealerPoints = calculatePoints(dealerCards);

        gameOver = checkWinCondition(userPoints, true);
        gameOver = checkWinCondition(dealerPoints, false);


    }

    private static int calculatePoints(int[] cards) {
        int points = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] != 0) {
                int valueOfCard = cards[i] % 13;
                if (valueOfCard > 9 || valueOfCard == 0) {
                    points += 10;
                } else if (valueOfCard == 1) {
                    points += 11;
                } else {
                    points += valueOfCard;
                }
            }
        }
        return points;
    }

    private static void generateCardDeck(int[] cards) {
        for (int i = 1; i <= cards.length; i++) {
            cards[i - 1] = i;
        }


        for (int i = 0; i < 100; i++) {
            int from = random.nextInt(51);
            int to = random.nextInt(51);

            int tmp = cards[from];
            cards[from] = cards[to];
            cards[to] = tmp;
        }
    }

    private static boolean checkWinCondition(int userPoints, boolean isPlayer) {
        gameOver = false;
        if (userPoints > 21) {
            System.out.println("Du hast verloren.");
            System.out.println("Punkte: " + userPoints);
            gameOver = true;
        } else if (userPoints == 21) {
            System.out.println("WINNER");
            gameOver = true;
        } else {
            if (isPlayer) {
                System.out.println("Der User hat: " + userPoints);
            } else {
                System.out.println("Der Dealer hat: " + userPoints);
            }
        }
        return gameOver;
    }

}
