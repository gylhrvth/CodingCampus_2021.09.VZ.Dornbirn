package Stefan.SecondWeek.Scanner;

public class christmasTree {
    public static void main(String[] args) {
        christmasTree(6);

    }


    public static void christmasTree(int hight) {
        int heightSpitze = hight;
        int widthAbstandRand = heightSpitze;
        int colorCounter = 1;
        //Baumspitze
        for (int i = 0; i < heightSpitze; i++) {
            for (int k = 1; k < (widthAbstandRand - i); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {

                System.out.print("*");

            }
            System.out.println("");
        }


        //Kreise
        int behang = (heightSpitze * 2 - 1) / 2;

        for (int m = 0; m <= behang; m++) {
            System.out.print("O ");
        }
        System.out.println("");


        //Baumstamm

        int widthStamm = heightSpitze / 2;
        int heightStamm = heightSpitze / 3;
        int center = heightSpitze;
        int stammAbstand = center - (widthStamm / 2);

        for (int i = 0; i < heightStamm; i++) {
            for (int k = 0; k < stammAbstand -1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < widthStamm; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
