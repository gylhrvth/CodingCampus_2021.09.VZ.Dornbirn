package Gerhard.week2day5;

public class scrapbook {

    public static void main(String[] args) {
        int height = 15;
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

            for (int l = 0; l < width; l++) {
                if (l % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



