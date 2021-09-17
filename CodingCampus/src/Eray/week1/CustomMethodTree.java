package Eray.week1;

public class CustomMethodTree {


    public static void main(String[] args) {
        Tree(3, 40);
        treeTrunk(40);
    }

    public static void Tree(int trees, int height) {
        for (int i = 0; i < trees; i++) {

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
        }
    }

    public static void treeTrunk(int height) {
        int treeWidth = (height * 2) - 1;

        int trunkWidth = height / 3;
        int trunkHeight = height / 3;

        int trunkCenter = treeWidth / 2;
        int trunkLeftSpace = trunkCenter - (trunkWidth / 2);

        for (int d = 0; d < trunkHeight; d++) {
            for (int e = 0; e < trunkLeftSpace; e++) {
                System.out.print(" ");
            }
            for (int f = 0; f < trunkWidth; f++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
