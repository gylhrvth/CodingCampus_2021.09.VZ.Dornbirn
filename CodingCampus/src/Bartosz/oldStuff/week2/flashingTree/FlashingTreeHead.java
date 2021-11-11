package Bartosz.oldStuff.week2.flashingTree;

public class FlashingTreeHead {
    public static void printTree(int h) {
        // Baum
        for (int rows = 0; rows < h + 1; rows++) {         // Solange die Reihenanzahl kleiner als Höhe des Baumes ist:
            for (int space = 1; space < (h + 1 - rows); space++) {   // Solange der Abstand kleiner ist als Höhe - Reihen
                System.out.print(" ");
            }

            for (int Tree = 1; Tree <= (rows * 2) - 1; Tree++) {  // Solange Zähler kleiner ist als Reihenanzahl * 2 -1
                System.out.print("X");
            }

            System.out.println();                               // Zeilenumbruch nach fertiger Reihe}
        }
    }

}
