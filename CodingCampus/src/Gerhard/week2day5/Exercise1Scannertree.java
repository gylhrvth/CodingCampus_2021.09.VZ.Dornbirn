package Gerhard.week2day5;

import java.util.Scanner;


public class Exercise1Scannertree {


    public static void tree(int height) {

        int spaces = height - 1;
        int stars = 1;

        for (int a = 0; a < height; a++) {
            for (int b = 0; b < spaces; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < stars; c++) {
                System.out.print("*");

            }
            System.out.println();

            spaces--;
            stars += 2;
        }
        int width = stars - 2;

        //System.out.print(" ");

        for (int y = 0; y < width; y++) {
            if (y % 2 == 0) {
                System.out.print("0");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        //        int width = stars - 2;

        //System.out.print(" ");

        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                System.out.print("0");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

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
        }
        System.out.println();
    }




//    public static void shiningTree(int height) {
//
//        int spaces = height - 1;
//        int stars = 1;
//
//
//        for (int a = 0; a < height; a++) {
//            for (int b = 0; b < spaces; b++) {
//                System.out.print(" ");
//            }
//            for (int c = 0; c < stars; c++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//
//            spaces--;
//            stars += 2;
//        }
//        int width = stars - 2;
//
//        //System.out.print(" ");
//
//        for (int y = 0; y < width; y++) {
//            if (y % 2 == 0) {
//                System.out.print("0");
//            } else {
//                System.out.print(" ");
//            }
//        }
//        System.out.println();
//
//        //        int width = stars - 2;
//
//        //System.out.print(" ");
//
//        for (int i = 0; i < width; i++) {
//            if (i % 2 == 0) {
//                System.out.print("0");
//            } else {
//                System.out.print(" ");
//            }
//        }
//        System.out.println();
//
//
//        int trunkWidth = width / 3;
//        int trunkHeight = height / 4;
//
//        int center = width / 2;
//        int trunkLeftSpaces = center - (trunkWidth / 2);
//
//        for (int i = 0; i < trunkHeight; i++) {
//            for (int u = 0; u < trunkLeftSpaces; u++) {
//                System.out.print(" ");
//            }
//            for (int f = 0; f < trunkWidth; f++) {
//                System.out.print("+");
//
//
//            }
//            System.out.println();
//
//        }
//
//    }


    public static int menu() {

        Scanner scanner = new Scanner(System.in);
        //Solange eine Eingabe einfordern, solange es keine Zahl ist
        System.out.println("Um die gr????e des Christbaums zu bestimmen");
        System.out.println("bitte eine Zahl zwischen 0-100 eingeben:");
        int height = scanner.nextInt();
        System.out.println("Sie haben die Zahl " + height + " eingegeben!");
        System.out.println(" ");
        System.out.println("W??nschen Sie leuchtende Christbaumkugeln? ja / nein:");
        String glowingBalls = (scanner.next());
        switch (glowingBalls) {

            case "nein":
                tree(height);
                // case "ja":
                //   shiningTree(height);

        }
        return height;
    }


    public static void main(String[] args) {
        int height = menu();
        tree(height);
        //shiningTree(height);
//        int height = menu();
//        int width = balls(tree(height));
//
//        int stars = tree(height);
////
//        // balls(treebodylight(height));
//
//        trunk(width, height);


    }
}
