package Gerhard.week2day4;

import java.util.Scanner;


public class Exercise1Scannertree {


    public static void tree(int height) {

        int spaces = height - 1;
        int stars = 1;


        //int height = 20;
        //int Spaces = height;

        //int stars = 1;

        for (int i = 0; i < height; i++) {
            for (int f = 0; f < spaces; f++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");

            }
            System.out.println();

            spaces--;
            stars += 2;

            int width = stars - 2;

            //System.out.print(" ");

            for (int j = 0; j < width; i++) {
                if (j % 2 == 0) {
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

            for (int h = 0; h < trunkHeight; h++) {
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





    public static void shiningTree(int height) {
        int spaces = height - 1;
        int stars = 1;


        //int height = 20;
        //int Spaces = height;

        //int stars = 1;

        for (int i = 0; i < height; i++) {
            for (int f = 0; f < spaces; f++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");

            }
            System.out.println();

            spaces--;
            stars += 2;

            int width = stars - 2;

            //System.out.print(" ");

            for (int j = 0; j < width; i++) {
                if (j % 2 == 0) {
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

            for (int k = 0; k < trunkHeight; k++) {
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


    public static int menu() {

        Scanner scanner = new Scanner(System.in);
        //Solange eine Eingabe einfordern, solange es keine Zahl ist
        System.out.println("Um die größe des Christbaums zu bestimmen");
        System.out.println("bitte eine Zahl zwischen 0-100 eingeben:");
        int height = scanner.nextInt();
        System.out.println("Sie haben die Zahl " + height + " eingegeben!");
        System.out.println(" ");
        System.out.println("Wünschen Sie leuchtende Christbaumkugeln? ja / nein:");
        String glowingBalls = (scanner.next());
        switch (glowingBalls) {
            case "nein": tree(height);
            case "ja": shiningTree(height);


        }
        return height;
    }


    public static void main(String[] args) {
        //5  menu();
        int height = menu();
        tree(height);
        shiningTree(height);
//
        // balls(treebodylight(height));




    }
}
