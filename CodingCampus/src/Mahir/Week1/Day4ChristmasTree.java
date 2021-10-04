package Mahir.Week1;

public class Day4ChristmasTree {
    public static void main(String[] args) {

        for (int a = 0; a <= 10; a++) {
            System.out.println(a * 5);
        }
        System.out.println();
        int a = 0;
        while (a <= 10) {
            System.out.println(a * 5);
            a++;
        }
        System.out.println();
        for (int c = 0; c < 5; c++) {

            for (int d = 0; d <= 4; d++) {
                System.out.print("X");
            }
            System.out.println();
        }
        for (int x = 0; x <= 5; x++) {

            for (int y = 0; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = 0; l <= 5; l++) {

            for (int m = 5; m > l; m--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        int height = 50;
        int spaces = height;
        int stars = 1;

        for (int q = 0; q < height; q++) {
            for (int w = 0; w < spaces; w++) {
                System.out.print(" ");
            }
            for (int e = 0; e < stars; e++) {
                System.out.print("*");
            }


            System.out.println();

            spaces--;
            stars += 2;
        }
        int width = stars - 1;

        for (int k = 0; k <= width; k++) {
            if (k % 2 == 0) {
                System.out.print("0");
            } else {
                System.out.print(" ");
            }


        }
        System.out.println();

        int trunkWidth = width / 3;
        int trunkHeight = height / 4;
        int center = width / 2;
        int trunkLeftSpaces = center - trunkWidth / 2;


        for (int x = 0; x < trunkHeight; x++) {
            for (int y = 0; y < trunkLeftSpaces; y++) {
                System.out.print(" ");
            }
            for (int z = 0; z < trunkWidth; z++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }

}




