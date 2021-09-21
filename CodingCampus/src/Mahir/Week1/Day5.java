package Mahir.Week1;

public class Day5 {
    public static void main(String[] args) {
        int scale = 50;

        printtriangle(scale);
        System.out.println();

        treeTop(scale, "*");
        treeTrunk(scale);


    }




    public static void printStar() {

        for (int a = 0; a <= 10; a++) {
            System.out.print("*");
        }
        System.out.println();
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

    public static void treeTrunk(int height) {
        int width = height*2;
        int trunkHeight = height/4;
        int trunkWidth = width/2;
        int center = width/2;
        int trunkLeftSpacces = center - trunkWidth/2;

        for (int a = 0; a < trunkHeight; a++) {
            for (int b = 0; b < trunkLeftSpacces; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < trunkWidth; c++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
