package Eray.week6FerienUebungen.gameOfLife;

public class MainToStartGame {
    public static void main(String[] args) {
        printFullGame();
    }

    public static void printFullGame() {
        startAllMethods();
    }

    public static void startAllMethods() {

        while (true) {

            //Das Spiel ist noch nicht Fertig!!

            try {
                System.out.println("Evolving");
                for (int i = 0; i < 100; i++) {
                    PlayField.clearScreen();
                    printBoard(PlayField.GLEITER);
                    Thread.sleep(PlayField.SLEEP_IN_MS);
                    GameRules.calculateNextGeneration(PlayField.GLEITER, PlayField.GLEITER2);
                    GameRules.createNewBoard(PlayField.GLEITER, PlayField.GLEITER2);


                }
            } catch (InterruptedException exc) {
                //noop
            }
        }

    }

    public static void printBoard(int[][] gleiter) {
        for (int i = 0; i < gleiter.length; i++) {
            for (int j = 0; j < gleiter.length; j++) {
                if (gleiter[i][j] == 0) {
                    System.out.print(" ");
                } else if (gleiter[i][j] == 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


}
