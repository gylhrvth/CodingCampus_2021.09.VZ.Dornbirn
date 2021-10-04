package Lena;

public class FlashingTree {
    public static void main(String[] args) {

        flashingTree(9);
    }

    public static void flashingTree(int high) {
        clearScreen();
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                drawChristmastreeWhite(high);
            } else {
                drawChristmastreeGreen(high);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
            }

            clearScreen();
        }

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
    }

    public static void drawChristmastreeWhite(int high) {
        int highTribe = high / 4;
        int count = 1;

        for (int i = 1; i <= high; i++) {
//Baum
            if (i < (high - highTribe)) {

                for (int k = high - i; k >= 0; k--) {
                    System.out.print(" ");
                }
                for (int j = i; j < i + count; j++) {
                    System.out.print("X");

                }
                count += 2;
                System.out.println();
            }
//Christbaumkugeln
            if (i == (high - highTribe)) {
                for (int k = high - i; k >= 0; k--) {
                    System.out.print(" ");
                }
                for (int j = i; j < i + count; j += 2) {
                    System.out.print("* ");
                }
                count += 2;
                System.out.println();
            }
//Stamm
            if (i > (high - highTribe)) {
                for (int n = high - 2; n >= 0; n--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < highTribe; j++) {
                    System.out.print("X");
                }
                System.out.println();


            }
        }
    }

    public static void drawChristmastreeGreen(int high) {
        int highTribe = high / 4;
        int count = 1;

        for (int i = 1; i <= high; i++) {
//Baum
            if (i < (high - highTribe)) {

                for (int k = high - i; k >= 0; k--) {
                    System.out.print(" ");
                }
                for (int j = i; j < i + count; j++) {
                    System.out.print("\u001B[32m" + "X" + "\u001B[0m");

                }
                count += 2;
                System.out.println();
            }
//Christbaumkugeln
            if (i == (high - highTribe)) {
                for (int k = high - i; k >= 0; k--) {
                    System.out.print(" ");
                }
                for (int j = i; j < i + count; j += 2) {
                    System.out.print("\u001B[31m" + "* " + "\u001B[0m");
                }
                count += 2;
                System.out.println();
            }
//Stamm
            if (i > (high - highTribe)) {
                for (int n = high - 2; n >= 0; n--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < highTribe; j++) {
                    System.out.print("\u001B[32m" + "X" + "\u001B[0m");
                }
                System.out.println();


            }
        }
    }
}
