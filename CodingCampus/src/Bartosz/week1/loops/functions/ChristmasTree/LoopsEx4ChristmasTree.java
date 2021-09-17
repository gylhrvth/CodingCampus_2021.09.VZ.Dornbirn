package Bartosz.week1.loops.functions.ChristmasTree;

public class LoopsEx4ChristmasTree {
    public static void main(String[] args) {

        int treeTrunkHeight = 5;
        int height = 17;



        // Baumstamm

        for (int rows = 0; rows < height -1; rows++) {         // Solange die Reihenanzahl kleiner als Höhe des Baumes ist:
            for (int space = 1; space < (height - rows); space++) {   // Solange der Abstand kleiner ist als Höhe - Reihen
                System.out.print(" ");
            }

            for (int Tree = 1; Tree <= (rows * 2) - 1; Tree++) {  // Solange Zähler kleiner ist als Reihenanzahl * 2 -1
                System.out.print("X");
            }

            System.out.println();                               // Zeilenumbruch nach fertiger Reihe}
        }

    }
}

