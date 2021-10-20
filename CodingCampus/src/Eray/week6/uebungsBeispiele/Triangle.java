package Eray.week6.uebungsBeispiele;

public class Triangle {
    public static void main(String[] args) {
        printTriangleMainMenu();
    }

    private static void printTriangleMainMenu() {
        //first Version with Triangle middle space
        printTriangleWithSpaces(6, 'X');
        System.out.println();

        //second Version Triangle middle full of characters

        System.out.println();
        printTriangleWithOutSpaces(6, 'X');
    }

    private static void printTriangleWithSpaces(int height, char character) {
        int spacesBeforeTriangle = (height - 1);
        int spacesInTriangle = 0;

        for (int i = 0; i < height -1; i++) {
            for (int j = 0; j < spacesBeforeTriangle; j++) {
                System.out.print(" ");
            }

            System.out.print(character);

            for (int j = 0; j < spacesInTriangle; j++) {
                System.out.print(" ");
            }

            System.out.print(character);

            spacesBeforeTriangle--;
            spacesInTriangle += 2;
            System.out.println();
        }

        int width = height * 2;
        for (int i = 0; i < width; i++) {
            System.out.print(character);
        }

    }

    private static void printTriangleWithOutSpaces(int height, char character) {
        int spaces = height - 1;
        int stars = 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print(character);
            }
            stars += 2;
            spaces--;

            System.out.println();
        }
    }
}
