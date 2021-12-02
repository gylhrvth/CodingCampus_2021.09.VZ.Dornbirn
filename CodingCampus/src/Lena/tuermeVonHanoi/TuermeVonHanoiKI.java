package Lena.tuermeVonHanoi;

import java.util.Scanner;

public class TuermeVonHanoiKI {

    private static final int SLEEP_IN_MS = 700;

    public static void main(String[] args) {
        int[][] startaufstellung = fillStart(6);

        printGame(startaufstellung);
        KImoveRecursive(startaufstellung[0].length, startaufstellung[0], startaufstellung[2], startaufstellung[1], startaufstellung);

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static int[][] fillStart(int disks) {
        int[][] startaufstellung = new int[3][disks];
        int count = 1;
        for (int i = 0; i < disks; i++) {
            startaufstellung[0][i] = count;
            count += 2;
        }

        return startaufstellung;
    }

    private static void KImoveRecursive(int n, int[] source, int[] target, int[] auxiliary, int[][] startaufstellung) {
        if (n > 0) {
            KImoveRecursive(n - 1, source, auxiliary, target, startaufstellung);

            int disc = 0;
            for (int i = 0; i < source.length; i++) {
                if (source[i] != 0) {
                    disc = source[i];
                    source[i] = 0;
                    break;
                }
            }
            for (int i = target.length - 1; i >= 0; i--) {
                if (target[i] == 0) {
                    target[i] = disc;
                    break;
                }
            }

            printGame(startaufstellung);

            KImoveRecursive(n - 1, auxiliary, target, source, startaufstellung);
        }
    }


    private static void printGame(int[][] actualGame) {

        try {
            System.out.println("Evolving");
            Thread.sleep(SLEEP_IN_MS);
        } catch (InterruptedException exc) {
            //noop
        }
        clearScreen();
        int largestDisk = getLargestDisk(actualGame);
        int middleOfTowers = largestDisk / 2;

        System.out.println();
        for (int j = 0; j < actualGame[0].length; j++) {
            for (int i = 0, actualGameLength = actualGame.length; i < actualGameLength; i++) {
                int[] ints = actualGame[i];

                int offset = (largestDisk - ints[j]) / 2;
                for (int l = 0; l < (offset); l++) {
                    System.out.print(" ");
                }
                if (ints[j] != 0) {
                    for (int m = 0; m < ints[j]; m++) {
                        System.out.print(getColor(actualGame[i][j]) + "=" + resetColor());
                    }
                } else {
                    System.out.print("|");
                }
                for (int n = 0; n <= (offset); n++) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }


        for (int i = 0; i < actualGame.length; i++) {
            for (int j = 0; j <= largestDisk; j++) {
                if (j == middleOfTowers) {
                    System.out.print(i + 1);
                } else System.out.print(" ");
            }

        }
        System.out.println();
    }

    private static String getColor(int disk) {

        if (disk > 5) {
            disk = disk % 6;
        }
        int n = 30 + (disk);


        return "\u001B[" + n + "m";
    }

    private static String resetColor() {
        return "\u001B[0m";
    }

    private static int getLargestDisk(int[][] actualGame) {
        int largest = Integer.MIN_VALUE;

        for (int[] ints : actualGame) {
            for (int anInt : ints) {
                if (anInt > largest) {
                    largest = anInt;
                }
            }
        }
        return largest;
    }


}
