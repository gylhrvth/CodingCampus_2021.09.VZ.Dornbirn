package Eray.week1;

public class ChristmasTree {
    public static void main(String[] args) {


        int height = 6;
        int trunkHeight = 3;
        int spaces = height - 1;
        int stars = 1;
        //TrunkHeight

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            spaces--;

            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            stars += 2;
            System.out.println();

        }


        int treeBottomWidth = (height * 2) - 1;
        int trunkWidth = 3;
        float treeCenter = treeBottomWidth / 2f;
        int trunkLeftSpaces = (int) (treeCenter - (trunkWidth / 2f));



        for (int l = 0; l < trunkHeight; l++) {
            for (int m = 0; m < trunkLeftSpaces; m++) {
                System.out.print(" ");

            }
            for (int n = 0; n < trunkHeight; n++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}







