package Plamena.week1;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //ChristmasTree(9);

    }

    public static void drawArrow(int height) {


        int upperHalf = height / 2;
        int lowerHalf = height - upperHalf;

        for (int i = 0; i < upperHalf; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k = 0; k <= lowerHalf; k++) {
            for (int j = lowerHalf - k; j > 0; j--) {
                System.out.print("*");

            }
            System.out.println();
        }

    }


    public static void Calculator() {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int i = scanner1.nextInt();

        for (int counter = 1; counter < 11; counter++) {
            int result = i * counter;
            System.out.println(i + "*" + counter + " = " + result);
        }
    }


    public static void drawSquare(int width) {

        for (int m = 0; m < width; m++) {
            for (int n = 0; n < width; n++) {
                System.out.print(" x ");
            }
            System.out.println();
        }
    }


    public static void drawHollowSquare(int width) {

        for (int i = 0; i <= width - 1; i++) {
            for (int j = 0; j <= width - 1; j++) {
                if (i == 0 || i == width - 1 || j == 0 || j == width - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }


    public static void drawCircle(double radius) {

        for (double i = -radius; i <= radius; i++) {
            for (double j = -radius; j <= radius; j++) {
                if (Math.sqrt((Math.pow(i, 2.0)) + Math.pow(j, 2.0)) <= (radius + 0.5)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void drawHollowCircle(double radius) {

        for (double i = -radius; i <= radius; i++) {
            for (double j = -radius; j <= radius; j++) {
                if (Math.sqrt((Math.pow(i, 2.0)) + Math.pow(j, 2.0)) <= (radius + 0.5) && Math.sqrt((Math.pow(i, 2.0)) + Math.pow(j, 2.0)) >= (radius - 0.5)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }


    public static void drawTreeTop(int height) {

        //Treetop
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawChristmasTree(int height) {

        int width = (height * 2 - 1);
        float heightTrunk = height / 4f;
        float widthTrunk = width / 4f;
        float distanceLeft = ((width * (1 / 2f)) - widthTrunk / 2f);
        float heightStand = height / 6f;
        float widthStand = width / 2.5f;

        drawTreeTop(height);

        //Balls
        for (int j = 0; j <= width; ++j) {
            if (j <= distanceLeft) {
                if (j % 2 != 0) {
                    System.out.print("o");
                } else {
                    System.out.print(" ");
                }
            } else if (j >= distanceLeft && j <= (width - distanceLeft)) {
                System.out.print("*");
            }
            if (j >= (distanceLeft + widthTrunk)) {
                if (j % 2 != 0) {
                    System.out.print("o");
                } else {
                    System.out.print(" ");
                }

            }
        }
        System.out.println();

        //Trunk

        for (float i = 0; i <= heightTrunk; i++) {
            for (float j = 0; j <= distanceLeft; j++) {
                System.out.print(" ");
            }
            for (float j = 0; j <= widthTrunk; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Stand

        for (float i = 0; i <= heightStand; i++) {
            for (float j = 0; j <= ((width - widthStand) / 2); j++) {
                System.out.print(" ");
            }
            for (float j = 0; j <= widthStand; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void YellowChristmastree(int height) {

        //ChristmasTree
        int width = (height * 2 - 1);
        float heightTrunk = height / 4f;
        float widthTrunk = width / 4f;
        float distanceLeft = ((width * (1 / 2f)) - widthTrunk / 2f);
        float heightStand = height / 6f;
        float widthStand = width / 2.5f;


        //TreeTop
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("\u001B[33m" + "*" + "\u001B[0m");
            }
            System.out.println();
        }

        //Balls
        for (int j = 0; j <= width; ++j) {
            if (j <= distanceLeft) {
                if (j % 2 != 0) {
                    System.out.print("\u001B[33m" + "o" + "\u001B[0m");
                } else {
                    System.out.print(" ");
                }
            } else if (j >= distanceLeft && j <= (width - distanceLeft)) {
                System.out.print("\u001B[33m" + "*" + "\u001B[0m");
            }
            if (j >= (distanceLeft + widthTrunk)) {
                if (j % 2 != 0) {
                    System.out.print("\u001B[33m" + "o" + "\u001B[0m");
                } else {
                    System.out.print(" ");
                }

            }
        }
        System.out.println();

        //Trunk

        for (float i = 0; i <= heightTrunk; i++) {
            for (float j = 0; j <= distanceLeft; j++) {
                System.out.print(" ");
            }
            for (float j = 0; j <= widthTrunk; j++) {
                System.out.print("\u001B[33m" + "*" + "\u001B[0m");
            }
            System.out.println();
        }

        //Stand

        for (float i = 0; i <= heightStand; i++) {
            for (float j = 0; j <= ((width - widthStand) / 2); j++) {
                System.out.print(" ");
            }
            for (float j = 0; j <= widthStand; j++) {
                System.out.print("\u001B[33m" + "*" + "\u001B[0m");
            }
            System.out.println();
        }
    }

    public static void drawTreeTopWithYellowLights(int height) {

        //Treetop
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if(j%3==0){
                System.out.print("\033[1;93m" + "o" + "\u001B[0m");
                } else{
                    System.out.print("\033[1;92m" + "*" + "\u001B[0m");
                }

            }
            System.out.println();
        }
    }

    public static void drawTreeTopWithBlueLights(int height) {

        //Treetop
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if(j%3==0){
                    System.out.print("\033[1;94m" + "o" + "\u001B[0m");
                } else{
                    System.out.print("\033[1;92m" + "*" + "\u001B[0m");
                }

            }
            System.out.println();
        }
    }



    public static void drawTreeWithLights(int height) {

        int width = (height * 2 - 1);
        float heightTrunk = height / 4f;
        float widthTrunk = width / 5f;
        float distanceLeft = ((width * (1 / 2f)) - widthTrunk / 2f);
      //  float heightStand = height / 10f;
      //  float widthStand = width / 2.5f;

        drawTreeTopWithBlueLights(height);

/*        //Balls
        for (int j = 0; j <= width; ++j) {
            if (j % 2 != 0) {
                System.out.print("o");
            } else {
                System.out.print(" ");
            }

        }
        System.out.println();*/

        //Trunk

        for (float i = 0; i <= heightTrunk; i++) {
            for (float j = 0; j <= distanceLeft; j++) {
                System.out.print(" ");
            }
            for (float j = 0; j <= widthTrunk; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

/*
        //Stand

        for (float i = 0; i <= heightStand; i++) {
            for (float j = 0; j <= ((width - widthStand) / 2); j++) {
                System.out.print(" ");
            }
            for (float j = 0; j <= widthStand; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

*/

    }

    public static void substringGenerator() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Gib Text ein:");

        String input = sc.nextLine();

        System.out.println("Gib Start ein: ");
        int start = sc.nextInt()-1;

        System.out.println("Gib Ende ein");
        int end = sc.nextInt();

        char[] stringToChar = input.toCharArray();

        System.out.println(String.valueOf(stringToChar, start, end));


    }
}
