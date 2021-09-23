package Bartosz.week2.flashingTree;

public class FlashingTreeBalls {
    public static void printBalls(int height) {
        int width = (height * 2) - 1;

        for (int d = 0; d < width; d++) {
            if (d % 2 == 0) {
                System.out.print("O");
            } else {
                System.out.print(" ");
            }
        }
    }
}
