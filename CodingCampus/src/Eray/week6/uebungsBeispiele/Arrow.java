package Eray.week6.uebungsBeispiele;

public class Arrow {
    public static void main(String[] args) {
        printAllMethods();
    }

    private static void printAllMethods() {
        int height = 20;
        christmasTop(height);
        christmalBalls(height);
        christmasTrunk(height);
    }

    private static void christmasTop(int height) {

        int spaces = height - 1;
        int stars = 1;


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            stars += 2;
            spaces--;

            System.out.println();
        }
    }

    private static void christmalBalls(int height) {
        int width = (height * 2) - 1;
        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    private static void christmasTrunk(int height) {
        int width = (height * 2) - 1;
        int treeMiddle = width / 2;

        int treeWidth = width / 3;
        int treeHeight = width / 4;

        int leftStartPosition = treeMiddle - (treeWidth/2);

        for (int i = 0; i < treeHeight; i++) {

            for (int j = 0; j < leftStartPosition; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < treeWidth; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
