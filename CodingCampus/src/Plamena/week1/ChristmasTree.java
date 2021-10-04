package Plamena.week1;

public class ChristmasTree {
    public static void main(String[] args) {


        //ChristmasTree
        int height = 11;
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
                System.out.print("*");
            }
            System.out.println();
        }

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
}