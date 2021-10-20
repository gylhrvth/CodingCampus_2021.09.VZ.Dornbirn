package Eray.week6.uebungsBeispiele;

public class Rhombus {
    public static void main(String[] args) {
        printRhombusMainMenu();
    }

    private static void printRhombusMainMenu() {
        printRhombus(10, 'Y');
    }

    private static void printRhombus(int height, char character) {
        printRhombusUpperHalf(height, character);
        printRhombusLowerHalf(height, character);
    }

    private static void printRhombusUpperHalf(int height, char character) {
        int heightHalf = height / 2;
        int stars = 1;
        int spaces = heightHalf;

        for (int i = 0; i < heightHalf; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print(character);
            }

            spaces--;
            stars += 2;
            System.out.println();
        }

    }

    private static void printRhombusLowerHalf(int height, char character) {
        int heightHalf = height / 2;
        int lowerHalf = height - heightHalf;
        int stars = heightHalf * 2 - 1;
        int spaces = 1;

        for (int i = 0; i < lowerHalf; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = stars; j > i; j--) {
                System.out.print(character);
            }
            spaces++;
            stars--;
            System.out.println();
        }
    }
}
