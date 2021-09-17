package Eray.week1;

public class ChristmasTree {
    public static void main(String[] args) {
        // TannenbaumKopf
        int height = 40;
        int spaces = height - 1;
        int stars = 1;

        for (int a = 0; a < height; a++) {
            for (int b = 0; b < spaces; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < stars; c++) {
                System.out.print("*");
            }
            spaces--;
            stars += 2;
            System.out.println();
        }
        //LichterKette

        int width = (height * 2) - 1;

        for (int d = 0; d < width; d++) {
            if (d % 2 == 0) {
                System.out.print("O");
            } else {
                System.out.print(" ");
            }
        }

        //BaumRumpf

        System.out.println();

        int trunkWidth = width / 3;
        int trunkHeight = height / 3;

        int trunkCenter = width / 2;
        int trunkSpaceLeft = trunkCenter - (trunkWidth / 2);


        for (int e = 0; e < trunkHeight; e++) {
            for (int f = 0; f < trunkSpaceLeft; f++) {
                System.out.print(" ");
            }
            for (int g = 0; g < trunkWidth; g++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}







