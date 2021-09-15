package Bartosz.week1;

public class LoopsEx4ChristmasTree {
    public static void main(String[] args) {

        int treeTrunkHeight = 3;
        int height = 10;

        for (int rows = 1; rows < height; rows++) {         // Solange die Reihenanzahl kleiner als Höhe ist:
            for (int space = 1; space < (height - rows); space++) {   // Solange der Abstand kleiner ist als
                System.out.print(" ");
            }

            for (int Tree = 1; Tree <= rows * 2 - 1; Tree++) {  // Solange
                System.out.print("X");
            }

            System.out.println();
        }

        for (int l = 0; l < treeTrunkHeight; l++) {
            System.out.println("       XXX");
        }

    }
}

