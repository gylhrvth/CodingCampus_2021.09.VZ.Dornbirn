package Bartosz.week6.gameOfLifeCA;

public class Init {
    public static void main(String[] args) {
        printArray(gameWorld);
        System.out.println();
        printGame(gameWorld);
        System.out.println();
        printArray(gameWorld);
    }

    public static int[][] gameWorld = new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    public static void printArray(int[][] D2array) {
        for (int[] ints : D2array) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static void printGame(int[][] D2array) {
        int[][] newArray = new int[D2array.length][D2array.length];   // copyArray
        int aliveCounter;
        for (int i = 1; i < D2array.length - 1; i++) {
            // Row above

            for (int j = 1; j < D2array[i].length - 1; j++) {
                aliveCounter = 0;

                for (int row = -1; row <= 1; row++) {        // Definitions row -> check status Nachbarn row
                    for (int col = -1; col <= 1; col++) {       // Definitons column -> check status Nachbars index 0/1
                        if (D2array[i+row][j+col] >= 1) {     // Row above startet bei 1 nicht bei 0 -> deswegen index der überprüften Index und row -1
                            aliveCounter++;
                        }

                    }
                }
                aliveCounter -= D2array[i][j];
                System.out.print(aliveCounter);

                // Befüll Bedingungen newArray
                if (D2array[i][j] == 1) {
                    if (aliveCounter < 2 || aliveCounter > 3) {
                        newArray[i][j] = 0;
                    } else {
                        newArray[i][j] = 1;
                    }
                } else {
                    if (aliveCounter == 3) {
                        newArray[i][j] = 1;
                    } else {
                        newArray[i][j] = 0;
                    }
                }

            }
            System.out.println();

        }

        System.arraycopy(newArray, 0, D2array, 0, D2array.length);      // Überschreiben der Alten Rows

    }

//    protected static void createWorld() {
//        int[][] gameworld = new int[][]{
//                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 1, 1, 0, 0},
//                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 1, 1, 0, 0, 1},
//                {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
//        };
//    }
}
