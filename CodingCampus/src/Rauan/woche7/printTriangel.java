package Rauan.woche7;

public class printTriangel {
    public static void main(String[] args) {

        // printTriangle("X",3);
        printTriangleWithSpaces(4, 'X');
    }

    private static void printTriangle(String character, int height) {
        int space = height - 1;
        int star = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int n = 0; n < star; n++) {
                System.out.print(character);
            }
            star += 2;
            space--;
            System.out.println();

        }
    }

    private static void printTriangleWithSpaces(int height, char character) {
        int spacesBeforeTriangle = (height - 1);
        int spacesInTriangle = 0;

        for (int i = 0; i < height - 1; i++) {
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

}

