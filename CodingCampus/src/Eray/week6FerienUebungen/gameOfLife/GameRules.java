package Eray.week6FerienUebungen.gameOfLife;

public class GameRules {

    public static void gameRules() {

    }

    public static void calculateNextGeneration(int[][] gleiter, int[][] gleiter2) {

        for (int i = 0; i < gleiter.length; i++) {
            for (int j = 0; j < gleiter.length; j++) {

                int neighborCount = countNeighbours(i, j, gleiter);

                if (gleiter[i][j] == 1 && neighborCount < 2) {
                    gleiter2[i][j] = 0;
                } else if (gleiter[i][j] == 1 && neighborCount < 4) {
                    gleiter2[i][j] = 1;
                } else if (gleiter[i][j] == 1 && neighborCount > 3) {
                    gleiter2[i][j] = 0;
                } else if (gleiter[i][j] == 0 && neighborCount == 3) {
                    gleiter2[i][j] = 1;
                } else {
                    gleiter2[i][j] = 0;
                }
            }
        }

    }

    public static void createNewBoard(int[][] gleiter, int[][] gleiter2) {
        for (int i = 0; i < gleiter.length; i++) {
            for (int j = 0; j < gleiter.length; j++) {
                gleiter[i][j] = gleiter2[i][j];
            }
        }
    }

    public static int countNeighbours(int zeilen, int spalten, int[][] gleiter) {
        int count = 0;

        //Das Spiel ist noch nicht Fertig!!

        for (int i = zeilen - 1; i <= zeilen+ 1; i++) {
            if (i >= 0 && i < gleiter.length)
                for (int j = spalten - 1; j <= spalten + 1; j++) {
                    if (j >= 0 && j < gleiter[i].length) {
                        if (i != zeilen || j != spalten) {
                            if (gleiter[i][j] == 1) {
                                count++;
                            }
                        }
                    }
                }
        }

        return count;
    }


}
