package Eray.week6.uebungsBeispiele;

public class ChristmasTree {
    public static void main(String[] args) {
        mainMenuToPrintAll();
    }

    private static void mainMenuToPrintAll() {
        int height = 11;

        upperHeight(height);
        lowerHeight(height);
    }

    private static void upperHeight(int height) {
        int upperHeight = height / 2;

        for (int i = 0; i <= upperHeight; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void lowerHeight(int height) {
        int upperHeight = height / 2;
        int lowerHeight = height - upperHeight;

        for (int i = 0; i <= lowerHeight; i++) {
            for (int j = lowerHeight; j > i;  j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
