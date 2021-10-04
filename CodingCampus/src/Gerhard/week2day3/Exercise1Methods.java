package Gerhard.week2day3;

import java.util.Scanner;

public class Exercise1Methods {

//    public static int getheight() {
//        int height = 20;
//        return height;

//    }
//
//    public static int getspaces(int height) {
//        int spaces = height;
//        return spaces;
//    }
//
//    public static int getstars() {
//        int stars = 1;
//        return stars;
//    }


    public static int treebody(int height) {

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


        }
        return stars;

    }


    public static int balls(int stars) {

        int width = stars - 2;

        //System.out.print(" ");

        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                System.out.print("0");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        return width;

    }

    public static void trunk(int width, int height) {


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

    public static int menu() {

        Scanner scanner = new Scanner(System.in);
        //Solange eine Eingabe einfordern, solange es keine Zahl ist
        System.out.println("Um die größe des Christbaums zu bestimmen");
        System.out.println("bitte eine Zahl zwischen 0-100 eingeben:" );
        int height = scanner.nextInt();
        System.out.println("Sie haben die Zahl " + height + " eingegeben!");
        return height;
    }


    public static void main(String[] args) {
     //5  menu();
        int height = menu();
        int width = balls(treebody(height));

        trunk(width, height);


    }
}
