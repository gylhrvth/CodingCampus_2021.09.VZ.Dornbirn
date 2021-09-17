package Bartosz.week1.loops.functions.ChristmasTree;

public class ChristmasTree {
    public static void ChristmasTreeMeth(int height) {
        // Baum
        for (int rows = 1; rows < height; rows++) {         // solange die Reihenanzahl kleiner als Höhe des Baumes ist:
            for (int space = 1; space < (height - rows); space++) {   // Solange der Abstand kleiner ist als Höhe - Reihen
                System.out.print(" ");
            }

            for (int Tree = 1; Tree <= (rows * 2) - 1; Tree++) {  // Solange Zähler kleiner ist als Reihenanzahl * 2 -1
                System.out.print("X");
            }

            System.out.println(); // Zeilenumbruch nach fertiger Reihe}
        }
    }
}
