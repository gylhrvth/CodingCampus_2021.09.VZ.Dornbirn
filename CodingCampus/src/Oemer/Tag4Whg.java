package Oemer;

public class Tag4Whg {
    public static void main(String[] args) {
        int height = 50;

        //Baumkrone
        int stars = 1;
        int spaces = height - 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            stars += 2;
            spaces--;
        }

        //Christbaumkugeln
        //int width = height * 2 - 1;
        int width = stars - 2;

        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                System.out.print("O");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        //Baumstamm
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


}
