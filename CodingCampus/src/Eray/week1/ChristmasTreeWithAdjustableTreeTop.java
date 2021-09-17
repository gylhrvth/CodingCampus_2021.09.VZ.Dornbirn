package Eray.week1;

public class ChristmasTreeWithAdjustableTreeTop {


    public static void main(String[] args) {

        coolTree();
    }

    public static void coolTree() {
        treeTop(10, 39);
        treeTop(20, 39);
        treeTop(40, 39);
        treeTrunk(40);
    }

    public static void trees(int trees, int height) {
        for (int i = 0; i < trees; i++) {
            tree(height);
        }
    }

    public static void tree(int height) {
        treeTop(height);
        treeTrunk(height);
    }

    public static void treeTop(int height) {
        treeTop(height, height - 1);
    }

    public static void treeTop(int height, int spaces) {
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


