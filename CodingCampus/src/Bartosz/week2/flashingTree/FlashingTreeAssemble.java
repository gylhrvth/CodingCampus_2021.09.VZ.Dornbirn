package Bartosz.week2.flashingTree;

public class FlashingTreeAssemble {
    public static void assemble(int height, String color) {
        FlashingTreeHead.printTree(height);
        FlashingTreeBalls.printBalls(height, color);
        FlashingTreeTrunk.printTrunk(height);
    }
}
