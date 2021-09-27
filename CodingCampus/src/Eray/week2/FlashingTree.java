package Eray.week2;

public class FlashingTree {
    public static void main(String[] args) {
        int height = 10;

        for (int i = 0; i < 100; i++) {
            if ((i % 2) == 0) {
                christmasTree(height);
            } else if ((i % 3)== 0) {
                flashingChristmasTreeSecondColor(height);
            } else {
                flashingChristmasTree(height);
            }
            secondCounter();
            clearScreen();
        }
    }

    public static void secondCounter() {
        try {
            //sending the actual Thread of execution to sleep X milliseconds
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
        }
    }

    public static void christmasTree(int height) {


        int spaces = height - 1;
        int stars = 1;

        for (int a = 0; a < height; a++) {
            for (int b = 0; b < spaces; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < stars; c++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

        int treeWidth = (height * 2) - 1;

        int trunkWidth = height / 3;
        int trunkHeight = height / 3;

        int trunkCenter = treeWidth / 2;
        int trunkLeftSpace = trunkCenter - (trunkWidth / 2);

        for (int d = 0; d < trunkHeight; d++) {
            for (int e = 0; e < trunkLeftSpace; e++) {
                System.out.print(" ");
            }
            for (int f = 0; f < trunkWidth; f++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void flashingChristmasTree(int height) {


        int spaces = height - 1;
        int stars = 1;

        for (int a = 0; a < height; a++) {
            for (int b = 0; b < spaces; b++) {
                System.out.print("\u001B[32m" + " " + "\u001B[0m");
            }
            for (int c = 0; c < stars; c++) {
                System.out.print("\u001B[32m" + "*" + "\u001B[0m");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

        int treeWidth = (height * 2) - 1;

        int trunkWidth = height / 3;
        int trunkHeight = height / 3;

        int trunkCenter = treeWidth / 2;
        int trunkLeftSpace = trunkCenter - (trunkWidth / 2);

        for (int d = 0; d < trunkHeight; d++) {
            for (int e = 0; e < trunkLeftSpace; e++) {
                System.out.print("\u001B[32m" + " " + "\u001B[0m");
            }
            for (int f = 0; f < trunkWidth; f++) {
                System.out.print("\u001B[32m" + "*" + "\u001B[0m");
            }
            System.out.println();
        }


    }


    public static void flashingChristmasTreeSecondColor(int height) {


        int spaces = height - 1;
        int stars = 1;

        for (int a = 0; a < height; a++) {
            for (int b = 0; b < spaces; b++) {
                System.out.print("\u001B[35m" + " " + "\u001B[0m");
            }
            for (int c = 0; c < stars; c++) {
                System.out.print("\u001B[35m" + "*" + "\u001B[0m");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

        int treeWidth = (height * 2) - 1;

        int trunkWidth = height / 3;
        int trunkHeight = height / 3;

        int trunkCenter = treeWidth / 2;
        int trunkLeftSpace = trunkCenter - (trunkWidth / 2);

        for (int d = 0; d < trunkHeight; d++) {
            for (int e = 0; e < trunkLeftSpace; e++) {
                System.out.print("\u001B[35m" + " " + "\u001B[0m");
            }
            for (int f = 0; f < trunkWidth; f++) {
                System.out.print("\u001B[35m" + "*" + "\u001B[0m");
            }
            System.out.println();
        }


    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
    }
}
