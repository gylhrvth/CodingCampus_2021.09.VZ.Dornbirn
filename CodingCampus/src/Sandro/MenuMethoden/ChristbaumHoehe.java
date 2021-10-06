package Sandro.MenuMethoden;

public class ChristbaumHoehe {

    public static void main(String[] args) {

        printChristmasTree(0);

    }


    public static void printChristmasTree(int height) {


        int spaces = height - 1;
        int width = height * 2 - 1;
        int stars = 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            stars += 2;
            spaces--;
        }

        // Christbaumkugeln

        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                System.out.print("O");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        // Baumstamm

        int trunkWidth = width / 3;
        int trunkHeight = height / 4;

        int center = width / 2;
        int trunkLeftSpaces = center - (trunkWidth / 2);

        for (int i = 0; i < trunkHeight; i++) {
            for (int u = 0; u < trunkLeftSpaces; u++) {
                System.out.print(" ");
            }
            for (int f = 0; f < trunkWidth; f++) {
                System.out.print("+");
            }
            System.out.println();
        }

    }
}
