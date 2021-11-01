package Rauan.Aufgaben;

import Eray.week6.uebungsBeispiele.BackSlash;

public class PrintSlash {
    public static void main(String[] args) {
        printSlash("X", 3, true);
        printSlash("X", 3, false);

        printSlash("Y", 15, true);
        printSlash("0", 10, false);
    }

    private static void printSlash(String character, int backSlashHeight, boolean backSlash) {
        if (backSlash) {
            System.out.println("backSlash");
            int space = 0;
            for (int i = 0; i < backSlashHeight; i++) {
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                System.out.print(character);

                space++;
                System.out.println();
            }
        } else {
            System.out.println("frontSlash");
            int space = backSlashHeight - 1;
            for (int i = 0; i < backSlashHeight; i++) {
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                System.out.print(character);

                space--;
                System.out.println();
            }
        }
    }
}
