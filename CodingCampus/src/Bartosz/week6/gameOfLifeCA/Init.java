package Bartosz.week6.gameOfLifeCA;

import java.io.IOException;

public class Init {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
                printArray(gameWorld);  //print old array
            Thread.sleep(100);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            printGame(gameWorld);       // print new array
        }
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
        for (int i = 0; i < D2array.length ; i++) {
            // Row above

            for (int j = 0; j < D2array[i].length ; j++) {
                aliveCounter = 0;

                for (int row = -1; row <= 1; row++) {        // Definitions row -> check status Nachbarn row
                    for (int col = -1; col <= 1; col++) {     // Definitons column -> check status Nachbars index 0/1

                        // Check Border Cases cols
                        int colToCheck = j + col;
                        if (j + col >= D2array.length) {
                            colToCheck = 0;
                        } else if(j+col == -1) {
                            colToCheck = D2array.length-1;
                        }
                        // Check Border Cases Rows
                        int rowsToCheck = i + row;
                        if (i + row >= D2array.length) {
                            rowsToCheck = 0;
                        } else if(i + row == -1) {
                            rowsToCheck = D2array.length-1;
                        }

                        if (D2array[rowsToCheck][colToCheck] >= 1) {     // Row above startet bei 1 nicht bei 0 -> deswegen index der überprüften Index und row -1
                            aliveCounter++;
                        }

                    }
                }

                // Working code
//                for (int row = -1; row <= 1; row++) {        // Definitions row -> check status Nachbarn row
//                    for (int col = -1; col <= 1; col++) {       // Definitons column -> check status Nachbars index 0/1
//                        if (D2array[i+row][j+col] >= 1) {     // Row above startet bei 1 nicht bei 0 -> deswegen index der überprüften Index und row -1
//                            aliveCounter++;
//                        }
//                    }
//                }

                aliveCounter -= D2array[i][j];
//                System.out.print(aliveCounter);       //check neighbours

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
        }

        System.arraycopy(newArray, 0, D2array, 0, D2array.length);      // Überschreiben der Alten Rows

    }


}
