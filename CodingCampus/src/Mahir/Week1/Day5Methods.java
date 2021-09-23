package Mahir.Week1;

public class Day5Methods {
    public static void main() {
        calc(7);
        printStar(10);
        printtriangle(20);
        System.out.println();

        printChristmasTree(10);
        square(15, 15, "+");
    }

    public static void printChristmasTree(int height) {
        treeTop(height, "*");
        christmasBalls(height);
        treeTrunk(height);
    }

    public static void printStar(int height) {
        for (int a = 0; a <= height; a++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void calc(int numb) {
        for (int a = 0; a <= 10; a = ++a) {

            System.out.println(a * numb);
        }
    }

    public static void square(int wide, int height, String charakter) {
        for (int c = 0; c < height; c++) {

            for (int d = 0; d < wide; d++) {
                System.out.print(" ");
                System.out.print(charakter);
            }
            System.out.println();
        }
    }

    public static void printtriangle(int height) {
        int a = height;
        for (int x = 0; x < height; x++) {
            repeat(x, "=>");
        }
        for (int y = height; height > 0; height--) {
            repeat(height, "=>");
        }
    }

    public static void repeat(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println();
        }
    }

    public static void repeat(int times, String charakter) {
        for (int a = 0; a < times; a++) {
            System.out.print(charakter);
        }
        System.out.println();
    }

    public static void treeTop(int height, String charakter) {

        int spaces = height;
        int stars = 1;
        for (int a = 0; a < height; a++) {

            for (int b = 0; b < spaces; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < stars; c++) {
                System.out.print(charakter);

            }
            System.out.println();
            spaces--;
            stars += 2;
        }
    }

    public static void christmasBalls(int height) {
        int stars = height * 2 + 1;
        int width = stars - 1;

        for (int k = 0; k <= width; k++) {
            if (k % 2 == 0) {
                System.out.print("0");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void treeTrunk(int height) {
        int width = height * 2;
        int trunkHeight = height / 4;
        int trunkWidth = width / 2;
        int center = width / 2;
        int trunkLeftSpacces = center - trunkWidth / 2;

        for (int a = 0; a < trunkHeight; a++) {
            for (int b = 0; b < trunkLeftSpacces; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < trunkWidth; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
