package Bartosz.week2;

import Bartosz.week2.flashingTree.FlashingTreeAssemble;

import java.util.Scanner;

public class FlashingTreeRun {
    public static void main(String[] args) {

        System.out.println("Wie hoch soll der Baum sein?");
        Scanner treeHeight = new Scanner(System.in);
        int height = treeHeight.nextInt();

        ////                long now = System.currentTimeMillis();
////                while(System.currentTimeMillis() - now < 5000);
////                try {
////                    Thread.sleep(5000);
////                } catch (InterruptedException e) {
////                    //noop
////                }

        FlashingTreeAssemble.assemble(height);
    }

}
