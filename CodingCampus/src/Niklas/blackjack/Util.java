package Niklas.blackjack;

import java.util.Random;

public class Util {
    public static int calcualtePoints(int[] cards) {
        int points = 0;
        for (int i = 0; i < cards.length; i++) {
            if(cards[i] != 0) {
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
    // 1 - 13 Herz
    // 14 - 27  karo
    //
    public static String detemerineCardName(int index){
        int color = index / 13;
        int cardValue = index % 13;
        String result = "";
        if(color > 0 && color < 14) {
            result += "Herz " + cardValue;
        }

        return result;
    }

    public static void generateCardDeck(int[] cards) {
        Random random = new Random();
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

    public static boolean checkWinCondition(int points) {
        boolean gameOver = false;
        if(points > 21) {
            System.out.println("You are busted.");
            System.out.println("Points: " + points);
            gameOver = true;
        }else if (points == 21) {
            System.out.println("WINNER WINNER CHICKEN DINNER");
            gameOver = true;
        }else {
            System.out.println("The user has: " + points);
        }
        return gameOver;
    }
}
