package Lena.tuermeVonHanoi;

import java.util.Scanner;

public class TuermeVonHanoiGame {
    private static final Scanner sc = new Scanner(System.in);
    private static final int SLEEP_IN_MS = 100;


    public static void main(String[] args) {
        System.out.println("Mit wie vielen Scheiben möchtest du speielen?");

        int disks = sc.nextInt();

        int[][] startaufstellung = fillStart(disks);

        playGame(startaufstellung);
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

    private static void playGame(int[][] actualGame) {
        while (true) {
            printGame(actualGame);
            int towerToTake = askUserTowerToTake(actualGame);
            int towerToPut = askUserTowerToPut(actualGame.length);
            moveDisk(towerToTake, towerToPut, actualGame);
        }
    }

    private static void moveDisk(int towerToTake, int towerToPut, int[][] actualGame) {
        int disk = 0;
        int indexToTake = 0;


        for (int i = 0; i < actualGame[(towerToTake - 1)].length; i++) {
            if (actualGame[towerToTake - 1][i] != 0) {
                disk = actualGame[towerToTake - 1][i];
                indexToTake = i;
                break;
            }
        }

        for (int i = actualGame[towerToPut - 1].length - 1; i >= 0; i--) {
            if (actualGame[towerToPut - 1][i] == 0) {
                if (i + 1 < actualGame[towerToPut - 1].length && actualGame[towerToPut - 1][i + 1] < disk) {
                    System.out.println("Es darf keine größere Scheibe auf eine kleinere gelegt werden");
                    return;
                } else {
                    actualGame[towerToTake - 1][indexToTake] = 0;
                    actualGame[towerToPut - 1][i] = disk;
                    break;
                }

            }
        }


    }

    private static boolean towerHasDisks(int[][] actualGame, int tower) {
        for (int i = 0; i < actualGame[0].length; i++) {
            if (actualGame[tower - 1][i] != 0) {
                return true;
            }
        }
        return false;
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

    private static int askUserTowerToTake(int[][] actualGame) {
        System.out.println();
        System.out.println("Von welchem Turm möchtest du eine Scheibe nehmen?");

        int tower;

        while (true) {

            while (!sc.hasNextInt()) {
                System.out.println("Das war keine Zahl");
                System.out.println("Von welchem Turm möchtest du eine Scheibe nehmen?");
                sc.nextLine();
            }
            tower = sc.nextInt();
            if (tower > 0 && tower <= actualGame.length) {
                if (towerHasDisks(actualGame, tower)) {
                    return tower;
                } else {
                    System.out.println("Dieser Turm ist leer");
                    System.out.println("Gib einen anderen Turm an.");
                }
            } else {
                System.out.println("Diesen Turm gibt es nicht!");
                System.out.println("Gib einen anderen Turm an.");
            }

        }

    }

    private static int askUserTowerToPut(int towers) {
        System.out.println();
        System.out.println("Auf welchen Turm möchtest du die Scheibe legen?");


        int tower;

        while (true) {

            while (!sc.hasNextInt()) {
                System.out.println("Das war keine Zahl");
                System.out.println("Von welchem Turm möchtest du eine Scheibe nehmen?");
                sc.nextLine();
            }

            tower = sc.nextInt();
            if (tower > 0 && tower <= towers) {
                return tower;
            } else {
                System.out.println("Diesen Turm gibt es nicht!");
                System.out.println("Gib einen anderen Turm an.");
            }

        }

    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
