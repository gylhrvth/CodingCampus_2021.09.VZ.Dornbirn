package Bartosz.oldStuff.week2;

import Bartosz.oldStuff.week2.flashingTree.FlashingTreeAssemble;

import java.util.Scanner;

public class FlashingTreeRun {
    public static void main(String[] args) {

        System.out.println("Wie hoch soll der Baum sein?");
        Scanner treeHeight = new Scanner(System.in);
        int height = treeHeight.nextInt();

        System.out.println("Welche Farbe sollen die Kugeln haben? ( blue / cyan / green / purple / red / yellow / white )");
        Scanner ballColorScanner = new Scanner(System.in);
        String color = ballColorScanner.next();

////                long now = System.currentTimeMillis();
////                while(System.currentTimeMillis() - now < 5000); // Alle 5 sekunden machen
////                try {
////                    Thread.sleep(5000);
////                } catch (InterruptedException e) {
////                    //noop
////                }


        for (int repeat = 0; repeat < 2; repeat++) {

            if (repeat % 2 == 0) {
                FlashingTreeAssemble.assemble(height, color);
            }
            else {
                FlashingTreeAssemble.assemble(height, color);
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                //noop
            }
        }
    }

}
