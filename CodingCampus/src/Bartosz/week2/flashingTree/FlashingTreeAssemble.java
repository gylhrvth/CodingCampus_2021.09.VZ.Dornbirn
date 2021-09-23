package Bartosz.week2.flashingTree;

public class FlashingTreeAssemble {
    public static void assemble(int height) {
        FlashingTreeHead.printTree(height);
        FlashingTreeBalls.printBalls(height);
        FlashingTreeTrunk.printTrunk(height);
    }
}
