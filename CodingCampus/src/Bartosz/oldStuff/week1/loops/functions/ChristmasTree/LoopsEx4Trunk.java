package Bartosz.oldStuff.week1.loops.functions.ChristmasTree;

public class LoopsEx4Trunk {
    public static void printTrunk(int height) {
        System.out.println();

        int width = (height * 2) - 1;

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
